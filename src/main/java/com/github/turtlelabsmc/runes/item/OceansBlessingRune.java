package com.github.turtlelabsmc.runes.item;

import com.github.turtlelabsmc.runes.registry.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OceansBlessingRune extends Item {
    public OceansBlessingRune(Settings settings)
    {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (stack.getItem() == ItemRegistry.OCEANS_BLESSING_RUNE) {
            System.out.println("Holding Rune");
        }
    }
}
