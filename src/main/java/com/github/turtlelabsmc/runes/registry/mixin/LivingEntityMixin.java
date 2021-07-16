package com.github.turtlelabsmc.runes.registry.mixin;

import com.github.turtlelabsmc.runes.RunesMod;
import com.github.turtlelabsmc.runes.registry.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin
{
    //Note by GudBoiNero
    /* Hey just wanted to give you guys a note
    * this method is supposed to check if the LivingEntity is inside water or is getting touched by rain.
    * Once it does that it will check if the LivingEntity is holding the OCEANS_BLESSING_RUNE
    * currently the placeholder for that is 'BLANK_RUNE'
    * I'm learning how Injects work rn so i will not be able to finish that until then.*/

    @Inject(method = "onAttacking", at = @At("TAIL"))
    public void oceansBlessingCondition(Entity target, CallbackInfo ci)
    {
        if  (!((LivingEntity) target).isHolding(ItemRegistry.BLANK_RUNE)) return;
    }
}

