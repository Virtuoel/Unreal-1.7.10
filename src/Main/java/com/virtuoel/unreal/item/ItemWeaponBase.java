package com.virtuoel.unreal.item;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemWeaponBase extends ItemUnreal
{
	public ItemWeaponBase()
	{
		super();
		this.setNoRepair().setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	
	
	
	
}
