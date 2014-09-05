package com.virtuoel.unreal.item;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModItems;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
		if(Item.getIdFromItem(stack.getItem())==Item.getIdFromItem(ModItems.weaponCasingBasic)||
				Item.getIdFromItem(stack.getItem())==Item.getIdFromItem(ModItems.weaponCasingAdv))
		{
			return EnumAction.block;
		}
		return EnumAction.none;
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
