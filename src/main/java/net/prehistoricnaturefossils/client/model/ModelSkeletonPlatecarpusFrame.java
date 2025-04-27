package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatecarpusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer frontleftflipper;
    private final ModelRenderer frontrightflipper;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer backleftflipper;
    private final ModelRenderer backrightflipper;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer tail9;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonPlatecarpusFrame() {
        this.textureWidth = 91;
        this.textureHeight = 91;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-4.0F, -38.15F, -13.1F);
        this.fossil.addChild(chest);
        this.setRotateAngle(chest, -0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5485F, -1.3877F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -0.3491F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, -5, 4.1791F, -0.2398F, -4.5F, 1, 1, 9, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.5485F, -1.3877F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.9199F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, -4, -0.5F, -0.2398F, -7.2791F, 1, 1, 8, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 0, -0.5F, 0.0F, -4.1F, 1, 1, 4, -0.15F, false));

        this.frontleftflipper = new ModelRenderer(this);
        this.frontleftflipper.setRotationPoint(3.9162F, 5.7061F, 1.0617F);
        this.chest.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.1888F, -0.3713F, 0.5037F);


        this.frontrightflipper = new ModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-3.9162F, 5.7061F, 1.0617F);
        this.chest.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, -0.1725F, 0.2483F, -0.5263F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(body);
        this.setRotateAngle(body, 0.186F, 0.1716F, 0.0321F);
        this.body.cubeList.add(new ModelBox(body, 45, 6, -0.5F, 0.3F, -0.4F, 1, 1, 4, -0.15F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 9, -0.5F, 0.3F, 3.3F, 1, 1, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.0087F, 3.8004F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.096F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 12, -0.5F, 0.3F, 0.2F, 1, 1, 4, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2784F, 7.7024F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.3678F, 0.0815F, -0.0313F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -0.5F, 0.4F, 0.0F, 1, 1, 6, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1848F, 0.1287F, -0.024F);
        this.body3.cubeList.add(new ModelBox(body3, 15, 0, -1.0F, 0.4F, -0.3F, 1, 1, 6, -0.15F, false));
        this.body3.cubeList.add(new ModelBox(body3, 20, 5, -1.0F, 0.4F, 5.4F, 1, 1, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(hips);
        this.setRotateAngle(hips, -0.0177F, 0.1745F, -0.0031F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 32, -1.0F, 0.4F, 0.0F, 1, 1, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.7478F, 3.2654F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5708F, 0.3927F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 31, -0.5F, -0.5F, -3.0F, 1, 1, 6, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.9F, 2.5F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.9635F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 33, -0.5F, -0.5F, -3.5F, 1, 1, 4, -0.16F, false));

        this.backleftflipper = new ModelRenderer(this);
        this.backleftflipper.setRotationPoint(1.8697F, 2.5093F, 3.7074F);
        this.hips.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.2527F, -0.4946F, 0.2506F);


        this.backrightflipper = new ModelRenderer(this);
        this.backrightflipper.setRotationPoint(-2.8697F, 2.5093F, 3.7074F);
        this.hips.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.2589F, 0.5368F, -0.238F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.007F, 4.9002F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1489F, 0.0863F, -0.0129F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 8, -1.0F, 0.4F, -0.1F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0718F, -0.127F, 0.0318F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.0F, 0.4F, -0.3F, 1, 1, 6, -0.15F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 5, 5, -1.0F, 0.4F, 5.4F, 1, 1, 1, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0989F, -0.2736F, 0.2027F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, -1.0F, 0.4F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0173F, -0.0431F, 0.0068F);
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 16, -1.0F, 0.4F, -0.3F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0174F, 5.9015F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3047F, -0.2421F, 0.2131F);
        this.tail5.cubeList.add(new ModelBox(tail5, 45, 43, -1.0F, 0.4F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0292F, 3.9044F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.351F, -0.1426F, 0.1416F);
        this.tail6.cubeList.add(new ModelBox(tail6, 13, 32, -1.0F, 0.4F, 0.0F, 1, 1, 5, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.0259F, 4.9034F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2967F, -0.1137F, 0.1161F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 24, -1.0F, 0.4F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.284F, -0.3753F, -0.0664F);
        this.tail8.cubeList.add(new ModelBox(tail8, 15, 24, -1.0F, 0.4F, -0.4F, 1, 1, 6, -0.15F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 20, 29, -1.0F, 0.4F, 5.3F, 1, 1, 1, -0.15F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, 0.2976F, -0.1016F, -0.2617F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail9.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 56, -1.0F, -0.2181F, -0.2781F, 1, 1, 2, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail9.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 50, -1.0F, 0.2F, 3.3F, 1, 1, 1, -0.15F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 47, -1.0F, 0.2F, -0.4F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.9F, -3.7F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1694F, 0.1722F, 0.1641F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.5F, -2.8F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 56, 0.0F, 0.2F, 2.3F, 1, 1, 1, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 54, 0.0F, 0.2F, -0.4F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -2.9F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1387F, 0.2406F, 0.1047F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 32, 0.0F, 0.2F, -2.9F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.3F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.2182F, 0.1309F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.9F, -1.3478F, -0.4013F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.9F, -1.3478F, -0.4013F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4538F, 0.0F, 0.0F);

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
