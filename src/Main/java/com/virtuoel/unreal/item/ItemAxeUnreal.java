package com.virtuoel.unreal.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemAxeUnreal extends ItemToolUnreal
{
	private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});    

	public ItemAxeUnreal(Item.ToolMaterial toolMaterial, float damageVsEntity)
	{
		super(damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	@Override
	public float func_150893_a(ItemStack itemStack, Block block)
	{
		return block.getMaterial() != net.minecraft.block.material.Material.wood && block.getMaterial() != net.minecraft.block.material.Material.plants && block.getMaterial() != net.minecraft.block.material.Material.vine ? super.func_150893_a(itemStack, block) : this.efficiencyOnProperMaterial;
	}

	@Override
	public Set<String> getToolClasses(ItemStack itemStack)
	{
		return ImmutableSet.of("axe");
	}

}
