package com.virtuoel.unreal.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorToxinSuit extends ItemArmorUnrealBase
{

	public ItemArmorToxinSuit(ItemArmor.ArmorMaterial par1EnumArmorMaterial, int par2, int par3)
	{
		super(par1EnumArmorMaterial, par2, par3);
		setNoRepair();
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
	{
		if (armorType == 1)return true;

		return false;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Return an item rarity from EnumRarity
	 */
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.uncommon;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return ModItems.ingotTitanium == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(par3ItemStack.getItem()==this&&par3ItemStack.getItemDamage()<par3ItemStack.getMaxDamage())
		{
			if(par2EntityPlayer.getActivePotionEffect(Potion.poison)!=null)
			{
				par2EntityPlayer.removePotionEffect(19);
				//if(itemRand.nextInt(10)==0)
				//{
					par3ItemStack.damageItem(1, par2EntityPlayer);
					//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+1);
				//}
			}
			if(par2EntityPlayer.getActivePotionEffect(Potion.wither)!=null)
			{
				par2EntityPlayer.removePotionEffect(20);
				par3ItemStack.damageItem(5, par2EntityPlayer);
				//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+5);
			}
			if(par2EntityPlayer.getActivePotionEffect(Potion.hunger)!=null)
			{
				par2EntityPlayer.removePotionEffect(17);
				par3ItemStack.damageItem(2, par2EntityPlayer);
				//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+5);
			}
		}

	}

}

