package com.virtuoel.unreal;

import com.virtuoel.unreal.handler.ConfigurationHandler;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.proxy.IProxy;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

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
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		ModItems.init();
		LogHelper.info("Items Initilized.");
		
		ModBlocks.init();
		LogHelper.info("Blocks Initilized.");
		
		LogHelper.info("Pre Initilization Completed.");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Initilization Completed.");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initilization Completed.");
	}

}
