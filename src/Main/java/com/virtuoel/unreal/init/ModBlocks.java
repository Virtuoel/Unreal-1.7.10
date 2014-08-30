package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.virtuoel.unreal.block.BlockTitanium;
import com.virtuoel.unreal.block.BlockUnreal;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	
	public static final BlockUnreal blockTitanium = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName("blockTitanium")
			.setBlockTextureName("blockTitanium")
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabs.tabAllSearch);
	
	public static final BlockUnreal blockTarydium = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName("blockTarydium")
			.setBlockTextureName("blockTarydium")
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(CreativeTabs.tabAllSearch);
	
	public static void init()
	{
		GameRegistry.registerBlock(blockTitanium, "blockTitanium");
		GameRegistry.registerBlock(blockTarydium, "blockTarydium");
		
	}
	
}
