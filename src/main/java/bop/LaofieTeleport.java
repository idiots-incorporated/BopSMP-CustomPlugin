package bop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.UUID;

public class LaofieTeleport implements Listener {
    UUID laofie = UUIDGrabber.grabUUID("Laofie");
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getPlayer().getUniqueId().equals(laofie) && event.getItem().getType().equals(Material.COMPASS)) {
                event.getPlayer().chat("/world world_nether");
            }
        }
    }
}
