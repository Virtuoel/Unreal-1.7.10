package com.virtuoel.unreal.block;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

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
