package com.virtuoel.unreal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTarydium extends BlockUnreal
{

	public BlockTarydium(Material material)
	{
		super(material);
		this.setBlockName("blockTarydium")
		.setBlockTextureName("blockTarydium")
		.setHardness(6.0F).setResistance(1000.0F)
		.setStepSound(Block.soundTypeGlass)
		.setLightLevel(1.0F)
		.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
