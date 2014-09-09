package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;

public class BlockOreUnreal extends BlockUnreal
{

	public BlockOreUnreal(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		if(this==ModBlocks.oreTarydium)
		{
			return ModItems.shardTarydium;
		}
		else if(this==ModBlocks.oreTarydiumNether)
		{
			return ModItems.gemTarydium;
		}
		else if(this==ModBlocks.oreMagnesium)
		{
			return ModItems.dustMagnesium;
		}
		else if(this==ModBlocks.oreAsbestos)
		{
			return ModItems.dustAsbestos;
		}
		return Item.getItemFromBlock(this);

	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random random)
	{
		if(this==ModBlocks.oreTarydium){
			return 4 + random.nextInt(5);
		}else if(this==ModBlocks.oreMagnesium){
			return 1 + random.nextInt(4);
		}
		return 1;
	}

	/**
	 * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
	 */
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
	{
		if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
		{
			int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

			if (j < 0)
			{
				j = 0;
			}

			return this.quantityDropped(p_149679_2_) * (j + 1);
		}
		else
		{
			return this.quantityDropped(p_149679_2_);
		}
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	{
		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
	}

	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
	{
		if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
		{
			int j1 = 0;

			if (this == ModBlocks.oreTarydium)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			}
			else if (this == ModBlocks.oreMagnesium)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 1, 5);
			}
			else if (this == ModBlocks.oreAsbestos)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 1, 5);
			}

			return j1;
		}
		return 0;
	}

	public int damageDropped(int p_149692_1_)
	{
		return 0;
	}

}
