package com.virtuoel.unreal.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack
				(ModBlocks.blockTitanium,1,0),
				"III","III","III",'I',"ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack
				(ModItems.ingotTitanium,9,0),
				"I",'I',"blockTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack
				(ModBlocks.blockTarydium,1,0),
				"III","III","III",'I',"gemTarydium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack
				(ModItems.gemTarydium,9,0),
				"I",'I',"blockTarydium"));
		
	}
	
	public static void initOreDict()
	{
		OreDictionary.registerOre("ingotTitanium", new ItemStack(ModItems.ingotTitanium,1,0));
		OreDictionary.registerOre("blockTitanium", new ItemStack(ModBlocks.blockTitanium,1,0));
		OreDictionary.registerOre("gemTarydium", new ItemStack(ModItems.gemTarydium,1,0));
		OreDictionary.registerOre("blockTarydium", new ItemStack(ModBlocks.blockTarydium,1,0));
	}
}
