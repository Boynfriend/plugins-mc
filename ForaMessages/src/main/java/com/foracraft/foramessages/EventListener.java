package com.foracraft.foramessages;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener
{
    @EventHandler
    public void onJoin(PlayerJoinEvent pje)
    {
        Player plr = pje.getPlayer();
        pje.setJoinMessage(ChatColor.YELLOW + "[Fora" + ChatColor.GREEN + "Craft] " + ChatColor.WHITE + "Игрок " + plr.getDisplayName() + " вошел на сервер.");
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent pqe)
    {
        Player plr = pqe.getPlayer();
        pqe.setQuitMessage(ChatColor.YELLOW + "[Fora" + ChatColor.GREEN + "Craft] " + ChatColor.WHITE + "Игрок " + plr.getDisplayName() + " вышел из сервера.");
    }
}
