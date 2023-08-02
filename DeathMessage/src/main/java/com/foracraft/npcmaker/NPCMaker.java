package com.foracraft.npcmaker;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NPCMaker extends JavaPlugin {
    PluginManager pm;
    @Override
    public void onEnable() {
        pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent pde)
    {
        Player plr = pde.getEntity();
        pde.setDeathMessage("Player " + plr.getDisplayName() + " has dead!");
    }
}
