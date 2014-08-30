package com.virtuoel.unreal.init;

import com.virtuoel.unreal.item.ItemIngotTitanium;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ItemUnreal ingotTitanium = new ItemIngotTitanium();
	
	public static void init()
	{
		GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
		GameRegistry.registerItem(new ItemUnreal().setUnlocalizedName("gemTarydium"), "gemTarydium");
		
	}
}
