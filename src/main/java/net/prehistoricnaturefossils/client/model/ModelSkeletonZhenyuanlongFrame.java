package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonZhenyuanlongFrame extends ModelBase {
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
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
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
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonZhenyuanlongFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, -2.3F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -15.5F, -10.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4712F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -2.5F, -0.5F, 1, 18, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -15.5F, -10.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4624F, -0.0945F, 1.758F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.7F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, -16.8F, -1.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0101F, -0.0035F, 1.7619F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.0F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.571F, -2.1101F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1375F, 0.0242F, 0.1729F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 2.05F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 0, -0.5F, -0.5764F, -3.7378F, 1, 1, 5, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.4F, 0.4428F, 0.3394F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.2352F, 0.058F, -0.1647F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.7732F, 0.8274F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.1991F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.4858F, 0.1648F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9861F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 5.2632F, -0.1378F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.8988F, 0.0F, 0.0F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.7261F, -0.2841F, 0.1996F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -1.0048F, 0.2466F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0174F, -2.4015F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.5149F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.4F, 0.4428F, 0.3394F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2695F, -0.0233F, -0.0841F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.7732F, 0.8274F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.9711F, 0.2676F, 0.0089F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.4858F, 0.1648F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9861F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 5.2632F, -0.1378F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.5934F, 0.0F, 0.0F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.7261F, -0.2841F, 0.1996F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.743F, -0.2466F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0174F, -2.4015F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.4887F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.1F, 3.55F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0536F, 0.2179F, 0.0116F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2089F, -0.1695F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 6, -0.5F, 0.2F, -0.4F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2204F, 4.7363F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0289F, -0.4362F, -0.0122F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 16, -0.5F, 0.4916F, -0.0257F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3614F, 6.8539F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.009F, -0.2618F, 0.0023F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, -0.5F, 0.1605F, -0.2878F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2407F, 8.9832F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.064F, -0.3048F, 0.0192F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.8791F, 13.4004F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0175F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.5F, -14.0F, 1, 1, 14, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1162F, 0.2167F, 0.0251F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.45F, -4.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 31, -0.5F, 0.6286F, -0.1265F, 1, 1, 4, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.05F, -7.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 18, -0.5F, 0.65F, 0.0F, 1, 1, 3, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.35F, -6.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.248F, 0.1693F, 0.0426F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4339F, -3.9914F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, -1, -0.5F, -0.3F, 1.4F, 1, 1, 3, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.9459F, 1.4123F, -1.218F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.2577F, -0.1029F, -0.2496F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0949F, 4.2889F, -0.4475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.1799F, -0.2138F, 0.1529F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2015F, 3.4724F, -0.2705F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.9406F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0371F, 0.5313F, -0.6988F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.9459F, 1.4123F, -1.218F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.4884F, -0.3187F, 0.1359F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0949F, 4.2889F, -0.4475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.6941F, 0.3947F, -0.0319F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2015F, 3.4724F, -0.2705F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.9406F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(-0.0371F, 0.5313F, -0.6988F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.2661F, -1.9914F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3668F, 0.5839F, -0.185F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4208F, -2.9F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 53, -0.5F, -0.3F, 1.0F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0527F, -1.6216F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5376F, 0.4678F, 0.1602F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.805F, -4.8573F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 40, -0.5F, 0.5F, 1.7F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2621F, -2.6962F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2711F, 0.3038F, 0.1747F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7F, -4.0F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 0, -0.5F, 0.5F, 1.0F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1899F, -2.4109F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2094F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.107F, -0.0321F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1701F, 0.0F, 0.0F);

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
