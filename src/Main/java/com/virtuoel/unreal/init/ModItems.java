package com.virtuoel.unreal.init;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	
	public static final ItemUnreal ingotTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotTitanium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gemTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gemTarydium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static void init()
	{
		GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
		GameRegistry.registerItem(gemTarydium, "gemTarydium");
	}
	
}
