package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
import com.virtuoel.unreal.reference.DamageSources;
import com.virtuoel.unreal.utility.NBTHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWeaponBase extends ItemUnreal
{
	
	private ItemStack ammo;
	private int meleeDamageAmount = 0;
	
	public ItemWeaponBase(ItemStack weaponAmmo, int damage)
	{
		super();
		setAmmoItem(weaponAmmo)
		.setMaxDamage(damage)
		.setNoRepair().setFull3D()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
    public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_)
	{
		setNBTDefaults(p_77622_1_, 5);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par3EntityPlayer.isSneaking())
		{
			toggleConsume(par1ItemStack);
			
		}
		else
		{
			
			par3EntityPlayer.attackEntityFrom(DamageSources.damageSourceTranslocator, 2);
		}
		return par1ItemStack;
	}
	
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		if(!p_77663_1_.hasTagCompound())
		{
			setNBTDefaults(p_77663_1_, 5);
		}
		if(p_77663_1_.getItemDamage()>p_77663_1_.getMaxDamage())
		{
			p_77663_1_.setItemDamage(p_77663_1_.getMaxDamage());
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(NBTHelper.getInt(par1ItemStack, "ammoMax")!=0)
		{
			par3List.add("Ammo: " + (NBTHelper.getInt(par1ItemStack, "ammoAmount")) + "/" + (NBTHelper.getInt(par1ItemStack, "ammoMax")));
		}
	}
	
	@Override
	/**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        return true;
    }
	
	private void setNBTDefaults(ItemStack par1ItemStack, int ammoDefault)
	{
		NBTHelper.setBoolean(par1ItemStack, "consumeMode", false);
		NBTHelper.setInteger(par1ItemStack, "ammoAmount", ammoDefault);
		NBTHelper.setInteger(par1ItemStack, "ammoMax", 100);
		NBTHelper.setInteger(par1ItemStack, "attackDelay", 40);
		NBTHelper.setInteger(par1ItemStack, "attackingTime", 0);
		NBTHelper.setBoolean(par1ItemStack, "atacking", false);
	}
	
	private void toggleConsume(ItemStack par1ItemStack)
	{
		NBTHelper.setBoolean(par1ItemStack, "consumeMode", !NBTHelper.getBoolean(par1ItemStack, "consumeMode"));
		//consumeMode = !consumeMode;
	}
	
	private Item setAmmoItem(ItemStack ammoStack)
	{
		ammo=ItemStack.copyItemStack(ammoStack);
		//ItemStack.loadItemStackFromNBT(p_77949_0_);
		return this;
	}
	/*
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.meleeDamageAmount, 1));
		return multimap;
	}
	*/
	
	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * Return an item rarity from EnumRarity
	 */
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.rare;
	}
	
	@Override
	/**
	 * Metadata-sensitive version of getStrVsBlock
	 * @param itemstack The Item Stack
	 * @param block The block the item is trying to break
	 * @param metadata The items current metadata
	 * @return The damage strength
	 */
	public float getDigSpeed(ItemStack itemstack, Block block, int metadata)
	{
		return func_150893_a(itemstack, block);
	}
	
	@Override
	public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
	{
		return -1.0F;
	}
	
	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1item, 1, 1));
		par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 0;
	}
	
}
