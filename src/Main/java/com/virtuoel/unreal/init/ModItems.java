package com.virtuoel.unreal.init;

import net.minecraft.init.Items;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemAxeUnreal;
import com.virtuoel.unreal.item.ItemHoeUnreal;
import com.virtuoel.unreal.item.ItemPickaxeUnreal;
import com.virtuoel.unreal.item.ItemShovelUnreal;
import com.virtuoel.unreal.item.ItemSwordUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	//ore materials, metals, gems, alloys
	public static final ItemUnreal ingotTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_TITANIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_TITANIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_TITANIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_MAGNESIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_MAGNESIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_MAGNESIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gemTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GEM_TARYDIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal shardTarydium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.SHARD_TARYDIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal crystalCinnabar = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CRYSTAL_CINNABAR)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustCinnabar = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_CINNABAR)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustAsbestos = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_ASBESTOS)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_IRON)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ingotBedrockium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_BEDROCKIUM)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal nuggetBedrockium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_BEDROCKIUM)
			.setMaxStackSize(64).setCreativeTab(null);

	public static final ItemUnreal ingotTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal nuggetTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal dustTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setCreativeTab(null);

	public static final ItemUnreal ingotTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal nuggetTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal dustTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	//components
	public static final ItemUnreal caseIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CASE_IRON)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal caseTitanium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CASE_TITANIUM)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunBarrelIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_BARREL_IRON)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunBarrelIronLarge = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_BARREL_IRON_LARGE)
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal weaponCasingBasic = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WEAPON_CASING_BASIC)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal weaponCasingAdv = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WEAPON_CASING_ADVANCED)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal tarydPowerBasic = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.TARYDIUM_POWER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainLink = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CHAIN_LINK)
			.setMaxStackSize(32).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ribbonMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.RIBBON_MAGNESIUM)
			.setMaxStackSize(48).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawBlade = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CHAINSAW_BLADE)
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawBladeHardened = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CHAINSAW_BLADE_HARDENED)
			.setMaxStackSize(8).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal chainsawMotor = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.CHAINSAW_MOTOR)
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal SCUBATankEmpty = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.SCUBA_TANK_EMPTY)
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal SCUBATankOxygen = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.SCUBA_TANK_OXYGEN)
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flak = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.FLAK)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flakShellCold = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.FLAK_SHELL_COLD)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal flakShellWarm = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.FLAK_SHELL_WARM)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal translocatorDisc = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.TRANSLOCATOR_DISC)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dispersionUpgrade = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DISPERSION_UPGRADE)
			.setMaxStackSize(4).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadCone = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WARHEAD_CONE)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadBody = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WARHEAD_BODY)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal warheadThruster = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WARHEAD_THRUSTER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal rodTarydiumAlloyUnrefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal rodTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	//tools
	public static final ItemUnreal debugTool = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DEBUG_TOOL)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal bucketMercury = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.BUCKET_MERCURY)
			.setMaxStackSize(1).setContainerItem(Items.bucket)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal voiceBox = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.VOICE_BOX)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal swordTitanium = (ItemUnreal)
			new ItemSwordUnreal(Materials.Tools.TITANIUM).setUnlocalizedName(Names.Items.SWORD_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal pickaxeTitanium = (ItemUnreal)
			new ItemPickaxeUnreal(Materials.Tools.TITANIUM, 1.0F).setUnlocalizedName(Names.Items.PICK_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal shovelTitanium = (ItemUnreal)
			new ItemShovelUnreal(Materials.Tools.TITANIUM, 1.0F).setUnlocalizedName(Names.Items.SHOVEL_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal axeTitanium = (ItemUnreal)
			new ItemAxeUnreal(Materials.Tools.TITANIUM, 1.0F).setUnlocalizedName(Names.Items.AXE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal hoeTitanium = (ItemUnreal)
			new ItemHoeUnreal(Materials.Tools.TITANIUM).setUnlocalizedName(Names.Items.HOE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal swordTarydiumAlloyRefined = (ItemUnreal)
			new ItemSwordUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED).setUnlocalizedName(Names.Items.SWORD_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal pickaxeTarydiumAlloyRefined = (ItemUnreal)
			new ItemPickaxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F).setUnlocalizedName(Names.Items.PICK_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal shovelTarydiumAlloyRefined = (ItemUnreal)
			new ItemShovelUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F).setUnlocalizedName(Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal axeTarydiumAlloyRefined = (ItemUnreal)
			new ItemAxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F).setUnlocalizedName(Names.Items.AXE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal hoeTarydiumAlloyRefined = (ItemUnreal)
			new ItemHoeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED).setUnlocalizedName(Names.Items.HOE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal recordUnreal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.RECORD_UNREAL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//weapons
	public static final ItemUnreal gunTranslocator = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_TRANSLOCATOR)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunDispersionPistol = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_DISPERSION_PISTOL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal meleeChainsaw = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.MELEE_CHAINSAW)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunStinger = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_STINGER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunFlakCannon = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_FLAK)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunEightballLauncher = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_EIGHTBALL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunRedeemer = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.GUN_REDEEMER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//armor
	public static final ItemUnreal armorSCUBAGear = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.SCUBA_GEAR)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorShieldBelt = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.SHIELD_BELT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorToxinSuit = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.TOXIN_SUIT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorAsbestosSuit = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.ASBESTOS_SUIT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal armorJumpBoots = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.JUMP_BOOTS)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//ammo
	public static final ItemUnreal ammoEightball = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.AMMO_EIGHTBALL)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ammoFlakShell = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.AMMO_FLAK_SHELL)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal ammoWarhead = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.AMMO_WARHEAD)
			.setMaxStackSize(16).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//vanilla item dusts
	public static final ItemUnreal dustCoal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_COAL)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustCharcoal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_CHARCOAL)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustIron = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_IRON)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustLapis = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_LAPIS)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustGold = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_GOLD)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustNetherQuartz = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_NETHER_QUARTZ)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustDiamond = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_DIAMOND)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustEmerald = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_EMERALD)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustObsidian = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.DUST_OBSIDIAN)
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
		GameRegistry.registerItem(crystalCinnabar, Names.Items.CRYSTAL_CINNABAR);
		GameRegistry.registerItem(dustCinnabar, Names.Items.DUST_CINNABAR);
		GameRegistry.registerItem(dustAsbestos, Names.Items.DUST_ASBESTOS);
		GameRegistry.registerItem(nuggetIron, Names.Items.NUGGET_IRON);
		GameRegistry.registerItem(ingotBedrockium, Names.Items.INGOT_BEDROCKIUM);
		GameRegistry.registerItem(nuggetBedrockium, Names.Items.NUGGET_BEDROCKIUM);
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
		GameRegistry.registerItem(ribbonMagnesium, Names.Items.RIBBON_MAGNESIUM);
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
		GameRegistry.registerItem(debugTool, Names.Items.DEBUG_TOOL);
		GameRegistry.registerItem(bucketMercury, Names.Items.BUCKET_MERCURY);
		GameRegistry.registerItem(voiceBox, Names.Items.VOICE_BOX);
		GameRegistry.registerItem(swordTitanium, Names.Items.SWORD_TITANIUM);
		GameRegistry.registerItem(pickaxeTitanium, Names.Items.PICK_TITANIUM);
		GameRegistry.registerItem(shovelTitanium, Names.Items.SHOVEL_TITANIUM);
		GameRegistry.registerItem(axeTitanium, Names.Items.AXE_TITANIUM);
		GameRegistry.registerItem(hoeTitanium, Names.Items.HOE_TITANIUM);
		GameRegistry.registerItem(swordTarydiumAlloyRefined, Names.Items.SWORD_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(pickaxeTarydiumAlloyRefined, Names.Items.PICK_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(shovelTarydiumAlloyRefined, Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(axeTarydiumAlloyRefined, Names.Items.AXE_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(hoeTarydiumAlloyRefined, Names.Items.HOE_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(recordUnreal, Names.Items.RECORD_UNREAL);
		
		//weapons
		GameRegistry.registerItem(gunTranslocator, Names.Items.GUN_TRANSLOCATOR);
		GameRegistry.registerItem(gunDispersionPistol, Names.Items.GUN_DISPERSION_PISTOL);
		GameRegistry.registerItem(meleeChainsaw, Names.Items.MELEE_CHAINSAW);
		GameRegistry.registerItem(gunStinger, Names.Items.GUN_STINGER);
		GameRegistry.registerItem(gunFlakCannon, Names.Items.GUN_FLAK);
		GameRegistry.registerItem(gunEightballLauncher, Names.Items.GUN_EIGHTBALL);
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
	
	public static void initTools()
	{
		
	}
	
}
