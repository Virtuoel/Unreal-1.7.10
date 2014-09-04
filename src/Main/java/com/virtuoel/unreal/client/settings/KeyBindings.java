package com.virtuoel.unreal.client.settings;

import org.lwjgl.input.Keyboard;

import com.virtuoel.unreal.reference.Names;

import net.minecraft.client.settings.KeyBinding;

public class KeyBindings
{
	public static KeyBinding modeSwitch = new KeyBinding(Names.Keys.MODE_SWITCH,Keyboard.KEY_X,Names.Keys.CATEGORY);
	public static KeyBinding reload = new KeyBinding(Names.Keys.RELOAD,Keyboard.KEY_C,Names.Keys.CATEGORY);
}
