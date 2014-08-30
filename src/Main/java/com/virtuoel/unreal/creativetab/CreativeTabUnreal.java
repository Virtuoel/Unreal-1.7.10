package com.virtuoel.unreal.creativetab;

import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUnreal
{
	public static final CreativeTabs UNREAL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem(){ return ModItems.gemTarydium; }
	};
	
}
