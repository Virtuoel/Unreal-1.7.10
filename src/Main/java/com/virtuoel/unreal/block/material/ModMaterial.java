package com.virtuoel.unreal.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModMaterial extends Material
{
	
	public ModMaterial(MapColor p_i2116_1_) {
		super(p_i2116_1_);
	}
	
	private boolean canBurn;
    private boolean replaceable;
    private boolean isTranslucent;
    private boolean requiresNoTool = true;
    private int mobilityFlag;
    private boolean isAdventureModeExempt;
    private static final String __OBFID = "CL_00000542";
    
    @Override
    public boolean isLiquid()
    {
        return false;
    }
    
    @Override
    public boolean isSolid()
    {
        return true;
    }
    
    @Override
    public boolean getCanBlockGrass()
    {
        return true;
    }
    
    @Override
    public boolean blocksMovement()
    {
        return true;
    }
    
    public ModMaterial setTranslucent()
    {
        this.isTranslucent = true;
        return this;
    }
    
    public ModMaterial setRequiresTool()
    {
        this.requiresNoTool = false;
        return this;
    }
    
    public ModMaterial setBurning()
    {
        this.canBurn = true;
        return this;
    }
    
    @Override
    public boolean getCanBurn()
    {
        return this.canBurn;
    }
    
    public ModMaterial setReplaceable()
    {
        this.replaceable = true;
        return this;
    }
    
    @Override
    public boolean isReplaceable()
    {
        return this.replaceable;
    }
    
    @Override
    public boolean isOpaque()
    {
        return this.isTranslucent ? false : this.blocksMovement();
    }
    
    @Override
    public boolean isToolNotRequired()
    {
        return this.requiresNoTool;
    }
    
    @Override
    public int getMaterialMobility()
    {
        return this.mobilityFlag;
    }
    
    public ModMaterial setNoPushMobility()
    {
        this.mobilityFlag = 1;
        return this;
    }
    
    public ModMaterial setImmovableMobility()
    {
        this.mobilityFlag = 2;
        return this;
    }
    
    public ModMaterial setAdventureModeExempt()
    {
        this.isAdventureModeExempt = true;
        return this;
    }
    
    @Override
    public boolean isAdventureModeExempt()
    {
        return this.isAdventureModeExempt;
    }
	
}
