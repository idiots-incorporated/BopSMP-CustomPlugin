package bop;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Excalibur implements Listener {
    String mut4noUUID = "5cf118ef-272c-4a42-ae06-a51ec5371060";
    String buffUUID = "d44e3103-2a77-4181-a846-2790e2c08a6c";
    public static int clock;

    @EventHandler
    public static void onSwordRightClick(PlayerInteractEvent event) {
        if(event.getItem() == null)
        {
            return;
        }
        if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() == null)
        {
            return;
        }
        TimerTask task = new TimerTask() {
            public void run() {
                clock++;
            }
        };
        Timer clockTimer = new Timer("Timer");
        long delay = 1000L;
        clockTimer.scheduleAtFixedRate(task, delay, 1000);

        if (clock > 5) {
            Player player = event.getPlayer();
            List<String> itemlore = player.getInventory().getItemInMainHand().getItemMeta().getLore();

            if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                for (int i = 0; i < 2; i++) {
                    if (itemlore.get(i).equals("~Heart of the Empire~")) {
                        player.getWorld().strikeLightning(player.getTargetBlockExact(48).getLocation());
                        clock = 0;
                    }
                }
            }
        }
    }
}
