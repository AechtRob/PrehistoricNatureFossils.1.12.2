package net.prehistoricnaturefossils.client.render.skeletons;

import net.lepidodendron.entity.render.entity.RenderSmilosuchus;
import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonSmilosuchus;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilSmilosuchus;

public class RenderFossilSmilosuchus extends TileEntitySpecialRenderer<TileEntityFossilSmilosuchus> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage7.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage8.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage10.png");
    private static final ResourceLocation TEXTURE11 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage11.png");
    private static final ResourceLocation TEXTURE12 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage12.png");
    private static final ResourceLocation TEXTURE13 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage13.png");
    private static final ResourceLocation TEXTURE14 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage14.png");
    private static final ResourceLocation TEXTURE15 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/smilosuchus_stage15.png");

    private final ModelSkeletonSmilosuchus modelSkeleton;

    public RenderFossilSmilosuchus() {
        this.modelSkeleton = new ModelSkeletonSmilosuchus();
    }

    @Override
    public void render(TileEntityFossilSmilosuchus entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
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
            case 11:
                this.bindTexture(TEXTURE11);
                break;
            case 12:
                this.bindTexture(TEXTURE12);
                break;
            case 13:
                this.bindTexture(TEXTURE13);
                break;
            case 14:
                this.bindTexture(TEXTURE14);
                break;
            case 15:
                this.bindTexture(TEXTURE15);
                break;
        }

        GlStateManager.enableAlpha();
        ModelSkeletonSmilosuchus modelSkeleton = this.modelSkeleton;
        double scale = RenderSmilosuchus.getScaler() * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 1.13, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}