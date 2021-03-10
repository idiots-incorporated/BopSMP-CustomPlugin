package bop;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent.Cause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KorbWabbajack implements Listener{
    
    public void onPlayerHit(EntityDamageByEntityEvent event, EntityPotionEffectEvent event2){
        if(event.getDamager().getType() != EntityType.PLAYER){
            return;
        }
        if(event.getEntityType() != EntityType.PLAYER){
            return;
        }
        PotionEffect bog = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5, 10);
        Player attacker = (Player)event.getDamager();
        Player hitPlayer = (Player)event.getEntity();
        List<String> itemlore = attacker.getInventory().getItemInMainHand().getItemMeta().getLore();
        if(//attacker.getUniqueId().toString().equals("d28742a0-914b-4a56-bd62-cef048e083ae") && 
        itemlore.get(0).equals("CHEESE FOR EVERYONE!")){
            
             hitPlayer.chat("kill");
             hitPlayer.addPotionEffect(bog);
             if(event2.getCause() == Cause.EXPIRATION){
                 Bukkit.getServer().dispatchCommand(hitPlayer, "unmorph");
             }
        }
        
    }
}