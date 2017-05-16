package de.philipgrabow.bcn;

import org.bukkit.plugin.java.JavaPlugin;

import de.philipgrabow.bcn.executor.Hub;

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
		
	}
}
