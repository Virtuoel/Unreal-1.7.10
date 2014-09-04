package com.virtuoel.unreal.proxy;

import com.virtuoel.unreal.client.settings.KeyBindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(KeyBindings.modeSwitch);
		ClientRegistry.registerKeyBinding(KeyBindings.reload);
	}
}
