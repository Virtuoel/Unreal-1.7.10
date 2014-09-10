package com.virtuoel.unreal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Reference;

public class BlockUnrealMultiTexture extends BlockUnreal
{
	public IIcon[] blockIcons = new IIcon[6];
	
	public BlockUnrealMultiTexture(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.blockIcons[side];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
	    for (int i = 0; i < 6; i ++) {
	        this.blockIcons[i] = iconRegister.registerIcon(String.format("%s_%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Reference.BLOCK_FACES[i]));
	    }
	}
}
