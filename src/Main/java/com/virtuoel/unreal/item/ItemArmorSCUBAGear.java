package com.virtuoel.unreal.item;

import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.utility.LogHelper;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorSCUBAGear extends ItemArmor{

	public ItemArmorSCUBAGear(ItemArmor.ArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
		this.setMaxDamage(240);
		setNoRepair();
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
	{
		if (armorType == 0)return true;
		
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
		return ModItems.SCUBATankOxygen == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack){
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(par3ItemStack.getItem()==this&&par3ItemStack.getItemDamage()<par3ItemStack.getMaxDamage()){
			PotionEffect potioneffect = new PotionEffect(13, 2, 0, true);
			par2EntityPlayer.addPotionEffect(potioneffect);
			if(par2EntityPlayer.getActivePotionEffect(Potion.waterBreathing).getDuration()<4){
				if(par2EntityPlayer.isInsideOfMaterial(Material.water)/*||par2EntityPlayer.isWet()*/){
					if(itemRand.nextInt(100)==0){
						par3ItemStack.damageItem(1, par2EntityPlayer);
						/*if(par2EntityPlayer.inventory.armorInventory[this.armorType].stackSize == 0)
						{
							par2EntityPlayer.inventory.armorInventory[this.armorType] = null;
						}*/
						//par1World.playSoundAtEntity(par2EntityPlayer, "random.breath", 2.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
						par1World.playSoundAtEntity(par2EntityPlayer, "random.drink", 0.5F, 0.0F);
						//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+1);
					}
				}
			}
		}
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}

