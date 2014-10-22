package com.virtuoel.unreal.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.virtuoel.unreal.block.BlockFluidUnreal;
import com.virtuoel.unreal.fluid.Mercury;
import com.virtuoel.unreal.fluid.Tarydium;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModFluids
{

	public static Fluid fluidMercury = new Mercury(Names.Fluids.FLUID_MERCURY)
		.setDensity(1500).setViscosity(2500);
	
	public static Fluid fluidTarydium = new Tarydium(Names.Fluids.FLUID_TARYDIUM)
	.setDensity(2000).setViscosity(3250);
	
	//fluid blocks
	public static BlockFluidUnreal fluidBlockMercury;
	public static BlockFluidUnreal fluidBlockTarydium;
	
	public static void initFluids()
	{
		
		FluidRegistry.registerFluid(fluidMercury);
		fluidMercury.setUnlocalizedName(Names.Fluids.FLUID_MERCURY);
		
		fluidBlockMercury = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidMercury, Material.water)
				.setBlockName(Names.Fluids.FLUID_BLOCK_MERCURY)/*
				.setBlockTextureName(Names.Fluids.FLUID_MERCURY)
				.setHardness(-1.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null)*/;
		
		fluidMercury.setIcons(fluidBlockMercury.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockMercury.getIcon(Reference.Blocks.Faces.NORTH, 0));
		
		GameRegistry.registerBlock(fluidBlockMercury, Names.Fluids.FLUID_BLOCK_MERCURY);

		
		FluidRegistry.registerFluid(fluidTarydium);
		fluidTarydium.setUnlocalizedName(Names.Fluids.FLUID_TARYDIUM);
		
		fluidBlockTarydium = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidTarydium, Material.water)
				.setBlockName(Names.Fluids.FLUID_BLOCK_TARYDIUM)/*
				.setBlockTextureName(Names.Fluids.FLUID_TARYDIUM)
				.setHardness(-1.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null)*/;
		
		fluidTarydium.setIcons(fluidBlockTarydium.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockTarydium.getIcon(Reference.Blocks.Faces.NORTH, 0));
		
		GameRegistry.registerBlock(fluidBlockTarydium, Names.Fluids.FLUID_BLOCK_TARYDIUM);
		
	}
}
