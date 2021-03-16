package bop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LaofieTeleport implements Listener {
    private UUIDList listOfPlayers = new UUIDList();
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getPlayer().getUniqueId().toString().equals(listOfPlayers.LaofieUUID) && event.getItem().getType().equals(Material.COMPASS)) {
                event.getPlayer().chat("/world world_nether");
            }
        }
    }
}
