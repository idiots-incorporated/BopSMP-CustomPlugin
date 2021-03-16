package bop;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.entity.Player;
import java.util.UUID;

public class Cookie implements Listener {
    UUID doggers = UUIDGrabber.grabUUID("TheBasicDog");
    @EventHandler
    public void onPlayerItemConsumption(PlayerItemConsumeEvent cookieEat) {
        Player p = cookieEat.getPlayer();
        if (cookieEat.getItem().getType().toString().equals("COOKIE")
                && p.getUniqueId().equals(doggers)) {
            p.setHealth(0);
        }
    }
}