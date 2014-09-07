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
	
	public static final BlockUnreal blockRutile = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName(Names.Blocks.BLOCK_RUTILE)
			.setBlockTextureName(Names.Blocks.BLOCK_RUTILE)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreRutile = (BlockUnreal)
			new BlockUnreal(Material.rock).setBlockName(Names.Blocks.ORE_RUTILE)
			.setBlockTextureName(Names.Blocks.ORE_RUTILE)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal blockMagnesium = (BlockUnreal)
			new BlockUnreal(Material.iron).setBlockName(Names.Blocks.BLOCK_MAGNESIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_MAGNESIUM)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreMagnesium = (BlockUnreal)
			new BlockUnreal(Material.rock).setBlockName(Names.Blocks.ORE_MAGNESIUM)
			.setBlockTextureName(Names.Blocks.ORE_MAGNESIUM)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal blockTarydium = (BlockUnreal)
			new BlockUnreal(ModBlockMaterials.tarydium).setBlockName(Names.Blocks.BLOCK_TARYDIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_TARYDIUM)
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreTarydium = (BlockUnreal)
			new BlockUnreal(ModBlockMaterials.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM)
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setLightLevel(0.625F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreTarydiumNether = (BlockUnreal)
			new BlockUnreal(ModBlockMaterials.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM_NETHER)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_NETHER)
			.setHardness(3.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreTarydiumEnd = (BlockUnreal)
			new BlockUnreal(ModBlockMaterials.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM_END)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_END)
			.setHardness(12.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final BlockUnreal oreTarydiumObsidian = (BlockUnreal)
			new BlockUnreal(ModBlockMaterials.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM_OBSIDIAN)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_OBSIDIAN)
			.setHardness(50.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static void init()
	{
		
		blockTitanium.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockTitanium, Names.Blocks.BLOCK_TITANIUM);
		
		blockRutile.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockRutile, Names.Blocks.BLOCK_RUTILE);
		oreRutile.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(oreRutile, Names.Blocks.ORE_RUTILE);
		
		blockMagnesium.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockMagnesium, Names.Blocks.BLOCK_MAGNESIUM);
		oreMagnesium.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(oreMagnesium, Names.Blocks.ORE_MAGNESIUM);
		
		blockTarydium.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydium, Names.Blocks.BLOCK_TARYDIUM);
		oreTarydium.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydium, Names.Blocks.ORE_TARYDIUM);
		oreTarydiumNether.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumNether, Names.Blocks.ORE_TARYDIUM_NETHER);
		oreTarydiumEnd.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumEnd, Names.Blocks.ORE_TARYDIUM_END);
		oreTarydiumObsidian.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumObsidian, Names.Blocks.ORE_TARYDIUM_OBSIDIAN);
		
		
	}
	
}
