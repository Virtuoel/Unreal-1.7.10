package com.virtuoel.unreal.integration;

import net.minecraft.item.ItemStack;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.utility.LogHelper;

public class NEIUnrealConfig implements IConfigureNEI
{
	
	@Override
	public void loadConfig()
	{
		API.hideItem(new ItemStack(ModBlocks.blockUUTC));
		API.hideItem(new ItemStack(ModBlocks.blockTarydiumAlloyUnrefined));
		API.hideItem(new ItemStack(ModBlocks.blockTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModBlocks.oreBedrockiumHidden));
		API.hideItem(new ItemStack(ModBlocks.oreBedrockium));
		API.hideItem(new ItemStack(ModBlocks.blockBedrockium));
		API.hideItem(new ItemStack(ModBlocks.blockEnderCrystal));
		
		API.hideItem(new ItemStack(ModItems.swordTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.pickaxeTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.axeTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.shovelTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.hoeTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.rodTarydiumAlloyUnrefined));
		API.hideItem(new ItemStack(ModItems.rodTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.ingotTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.ingotTarydiumAlloyUnrefined));
		API.hideItem(new ItemStack(ModItems.nuggetTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.nuggetTarydiumAlloyUnrefined));
		API.hideItem(new ItemStack(ModItems.dustTarydiumAlloyRefined));
		API.hideItem(new ItemStack(ModItems.dustTarydiumAlloyUnrefined));
		API.hideItem(new ItemStack(ModItems.ingotBedrockium));
		API.hideItem(new ItemStack(ModItems.nuggetBedrockium));
		
		LogHelper.info("NEI Compatibility Completed.");
	}
	
	@Override
	public String getName()
	{
		return Reference.MOD_NAME;
	}
	
	@Override
	public String getVersion()
	{
		return Reference.VERSION;
	}
}
