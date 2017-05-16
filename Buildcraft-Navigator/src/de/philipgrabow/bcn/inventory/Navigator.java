package de.philipgrabow.bcn.inventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Navigator {
	
	public static void openInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 54, "Navigator");
		loadItems(inv);
		p.openInventory(inv);
	}
	public static void loadItems(Inventory inv) {
		inv.setItem(26, slimeball());
	}
	public static ItemStack slimeball() {
		ItemStack is = new ItemStack(Material.SLIME_BALL);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Zum Spawn!");
		is.setItemMeta(meta);
		return is;
	}
}
