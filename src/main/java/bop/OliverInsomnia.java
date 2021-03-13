package bop;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class OliverInsomnia implements Listener {
    @EventHandler
    public UUIDList listOfPlayers = new UUIDList();
    public void onPlayerSleep(PlayerBedEnterEvent event){
        double oldHealth = event.getPlayer().getHealth();
        if(event.getPlayer().getUniqueId().toString().equals(listOfPlayers.OliverUUID)){
            event.getPlayer().damage(1);
            event.getPlayer().setHealth(oldHealth);
        }
    }
}