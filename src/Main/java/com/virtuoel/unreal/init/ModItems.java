package com.virtuoel.unreal.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemArmorAsbestosSuit;
import com.virtuoel.unreal.item.ItemArmorJumpBoots;
import com.virtuoel.unreal.item.ItemArmorSCUBAGear;
import com.virtuoel.unreal.item.ItemArmorShieldBelt;
import com.virtuoel.unreal.item.ItemArmorSlime;
import com.virtuoel.unreal.item.ItemArmorToxinSuit;
import com.virtuoel.unreal.item.ItemArmorUnrealBase;
import com.virtuoel.unreal.item.ItemAxeUnreal;
import com.virtuoel.unreal.item.ItemBlockPlacerDamageable;
import com.virtuoel.unreal.item.ItemBucketUnreal;
import com.virtuoel.unreal.item.ItemDustUnreal;
import com.virtuoel.unreal.item.ItemHoeUnreal;
import com.virtuoel.unreal.item.ItemPickaxeUnreal;
import com.virtuoel.unreal.item.ItemRecordUnreal;
import com.virtuoel.unreal.item.ItemShovelUnreal;
import com.virtuoel.unreal.item.ItemSwordUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.item.ItemUnrealDamageable;
import com.virtuoel.unreal.item.ItemVoiceBox;
import com.virtuoel.unreal.item.ItemWeaponBase;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	//ore materials, metals, gems, alloys
	public static Item ingotTitanium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_TITANIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item nuggetTitanium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_TITANIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustTitanium = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_TITANIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static Item ingotRutile = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_RUTILE)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item nuggetRutile = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_RUTILE)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustRutile = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_RUTILE)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static Item ingotMagnesium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_MAGNESIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item nuggetMagnesium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_MAGNESIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustMagnesium = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_MAGNESIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gemTarydium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.GEM_TARYDIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item shardTarydium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.SHARD_TARYDIUM)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item crystalCinnabar = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CRYSTAL_CINNABAR)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustCinnabar = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_CINNABAR)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustAsbestos = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_ASBESTOS)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item nuggetIron = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_IRON)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item ingotBedrockium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_BEDROCKIUM)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	public static Item nuggetBedrockium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_BEDROCKIUM)
			.setMaxStackSize(64)
			.setCreativeTab(null);

	public static Item ingotTarydiumAlloyUnrefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	public static Item nuggetTarydiumAlloyUnrefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	public static Item dustTarydiumAlloyUnrefined = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);

	public static Item ingotTarydiumAlloyRefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	public static Item nuggetTarydiumAlloyRefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	public static Item dustTarydiumAlloyRefined = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64)
			.setCreativeTab(null);
	
	//components
	public static Item caseIron = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CASE_IRON)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item caseTitanium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CASE_TITANIUM)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunBarrelIron = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.GUN_BARREL_IRON)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunBarrelIronLarge = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.GUN_BARREL_IRON_LARGE)
			.setMaxStackSize(8)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item weaponCasingBasic = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.WEAPON_CASING_BASIC)
			.setMaxStackSize(16).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item weaponCasingAdv = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.WEAPON_CASING_ADVANCED)
			.setMaxStackSize(16).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item tarydPowerBasic = 
			new ItemUnrealDamageable().setDamageOnCraft(1)
			.setUnlocalizedName(Names.Items.TARYDIUM_POWER)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item chainLink = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CHAIN_LINK)
			.setMaxStackSize(32)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item ribbonMagnesium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.RIBBON_MAGNESIUM)
			.setMaxStackSize(48)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item chainsawBlade = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CHAINSAW_BLADE)
			.setMaxStackSize(8).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item chainsawBladeHardened = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CHAINSAW_BLADE_HARDENED)
			.setMaxStackSize(8).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item chainsawMotor = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.CHAINSAW_MOTOR)
			.setMaxStackSize(4)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item SCUBATankEmpty = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.SCUBA_TANK_EMPTY)
			.setMaxStackSize(4)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item SCUBATankOxygen = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.SCUBA_TANK_OXYGEN)
			.setMaxStackSize(4)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item flak = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.FLAK)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item flakShellCold = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.FLAK_SHELL_COLD)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item flakShellWarm = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.FLAK_SHELL_WARM)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item translocatorDisc = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.TRANSLOCATOR_DISC)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dispersionUpgrade = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.DISPERSION_UPGRADE)
			.setMaxStackSize(4)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item warheadCone = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.WARHEAD_CONE)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item warheadBody = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.WARHEAD_BODY)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item warheadThruster = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.WARHEAD_THRUSTER)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item rodTarydiumAlloyUnrefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setFull3D()
			.setCreativeTab(null);
	
	public static Item rodTarydiumAlloyRefined = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setFull3D()
			.setCreativeTab(null);
	
	public static Item rodIron = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.ROD_IRON)
			.setMaxStackSize(64).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item rodTitanium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.ROD_TITANIUM)
			.setMaxStackSize(64).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item lensTarydium = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.LENS_TARYDIUM)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//fluid containers
	public static Item bucketMercury;
	public static Item bucketTarydiumSludge;
	public static Item bucketHealth;
	public static Item bucketNanoblack;
	
	//tools
	public static Item debugTool = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.DEBUG_TOOL)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item forceField = 
			new ItemBlockPlacerDamageable()
			.setDamagePerPlace(100)
			.setPlaceBlock(ModBlocks.blockForceField).setPlaceMeta(0)
			.setMaxDamage((1*100)+1)
			.setUnlocalizedName(Names.Items.FORCE_FIELD)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item voiceBox = 
			new ItemVoiceBox()
			.setUnlocalizedName(Names.Items.VOICE_BOX)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item universalTranslator = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.UNIVERSAL_TRANSLATOR)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item recordLongFlight = 
			new ItemRecordUnreal(Names.Items.RECORD_LONG_FLIGHT_MUSIC)
			.setUnlocalizedName(Names.Items.RECORD_LONG_FLIGHT)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item swordTitanium = 
			new ItemSwordUnreal(Materials.Tools.TITANIUM)
			.setUnlocalizedName(Names.Items.SWORD_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item pickaxeTitanium = 
			new ItemPickaxeUnreal(Materials.Tools.TITANIUM, 2.0F)
			.setUnlocalizedName(Names.Items.PICK_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item shovelTitanium = 
			new ItemShovelUnreal(Materials.Tools.TITANIUM, 1.0F)
			.setUnlocalizedName(Names.Items.SHOVEL_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item axeTitanium = 
			new ItemAxeUnreal(Materials.Tools.TITANIUM, 3.0F)
			.setUnlocalizedName(Names.Items.AXE_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item hoeTitanium = 
			new ItemHoeUnreal(Materials.Tools.TITANIUM)
			.setUnlocalizedName(Names.Items.HOE_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item swordTarydiumAlloyRefined = 
			new ItemSwordUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED)
			.setUnlocalizedName(Names.Items.SWORD_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1)
			.setCreativeTab(null);
	
	public static Item pickaxeTarydiumAlloyRefined = 
			new ItemPickaxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 2.0F)
			.setUnlocalizedName(Names.Items.PICK_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1)
			.setCreativeTab(null);
	
	public static Item shovelTarydiumAlloyRefined = 
			new ItemShovelUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F)
			.setUnlocalizedName(Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1)
			.setCreativeTab(null);
	
	public static Item axeTarydiumAlloyRefined = 
			new ItemAxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 3.0F)
			.setUnlocalizedName(Names.Items.AXE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1)
			.setCreativeTab(null);
	
	public static Item hoeTarydiumAlloyRefined = 
			new ItemHoeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED)
			.setUnlocalizedName(Names.Items.HOE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1)
			.setCreativeTab(null);
	
	//armor
	public static Item armorSCUBAGear = 
			new ItemArmorSCUBAGear(ItemArmor.ArmorMaterial.GOLD, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.SCUBA_GEAR)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorShieldBelt = 
			new ItemArmorShieldBelt(Materials.Armor.SHIELD, Reference.Armor.Render.GOLD, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.SHIELD_BELT)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorToxinSuit = 
			new ItemArmorToxinSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.TOXIN_SUIT)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorAsbestosSuit = 
			new ItemArmorAsbestosSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.CHAIN, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.ASBESTOS_SUIT)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorJumpBoots = 
			new ItemArmorJumpBoots(ItemArmor.ArmorMaterial.IRON, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.JUMP_BOOTS)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorHelmetTitanium = 
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.HELMET_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorChestplateTitanium = 
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.CHESTPLATE_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorLeggingsTitanium = 
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.LEGGINGS_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorBootsTitanium = 
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.BOOTS_TITANIUM)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorHelmetSlime = 
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.HELMET_SLIME)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorChestplateSlime = 
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.CHESTPLATE_SLIME)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorLeggingsSlime = 
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.LEGGINGS_SLIME)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item armorBootsSlime = 
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.BOOTS_SLIME)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//ammo
	public static Item ammoEightball = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.AMMO_EIGHTBALL)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item ammoFlakShell = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.AMMO_FLAK_SHELL)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item ammoWarhead = 
			new ItemUnreal()
			.setUnlocalizedName(Names.Items.AMMO_WARHEAD)
			.setMaxStackSize(16)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//vanilla item dusts
	public static Item dustCoal = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_COAL)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustCharcoal = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_CHARCOAL)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustIron = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_IRON)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustLapis = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_LAPIS)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustGold = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_GOLD)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustNetherQuartz = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_NETHER_QUARTZ)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustDiamond = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_DIAMOND)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustEmerald = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_EMERALD)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item dustObsidian = 
			new ItemDustUnreal()
			.setUnlocalizedName(Names.Items.DUST_OBSIDIAN)
			.setMaxStackSize(64)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//weapons
	public static Item gunTranslocator = 
			new ItemWeaponBase(new ItemStack(ModItems.translocatorDisc, 0, 1), 101)
			.setDamageOnCraft(1)
			.setUnlocalizedName(Names.Items.GUN_TRANSLOCATOR)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunDispersionPistol = 
			new ItemWeaponBase(new ItemStack(ModItems.dispersionUpgrade, 0, 1), 5001)
			.setDamageOnCraft(1)
			.setUnlocalizedName(Names.Items.GUN_DISPERSION_PISTOL)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item meleeChainsaw = 
			new ItemWeaponBase(new ItemStack(ModItems.chainLink, 0, 1), 101)
			.setDamageOnCraft(1)
			.setUnlocalizedName(Names.Items.MELEE_CHAINSAW)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunStinger = 
			new ItemWeaponBase(new ItemStack(ModItems.shardTarydium, 0, 1), 101)
			.setDamageOnCraft(100-9+1)
			.setUnlocalizedName(Names.Items.GUN_STINGER)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunFlakCannon = 
			new ItemWeaponBase(new ItemStack(ModItems.ammoFlakShell, 0, 1), 51)
			.setDamageOnCraft(50-5+1)
			.setUnlocalizedName(Names.Items.GUN_FLAK)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunEightballLauncher = 
			new ItemWeaponBase(new ItemStack(ModItems.ammoEightball, 0, 1), 49)
			.setDamageOnCraft(48)
			.setUnlocalizedName(Names.Items.GUN_EIGHTBALL)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static Item gunRedeemer = 
			new ItemWeaponBase(new ItemStack(ModItems.ammoWarhead, 0, 1), 101)
			.setDamageOnCraft(1)
			.setUnlocalizedName(Names.Items.GUN_REDEEMER)
			.setMaxStackSize(1)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
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
		GameRegistry.registerItem(rodIron, Names.Items.ROD_IRON);
		GameRegistry.registerItem(rodTitanium, Names.Items.ROD_TITANIUM);
		GameRegistry.registerItem(lensTarydium, Names.Items.LENS_TARYDIUM);
		
		//fluid containers
		bucketMercury = new ItemBucketUnreal(ModFluids.fluidBlockMercury)
		.setUnlocalizedName(Names.Items.BUCKET_MERCURY)
		.setMaxStackSize(1).setContainerItem(Items.bucket)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		GameRegistry.registerItem(bucketMercury, Names.Items.BUCKET_MERCURY);
		
		bucketTarydiumSludge = new ItemBucketUnreal(ModFluids.fluidBlockTarydiumSludge)
		.setUnlocalizedName(Names.Items.BUCKET_TARYDIUM_SLUDGE)
		.setMaxStackSize(1).setContainerItem(Items.bucket)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		GameRegistry.registerItem(bucketTarydiumSludge, Names.Items.BUCKET_TARYDIUM_SLUDGE);
		
		bucketHealth = new ItemBucketUnreal(ModFluids.fluidBlockHealth)
		.setUnlocalizedName(Names.Items.BUCKET_HEALTH)
		.setMaxStackSize(1).setContainerItem(Items.bucket)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		GameRegistry.registerItem(bucketHealth, Names.Items.BUCKET_HEALTH);
		
		bucketNanoblack = new ItemBucketUnreal(ModFluids.fluidBlockNanoblack)
		.setUnlocalizedName(Names.Items.BUCKET_NANOBLACK)
		.setMaxStackSize(1).setContainerItem(Items.bucket)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		GameRegistry.registerItem(bucketNanoblack, Names.Items.BUCKET_NANOBLACK);
		
		//tools
		GameRegistry.registerItem(debugTool, Names.Items.DEBUG_TOOL);
		GameRegistry.registerItem(forceField, Names.Items.FORCE_FIELD);
		GameRegistry.registerItem(voiceBox, Names.Items.VOICE_BOX);
		GameRegistry.registerItem(universalTranslator, Names.Items.UNIVERSAL_TRANSLATOR);
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
		
		//records
		GameRegistry.registerItem(recordLongFlight, Names.Items.RECORD_LONG_FLIGHT);
		
		//armor
		GameRegistry.registerItem(armorSCUBAGear, Names.Items.SCUBA_GEAR);
		GameRegistry.registerItem(armorShieldBelt, Names.Items.SHIELD_BELT);
		GameRegistry.registerItem(armorToxinSuit, Names.Items.TOXIN_SUIT);
		GameRegistry.registerItem(armorAsbestosSuit, Names.Items.ASBESTOS_SUIT);
		GameRegistry.registerItem(armorJumpBoots, Names.Items.JUMP_BOOTS);
		GameRegistry.registerItem(armorHelmetTitanium, Names.Items.HELMET_TITANIUM);
		GameRegistry.registerItem(armorChestplateTitanium, Names.Items.CHESTPLATE_TITANIUM);
		GameRegistry.registerItem(armorLeggingsTitanium, Names.Items.LEGGINGS_TITANIUM);
		GameRegistry.registerItem(armorBootsTitanium, Names.Items.BOOTS_TITANIUM);
		GameRegistry.registerItem(armorHelmetSlime, Names.Items.HELMET_SLIME);
		GameRegistry.registerItem(armorChestplateSlime, Names.Items.CHESTPLATE_SLIME);
		GameRegistry.registerItem(armorLeggingsSlime, Names.Items.LEGGINGS_SLIME);
		GameRegistry.registerItem(armorBootsSlime, Names.Items.BOOTS_SLIME);
		
		//ammo
		GameRegistry.registerItem(ammoEightball, Names.Items.AMMO_EIGHTBALL);
		GameRegistry.registerItem(ammoFlakShell, Names.Items.AMMO_FLAK_SHELL);
		GameRegistry.registerItem(ammoWarhead, Names.Items.AMMO_WARHEAD);
		
		//weapons
		GameRegistry.registerItem(gunTranslocator, Names.Items.GUN_TRANSLOCATOR);
		GameRegistry.registerItem(gunDispersionPistol, Names.Items.GUN_DISPERSION_PISTOL);
		GameRegistry.registerItem(meleeChainsaw, Names.Items.MELEE_CHAINSAW);
		GameRegistry.registerItem(gunStinger, Names.Items.GUN_STINGER);
		GameRegistry.registerItem(gunFlakCannon, Names.Items.GUN_FLAK);
		GameRegistry.registerItem(gunEightballLauncher, Names.Items.GUN_EIGHTBALL);
		GameRegistry.registerItem(gunRedeemer, Names.Items.GUN_REDEEMER);
		
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
