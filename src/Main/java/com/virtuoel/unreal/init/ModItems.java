package com.virtuoel.unreal.init;

import com.virtuoel.unreal.item.ItemIngotTitanium;
import com.virtuoel.unreal.item.ItemUnreal;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemUnreal ingotTitanium = new ItemIngotTitanium();
	
	public static void init()
	{
		GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
		
	}
}
