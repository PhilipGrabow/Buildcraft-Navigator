package de.philipgrabow.bcn;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.philipgrabow.bcn.executor.Hub;
import de.philipgrabow.bcn.listener.InventoryClickE;
import de.philipgrabow.bcn.listener.Player_to_UUID;
import de.philipgrabow.bcn.listener.UUID_to_Player;

public class Main extends JavaPlugin {

	@Override
	public void onDisable() {
		this.getLogger().info("disabled!");
	}

	@Override
	public void onEnable() {
		registerCmd();
		registerEvents();
		this.getLogger().info("enabled!");
	}
	public void registerCmd() {
		getCommand("hub").setExecutor(new Hub());
	}
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Player_to_UUID(), this);
		pm.registerEvents(new UUID_to_Player(), this);
		pm.registerEvents(new InventoryClickE(), this);
	}
}
