package bop;
import org.bukkit.Effect;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Infinitotem implements Listener{
    @EventHandler
    public void onPlayerDeath(EntityDamageEvent event){
        if (event.getEntityType() != EntityType.PLAYER)
        {
            return;
        }
        Player p = (Player)event.getEntity();
        if(event.getEntity().getUniqueId().toString().equals("d44e3103-2a77-4181-a846-2790e2c08a6c") && p.getHealth() - event.getDamage() < 1){
            p.setHealth(20);
            p.getWorld().playEffect(p.getLocation(), Effect.WITHER_SHOOT, null);
            for(double i = 0; i<3; i++){
            p.getWorld().playEffect(p.getLocation().add(0, i, 0), Effect.ENDER_SIGNAL, null);
            }
            event.setCancelled(true);            

        }
    }
}