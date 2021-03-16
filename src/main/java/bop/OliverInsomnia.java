package bop;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class OliverInsomnia implements Listener {
    UUID oliver = UUIDGrabber.grabUUID("OliverTheCrow_");
    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent event){
        double oldHealth = event.getPlayer().getHealth();
        if(event.getPlayer().getUniqueId().equals(oliver)){
            event.getPlayer().damage(1);
            event.getPlayer().setHealth(oldHealth);
        }
    }
}