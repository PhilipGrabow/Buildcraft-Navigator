package de.philipgrabow.bcn.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.philipgrabow.bcn.inventory.Navigator;

public class InventoryClickE implements Listener {
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onInvClick(InventoryClickEvent e) {
		if(e.getInventory().getName().equalsIgnoreCase(Navigator.invname)) {
			
			e.setCancelled(true);
		}
	}

}
