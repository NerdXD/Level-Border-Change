package com.nerdxd.xpborderchange;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class XPBorderChange extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("XPBorderChange Plugin is now active...");
        getCommand("bc").setExecutor(new XPBorderChangeCommand());
        Bukkit.getPluginManager().registerEvents(new XPBorderChangeCommand(), this);

    }

}
