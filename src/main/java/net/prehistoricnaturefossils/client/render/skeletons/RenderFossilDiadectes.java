package net.prehistoricnaturefossils.client.render.skeletons;

import net.lepidodendron.entity.render.entity.RenderDiadectes;
import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonDiadectes;
import net.prehistoricnaturefossils.client.model.ModelSkeletonDiadectesFrame;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilDiadectes;

public class RenderFossilDiadectes extends TileEntitySpecialRenderer<TileEntityFossilDiadectes> {
    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage7.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage8.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_stage10.png");
    private static final ResourceLocation FRAME = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectes_frame.png");

    private final ModelSkeletonDiadectes modelSkeleton;
    private final ModelSkeletonDiadectesFrame modelSkeletonFrame;

    public RenderFossilDiadectes() {
        this.modelSkeletonFrame = new ModelSkeletonDiadectesFrame();
        this.modelSkeleton = new ModelSkeletonDiadectes();
    }

    @Override
    public void render(TileEntityFossilDiadectes entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        boolean frame = false;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
            if (entity.getTileData().hasKey("frame") && PrehistoricNatureFossils.doFrames) {
                frame = entity.getTileData().getBoolean("frame");
            }
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        switch (currentStage) {

            case 1: default:
                this.bindTexture(TEXTURE1);
                break;

            case 2:
                this.bindTexture(TEXTURE2);
                break;

            case 3:
                this.bindTexture(TEXTURE3);
                break;

            case 4:
                this.bindTexture(TEXTURE4);
                break;

            case 5:
                this.bindTexture(TEXTURE5);
                break;
            case 6:
                this.bindTexture(TEXTURE6);
                break;
            case 7:
                this.bindTexture(TEXTURE7);
                break;
            case 8:
                this.bindTexture(TEXTURE8);
                break;
            case 9:
                this.bindTexture(TEXTURE9);
                break;
            case 10:
                this.bindTexture(TEXTURE10);
                break;
           
        }

        GlStateManager.enableAlpha();
        ModelSkeletonDiadectes modelSkeleton = this.modelSkeleton;
        double scale = RenderDiadectes.getScaler() * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 1.18, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Frame:
        if (frame) {
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            this.bindTexture(FRAME);
            GlStateManager.enableAlpha();
            ModelSkeletonDiadectesFrame modelSkeletonFrame = this.modelSkeletonFrame;
            scale = RenderDiadectes.getScaler() * RenderDisplayWallMount.scaler;
            GlStateManager.translate(x + 0.5, y + 1.18, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
            modelSkeletonFrame.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}