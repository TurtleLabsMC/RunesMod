package com.github.turtlelabsmc.runes.registry;

import com.github.turtlelabsmc.runes.RunesMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry
{
    private static final Map<Identifier, Item> ITEMS = new HashMap<>();

    public static final Item BLANK_RUNE = addToRegistry("blank_rune", new Item(addedToMainItemGroup()));
    public static final Item OCEANS_BLESSING_RUNE = addToRegistry("oceans_blessing_rune", new Item(addedToMainItemGroup()));

    public static void register()
    {
        for (Map.Entry<Identifier, Item> entry : ITEMS.entrySet())
        {
            Registry.register(Registry.ITEM, entry.getKey(), entry.getValue());
        }
    }

    private static Item addToRegistry(String registryName, Item item)
    {
        ITEMS.put(RunesMod.modId(registryName), item);
        return item;
    }

    private static Item.Settings addedToMainItemGroup()
    {
        return new Item.Settings().group(RunesMod.RUNES_ITEMGROUP);
    }
}
