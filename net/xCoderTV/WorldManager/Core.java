package net.xCoderTV.WorldManager;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	public void onEnable() {
		
	}
	public void onDisable() {
		
	}
	public void worldCmd_teleport(Player p, String MinecraftWorld){
		Location worldLocation = Bukkit.getServer().getWorld(MinecraftWorld).getSpawnLocation().getBlock().getLocation();
		p.teleport(worldLocation);
	}
	public void worldCmd_createNormal(Player p, String MinecraftWorld){
		WorldCreator worldCreator = new WorldCreator(MinecraftWorld);
		 worldCreator.createWorld();
	}
	public void worldCmd_delete(Player p, String MinecraftWorld){
		// TODO
	}
}
