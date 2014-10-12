package com.virtuoel.unreal.reference;

public class Reference
{
	public static final String MOD_ID = "unreal";
	public static final String MOD_NAME = "Unreal";
	public static final String VERSION = "1.7.10-0.1.0.32";
	public static final String SERVER_PROXY_CLASS = "com.virtuoel.unreal.proxy.ServerProxy";
	public static final String CLIENT_PROXY_CLASS = "com.virtuoel.unreal.proxy.ClientProxy";
	public static final String GUI_FACTORY_CLASS = "com.virtuoel.unreal.client.gui.GuiFactory";
	
	public static final class ConfigCategory
	{
		public static final String BLOCKS = "Blocks";
		public static final String ITEMS = "Items";
		public static final String CRAFTING = "Crafting";
		public static final String WORLD = "World";
		public static final String WEAPONS = "Weapons";
		public static final String DEBUG = "Debug";
	}
	
	public static final class DamageSource
	{
		public static final String TRANSLOCATOR = "translocator";
		public static final String CHAINSAW = "chainsaw";
		public static final String DISPERSION = "dispersionPistol";
		public static final String STINGER = "stinger";
		public static final String FLAK = "flak";
		public static final String FLAK_CANNON = "flakCannon";
		public static final String EIGHTBALL = "eightballLauncher";
		public static final String REDEEMER = "redeemer";
	}
	
	public static final class Armor
	{
		public static final class Type
		{
			public static final int HELMET = 0;
			public static final int CHESTPLATE = 1;
			public static final int LEGGINGS = 2;
			public static final int BOOTS = 3;
		}
		
		public static final class Render
		{
			public static final int LEATHER = 0;
			public static final int CHAIN = 1;
			public static final int IRON = 2;
			public static final int DIAMOND = 3;
			public static final int GOLD = 4;
		}
	}
	
	public static final class Blocks
	{
		public static final class Faces
		{
			public static final int BOTTOM = 0;
			public static final int TOP = 1;
			public static final int NORTH = 2;
			public static final int SOUTH = 3;
			public static final int WEST = 4;
			public static final int EAST = 5;
			public static final String[] FACE_ARRAY = {"bottom", "top", "north", "south", "west", "east"};
		}
	}
	
}
