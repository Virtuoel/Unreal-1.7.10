package com.virtuoel.unreal.item;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
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
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorAsbestosSuit extends ItemArmorUnrealBase
{

	public ItemArmorAsbestosSuit(ItemArmor.ArmorMaterial par1EnumArmorMaterial, int par2, int par3)
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

	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.uncommon;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return ModItems.bucketMercury == par2ItemStack.getItem() ? true :
		Item.getItemFromBlock(ModBlocks.blockAsbestos) == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(par3ItemStack.getItem()==this&&par3ItemStack.getItemDamage()<par3ItemStack.getMaxDamage())
		{
			PotionEffect potioneffect = new PotionEffect(12, 2, 0, true);
			par2EntityPlayer.addPotionEffect(potioneffect);
			if(par2EntityPlayer.getActivePotionEffect(Potion.fireResistance).getDuration()<4)
			{
				if(par2EntityPlayer.isInsideOfMaterial(Material.lava)||par2EntityPlayer.isInsideOfMaterial(Material.fire)||par2EntityPlayer.isBurning())
				{
					if(itemRand.nextInt(100)==0)
					{
						par3ItemStack.damageItem(1, par2EntityPlayer);
						//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+1);
					}
				}
			}
		}
	}

}

