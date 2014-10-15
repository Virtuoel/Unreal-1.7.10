package com.virtuoel.unreal.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;

public class CreativeTabUnreal
{
	public static final CreativeTabs UNREAL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.tarydPowerBasic;
		}
	};
}
