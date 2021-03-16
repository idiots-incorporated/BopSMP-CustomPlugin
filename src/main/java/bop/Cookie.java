package bop;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.entity.Player;

public class Cookie implements Listener {
    private UUIDList listOfPlayers = new UUIDList();
    @EventHandler
    public void onPlayerItemConsumption(PlayerItemConsumeEvent cookieEat) {
        Player p = cookieEat.getPlayer();
        if (cookieEat.getItem().getType().toString().equals("COOKIE")
                && p.getUniqueId().toString().equals(listOfPlayers.DoggersUUID)) {
            p.setHealth(0);
        }
    }
}