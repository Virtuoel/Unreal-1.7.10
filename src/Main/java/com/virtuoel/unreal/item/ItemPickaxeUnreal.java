package com.virtuoel.unreal.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemPickaxeUnreal extends ItemToolUnreal
{
	private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});

	public ItemPickaxeUnreal(Item.ToolMaterial toolMaterial, float damageVsEntity)
	{
		super(damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB)
		.setHarvestLevel("pickaxe", toolMaterial.getHarvestLevel());
	}

	@Override
	public boolean func_150897_b(Block block)
	{
		return block == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() >= 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? (block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? (block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (block.getMaterial() == Material.rock ? true : (block.getMaterial() == Material.iron ? true : block.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
	}

	@Override
	public float func_150893_a(ItemStack itemStack, Block block)
	{
		return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock ? super.func_150893_a(itemStack, block) : this.efficiencyOnProperMaterial;
	}

	@Override
	public Set<String> getToolClasses(ItemStack itemStack)
	{
		return ImmutableSet.of("pickaxe");
	}

}
