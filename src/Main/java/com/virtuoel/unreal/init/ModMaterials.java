package com.virtuoel.unreal.init;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import com.virtuoel.unreal.block.material.ModMaterial;

public class ModMaterials
{
	public static final Material tarydium = new ModMaterial(MapColor.iceColor).setRequiresTool().setImmovableMobility();
	public static final Material bedrock = new ModMaterial(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
	public static final Material immobile = new ModMaterial(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
	
}
