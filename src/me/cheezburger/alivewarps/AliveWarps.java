package me.cheezburger.alivewarps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class AliveWarps extends JavaPlugin{

	// /spawn - teleports you to the set spawn
	// /goset <warpname> - sets your warp
	// /godel <Warpname - deletes your warp
	// /go <warpname> - teleports you to your warp
	// /golist - lists your warps
	// /golimit - lists the maximum amount of warps you can have
	// alivewarps.multiple.<number of allowed warps here> must be a permission.
	// that permission must hook into /golimit
	// if a player is within 25 blocks, you have to wait 10 seconds before you can teleport
	
	@Override
	public void onEnable(){
		getLogger().info("AliveWarps has been enabled!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("AliveWarps has been disabled!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("go")){
			
		}
		return false;
	}
}
