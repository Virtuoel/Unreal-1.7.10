package com.virtuoel.unreal.client.handler;

import com.virtuoel.unreal.client.settings.KeyBindings;
import com.virtuoel.unreal.reference.Key;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
	private static Key getPressedKeyBinding()
	{
		if(KeyBindings.modeSwitch.isPressed())
		{
			return Key.MODE_SWITCH;
		}
		else if(KeyBindings.reload.isPressed())
		{
			return Key.RELOAD;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		if(Settings.Debug.printDebugKeyBindingValues)
		{
			LogHelper.info(getPressedKeyBinding());
		}
	}
}
