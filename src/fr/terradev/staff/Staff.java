package fr.terradev.staff;

import org.bukkit.plugin.java.JavaPlugin;

public class Staff extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getLogger().info("[§aTerraStaff§r] is §aENABLED");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[§aTerraStaff§r] is §cDISABLED");
	}

}
