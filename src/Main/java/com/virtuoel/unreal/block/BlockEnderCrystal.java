package com.virtuoel.unreal.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.ModBlocks;

public class BlockEnderCrystal extends BlockUnrealMultiTexture
{

	public BlockEnderCrystal(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par1World.isRemote)
		{
			return true;
		}
		else
		{
			List list = par1World.getEntitiesWithinAABB(EntityEnderCrystal.class, AxisAlignedBB.getBoundingBox((double)par2 + this.minX, (double)par3-2 + this.minY, (double)par4 + this.minZ, (double)par2 + this.maxX, (double)par3 + this.maxY, (double)par4 + this.maxZ));
			boolean flag1 = list.isEmpty();
			if ((par1World.getBlock(par2, par3-2, par4) == ModBlocks.oreBedrockiumHidden ||
					par1World.getBlock(par2, par3-2, par4) == ModBlocks.oreBedrockium ||
					par1World.getBlock(par2, par3-2, par4) == ModBlocks.blockBedrockium ||
					par1World.getBlock(par2, par3-2, par4) == Blocks.bedrock) &&
					(par1World.getBlock(par2, par3-1, par4) == Blocks.air ||
					par1World.getBlock(par2, par3-1, par4) == Blocks.fire) &&
					flag1)
			{
				par1World.setBlock(par2, par3, par4, Blocks.air, 0, 3);
				par1World.playSoundEffect((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "mob.ghast.fireball", 1.0F, par1World.rand.nextFloat() * 0.1F + 0.9F);
				par1World.setBlock(par2, par3-1, par4, Blocks.fire, 0, 3);
				EntityEnderCrystal entityendercrystal = new EntityEnderCrystal(par1World);
				entityendercrystal.setLocationAndAngles((double)((float)par2 + 0.5F), (double)(par3 - 2), (double)((float)par4 + 0.5F), par1World.rand.nextFloat() * 360.0F, 0.0F);
				par1World.spawnEntityInWorld(entityendercrystal);
				return true;
			}
			else
			{
				return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
			}
		}
	}
	
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityWither)
        {
            return true;
        }
        else if (entity instanceof EntityDragon)
        {
        	return false;
        }
        
        return true;
    }
	
}
