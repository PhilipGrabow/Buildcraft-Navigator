package de.philipgrabow.bcn.listener;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Player_to_UUID implements Listener {
	
	static File file = new File("plugins/Buildcraft-Navigator/UUID", "Player_to_UUID.yml");
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onJoin(PlayerJoinEvent e) {
		String uid = e.getPlayer().getUniqueId().toString();
		String name = e.getPlayer().getName();
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		cfg.set(name + ".UUID", uid);
		try {
			cfg.save(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static String getString(String path) {
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		String result = cfg.getString(path);
		return result;
	}
}
