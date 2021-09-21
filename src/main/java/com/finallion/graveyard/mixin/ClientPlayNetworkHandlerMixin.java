package com.finallion.graveyard.mixin;

import com.finallion.graveyard.blockentities.GravestoneBlockEntity;
import com.finallion.graveyard.client.gui.GravestoneScreen;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.network.NetworkThreadUtils;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    @Shadow
    private ClientWorld world;

    @Shadow
    private MinecraftClient client;

    @Inject(method = "onSignEditorOpen", at = @At(value = "HEAD"), cancellable = true)
    public void openSignEditor(SignEditorOpenS2CPacket packet, CallbackInfo info) {
        NetworkThreadUtils.forceMainThread(packet, (ClientPlayPacketListener) this, this.client);
        BlockPos blockPos = packet.getPos();
        BlockEntity blockEntity = this.world.getBlockEntity(blockPos);
        if (blockEntity instanceof GravestoneBlockEntity) {
            BlockState blockState = this.world.getBlockState(blockPos);
            blockEntity = new GravestoneBlockEntity();
            ((BlockEntity)blockEntity).setLocation(this.world, blockPos);
            MinecraftClient.getInstance().openScreen(new GravestoneScreen((GravestoneBlockEntity) blockEntity,  false));
            info.cancel();
        }
    }

    @Inject(method = "onBlockEntityUpdate", at = @At(value = "HEAD"), cancellable = true)
    public void onEntityUpdate(BlockEntityUpdateS2CPacket packet, CallbackInfo info) {
        NetworkThreadUtils.forceMainThread(packet, (ClientPlayPacketListener) this, this.client);
        BlockPos blockPos = packet.getPos();
        BlockEntity blockEntity = this.world.getBlockEntity(blockPos);
        if (blockEntity instanceof GravestoneBlockEntity) {
            blockEntity.fromTag(this.client.world.getBlockState(blockPos), packet.getNbt());
            info.cancel();
        }
    }
}
