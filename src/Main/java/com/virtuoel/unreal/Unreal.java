package com.virtuoel.unreal;

import com.virtuoel.unreal.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="unreal",name="Unreal",version="1.7.10-1.0.0.0")

public class Unreal
{
	@Mod.Instance("unreal")
	public static Unreal instance;
	
	@SidedProxy(clientSide = "com.virtuoel.unreal.proxy.ClientProxy", 
				serverSide = "com.virtuoel.unreal.proxy.ServerProxy")
	public static IProxy Proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
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
