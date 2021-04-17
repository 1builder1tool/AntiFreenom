package me.moomoo.antifreenom;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

import javax.xml.soap.Text;
import java.awt.*;

public final class Antifreenom extends Plugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPing(ProxyPingEvent evt){
        if(evt.getConnection().getVirtualHost().getHostName().contains("1b1t.tk")){
            evt.getConnection().disconnect(new TextComponent(ChatColor.translateAlternateColorCodes(
                    '&',
                    "\n" +
                            "&7-------------------------------------------------------" +
                            "\n\n" +
                            "&6Please connect using&r&3 1b1t.me" +
                            "\n" +
                            "&6Conéctese usando&r&3 1b1t.me" +
                            "\n\n" +
                            "&7&m-------------------------------------------------------"
            )));
            getLogger().info("Prevented " + evt.getConnection().getName() + " from connecting with 1b1t.me");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onConnect(PreLoginEvent evt){
        if(evt.getConnection().getVirtualHost().getHostName().contains("1b1t.tk")){
            evt.getConnection().disconnect(new TextComponent(ChatColor.translateAlternateColorCodes(
                    '&',
                    "\n" +
                            "&7-------------------------------------------------------" +
                            "\n\n" +
                            "&6Please connect using&r&3 1b1t.me" +
                            "\n" +
                            "&6Conéctese usando&r&3 1b1t.me" +
                            "\n\n" +
                            "&7&m-------------------------------------------------------"
            )));
            getLogger().info("Prevented " + evt.getConnection().getName() + " from connecting with 1b1t.me");
        }
    }
}
