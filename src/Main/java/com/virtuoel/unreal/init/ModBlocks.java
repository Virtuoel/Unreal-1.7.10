package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.virtuoel.unreal.block.BlockUnreal;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	
	public static final BlockUnreal blockTitanium = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName(Names.Blocks.BLOCK_TITANIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_TITANIUM)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal blockTarydium = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName(Names.Blocks.BLOCK_TARYDIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_TARYDIUM)
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static void init()
	{
		GameRegistry.registerBlock(blockTitanium, Names.Blocks.BLOCK_TITANIUM);
		GameRegistry.registerBlock(blockTarydium, Names.Blocks.BLOCK_TARYDIUM);
		
	}
	
}
