package de.philipgrabow.bcn.inventory;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Navigator {
	
	public static String invname = "Navigator";
	public static int invsize = 54;
	
	public static void openInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 54, "Navigator-Spawnworld");
		loadItems(inv);
		p.openInventory(inv);
	}
	public static void loadItems(Inventory inv) {
		inv.setItem(10, world1());
		inv.setItem(16, world2());
		inv.setItem(28, world3());
		inv.setItem(34, world4());
		inv.setItem(49, world5());
	}
	public static ItemStack redglasspane() {
		ItemStack redglass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		ItemMeta meta = redglass.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "Keine Funktion!");
		redglass.setItemMeta(meta);
		return redglass;
	}
	public static ItemStack slimeball() {
		ItemStack is = new ItemStack(Material.SLIME_BALL);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "Zum Spawn!");
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack cactus_next_site() {
		ItemStack is = new ItemStack(Material.CACTUS);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Nächste Seite...");
		ArrayList<String> list = new ArrayList<>();
		list.add(ChatColor.YELLOW + "Hiermit öffnest du die nächste Seite...");
		list.add(ChatColor.GREEN + "Diese Seite ist für eine andere Welt!");
		meta.setLore(list);
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack world1() {
		ItemStack is = new ItemStack(Material.CACTUS);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Spawn-Welt");
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack world2() {
		ItemStack is = new ItemStack(Material.LOG);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Farmwelt");
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack world3() {
		ItemStack is = new ItemStack(Material.DIAMOND_BLOCK);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("CityBuild");
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack world4() {
		ItemStack is = new ItemStack(Material.BOW);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Spiele-Welt");
		is.setItemMeta(meta);
		return is;
	}
	public static ItemStack world5() {
		ItemStack is = new ItemStack(Material.GOLD_SPADE);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName("Grundstücks-Welt");
		is.setItemMeta(meta);
		return is;
	}
}