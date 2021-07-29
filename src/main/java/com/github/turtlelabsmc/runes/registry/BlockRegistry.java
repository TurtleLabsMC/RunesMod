package com.github.turtlelabsmc.runes.registry;

import com.github.turtlelabsmc.runes.RunesMod;
import com.github.turtlelabsmc.runes.block.EtchingTableBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class BlockRegistry
{
    private static final Map<Identifier, Block> BLOCKS = new HashMap<>();

    public static final Block ETCHING_TABLE = addToRegistry("etching_table", new EtchingTableBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).hardness(8.0f).resistance(1200.0f)), true);

    public static void register()
    {
        for (Map.Entry<Identifier, Block> entry : BLOCKS.entrySet())
        {
            Registry.register(Registry.BLOCK, entry.getKey(), entry.getValue());
        }
    }

    protected static Block addToRegistry(String registryName, Block block, boolean addItem)
    {
        BLOCKS.put(RunesMod.modId(registryName), block);
        ItemRegistry.addToRegistry(registryName, new BlockItem(block, ItemRegistry.addedToMainItemGroup()));
        return block;
    }
}
