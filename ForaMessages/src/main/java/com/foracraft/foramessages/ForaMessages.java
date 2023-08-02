package com.foracraft.foramessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForaMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[ForaMessages] Plugin sta");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String lab, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("fmsg"))
        {
            if (sender instanceof Player)
            {
                Player plr = (Player) sender;
                if (args.length == 0)
                {
                    plr.sendMessage(ChatColor.WHITE + "Пишем пустое сообщение никому! XD");
                }
                else if (args.length == 1)
                {
                    Player argPlr = Bukkit.getServer().getPlayerExact(args[0]);

                    if (argPlr == null)
                    {
                        plr.sendMessage(ChatColor.RED + "Видимо вы указали неверного игрока, да и не написали сообщение которое нужно отправить!");
                    }
                    else
                    {
                        plr.sendMessage(ChatColor.RED + "Вы не написали сообщение которое нужно отправить игроку " + argPlr.getDisplayName());
                    }
                }
                else if (args.length >= 2)
                {
                    Player argPlr = Bukkit.getServer().getPlayerExact(args[0]);
                    StringBuilder msgtosenddd = new StringBuilder();

                    for (int i = 1; i < args.length; i++)
                    {
                        msgtosenddd.append(args[i]).append(" ");
                    }

                    String msgtosend = msgtosenddd.toString();

                    if (argPlr == null)
                    {
                        plr.sendMessage(ChatColor.RED + "Видимо вы ука");
                    }
                    else
                    {
                        if (argPlr.getDisplayName() == plr.getDisplayName())
                        {
                            plr.sendMessage("Зачем вы написали сообщение самому себе?");
                        }
                        else
                        {
                            plr.sendMessage(ChatColor.YELLOW + "{Вы -> " + argPlr.getDisplayName() + ChatColor.YELLOW + "}: " + ChatColor.WHITE + msgtosend);
                            argPlr.sendMessage(ChatColor.YELLOW + "{" + plr.getDisplayName() + ChatColor.YELLOW + " -> Вы}: " + ChatColor.WHITE + msgtosend);
                        }

                    }
                }
            }
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[ForaMessages] Plugin stopped.");
    }
}
