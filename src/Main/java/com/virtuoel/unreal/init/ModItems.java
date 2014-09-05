package com.virtuoel.unreal.init;

import net.minecraft.init.Items;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	//ore materials, metals, gems, alloys
	public static final ItemUnreal ingotTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotTitanium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetTitanium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustTitanium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotRutile")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetRutile")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustRutile")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotMagnesium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetMagnesium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustMagnesium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gemTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gemTarydium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal shardTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("shardTarydium")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gemCinnabar = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gemCinnabar")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustCinnabar = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustCinnabar")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustAsbestos = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustAsbestos")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetIron")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotTarydiumAlloyUnrefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetTarydiumAlloyUnrefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustTarydiumAlloyUnrefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("ingotTarydiumAlloyRefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("nuggetTarydiumAlloyRefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustTarydiumAlloyRefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//components
	public static final ItemUnreal caseIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("caseIron")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal caseTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("caseTitanium")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunBarrelIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gunBarrelIron")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunBarrelIronLarge = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("gunBarrelIronLarge")
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal weaponCasingBasic = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("weaponCaseBasic2")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal weaponCasingAdv = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("weaponCaseBasic1")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal tarydPowerBasic = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("powerCrystal8")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainLink = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("chainPart")
			.setMaxStackSize(32).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawBlade = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("chainsawBlade")
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawBladeHardened = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("chainsawBladeHardened")
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawMotor = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("chainsawMotor")
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal SCUBATankEmpty = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("SCUBATankEmpty")
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal SCUBATankOxygen = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("SCUBATankFilled")
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flak = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("flak")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flakShellCold = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("flakShellCold")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flakShellWarm = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("flakShellWarm")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal translocatorDisc = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("translocatorDisc")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dispersionUpgrade = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dispersionUpgrade")
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadCone = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("warheadCone")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadBody = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("warheadBody")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadThruster = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("warheadThruster")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal rodTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("rodTarydiumAlloyRefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal rodTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("rodTarydiumAlloyRefined")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//tools
	public static final ItemUnreal bucketMercury = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("bucketMercury")
			.setMaxStackSize(1).setContainerItem(Items.bucket)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal swordTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("axeTitanium")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal pickaxeTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("pickaxeTitanium")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal axeTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("axeTitanium")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal shovelTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("shovelTitanium")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal hoeTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("hoeTitanium")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal swordTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("axeTarydiumAlloyRefined")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal pickaxeTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("pickaxeTarydiumAlloyRefined")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal axeTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("axeTarydiumAlloyRefined")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal shovelTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("shovelTarydiumAlloyRefined")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal hoeTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("hoeTarydiumAlloyRefined")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//weapons
	public static final ItemUnreal gunTranslocator = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("translocator")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunDispersionPistol = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dispersionPistol")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal meleeChainsaw = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("chainsaw")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunStinger = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("stinger")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunFlak = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("flakCannon")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunEightball = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("eightballLauncher")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunRedeemer = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("redeemer")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//armor
	public static final ItemUnreal armorSCUBAGear = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("SCUBAGear")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorShieldBelt = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("shieldBelt")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorToxinSuit = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("toxinSuit")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorAsbestosSuit = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("asbestosSuit")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorJumpBoots = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("jumpBoots")
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//ammo
	public static final ItemUnreal ammoEightball = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("eightball")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ammoFlakShell = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("flakShell")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ammoWarhead = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("redeemerMissile")
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//vanilla item dusts
	public static final ItemUnreal dustCoal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustCoal")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustCharcoal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustCharcoal")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustIron")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustLapis = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustLapis")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustGold = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustIron")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustNetherQuartz = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustNetherQuartz")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustDiamond = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustDiamond")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustEmerald = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustEmerald")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustObsidian = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName("dustObsidian")
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static void init()
	{
		//ore materials, metals, gems, alloys
		GameRegistry.registerItem(ingotTitanium, Names.Items.INGOT_TITANIUM);
		GameRegistry.registerItem(nuggetTitanium, Names.Items.NUGGET_TITANIUM);
		GameRegistry.registerItem(dustTitanium, Names.Items.DUST_TITANIUM);
		GameRegistry.registerItem(ingotRutile, Names.Items.INGOT_RUTILE);
		GameRegistry.registerItem(nuggetRutile, Names.Items.NUGGET_RUTILE);
		GameRegistry.registerItem(dustRutile, Names.Items.DUST_RUTILE);
		GameRegistry.registerItem(ingotMagnesium, Names.Items.INGOT_MAGNESIUM);
		GameRegistry.registerItem(nuggetMagnesium, Names.Items.NUGGET_MAGNESIUM);
		GameRegistry.registerItem(dustMagnesium, Names.Items.DUST_MAGNESIUM);
		GameRegistry.registerItem(gemTarydium, Names.Items.GEM_TARYDIUM);
		GameRegistry.registerItem(shardTarydium, Names.Items.SHARD_TARYDIUM);
		GameRegistry.registerItem(gemCinnabar, Names.Items.GEM_CINNABAR);
		GameRegistry.registerItem(dustCinnabar, Names.Items.DUST_CINNABAR);
		GameRegistry.registerItem(dustAsbestos, Names.Items.DUST_ASBESTOS);
		GameRegistry.registerItem(nuggetIron, Names.Items.NUGGET_IRON);
		GameRegistry.registerItem(ingotTarydiumAlloyUnrefined, Names.Items.INGOT_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(nuggetTarydiumAlloyUnrefined, Names.Items.NUGGET_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(dustTarydiumAlloyUnrefined, Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(ingotTarydiumAlloyRefined, Names.Items.INGOT_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(nuggetTarydiumAlloyRefined, Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(dustTarydiumAlloyRefined, Names.Items.DUST_TARYDIUM_ALLOY_REFINED);
		
		//components
		GameRegistry.registerItem(caseIron, Names.Items.CASE_IRON);
		GameRegistry.registerItem(caseTitanium, Names.Items.CASE_TITANIUM);
		GameRegistry.registerItem(gunBarrelIron, Names.Items.GUN_BARREL_IRON);
		GameRegistry.registerItem(gunBarrelIronLarge, Names.Items.GUN_BARREL_IRON_LARGE);
		GameRegistry.registerItem(weaponCasingBasic, Names.Items.WEAPON_CASING_BASIC);
		GameRegistry.registerItem(weaponCasingAdv, Names.Items.WEAPON_CASING_ADVANCED);
		GameRegistry.registerItem(tarydPowerBasic, Names.Items.TARYDIUM_POWER);
		GameRegistry.registerItem(chainLink, Names.Items.CHAIN_LINK);
		GameRegistry.registerItem(chainsawBlade, Names.Items.CHAINSAW_BLADE);
		GameRegistry.registerItem(chainsawBladeHardened, Names.Items.CHAINSAW_BLADE_HARDENED);
		GameRegistry.registerItem(chainsawMotor, Names.Items.CHAINSAW_MOTOR);
		GameRegistry.registerItem(SCUBATankEmpty, Names.Items.SCUBA_TANK_EMPTY);
		GameRegistry.registerItem(SCUBATankOxygen, Names.Items.SCUBA_TANK_OXYGEN);
		GameRegistry.registerItem(flak, Names.Items.FLAK);
		GameRegistry.registerItem(flakShellCold, Names.Items.FLAK_SHELL_COLD);
		GameRegistry.registerItem(flakShellWarm, Names.Items.FLAK_SHELL_WARM);
		GameRegistry.registerItem(translocatorDisc, Names.Items.TRANSLOCATOR_DISC);
		GameRegistry.registerItem(dispersionUpgrade, Names.Items.DISPERSION_UPGRADE);
		GameRegistry.registerItem(warheadCone, Names.Items.WARHEAD_CONE);
		GameRegistry.registerItem(warheadBody, Names.Items.WARHEAD_BODY);
		GameRegistry.registerItem(warheadThruster, Names.Items.WARHEAD_THRUSTER);
		GameRegistry.registerItem(rodTarydiumAlloyUnrefined, Names.Items.ROD_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(rodTarydiumAlloyRefined, Names.Items.ROD_TARYDIUM_ALLOY_REFINED);
		
		//tools
		GameRegistry.registerItem(bucketMercury, Names.Items.BUCKET_MERCURY);
		GameRegistry.registerItem(swordTitanium, Names.Items.SWORD_TITANIUM);
		GameRegistry.registerItem(pickaxeTitanium, Names.Items.PICK_TITANIUM);
		GameRegistry.registerItem(axeTitanium, Names.Items.AXE_TITANIUM);
		GameRegistry.registerItem(shovelTitanium, Names.Items.SHOVEL_TITANIUM);
		GameRegistry.registerItem(hoeTitanium, Names.Items.HOE_TITANIUM);
		GameRegistry.registerItem(swordTarydiumAlloyRefined, Names.Items.SWORD_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(pickaxeTarydiumAlloyRefined, Names.Items.PICK_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(axeTarydiumAlloyRefined, Names.Items.AXE_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(shovelTarydiumAlloyRefined, Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(hoeTarydiumAlloyRefined, Names.Items.HOE_TARYDIUM_ALLOY_REFINED);
		
		//weapons
		GameRegistry.registerItem(gunTranslocator, Names.Items.GUN_TRANSLOCATOR);
		GameRegistry.registerItem(gunDispersionPistol, Names.Items.GUN_DISPERSION_PISTOL);
		GameRegistry.registerItem(meleeChainsaw, Names.Items.MELEE_CHAINSAW);
		GameRegistry.registerItem(gunStinger, Names.Items.GUN_STINGER);
		GameRegistry.registerItem(gunFlak, Names.Items.GUN_FLAK);
		GameRegistry.registerItem(gunEightball, Names.Items.GUN_EIGHTBALL);
		GameRegistry.registerItem(gunRedeemer, Names.Items.GUN_REDEEMER);
		
		//armor
		GameRegistry.registerItem(armorSCUBAGear, Names.Items.SCUBA_GEAR);
		GameRegistry.registerItem(armorShieldBelt, Names.Items.SHIELD_BELT);
		GameRegistry.registerItem(armorToxinSuit, Names.Items.TOXIN_SUIT);
		GameRegistry.registerItem(armorAsbestosSuit, Names.Items.ASBESTOS_SUIT);
		GameRegistry.registerItem(armorJumpBoots, Names.Items.JUMP_BOOTS);
		
		//ammo
		GameRegistry.registerItem(ammoEightball, Names.Items.AMMO_EIGHTBALL);
		GameRegistry.registerItem(ammoFlakShell, Names.Items.AMMO_FLAK_SHELL);
		GameRegistry.registerItem(ammoWarhead, Names.Items.AMMO_WARHEAD);
		
		//vanilla item dusts
		GameRegistry.registerItem(dustCoal, Names.Items.DUST_COAL);
		GameRegistry.registerItem(dustCharcoal, Names.Items.DUST_CHARCOAL);
		GameRegistry.registerItem(dustIron, Names.Items.DUST_IRON);
		GameRegistry.registerItem(dustLapis, Names.Items.DUST_LAPIS);
		GameRegistry.registerItem(dustGold, Names.Items.DUST_GOLD);
		GameRegistry.registerItem(dustNetherQuartz, Names.Items.DUST_NETHER_QUARTZ);
		GameRegistry.registerItem(dustDiamond, Names.Items.DUST_DIAMOND);
		GameRegistry.registerItem(dustEmerald, Names.Items.DUST_EMERALD);
		GameRegistry.registerItem(dustObsidian, Names.Items.DUST_OBSIDIAN);
		
	}
}
