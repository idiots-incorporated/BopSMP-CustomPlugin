package bop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Netherborn implements Listener{
    String laofie = "96ea7e72-53aa-4bf6-8c65-f9244bf15768";
    String linguine = "c8dba6a8-1c0b-4f17-ba1b-42aaec0b0839";
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        if(event.getPlayer().getLocation().getWorld().getName().endsWith("_nether")){
            if (event.getPlayer().getUniqueId().toString().equals(laofie) || event.getPlayer().getUniqueId().toString().equals(linguine)){
                //set potion effects
            }
        }
    }
    
}
