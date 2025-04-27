package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBuitreraptorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftSickleClaw;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightSickleClaw;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonBuitreraptorFrame() {
        this.textureWidth = 66;
        this.textureHeight = 66;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -15.6F, -0.8F, 1, 16, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.6F, -13.5F, -8.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.8F, 2.7F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.6F, -8.5F, -8.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2591F, -0.0383F, 1.4274F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.6F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.5F, -0.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.0F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -15.8503F, 0.2869F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.48F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 26, -1.0F, -0.3F, -0.2F, 1, 1, 4, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.3F, 0.6662F, -0.8587F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.9145F, 0.0692F, 0.0532F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.6013F, 0.7637F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3526F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.9786F, 0.111F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.3963F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.3F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.8708F, 0.0668F, -0.0562F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.5477F, -0.1218F, -0.1513F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.6545F, 0.3054F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.2182F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.3F, 0.6662F, -0.8587F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3873F, -0.0665F, -0.1615F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.6013F, 0.7637F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3963F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.9786F, 0.111F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8286F, 0.0322F, 0.0295F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.3F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.8727F, 0.0F, 0.0F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.5477F, -0.1218F, -0.1513F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.6545F, -0.3054F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.48F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.088F, -0.1304F, -0.0115F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.7F, -3.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 20, -1.0F, 0.7F, 0.0F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -3.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.088F, -0.1304F, 0.0115F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.2F, -3.7F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 7, -1.0F, 0.7036F, -0.8441F, 1, 1, 1, -0.15F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 6, -1.0F, 0.7036F, -2.5441F, 1, 1, 2, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.2F, -0.8F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 20, -1.0F, 0.2F, -3.0F, 1, 1, 4, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.4652F, 2.8501F, -3.9924F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.5791F, -0.1823F, -1.358F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1099F, 5.6146F, -0.7514F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.0948F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2383F, 4.7275F, -1.1258F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.6881F, -0.1814F, 0.1881F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.4652F, 2.8501F, -3.9924F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.7608F, 0.2483F, 0.9346F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1099F, 5.6146F, -0.7514F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.0948F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2383F, 4.7275F, -1.1258F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.705F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3F, -5.6F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.1801F, 0.1707F, -0.0366F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 55, -1.0F, -0.1643F, 0.2306F, 1, 1, 1, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.6F, -3.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 51, -1.0F, -0.3F, 1.8F, 1, 1, 1, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 50, -1.0F, -0.3F, 0.1F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0002F, -0.0394F, 0.1517F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.7F, -1.9F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7941F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 30, -1.0F, 0.6738F, 3.3312F, 1, 1, 1, -0.15F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 27, -1.0F, 0.6738F, -0.3688F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.9047F, -0.0983F, 0.1168F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2F, -1.6F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4014F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 10, -0.5F, 0.6324F, 0.3085F, 1, 1, 2, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.8F, -1.6F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 55, -0.5F, 0.2326F, -0.9054F, 1, 1, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -2.7F);
        this.neck.addChild(head);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.33F, 3.4533F, -6.5752F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.33F, 3.4533F, -6.5752F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.0324F, 0.3458F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.0559F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 0.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0443F, 0.1744F, -0.0077F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, 0.2F, -0.5F, 1, 1, 8, -0.15F, false));
        this.tail.cubeList.add(new ModelBox(tail, 7, 7, -0.5F, 0.2F, 7.2F, 1, 1, 1, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1224F, 0.2911F, -0.1609F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 10, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.011F, 7.9604F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3555F, 0.2874F, -0.1049F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 10, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0192F, 7.8744F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2946F, 0.209F, -0.0629F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 0, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

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
