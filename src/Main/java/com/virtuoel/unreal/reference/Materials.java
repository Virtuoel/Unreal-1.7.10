package com.virtuoel.unreal.reference;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import com.virtuoel.unreal.block.material.MaterialUnreal;

public class Materials
{
	public static final class Blocks
	{
		public static final Material tarydium = new MaterialUnreal(MapColor.iceColor).setRequiresTool().setImmovableMobility();
		public static final Material bedrock = new MaterialUnreal(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
		public static final Material immobile = new MaterialUnreal(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
		
	}
	
	
	
}
