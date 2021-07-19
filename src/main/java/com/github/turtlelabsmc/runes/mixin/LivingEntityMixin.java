package com.github.turtlelabsmc.runes.mixin;

import com.github.turtlelabsmc.runes.registry.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//Note by GudBoiNero
/* Hey just wanted to give you guys a note
 * this method is supposed to check if the LivingEntity is inside water or is getting touched by rain.
 * Once it does that it will check if the LivingEntity is holding the OCEANS_BLESSING_RUNE
 * currently the placeholder for that is 'BLANK_RUNE'
 * I'm learning how Injects work rn so i will not be able to finish that until then.*/

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin
{
    /*@Inject(method = "tick", at = @At("TAIL"))
    public void oceansBlessingCondition(CallbackInfo ci, LivingEntity entity)
    {
        if (entity.isHolding(ItemRegistry.OCEANS_BLESSING_RUNE)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 60, 1));
        }
    }*/
}

