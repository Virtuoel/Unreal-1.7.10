package com.virtuoel.unreal.init;

import net.minecraft.init.Items;
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
import com.virtuoel.unreal.item.ItemBucketUnreal;
import com.virtuoel.unreal.item.ItemDustUnreal;
import com.virtuoel.unreal.item.ItemHoeUnreal;
import com.virtuoel.unreal.item.ItemPickaxeUnreal;
import com.virtuoel.unreal.item.ItemShovelUnreal;
import com.virtuoel.unreal.item.ItemSwordUnreal;
import com.virtuoel.unreal.item.ItemToolUnreal;
import com.virtuoel.unreal.item.ItemVoiceBox;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.item.ItemWeaponBase;
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
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_TITANIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetRutile = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustRutile = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_RUTILE)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

	public static final ItemUnreal ingotMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_MAGNESIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal nuggetMagnesium = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_MAGNESIUM)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustMagnesium = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_MAGNESIUM)
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
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_CINNABAR)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustAsbestos = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_ASBESTOS)
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
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED)
			.setMaxStackSize(64).setCreativeTab(null);

	public static final ItemUnreal ingotTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal nuggetTarydiumAlloyRefined = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(64).setCreativeTab(null);
	
	public static final ItemUnreal dustTarydiumAlloyRefined = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_REFINED)
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
			.setMaxStackSize(16).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal weaponCasingAdv = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.WEAPON_CASING_ADVANCED)
			.setMaxStackSize(16).setFull3D()
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
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
	
	public static final ItemBucketUnreal bucketMercury = (ItemBucketUnreal)
			new ItemBucketUnreal(ModBlocks.fluidMercury).setUnlocalizedName(Names.Items.BUCKET_MERCURY)
			.setMaxStackSize(1).setContainerItem(Items.bucket)
			.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal voiceBox = (ItemUnreal)
			new ItemVoiceBox().setUnlocalizedName(Names.Items.VOICE_BOX)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemSwordUnreal swordTitanium = (ItemSwordUnreal)
			new ItemSwordUnreal(Materials.Tools.TITANIUM).setUnlocalizedName(Names.Items.SWORD_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemToolUnreal pickaxeTitanium = (ItemToolUnreal)
			new ItemPickaxeUnreal(Materials.Tools.TITANIUM, 2.0F).setUnlocalizedName(Names.Items.PICK_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemToolUnreal shovelTitanium = (ItemToolUnreal)
			new ItemShovelUnreal(Materials.Tools.TITANIUM, 1.0F).setUnlocalizedName(Names.Items.SHOVEL_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemToolUnreal axeTitanium = (ItemToolUnreal)
			new ItemAxeUnreal(Materials.Tools.TITANIUM, 3.0F).setUnlocalizedName(Names.Items.AXE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemHoeUnreal hoeTitanium = (ItemHoeUnreal)
			new ItemHoeUnreal(Materials.Tools.TITANIUM).setUnlocalizedName(Names.Items.HOE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemSwordUnreal swordTarydiumAlloyRefined = (ItemSwordUnreal)
			new ItemSwordUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED).setUnlocalizedName(Names.Items.SWORD_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemToolUnreal pickaxeTarydiumAlloyRefined = (ItemToolUnreal)
			new ItemPickaxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 2.0F).setUnlocalizedName(Names.Items.PICK_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemToolUnreal shovelTarydiumAlloyRefined = (ItemToolUnreal)
			new ItemShovelUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F).setUnlocalizedName(Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemToolUnreal axeTarydiumAlloyRefined = (ItemToolUnreal)
			new ItemAxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 3.0F).setUnlocalizedName(Names.Items.AXE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemHoeUnreal hoeTarydiumAlloyRefined = (ItemHoeUnreal)
			new ItemHoeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED).setUnlocalizedName(Names.Items.HOE_TARYDIUM_ALLOY_REFINED)
			.setMaxStackSize(1).setCreativeTab(null);
	
	public static final ItemUnreal recordUnreal = (ItemUnreal)
			new ItemUnreal().setUnlocalizedName(Names.Items.RECORD_UNREAL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//armor
	public static final ItemArmorUnrealBase armorSCUBAGear = (ItemArmorUnrealBase)
			new ItemArmorSCUBAGear(ItemArmor.ArmorMaterial.GOLD, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.SCUBA_GEAR)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorShieldBelt armorShieldBelt = (ItemArmorShieldBelt)
			new ItemArmorShieldBelt(Materials.Armor.SHIELD, Reference.Armor.Render.GOLD, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.SHIELD_BELT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorToxinSuit armorToxinSuit = (ItemArmorToxinSuit)
			new ItemArmorToxinSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.TOXIN_SUIT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorUnrealBase armorAsbestosSuit = (ItemArmorUnrealBase)
			new ItemArmorAsbestosSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.CHAIN, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.ASBESTOS_SUIT)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorJumpBoots armorJumpBoots = (ItemArmorJumpBoots)
			new ItemArmorJumpBoots(ItemArmor.ArmorMaterial.IRON, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.JUMP_BOOTS)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorUnrealBase armorHelmetTitanium = (ItemArmorUnrealBase)
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.CHESTPLATE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorUnrealBase armorChestplateTitanium = (ItemArmorUnrealBase)
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.CHESTPLATE_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorUnrealBase armorLeggingsTitanium = (ItemArmorUnrealBase)
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.LEGGINGS_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorUnrealBase armorBootsTitanium = (ItemArmorUnrealBase)
			new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.BOOTS_TITANIUM)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorSlime armorHelmetSlime = (ItemArmorSlime)
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.HELMET)
			.setUnlocalizedName(Names.Items.HELMET_SLIME)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorSlime armorChestplateSlime = (ItemArmorSlime)
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.CHESTPLATE)
			.setUnlocalizedName(Names.Items.CHESTPLATE_SLIME)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorSlime armorLeggingsSlime = (ItemArmorSlime)
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.LEGGINGS)
			.setUnlocalizedName(Names.Items.LEGGINGS_SLIME)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemArmorSlime armorBootsSlime = (ItemArmorSlime)
			new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.BOOTS)
			.setUnlocalizedName(Names.Items.BOOTS_SLIME)
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
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_COAL)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustCharcoal = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_CHARCOAL)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustIron = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_IRON)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustLapis = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_LAPIS)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustGold = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_GOLD)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustNetherQuartz = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_NETHER_QUARTZ)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustDiamond = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_DIAMOND)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustEmerald = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_EMERALD)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal dustObsidian = (ItemUnreal)
			new ItemDustUnreal().setUnlocalizedName(Names.Items.DUST_OBSIDIAN)
			.setMaxStackSize(64).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	//weapons
	public static final ItemUnreal gunTranslocator = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.translocatorDisc, 0, 1), 101).setUnlocalizedName(Names.Items.GUN_TRANSLOCATOR)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunDispersionPistol = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.dispersionUpgrade, 0, 1), 5001).setUnlocalizedName(Names.Items.GUN_DISPERSION_PISTOL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal meleeChainsaw = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.chainLink, 0, 1), 101).setUnlocalizedName(Names.Items.MELEE_CHAINSAW)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunStinger = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.shardTarydium, 0, 1), 101).setUnlocalizedName(Names.Items.GUN_STINGER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunFlakCannon = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.ammoFlakShell, 0, 1), 51).setUnlocalizedName(Names.Items.GUN_FLAK)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunEightballLauncher = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.ammoEightball, 0, 1), 49).setUnlocalizedName(Names.Items.GUN_EIGHTBALL)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
	public static final ItemUnreal gunRedeemer = (ItemUnreal)
			new ItemWeaponBase(new ItemStack(ModItems.ammoWarhead, 0, 1), 101).setUnlocalizedName(Names.Items.GUN_REDEEMER)
			.setMaxStackSize(1).setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	
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
