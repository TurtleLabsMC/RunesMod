package com.github.turtlelabsmc.runes;

import com.github.turtlelabsmc.runes.registry.BlockRegistry;
import com.github.turtlelabsmc.runes.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RunesMod implements ModInitializer
{
	public static final ItemGroup RUNES_ITEMGROUP = FabricItemGroupBuilder.build(modId("main_tab"), () -> new ItemStack(ItemRegistry.BLANK_RUNE));

	@Override
	public void onInitialize()
	{
		System.out.println("Hello Fabric world! - from RunesMod");

		BlockRegistry.register();
		ItemRegistry.register();
	}

	public static Identifier modId(String path)
	{
		return new Identifier("runes", path);
	}
}
