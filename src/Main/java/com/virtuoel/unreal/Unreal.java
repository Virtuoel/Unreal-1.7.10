package com.virtuoel.unreal;

import com.virtuoel.unreal.configuration.ConfigurationHandler;
import com.virtuoel.unreal.proxy.IProxy;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION)

public class Unreal
{
	@Mod.Instance(Reference.MOD_ID)
	public static Unreal instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy Proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
