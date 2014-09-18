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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWeaponBase extends ItemUnreal
{
	
	private Item ammo;
	private boolean consumeMode;
	private int meleeDamageAmount = 0;
	
	public ItemWeaponBase(Item weaponAmmo, int damage)
	{
		super();
		this.ammo = weaponAmmo;
		this.setMaxDamage(damage);
		this.setNoRepair().setFull3D()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
    @Override
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
    {
    	super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    	if(p_77663_1_.getItemDamage()>p_77663_1_.getMaxDamage()){
    		p_77663_1_.setItemDamage(p_77663_1_.getMaxDamage());
		}
	}
    
    @Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.meleeDamageAmount, 0));
        return multimap;
    }
    
	@SideOnly(Side.CLIENT)
    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }
	
	@SideOnly(Side.CLIENT)
	@Override
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
		par3List.add("Ammo: " + (par1ItemStack.getMaxDamage()-par1ItemStack.getItemDamage()) + "/" + (par1ItemStack.getMaxDamage()-1));
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
    }
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
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
