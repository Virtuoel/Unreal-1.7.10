package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Materials;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCactusTarydium extends BlockUnreal implements IPlantable
{
	@SideOnly(Side.CLIENT)
	private IIcon field_150041_a;
	@SideOnly(Side.CLIENT)
	private IIcon field_150040_b;
	
	public BlockCactusTarydium(Material material)
	{
		super(material);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	{
		if (p_149674_1_.isAirBlock(p_149674_2_, p_149674_3_ + 1, p_149674_4_))
		{
			int l;
			
			for (l = 1; p_149674_1_.getBlock(p_149674_2_, p_149674_3_ - l, p_149674_4_) == this; ++l)
			{
				;
			}
			
			if (l < 3)
			{
				int i1 = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);

				if (i1 == 15)
				{
					p_149674_1_.setBlock(p_149674_2_, p_149674_3_ + 1, p_149674_4_, this);
					p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, 0, 4);
					this.onNeighborBlockChange(p_149674_1_, p_149674_2_, p_149674_3_ + 1, p_149674_4_, this);
				}
				else
				{
					p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, i1 + 1, 4);
				}
			}
		}
	}
	
	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox((double)((float)p_149668_2_ + f), (double)p_149668_3_, (double)((float)p_149668_4_ + f), (double)((float)(p_149668_2_ + 1) - f), (double)((float)(p_149668_3_ + 1) - f), (double)((float)(p_149668_4_ + 1) - f));
	}
	
	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox((double)((float)p_149633_2_ + f), (double)p_149633_3_, (double)((float)p_149633_4_ + f), (double)((float)(p_149633_2_ + 1) - f), (double)(p_149633_3_ + 1), (double)((float)(p_149633_4_ + 1) - f));
	}
	
	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		return p_149691_1_ == 1 ? this.field_150041_a : (p_149691_1_ == 0 ? this.field_150040_b : this.blockIcon);
	}
	
	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType()
	{
		return 13;
	}
	
	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
	{
		return !super.canPlaceBlockAt(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_) ? false : this.canBlockStay(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_);
	}
	
	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor Block
	 */
	@Override
	public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
	{
		if (!this.canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
		{
			p_149695_1_.func_147480_a(p_149695_2_, p_149695_3_, p_149695_4_, true);
		}
	}
	
	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	@Override
	public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
	{
		if (p_149718_1_.getBlock(p_149718_2_ - 1, p_149718_3_, p_149718_4_).getMaterial().isSolid())
		{
			return false;
		}
		else if (p_149718_1_.getBlock(p_149718_2_ + 1, p_149718_3_, p_149718_4_).getMaterial().isSolid())
		{
			return false;
		}
		else if (p_149718_1_.getBlock(p_149718_2_, p_149718_3_, p_149718_4_ - 1).getMaterial().isSolid())
		{
			return false;
		}
		else if (p_149718_1_.getBlock(p_149718_2_, p_149718_3_, p_149718_4_ + 1).getMaterial().isSolid())
		{
			return false;
		}
		else
		{
			Block block = p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_);
			return block.getMaterial()==Materials.Blocks.tarydium;
		}
	}
	
	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
	{
		p_149670_5_.attackEntityFrom(DamageSource.cactus, 4.0F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
		this.blockIcon = p_149651_1_.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_side");
		this.field_150041_a = p_149651_1_.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");
		this.field_150040_b = p_149651_1_.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_bottom");
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	{
		if(world.getBlock(x, y-1, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, (IPlantable) Blocks.cactus))
		{
			return EnumPlantType.Plains;
		}
		return EnumPlantType.Desert;
	}
	
	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z)
	{
		return this;
	}
	
	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
	{
		return -1;
	}
}