package com.virtuoel.unreal.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityProjectileUnreal extends EntityThrowable
{
	
	
	public EntityProjectileUnreal(World p_i1776_1_) {
		super(p_i1776_1_);
		// TODO Auto-generated constructor stub
	}

	
	public EntityProjectileUnreal(World p_i1778_1_, double p_i1778_2_,	double p_i1778_4_, double p_i1778_6_)
	{
		super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
		// TODO Auto-generated constructor stub
	}
	
	public EntityProjectileUnreal(World p_i1777_1_, EntityLivingBase p_i1777_2_) {
		super(p_i1777_1_, p_i1777_2_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.0F;
	}

	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_)
	{
		// TODO Auto-generated method stub
		
	}
	
}
