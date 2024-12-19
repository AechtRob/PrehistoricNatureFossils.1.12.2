package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOxydactylusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck4;
    private final ModelRenderer neck5;
    private final ModelRenderer neck6;
    private final ModelRenderer head;
    private final ModelRenderer leftEye;
    private final ModelRenderer rightEye;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;

    public ModelSkeletonOxydactylusFrame() {
        this.textureWidth = 77;
        this.textureHeight = 77;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -31.6F, 10.7F, 1, 32, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.2F, -23.0F, -13.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3316F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -6.0F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.2F, -23.0F, -13.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3316F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -3.4F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -20.5F, 11.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -10.2F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -32.155F, 10.7159F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3927F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, -0.5F, 0.5F, 1.0F, 1, 1, 5, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 1.1013F, 1.6603F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.408F, -0.0974F, 0.0053F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.5016F, 0.7634F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1868F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.6193F, -1.976F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0036F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 10.0449F, -0.5841F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 2.0944F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, -0.2629F, -4.5144F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 1.1013F, 1.6603F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.7232F, -0.1314F, -0.1152F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.5016F, 0.7634F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.4923F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.6193F, -1.976F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0036F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 10.0449F, -0.5841F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.8762F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, -0.2629F, -4.5144F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.4491F, -3.2653F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.2715F, 0.0841F, 0.0234F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, -6.9F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3142F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 38, -0.5F, 0.6734F, -1.6788F, 1, 1, 2, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.6F, -3.9F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 0, -0.5F, 0.7048F, -2.9052F, 1, 1, 3, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8F, -6.9F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 22, -0.5F, 0.8F, 3.0F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.6844F, -8.6012F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.2464F, 0.127F, 0.0318F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2135F, 1.0404F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -2, 5, -0.5F, 0.4F, -6.5F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -4.8577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.088F, 0.1304F, -0.0115F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.0551F, 0.0564F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3665F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 28, -0.5F, 0.3F, -3.3F, 1, 1, 3, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0648F, -8.1008F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 53, -0.5F, 0.0F, -1.4F, 1, 1, 3, -0.15F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9F, -2.9F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4102F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -0.5F, 0.5145F, -4.9515F, 1, 1, 5, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.1F, 6.8509F, -8.6532F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0262F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.5957F, 2.2992F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.6283F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 9.7001F, 0.3382F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.5236F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 9.8517F, -0.0624F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.6109F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.1F, 6.8509F, -8.6532F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.8465F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.5957F, 2.2992F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.021F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 9.7001F, 0.3382F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.5672F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 9.8517F, -0.0624F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.6109F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.7F, -9.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.1309F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5061F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 12, -0.5F, -0.2F, -1.8F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2679F, 0.2106F, 0.0573F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9687F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 22, -0.5F, 0.5319F, 0.3279F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.1F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3167F, 0.2457F, -0.0914F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.7F, -2.0F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.8727F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 31, -0.5F, -2.7753F, -1.1709F, 1, 6, 1, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -3.2087F, -3.7109F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 1.0048F, 0.1344F, -0.1117F);
        this.neck4.cubeList.add(new ModelBox(neck4, 43, 24, -0.5F, -5.2F, -1.2F, 1, 5, 1, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2277F, 0.1862F, -0.1135F);
        this.neck5.cubeList.add(new ModelBox(neck5, 35, 54, -0.5F, -4.1F, -1.2F, 1, 4, 1, -0.15F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -3.9034F, 0.0259F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.2618F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 57, 60, -0.5F, -3.0F, -1.2F, 1, 3, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.9055F, -0.1071F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, -1.4399F, 0.0F, 0.0F);


        this.leftEye = new ModelRenderer(this);
        this.leftEye.setRotationPoint(1.0F, -0.003F, -3.0725F);
        this.head.addChild(leftEye);


        this.rightEye = new ModelRenderer(this);
        this.rightEye.setRotationPoint(-1.0F, -0.003F, -3.0725F);
        this.head.addChild(rightEye);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2123F, -1.7648F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 1.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 5, -0.5F, 0.5503F, -0.0853F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.4974F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 35, -0.5F, 0.5598F, -0.0232F, 1, 1, 3, -0.15F, false));

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
