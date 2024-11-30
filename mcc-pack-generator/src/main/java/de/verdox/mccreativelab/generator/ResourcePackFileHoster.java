package de.verdox.mccreativelab.generator;

import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.util.io.ZipUtil;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCResourcePack;
import de.verdox.vserializer.generic.SerializationElement;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.json.JsonSerializerContext;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
import net.schmizz.sshj.userauth.keyprovider.KeyProvider;
import org.apache.commons.compress.utils.FileNameUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ResourcePackFileHoster {
    public static final Logger LOGGER = Logger.getLogger(ResourcePackFileHoster.class.getSimpleName());

    public static final boolean WITH_HASHES = false;
    private HttpServer httpServer;
    private final Map<String, MCCResourcePack> availableResourcePacks = new HashMap<>();

    private final HostingSettings hostingSettings;
    private WebServerHandler webServerHandler;
    private SshResourcePackUpload sshResourcePackUpload;

    public ResourcePackFileHoster(File srcDir) throws IOException {
        File configFile = new File(srcDir + "/config.yml");
        configFile.getParentFile().mkdirs();

        //TODO create new one

        JsonSerializerContext serializerContext = new JsonSerializerContext();
        Serializer<HostingSettings> serializer = null;
        if(!configFile.exists()){
            HostingSettings defaultSettings = new HostingSettings(Mode.INTERNAL_WEBSERVER, false, true, new InternalWebServerSettings("0.0.0.0", 8080, "0.0.0.0:8080"), new SshUploadSettings("", "", "", "", ""));
            serializerContext.writeToFile(serializer.serialize(serializerContext, defaultSettings), configFile);
        }

        SerializationElement serializationElement = serializerContext.readFromFile(configFile);

        hostingSettings = serializer.deserialize(serializationElement);

        if (hostingSettings.mode().equals(Mode.INTERNAL_WEBSERVER)) {
            LOGGER.info("Starting ResourcePackFileHoster on " + hostingSettings.webServerSettings().hostName() + ":" + hostingSettings.webServerSettings().port());
            this.httpServer = Vertx.vertx().createHttpServer();
            this.httpServer.exceptionHandler(event -> LOGGER.warning("Exception happened in ResourcePackFileHoster: " + event.getLocalizedMessage()));
            webServerHandler = new WebServerHandler();
            this.httpServer.requestHandler(webServerHandler);
            this.httpServer.listen(hostingSettings.webServerSettings().port(), hostingSettings.webServerSettings().hostName());
        } else {
            this.sshResourcePackUpload = new SshResourcePackUpload();
        }
    }

    public void closeAndWait() throws InterruptedException {
        if (hostingSettings.mode().equals(Mode.INTERNAL_WEBSERVER))
            this.httpServer.close().result();
    }

    public void sendResourcePackToPlayer(MCCPlayer player, MCCResourcePack packInfo) {
        String downloadURL = createDownloadUrl(packInfo.hash());

        player.setResourcePack(packInfo.getUUID(), downloadURL, WITH_HASHES ? packInfo.hashBytes() : null, packInfo.prompt(), hostingSettings.requireResourcePack());
        LOGGER.info("Sending resource pack with url " + downloadURL + " to " + player.getUUID());
    }

    public void createResourcePackZipFiles() throws IOException {
        deleteZipFiles();

        try (Stream<Path> files = Files.walk(CustomResourcePack.resourcePacksFolder.toPath(), 1)) {
            files.parallel().forEach(path -> {
                if (path.equals(CustomResourcePack.resourcePacksFolder.toPath()))
                    return;
                if (!path.toFile().isDirectory())
                    return;
                File resourcePackParentFolder = path.toFile();
                String resourcePackName = resourcePackParentFolder.getName();
                File zipFile = Path.of(resourcePackParentFolder.getPath() + ".zip").toFile();
                if (!resourcePackName.equals("MCCreativeLab"))
                    return;

                Path zipPath = Path.of(resourcePackParentFolder.getPath() + ".zip");
                long start = System.currentTimeMillis();
                ZipUtil.zipFolder(resourcePackParentFolder.toPath(), zipPath);
                long end = System.currentTimeMillis() - start;
                LOGGER.info("Created Zip file " + zipFile + " in " + end + " ms");
                try {
                    byte[] hashBytes = null;
                    String hash = "mcclab";
                    if (WITH_HASHES) {
                        LOGGER.info("Calculating sha1 hash of resource pack");
                        start = System.currentTimeMillis();
                        hashBytes = calculateSHA1(zipFile.getPath());
                        hash = calculateSHA1String(hashBytes);
                        end = System.currentTimeMillis() - start;
                        LOGGER.info("Took " + end + " ms");
                    }

                    MCCResourcePack resourcePackInfo = new MCCResourcePack(resourcePackName, zipFile, createDownloadUrl(hash), hash, hashBytes, true, null);
                    availableResourcePacks.put(hash, resourcePackInfo);
                    if (hostingSettings.mode().equals(Mode.INTERNAL_WEBSERVER)) {
                        if (WITH_HASHES)
                            LOGGER.info("MCCreativeLab: Hosting ResourcePack " + zipFile.getName() + " with hash: " + hash);
                        else
                            LOGGER.info("MCCreativeLab: Hosting ResourcePack " + zipFile.getName());
                    } else if (hostingSettings.mode().equals(Mode.SSH_UPLOAD)) {
                        this.sshResourcePackUpload.upload();
                    }
                    MCCPlatform.getInstance().setServerResourcePack(resourcePackInfo);
                } catch (IOException | NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    public String createDownloadUrl(String hash) {
        String http = hostingSettings.useHttps() ? "https" : "http";

        if (hostingSettings.mode().equals(Mode.INTERNAL_WEBSERVER))
            return http + "://" + hostingSettings.webServerSettings().downloadUrl() + "/" + hash;
        else if (hostingSettings.mode().equals(Mode.SSH_UPLOAD))
            return http + "://" + hostingSettings.webServerSettings().downloadUrl();
        throw new IllegalStateException("Mode not found: " + hostingSettings.mode().name());
    }

    private void deleteZipFiles() throws IOException {
        availableResourcePacks.clear();
        Files.walk(CustomResourcePack.resourcePacksFolder.toPath(), 1).forEach(path -> {
            if (path.equals(CustomResourcePack.resourcePacksFolder.toPath()))
                return;
            if (!FileNameUtils.getExtension(path.toFile().getName()).equals("zip"))
                return;
            LOGGER.info("Deleting ResourcePack file " + path.toFile().getName());
            long start = System.currentTimeMillis();
            path.toFile().delete();
            long end = System.currentTimeMillis() - start;
            LOGGER.info("ResourcePack file " + path.toFile().getName() + " deleted in " + end + " ms");
        });
    }

    private String calculateSHA1String(byte[] hashBytes) throws IOException, NoSuchAlgorithmException {
        // Konvertiere den Hash zu einem Hex-String
        StringBuilder hexStringBuilder = new StringBuilder();
        for (byte hashByte : hashBytes) {
            hexStringBuilder.append(String.format("%02x", hashByte));
        }

        return hexStringBuilder.toString();
    }

    private byte[] calculateSHA1(String filePath) throws IOException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");

        try (FileInputStream fis = new FileInputStream(filePath);
             DigestInputStream dis = new DigestInputStream(fis, digest)) {

            // Leere den Stream, um den Hash zu berechnen
            while (dis.read() != -1) {
                // Nichts zu tun hier; liest einfach den Stream und aktualisiert den Digest
            }
        }

        // Konvertiere den Hash zu einem Hex-String
        return digest.digest();
    }

    private record HostingSettings(Mode mode, boolean useHttps, boolean requireResourcePack, InternalWebServerSettings webServerSettings,
                                   SshUploadSettings sshUploadSettings) {}

    private record InternalWebServerSettings(String hostName, int port,
                                             String downloadUrl) {
    }

    private record SshUploadSettings(String address, String user, String keyFilePath, String remotePath,
                                     String remoteFingerPrintEd25519) {

    }

    private class WebServerHandler implements Handler<HttpServerRequest> {

        @Override
        public void handle(HttpServerRequest event) {
            try {
                var split = event.absoluteURI().split("/");
                if (split.length == 0) {
                    event.response().end();
                    return;
                }
                String hash = split[split.length - 1];
/*                if (!isValidHex(hash)) {
                    event.response().end();
                    return;
                }*/
                MCCResourcePack resourcePackInfo = availableResourcePacks.getOrDefault(hash, null);
                if (resourcePackInfo == null) {
                    LOGGER.warning("Someone requested a resource pack with hash " + hash + " that does not exist");
                    event.response().end();
                    return;
                }
                event.response().sendFile(resourcePackInfo.file().getAbsolutePath());
                LOGGER.info("Sending resource pack with hash " + hash + " to " + event.remoteAddress());
            } finally {

            }
        }

        private static boolean isValidHex(String input) {
            // Regular expression for hexadecimal string
            String hexPattern = "^[0-9A-Fa-f]+$";

            // Compile the pattern
            Pattern pattern = Pattern.compile(hexPattern);

            // Match the input against the pattern
            Matcher matcher = pattern.matcher(input);

            // Return true if the input matches the pattern, false otherwise
            return matcher.matches();
        }
    }

    private class SshResourcePackUpload {
        private final SSHClient ssh = new SSHClient();
        private final KeyProvider keyProvider;

        public SshResourcePackUpload() throws IOException {
            //ssh.loadKnownHosts();
            LOGGER.info("Loading SSH Keys ");
            keyProvider = ssh.loadKeys(hostingSettings.sshUploadSettings().keyFilePath());
            String fingerprint = hostingSettings.sshUploadSettings().remoteFingerPrintEd25519();
            if (fingerprint.isEmpty())
                ssh.addHostKeyVerifier(new PromiscuousVerifier());
            else
                ssh.addHostKeyVerifier(fingerprint);


            //ssh.authPublickey(sshUploadSettings.user.read(), keyProvider);
        }

        public void upload() throws IOException {
            ssh.connect(hostingSettings.sshUploadSettings().address());
            try {
                LOGGER.info("Authenticating public key...");
                ssh.authPublickey(hostingSettings.sshUploadSettings().user(), keyProvider);
                for (Map.Entry<String, MCCResourcePack> stringResourcePackInfoEntry : availableResourcePacks.entrySet()) {
                    MCCResourcePack resourcePackInfo = stringResourcePackInfoEntry.getValue();
                    LOGGER.info("Uploading ResourcePack " + resourcePackInfo.file().getAbsolutePath() + " to " + hostingSettings.sshUploadSettings().remotePath() + resourcePackInfo.file().getName());
                    ssh.newSCPFileTransfer().upload(resourcePackInfo.file().getAbsolutePath(), hostingSettings.sshUploadSettings().remotePath());
                    LOGGER.info("Done...");

                }
            } finally {
                ssh.disconnect();
            }
        }
    }

    private static enum Mode {
        INTERNAL_WEBSERVER,
        SSH_UPLOAD
    }
}
