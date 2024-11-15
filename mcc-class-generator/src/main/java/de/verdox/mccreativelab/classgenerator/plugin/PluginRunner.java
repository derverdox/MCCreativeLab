package de.verdox.mccreativelab.classgenerator.plugin;

import de.verdox.mccreativelab.classgenerator.ClassGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginRunner extends JavaPlugin {
    @Override
    public void onEnable() {
        try{
            ClassGenerator.run();
        }
        catch (Throwable e){
            e.printStackTrace();
        }
        getServer().shutdown();
    }
}
