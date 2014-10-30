package com.virtuoel.unreal.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.virtuoel.unreal.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorJumpBoots extends ItemArmorUnrealBase
{

	public ItemArmorJumpBoots(ItemArmor.ArmorMaterial par1EnumArmorMaterial, int par2, int par3)
	{
		super(par1EnumArmorMaterial, par2, par3);
		setNoRepair();
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
	{
		if (armorType == 3)return true;

		return false;
	}

	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.rare;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return ModItems.ingotTitanium == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(!par2EntityPlayer.isSneaking())
		{
			if(par3ItemStack.getItem()==this)
			{
				PotionEffect potioneffect = new PotionEffect(8, 2, 3, true);
				par2EntityPlayer.addPotionEffect(potioneffect);
				par2EntityPlayer.fallDistance = 0.0F;
			}
		}
	}

}

