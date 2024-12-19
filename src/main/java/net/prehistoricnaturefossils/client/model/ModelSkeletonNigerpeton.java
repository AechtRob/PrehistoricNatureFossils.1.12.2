package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNigerpeton extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body9_r1;
    private final ModelRenderer body10_r1;
    private final ModelRenderer body8_r2;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body7_r2;
    private final ModelRenderer body8_r3;
    private final ModelRenderer body9_r2;
    private final ModelRenderer body7_r3;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body9_r3;
    private final ModelRenderer body8_r4;
    private final ModelRenderer body7_r4;
    private final ModelRenderer body8_r5;
    private final ModelRenderer body7_r5;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body6_r4;
    private final ModelRenderer body7_r6;
    private final ModelRenderer body8_r6;
    private final ModelRenderer body7_r7;
    private final ModelRenderer body6_r5;
    private final ModelRenderer body7_r8;
    private final ModelRenderer body6_r6;
    private final ModelRenderer body5_r4;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body5_r5;
    private final ModelRenderer body6_r7;
    private final ModelRenderer chest;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer body4_r3;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body9_r4;
    private final ModelRenderer body8_r7;
    private final ModelRenderer body7_r9;
    private final ModelRenderer body8_r8;
    private final ModelRenderer body7_r10;
    private final ModelRenderer body6_r8;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body2_r1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body8_r9;
    private final ModelRenderer body7_r11;
    private final ModelRenderer body6_r9;
    private final ModelRenderer body7_r12;
    private final ModelRenderer body6_r10;
    private final ModelRenderer body5_r6;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck;
    private final ModelRenderer body8_r10;
    private final ModelRenderer body9_r5;
    private final ModelRenderer body7_r13;
    private final ModelRenderer body8_r11;
    private final ModelRenderer head;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer bone10;
    private final ModelRenderer cube_r10;
    private final ModelRenderer bone12;
    private final ModelRenderer cube_r11;
    private final ModelRenderer bone14;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer bone19;
    private final ModelRenderer cube_r16;
    private final ModelRenderer bone20;
    private final ModelRenderer cube_r17;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer bone23;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer bone13;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r39;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer bone15;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer bone16;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer bone11;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer bone24;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer bone25;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;

    public ModelSkeletonNigerpeton() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.fossil.addChild(hips);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.55F, -4.1F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 62, 0.0F, -0.8F, 5.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 13, 0.0F, -0.8F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 6, 0.0F, -0.8F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -0.5F, -0.1F, 0.0F, 1, 1, 6, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-0.4F, 1.5523F, -0.7968F);
        this.hips.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.0567F, 0.0F, -0.1745F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 7, 54, -0.5F, -4.9936F, -0.7268F, 1, 3, 1, 0.0F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.6414F, 0.0F, -0.1745F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 25, 49, -1.0209F, 0.0271F, -0.6083F, 2, 3, 1, 0.005F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 56, 44, -1.0209F, 0.4271F, -1.6083F, 1, 2, 1, -0.006F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.4756F, 0.0F, -0.1745F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 45, 48, -1.0209F, -0.1994F, -0.6213F, 2, 3, 1, -0.003F, true));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body8_r1);
        this.setRotateAngle(body8_r1, -0.1577F, -0.0084F, -0.1049F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 60, 35, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body9_r1 = new ModelRenderer(this);
        this.body9_r1.setRotationPoint(-0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body9_r1);
        this.setRotateAngle(body9_r1, -0.1409F, -0.0716F, -0.5194F);
        this.body9_r1.cubeList.add(new ModelBox(body9_r1, 60, 33, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body10_r1 = new ModelRenderer(this);
        this.body10_r1.setRotationPoint(-0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body10_r1);
        this.setRotateAngle(body10_r1, -0.0864F, -0.1324F, -1.0423F);
        this.body10_r1.cubeList.add(new ModelBox(body10_r1, 59, 25, -2.4538F, -1.309F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body8_r2 = new ModelRenderer(this);
        this.body8_r2.setRotationPoint(-0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body8_r2);
        this.setRotateAngle(body8_r2, 1.4443F, 0.0F, -0.1745F);
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 32, 49, -1.0209F, -1.5005F, -2.874F, 1, 4, 1, 0.008F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.4F, 1.5523F, -0.7968F);
        this.hips.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.0567F, 0.0F, 0.1745F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 7, 54, -0.5F, -4.9936F, -0.7268F, 1, 3, 1, 0.0F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body6_r2);
        this.setRotateAngle(body6_r2, 0.6414F, 0.0F, 0.1745F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 25, 49, -0.9791F, 0.0271F, -0.6083F, 2, 3, 1, 0.005F, false));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 56, 44, 0.0209F, 0.4271F, -1.6083F, 1, 2, 1, -0.006F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.4756F, 0.0F, 0.1745F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 45, 48, -0.9791F, -0.1994F, -0.6213F, 2, 3, 1, -0.003F, false));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body7_r2);
        this.setRotateAngle(body7_r2, -0.1577F, 0.0084F, 0.1049F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 60, 35, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body8_r3 = new ModelRenderer(this);
        this.body8_r3.setRotationPoint(0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body8_r3);
        this.setRotateAngle(body8_r3, -0.1409F, 0.0716F, 0.5194F);
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 60, 33, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body9_r2 = new ModelRenderer(this);
        this.body9_r2.setRotationPoint(0.5F, -3.112F, -2.5933F);
        this.hips.addChild(body9_r2);
        this.setRotateAngle(body9_r2, -0.0864F, 0.1324F, 1.0423F);
        this.body9_r2.cubeList.add(new ModelBox(body9_r2, 59, 25, 1.4538F, -1.309F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body7_r3 = new ModelRenderer(this);
        this.body7_r3.setRotationPoint(0.4F, -1.4477F, -0.7968F);
        this.hips.addChild(body7_r3);
        this.setRotateAngle(body7_r3, 1.4443F, 0.0F, 0.1745F);
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 32, 49, 0.0209F, -1.5005F, -2.874F, 1, 4, 1, 0.008F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.8723F, -1.5735F, -0.633F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.186F, 0.1457F, 0.3345F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 38, 45, 0.904F, -0.3637F, -0.3152F, 3, 1, 1, 0.01F, false));
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 51, -0.096F, -0.3637F, -0.8152F, 1, 1, 2, 0.01F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.904F, 0.6363F, 1.1848F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -2.7225F, -1.2905F, 2.4819F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 20, 40, -0.6F, -1.0F, -1.0F, 4, 1, 1, -0.1F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 42, 39, -0.6F, -1.0F, 0.1F, 4, 1, 1, -0.1F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2267F, 0.9112F, -0.5097F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 28, 14, -0.25F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.8723F, -1.5735F, -0.633F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0702F, -1.244F, -0.4988F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 9, 46, -3.904F, -0.3637F, -0.3152F, 3, 1, 1, 0.01F, false));
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 52, 19, -0.904F, -0.3637F, -0.8152F, 1, 1, 2, 0.01F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.904F, 0.6363F, 1.1848F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.2654F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 41, -3.4F, -1.0F, -1.0F, 4, 1, 1, -0.1F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 42, 42, -3.4F, -1.0F, 0.1F, 4, 1, 1, -0.1F, false));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, -0.6981F, 0.4363F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 28, 19, -2.75F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.7F, 1.9F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2706F, -0.2527F, 0.0692F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 23, -0.5F, -0.3704F, -0.0668F, 1, 1, 5, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 23, 62, 0.0F, -1.0704F, 0.9332F, 0, 1, 1, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 62, 0.0F, -1.0704F, 2.9332F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.1296F, 1.4332F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4189F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 60, 0.0F, 0.2F, 1.7F, 0, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 63, 0.0F, -0.5F, -0.2F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.019F, 4.8218F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1155F, -0.4338F, -0.0487F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 14, -0.5F, -0.4128F, -0.0038F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 62, 0.0F, -1.0128F, -0.0038F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 51, 0.0F, -1.0128F, 1.9962F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 54, 0.0F, -1.0128F, 3.9962F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.1106F, -3.3886F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4189F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 62, 0.0F, 2.1F, 7.1F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 27, 0.0F, 1.8F, 5.3F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 37, 0.0F, 0.7F, 3.3F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0126F, 4.9831F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0481F, -0.4359F, -0.0203F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 11, -0.5F, -0.4062F, 0.0078F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 49, 63, 0.0F, -0.9062F, 1.0078F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0123F, 2.9956F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0472F, -0.3923F, -0.0181F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 30, -0.5F, -0.356F, 0.0165F, 1, 1, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 63, 0.0F, -0.756F, 0.0165F, 0, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.2F, -4.1F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.65F, -5.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 63, 0.0F, -0.8F, 5.0F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 63, 0.0F, -0.8F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 63, 0.0F, -0.8F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -0.5F, -0.1F, 0.0F, 1, 1, 6, 0.01F, false));

        this.body9_r3 = new ModelRenderer(this);
        this.body9_r3.setRotationPoint(-0.5F, -0.212F, -0.4933F);
        this.body.addChild(body9_r3);
        this.setRotateAngle(body9_r3, -0.0336F, -0.0418F, -1.0469F);
        this.body9_r3.cubeList.add(new ModelBox(body9_r3, 52, 25, -3.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body8_r4 = new ModelRenderer(this);
        this.body8_r4.setRotationPoint(-0.5F, -0.212F, -0.4933F);
        this.body.addChild(body8_r4);
        this.setRotateAngle(body8_r4, -0.05F, -0.0194F, -0.5235F);
        this.body8_r4.cubeList.add(new ModelBox(body8_r4, 61, 4, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r4 = new ModelRenderer(this);
        this.body7_r4.setRotationPoint(-0.5F, -0.212F, -0.4933F);
        this.body.addChild(body7_r4);
        this.setRotateAngle(body7_r4, -0.0536F, 0.0026F, -0.1052F);
        this.body7_r4.cubeList.add(new ModelBox(body7_r4, 61, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body8_r5 = new ModelRenderer(this);
        this.body8_r5.setRotationPoint(-0.5F, -0.312F, -2.4933F);
        this.body.addChild(body8_r5);
        this.setRotateAngle(body8_r5, 0.0188F, 0.0489F, -0.9944F);
        this.body8_r5.cubeList.add(new ModelBox(body8_r5, 44, 37, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body7_r5 = new ModelRenderer(this);
        this.body7_r5.setRotationPoint(-0.5F, -0.312F, -2.4933F);
        this.body.addChild(body7_r5);
        this.setRotateAngle(body7_r5, 0.0407F, 0.0329F, -0.4706F);
        this.body7_r5.cubeList.add(new ModelBox(body7_r5, 61, 0, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-0.5F, -0.312F, -2.4933F);
        this.body.addChild(body6_r3);
        this.setRotateAngle(body6_r3, 0.0506F, 0.0135F, -0.052F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 0, 61, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(-0.5F, -0.312F, -4.4933F);
        this.body.addChild(body5_r3);
        this.setRotateAngle(body5_r3, 0.0853F, 0.0172F, -0.0515F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 60, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r4 = new ModelRenderer(this);
        this.body6_r4.setRotationPoint(-0.5F, -0.312F, -4.4933F);
        this.body.addChild(body6_r4);
        this.setRotateAngle(body6_r4, 0.071F, 0.0504F, -0.4693F);
        this.body6_r4.cubeList.add(new ModelBox(body6_r4, 40, 60, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r6 = new ModelRenderer(this);
        this.body7_r6.setRotationPoint(-0.5F, -0.312F, -4.4933F);
        this.body.addChild(body7_r6);
        this.setRotateAngle(body7_r6, 0.0363F, 0.0791F, -0.9933F);
        this.body7_r6.cubeList.add(new ModelBox(body7_r6, 41, 27, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body8_r6 = new ModelRenderer(this);
        this.body8_r6.setRotationPoint(0.5F, -0.212F, -0.4933F);
        this.body.addChild(body8_r6);
        this.setRotateAngle(body8_r6, -0.0336F, 0.0418F, 1.0469F);
        this.body8_r6.cubeList.add(new ModelBox(body8_r6, 52, 25, 1.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body7_r7 = new ModelRenderer(this);
        this.body7_r7.setRotationPoint(0.5F, -0.212F, -0.4933F);
        this.body.addChild(body7_r7);
        this.setRotateAngle(body7_r7, -0.05F, 0.0194F, 0.5235F);
        this.body7_r7.cubeList.add(new ModelBox(body7_r7, 61, 4, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r5 = new ModelRenderer(this);
        this.body6_r5.setRotationPoint(0.5F, -0.212F, -0.4933F);
        this.body.addChild(body6_r5);
        this.setRotateAngle(body6_r5, -0.0536F, -0.0026F, 0.1052F);
        this.body6_r5.cubeList.add(new ModelBox(body6_r5, 61, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body7_r8 = new ModelRenderer(this);
        this.body7_r8.setRotationPoint(0.5F, -0.312F, -2.4933F);
        this.body.addChild(body7_r8);
        this.setRotateAngle(body7_r8, 0.0188F, -0.0489F, 0.9944F);
        this.body7_r8.cubeList.add(new ModelBox(body7_r8, 44, 37, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body6_r6 = new ModelRenderer(this);
        this.body6_r6.setRotationPoint(0.5F, -0.312F, -2.4933F);
        this.body.addChild(body6_r6);
        this.setRotateAngle(body6_r6, 0.0407F, -0.0329F, 0.4706F);
        this.body6_r6.cubeList.add(new ModelBox(body6_r6, 61, 0, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r4 = new ModelRenderer(this);
        this.body5_r4.setRotationPoint(0.5F, -0.312F, -2.4933F);
        this.body.addChild(body5_r4);
        this.setRotateAngle(body5_r4, 0.0506F, -0.0135F, 0.052F);
        this.body5_r4.cubeList.add(new ModelBox(body5_r4, 0, 61, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.5F, -0.312F, -4.4933F);
        this.body.addChild(body4_r2);
        this.setRotateAngle(body4_r2, 0.0853F, -0.0172F, 0.0515F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 60, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r5 = new ModelRenderer(this);
        this.body5_r5.setRotationPoint(0.5F, -0.312F, -4.4933F);
        this.body.addChild(body5_r5);
        this.setRotateAngle(body5_r5, 0.071F, -0.0504F, 0.4693F);
        this.body5_r5.cubeList.add(new ModelBox(body5_r5, 40, 60, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r7 = new ModelRenderer(this);
        this.body6_r7.setRotationPoint(0.5F, -0.312F, -4.4933F);
        this.body.addChild(body6_r7);
        this.setRotateAngle(body6_r7, 0.0363F, -0.0791F, 0.9933F);
        this.body6_r7.cubeList.add(new ModelBox(body6_r7, 41, 27, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 6.0F, -12.0F);
        this.chest.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.1222F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 50, 27, -0.5F, -2.975F, 5.4F, 1, 1, 2, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 41, 6, -3.5F, -2.975F, 6.1F, 1, 1, 3, 0.0F, true));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 41, 6, 2.5F, -2.975F, 6.1F, 1, 1, 3, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-2.5F, 4.4087F, -5.7513F);
        this.chest.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.1264F, 0.2598F, -0.0326F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 0, 48, -1.0F, -0.6341F, -0.1082F, 3, 1, 1, 0.0F, true));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(-0.5F, 4.3843F, -5.4498F);
        this.chest.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, -0.1227F, 0.1043F, -0.0064F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 47, 45, -3.0F, -0.5731F, 0.0955F, 3, 1, 1, -0.003F, true));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(-3.0F, 4.1954F, -3.85F);
        this.chest.addChild(body4_r3);
        this.setRotateAngle(body4_r3, 1.0647F, 0.0F, -0.1745F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 11, 40, -0.5F, -1.575F, -0.3976F, 1, 2, 3, 0.004F, true));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(-3.5995F, 2.0952F, -2.3904F);
        this.chest.addChild(body3_r1);
        this.setRotateAngle(body3_r1, 0.8158F, 0.1569F, -0.01F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 33, 39, -0.1743F, -1.7455F, -0.4401F, 1, 2, 3, 0.0F, true));

        this.body9_r4 = new ModelRenderer(this);
        this.body9_r4.setRotationPoint(-0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body9_r4);
        this.setRotateAngle(body9_r4, -0.003F, 0.2219F, -1.057F);
        this.body9_r4.cubeList.add(new ModelBox(body9_r4, 52, 23, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body8_r7 = new ModelRenderer(this);
        this.body8_r7.setRotationPoint(-0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body8_r7);
        this.setRotateAngle(body8_r7, 0.1098F, 0.1932F, -0.5224F);
        this.body8_r7.cubeList.add(new ModelBox(body8_r7, 61, 45, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r9 = new ModelRenderer(this);
        this.body7_r9.setRotationPoint(-0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body7_r9);
        this.setRotateAngle(body7_r9, 0.1788F, 0.1321F, -0.1023F);
        this.body7_r9.cubeList.add(new ModelBox(body7_r9, 45, 61, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body8_r8 = new ModelRenderer(this);
        this.body8_r8.setRotationPoint(-0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body8_r8);
        this.setRotateAngle(body8_r8, 0.0363F, 0.0791F, -1.0456F);
        this.body8_r8.cubeList.add(new ModelBox(body8_r8, 50, 31, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body7_r10 = new ModelRenderer(this);
        this.body7_r10.setRotationPoint(-0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body7_r10);
        this.setRotateAngle(body7_r10, 0.071F, 0.0504F, -0.5217F);
        this.body7_r10.cubeList.add(new ModelBox(body7_r10, 61, 43, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r8 = new ModelRenderer(this);
        this.body6_r8.setRotationPoint(-0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body6_r8);
        this.setRotateAngle(body6_r8, 0.0853F, 0.0172F, -0.1038F);
        this.body6_r8.cubeList.add(new ModelBox(body6_r8, 61, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(2.5F, 4.4087F, -5.7513F);
        this.chest.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.1264F, -0.2598F, 0.0326F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 48, -2.0F, -0.6341F, -0.1082F, 3, 1, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.5F, 4.3843F, -5.4498F);
        this.chest.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, -0.1227F, -0.1043F, 0.0064F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 47, 45, 0.0F, -0.5731F, 0.0955F, 3, 1, 1, -0.003F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(3.0F, 4.1954F, -3.85F);
        this.chest.addChild(body3_r2);
        this.setRotateAngle(body3_r2, 1.0647F, 0.0F, 0.1745F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 11, 40, -0.5F, -1.575F, -0.3976F, 1, 2, 3, 0.004F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(3.5995F, 2.0952F, -2.3904F);
        this.chest.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.8158F, -0.1569F, 0.01F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 33, 39, -0.8257F, -1.7455F, -0.4401F, 1, 2, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.25F, -4.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 37, 0.0F, -0.95F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 63, 0.0F, -0.85F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 7, -0.5F, -0.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body8_r9 = new ModelRenderer(this);
        this.body8_r9.setRotationPoint(0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body8_r9);
        this.setRotateAngle(body8_r9, -0.003F, -0.2219F, 1.057F);
        this.body8_r9.cubeList.add(new ModelBox(body8_r9, 52, 23, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body7_r11 = new ModelRenderer(this);
        this.body7_r11.setRotationPoint(0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body7_r11);
        this.setRotateAngle(body7_r11, 0.1098F, -0.1932F, 0.5224F);
        this.body7_r11.cubeList.add(new ModelBox(body7_r11, 61, 45, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r9 = new ModelRenderer(this);
        this.body6_r9.setRotationPoint(0.5F, -0.012F, -2.5933F);
        this.chest.addChild(body6_r9);
        this.setRotateAngle(body6_r9, 0.1788F, -0.1321F, 0.1023F);
        this.body6_r9.cubeList.add(new ModelBox(body6_r9, 45, 61, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body7_r12 = new ModelRenderer(this);
        this.body7_r12.setRotationPoint(0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body7_r12);
        this.setRotateAngle(body7_r12, 0.0363F, -0.0791F, 1.0456F);
        this.body7_r12.cubeList.add(new ModelBox(body7_r12, 50, 31, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body6_r10 = new ModelRenderer(this);
        this.body6_r10.setRotationPoint(0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body6_r10);
        this.setRotateAngle(body6_r10, 0.071F, -0.0504F, 0.5217F);
        this.body6_r10.cubeList.add(new ModelBox(body6_r10, 61, 43, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r6 = new ModelRenderer(this);
        this.body5_r6.setRotationPoint(0.5F, -0.012F, -0.5933F);
        this.chest.addChild(body5_r6);
        this.setRotateAngle(body5_r6, 0.0853F, -0.0172F, 0.1038F);
        this.body5_r6.cubeList.add(new ModelBox(body5_r6, 61, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.956F, 2.8681F, -2.4351F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.3143F, -0.0549F, 0.1605F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 53, 41, 0.784F, -0.6309F, -0.658F, 2, 1, 1, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 16, 53, 2.784F, -0.6309F, -1.158F, 1, 1, 2, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 37, 53, -0.216F, -0.6309F, -1.158F, 1, 1, 2, 0.01F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(3.784F, -0.1309F, -0.158F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1184F, 1.0224F, -0.0135F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 41, 21, -0.5F, -0.5F, -1.2F, 4, 1, 1, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 43, 0, -0.5F, -0.5F, 0.1F, 4, 1, 1, 0.0F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(3.25F, 0.5F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0757F, 0.0011F, -0.3332F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 28, 24, -0.25F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.956F, 2.8681F, -2.4351F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0163F, 1.1189F, -0.3741F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 44, 53, -2.784F, -0.6309F, -0.658F, 2, 1, 1, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 53, 33, -3.784F, -0.6309F, -1.158F, 1, 1, 2, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 53, 37, -0.784F, -0.6309F, -1.158F, 1, 1, 2, 0.01F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-3.784F, -0.1309F, -0.158F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1533F, -0.8997F, 0.0011F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 41, 24, -3.5F, -0.5F, -1.2F, 4, 1, 1, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 43, 3, -3.5F, -0.5F, 0.1F, 4, 1, 1, 0.0F, false));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-3.25F, 0.5F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0873F, -0.3491F, 0.3054F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 26, 29, -2.75F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4822F, 0.0224F, 0.208F);
        this.neck.cubeList.add(new ModelBox(neck, 41, 16, -0.5F, -0.4F, -2.95F, 1, 1, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 43, 63, 0.0F, -1.0F, -0.95F, 0, 1, 1, 0.0F, false));

        this.body8_r10 = new ModelRenderer(this);
        this.body8_r10.setRotationPoint(-0.4F, 0.088F, -0.5933F);
        this.neck.addChild(body8_r10);
        this.setRotateAngle(body8_r10, 0.342F, 0.2622F, -0.0984F);
        this.body8_r10.cubeList.add(new ModelBox(body8_r10, 55, 61, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body9_r5 = new ModelRenderer(this);
        this.body9_r5.setRotationPoint(-0.4F, 0.088F, -0.5933F);
        this.neck.addChild(body9_r5);
        this.setRotateAngle(body9_r5, 0.2064F, 0.3775F, -0.5233F);
        this.body9_r5.cubeList.add(new ModelBox(body9_r5, 50, 61, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r13 = new ModelRenderer(this);
        this.body7_r13.setRotationPoint(0.4F, 0.088F, -0.5933F);
        this.neck.addChild(body7_r13);
        this.setRotateAngle(body7_r13, 0.342F, -0.2622F, 0.0984F);
        this.body7_r13.cubeList.add(new ModelBox(body7_r13, 55, 61, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body8_r11 = new ModelRenderer(this);
        this.body8_r11.setRotationPoint(0.4F, 0.088F, -0.5933F);
        this.neck.addChild(body8_r11);
        this.setRotateAngle(body8_r11, 0.2064F, -0.3775F, 0.5233F);
        this.body8_r11.cubeList.add(new ModelBox(body8_r11, 50, 61, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -2.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1326F, -0.0001F, 0.1716F);


        this.bone9 = new ModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone9);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 33, 57, 0.7F, -1.12F, -0.9F, 1, 1, 1, 0.01F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 57, 52, 0.0F, -1.3F, -3.8F, 1, 1, 1, -0.15F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 60, 61, 0.1F, -1.01F, -3.6F, 1, 0, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.3537F, -0.2332F, 0.3342F);
        this.bone9.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 58, -0.2181F, -0.3866F, -0.3983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 57, -0.2181F, 0.0134F, -0.3983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 58, -0.2181F, -0.3866F, -3.3983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 48, -0.2181F, -0.7866F, -3.3983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 14, -0.2181F, -0.1866F, -2.7983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 58, -0.2181F, -0.5866F, -2.7983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 55, -0.9F, -0.4F, -2.0F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 57, -0.2181F, 0.1134F, -0.9983F, 1, 1, 1, -0.3F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 57, -0.2181F, -0.2866F, -0.9983F, 1, 1, 1, -0.3F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 54, -0.1F, -0.9F, 2.65F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 56, -0.1F, -0.9F, 0.4F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5411F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 0, -2.0F, -1.1F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.0F, -3.0F);
        this.bone9.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2443F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 34, -1.9858F, -1.1F, -0.1025F, 2, 1, 3, 0.0F, false));

        this.bone10 = new ModelRenderer(this);
        this.bone10.setRotationPoint(2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone10);
        this.setRotateAngle(bone10, 0.0436F, -0.0436F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6005F, -0.7F, 0.2039F);
        this.bone10.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0697F, 0.0F, -0.003F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 58, -0.2995F, -0.4002F, -0.2108F, 1, 1, 1, 0.0F, false));

        this.bone12 = new ModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone10.addChild(bone12);
        this.setRotateAngle(bone12, 0.0F, 0.6545F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6005F, -0.7F, -0.2039F);
        this.bone12.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0572F, -0.0013F, 0.04F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 60, -0.3159F, -0.4002F, -0.7408F, 1, 1, 1, -0.01F, false));

        this.bone14 = new ModelRenderer(this);
        this.bone14.setRotationPoint(-2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone14);
        this.setRotateAngle(bone14, 0.0436F, 0.0436F, 0.0F);


        this.bone17 = new ModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone14.addChild(bone17);
        this.setRotateAngle(bone17, 0.0F, -0.6545F, 0.0F);


        this.bone18 = new ModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone18);
        this.setRotateAngle(bone18, -0.0873F, 0.0F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(bone18, 13, 28, -1.0F, -1.1F, -4.0F, 2, 1, 4, 0.01F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 33, 57, -1.7F, -1.12F, -0.9F, 1, 1, 1, 0.01F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 57, 52, -1.0F, -1.3F, -3.8F, 1, 1, 1, -0.15F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 60, 61, -1.1F, -1.01F, -3.6F, 1, 0, 1, 0.0F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 5, 62, -1.0F, -0.25F, -3.7F, 2, 1, 0, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.3537F, -0.2332F, 0.3342F);
        this.bone18.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, -0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 58, -0.7819F, -0.3866F, -0.3983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 57, -0.7819F, 0.0134F, -0.3983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 58, -0.7819F, -0.3866F, -3.3983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 59, 48, -0.7819F, -0.7866F, -3.3983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 14, -0.7819F, -0.1866F, -2.7983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 58, -0.7819F, -0.5866F, -2.7983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 55, -0.1F, -0.4F, -2.0F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 57, -0.7819F, 0.1134F, -0.9983F, 1, 1, 1, -0.3F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 57, -0.7819F, -0.2866F, -0.9983F, 1, 1, 1, -0.3F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone18.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2618F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 54, 0.1F, -0.9F, 2.65F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 56, 0.1F, -0.9F, 0.4F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone18.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.5411F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 0, 0.0F, -1.1F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 0.0F, -3.0F);
        this.bone18.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2443F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 34, -0.0142F, -1.1F, -0.1025F, 2, 1, 3, 0.0F, true));

        this.bone19 = new ModelRenderer(this);
        this.bone19.setRotationPoint(-2.4F, -0.05F, -0.45F);
        this.bone18.addChild(bone19);
        this.setRotateAngle(bone19, 0.0436F, 0.0436F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.6005F, -0.7F, 0.2039F);
        this.bone19.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0697F, 0.0F, 0.003F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 59, 58, -0.7005F, -0.4002F, -0.2108F, 1, 1, 1, 0.0F, true));

        this.bone20 = new ModelRenderer(this);
        this.bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone19.addChild(bone20);
        this.setRotateAngle(bone20, 0.0F, -0.6545F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.6005F, -0.7F, -0.2039F);
        this.bone20.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0572F, 0.0013F, -0.04F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 60, -0.6841F, -0.4002F, -0.7408F, 1, 1, 1, -0.01F, true));

        this.bone21 = new ModelRenderer(this);
        this.bone21.setRotationPoint(2.4F, -0.05F, -0.45F);
        this.bone18.addChild(bone21);
        this.setRotateAngle(bone21, 0.0436F, -0.0436F, 0.0F);


        this.bone22 = new ModelRenderer(this);
        this.bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone21.addChild(bone22);
        this.setRotateAngle(bone22, 0.0F, 0.6545F, 0.0F);


        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone7);
        this.setRotateAngle(bone7, 0.0873F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3229F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 48, -0.5431F, -0.9F, 0.4916F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -0.2F, 0.0F);
        this.bone7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.288F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 7, -1.75F, -1.0F, -0.25F, 2, 1, 5, 0.0F, false));

        this.bone8 = new ModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, -0.3054F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.bone8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3054F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 63, -0.2884F, -0.95F, -0.1752F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(3.3137F, -1.4931F, 2.9487F);
        this.bone8.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0154F, 0.2589F, -1.0238F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 59, 17, -0.7F, -0.6F, -0.9F, 1, 1, 1, -0.004F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 59, -0.7F, -0.6F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(2.9137F, -1.4931F, 3.4487F);
        this.bone8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6088F, 0.2589F, -1.0238F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 10, -0.3709F, -1.165F, -0.9353F, 1, 1, 1, 0.005F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(2.7455F, -1.583F, 2.1553F);
        this.bone8.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2203F, 0.3795F, -0.8149F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 48, -0.9F, -0.7F, -1.5F, 1, 1, 2, 0.005F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(4.052F, -0.9492F, 1.8698F);
        this.bone8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3302F, 0.2372F, -0.8838F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 30, -0.9196F, -0.7642F, 0.4785F, 1, 1, 1, -0.008F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 59, -0.9196F, -0.7642F, -0.0215F, 1, 1, 1, -0.004F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(2.9024F, -1.4586F, 0.33F);
        this.bone8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2392F, 0.3706F, 0.5674F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 33, -1.4481F, 0.0036F, -0.0651F, 2, 1, 2, -0.004F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(3.5F, -0.1F, 0.2F);
        this.bone8.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0901F, 0.3924F, -0.0082F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 44, -1.9399F, -1.1413F, -0.1969F, 2, 1, 2, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone3);
        this.setRotateAngle(bone3, 0.0873F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.3229F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 48, 0.5431F, -0.9F, 0.4916F, 0, 1, 3, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.0F, -0.2F, 0.0F);
        this.bone3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.288F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 7, -0.25F, -1.0F, -0.25F, 2, 1, 5, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.bone3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -2.0F, -1.0F, -0.3F, 4, 1, 5, 0.01F, true));

        this.bone23 = new ModelRenderer(this);
        this.bone23.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone3.addChild(bone23);
        this.setRotateAngle(bone23, -0.3054F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.bone23.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.3054F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 52, 63, 0.2884F, -0.95F, -0.1752F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.3137F, -1.4931F, 2.9487F);
        this.bone23.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0154F, -0.2589F, 1.0238F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 17, -0.3F, -0.6F, -0.9F, 1, 1, 1, -0.004F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 59, -0.3F, -0.6F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.9137F, -1.4931F, 3.4487F);
        this.bone23.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6088F, -0.2589F, 1.0238F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 59, 10, -0.6291F, -1.165F, -0.9353F, 1, 1, 1, 0.005F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.7455F, -1.583F, 2.1553F);
        this.bone23.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2203F, -0.3795F, 0.8149F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 52, 48, -0.1F, -0.7F, -1.5F, 1, 1, 2, 0.005F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-4.052F, -0.9492F, 1.8698F);
        this.bone23.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3302F, -0.2372F, 0.8838F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 30, -0.0804F, -0.7642F, 0.4785F, 1, 1, 1, -0.008F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 27, 59, -0.0804F, -0.7642F, -0.0215F, 1, 1, 1, -0.004F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.9024F, -1.4586F, 0.33F);
        this.bone23.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2392F, -0.3706F, -0.5674F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 44, 33, -0.5519F, 0.0036F, -0.0651F, 2, 1, 2, -0.004F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.5F, -0.1F, 0.2F);
        this.bone23.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0901F, -0.3924F, 0.0082F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 44, -0.0601F, -1.1413F, -0.1969F, 2, 1, 2, 0.0F, true));

        this.bone13 = new ModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, 0.5F, -7.9F);
        this.head.addChild(bone13);
        this.setRotateAngle(bone13, 0.1745F, 0.0F, 0.0F);


        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.bone13.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.6981F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 59, 0.95F, 0.0F, 0.3F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, 0.0F, 3.15F);
        this.bone13.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.2443F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 43, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.01F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 3.35F);
        this.bone13.addChild(bone5);
        this.setRotateAngle(bone5, 0.2182F, 0.0F, 0.0F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.5F, 0.2F, 1.9F);
        this.bone5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0162F, 0.0065F, 0.3839F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 32, 60, 0.7F, 0.0F, -0.9F, 1, 1, 1, 0.014F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 15, 60, 0.0F, 0.0F, -0.9F, 1, 1, 1, 0.01F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.2618F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.7F, 2.2F);
        this.bone6.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.7854F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 57, 27, 0.1F, -0.5F, -0.7F, 1, 1, 1, -0.005F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.5F, 0.2F, 1.0F);
        this.bone6.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3665F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 59, 20, 0.0F, -0.03F, -0.8F, 1, 1, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 45, 0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.5F, -7.9F);
        this.head.addChild(bone4);
        this.setRotateAngle(bone4, 0.1745F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 36, -1.0F, 0.0F, 1.65F, 2, 1, 3, 0.01F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.bone4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.6981F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 22, 59, -1.95F, 0.0F, 0.3F, 1, 1, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.0F, 0.0F, 3.15F);
        this.bone4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.2443F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 43, -1.0F, 0.0F, -1.5F, 1, 1, 3, 0.01F, true));

        this.bone15 = new ModelRenderer(this);
        this.bone15.setRotationPoint(0.0F, 0.0F, 3.35F);
        this.bone4.addChild(bone15);
        this.setRotateAngle(bone15, 0.2182F, 0.0F, 0.0F);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5F, 0.2F, 1.9F);
        this.bone15.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0162F, -0.0065F, -0.3839F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 32, 60, -1.7F, 0.0F, -0.9F, 1, 1, 1, 0.014F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 60, -1.0F, 0.0F, -0.9F, 1, 1, 1, 0.01F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.2F, 1.9F);
        this.bone15.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0175F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 11, -1.5F, 0.0F, -0.9F, 3, 1, 1, 0.01F, true));

        this.bone16 = new ModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone15.addChild(bone16);
        this.setRotateAngle(bone16, -0.2618F, 0.0F, 0.0F);
        this.bone16.cubeList.add(new ModelBox(bone16, 39, 29, -1.5F, 0.2F, 0.0F, 3, 1, 2, 0.005F, true));
        this.bone16.cubeList.add(new ModelBox(bone16, 54, 3, -1.0F, 0.2F, 1.7F, 2, 1, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 0.7F, 2.2F);
        this.bone16.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.7854F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 57, 27, -1.1F, -0.5F, -0.7F, 1, 1, 1, -0.005F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.5F, 0.2F, 1.0F);
        this.bone16.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, -0.3665F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 59, 20, -1.0F, -0.03F, -0.8F, 1, 1, 1, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 29, 45, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 0.8022F, 1.3642F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.672F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 55, -0.9F, 0.4627F, -12.1911F, 2, 1, 1, 0.01F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.8F, 0.7127F, -12.1411F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.3491F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 18, 48, 0.15F, -0.75F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.8F, 0.7127F, -12.1411F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.2967F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 32, 0, -0.1F, -0.25F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, 0.7127F, -12.1411F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.3491F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 18, 48, -0.15F, -0.75F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.0F, 0.7127F, -12.1411F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.2967F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 32, 0, -0.9F, -0.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.65F, 0.4627F, -11.2411F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0873F, -0.2618F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 28, 55, -0.3932F, -1.5045F, -0.9484F, 1, 2, 1, -0.3F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.85F, 0.4627F, -11.2411F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0873F, 0.2618F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 28, 55, -0.6068F, -1.5045F, -0.9484F, 1, 2, 1, -0.3F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.1F, 1.4627F, -8.1411F);
        this.jaw.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.2356F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 50, 14, -0.3F, -1.4F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1396F, 0.2618F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 22, 34, -1.25F, -1.0F, -0.25F, 1, 1, 4, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.2618F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 11, 34, -1.25F, -1.0F, -0.25F, 1, 1, 4, 0.006F, false));

        this.bone11 = new ModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.bone2.addChild(bone11);
        this.setRotateAngle(bone11, -0.2182F, 0.0F, 0.0F);


        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(3.2F, 1.0F, 4.65F);
        this.bone11.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1222F, 0.3054F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 15, 21, 0.5035F, -0.95F, -4.8686F, 1, 1, 5, 0.006F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(3.2F, 1.0F, -0.35F);
        this.bone11.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.3054F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 19, 0, -1.0F, -0.95F, -0.1F, 1, 1, 5, 0.0F, false));

        this.bone24 = new ModelRenderer(this);
        this.bone24.setRotationPoint(0.1F, 1.4627F, -8.1411F);
        this.jaw.addChild(bone24);
        this.setRotateAngle(bone24, 0.1745F, 0.0F, 0.0F);


        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-2.4F, 0.0F, -0.05F);
        this.bone24.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.2356F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 50, 14, 0.3F, -1.4F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-2.4F, 0.0F, -0.05F);
        this.bone24.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1396F, -0.2618F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 22, 34, 0.25F, -1.0F, -0.25F, 1, 1, 4, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-2.4F, 0.0F, -0.05F);
        this.bone24.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.2618F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 11, 34, 0.25F, -1.0F, -0.25F, 1, 1, 4, 0.006F, true));

        this.bone25 = new ModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.bone24.addChild(bone25);
        this.setRotateAngle(bone25, -0.2182F, 0.0F, 0.0F);


        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-3.2F, 1.0F, 4.65F);
        this.bone25.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1222F, -0.3054F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 15, 21, -1.5035F, -0.95F, -4.8686F, 1, 1, 5, 0.006F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-3.2F, 1.0F, -0.35F);
        this.bone25.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.3054F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 19, 0, 0.0F, -0.95F, -0.1F, 1, 1, 5, 0.0F, true));

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
