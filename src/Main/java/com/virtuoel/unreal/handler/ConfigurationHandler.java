package com.virtuoel.unreal.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.reference.Settings.Debug;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{
	
	public static Configuration configuration;
	
	public static void init(File configFile)
	{
		if(configuration==null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		Settings.World.worldGeneratorWeight = configuration.getInt("worldGeneratorWeight", Configuration.CATEGORY_GENERAL, 1, 0, 1000, "Weight of world generator");
		
		Settings.Debug.printDebugConfigValues = configuration.getBoolean("printDebugConfigValues", Reference.CATEGORY_DEBUG, false, "True to print some configuration values");
		Settings.Debug.printDebugOreDictionaryValues = configuration.getBoolean("printDebugOreDictionaryValues", Reference.CATEGORY_DEBUG, false, "True to print Ore Dictionary entries");
		Settings.Debug.printDebugKeyBindingValues = configuration.getBoolean("printDebugKeyBindingValues", Reference.CATEGORY_DEBUG, false, "True to print keybindings");
		Settings.Debug.debugClearItems = configuration.getBoolean("debugClearItems", Reference.CATEGORY_DEBUG, false, "True to remove all items and blocks from this mod");
		Settings.Debug.debugWorldGenerator = configuration.getBoolean("debugWorldGenerator", Reference.CATEGORY_DEBUG, false, "True to have a debug overlay of ore locations in the sky");
		
		Settings.Weapons.stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", Reference.CATEGORY_WEAPONS, true, "If Stinger destroys terrain");
		Settings.Weapons.eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", Reference.CATEGORY_WEAPONS, false, "If Eightball Launcher destroys terrain");
		Settings.Weapons.redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", Reference.CATEGORY_WEAPONS, false, "If Redeemer destroys terrain");
		
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
	
}
