package com.virtuoel.unreal;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.virtuoel.unreal.client.handler.KeyInputEventHandler;
import com.virtuoel.unreal.handler.ConfigurationHandler;
import com.virtuoel.unreal.handler.UnrealBucketHandler;
import com.virtuoel.unreal.handler.UnrealFuelHandler;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModFluids;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.init.ModRecipes;
import com.virtuoel.unreal.proxy.IProxy;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.LogHelper;
import com.virtuoel.unreal.world.UnrealWorldGenerator;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

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
		LogHelper.info("Pre Initilization Started.");
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		proxy.registerKeyBindings();
		LogHelper.info("Key Binding Registration Completed.");
		
		if(!Settings.Debug.debugClearItems)
		{
			
			ModFluids.initFluids();
			LogHelper.info("Fluids and Fluid Blocks Initilized.");
			
			ModBlocks.init();
			LogHelper.info("Blocks Initilized.");
			
			ModItems.init();
			LogHelper.info("Items Initilized.");
			
			ModRecipes.initOreDict();
			LogHelper.info("Ore Dictionary Registration Completed.");
			
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_MERCURY, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ModItems.bucketMercury), new ItemStack(Items.bucket));
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_TARYDIUM_SLUDGE, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ModItems.bucketTarydiumSludge), new ItemStack(Items.bucket));
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_HEALTH, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ModItems.bucketHealth), new ItemStack(Items.bucket));
			LogHelper.info("Fluid Container Items Registered.");
			
			UnrealBucketHandler.INSTANCE.buckets.put(ModFluids.fluidBlockMercury, ModItems.bucketMercury);
			UnrealBucketHandler.INSTANCE.buckets.put(ModFluids.fluidBlockTarydiumSludge, ModItems.bucketTarydiumSludge);
			UnrealBucketHandler.INSTANCE.buckets.put(ModFluids.fluidBlockHealth, ModItems.bucketHealth);
			MinecraftForge.EVENT_BUS.register(UnrealBucketHandler.INSTANCE);
			LogHelper.info("Bucket Handler Registered.");
			
		}
		else
		{
			LogHelper.info("Fluids Cleared.");
			LogHelper.info("Blocks Cleared.");
			LogHelper.info("Items Cleared.");
			LogHelper.info("Fluid Registration Skipped.");
			LogHelper.info("Ore Dictionary Registration Skipped.");
			LogHelper.info("Fluid Container Item Registration Skipped.");
			LogHelper.info("Bucket Handler Registration Skipped.");
		}
		
		LogHelper.info("Pre Initilization Completed.");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Initilization Started.");
		
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		LogHelper.info("Key Input Handler Registered.");
		
		if(!Settings.Debug.debugClearItems)
		{
			GameRegistry.registerWorldGenerator(new UnrealWorldGenerator(), Settings.World.worldGeneratorWeight);
			LogHelper.info("World Generator Registered.");
			
			GameRegistry.registerFuelHandler(new UnrealFuelHandler());
			LogHelper.info("Fuel Handler Registered.");
			
			ModRecipes.init();
			LogHelper.info("Crafting Recipes Initilized.");
			
			ModRecipes.initSmelting();
			LogHelper.info("Smelting Recipes Initilized.");
		}
		else
		{
			LogHelper.info("World Generation Disabled.");
			LogHelper.info("Recipes Cleared.");
		}
		
		LogHelper.info("Initilization Completed.");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initilization Started.");
		
		if(Settings.Debug.printDebugOreDictionaryValues)
		{
			for(String oreName : OreDictionary.getOreNames())
			{
				LogHelper.info(oreName);
			}
		}
		
		LogHelper.info("Post Initilization Completed.");
	}
}
