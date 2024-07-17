package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDeinonychusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Deinonychus;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
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

    public ModelSkeletonDeinonychusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -16.6F, -16.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1047F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.1F, -3.0F, -0.5F, 1, 20, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -16.6F, -16.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.2F, -3.0F, -0.5F, 1, 7, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -17.35F, -5.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.85F, -3.0F, -0.5F, 1, 6, 1, -0.21F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -17.35F, -5.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0349F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -1.65F, -0.5F, 1, 19, 1, -0.21F, false));

        this.Deinonychus = new ModelRenderer(this);
        this.Deinonychus.setRotationPoint(0.0F, -19.0F, -6.25F);
        this.fossil.addChild(Deinonychus);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deinonychus.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.1F, -1.35F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 13, -0.5F, 0.7F, -0.2F, 1, 1, 6, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.176F, -0.1289F, -0.0229F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1191F, -0.1029F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -1, -1, -0.5F, 0.2F, 0.4F, 1, 1, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4309F, 6.8971F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1942F, -0.1726F, -0.0261F);
        this.tail2.cubeList.add(new ModelBox(tail2, -2, 17, -0.5F, 0.4916F, -0.3257F, 1, 1, 14, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3416F, 12.9743F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.096F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 0, -0.5F, 0.1605F, 0.1122F, 1, 1, 12, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1895F, 12.0122F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2545F, -0.1291F, 0.0217F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.4286F, -0.3954F, 1, 1, 17, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0437F, -0.0436F, -0.0019F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.45F, -4.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 26, -0.5F, 0.6286F, 0.2735F, 1, 1, 4, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.05F, -7.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 11, -0.5F, 0.75F, -0.3F, 1, 1, 4, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.35F, -6.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3494F, -0.041F, -0.0149F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4339F, -3.9914F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 6, -0.5F, -0.2F, 0.0F, 1, 1, 4, -0.2F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0474F, 2.7395F, -2.4157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9188F, 0.1396F, -0.3903F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.6353F, -0.6475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.0512F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 4.5F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.886F, -0.2748F, 0.218F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0474F, 2.7395F, -2.4157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0861F, -0.0696F, 0.2183F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.6353F, -0.6475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.5276F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 4.5F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7343F, 0.3108F, -0.3105F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.258F, -0.045F, -0.1687F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.1661F, -3.6914F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5477F, -0.2031F, -0.0791F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4208F, -2.9F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 44, -0.5F, -0.3F, -0.3F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1292F, -2.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3124F, -0.2079F, 0.0666F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.805F, -4.8573F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 34, -0.5F, 0.6F, 1.3F, 1, 1, 4, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.655F, -4.0573F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6458F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.1069F, -2.7077F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 31, -0.5F, 0.7F, 0.0F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.7137F, -3.7587F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7548F, 0.6772F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2783F, 0.0F, 0.0F);


        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.0F, 0.5F, 0.9F);
        this.Deinonychus.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1739F, 0.0151F, 0.0859F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6148F, -0.1308F, -0.0057F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8722F, -0.0334F, -0.0281F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.0472F, 0.0F, 0.0F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.3491F, 0.3054F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.3491F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.0F, 0.5F, 0.9F);
        this.Deinonychus.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.8271F, -0.0643F, -0.059F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1759F, 0.1264F, -0.0341F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.4744F, -0.0327F, 0.182F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.3F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4367F, 0.0395F, 0.0184F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.6981F, -0.3054F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -0.2618F, 0.0F, 0.0F);

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
