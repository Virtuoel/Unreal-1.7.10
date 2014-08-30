package com.virtuoel.unreal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitanium extends BlockUnreal
{

	public BlockTitanium(Material material)
	{
		super(material);
		this.setBlockName("blockTitanium")
		.setBlockTextureName("blockTitanium")
		.setHardness(5.0F).setResistance(10.0F)
		.setStepSound(Block.soundTypeMetal)
		.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
