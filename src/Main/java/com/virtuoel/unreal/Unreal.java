package com.virtuoel.unreal;

import net.minecraftforge.oredict.OreDictionary;

import com.virtuoel.unreal.client.handler.KeyInputEventHandler;
import com.virtuoel.unreal.handler.ConfigurationHandler;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.init.ModRecipes;
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
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		proxy.registerKeyBindings();
		LogHelper.info("Key Binding Registration Completed.");
		
		if(!Reference.DEBUG_CLEAR_ITEMS){
			ModItems.init();
			LogHelper.info("Items Initilized.");
			
			ModBlocks.init();
			LogHelper.info("Blocks Initilized.");
			
			ModItems.initTools();
			LogHelper.info("Tool Types Assigned.");
			
			ModRecipes.initOreDict();
			LogHelper.info("Ore Dictionary Registration Completed.");
		}
		else
		{
			LogHelper.info("Items Cleared.");
			LogHelper.info("Blocks Cleared.");
			LogHelper.info("Tool Type Assigment Skipped.");
			LogHelper.info("Ore Dictionary Registration Skipped.");
		}
		
		LogHelper.info("Pre Initilization Completed.");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		
		if(!Reference.DEBUG_CLEAR_ITEMS)
		{
			ModRecipes.init();
			LogHelper.info("Recipes Initilized.");
		}
		else
		{
			LogHelper.info("Recipes Cleared.");
		}
		
		LogHelper.info("Initilization Completed.");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		if(Reference.PRINT_DEBUG_OREDICT_VALUES)
		{
			for(String oreName : OreDictionary.getOreNames())
			{
				LogHelper.info(oreName);
			}
		}
		
		LogHelper.info("Post Initilization Completed.");
	}
}
