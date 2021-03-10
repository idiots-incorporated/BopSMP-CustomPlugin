package bop;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class OliverInsomnia implements Listener {
    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent event){
        double oldHealth = event.getPlayer().getHealth();
        if(event.getPlayer().getUniqueId().toString().equals("490a39fc-f7f9-4aab-bb26-81e188bbd8aa")){
            event.getPlayer().damage(1);
            event.getPlayer().setHealth(oldHealth);
        }
    }
}