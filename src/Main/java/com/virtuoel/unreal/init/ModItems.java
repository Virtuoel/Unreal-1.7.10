package com.virtuoel.unreal.init;

import net.minecraft.creativetab.CreativeTabs;

import com.virtuoel.unreal.item.ItemIngotTitanium;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	
	public static final ItemUnreal ingotTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotTitanium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabs.tabAllSearch);
	
	public static final ItemUnreal gemTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gemTarydium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabs.tabAllSearch);
	
	public static void init()
	{
		GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
		GameRegistry.registerItem(gemTarydium, "gemTarydium");
		
	}
}
