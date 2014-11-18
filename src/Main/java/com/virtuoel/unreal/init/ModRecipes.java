package com.virtuoel.unreal.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.virtuoel.unreal.item.ItemBlockPlacerDamageable;
import com.virtuoel.unreal.item.ItemUnrealDamageable;
import com.virtuoel.unreal.item.ItemWeaponBase;
import com.virtuoel.unreal.reference.Settings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		//vanilla tweaks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gold_ingot,1), new Object[]{
				"III","III","III",'I',"nuggetGold",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal,9,0), new Object[]{
				"I",'I',"blockCoal",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.redstone,9,0), new Object[]{
				"I",'I',"blockRedstone",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.dye,9,4), new Object[]{
				"I",'I',"blockLapis",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.enchanting_table,1,0), new Object[]{
				" B ","DOD","OOO",'O',"obsidian",'B',Items.book,'D',"gemDiamond",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ender_chest,1,0), new Object[]{
				"OOO","OEO","OOO",'O',"obsidian",'E',Items.ender_eye,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.beacon,1,0), new Object[]{
				"GGG","GSG","OOO",'O',"obsidian",'G',"blockGlassColorless",'S',Items.nether_star,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.beacon,1,0), new Object[]{
				"GGG","GSG","OOO",'O',"obsidian",'G',"blockGlass",'S',Items.nether_star,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_lamp,1,0), new Object[]{
				" R ","RGR"," R ",'R',"dustRedstone",'G',"glowstone",
				}));
		
		//TODO temporary debugTool recipes ---------------------------------------------------------------------------------------------------------------------------------
		
		//crafting
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,4), new Object[]{
			"blockTarydium","blockIron","blockFlint","blockCoal",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.cobblestone,1), new Object[]{
			"virtuoel.unreal.debug",
			}));
		
		//fueling
		ItemStack coalLike = new ItemStack(Items.coal,1,OreDictionary.WILDCARD_VALUE);
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,3), new Object[]{
			"virtuoel.unreal.debug",coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,3), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug",coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,4), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug",coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,4), new Object[]{
			"virtuoel.unreal.debug",coalLike,coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,13), new Object[]{
			"virtuoel.unreal.debug","fluidLava",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,11), new Object[]{
			"virtuoel.unreal.debug","blockCoal",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.debugTool,10), new Object[]{
			"virtuoel.unreal.debug","blockCharcoal",
			}));
		
		//grinding
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustMagnesium,1), new Object[]{
			"ingotMagnesium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustMagnesium,4), new Object[]{
			"oreMagnesium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustRutile,1), new Object[]{
			"ingotRutile","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustRutile,2), new Object[]{
			"oreRutile","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,1), new Object[]{
			"ingotTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,2), new Object[]{
			"oreTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.glowstone_dust,4), new Object[]{
			"glowstone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.mossy_cobblestone,1), new Object[]{
			new ItemStack(Blocks.cobblestone_wall,1,1),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.mossy_cobblestone,1), new Object[]{
			new ItemStack(Blocks.stonebrick,1,1),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gunpowder,4), new Object[]{
			Blocks.tnt,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.blaze_powder,4), new Object[]{
			"rodBlaze","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,4), new Object[]{
			"blockNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,4), new Object[]{
			"blockQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint,1), new Object[]{
			Blocks.gravel,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTarydiumAlloyUnrefined,1), new Object[]{
			"ingotTarydiumAlloyUnrefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTarydiumAlloyRefined,1), new Object[]{
			"ingotTarydiumAlloyRefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustIron,1), new Object[]{
			"ingotIron","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustIron,2), new Object[]{
			"oreIron","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustGold,1), new Object[]{
			"ingotGold","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustGold,2), new Object[]{
			"oreGold","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustCoal,1), new Object[]{
			"coal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustCharcoal,1), new Object[]{
			"charcoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustLapis,1), new Object[]{
			"gemLapis","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustDiamond,1), new Object[]{
			"gemDiamond","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustEmerald,1), new Object[]{
			"gemEmerald","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustNetherQuartz,1), new Object[]{
			"crystalNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustObsidian,4), new Object[]{
			"obsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustObsidian,4), new Object[]{
			"netherobsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustObsidian,4), new Object[]{
			"enderobsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.string,4), new Object[]{
			new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.sand,1), new Object[]{
			"cobblestone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustAsbestos,2), new Object[]{
			"oreAsbestos","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustIron,3), new Object[]{
			Items.bucket,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustCinnabar,1), new Object[]{
			"crystalCinnabar","virtuoel.unreal.debug",
			}));
		
		//refining
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.crystalCinnabar,1), new Object[]{
			"virtuoel.unreal.debug","oreRedstone","oreRedstone","oreRedstone","oreRedstone",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.crystalCinnabar,1), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","oreCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bucketMercury,1), new Object[]{
			"virtuoel.unreal.debug","dustCinnabar","virtuoel.unreal.debug","dustCinnabar",Items.bucket,"dustCinnabar","virtuoel.unreal.debug","dustCinnabar","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetTarydiumAlloyRefined,9), new Object[]{
			"ingotTarydiumAlloyUnrefined","virtuoel.unreal.debug","fluidMercury",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gravel,1), new Object[]{
			Items.flint,Blocks.cobblestone,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.oreTarydiumNether,1), new Object[]{
			ModBlocks.oreTarydium,"compressedNetherrack4x","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.oreTarydiumEnd,1), new Object[]{
			ModBlocks.oreTarydiumNether,"compressedEndStone4x","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.oreTarydiumObsidian,1), new Object[]{
			"netherobsidian","virtuoel.unreal.debug","netherobsidian","netherobsidian",ModBlocks.oreTarydiumEnd,"netherobsidian","netherobsidian","netherobsidian","netherobsidian",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rodTarydiumAlloyRefined,1), new Object[]{
			"fluidMercury","virtuoel.unreal.debug","fluidMercury","rodTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SCUBATankOxygen,1), new Object[]{
			ModItems.SCUBATankEmpty,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,1,0), new Object[]{
			"dustCoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,1,1), new Object[]{
			"dustCharcoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dye,1,4), new Object[]{
			"dustLapis","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond,1), new Object[]{
			"dustDiamond","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.emerald,1), new Object[]{
			"dustEmerald","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,1), new Object[]{
			"dustNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,1), new Object[]{
			"dustObsidian","dustObsidian","dustObsidian","dustObsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gunpowder,1), new Object[]{
			Items.flint,Items.flint,"virtuoel.unreal.debug",Items.flint,Items.flint,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather,1), new Object[]{
			Items.rotten_flesh,Items.sugar,Items.sugar,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather,2), new Object[]{
			Items.rotten_flesh,Items.sugar,Items.sugar,Items.rotten_flesh,Items.sugar,Items.sugar,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.end_stone,1), new Object[]{
			Blocks.sandstone,Items.ender_pearl,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.end_stone,5), new Object[]{
			"obsidian","obsidian","obsidian","obsidian","obsidian",Items.ender_pearl,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,1), new Object[]{
			"fluidWater","fluidLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,2), new Object[]{
			"fluidWater","fluidLava","fluidWater","fluidLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,3), new Object[]{
			"fluidWater","fluidLava","fluidWater","fluidLava","fluidWater","fluidLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,4), new Object[]{
			"fluidWater","fluidLava","fluidWater","fluidLava","fluidWater","fluidLava","fluidWater","fluidLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.crystalCinnabar,1), new Object[]{
			"dustCinnabar","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetBedrockium,1), new Object[]{
			"fluidMercury","virtuoel.unreal.debug","fluidMercury","fluidMercury","oreBedrockium","fluidMercury","fluidMercury","fluidMercury","fluidMercury",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.dragon_egg,2), new Object[]{
			ModBlocks.blockEnderCrystal,"virtuoel.unreal.debug",ModBlocks.blockEnderCrystal,ModBlocks.blockEnderCrystal,Blocks.dragon_egg,ModBlocks.blockEnderCrystal,"virtuoel.unreal.debug","blockBedrockium","virtuoel.unreal.debug",
			}));
		
		//unrefining
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetTarydiumAlloyUnrefined,1), new Object[]{
			"nuggetTarydiumAlloyRefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.nuggetRutile,1), new Object[]{
			"nuggetTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SCUBATankEmpty,1), new Object[]{
			ModItems.SCUBATankOxygen,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.blockTarydium,1), new Object[]{
			ModBlocks.blockUUTC,"virtuoel.unreal.debug"
			}));
		//TODO debug recipe end ---------------------------------------------------------------------------------------------------------------------------------
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTitanium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTitanium,9), new Object[]{
			"T",'T',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTitanium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetTitanium,9), new Object[]{
			"T",'T',"ingotTitanium",
			}));
		//
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockRutile,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotRutile,9), new Object[]{
			"T",'T',"blockRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotRutile,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetRutile,9), new Object[]{
			"T",'T',"ingotRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockMagnesium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotMagnesium,9), new Object[]{
			"T",'T',"blockMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotMagnesium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetMagnesium,9), new Object[]{
			"T",'T',"ingotMagnesium",
			}));
		//
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTarydiumAlloyRefined,9), new Object[]{
			"T",'T',"blockTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTarydiumAlloyRefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetTarydiumAlloyRefined,9), new Object[]{
			"T",'T',"ingotTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumAlloyRefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTarydiumAlloyUnrefined,9), new Object[]{
			"T",'T',"blockTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotTarydiumAlloyUnrefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetTarydiumAlloyUnrefined,9), new Object[]{
			"T",'T',"ingotTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumAlloyUnrefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemTarydium,1), new Object[]{
			"TTT","TTT","TTT",'T',"shardTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shardTarydium,9), new Object[]{
			"T",'T',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydium,1), new Object[]{
			"TTT","TTT","TTT",'T',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemTarydium,9), new Object[]{
			"T",'T',"blockTarydium",
			}));
		
		if(Settings.Crafting.ninePearlsPerEnderBlock)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnder,1), new Object[]{
				"CCC","CCC","CCC",'C',Items.ender_pearl,
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,9), new Object[]{
				"C",'C',"blockEnder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,9), new Object[]{
				"C",'C',"blockEnderPearl",
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnder,1), new Object[]{
				"CC","CC",'C',Items.ender_pearl,
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,4), new Object[]{
				"C",'C',"blockEnder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,4), new Object[]{
				"C",'C',"blockEnderPearl",
				}));
		}
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockLeather,1), new Object[]{
			"TTT","TTT","TTT",'T',Items.leather,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather,9), new Object[]{
			"C",'C',"blockLeather",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gunpowder,9), new Object[]{
			"T",'T',"blockGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockFlint,1), new Object[]{
			"TTT","TTT","TTT",'T',Items.flint,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.flint,9), new Object[]{
			"T",'T',"blockFlint",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGunpowder,1), new Object[]{
			"TTT","TTT","TTT",'T',"dustGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.blaze_rod,9), new Object[]{
			"T",'T',"blockBlaze",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBlaze,1), new Object[]{
			"TTT","TTT","TTT",'T',"rodBlaze",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ghast_tear,9), new Object[]{
			"T",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGhastTear,1), new Object[]{
			"TTT","TTT","TTT",'T',"itemTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSlime,1), new Object[]{
			"TTT","TTT","TTT",'T',Items.slime_ball,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.slime_ball,9), new Object[]{
			"T",'T',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockNetherWart,1), new Object[]{
			"TTT","TTT","TTT",'T',"cropNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.nether_wart,9), new Object[]{
			"T",'T',"blockNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAsbestos,1), new Object[]{
			"TTT","TTT","TTT",'T',"dustAsbestos",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dustAsbestos,9), new Object[]{
			"C",'C',"blockAsbestos",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCharcoal,1), new Object[]{
			"TTT","TTT","TTT",'T',"charcoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal,9,1), new Object[]{
			"C",'C',"blockCharcoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotBedrockium,9), new Object[]{
			"T",'T',"blockBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotBedrockium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetBedrockium,9), new Object[]{
			"T",'T',"ingotBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBedrockium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.crystalCinnabar,9), new Object[]{
			"T",'T',"blockCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCinnabar,1), new Object[]{
			"TTT","TTT","TTT",'T',"crystalCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.dye,9,3), new Object[]{
			"T",'T',"blockCocoa",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCocoa,1), new Object[]{
			"TTT","TTT","TTT",'T',"cropCocoa",
			}));
		//end blocks ---------------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeTitanium,1), new Object[]{
			"TT ","TS "," S ",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeTitanium,1), new Object[]{
			"TT"," S"," S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeTitanium,1), new Object[]{
			"TTT"," S "," S ",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelTitanium,1), new Object[]{
			"T","S","S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordTitanium,1), new Object[]{
			"T","T","S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cactusTarydium,1), new Object[]{
			"STS","TCT","STS",'T',"gemTarydium",'C',Blocks.cactus,'S',"shardTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.weaponCasingBasic,1), new Object[]{
			"TTL","NPT"," BT",'T',"ingotTitanium",'B',Blocks.stone_button,'P',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'L',Blocks.lever,'N',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.caseTitanium,2), new Object[]{
			"STS","T T","STS",'T',"ingotTitanium",'S',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tarydPowerBasic,1,((ItemUnrealDamageable)ModItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"NTN","NCN","TLT",'T',"gemTarydium",'N',"shardTarydium",'C',ModItems.caseTitanium,'L',ModItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tarydPowerBasic,1,((ItemUnrealDamageable)ModItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"TLT","NCN","NTN",'T',"gemTarydium",'N',"shardTarydium",'C',ModItems.caseTitanium,'L',ModItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tarydPowerBasic,1,((ItemUnrealDamageable)ModItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"TNN","LCT","TNN",'T',"gemTarydium",'N',"shardTarydium",'C',ModItems.caseTitanium,'L',ModItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tarydPowerBasic,1,((ItemUnrealDamageable)ModItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"NNT","TCL","NNT",'T',"gemTarydium",'N',"shardTarydium",'C',ModItems.caseTitanium,'L',ModItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ammoEightball,4), new Object[]{
			"NIF","PSB","NIF",'S',ModBlocks.cactusTarydium,'I',"ingotIron",'P',"blockGunpowder",'F',Items.fire_charge,'N',"nuggetIron",'B',"blockIron"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetIron,9), new Object[]{
			"I",'I',"ingotIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot,1), new Object[]{
			"III","III","III",'I',"nuggetIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorShieldBelt,1), new Object[]{
			"TLT","O O","TPT",'T',"blockTitanium",'L',"blockEmerald",'O',"blockGold",'P',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunBarrelIron,4), new Object[]{
			"III","N N","III",'N',"nuggetIron",'I',"ingotIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunEightballLauncher,1,((ItemWeaponBase)ModItems.gunEightballLauncher).getDamageOnCraft()), new Object[]{
			"RTT","BKM","TTC",'B',ModItems.gunBarrelIronLarge,'C',ModItems.weaponCasingAdv,'T',"ingotTitanium",'R',"dustRedstone",'K',ModItems.ammoEightball,'M',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunStinger,1,((ItemWeaponBase)ModItems.gunStinger).getDamageOnCraft()), new Object[]{
			"BTT","BRT","TCT",'B',ModItems.gunBarrelIron,'C',ModItems.weaponCasingBasic,'T',"ingotTitanium",'R',ModItems.gemTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.translocatorDisc,1), new Object[]{
			"TRT","NPN","TDT",'T',"blockTitanium",'D',"blockDiamond",'P',"blockEnder",'R',Blocks.redstone_torch,'N',Items.comparator,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.translocatorDisc,1), new Object[]{
			"TRT","NPN","TDT",'T',"blockTitanium",'D',"blockDiamond",'P',"blockEnderPearl",'R',Blocks.redstone_torch,'N',Items.comparator,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunTranslocator,1,((ItemWeaponBase)ModItems.gunTranslocator).getDamageOnCraft()), new Object[]{
			"DBE","SCR","TTT",'T',"blockTitanium",'D',ModItems.translocatorDisc,'C',ModItems.weaponCasingAdv,'B',ModItems.gunBarrelIron,'S',Blocks.daylight_detector,'R',"blockRedstone",'E',"blockEnder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunTranslocator,1,((ItemWeaponBase)ModItems.gunTranslocator).getDamageOnCraft()), new Object[]{
			"DBE","SCR","TTT",'T',"blockTitanium",'D',ModItems.translocatorDisc,'C',ModItems.weaponCasingAdv,'B',ModItems.gunBarrelIron,'S',Blocks.daylight_detector,'R',"blockRedstone",'E',"blockEnderPearl",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.weaponCasingAdv,1), new Object[]{
			"DTQ","TCY","RYT",'T',"ingotTitanium",'D',"gemDiamond",'C',ModItems.weaponCasingBasic,'Q',"crystalNetherQuartz",'R',"dustRedstone",'Y',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorJumpBoots,1), new Object[]{
			"TRT","TCT","PBP",'T',"ingotTitanium",'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'B',Items.iron_boots,'R',"blockRedstone",'P',Blocks.piston,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunFlakCannon,1,((ItemWeaponBase)ModItems.gunFlakCannon).getDamageOnCraft()), new Object[]{
			"SBG","IBT","ICY",'I',"ingotTitanium",'C',ModItems.weaponCasingBasic,'B',ModItems.gunBarrelIron,'S',ModItems.ammoFlakShell,'Y',"dyeOrange",'G',"dustGunpowder",'T',"blockTitanium"
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.flak,2), new Object[]{
			"nuggetMagnesium","nuggetIron","dustGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.flakShellCold,1), new Object[]{
			ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.caseTitanium,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ammoFlakShell,1), new Object[]{
			ModItems.flakShellWarm,"dyeOrange",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.ladderIron,3), new Object[]{
			"B B","BIB","B B",'I',"ingotIron",'B',Blocks.iron_bars,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cobblestonePaved,1), new Object[]{
			"TT","TT",'T',Blocks.cobblestone,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone,4), new Object[]{
			"T",'T',ModBlocks.cobblestonePaved,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.caseIron,2), new Object[]{
			"STS","T T","STS",'T',"ingotIron",'S',"nuggetIron",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.flakShellCold,1), new Object[]{
			ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.flak,ModItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"nuggetBedrockium",'T',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"nuggetBedrockium",'S',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"dustDiamond",'T',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"dustDiamond",'S',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"nuggetBedrockium",'T',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"nuggetBedrockium",'S',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"dustDiamond",'T',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"dustDiamond",'S',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunRedeemer,1,((ItemWeaponBase)ModItems.gunRedeemer).getDamageOnCraft()), new Object[]{
			"MOT","OYT","TTL",'O',"obsidian",'T',"blockTitanium",'Y',"blockTarydium",'M',ModItems.ammoWarhead,'L',new ItemStack(ModItems.gunEightballLauncher,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ammoWarhead,1), new Object[]{
			"CBT",'C',ModItems.warheadCone,'B',ModItems.warheadBody,'T',ModItems.warheadThruster,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.warheadCone,1), new Object[]{
			"NIB","BTE","NIB",'N',"nuggetIron",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'E',"blockEnder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.warheadCone,1), new Object[]{
			"NIB","BTE","NIB",'N',"nuggetIron",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'E',"blockEnderPearl",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.warheadBody,1), new Object[]{
			"BIB","TCT","BIB",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.warheadThruster,1), new Object[]{
			"IBB","ERT","IBB",'I',"blockIron",'B',ModItems.ammoEightball,'E',"blockEnder",'R',"blockRedstone",'T',Items.tnt_minecart,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.warheadThruster,1), new Object[]{
			"IBB","ERT","IBB",'I',"blockIron",'B',ModItems.ammoEightball,'E',"blockEnderPearl",'R',"blockRedstone",'T',Items.tnt_minecart,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chainLink,4), new Object[]{
			"TBT","BIB","TBT",'I',"ingotIron",'B',Blocks.iron_bars,'T',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chainsawBlade,1), new Object[]{
			"BCC","CIC","CCB",'B',Blocks.iron_bars,'C',ModItems.chainLink,'I',ModItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chainsawBladeHardened,1), new Object[]{
			"DDT","BBB","DDT",'D',"gemDiamond",'T',"gemTarydium",'B',ModItems.chainsawBlade,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chainsawMotor,1), new Object[]{
			"BTC","WPI","BAF",'B',Blocks.iron_bars,'T',"blockTitanium",'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'W',Blocks.heavy_weighted_pressure_plate,'P',Blocks.piston,'I',"blockIron",'A',ModItems.weaponCasingAdv,'F',new ItemStack(ModItems.gunFlakCannon,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.meleeChainsaw,1,((ItemWeaponBase)ModItems.meleeChainsaw).getDamageOnCraft()), new Object[]{
			"BBT","CCT","OOM",'B',Blocks.iron_bars,'T',"blockTitanium",'C',ModItems.chainsawBladeHardened,'M',ModItems.chainsawMotor,'O',"dustObsidian",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_helmet,1), new Object[]{
			"CCC","C C",'C',ModItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_chestplate,1), new Object[]{
			"C C","CCC","CCC",'C',ModItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_leggings,1), new Object[]{
			"CCC","C C","C C",'C',ModItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_boots,1), new Object[]{
			"C C","C C",'C',ModItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunBarrelIronLarge,1), new Object[]{
			"BBB","BIB","BBB",'B',ModItems.gunBarrelIron,'I',"ingotIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dispersionUpgrade,1), new Object[]{
			"CEC","BTB","CEC",'T',"blockTitanium",'E',"blockEnder",'B',ModItems.gunBarrelIronLarge,'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dispersionUpgrade,1), new Object[]{
			"CEC","BTB","CEC",'T',"blockTitanium",'E',"blockEnderPearl",'B',ModItems.gunBarrelIronLarge,'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunDispersionPistol,1,((ItemWeaponBase)ModItems.gunDispersionPistol).getDamageOnCraft()), new Object[]{
			"ETC","BAU","EGC",'T',"ingotTitanium",'E',"blockEnder",'B',ModItems.gunBarrelIronLarge,'A',ModItems.gunBarrelIron,'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'U',ModItems.dispersionUpgrade,'G',ModItems.weaponCasingBasic,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gunDispersionPistol,1,((ItemWeaponBase)ModItems.gunDispersionPistol).getDamageOnCraft()), new Object[]{
			"ETC","BAU","EGC",'T',"ingotTitanium",'E',"blockEnderPearl",'B',ModItems.gunBarrelIronLarge,'A',ModItems.gunBarrelIron,'C',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'U',ModItems.dispersionUpgrade,'G',ModItems.weaponCasingBasic,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,1), new Object[]{
			"dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,2), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,3), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTitanium,4), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.diamond_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeLightBlue",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.coal_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeBlack",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeLime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.gold_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeYellow",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.iron_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeLightGray",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.lapis_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeBlue",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.quartz_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeWhite",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',ModBlocks.blockUUTC,'D',"dyeRed",
			}));
		
		//compressed start ---------------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed1x,1), new Object[]{
			"TTT","TTT","TTT",'T',"netherrack",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.netherrack,9), new Object[]{
			"T",'T',"compressedNetherrack1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed2x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed1x,9), new Object[]{
			"T",'T',"compressedNetherrack2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed3x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed2x,9), new Object[]{
			"T",'T',"compressedNetherrack3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed4x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrackCompressed3x,9), new Object[]{
			"T",'T',"compressedNetherrack4x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed1x,1), new Object[]{
			"TTT","TTT","TTT",'T',Blocks.end_stone,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.end_stone,9), new Object[]{
			"T",'T',"compressedEndStone1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed2x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed1x,9), new Object[]{
			"T",'T',"compressedEndStone2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed3x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed2x,9), new Object[]{
			"T",'T',"compressedEndStone3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed4x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.endStoneCompressed3x,9), new Object[]{
			"T",'T',"compressedEndStone4x",
			}));
		//compressed end ---------------------------------------------------------------------------------------------------------------------------------
		//slabs start -------------------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stonePolished,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,0),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.sandstone,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,1),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,0), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,2),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,3),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.brick_block,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,4),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stonebrick,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,5),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.nether_brick,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,6),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.quartz_block,1,0), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,7),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,0), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,0),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,1),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,2), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,2),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,3), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,3),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,4), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,4),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,5), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,5),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stone_slab,2,0), new Object[]{
			"S",'S',ModBlocks.stonePolished,
			}));
		//slabs end
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.saddle,1), new Object[]{
			"LLL","LWL","I I",'L',"blockLeather",'I',"blockIron",'W',new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorAsbestosSuit,1), new Object[]{
			"OMO","TCT","OGO",'O',"blockAsbestos",'M',"fluidMercury",'C',new ItemStack(ModItems.armorToxinSuit,1,OreDictionary.WILDCARD_VALUE),'G',"blockMagnesium",'T',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorToxinSuit,1), new Object[]{
			"MGM","TKT","ARA",'M',"fluidMilk",'G',Items.speckled_melon,'T',"blockTitanium",'K',new ItemStack(Items.chainmail_chestplate,1,OreDictionary.WILDCARD_VALUE),'A',"blockAsbestos",'R',"blockRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodTarydiumAlloyRefined,4), new Object[]{
			"STS","SES","STS",'T',"blockTitanium",'S',"dustTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodTarydiumAlloyUnrefined,4), new Object[]{
			"STS","SES","STS",'T',"blockTitanium",'S',"dustTarydiumAlloyUnrefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeTarydiumAlloyRefined,1), new Object[]{
			"TTE","TSE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeTarydiumAlloyRefined,1), new Object[]{
			"TTE","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickaxeTarydiumAlloyRefined,1), new Object[]{
			"TTT","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shovelTarydiumAlloyRefined,1), new Object[]{
			"ETE","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordTarydiumAlloyRefined,1), new Object[]{
			"ETE","ETE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.SCUBATankEmpty,1), new Object[]{
			" MC","ISI","ICI",'M',ModItems.ribbonMagnesium,'C',ModItems.chainLink,'I',"nuggetIron",'S',ModItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorSCUBAGear,1), new Object[]{
			"BBB","AHA","ATA",'A',ModItems.SCUBATankOxygen,'T',"blockTitanium",'B',ModItems.gunBarrelIron,'H',new ItemStack(Items.iron_helmet,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.voiceBox,1), new Object[]{
			ModItems.ammoFlakShell,"blockRedstone",Blocks.jukebox,ModItems.chainsawBlade,ModItems.weaponCasingBasic,ModItems.ammoEightball,ModItems.gunBarrelIron,ModItems.tarydPowerBasic,"record",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'R',"blockTarydiumAlloyRefined",'U',"blockTarydiumAlloyUnrefined",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'U',"blockTarydiumAlloyRefined",'R',"blockTarydiumAlloyUnrefined",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'U',"blockTarydiumAlloyUnrefined",'R',"dustTarydiumAlloyRefined",'T',Items.nether_star,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'R',"blockTarydiumAlloyUnrefined",'U',"dustTarydiumAlloyRefined",'T',Items.nether_star,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.netherrack,4), new Object[]{
			"CCC","CNC","CCC",'C',"cobblestone",'N',"blockNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidianNether,4), new Object[]{
			"WOW","ONO","WOW",'O',"obsidian",'W',"compressedNetherrack1x",'N',Items.magma_cream,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stone_slab,6,0), new Object[]{
			"SSS",'S',ModBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ribbonMagnesium,1), new Object[]{
			"MMM",'M',"nuggetMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorHelmetTitanium,1), new Object[]{
			"III","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorChestplateTitanium,1), new Object[]{
			"I I","III","III",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorLeggingsTitanium,1), new Object[]{
			"III","I I","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorBootsTitanium,1), new Object[]{
			"I I","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorHelmetSlime,1), new Object[]{
			"III","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorChestplateSlime,1), new Object[]{
			"I I","III","III",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorLeggingsSlime,1), new Object[]{
			"III","I I","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorBootsSlime,1), new Object[]{
			"I I","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.forceField,1,((ItemBlockPlacerDamageable)ModItems.forceField).getDamageOnCraft()), new Object[]{
			"PTR","GBT","PTR",'R',"rodTitanium",'T',"blockTitanium",'B',ModItems.dispersionUpgrade,'G',"blockGlassPurple",'P',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.universalTranslator,1), new Object[]{
			"TGT","PBP","TRT",'I',"ingotTitanium",'T',"blockTitanium",'B',ModItems.dispersionUpgrade,'G',"blockGlassGreen",'P',new ItemStack(ModItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'R',"blockRedstone"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodIron,4), new Object[]{
			"ICI","IFI","ICI",'I',"dustIron",'F',"blockFlint",'C',"blockCoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodTitanium,4), new Object[]{
			"IFI","ICI","IFI",'I',"dustTitanium",'F',"blockIron",'C',"obsidian",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodGold,4), new Object[]{
			"IFI","ICI","IFI",'I',"dustGold",'F',"blockLapis",'C',"blockRedstone",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nuggetBedrockium,1), new Object[]{
			"CDC","DGD","CDC",'C',"compressedCobblestone2x",'D',"compressedCobblestone3x",'G',"gemDiamond"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lensTarydium,1), new Object[]{
			"STS","TGT","STS",'T',"rodTitanium",'S',"gemTarydium",'G',"blockGlass",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumCrystal,1), new Object[]{
			"NIN","IBI","BDB",'N',"shardTarydium",'I',"gemTarydium",'B',"blockTarydium",'D',"gemDiamond"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumFieldStasis,1), new Object[]{
			"RLR","LCL","RLR",'R',"rodGold",'L',ModItems.lensTarydium,'C',ModBlocks.blockTarydiumCrystal,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumFieldCollector,1), new Object[]{
			"NLN","IRI","BTB",'B',"blockGold",'I',"ingotGold",'N',"nuggetGold",'T',"blockTitanium",'L',ModItems.lensTarydium,'R',"rodTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumFieldEmitter,1), new Object[]{
			"NLN","IRI","BLB",'B',"blockTitanium",'I',"ingotGold",'N',"nuggetGold",'T',"blockTitanium",'L',ModItems.lensTarydium,'R',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTarydiumFieldRelay,2), new Object[]{
			"RLR","ITI","NGN",'I',"ingotGold",'N',"nuggetGold",'T',"rodTitanium",'L',ModItems.lensTarydium,'R',"rodIron",'G',"rodGold",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGoldCorrugated,4), new Object[]{
			"CBC","BTB","CBC",'B',"blockGold",'C',"cobblestone",'T',ModBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockDiamondCorrugated,4), new Object[]{
			"CBC","BTB","CBC",'B',"blockDiamond",'C',"cobblestone",'T',ModBlocks.stonePolished,
			}));
		
	}
	
	public static void initSmelting()
	{
		GameRegistry.addSmelting(ModBlocks.oreRutile, 
				new ItemStack(ModItems.ingotRutile,1), 1.0F);
		
		GameRegistry.addSmelting(ModBlocks.oreAsbestos, 
				new ItemStack(ModItems.dustAsbestos,1), 1.0F);
		
		GameRegistry.addSmelting(ModBlocks.oreMagnesium, 
				new ItemStack(ModItems.ingotMagnesium,3), 0.3F);
		
		GameRegistry.addSmelting(ModBlocks.cactusTarydium, 
				new ItemStack(ModItems.shardTarydium,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.tarydPowerBasic, 
				new ItemStack(ModItems.recordLongFlight,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.flakShellCold, 
				new ItemStack(ModItems.flakShellWarm,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.caseIron, 
				new ItemStack(Items.iron_ingot,2), 0.1F);
		
		GameRegistry.addSmelting(ModItems.caseTitanium, 
				new ItemStack(ModItems.ingotTitanium,2), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustMagnesium, 
				new ItemStack(ModItems.ingotMagnesium,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustTitanium, 
				new ItemStack(ModItems.ingotTitanium,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustRutile, 
				new ItemStack(ModItems.ingotRutile,1), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.blockUUTC, 
				new ItemStack(ModItems.nuggetTarydiumAlloyUnrefined,1), 1.0F);
		
		GameRegistry.addSmelting(ModItems.dustIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustGold, 
				new ItemStack(Items.gold_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustTarydiumAlloyUnrefined, 
				new ItemStack(ModItems.ingotTarydiumAlloyUnrefined,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.dustTarydiumAlloyRefined, 
				new ItemStack(ModItems.ingotTarydiumAlloyRefined,1), 0.1F);

		GameRegistry.addSmelting(ModItems.gunBarrelIron, 
				new ItemStack(ModItems.nuggetIron,14), 0.1F);
		
		GameRegistry.addSmelting(ModItems.gunBarrelIronLarge, 
				new ItemStack(Items.iron_ingot,12), 0.1F);
		
		GameRegistry.addSmelting(ModItems.chainLink, 
				new ItemStack(ModItems.nuggetIron,5), 0.1F);
		
		GameRegistry.addSmelting(ModItems.chainsawBlade, 
				new ItemStack(Items.iron_ingot,6), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.ladderIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.ribbonMagnesium, 
				new ItemStack(ModItems.nuggetMagnesium,3), 0.1F);
		
		GameRegistry.addSmelting(ModItems.rodIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.rodTitanium, 
				new ItemStack(ModItems.ingotTitanium,1), 0.1F);
		
		GameRegistry.addSmelting(ModItems.rodGold, 
				new ItemStack(Items.gold_ingot,1), 0.1F);
		
	}
	
	public static void initOreDict()
	{
		OreDictionary.registerOre("netherrack", Blocks.netherrack);
		OreDictionary.registerOre("obsidian", Blocks.obsidian);
		OreDictionary.registerOre("glowstone", Blocks.glowstone);
		OreDictionary.registerOre("dustGunpowder", Items.gunpowder);
		OreDictionary.registerOre("rodBlaze", Items.blaze_rod);
		OreDictionary.registerOre("blazeRod", Items.blaze_rod);
		OreDictionary.registerOre("dustBlaze", Items.blaze_powder);
		OreDictionary.registerOre("itemTear", Items.ghast_tear);
		OreDictionary.registerOre("crystalNetherQuartz", Items.quartz);
		OreDictionary.registerOre("blockNetherQuartz",  new ItemStack(Blocks.quartz_block,1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("coal", new ItemStack(Items.coal,1,0));
		OreDictionary.registerOre("charcoal", new ItemStack(Items.coal,1,1));
		OreDictionary.registerOre("cropCocoa", new ItemStack(Items.dye,1,3));
		OreDictionary.registerOre("cropNetherWart", Items.nether_wart);
		
		OreDictionary.registerOre("virtuoel.unreal.debug", ModItems.debugTool);
		
		OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
		OreDictionary.registerOre("dustTitanium", ModItems.dustTitanium);
		OreDictionary.registerOre("nuggetTitanium", ModItems.nuggetTitanium);
		OreDictionary.registerOre("blockTitanium", ModBlocks.blockTitanium);
		OreDictionary.registerOre("oreTarydium", ModBlocks.oreTarydium);
		OreDictionary.registerOre("shardTarydium", ModItems.shardTarydium);
		OreDictionary.registerOre("gemTarydium", ModItems.gemTarydium);
		OreDictionary.registerOre("blockTarydium", ModBlocks.blockTarydium);
		OreDictionary.registerOre("nuggetIron", ModItems.nuggetIron);
		OreDictionary.registerOre("blockLeather", ModBlocks.blockLeather);
		OreDictionary.registerOre("oreTarydium", ModBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydium", ModBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreTarydium", ModBlocks.oreTarydiumObsidian);
		OreDictionary.registerOre("oreEnderTarydium", ModBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreEndTarydium", ModBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreNetherTarydium", ModBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreTarydiumEnder", ModBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydiumEnd", ModBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydiumNether", ModBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreMagnesium", ModBlocks.oreMagnesium);
		OreDictionary.registerOre("ingotMagnesium", ModItems.ingotMagnesium);
		OreDictionary.registerOre("dustMagnesium", ModItems.dustMagnesium);
		OreDictionary.registerOre("nuggetMagnesium", ModItems.nuggetMagnesium);
		OreDictionary.registerOre("blockMagnesium", ModBlocks.blockMagnesium);
		OreDictionary.registerOre("oreRutile", ModBlocks.oreRutile);
		OreDictionary.registerOre("ingotRutile", ModItems.ingotRutile);
		OreDictionary.registerOre("dustRutile", ModItems.dustRutile);
		OreDictionary.registerOre("nuggetRutile", ModItems.nuggetRutile);
		OreDictionary.registerOre("blockRutile", ModBlocks.blockRutile);
		OreDictionary.registerOre("compressedNetherrack1x", ModBlocks.netherrackCompressed1x);
		OreDictionary.registerOre("compressedNetherrack2x", ModBlocks.netherrackCompressed2x);
		OreDictionary.registerOre("compressedNetherrack3x", ModBlocks.netherrackCompressed3x);
		OreDictionary.registerOre("compressedNetherrack4x", ModBlocks.netherrackCompressed4x);
		OreDictionary.registerOre("compressedEndStone1x", ModBlocks.endStoneCompressed1x);
		OreDictionary.registerOre("compressedEndStone2x", ModBlocks.endStoneCompressed2x);
		OreDictionary.registerOre("compressedEndStone3x", ModBlocks.endStoneCompressed3x);
		OreDictionary.registerOre("compressedEndStone4x", ModBlocks.endStoneCompressed4x);
		OreDictionary.registerOre("blockTarydiumAlloyRefined", ModBlocks.blockTarydiumAlloyRefined);
		OreDictionary.registerOre("blockTarydiumAlloyUnrefined", ModBlocks.blockTarydiumAlloyUnrefined);
		OreDictionary.registerOre("ingotTarydiumAlloyRefined", ModItems.ingotTarydiumAlloyRefined);
		OreDictionary.registerOre("ingotTarydiumAlloyUnrefined", ModItems.ingotTarydiumAlloyUnrefined);
		OreDictionary.registerOre("nuggetTarydiumAlloyRefined", ModItems.nuggetTarydiumAlloyRefined);
		OreDictionary.registerOre("nuggetTarydiumAlloyUnrefined", ModItems.nuggetTarydiumAlloyUnrefined);
		OreDictionary.registerOre("blockFlint", ModBlocks.blockFlint);
		OreDictionary.registerOre("blockGunpowder", ModBlocks.blockGunpowder);
		OreDictionary.registerOre("blockEnder", ModBlocks.blockEnder);
		OreDictionary.registerOre("blockEnderPearl", ModBlocks.blockEnder);
		OreDictionary.registerOre("dustIron", ModItems.dustIron);
		OreDictionary.registerOre("dustGold", ModItems.dustGold);
		OreDictionary.registerOre("dustTarydiumAlloyUnrefined", ModItems.dustTarydiumAlloyUnrefined);
		OreDictionary.registerOre("dustTarydiumAlloyRefined", ModItems.dustTarydiumAlloyRefined);
		OreDictionary.registerOre("rodTarydiumAlloyUnrefined", ModItems.rodTarydiumAlloyUnrefined);
		OreDictionary.registerOre("rodTarydiumAlloyRefined", ModItems.rodTarydiumAlloyRefined);
		OreDictionary.registerOre("rodIron", ModItems.rodIron);
		OreDictionary.registerOre("rodTitanium", ModItems.rodTitanium);
		OreDictionary.registerOre("rodGold", ModItems.rodGold);
		OreDictionary.registerOre("blockBlaze", ModBlocks.blockBlaze);
		OreDictionary.registerOre("blockTear", ModBlocks.blockGhastTear);
		OreDictionary.registerOre("blockBlazeRod", ModBlocks.blockBlaze);
		OreDictionary.registerOre("blockGhastTear", ModBlocks.blockGhastTear);
		OreDictionary.registerOre("dustCoal", ModItems.dustCoal);
		OreDictionary.registerOre("dustCharcoal", ModItems.dustCharcoal);
		OreDictionary.registerOre("dustLapis", ModItems.dustLapis);
		OreDictionary.registerOre("dyeBlue", ModItems.dustLapis);
		OreDictionary.registerOre("dustDiamond", ModItems.dustDiamond);
		OreDictionary.registerOre("dustEmerald", ModItems.dustEmerald);
		OreDictionary.registerOre("dustNetherQuartz", ModItems.dustNetherQuartz);
		OreDictionary.registerOre("record", ModItems.recordLongFlight);
		OreDictionary.registerOre("blockSlime", ModBlocks.blockSlime);
		OreDictionary.registerOre("blockNetherWart", ModBlocks.blockNetherWart);
		OreDictionary.registerOre("oreAsbestos", ModBlocks.oreAsbestos);
		OreDictionary.registerOre("dustAsbestos", ModItems.dustAsbestos);
		OreDictionary.registerOre("blockAsbestos", ModBlocks.blockAsbestos);
		OreDictionary.registerOre("blockCharcoal", ModBlocks.blockCharcoal);
		OreDictionary.registerOre("dustObsidian", ModItems.dustObsidian);
		OreDictionary.registerOre("dustCinnabar", ModItems.dustCinnabar);
		OreDictionary.registerOre("crystalCinnabar", ModItems.crystalCinnabar);
		OreDictionary.registerOre("blockCinnabar", ModBlocks.blockCinnabar);
		OreDictionary.registerOre("oreBedrockium", ModBlocks.oreBedrockium);
		OreDictionary.registerOre("ingotBedrockium", ModItems.ingotBedrockium);
		OreDictionary.registerOre("nuggetBedrockium", ModItems.nuggetBedrockium);
		OreDictionary.registerOre("blockBedrockium", ModBlocks.blockBedrockium);
		OreDictionary.registerOre("blockCocoa", ModBlocks.blockCocoa);
		OreDictionary.registerOre("obsidian", ModBlocks.obsidianNether);
		OreDictionary.registerOre("netherobsidian", ModBlocks.obsidianNether);
		OreDictionary.registerOre("blockGold", ModBlocks.blockGoldCorrugated);
		OreDictionary.registerOre("blockDiamond", ModBlocks.blockDiamondCorrugated);
		
		//buckets & fluids (temp)
		OreDictionary.registerOre("fluidWater", Items.water_bucket);
		OreDictionary.registerOre("fluidLava", Items.lava_bucket);
		OreDictionary.registerOre("fluidMilk", Items.milk_bucket);
		OreDictionary.registerOre("fluidMercury", ModItems.bucketMercury);
	}
}
