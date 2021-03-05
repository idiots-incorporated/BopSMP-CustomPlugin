package bop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LaofieTeleport implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getPlayer().getUniqueId().toString().equals("96ea7e72-53aa-4bf6-8c65-f9244bf15768") && event.getItem().getType().equals(Material.COMPASS)) {
                event.getPlayer().chat("/world world_nether");
            }
        }
    }
}
