package bop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Netherborn implements Listener{
    private UUIDList listOfPlayers = new UUIDList();
    String laofie = listOfPlayers.LaofieUUID;
    String linguine = listOfPlayers.LinguineUUID;
    PotionEffect speed2 = new PotionEffect(PotionEffectType.SPEED, 300, 1);
    PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 300, 0);
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        if(event.getPlayer().getLocation().getWorld().getName().endsWith("_nether")){
            if (event.getPlayer().getUniqueId().toString().equals(laofie) || event.getPlayer().getUniqueId().toString().equals(linguine)){
                event.getPlayer().addPotionEffect(speed2);
                event.getPlayer().addPotionEffect(regen);
            }
        }
    }
}
