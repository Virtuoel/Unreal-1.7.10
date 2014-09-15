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
		Settings.Weapons.stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", Configuration.CATEGORY_GENERAL, true, "If Stinger destroys terrain");
		Settings.Weapons.eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", Configuration.CATEGORY_GENERAL, false, "If Eightball Launcher destroys terrain");
		Settings.Weapons.redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", Configuration.CATEGORY_GENERAL, false, "If Redeemer destroys terrain");
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
	
}
