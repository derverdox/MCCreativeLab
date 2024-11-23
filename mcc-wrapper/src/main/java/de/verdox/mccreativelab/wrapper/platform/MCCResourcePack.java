package de.verdox.mccreativelab.wrapper.platform;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public record MCCResourcePack(String name, File file, String url, String hash, byte[] hashBytes, boolean isRequired, @Nullable Component prompt) {

    public UUID getUUID(){
        return UUID.nameUUIDFromBytes(name.getBytes(StandardCharsets.UTF_8));
    }

}
