package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUnreal extends Item
{
	public ItemUnreal()
	{
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		if(stack.getItem()==ModItems.weaponCasingBasic||
				stack.getItem()==ModItems.weaponCasingAdv)
		{
			return EnumAction.block;
		}
		return EnumAction.none;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
		if(this.getItemUseAction(par1ItemStack) == EnumAction.block)
		{
			return 72000;
		}
		return 0;
    }
	
	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_)
	{
		String info = "";
		if(p_77624_1_.getItem()==ModItems.shardTarydium)
		{
			info = "Stinger Ammo";
		}
		else if(p_77624_1_.getItem()==ModItems.ammoEightball)
		{
			info = "Eightball Launcher Ammo";
		}
		else if(p_77624_1_.getItem()==ModItems.ammoWarhead)
		{
			info = "Redeemer Ammo";
		}
		else if(p_77624_1_.getItem()==ModItems.ammoFlakShell)
		{
			info = "Flak Cannon Ammo";
		}
		else if(p_77624_1_.getItem()==ModItems.dispersionUpgrade)
		{
			info = "Dispersion Pistol Upgrade";
		}
		if(!info.isEmpty())
		{
			p_77624_3_.add(info);
		}
		
	}
	
	/**
     * Return an item rarity from EnumRarity
     */
	@Override
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
		if(this==ModItems.shardTarydium||
				this==ModItems.gemTarydium||
				this==ModItems.weaponCasingBasic||
				this==ModItems.tarydPowerBasic||
				this==ModItems.chainsawBlade)
		{
			return EnumRarity.uncommon;
		}
		else if(this==ModItems.weaponCasingAdv||
				this==ModItems.chainsawBladeHardened||
				this==ModItems.dispersionUpgrade||
				this==ModItems.warheadBody||
				this==ModItems.warheadCone||
				this==ModItems.warheadThruster)
		{
			return EnumRarity.rare;
		}
		else if(this==ModItems.ammoWarhead||
				this==ModItems.chainsawMotor||
				this==ModItems.translocatorDisc)
		{
			return EnumRarity.epic;
		}
        return p_77613_1_.isItemEnchanted() ? EnumRarity.rare : EnumRarity.common;
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
