package de.verdox.mccreativelab.classgenerator;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginRunner extends JavaPlugin {
    @Override
    public void onEnable() {
        ClassGenerator.run();
        getServer().shutdown();
    }
}
