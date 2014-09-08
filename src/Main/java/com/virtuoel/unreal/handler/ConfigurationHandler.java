package com.virtuoel.unreal.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{
	
	public static Configuration configuration;
	public static boolean stingerTerrainDamage = true;
	public static boolean eightballTerrainDamage = false;
	public static int eightballContactDamage = 1;
	public static int eightballExplosionPower = 5;
	public static boolean redeemerTerrainDamage = false;
	public static int redeemerContactDamage = 10;
	public static int redeemerExplosionPower = 50;
	
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
		stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", Configuration.CATEGORY_GENERAL, true, "If Stinger destroys terrain");
		eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", Configuration.CATEGORY_GENERAL, false, "If Eightball Launcher destroys terrain");
		redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", Configuration.CATEGORY_GENERAL, false, "If Redeemer destroys terrain");
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
	
	/*
	public void loadConfiguration()
	{
		
		try
		{
			configuration.load();
			
			stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", "WeaponProperties", true, "If Stinger destroys terrain");
			eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", "WeaponProperties", false, "If Eightball Launcher destroys terrain");
			redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", "WeaponProperties", false, "If Redeemer destroys terrain");
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			if(configuration.hasChanged())
			{
				configuration.save();
			}
		}
		
		if(Reference.PRINT_DEBUG_CONFIG_VALUES){
			System.out.println("[UnrealConfig] stingerTerrainDamage: "+stingerTerrainDamage);
			System.out.println("[UnrealConfig] eightballTerrainDamage: "+eightballTerrainDamage);
			System.out.println("[UnrealConfig] eightballContactDamage: "+eightballContactDamage);
			System.out.println("[UnrealConfig] eightballExplosionPower: "+eightballExplosionPower);
			System.out.println("[UnrealConfig] redeemerTerrainDamage: "+redeemerTerrainDamage);
			System.out.println("[UnrealConfig] redeemerContactDamage: "+redeemerContactDamage);
			System.out.println("[UnrealConfig] redeemerExplosionPower: "+redeemerExplosionPower);
		}
	}*/
	
}
