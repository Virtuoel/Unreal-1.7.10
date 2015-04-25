package com.virtuoel.unreal.handler;

import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class UnrealBlockBreakHandler
{
	public static UnrealBlockBreakHandler INSTANCE = new UnrealBlockBreakHandler();
	
	@SubscribeEvent
    public void onPlayerStartBreaking(PlayerEvent.BreakSpeed event)
	{
		LogHelper.info("breaking...");
        if(event.entityPlayer.getCurrentEquippedItem() != null)
        {
            if(event.entityPlayer.getCurrentEquippedItem().getItem() == ModItems.pickaxeTarydiumAlloyRefined)
            {
                World world = event.entityPlayer.worldObj;
                Block block = world.getBlock(event.x, event.y, event.z);
                if(block == Blocks.bedrock)
                {
                    event.newSpeed = 20.0F;
                }
                /*if(block.getBlockHardness(world, event.x, event.y, event.z) == -1.0F)
                {
                    event.newSpeed = 20.0F;
                }*/
            }
        }
    }
	
}
