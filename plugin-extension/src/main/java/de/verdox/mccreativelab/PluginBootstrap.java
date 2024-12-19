package de.verdox.mccreativelab;

import de.verdox.mccreativelab.impl.mcclab.platform.MCCLabPlatform;
import de.verdox.mccreativelab.impl.paper.plugin.MCCPaperPluginLoader;
import de.verdox.mccreativelab.world.block.FakeBlockRegistry;
import de.verdox.mccreativelab.world.item.FakeItemRegistry;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.vcore.paper.VCorePaper;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.loader.PluginClasspathBuilder;
import io.papermc.paper.plugin.loader.library.impl.MavenLibraryResolver;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.repository.RemoteRepository;
import org.jetbrains.annotations.NotNull;

public class PluginBootstrap extends MCCPaperPluginLoader {

    @Override
    public void bootstrap(BootstrapContext context) {
        super.bootstrap(context);
        FakeBlockRegistry.registerToMinecraftRegistry();
        FakeItemRegistry.registerToMinecraftRegistry();
    }

    @Override
    public void classloader(@NotNull PluginClasspathBuilder classpathBuilder) {
        super.classloader(classpathBuilder);
        VCorePaper.onPluginLoad(classpathBuilder);
        MavenLibraryResolver resolver = new MavenLibraryResolver();
        resolver.addDependency(new Dependency(new DefaultArtifact("io.vertx:vertx-core:4.5.0"), null));

        resolver.addDependency(new Dependency(new DefaultArtifact("ws.schild:jave-all-deps:3.5.0"), null));
        resolver.addDependency(new Dependency(new DefaultArtifact("org.apache.commons:commons-compress:1.26.1"), null));
        resolver.addDependency(new Dependency(new DefaultArtifact("com.hierynomus:sshj:0.38.0"), null));
        resolver.addDependency(new Dependency(new DefaultArtifact("commons-io:commons-io:2.16.1"), null));
        resolver.addDependency(new Dependency(new DefaultArtifact("org.tukaani:xz:1.9"), null));

        resolver.addRepository(new RemoteRepository.Builder("maven","default","https://repo.maven.apache.org/maven2/.").build());
        classpathBuilder.addLibrary(resolver);
    }

    @Override
    public MCCPlatform createPlatform() {
        return new MCCLabPlatform();
    }
}
