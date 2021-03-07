package bop;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Cookie(), this);
        getServer().getPluginManager().registerEvents(new Excalibur(), this);
        getServer().getPluginManager().registerEvents(new LaofieTeleport(), this);
        getServer().getPluginManager().registerEvents(new Netherborn(), this);
        getServer().getPluginManager().registerEvents(new Infinitotem(), this);
        getLogger().info("BopSMP Plugin is activating!");
    }
    @Override
    public void onDisable() {
        getLogger().info("BopSMP Plugin is deactivating!");
    }
}
