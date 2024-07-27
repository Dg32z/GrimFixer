package org.network.dg32z.grimacpatcher;

import ac.grim.grimac.player.GrimPlayer;
import ac.grim.grimac.shaded.com.github.retrooper.packetevents.protocol.ConnectionState;
import ac.grim.grimac.shaded.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import ac.grim.grimac.shaded.com.github.retrooper.packetevents.protocol.player.User;
import ac.grim.grimac.shaded.com.github.retrooper.packetevents.protocol.player.UserProfile;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class GrimCore extends JavaPlugin
        implements Listener {
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("GrimAC") == null) {
            Bukkit.getPluginManager().disablePlugin(this);
        }
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEnable(PluginEnableEvent e) {
        Bukkit.getLogger().info("Injecting GrimAC...");
        Bukkit.getLogger().warning("Dev By Dg32z_");
        User nonCeption = new User(null, ConnectionState.LOGIN, ClientVersion.V_1_8, new UserProfile(UUID.randomUUID(), "USER_CANNOT_JOIN"));
        new GrimPlayer(nonCeption);
    }
}
