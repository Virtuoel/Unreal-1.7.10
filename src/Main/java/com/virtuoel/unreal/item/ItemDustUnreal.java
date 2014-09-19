package com.virtuoel.unreal.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.virtuoel.unreal.init.ModItems;

public class ItemDustUnreal extends ItemUnreal
{
	public ItemDustUnreal()
	{
		super();
	}
	
	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
		if(par3Entity instanceof EntityPlayer){
			if(par1ItemStack.getItem()==ModItems.dustAsbestos)
			{
				if(((EntityPlayer)par3Entity).inventory.armorItemInSlot(2)!=null&&
						((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).getItem()==
								ModItems.armorToxinSuit)
				{
					if(itemRand.nextInt(100)==0)
					{
						((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).damageItem(1, (EntityPlayer)par3Entity);
					}
				}
				else
				{
					if(((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison)==null||
							((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison).getDuration()<4)
					{
						PotionEffect potioneffect = new PotionEffect(19, 59, 0, true);
						((EntityPlayer)par3Entity).addPotionEffect(potioneffect);
					}
				}
			}
		}
	}
}
