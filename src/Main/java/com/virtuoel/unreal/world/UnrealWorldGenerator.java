package com.virtuoel.unreal.world;

import java.util.Random;

import com.virtuoel.unreal.init.ModBlocks;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class UnrealWorldGenerator implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
			case -1: generateNether(world, random,chunkX*16,chunkZ*16);
			case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
			case 1 : generateEnd(world, random,chunkX*16,chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				16, 24, //range
				ModBlocks.oreRutile, 0, //block, data
				Blocks.stone, //replace
				5, 1, //base #, rand #
				7, //ore qty
				false, //emerald-type generation
				Blocks.stone //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				32, 64, //range
				ModBlocks.oreMagnesium, 0, //block, data
				Blocks.stone, //replace
				7, 1, //base #, rand #
				6, //ore qty
				false, //emerald-type generation
				Blocks.coal_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				6, 50, //range
				ModBlocks.oreTarydium, 0, //block, data
				Blocks.stone, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.lapis_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				2, 72, //range
				ModBlocks.oreAsbestos, 0, //block, data
				Blocks.stone, //replace
				6, 1, //base #, rand #
				5, //ore qty
				false, //emerald-type generation
				Blocks.iron_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				1, 4, //range
				ModBlocks.oreBedrockiumHidden, 0, //block, data
				Blocks.bedrock, //replace
				2, 2, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.gold_block //debug orefinder block id
				);
	}

	private void generateNether(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				6, 126, //range
				ModBlocks.oreTarydiumNether, 0, //block, data
				Blocks.netherrack, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.redstone_block //debug orefinder block block
				);
		
	}

	private void generateEnd(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				24, 120, //range
				ModBlocks.oreTarydiumEnd, 0, //block, data
				Blocks.netherrack, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.diamond_block //debug orefinder block
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				24, 128, //range
				ModBlocks.oreTarydiumObsidian, 0, //block, data
				Blocks.obsidian, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.emerald_block //debug orefinder block
				);
		
	}

	private void doGenerateOre(World world, Random random, int BlockX, int BlockZ, int minY, int maxY, Block oreBlock, int oreData, Block worldStoneReplace, int amountBase, int amountRandom, int amountOre, boolean singleBlock, Block debugBlock)
	{
		for(int i=0; i<amountBase+random.nextInt(amountRandom);i++)
		{
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(maxY-minY)+minY;

			if(singleBlock)
			{
				Block blockAtCoord = world.getBlock(Xcoord, Ycoord, Zcoord);
				if (blockAtCoord == worldStoneReplace)
				{
					world.setBlock(Xcoord, Ycoord, Zcoord, oreBlock, oreData, 2);
					if(Settings.Debug.debugWorldGenerator)world.setBlock(Xcoord, 130, Zcoord, debugBlock, 0, 2);
				}
			}
			else
			{
				new WorldGenMinable(oreBlock, amountOre)
				.generate(world, random, Xcoord, Ycoord, Zcoord);
				if(Settings.Debug.debugWorldGenerator)world.setBlock(Xcoord, 130, Zcoord, debugBlock, 0, 2);
			}
		}
	}
}