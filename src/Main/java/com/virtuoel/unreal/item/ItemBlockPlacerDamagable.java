package com.virtuoel.unreal.item;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemBlockPlacerDamagable extends ItemBlockPlacer
{
	private int damagePerPlace = 0;
	
	public ItemBlockPlacerDamagable()
	{
		super();
		this.setNoRepair()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public Item setDamagePerPlace(int dmg)
	{
		this.damagePerPlace = dmg;
		return this;
	}
	
	public int getDamagePerPlace(int dmg)
	{
		return damagePerPlace;
	}
	
	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
	{
		if(p_77648_1_.getMaxDamage() - (p_77648_1_.getItemDamage() + 1) > this.damagePerPlace)
		{
			return false;
		}
		
		Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
		
		if (block == Blocks.snow_layer && (p_77648_3_.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_) & 7) < 1)
		{
			p_77648_7_ = 1;
		}
		else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush)
		{
			if (p_77648_7_ == 0)
			{
				--p_77648_5_;
			}
			
			if (p_77648_7_ == 1)
			{
				++p_77648_5_;
			}
			
			if (p_77648_7_ == 2)
			{
				--p_77648_6_;
			}
			
			if (p_77648_7_ == 3)
			{
				++p_77648_6_;
			}
			
			if (p_77648_7_ == 4)
			{
				--p_77648_4_;
			}
			
			if (p_77648_7_ == 5)
			{
				++p_77648_4_;
			}
		}
		
		if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
		{
			return false;
		}
		else if (p_77648_1_.stackSize == 0)
		{
			return false;
		}
		else
		{
			if (p_77648_3_.canPlaceEntityOnSide(this.getPlaceBlock(), p_77648_4_, p_77648_5_, p_77648_6_, false, p_77648_7_, (Entity)null, p_77648_1_))
			{
				int i1 = this.getPlaceBlock().onBlockPlaced(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, this.getPlaceMeta());
				
				if (p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, this.getPlaceBlock(), i1, 3))
				{
					if (p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) == this.getPlaceBlock())
					{
						this.getPlaceBlock().onBlockPlacedBy(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_2_, p_77648_1_);
						this.getPlaceBlock().onPostBlockPlaced(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, i1);
					}
					
					p_77648_3_.playSoundEffect((double)((float)p_77648_4_ + 0.5F), (double)((float)p_77648_5_ + 0.5F), (double)((float)p_77648_6_ + 0.5F), this.getPlaceBlock().stepSound.func_150496_b(), (this.getPlaceBlock().stepSound.getVolume() + 1.0F) / 2.0F, this.getPlaceBlock().stepSound.getPitch() * 0.8F);
					//--p_77648_1_.stackSize;
					p_77648_1_.damageItem(this.damagePerPlace, p_77648_2_);
				}
			}
			return true;
		}
	}
}
