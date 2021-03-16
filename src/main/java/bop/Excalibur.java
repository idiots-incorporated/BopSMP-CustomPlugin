package bop;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import com.google.gson.Gson;
import java.util.UUID;

public class Excalibur implements Listener {
    //this is easier im not gonna replace every reference to an uuid in your code
    public static int clock;
    Gson gson = new Gson();
    UUID mut4no = UUIDGrabber.grabUUID("Mut4no");
    UUID buffalo = UUIDGrabber.grabUUID("RotatingBuffalo");

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
