package com.virtuoel.unreal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class BlockTemplateDummy extends BlockUnreal
{

	public BlockTemplateDummy(Material material)
	{
		super(material);
		this.setBlockName("blockTemplateDummy")
		.setBlockTextureName("blockTemplateDummy")
		.setHardness(1.0F).setResistance(2.0F)
		.setStepSound(Block.soundTypeStone)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
}
