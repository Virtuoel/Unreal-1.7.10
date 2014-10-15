package com.virtuoel.unreal.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.virtuoel.unreal.block.BlockFluidUnreal;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModFluids
{
	
	public static Fluid fluidMercury = new Fluid("Mercury")
		.setDensity(1000).setViscosity(3000);
	
	//fluid blocks
	public static BlockFluidUnreal fluidBlockMercury;
	
	public static void initFluids()
	{
		
		FluidRegistry.registerFluid(fluidMercury);
		fluidMercury.setUnlocalizedName(Names.Fluids.FLUID_MERCURY);
		
		fluidBlockMercury = (BlockFluidUnreal)
				new BlockFluidUnreal(ModFluids.fluidMercury, Material.water)
				.setBlockName(Names.Fluids.FLUID_MERCURY)/*
				.setBlockTextureName(Names.Fluids.FLUID_MERCURY)
				.setHardness(-1.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null)*/;
		
		GameRegistry.registerBlock(fluidBlockMercury, Names.Fluids.FLUID_MERCURY);
		
		
	}
}
