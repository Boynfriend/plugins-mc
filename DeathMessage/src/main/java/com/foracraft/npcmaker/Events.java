package com.foracraft.npcmaker;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent pde)
    {
        Player plr = pde.getEntity();
        pde.setDeathMessage("Player " + plr.getDisplayName() + " has dead!");
    }
}
