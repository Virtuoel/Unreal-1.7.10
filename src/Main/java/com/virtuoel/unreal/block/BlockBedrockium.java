package com.virtuoel.unreal.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraftforge.common.util.ForgeDirection;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.init.ModItems;

public class BlockBedrockium extends BlockUnreal
{

	public BlockBedrockium(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
	{
		if (entity instanceof EntityWither)
		{
			return false;
		}
		else if (entity instanceof EntityDragon)
		{
			return false; 
		}
		
		return true;
	}
	
	@Override
	public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side)
	{
		if ((world.provider instanceof WorldProviderEnd) && 
				/*(this == ModBlocks.oreBedrockiumHidden ||
   			 	 this == ModBlocks.oreBedrockium ||
    			 this == ModBlocks.blockBedrockium)
    			 &&*/ side == ForgeDirection.UP)
		{
			return true;
		}
		return false;
	}
	
	@Override
	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (this == ModBlocks.oreBedrockiumHidden && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == ModItems.bucketMercury)
		{
			if (!par5EntityPlayer.capabilities.isCreativeMode)
			{
				if(--par5EntityPlayer.getCurrentEquippedItem().stackSize>0)
				{
					par5EntityPlayer.setCurrentItemOrArmor(0, new ItemStack(Items.bucket,1,0));
				}
				else if (!par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.bucket,1,0)))
				{
					par5EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(Items.bucket, 0), true);
				}
			}
			
			par1World.playSoundEffect((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "random.fizz", 1.0F, par1World.rand.nextFloat() * 0.1F + 0.9F);
			if(par1World.rand.nextInt(4)==0)par1World.setBlock(par2, par3, par4, ModBlocks.oreBedrockium, 0, 3);
			return true;
		}
		else
		{
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z) == ModBlocks.oreBedrockiumHidden)
		{
			return new ItemStack(Blocks.bedrock, 1, 0);
		}
		
		return super.getPickBlock(target, world, x, y, z);
	}
	
	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z)
	{
		return false;
	}
	
}
