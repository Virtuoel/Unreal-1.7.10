package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockForceField extends BlockUnreal
{
	
	public BlockForceField(Material material)
	{
		super(material);
		this.setTickRandomly(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
		if(!p_149674_1_.isRemote && p_149674_1_.rand.nextInt(100)==0)
		{
			p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
		}
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
