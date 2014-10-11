package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.entity.EntityProjectileUnreal;
import com.virtuoel.unreal.reference.DamageSources;
import com.virtuoel.unreal.utility.NBTHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWeaponTranslocator extends ItemWeaponBase
{

	private ItemStack ammo;
	private int meleeDamageAmount = 0;

	public ItemWeaponTranslocator(ItemStack weaponAmmo, int damage)
	{
		super(weaponAmmo, damage);
	}

	@Override
	public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_)
	{
		setNBTDefaults(p_77622_1_, 5);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		//for Translocator entity teleport
		if(par2World.getLoadedEntityList().size()>0)
		{
			for(Object i : par2World.getLoadedEntityList())
			{
				if(i != null && i instanceof Entity)
				{
					if(((Entity) i).getPersistentID().getLeastSignificantBits() == NBTHelper.getLong(par1ItemStack, "discUUIDLeast") && 
							((Entity) i).getPersistentID().getMostSignificantBits() == NBTHelper.getLong(par1ItemStack, "discUUIDMost"))
					{
						//((EntityTranslocatorDisc) i).doTeleport(par3EntityPlayer);
					}
				}
			}
		}
		return par1ItemStack;
	}

	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
	}

	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(NBTHelper.getInt(par1ItemStack, "discUUIDLeast")!=0&&NBTHelper.getInt(par1ItemStack, "discUUIDMost")!=0)
		{
			double newX = getDisc(par1ItemStack, par2EntityPlayer.worldObj).posX;
        	double newZ = getDisc(par1ItemStack, par2EntityPlayer.worldObj).posZ;

        	newX = newX<0 ? (int)newX-.5 : (int)newX+.5;
        	
        	newZ = newZ<0 ? (int)newZ-.5 : (int)newZ+.5;
        	
        	if(getDiscDimension(par1ItemStack, par2EntityPlayer.worldObj)==par2EntityPlayer.dimension && getDisc(par1ItemStack, par2EntityPlayer.worldObj).posY<256+32){
        		par3List.add("Active");
        		par3List.add("X: " + newX);
        		par3List.add("Y: " + getDisc(par1ItemStack, par2EntityPlayer.worldObj).posY);
        		par3List.add("Z: " + newZ);
			}else{
				par3List.add("Out of Range");
				par3List.add("X: -");
	        	par3List.add("Y: -");
	        	par3List.add("Z: -");
			}
        	
		}else{
    		par3List.add("Inactive");
			par3List.add("X: -");
        	par3List.add("Y: -");
        	par3List.add("Z: -");
		}
	}

	private void setNBTDefaults(ItemStack par1ItemStack, int ammoDefault)
	{
		NBTHelper.setBoolean(par1ItemStack, "consumeMode", false);
		NBTHelper.setInteger(par1ItemStack, "ammoAmount", ammoDefault);
		NBTHelper.setInteger(par1ItemStack, "ammoMax", 100);
		NBTHelper.setInteger(par1ItemStack, "attackDelay", 40);
		NBTHelper.setInteger(par1ItemStack, "attackingTime", 0);
		NBTHelper.setLong(par1ItemStack, "discUUIDLeast", 0);
		NBTHelper.setLong(par1ItemStack, "discUUIDMost", 0);
		NBTHelper.setInteger(par1ItemStack, "discDimension", Integer.MAX_VALUE);
		NBTHelper.setBoolean(par1ItemStack, "atacking", false);
	}
	
	private int getDiscDimension(ItemStack par1ItemStack, World par2World)
	{
		EntityProjectileUnreal disc = getDisc(par1ItemStack, par2World);
		if(disc!=null)
		{
			return disc.dimension;
		}
		return Integer.MAX_VALUE;
	}
	
	private EntityProjectileUnreal getDisc(ItemStack par1ItemStack, World par2World)
	{
		for (int i = 0; i < par2World.getLoadedEntityList().size();i++)
		{
			if(((Entity)par2World.getLoadedEntityList().get(i)).getPersistentID().getLeastSignificantBits() == NBTHelper.getLong(par1ItemStack, "discUUIDLeast") && 
					((Entity)par2World.getLoadedEntityList().get(i)).getPersistentID().getMostSignificantBits() == NBTHelper.getLong(par1ItemStack, "discUUIDMost"))
			{

			}
		}
		return null;
		
	}

	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * Return an item rarity from EnumRarity
	 */
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.epic;
	}

	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1item, 1, 1));
		par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
	}

}
