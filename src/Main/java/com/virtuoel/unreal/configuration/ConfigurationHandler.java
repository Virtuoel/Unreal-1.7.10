package com.virtuoel.unreal.configuration;

import java.io.File;

import com.virtuoel.unreal.reference.Reference;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
	public static void init(File configFile)
	{
		Configuration configuration = new Configuration(configFile);
		boolean stingerTerrainDamage = true;
		boolean eightballTerrainDamage = false;
		int eightballContactDamage = 1;
		int eightballExplosionPower = 5;
		boolean redeemerTerrainDamage = false;
		int redeemerContactDamage = 10;
		int redeemerExplosionPower = 50;
		
		try
		{
			configuration.load();
			
			stingerTerrainDamage = configuration.get("WeaponProperties", "stingerTerrainDamage", true, "If Stinger destroys terrain").getBoolean(true);
			eightballTerrainDamage = configuration.get("WeaponProperties", "eightballTerrainDamage", false, "If Eightball Launcher destroys terrain").getBoolean(false);
			redeemerTerrainDamage = configuration.get("WeaponProperties", "redeemerTerrainDamage", false, "If Redeemer destroys terrain").getBoolean(false);
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			configuration.save();
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
		
	}
	
}
