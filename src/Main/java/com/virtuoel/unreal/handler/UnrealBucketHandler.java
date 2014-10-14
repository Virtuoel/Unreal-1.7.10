package com.virtuoel.unreal.handler;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;

import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class UnrealBucketHandler
{
	@SubscribeEvent
	public void onBucketFill(FillBucketEvent event)
	{
		ItemStack result = fillCustomBucket(event.world, event.target);
		
		if (result == null)
		{
			return;
		}
		
		event.result = result;
		event.setResult(Result.ALLOW);
	}
	
	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos)
	{
		Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);

		if (block!=null)
		{
			if(block.equals(ModBlocks.fluidMercury) && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0)
			{
				world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
				return new ItemStack(ModItems.bucketMercury);
			}/*
			else if(block.equals(ModBlocks.fluidX) && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0)
			{
				
			}
			*/
		}
		return null;
	}
}
