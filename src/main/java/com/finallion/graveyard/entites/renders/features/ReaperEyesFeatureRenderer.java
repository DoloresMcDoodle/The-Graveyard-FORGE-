package com.finallion.graveyard.entites.renders.features;


import com.finallion.graveyard.entities.ReaperEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;


public class ReaperEyesFeatureRenderer extends GeoLayerRenderer<ReaperEntity> {
    private final RenderLayer TEXTURE = RenderLayer.getEyes(new Identifier("graveyard:textures/entity/reaper_eyes.png"));
    private final IGeoRenderer<ReaperEntity> renderer;

    public ReaperEyesFeatureRenderer(IGeoRenderer<ReaperEntity> entityRendererIn) {
        super(entityRendererIn);
        this.renderer = entityRendererIn;
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, ReaperEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexConsumer = bufferIn.getBuffer(TEXTURE);
        renderer.render(
                getEntityModel().getModel(getEntityModel().getModelLocation(entitylivingbaseIn)),
                entitylivingbaseIn,
                partialTicks,
                TEXTURE,
                matrixStackIn,
                bufferIn,
                vertexConsumer,
                15728640,
                OverlayTexture.DEFAULT_UV,
                1.0F, 1.0F, 1.0F, 1.0F
        );
    }


}

