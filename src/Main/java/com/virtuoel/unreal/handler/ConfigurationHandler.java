package com.virtuoel.unreal.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;

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
		Settings.Crafting.ninePearlsPerEnderBlock = configuration.getBoolean("ninePearlsPerEnderBlock", Reference.ConfigCategory.CRAFTING, false, "True for 9 ender pearls per block, false for 4");
		
		Settings.World.worldGeneratorWeight = configuration.getInt("worldGeneratorWeight", Configuration.CATEGORY_GENERAL, 1, 0, 1000, "Weight of world generator");
		
		Settings.Weapons.stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", Reference.ConfigCategory.WEAPONS, true, "If Stinger destroys terrain");
		Settings.Weapons.eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", Reference.ConfigCategory.WEAPONS, false, "If Eightball Launcher destroys terrain");
		Settings.Weapons.redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", Reference.ConfigCategory.WEAPONS, false, "If Redeemer destroys terrain");
		
		Settings.Debug.printDebugConfigValues = configuration.getBoolean("printDebugConfigValues", Reference.ConfigCategory.DEBUG, false, "True to print some configuration values");
		Settings.Debug.printDebugOreDictionaryValues = configuration.getBoolean("printDebugOreDictionaryValues", Reference.ConfigCategory.DEBUG, false, "True to print Ore Dictionary entries");
		Settings.Debug.printDebugKeyBindingValues = configuration.getBoolean("printDebugKeyBindingValues", Reference.ConfigCategory.DEBUG, false, "True to print keybindings");
		Settings.Debug.debugClearItems = configuration.getBoolean("debugClearItems", Reference.ConfigCategory.DEBUG, false, "True to remove all items and blocks from this mod");
		Settings.Debug.debugWorldGenerator = configuration.getBoolean("debugWorldGenerator", Reference.ConfigCategory.DEBUG, false, "True to have a debug overlay of ore locations in the sky");
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
