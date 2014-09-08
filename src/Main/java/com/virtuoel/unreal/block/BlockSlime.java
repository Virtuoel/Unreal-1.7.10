package com.virtuoel.unreal.block;

import net.minecraft.block.material.Material;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlime extends BlockUnreal
{
	
	public BlockSlime(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderBlockPass()
	{
		return 1;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
}
