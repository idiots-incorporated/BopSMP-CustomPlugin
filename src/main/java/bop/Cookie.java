package bop;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.entity.Player;

public class Cookie implements Listener {
    @EventHandler

    public void onPlayerItemConsumption(PlayerItemConsumeEvent cookieEat) {
        Player p = cookieEat.getPlayer();
        if (cookieEat.getItem().getType().toString().equals("COOKIE")
                && p.getUniqueId().toString().equals("ae22051d-1226-4b76-a8d3-2b07a341f2ec")) {
            p.setHealth(0);
        }
    }
}