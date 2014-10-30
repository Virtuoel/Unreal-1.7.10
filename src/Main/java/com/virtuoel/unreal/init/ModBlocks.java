package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.virtuoel.unreal.block.BlockBedrockium;
import com.virtuoel.unreal.block.BlockCactusTarydium;
import com.virtuoel.unreal.block.BlockEnderCrystal;
import com.virtuoel.unreal.block.BlockForceField;
import com.virtuoel.unreal.block.BlockIronLadder;
import com.virtuoel.unreal.block.BlockOreUnreal;
import com.virtuoel.unreal.block.BlockSlime;
import com.virtuoel.unreal.block.BlockUnreal;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	
	//blocks
	public static Block blockTitanium = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_TITANIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_TITANIUM)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockRutile = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_RUTILE)
			.setBlockTextureName(Names.Blocks.BLOCK_RUTILE)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreRutile = 
			new BlockOreUnreal(Material.rock)
			.setBlockName(Names.Blocks.ORE_RUTILE)
			.setBlockTextureName(Names.Blocks.ORE_RUTILE)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockMagnesium = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_MAGNESIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_MAGNESIUM)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreMagnesium = 
			new BlockOreUnreal(Material.rock)
			.setBlockName(Names.Blocks.ORE_MAGNESIUM)
			.setBlockTextureName(Names.Blocks.ORE_MAGNESIUM)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockTarydium = 
			new BlockUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.BLOCK_TARYDIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_TARYDIUM)
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreTarydium = 
			new BlockOreUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.ORE_TARYDIUM)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM)
			.setHardness(6.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setLightLevel(0.625F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreTarydiumNether = new BlockOreUnreal(Materials.Blocks.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM_NETHER)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_NETHER)
			.setHardness(3.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreTarydiumEnd = 
			new BlockOreUnreal(Materials.Blocks.tarydium).setBlockName(Names.Blocks.ORE_TARYDIUM_END)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_END)
			.setHardness(12.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreTarydiumObsidian = 
			new BlockOreUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.ORE_TARYDIUM_OBSIDIAN)
			.setBlockTextureName(Names.Blocks.ORE_TARYDIUM_OBSIDIAN)
			.setHardness(50.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockBedrockium = 
			new BlockBedrockium(Materials.Blocks.bedrock)
			.setBlockName(Names.Blocks.BLOCK_BEDROCKIUM)
			.setBlockTextureName(Names.Blocks.BLOCK_BEDROCKIUM)
			.setHardness(1000.0F).setResistance(500000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(null);
	
	public static Block oreBedrockium = 
			new BlockBedrockium(Materials.Blocks.bedrock)
			.setBlockName(Names.Blocks.ORE_BEDROCKIUM)
			.setBlockTextureName(Names.Blocks.ORE_BEDROCKIUM)
			.setHardness(1000.0F).setResistance(500000.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(null);
	
	public static Block oreBedrockiumHidden = 
			new BlockBedrockium(Materials.Blocks.bedrock)
			.setBlockName(Names.Blocks.ORE_BEDROCKIUM_HIDDEN)
			.setBlockTextureName(Names.Blocks.ORE_BEDROCKIUM_HIDDEN)
			.setBlockUnbreakable().setResistance(8000000.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(null);
	
	public static Block blockAsbestos = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.BLOCK_ASBESTOS)
			.setBlockTextureName(Names.Blocks.BLOCK_ASBESTOS)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block oreAsbestos = 
			new BlockOreUnreal(Material.rock)
			.setBlockName(Names.Blocks.ORE_ASBESTOS)
			.setBlockTextureName(Names.Blocks.ORE_ASBESTOS)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block cactusTarydium = 
			new BlockCactusTarydium(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.CACTUS_TARYDIUM)
			.setBlockTextureName(Names.Blocks.CACTUS_TARYDIUM)
			.setHardness(3.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeCloth)
			.setLightLevel(0.5F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block ladderIron = 
			new BlockIronLadder(Material.iron)
			.setBlockName(Names.Blocks.LADDER_IRON)
			.setBlockTextureName(Names.Blocks.LADDER_IRON)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeLadder)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block cobblestonePaved = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.COBBLESTONE_PAVED)
			.setBlockTextureName(Names.Blocks.COBBLESTONE_PAVED)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block stonePolished = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.STONE_POLISHED)
			.setBlockTextureName(Names.Blocks.STONE_POLISHED)
			.setHardness(2.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	/*
	public static Block slabStoneSmooth = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.SLAB_STONE_SMOOTH)
			.setBlockTextureName(Names.Blocks.SLAB_STONE_SMOOTH)
			.setHardness(2.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	*/
	public static Block obsidianNether = 
			new BlockUnreal(Materials.Blocks.immobile)
			.setBlockName(Names.Blocks.OBSIDIAN_NETHER)
			.setBlockTextureName(Names.Blocks.OBSIDIAN_NETHER)
			.setHardness(50.0F).setResistance(2000.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block netherrackCompressed1x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.NETHERRACK_COMPRESSED_1X)
			.setBlockTextureName(Names.Blocks.NETHERRACK_COMPRESSED_1X)
			.setHardness(0.8F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block netherrackCompressed2x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.NETHERRACK_COMPRESSED_2X)
			.setBlockTextureName(Names.Blocks.NETHERRACK_COMPRESSED_2X)
			.setHardness(1.2F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block netherrackCompressed3x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.NETHERRACK_COMPRESSED_3X)
			.setBlockTextureName(Names.Blocks.NETHERRACK_COMPRESSED_3X)
			.setHardness(1.6F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block netherrackCompressed4x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.NETHERRACK_COMPRESSED_4X)
			.setBlockTextureName(Names.Blocks.NETHERRACK_COMPRESSED_4X)
			.setHardness(2.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block endStoneCompressed1x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.END_STONE_COMPRESSED_1X)
			.setBlockTextureName(Names.Blocks.END_STONE_COMPRESSED_1X)
			.setHardness(6.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block endStoneCompressed2x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.END_STONE_COMPRESSED_2X)
			.setBlockTextureName(Names.Blocks.END_STONE_COMPRESSED_2X)
			.setHardness(9.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block endStoneCompressed3x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.END_STONE_COMPRESSED_3X)
			.setBlockTextureName(Names.Blocks.END_STONE_COMPRESSED_3X)
			.setHardness(12.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block endStoneCompressed4x = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.END_STONE_COMPRESSED_4X)
			.setBlockTextureName(Names.Blocks.END_STONE_COMPRESSED_4X)
			.setHardness(15.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockCinnabar = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_CINNABAR)
			.setBlockTextureName(Names.Blocks.BLOCK_CINNABAR)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockUUTC = 
			new BlockUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.BLOCK_UUTC)
			.setBlockTextureName(Names.Blocks.BLOCK_UUTC)
			.setHardness(50.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeMetal)
			.setLightLevel(1.0F)
			.setCreativeTab(null);
	
	public static Block blockTarydiumAlloyUnrefined = 
			new BlockUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_UNREFINED)
			.setBlockTextureName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_UNREFINED)
			.setHardness(100.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeMetal)
			.setLightLevel(0.5F)
			.setCreativeTab(null);
	
	public static Block blockTarydiumAlloyRefined = 
			new BlockUnreal(Materials.Blocks.tarydium)
			.setBlockName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_REFINED)
			.setBlockTextureName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_REFINED)
			.setHardness(200.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeMetal)
			.setCreativeTab(null);
	
	public static Block blockEnderCrystal = 
			new BlockEnderCrystal(Materials.Blocks.immobile)
			.setBlockName(Names.Blocks.BLOCK_ENDER_CRYSTAL)
			.setBlockTextureName(Names.Blocks.BLOCK_ENDER_CRYSTAL)
			.setHardness(200.0F).setResistance(1000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(null);
	
	public static Block blockFlint = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.BLOCK_FLINT)
			.setBlockTextureName(Names.Blocks.BLOCK_FLINT)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockCharcoal = 
			new BlockUnreal(Material.rock)
			.setBlockName(Names.Blocks.BLOCK_CHARCOAL)
			.setBlockTextureName(Names.Blocks.BLOCK_CHARCOAL)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockGunpowder = 
			new BlockUnreal(Material.sand)
			.setBlockName(Names.Blocks.BLOCK_GUNPOWDER)
			.setBlockTextureName(Names.Blocks.BLOCK_GUNPOWDER)
			.setHardness(1.2F).setResistance(2.0F)
			.setStepSound(Block.soundTypeSand)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockEnder = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_ENDER)
			.setBlockTextureName(Names.Blocks.BLOCK_ENDER)
			.setHardness(3.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(1.0F)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockLeather = 
			new BlockUnreal(Material.cloth)
			.setBlockName(Names.Blocks.BLOCK_LEATHER)
			.setBlockTextureName(Names.Blocks.BLOCK_LEATHER)
			.setHardness(0.8F).setResistance(4.0F)
			.setStepSound(Block.soundTypeCloth)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockSlime = 
			new BlockSlime(Material.grass)
			.setBlockName(Names.Blocks.BLOCK_SLIME)
			.setBlockTextureName(Names.Blocks.BLOCK_SLIME)
			.setHardness(0.8F).setResistance(4.0F)
			.setStepSound(Block.soundTypeGravel)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockBlaze = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_BLAZE)
			.setBlockTextureName(Names.Blocks.BLOCK_BLAZE)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeStone)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockGhastTear = 
			new BlockUnreal(Material.iron)
			.setBlockName(Names.Blocks.BLOCK_GHAST_TEAR)
			.setBlockTextureName(Names.Blocks.BLOCK_GHAST_TEAR)
			.setHardness(5.0F).setResistance(10.0F)
			.setStepSound(Block.soundTypeGlass)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockNetherWart = 
			new BlockUnreal(Material.clay)
			.setBlockName(Names.Blocks.BLOCK_NETHER_WART)
			.setHardness(0.8F).setResistance(4.0F)
			.setStepSound(Block.soundTypeGravel)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockCocoa = 
			new BlockUnreal(Material.wood)
			.setBlockName(Names.Blocks.BLOCK_COCOA)
			.setHardness(1.0F).setResistance(5.0F)
			.setStepSound(Block.soundTypeWood)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Block blockForceField = 
			new BlockForceField(Materials.Blocks.immobile)
			.setBlockName(Names.Blocks.BLOCK_FORCE_FIELD)
			.setBlockUnbreakable().setResistance(500000.0F)
			.setStepSound(Block.soundTypeGlass)
			.setLightLevel(0.5F)
			.setCreativeTab(null);
	
	public static void init()
	{
		
		//blocks
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
		
		blockBedrockium.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blockBedrockium, Names.Blocks.BLOCK_BEDROCKIUM);
		oreBedrockium.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(oreBedrockium, Names.Blocks.ORE_BEDROCKIUM);
		GameRegistry.registerBlock(oreBedrockiumHidden, Names.Blocks.ORE_BEDROCKIUM_HIDDEN);
		
		blockAsbestos.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockAsbestos, Names.Blocks.BLOCK_ASBESTOS);
		oreAsbestos.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(oreAsbestos, Names.Blocks.ORE_ASBESTOS);
		
		cactusTarydium.setHarvestLevel("axe", 3);
		GameRegistry.registerBlock(cactusTarydium, Names.Blocks.CACTUS_TARYDIUM);
		ladderIron.setHarvestLevel("axe", -1);
		ladderIron.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(ladderIron, Names.Blocks.LADDER_IRON);
		cobblestonePaved.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(cobblestonePaved, Names.Blocks.COBBLESTONE_PAVED);
		stonePolished.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(stonePolished, Names.Blocks.STONE_POLISHED);
		//slabStoneSmooth.setHarvestLevel("pickaxe", 0);
		//GameRegistry.registerBlock(slabStoneSmooth, Names.Blocks.SLAB_STONE_SMOOTH);
		obsidianNether.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(obsidianNether, Names.Blocks.OBSIDIAN_NETHER);
		
		netherrackCompressed1x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed1x, Names.Blocks.NETHERRACK_COMPRESSED_1X);
		netherrackCompressed2x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed2x, Names.Blocks.NETHERRACK_COMPRESSED_2X);
		netherrackCompressed3x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed3x, Names.Blocks.NETHERRACK_COMPRESSED_3X);
		netherrackCompressed4x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed4x, Names.Blocks.NETHERRACK_COMPRESSED_4X);
		endStoneCompressed1x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed1x, Names.Blocks.END_STONE_COMPRESSED_1X);
		endStoneCompressed2x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed2x, Names.Blocks.END_STONE_COMPRESSED_2X);
		endStoneCompressed3x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed3x, Names.Blocks.END_STONE_COMPRESSED_3X);
		endStoneCompressed4x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed4x, Names.Blocks.END_STONE_COMPRESSED_4X);
		
		blockCinnabar.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockCinnabar, Names.Blocks.BLOCK_CINNABAR);
		blockUUTC.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockUUTC, Names.Blocks.BLOCK_UUTC);
		blockTarydiumAlloyUnrefined.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumAlloyUnrefined, Names.Blocks.BLOCK_TARYDIUM_ALLOY_UNREFINED);
		blockTarydiumAlloyRefined.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumAlloyRefined, Names.Blocks.BLOCK_TARYDIUM_ALLOY_REFINED);
		blockEnderCrystal.setHarvestLevel("pickaxe", 5);
		GameRegistry.registerBlock(blockEnderCrystal, Names.Blocks.BLOCK_ENDER_CRYSTAL);
		blockFlint.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockFlint, Names.Blocks.BLOCK_FLINT);
		blockCharcoal.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blockCharcoal, Names.Blocks.BLOCK_CHARCOAL);
		Blocks.fire.setFireInfo(blockCharcoal, 5, 5);
		
		blockGunpowder.setHarvestLevel("pickaxe", 0);
		blockGunpowder.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockGunpowder, Names.Blocks.BLOCK_GUNPOWDER);
		blockEnder.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockEnder, Names.Blocks.BLOCK_ENDER);
		blockLeather.setHarvestLevel("axe", 0);
		GameRegistry.registerBlock(blockLeather, Names.Blocks.BLOCK_LEATHER);
		blockSlime.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockSlime, Names.Blocks.BLOCK_SLIME);
		blockBlaze.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockBlaze, Names.Blocks.BLOCK_BLAZE);
		blockGhastTear.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockGhastTear, Names.Blocks.BLOCK_GHAST_TEAR);
		
		blockNetherWart.setHarvestLevel("axe", 0);
		blockNetherWart.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockNetherWart, Names.Blocks.BLOCK_NETHER_WART);
		blockCocoa.setHarvestLevel("axe", 0);
		GameRegistry.registerBlock(blockCocoa, Names.Blocks.BLOCK_COCOA);
		Blocks.fire.setFireInfo(blockCocoa, 5, 20);
		
		GameRegistry.registerBlock(blockForceField, Names.Blocks.BLOCK_FORCE_FIELD);
		
	}
}
