package de.philipgrabow.bcn.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.philipgrabow.bcn.inventory.Navigator;

public class Hub implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hub")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					Player p = (Player) sender;
					Navigator.openInventory(p);
					p.sendMessage("Der Navigator wurde geöffnet...");
					return true;
				}
				if(args.length > 0) {
					return false;
				}
			} else {
				sender.sendMessage("Du bist kein Spieler!");
				return true;
			}
		}
		return false;
	}
	
	

}
