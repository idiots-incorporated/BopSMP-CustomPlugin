package bop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.UUID;
public class Netherborn implements Listener{
    UUID linguine = UUIDGrabber.grabUUID("Llnguine");
    UUID laofie = UUIDGrabber.grabUUID("Laofie");
    PotionEffect speed2 = new PotionEffect(PotionEffectType.SPEED, 300, 1);
    PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 300, 0);
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        if(event.getPlayer().getLocation().getWorld().getName().endsWith("_nether")){
            if (event.getPlayer().getUniqueId().equals(laofie) || event.getPlayer().getUniqueId().equals(linguine)){
                event.getPlayer().addPotionEffect(speed2);
                event.getPlayer().addPotionEffect(regen);
            }
        }
    }
}
