package com.virtuoel.unreal.item;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemToolUnreal extends ItemUnreal
{
	public ItemToolUnreal()
	{
		super();
		this.setUnlocalizedName("itemToolUnreal")
		.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
}
