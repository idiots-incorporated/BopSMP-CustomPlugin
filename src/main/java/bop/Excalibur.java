package bop;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Excalibur implements Listener {
    String mut4noUUID = "5cf118ef-272c-4a42-ae06-a51ec5371060";
    String buffUUID = "d44e3103-2a77-4181-a846-2790e2c08a6c";

    @EventHandler
    public void onSwordRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("Excalibur")
                    && player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_SWORD)
                    && player.getUniqueId().toString().equals(buffUUID))
            {
                player.getWorld().strikeLightning(player.getTargetBlockExact(48).getLocation());
            }
        }
    }
}