package com.virtuoel.unreal.handler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;

import cpw.mods.fml.common.IFuelHandler;

public class UnrealFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel==null)return 0;
		if(fuel.getItem()==Item.getItemFromBlock(ModBlocks.blockBlaze))
		{
			return 2400*9;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(ModBlocks.blockCharcoal))
		{
			return 1600*9;
		}
		else if(fuel.getItem()==ModItems.debugTool)
		{
			return 1600;
		}
		return 0;
	}
}
