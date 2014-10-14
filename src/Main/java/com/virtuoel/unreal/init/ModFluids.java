package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.Fluid;

import com.virtuoel.unreal.block.BlockCactusTarydium;
import com.virtuoel.unreal.block.BlockEnderCrystal;
import com.virtuoel.unreal.block.BlockFluidMercury;
import com.virtuoel.unreal.block.BlockIronLadder;
import com.virtuoel.unreal.block.BlockOreUnreal;
import com.virtuoel.unreal.block.BlockSlime;
import com.virtuoel.unreal.block.BlockUnreal;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.fluid.Mercury;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModFluids
{
	
	public static Fluid fluidMercury = new Mercury("Mercury");
	
}
