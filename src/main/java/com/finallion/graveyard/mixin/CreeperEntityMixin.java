package com.finallion.graveyard.mixin;


import com.finallion.graveyard.utils.CreeperExplosionAccessor;
import net.minecraft.entity.monster.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntity.class)
public abstract class CreeperEntityMixin {

    @Inject(method="explodeCreeper", at = @At("HEAD"), cancellable = true)
    private void explode(CallbackInfo info) {
        CreeperEntity creeperEntity = ((CreeperEntity) (Object) this);
        CreeperExplosionAccessor.explode(creeperEntity, info);

    }
}
