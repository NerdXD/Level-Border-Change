package com.nerdxd.xpborderchange;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class XPBorderChangeCommand implements CommandExecutor, Listener {

    double i = 3.0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "XPBorderChange plugin's command has been run...");
            player.getWorld().getWorldBorder().setCenter(player.getLocation());
            player.getWorld().getWorldBorder().setSize(3.0);
        }
        return false;
    }

    @EventHandler
    public void onLevelGained(PlayerLevelChangeEvent e) {
        i = e.getPlayer().getWorld().getWorldBorder().getSize();
        i = i + 5;
        e.getPlayer().getWorld().getWorldBorder().setSize(i);

    }

}
