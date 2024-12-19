package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPrenocephaleFrame extends ModelBase {
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
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonPrenocephaleFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.9F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -12.0F, -2.1F, 1, 12, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9F, -7.95F, -11.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, 0.95F, -0.5F, 1, 7, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, -4.9F, -11.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2533F, -0.067F, 1.8241F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.8F, -1.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -11.0F, -1.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.0F, -4.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -11.7634F, -2.2205F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1304F, -0.0114F, 0.0865F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 2.05F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 30, -0.5F, -0.7764F, -3.5378F, 1, 1, 4, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.4F, 0.1884F, 0.5272F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.8378F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.6113F, 0.0658F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3439F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.2989F, 0.5115F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.5687F, 0.089F, -0.1737F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.1117F, -0.0325F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.9425F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0086F, -1.4016F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0087F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.4F, 0.1884F, 0.5272F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.225F, -0.0294F, -0.1276F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.6113F, 0.0658F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1257F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.2989F, 0.5115F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1603F, 0.04F, 0.0174F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.1117F, -0.0325F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1134F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0086F, -1.4016F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0087F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.1F, 2.55F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1402F, 0.0864F, -0.0122F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2612F, 0.8291F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 19, -0.5F, 0.0F, -1.1F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.168F, 5.7349F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0271F, 0.2617F, 0.007F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 27, -0.5F, 0.3916F, -0.2257F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3527F, 5.8539F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2168F, 0.3844F, 0.0824F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 17, -0.5F, -0.0395F, -0.5878F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2407F, 8.9832F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.064F, 0.3048F, 0.0192F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.1791F, -0.0996F, 1, 1, 17, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.35F, -1.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2552F, 0.1267F, 0.033F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8373F, -3.8998F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 35, -0.5F, 0.4286F, -0.0265F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4373F, -6.8998F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 19, -0.5F, 0.45F, 0.2F, 1, 1, 3, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.0373F, -6.7998F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.4775F, 0.1553F, 0.0799F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4339F, -3.9914F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 34, -0.5F, -0.5F, -0.2F, 1, 1, 5, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(1.9774F, 1.6896F, -4.2233F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7934F, 0.474F, -0.0131F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0384F, 2.1539F, -0.7946F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3778F, 0.1244F, -0.0034F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.1464F, 1.983F, -0.0316F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0091F, -0.0852F, 0.5782F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0371F, 0.5313F, -0.6988F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.9774F, 1.6896F, -4.2233F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.2597F, -0.1115F, 0.5943F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0384F, 2.1539F, -0.7946F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0115F, -0.4555F, -0.2275F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.1464F, 1.983F, -0.0316F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.0059F, 0.0855F, -0.7533F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(-0.0371F, 0.5313F, -0.6988F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.1514F, -3.4185F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5498F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4208F, -2.9F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 28, -0.5F, -0.4F, 1.0F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0527F, -1.6216F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5397F, 0.3944F, -0.1905F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.105F, -0.8573F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5934F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 43, -0.5F, 0.1513F, -1.7458F, 1, 1, 2, -0.15F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.805F, -4.8573F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, -1, 57, -0.5F, 0.4F, 3.5F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0943F, -1.9168F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0889F, 0.0422F, 0.3636F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7F, -4.0F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 44, -0.5F, 0.6F, 2.0F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2845F, -2.1028F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6835F, -0.0523F, -0.2115F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, -0.6668F, -0.5623F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.0F, -0.6668F, -0.5623F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4743F, -0.7544F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.5543F, 0.0F, 0.0F);

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
