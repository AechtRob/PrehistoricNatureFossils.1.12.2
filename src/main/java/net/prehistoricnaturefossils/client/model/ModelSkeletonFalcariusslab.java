package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFalcariusslab extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer arm;
    private final ModelRenderer cube_r1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer Display;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;

    public ModelSkeletonFalcariusslab() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.175F, 0.0F);


        this.arm = new ModelRenderer(this);
        this.arm.setRotationPoint(-0.732F, -3.3184F, -5.5627F);
        this.fossil.addChild(arm);
        this.setRotateAngle(arm, 1.5708F, -0.0873F, -1.5708F);
        this.arm.cubeList.add(new ModelBox(arm, 53, 47, -0.5059F, -0.5647F, -0.6475F, 1, 5, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5059F, 1.4353F, 0.3525F);
        this.arm.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4712F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 58, 0.0F, -1.7F, -1.0F, 1, 2, 1, -0.11F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.4353F, -0.2475F);
        this.arm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5626F, -0.046F, 0.0764F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.2F, -0.75F, 0.5F);
        this.leftArm2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 58, -1.75F, 0.2F, -0.8F, 1, 4, 1, -0.3F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.05F, 2.25F, -0.5F);
        this.leftArm2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 58, -0.5F, -2.8F, -0.5F, 1, 4, 1, -0.3F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.1F, -0.3F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.47F, 0.1226F, -0.1274F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 53, 54, -1.0388F, -0.0337F, -0.9491F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 10, 58, -1.0388F, 1.9163F, -0.9491F, 1, 3, 1, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 25, 58, -1.0388F, 1.9163F, 0.0509F, 1, 2, 1, -0.01F, false));

        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(-0.0388F, 0.6879F, -0.4515F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2616F, -0.009F, -0.0337F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 15, 58, -1.0F, 0.0F, -0.5F, 1, 3, 1, -0.02F, false));

        this.Display = new ModelRenderer(this);
        this.Display.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Display);
        this.setRotateAngle(Display, -0.0873F, 0.0F, 0.0F);
        this.Display.cubeList.add(new ModelBox(Display, 0, 0, -7.0F, -2.0F, -8.0F, 14, 2, 18, 0.0F, false));
        this.Display.cubeList.add(new ModelBox(Display, 0, 42, -6.0F, -2.5F, -7.0F, 12, 1, 14, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.25F, 8.0F);
        this.Display.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2705F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 42, -4.0F, -0.2F, -1.0F, 8, 1, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Display.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -6.5F, -1.075F, -7.85F, 13, 2, 18, 0.0F, false));

    }

    public void renderAll(float f) {
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
