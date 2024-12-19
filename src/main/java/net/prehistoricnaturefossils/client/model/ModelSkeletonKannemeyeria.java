package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKannemeyeria extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer basin_r5;
    private final ModelRenderer basin_r6;
    private final ModelRenderer basin_r7;
    private final ModelRenderer basin_r8;
    private final ModelRenderer basin_r9;
    private final ModelRenderer basin_r10;
    private final ModelRenderer basin_r11;
    private final ModelRenderer basin_r12;
    private final ModelRenderer basin_r13;
    private final ModelRenderer basin_r14;
    private final ModelRenderer basin_r15;
    private final ModelRenderer basin_r16;
    private final ModelRenderer cube_r3;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2_r1;
    private final ModelRenderer feet1;
    private final ModelRenderer feet2_r1;
    private final ModelRenderer feet1_r1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3_r1;
    private final ModelRenderer feet2;
    private final ModelRenderer feet3_r1;
    private final ModelRenderer feet2_r2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer neck21_r1;
    private final ModelRenderer neck20_r1;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck20_r2;
    private final ModelRenderer neck19_r2;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck19_r3;
    private final ModelRenderer neck18_r2;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck18_r3;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck21_r2;
    private final ModelRenderer neck20_r3;
    private final ModelRenderer neck22_r1;
    private final ModelRenderer neck21_r3;
    private final ModelRenderer neck20_r4;
    private final ModelRenderer neck19_r4;
    private final ModelRenderer neck20_r5;
    private final ModelRenderer neck19_r5;
    private final ModelRenderer neck18_r4;
    private final ModelRenderer neck19_r6;
    private final ModelRenderer neck18_r5;
    private final ModelRenderer neck17_r4;
    private final ModelRenderer neck18_r6;
    private final ModelRenderer neck17_r5;
    private final ModelRenderer neck16_r5;
    private final ModelRenderer neck15_r5;
    private final ModelRenderer neck17_r6;
    private final ModelRenderer neck16_r6;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer chest_r10;
    private final ModelRenderer chest_r11;
    private final ModelRenderer chest_r12;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck20_r6;
    private final ModelRenderer neck19_r7;
    private final ModelRenderer neck18_r7;
    private final ModelRenderer neck19_r8;
    private final ModelRenderer neck18_r8;
    private final ModelRenderer neck17_r7;
    private final ModelRenderer neck18_r9;
    private final ModelRenderer neck17_r8;
    private final ModelRenderer neck16_r7;
    private final ModelRenderer neck17_r9;
    private final ModelRenderer neck16_r8;
    private final ModelRenderer neck15_r6;
    private final ModelRenderer neck16_r9;
    private final ModelRenderer neck15_r7;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck15_r8;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck15_r9;
    private final ModelRenderer neck14_r6;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck14_r7;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck20_r7;
    private final ModelRenderer neck19_r9;
    private final ModelRenderer neck21_r4;
    private final ModelRenderer neck20_r8;
    private final ModelRenderer neck19_r10;
    private final ModelRenderer neck18_r10;
    private final ModelRenderer neck19_r11;
    private final ModelRenderer neck18_r11;
    private final ModelRenderer neck17_r10;
    private final ModelRenderer neck18_r12;
    private final ModelRenderer neck17_r11;
    private final ModelRenderer neck16_r10;
    private final ModelRenderer neck17_r12;
    private final ModelRenderer neck16_r11;
    private final ModelRenderer neck15_r10;
    private final ModelRenderer neck14_r8;
    private final ModelRenderer neck16_r12;
    private final ModelRenderer neck15_r11;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer lowerarm4_r1;
    private final ModelRenderer lowerarm2_r1;
    private final ModelRenderer hand1;
    private final ModelRenderer hand2_r1;
    private final ModelRenderer hand2_r2;
    private final ModelRenderer hand2_r3;
    private final ModelRenderer hand2_r4;
    private final ModelRenderer hand1_r1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer lowerarm5_r1;
    private final ModelRenderer lowerarm3_r1;
    private final ModelRenderer hand2;
    private final ModelRenderer hand3_r1;
    private final ModelRenderer hand3_r2;
    private final ModelRenderer hand3_r3;
    private final ModelRenderer hand3_r4;
    private final ModelRenderer hand2_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r18;
    private final ModelRenderer neck22_r2;
    private final ModelRenderer neck21_r5;
    private final ModelRenderer neck20_r9;
    private final ModelRenderer neck21_r6;
    private final ModelRenderer neck20_r10;
    private final ModelRenderer neck21_r7;
    private final ModelRenderer neck19_r12;
    private final ModelRenderer neck20_r11;
    private final ModelRenderer cube_r19;
    private final ModelRenderer head;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer leftTusk;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer rightTusk;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;

    public ModelSkeletonKannemeyeria() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -29.0F, -8.0F);
        this.fossil.addChild(body);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.5605F, 26.1222F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5061F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 26, 0.0F, -1.6976F, -0.1335F, 0, 2, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.7605F, 18.1222F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 52, 0.0F, -2.7423F, 5.9997F, 0, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 95, 0.0F, -2.7423F, 3.9997F, 0, 3, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 94, 0.0F, -2.6423F, 1.9997F, 0, 3, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 16, 0.0F, -2.4423F, -0.0003F, 0, 3, 1, 0.0F, false));

        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.8988F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 58, -1.7708F, -4.3202F, -2.6452F, 2, 4, 5, 0.0F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 58, 8.2292F, -4.3202F, -2.6452F, 2, 4, 5, 0.0F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -1.2392F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 0, 34, -1.7708F, -1.5256F, -5.0992F, 2, 4, 7, 0.003F, true));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 0, 34, 8.2292F, -1.5256F, -5.0992F, 2, 4, 7, 0.003F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.2705F, 0.0F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 22, 93, -1.7708F, -5.0746F, -1.6485F, 2, 3, 2, -0.003F, true));
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 22, 93, 8.2292F, -5.0746F, -1.6485F, 2, 3, 2, -0.003F, false));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-4.2292F, 2.0103F, 18.8318F);
        this.body.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -0.2967F, 0.0F, 0.0F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 0, 95, -1.7708F, 4.116F, -0.1029F, 2, 2, 2, 0.0F, true));
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 15, 72, -1.7708F, 0.116F, -0.1029F, 2, 4, 4, 0.0F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r5);
        this.setRotateAngle(basin_r5, -1.2696F, 0.1346F, -0.4439F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 25, 21, -2.217F, -2.5284F, 0.7958F, 2, 5, 7, 0.003F, true));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -1.8368F, 0.1346F, -0.4439F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 32, 61, -2.217F, -6.432F, 1.8078F, 2, 3, 5, 0.0F, true));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -2.2557F, 0.1346F, -0.4439F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 81, 4, -2.217F, -6.0375F, 3.4479F, 2, 2, 4, -0.003F, true));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -1.034F, 0.1346F, -0.4439F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 79, 66, -2.217F, 2.0288F, 2.3145F, 2, 2, 4, 0.0F, true));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(-4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r9);
        this.setRotateAngle(basin_r9, -1.8456F, 0.1346F, -0.4439F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 11, 88, -2.217F, -0.9082F, 1.491F, 2, 2, 3, -0.003F, true));

        this.basin_r10 = new ModelRenderer(this);
        this.basin_r10.setRotationPoint(-2.5F, 4.6902F, 22.4647F);
        this.body.addChild(basin_r10);
        this.setRotateAngle(basin_r10, -0.192F, 0.0F, 0.0F);
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 19, 34, -1.5F, -1.6F, -3.5F, 3, 1, 7, 0.003F, true));
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 19, 34, 3.5F, -1.6F, -3.5F, 3, 1, 7, 0.003F, false));

        this.basin_r11 = new ModelRenderer(this);
        this.basin_r11.setRotationPoint(4.2292F, 2.0103F, 18.8318F);
        this.body.addChild(basin_r11);
        this.setRotateAngle(basin_r11, -0.2967F, 0.0F, 0.0F);
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 0, 95, -0.2292F, 4.116F, -0.1029F, 2, 2, 2, 0.0F, false));
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 15, 72, -0.2292F, 0.116F, -0.1029F, 2, 4, 4, 0.0F, false));

        this.basin_r12 = new ModelRenderer(this);
        this.basin_r12.setRotationPoint(4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r12);
        this.setRotateAngle(basin_r12, -1.2696F, -0.1346F, 0.4439F);
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 25, 21, 0.217F, -2.5284F, 0.7958F, 2, 5, 7, 0.003F, false));

        this.basin_r13 = new ModelRenderer(this);
        this.basin_r13.setRotationPoint(4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r13);
        this.setRotateAngle(basin_r13, -1.8368F, -0.1346F, 0.4439F);
        this.basin_r13.cubeList.add(new ModelBox(basin_r13, 32, 61, 0.217F, -6.432F, 1.8078F, 2, 3, 5, 0.0F, false));

        this.basin_r14 = new ModelRenderer(this);
        this.basin_r14.setRotationPoint(4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r14);
        this.setRotateAngle(basin_r14, -2.2557F, -0.1346F, 0.4439F);
        this.basin_r14.cubeList.add(new ModelBox(basin_r14, 81, 4, 0.217F, -6.0375F, 3.4479F, 2, 2, 4, -0.003F, false));

        this.basin_r15 = new ModelRenderer(this);
        this.basin_r15.setRotationPoint(4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r15);
        this.setRotateAngle(basin_r15, -1.034F, -0.1346F, 0.4439F);
        this.basin_r15.cubeList.add(new ModelBox(basin_r15, 79, 66, 0.217F, 2.0288F, 2.3145F, 2, 2, 4, 0.0F, false));

        this.basin_r16 = new ModelRenderer(this);
        this.basin_r16.setRotationPoint(4.2292F, 6.0103F, 22.7318F);
        this.body.addChild(basin_r16);
        this.setRotateAngle(basin_r16, -1.8456F, -0.1346F, 0.4439F);
        this.basin_r16.cubeList.add(new ModelBox(basin_r16, 11, 88, 0.217F, -0.9082F, 1.491F, 2, 2, 3, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.6F, 18.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2356F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 21, -1.0F, -0.0121F, -0.0463F, 2, 2, 10, -0.003F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.0399F, -0.1034F, -0.2533F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 69, 26, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 58, 75, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.2839F, 11.1184F, -0.9447F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.4068F, -0.083F, 0.3154F);


        this.leg2_r1 = new ModelRenderer(this);
        this.leg2_r1.setRotationPoint(0.1816F, 4.2372F, 1.1145F);
        this.leg1.addChild(leg2_r1);
        this.setRotateAngle(leg2_r1, 1.8627F, 1.5246F, 1.7815F);
        this.leg2_r1.cubeList.add(new ModelBox(leg2_r1, 33, 85, -0.4531F, -3.8317F, 0.6108F, 2, 8, 1, 0.0F, false));
        this.leg2_r1.cubeList.add(new ModelBox(leg2_r1, 80, 26, -0.535F, -4.845F, -1.7873F, 2, 9, 2, 0.0F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.0885F, 8.9576F, 0.4756F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.3334F, -0.0204F, -0.0277F);


        this.feet2_r1 = new ModelRenderer(this);
        this.feet2_r1.setRotationPoint(0.0012F, 3.3818F, -2.718F);
        this.feet1.addChild(feet2_r1);
        this.setRotateAngle(feet2_r1, 0.6197F, 0.01F, -0.1073F);
        this.feet2_r1.cubeList.add(new ModelBox(feet2_r1, 41, 2, -3.1772F, -1.9865F, 0.4319F, 6, 2, 4, 0.0F, false));

        this.feet1_r1 = new ModelRenderer(this);
        this.feet1_r1.setRotationPoint(0.0012F, 2.3818F, -5.018F);
        this.feet1.addChild(feet1_r1);
        this.setRotateAngle(feet1_r1, -0.0041F, -0.0059F, -0.0341F);
        this.feet1_r1.cubeList.add(new ModelBox(feet1_r1, 44, 16, -3.1978F, -0.9966F, -1.9638F, 6, 2, 4, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.258F, 0.1034F, 0.2533F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 47, 69, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 71, 75, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.2839F, 11.1184F, -0.9447F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.4068F, 0.083F, -0.3154F);


        this.leg3_r1 = new ModelRenderer(this);
        this.leg3_r1.setRotationPoint(-0.1816F, 4.2372F, 1.1145F);
        this.leg2.addChild(leg3_r1);
        this.setRotateAngle(leg3_r1, 1.8627F, -1.5246F, -1.7815F);
        this.leg3_r1.cubeList.add(new ModelBox(leg3_r1, 50, 89, -1.5469F, -3.8317F, 0.6108F, 2, 8, 1, 0.0F, false));
        this.leg3_r1.cubeList.add(new ModelBox(leg3_r1, 41, 80, -1.465F, -4.845F, -1.7873F, 2, 9, 2, 0.0F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0885F, 8.9576F, 0.4756F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1153F, 0.0204F, 0.0277F);


        this.feet3_r1 = new ModelRenderer(this);
        this.feet3_r1.setRotationPoint(-0.0012F, 3.3818F, -2.718F);
        this.feet2.addChild(feet3_r1);
        this.setRotateAngle(feet3_r1, 0.6197F, -0.01F, 0.1073F);
        this.feet3_r1.cubeList.add(new ModelBox(feet3_r1, 41, 9, -2.8228F, -1.9865F, 0.4319F, 6, 2, 4, 0.0F, false));

        this.feet2_r2 = new ModelRenderer(this);
        this.feet2_r2.setRotationPoint(-0.0012F, 2.3818F, -5.018F);
        this.feet2.addChild(feet2_r2);
        this.setRotateAngle(feet2_r2, -0.0041F, 0.0059F, 0.0341F);
        this.feet2_r2.cubeList.add(new ModelBox(feet2_r2, 44, 23, -2.8022F, -0.9966F, -1.9638F, 6, 2, 4, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 4.7F, 27.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.8239F, -0.3297F, 0.2912F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 75, -1.0F, 0.022F, -0.9372F, 2, 9, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(15.0F, 0.022F, 1.0628F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 23, -15.0F, 8.0F, 0.4F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 91, 47, -15.0F, 6.0F, 0.4F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 69, -15.0F, 4.0F, -0.6F, 0, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 52, -15.0F, 2.0F, -0.6F, 0, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 104, -15.0F, 0.0F, -0.6F, 0, 1, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 8.822F, 0.3628F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1289F, 0.0227F, -0.1731F);
        this.tail2.cubeList.add(new ModelBox(tail2, 68, 91, -0.5F, -0.8285F, -0.4852F, 1, 9, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.6F, 17.8F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2628F, 0.0843F, 0.0226F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.6F, -28.1F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 100, 0.0F, -6.7693F, 9.9896F, 0, 4, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 107, 19, -1.1F, -4.0625F, -2.7484F, 0, 4, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 86, 106, -1.1F, -3.0625F, -4.7484F, 0, 4, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 83, 106, -1.1F, -2.1625F, -6.7484F, 0, 4, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 108, -1.1F, -1.0625F, -8.7484F, 0, 3, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 89, 108, -1.1F, -0.4625F, -10.7484F, 0, 3, 1, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 1.2466F, -0.0823F, 0.3684F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 34, 50, -7.0377F, -3.3543F, -9.3892F, 1, 4, 6, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 1.2708F, -0.1495F, 0.1594F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 63, 83, -8.7802F, -2.3543F, -11.2559F, 1, 3, 4, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 1.4499F, -0.3123F, -0.5859F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 19, 43, -14.2353F, -3.3543F, -8.8241F, 1, 6, 6, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r4);
        this.setRotateAngle(chest_r4, -2.0144F, 1.4319F, 2.8697F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 49, 99, 9.4549F, -4.5969F, -14.0999F, 1, 6, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 1.4616F, 0.5002F, 0.2336F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 98, 103, 3.7029F, -6.2695F, -15.4343F, 2, 3, 1, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 1.3582F, -0.0157F, 0.0807F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 40, 92, -3.6566F, -3.4427F, -16.2378F, 3, 6, 1, 0.0F, true));

        this.neck21_r1 = new ModelRenderer(this);
        this.neck21_r1.setRotationPoint(-1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck21_r1);
        this.setRotateAngle(neck21_r1, -0.0557F, -0.0835F, -1.2905F);
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 103, 10, -8.6791F, -3.3688F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck20_r1 = new ModelRenderer(this);
        this.neck20_r1.setRotationPoint(-1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck20_r1);
        this.setRotateAngle(neck20_r1, -0.0858F, -0.0521F, -0.8543F);
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 103, 8, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(-1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, -0.1003F, 0.002F, -0.2894F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 61, 108, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck20_r2 = new ModelRenderer(this);
        this.neck20_r2.setRotationPoint(-1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck20_r2);
        this.setRotateAngle(neck20_r2, -0.0366F, -0.0443F, -1.2743F);
        this.neck20_r2.cubeList.add(new ModelBox(neck20_r2, 91, 45, -10.6791F, -3.3688F, -0.5F, 6, 0, 1, 0.0F, true));

        this.neck19_r2 = new ModelRenderer(this);
        this.neck19_r2.setRotationPoint(-1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck19_r2);
        this.setRotateAngle(neck19_r2, -0.0518F, -0.0247F, -0.8381F);
        this.neck19_r2.cubeList.add(new ModelBox(neck19_r2, 102, 38, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, -0.057F, 0.007F, -0.2717F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 75, 107, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck19_r3 = new ModelRenderer(this);
        this.neck19_r3.setRotationPoint(-1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck19_r3);
        this.setRotateAngle(neck19_r3, -0.0213F, -0.0129F, -1.2049F);
        this.neck19_r3.cubeList.add(new ModelBox(neck19_r3, 68, 0, -12.6791F, -3.3688F, -0.5F, 8, 0, 1, 0.0F, true));

        this.neck18_r2 = new ModelRenderer(this);
        this.neck18_r2.setRotationPoint(-1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck18_r2);
        this.setRotateAngle(neck18_r2, -0.0247F, -0.0027F, -0.7687F);
        this.neck18_r2.cubeList.add(new ModelBox(neck18_r2, 100, 84, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, -0.0223F, 0.011F, -0.2016F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 47, 107, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck18_r3 = new ModelRenderer(this);
        this.neck18_r3.setRotationPoint(-1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck18_r3);
        this.setRotateAngle(neck18_r3, -0.0175F, -0.005F, -1.1526F);
        this.neck18_r3.cubeList.add(new ModelBox(neck18_r3, 59, 38, -14.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, -0.0179F, 0.0028F, -0.7163F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 100, 80, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(-1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -0.0136F, 0.012F, -0.1492F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 107, 33, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(-1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, -0.0175F, -0.005F, -1.109F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 44, 30, -15.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, -0.0179F, 0.0028F, -0.6727F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 73, 100, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -0.0136F, 0.012F, -0.1055F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 107, 31, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, -0.009F, 0.0102F, -1.0828F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 40, 36, -16.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -0.0038F, 0.0131F, -0.6464F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 54, 100, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, 0.0038F, 0.0131F, -0.0791F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 107, 29, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(-1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, 0.0095F, 0.0399F, -1.0998F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 41, 0, -16.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(-1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, 0.0255F, 0.0321F, -0.6632F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 103, 6, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, 0.0387F, 0.0134F, -0.0961F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 54, 108, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(-1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, 0.0213F, 0.0129F, -0.0789F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 107, 27, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(-1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, 0.011F, 0.0223F, -0.6462F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 98, 91, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(-1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, 0.0005F, 0.0249F, -1.0826F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 40, 34, -16.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, true));

        this.neck21_r2 = new ModelRenderer(this);
        this.neck21_r2.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck21_r2);
        this.setRotateAngle(neck21_r2, 0.4281F, 0.3487F, -0.7117F);
        this.neck21_r2.cubeList.add(new ModelBox(neck21_r2, 103, 4, -6.654F, -3.6405F, -8.5845F, 4, 0, 1, 0.0F, true));

        this.neck20_r3 = new ModelRenderer(this);
        this.neck20_r3.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck20_r3);
        this.setRotateAngle(neck20_r3, 0.5401F, 0.0787F, -0.1992F);
        this.neck20_r3.cubeList.add(new ModelBox(neck20_r3, 28, 108, -4.1944F, -1.6444F, -8.5845F, 2, 0, 1, 0.0F, true));

        this.neck22_r1 = new ModelRenderer(this);
        this.neck22_r1.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck22_r1);
        this.setRotateAngle(neck22_r1, 0.2399F, 0.4945F, -1.1637F);
        this.neck22_r1.cubeList.add(new ModelBox(neck22_r1, 79, 73, -11.4714F, -6.103F, -8.5845F, 7, 0, 1, 0.0F, true));

        this.neck21_r3 = new ModelRenderer(this);
        this.neck21_r3.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck21_r3);
        this.setRotateAngle(neck21_r3, 0.1423F, 0.6046F, -1.3395F);
        this.neck21_r3.cubeList.add(new ModelBox(neck21_r3, 103, 61, -6.0211F, -6.0204F, -10.5667F, 3, 0, 1, 0.0F, true));

        this.neck20_r4 = new ModelRenderer(this);
        this.neck20_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck20_r4);
        this.setRotateAngle(neck20_r4, 0.4017F, 0.4846F, -0.8471F);
        this.neck20_r4.cubeList.add(new ModelBox(neck20_r4, 98, 36, -5.3047F, -4.1785F, -10.5667F, 4, 0, 1, 0.0F, true));

        this.neck19_r4 = new ModelRenderer(this);
        this.neck19_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r4);
        this.setRotateAngle(neck19_r4, 0.5873F, 0.2085F, -0.3171F);
        this.neck19_r4.cubeList.add(new ModelBox(neck19_r4, 50, 80, -3.3455F, -2.8231F, -10.5667F, 2, 0, 1, 0.0F, true));

        this.neck20_r5 = new ModelRenderer(this);
        this.neck20_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck20_r5);
        this.setRotateAngle(neck20_r5, 0.1985F, 0.416F, -1.1459F);
        this.neck20_r5.cubeList.add(new ModelBox(neck20_r5, 65, 24, -14.1777F, -5.6502F, -6.6386F, 9, 0, 1, 0.0F, true));

        this.neck19_r5 = new ModelRenderer(this);
        this.neck19_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r5);
        this.setRotateAngle(neck19_r5, 0.3568F, 0.2942F, -0.6982F);
        this.neck19_r5.cubeList.add(new ModelBox(neck19_r5, 65, 102, -7.1028F, -2.9316F, -6.6386F, 4, 0, 1, 0.0F, true));

        this.neck18_r4 = new ModelRenderer(this);
        this.neck18_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r4);
        this.setRotateAngle(neck18_r4, 0.4541F, 0.065F, -0.1694F);
        this.neck18_r4.cubeList.add(new ModelBox(neck18_r4, 21, 108, -4.192F, -0.8053F, -6.6386F, 2, 0, 1, 0.0F, true));

        this.neck19_r6 = new ModelRenderer(this);
        this.neck19_r6.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r6);
        this.setRotateAngle(neck19_r6, 0.1654F, 0.3535F, -1.1402F);
        this.neck19_r6.cubeList.add(new ModelBox(neck19_r6, 62, 2, -15.5793F, -5.4085F, -4.633F, 10, 0, 1, 0.0F, true));

        this.neck18_r5 = new ModelRenderer(this);
        this.neck18_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r5);
        this.setRotateAngle(neck18_r5, 0.3001F, 0.2511F, -0.6953F);
        this.neck18_r5.cubeList.add(new ModelBox(neck18_r5, 54, 102, -7.3646F, -2.5428F, -4.633F, 4, 0, 1, 0.0F, true));

        this.neck17_r4 = new ModelRenderer(this);
        this.neck17_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck17_r4);
        this.setRotateAngle(neck17_r4, 0.385F, 0.0558F, -0.1554F);
        this.neck17_r4.cubeList.add(new ModelBox(neck17_r4, 14, 108, -4.2039F, -0.3368F, -4.633F, 2, 0, 1, 0.0F, true));

        this.neck18_r6 = new ModelRenderer(this);
        this.neck18_r6.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r6);
        this.setRotateAngle(neck18_r6, 0.1368F, 0.2892F, -1.1143F);
        this.neck18_r6.cubeList.add(new ModelBox(neck18_r6, 34, 48, -16.9451F, -5.2008F, -2.6321F, 11, 0, 1, 0.0F, true));

        this.neck17_r5 = new ModelRenderer(this);
        this.neck17_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck17_r5);
        this.setRotateAngle(neck17_r5, 0.2466F, 0.2047F, -0.6725F);
        this.neck17_r5.cubeList.add(new ModelBox(neck17_r5, 102, 42, -7.6084F, -2.2F, -2.6321F, 4, 0, 1, 0.0F, true));

        this.neck16_r5 = new ModelRenderer(this);
        this.neck16_r5.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck16_r5);
        this.setRotateAngle(neck16_r5, 0.3163F, 0.043F, -0.1238F);
        this.neck16_r5.cubeList.add(new ModelBox(neck16_r5, 7, 108, -4.2254F, 0.0833F, -2.6321F, 2, 0, 1, 0.0F, true));

        this.neck15_r5 = new ModelRenderer(this);
        this.neck15_r5.setRotationPoint(-1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck15_r5);
        this.setRotateAngle(neck15_r5, 0.0823F, 0.0145F, -0.113F);
        this.neck15_r5.cubeList.add(new ModelBox(neck15_r5, 0, 108, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck17_r6 = new ModelRenderer(this);
        this.neck17_r6.setRotationPoint(-1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck17_r6);
        this.setRotateAngle(neck17_r6, 0.032F, 0.0772F, -1.1159F);
        this.neck17_r6.cubeList.add(new ModelBox(neck17_r6, 44, 32, -15.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, true));

        this.neck16_r6 = new ModelRenderer(this);
        this.neck16_r6.setRotationPoint(-1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck16_r6);
        this.setRotateAngle(neck16_r6, 0.0617F, 0.0565F, -0.6791F);
        this.neck16_r6.cubeList.add(new ModelBox(neck16_r6, 102, 40, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 1.2466F, 0.0823F, -0.3684F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 34, 50, 3.9923F, -3.7667F, -8.6919F, 1, 4, 6, 0.0F, false));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 1.2708F, 0.1495F, -0.1594F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 63, 83, 5.6324F, -2.7667F, -11.0178F, 1, 3, 4, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 1.4499F, 0.3123F, 0.5859F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 19, 43, 11.4909F, -3.7667F, -10.0996F, 1, 6, 6, 0.0F, false));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r10);
        this.setRotateAngle(chest_r10, -2.0144F, -1.4319F, -2.8697F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 49, 99, -10.1614F, -2.4476F, -13.7329F, 1, 6, 1, 0.0F, false));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 1.4616F, -0.5002F, -0.2336F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 98, 103, -7.5809F, -5.3046F, -14.8163F, 2, 3, 1, 0.0F, false));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 1.3582F, 0.0157F, -0.0807F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 40, 92, -1.536F, -3.5137F, -16.0716F, 3, 6, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4625F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 59, -2.1F, -1.5732F, -11.8493F, 2, 2, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3578F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 38, -2.1F, -0.835F, -6.9757F, 2, 2, 7, -0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -1.8F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 46, 0.0F, -2.8419F, 0.0207F, 0, 4, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.1F, -3.8F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.288F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 106, 73, 0.0F, -2.9689F, 0.0191F, 0, 4, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.1F, -5.8F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 106, 0.0F, -3.1954F, 0.0063F, 0, 4, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.4F, -7.8F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 106, 0.0F, -3.0237F, 0.0274F, 0, 4, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.5F, -9.8F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 106, 0.0F, -3.0507F, 0.0258F, 0, 4, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, -11.8F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2007F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 106, 0.0F, -3.2771F, 0.013F, 0, 4, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.5F, -13.8F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 105, 102, 0.0F, -3.6036F, 0.0001F, 0, 4, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.5F, -15.8F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 100, 0.0F, -3.93F, -0.0127F, 0, 4, 1, 0.0F, false));

        this.neck20_r6 = new ModelRenderer(this);
        this.neck20_r6.setRotationPoint(1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck20_r6);
        this.setRotateAngle(neck20_r6, -0.0557F, 0.0835F, 1.2905F);
        this.neck20_r6.cubeList.add(new ModelBox(neck20_r6, 103, 10, 4.6791F, -3.3688F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck19_r7 = new ModelRenderer(this);
        this.neck19_r7.setRotationPoint(1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck19_r7);
        this.setRotateAngle(neck19_r7, -0.0858F, 0.0521F, 0.8543F);
        this.neck19_r7.cubeList.add(new ModelBox(neck19_r7, 103, 8, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck18_r7 = new ModelRenderer(this);
        this.neck18_r7.setRotationPoint(1.1F, 0.0927F, -1.3162F);
        this.body2.addChild(neck18_r7);
        this.setRotateAngle(neck18_r7, -0.1003F, -0.002F, 0.2894F);
        this.neck18_r7.cubeList.add(new ModelBox(neck18_r7, 61, 108, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck19_r8 = new ModelRenderer(this);
        this.neck19_r8.setRotationPoint(1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck19_r8);
        this.setRotateAngle(neck19_r8, -0.0366F, 0.0443F, 1.2743F);
        this.neck19_r8.cubeList.add(new ModelBox(neck19_r8, 91, 45, 4.6791F, -3.3688F, -0.5F, 6, 0, 1, 0.0F, false));

        this.neck18_r8 = new ModelRenderer(this);
        this.neck18_r8.setRotationPoint(1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck18_r8);
        this.setRotateAngle(neck18_r8, -0.0518F, 0.0247F, 0.8381F);
        this.neck18_r8.cubeList.add(new ModelBox(neck18_r8, 102, 38, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck17_r7 = new ModelRenderer(this);
        this.neck17_r7.setRotationPoint(1.1F, -0.1073F, -3.3162F);
        this.body2.addChild(neck17_r7);
        this.setRotateAngle(neck17_r7, -0.057F, -0.007F, 0.2717F);
        this.neck17_r7.cubeList.add(new ModelBox(neck17_r7, 75, 107, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck18_r9 = new ModelRenderer(this);
        this.neck18_r9.setRotationPoint(1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck18_r9);
        this.setRotateAngle(neck18_r9, -0.0213F, 0.0129F, 1.2049F);
        this.neck18_r9.cubeList.add(new ModelBox(neck18_r9, 68, 0, 4.6791F, -3.3688F, -0.5F, 8, 0, 1, 0.0F, false));

        this.neck17_r8 = new ModelRenderer(this);
        this.neck17_r8.setRotationPoint(1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck17_r8);
        this.setRotateAngle(neck17_r8, -0.0247F, 0.0027F, 0.7687F);
        this.neck17_r8.cubeList.add(new ModelBox(neck17_r8, 100, 84, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck16_r7 = new ModelRenderer(this);
        this.neck16_r7.setRotationPoint(1.1F, -0.3073F, -5.3162F);
        this.body2.addChild(neck16_r7);
        this.setRotateAngle(neck16_r7, -0.0223F, -0.011F, 0.2016F);
        this.neck16_r7.cubeList.add(new ModelBox(neck16_r7, 47, 107, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck17_r9 = new ModelRenderer(this);
        this.neck17_r9.setRotationPoint(1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck17_r9);
        this.setRotateAngle(neck17_r9, -0.0175F, 0.005F, 1.1526F);
        this.neck17_r9.cubeList.add(new ModelBox(neck17_r9, 59, 38, 4.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, false));

        this.neck16_r8 = new ModelRenderer(this);
        this.neck16_r8.setRotationPoint(1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck16_r8);
        this.setRotateAngle(neck16_r8, -0.0179F, -0.0028F, 0.7163F);
        this.neck16_r8.cubeList.add(new ModelBox(neck16_r8, 100, 80, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck15_r6 = new ModelRenderer(this);
        this.neck15_r6.setRotationPoint(1.1F, -0.3073F, -7.3162F);
        this.body2.addChild(neck15_r6);
        this.setRotateAngle(neck15_r6, -0.0136F, -0.012F, 0.1492F);
        this.neck15_r6.cubeList.add(new ModelBox(neck15_r6, 107, 33, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r9 = new ModelRenderer(this);
        this.neck16_r9.setRotationPoint(1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck16_r9);
        this.setRotateAngle(neck16_r9, -0.0175F, 0.005F, 1.109F);
        this.neck16_r9.cubeList.add(new ModelBox(neck16_r9, 44, 30, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck15_r7 = new ModelRenderer(this);
        this.neck15_r7.setRotationPoint(1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck15_r7);
        this.setRotateAngle(neck15_r7, -0.0179F, -0.0028F, 0.6727F);
        this.neck15_r7.cubeList.add(new ModelBox(neck15_r7, 73, 100, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(1.1F, -0.3073F, -9.3162F);
        this.body2.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -0.0136F, -0.012F, 0.1055F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 107, 31, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck15_r8 = new ModelRenderer(this);
        this.neck15_r8.setRotationPoint(1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck15_r8);
        this.setRotateAngle(neck15_r8, -0.009F, -0.0102F, 1.0828F);
        this.neck15_r8.cubeList.add(new ModelBox(neck15_r8, 40, 36, 4.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, -0.0038F, -0.0131F, 0.6464F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 54, 100, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(1.1F, -0.4073F, -11.3162F);
        this.body2.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, 0.0038F, -0.0131F, 0.0791F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 107, 29, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck15_r9 = new ModelRenderer(this);
        this.neck15_r9.setRotationPoint(1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck15_r9);
        this.setRotateAngle(neck15_r9, 0.0095F, -0.0399F, 1.0998F);
        this.neck15_r9.cubeList.add(new ModelBox(neck15_r9, 41, 0, 4.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, false));

        this.neck14_r6 = new ModelRenderer(this);
        this.neck14_r6.setRotationPoint(1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck14_r6);
        this.setRotateAngle(neck14_r6, 0.0255F, -0.0321F, 0.6632F);
        this.neck14_r6.cubeList.add(new ModelBox(neck14_r6, 103, 6, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(1.1F, -0.4073F, -15.3162F);
        this.body2.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, 0.0387F, -0.0134F, 0.0961F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 54, 108, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.0213F, -0.0129F, 0.0789F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 107, 27, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, 0.011F, -0.0223F, 0.6462F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 98, 91, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck14_r7 = new ModelRenderer(this);
        this.neck14_r7.setRotationPoint(1.1F, -0.4073F, -13.3162F);
        this.body2.addChild(neck14_r7);
        this.setRotateAngle(neck14_r7, 0.0005F, -0.0249F, 1.0826F);
        this.neck14_r7.cubeList.add(new ModelBox(neck14_r7, 40, 34, 4.6791F, -3.3688F, -0.5F, 12, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.9F, -17.8F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0349F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.0F, 0.3F, 0.0F, 2, 2, 18, 0.0F, false));

        this.neck20_r7 = new ModelRenderer(this);
        this.neck20_r7.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck20_r7);
        this.setRotateAngle(neck20_r7, 0.4281F, -0.3487F, 0.7117F);
        this.neck20_r7.cubeList.add(new ModelBox(neck20_r7, 103, 4, 1.0884F, -2.097F, -8.663F, 4, 0, 1, 0.0F, false));

        this.neck19_r9 = new ModelRenderer(this);
        this.neck19_r9.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r9);
        this.setRotateAngle(neck19_r9, 0.5401F, -0.0787F, 0.1992F);
        this.neck19_r9.cubeList.add(new ModelBox(neck19_r9, 28, 108, 0.0446F, -1.1838F, -8.663F, 2, 0, 1, 0.0F, false));

        this.neck21_r4 = new ModelRenderer(this);
        this.neck21_r4.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck21_r4);
        this.setRotateAngle(neck21_r4, 0.2399F, -0.4945F, 1.1637F);
        this.neck21_r4.cubeList.add(new ModelBox(neck21_r4, 79, 73, 3.7047F, -4.0424F, -8.663F, 7, 0, 1, 0.0F, false));

        this.neck20_r8 = new ModelRenderer(this);
        this.neck20_r8.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck20_r8);
        this.setRotateAngle(neck20_r8, 0.1423F, -0.6046F, 1.3395F);
        this.neck20_r8.cubeList.add(new ModelBox(neck20_r8, 103, 61, 2.6061F, -3.86F, -10.5867F, 3, 0, 1, 0.0F, false));

        this.neck19_r10 = new ModelRenderer(this);
        this.neck19_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r10);
        this.setRotateAngle(neck19_r10, 0.4017F, -0.4846F, 0.8471F);
        this.neck19_r10.cubeList.add(new ModelBox(neck19_r10, 98, 36, 0.0156F, -2.3959F, -10.5867F, 4, 0, 1, 0.0F, false));

        this.neck18_r10 = new ModelRenderer(this);
        this.neck18_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r10);
        this.setRotateAngle(neck18_r10, 0.5873F, -0.2085F, 0.3171F);
        this.neck18_r10.cubeList.add(new ModelBox(neck18_r10, 50, 80, -0.6996F, -2.0123F, -10.5867F, 2, 0, 1, 0.0F, false));

        this.neck19_r11 = new ModelRenderer(this);
        this.neck19_r11.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck19_r11);
        this.setRotateAngle(neck19_r11, 0.1985F, -0.416F, 1.1459F);
        this.neck19_r11.cubeList.add(new ModelBox(neck19_r11, 65, 24, 4.3482F, -3.6129F, -6.6747F, 9, 0, 1, 0.0F, false));

        this.neck18_r11 = new ModelRenderer(this);
        this.neck18_r11.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r11);
        this.setRotateAngle(neck18_r11, 0.3568F, -0.2942F, 0.6982F);
        this.neck18_r11.cubeList.add(new ModelBox(neck18_r11, 65, 102, 1.4901F, -1.4357F, -6.6747F, 4, 0, 1, 0.0F, false));

        this.neck17_r10 = new ModelRenderer(this);
        this.neck17_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck17_r10);
        this.setRotateAngle(neck17_r10, 0.4541F, -0.065F, 0.1694F);
        this.neck17_r10.cubeList.add(new ModelBox(neck17_r10, 21, 108, 0.0281F, -0.4102F, -6.6747F, 2, 0, 1, 0.0F, false));

        this.neck18_r12 = new ModelRenderer(this);
        this.neck18_r12.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck18_r12);
        this.setRotateAngle(neck18_r12, 0.1654F, -0.3535F, 1.1402F);
        this.neck18_r12.cubeList.add(new ModelBox(neck18_r12, 62, 2, 4.7178F, -3.3842F, -4.6486F, 10, 0, 1, 0.0F, false));

        this.neck17_r11 = new ModelRenderer(this);
        this.neck17_r11.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck17_r11);
        this.setRotateAngle(neck17_r11, 0.3001F, -0.2511F, 0.6953F);
        this.neck17_r11.cubeList.add(new ModelBox(neck17_r11, 54, 102, 1.7283F, -1.0723F, -4.6486F, 4, 0, 1, 0.0F, false));

        this.neck16_r10 = new ModelRenderer(this);
        this.neck16_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck16_r10);
        this.setRotateAngle(neck16_r10, 0.385F, -0.0558F, 0.1554F);
        this.neck16_r10.cubeList.add(new ModelBox(neck16_r10, 14, 108, 0.0338F, 0.0243F, -4.6486F, 2, 0, 1, 0.0F, false));

        this.neck17_r12 = new ModelRenderer(this);
        this.neck17_r12.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck17_r12);
        this.setRotateAngle(neck17_r12, 0.1368F, -0.2892F, 1.1143F);
        this.neck17_r12.cubeList.add(new ModelBox(neck17_r12, 34, 48, 5.0156F, -3.2069F, -2.6274F, 11, 0, 1, 0.0F, false));

        this.neck16_r11 = new ModelRenderer(this);
        this.neck16_r11.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck16_r11);
        this.setRotateAngle(neck16_r11, 0.2466F, -0.2047F, 0.6725F);
        this.neck16_r11.cubeList.add(new ModelBox(neck16_r11, 102, 42, 1.9233F, -0.7857F, -2.6274F, 4, 0, 1, 0.0F, false));

        this.neck15_r10 = new ModelRenderer(this);
        this.neck15_r10.setRotationPoint(1.1F, -0.8473F, -17.2534F);
        this.body2.addChild(neck15_r10);
        this.setRotateAngle(neck15_r10, 0.3163F, -0.043F, 0.1238F);
        this.neck15_r10.cubeList.add(new ModelBox(neck15_r10, 7, 108, 0.0442F, 0.3707F, -2.6274F, 2, 0, 1, 0.0F, false));

        this.neck14_r8 = new ModelRenderer(this);
        this.neck14_r8.setRotationPoint(1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck14_r8);
        this.setRotateAngle(neck14_r8, 0.0823F, -0.0145F, 0.113F);
        this.neck14_r8.cubeList.add(new ModelBox(neck14_r8, 0, 108, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r12 = new ModelRenderer(this);
        this.neck16_r12.setRotationPoint(1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck16_r12);
        this.setRotateAngle(neck16_r12, 0.032F, -0.0772F, 1.1159F);
        this.neck16_r12.cubeList.add(new ModelBox(neck16_r12, 44, 32, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck15_r11 = new ModelRenderer(this);
        this.neck15_r11.setRotationPoint(1.1F, -0.4073F, -17.3162F);
        this.body2.addChild(neck15_r11);
        this.setRotateAngle(neck15_r11, 0.0617F, -0.0565F, 0.6791F);
        this.neck15_r11.cubeList.add(new ModelBox(neck15_r11, 102, 40, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(6.3F, 11.6535F, -23.9464F);
        this.body2.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.5952F, 0.275F, -1.127F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 59, 40, 0.4203F, -0.0885F, -2.7806F, 2, 4, 5, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 91, 39, 0.4203F, 3.9115F, -1.7806F, 2, 2, 3, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 28, 77, 0.4203F, 5.9115F, -2.2806F, 2, 3, 4, 0.0F, false));

        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(2.6698F, 10.7583F, -0.2355F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -1.3796F, 0.1114F, 1.1764F);


        this.lowerarm4_r1 = new ModelRenderer(this);
        this.lowerarm4_r1.setRotationPoint(-8.7346F, -19.4761F, 5.7607F);
        this.lowerarm1.addChild(lowerarm4_r1);
        this.setRotateAngle(lowerarm4_r1, -0.3572F, 1.2533F, -0.2064F);
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 101, 63, 5.9564F, 15.1555F, 9.2664F, 1, 3, 2, 0.0F, false));
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 9, 81, 4.9564F, 18.1555F, 8.6664F, 3, 3, 3, 0.0F, false));
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 89, 23, 5.4564F, 21.1555F, 9.1664F, 2, 5, 2, 0.0F, false));

        this.lowerarm2_r1 = new ModelRenderer(this);
        this.lowerarm2_r1.setRotationPoint(-8.7346F, -19.4761F, 5.7607F);
        this.lowerarm1.addChild(lowerarm2_r1);
        this.setRotateAngle(lowerarm2_r1, -0.2438F, 1.2533F, -0.2064F);
        this.lowerarm2_r1.cubeList.add(new ModelBox(lowerarm2_r1, 31, 95, 5.4632F, 21.2393F, 4.2766F, 2, 2, 2, 0.0F, false));
        this.lowerarm2_r1.cubeList.add(new ModelBox(lowerarm2_r1, 58, 69, 5.9632F, 23.2393F, 4.7766F, 1, 4, 1, 0.0F, false));

        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.9069F, 7.8177F, -1.1504F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 1.0772F, -0.0743F, 0.0966F);


        this.hand2_r1 = new ModelRenderer(this);
        this.hand2_r1.setRotationPoint(-7.8183F, -27.2277F, 6.683F);
        this.hand1.addChild(hand2_r1);
        this.setRotateAngle(hand2_r1, -0.4363F, 0.0F, 0.0F);
        this.hand2_r1.cubeList.add(new ModelBox(hand2_r1, 62, 4, 4.3815F, 29.7217F, 1.1496F, 6, 2, 3, 0.003F, false));

        this.hand2_r2 = new ModelRenderer(this);
        this.hand2_r2.setRotationPoint(-7.8183F, -27.2277F, 6.683F);
        this.hand1.addChild(hand2_r2);
        this.setRotateAngle(hand2_r2, 0.1309F, 0.0F, 0.0F);
        this.hand2_r2.cubeList.add(new ModelBox(hand2_r2, 74, 40, 4.3815F, 26.9596F, -13.5421F, 6, 2, 2, 0.0F, false));

        this.hand2_r3 = new ModelRenderer(this);
        this.hand2_r3.setRotationPoint(-7.8183F, -27.2277F, 6.683F);
        this.hand1.addChild(hand2_r3);
        this.setRotateAngle(hand2_r3, 0.481F, 0.3133F, -0.5334F);
        this.hand2_r3.cubeList.add(new ModelBox(hand2_r3, 18, 99, -7.6799F, 19.1222F, -22.1593F, 2, 1, 2, 0.0F, false));

        this.hand2_r4 = new ModelRenderer(this);
        this.hand2_r4.setRotationPoint(-7.8183F, -27.2277F, 6.683F);
        this.hand1.addChild(hand2_r4);
        this.setRotateAngle(hand2_r4, 0.532F, -0.2071F, 0.3361F);
        this.hand2_r4.cubeList.add(new ModelBox(hand2_r4, 98, 87, 15.25F, 14.0934F, -22.1593F, 2, 1, 2, 0.0F, false));

        this.hand1_r1 = new ModelRenderer(this);
        this.hand1_r1.setRotationPoint(-7.8183F, -27.2277F, 6.683F);
        this.hand1.addChild(hand1_r1);
        this.setRotateAngle(hand1_r1, 0.5672F, 0.0F, 0.0F);
        this.hand1_r1.cubeList.add(new ModelBox(hand1_r1, 100, 0, 6.4815F, 18.8316F, -22.1593F, 2, 1, 2, 0.003F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-6.3F, 11.6535F, -23.9464F);
        this.body2.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.5578F, -0.4887F, 1.038F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 49, 59, -2.4203F, -0.0885F, -2.7806F, 2, 4, 5, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 57, 91, -2.4203F, 3.9115F, -1.7806F, 2, 2, 3, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 79, 58, -2.4203F, 5.9115F, -2.2806F, 2, 3, 4, 0.0F, false));

        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-2.4698F, 9.1583F, -0.1355F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -1.6795F, -0.0826F, -0.773F);


        this.lowerarm5_r1 = new ModelRenderer(this);
        this.lowerarm5_r1.setRotationPoint(10.0876F, -19.1176F, 5.7509F);
        this.lowerarm2.addChild(lowerarm5_r1);
        this.setRotateAngle(lowerarm5_r1, -0.3572F, -1.2533F, 0.2064F);
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 9, 102, -7.6285F, 14.8625F, 11.3406F, 1, 3, 2, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 81, 50, -8.6285F, 17.8625F, 10.7406F, 3, 3, 3, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 89, 31, -8.1285F, 20.8625F, 11.2406F, 2, 5, 2, 0.0F, false));

        this.lowerarm3_r1 = new ModelRenderer(this);
        this.lowerarm3_r1.setRotationPoint(10.0876F, -19.1176F, 5.7509F);
        this.lowerarm2.addChild(lowerarm3_r1);
        this.setRotateAngle(lowerarm3_r1, -0.2438F, -1.2533F, 0.2064F);
        this.lowerarm3_r1.cubeList.add(new ModelBox(lowerarm3_r1, 73, 95, -8.1354F, 21.183F, 6.3706F, 2, 2, 2, 0.0F, false));
        this.lowerarm3_r1.cubeList.add(new ModelBox(lowerarm3_r1, 9, 75, -7.6354F, 23.183F, 6.8706F, 1, 4, 1, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(2.8611F, 7.3052F, -1.0514F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.0829F, 0.1829F, -0.2617F);


        this.hand3_r1 = new ModelRenderer(this);
        this.hand3_r1.setRotationPoint(7.0277F, -27.2938F, 6.9112F);
        this.hand2.addChild(hand3_r1);
        this.setRotateAngle(hand3_r1, -0.4363F, 0.0F, 0.0F);
        this.hand3_r1.cubeList.add(new ModelBox(hand3_r1, 62, 10, -12.5815F, 29.7217F, 1.1496F, 6, 2, 3, 0.003F, false));

        this.hand3_r2 = new ModelRenderer(this);
        this.hand3_r2.setRotationPoint(7.0277F, -27.2938F, 6.9112F);
        this.hand2.addChild(hand3_r2);
        this.setRotateAngle(hand3_r2, 0.1309F, 0.0F, 0.0F);
        this.hand3_r2.cubeList.add(new ModelBox(hand3_r2, 74, 45, -12.5815F, 26.9596F, -13.5421F, 6, 2, 2, 0.0F, false));

        this.hand3_r3 = new ModelRenderer(this);
        this.hand3_r3.setRotationPoint(7.0277F, -27.2938F, 6.9112F);
        this.hand2.addChild(hand3_r3);
        this.setRotateAngle(hand3_r3, 0.481F, -0.3133F, 0.5334F);
        this.hand3_r3.cubeList.add(new ModelBox(hand3_r3, 0, 100, 3.8778F, 20.3841F, -22.1593F, 2, 1, 2, 0.0F, false));

        this.hand3_r4 = new ModelRenderer(this);
        this.hand3_r4.setRotationPoint(7.0277F, -27.2938F, 6.9112F);
        this.hand2.addChild(hand3_r4);
        this.setRotateAngle(hand3_r4, 0.532F, 0.2071F, -0.3361F);
        this.hand3_r4.cubeList.add(new ModelBox(hand3_r4, 94, 99, -19.2825F, 13.2515F, -22.1593F, 2, 1, 2, 0.0F, false));

        this.hand2_r5 = new ModelRenderer(this);
        this.hand2_r5.setRotationPoint(7.0277F, -27.2938F, 6.9112F);
        this.hand2.addChild(hand2_r5);
        this.setRotateAngle(hand2_r5, 0.5672F, 0.0F, 0.0F);
        this.hand2_r5.cubeList.add(new ModelBox(hand2_r5, 27, 100, -10.6815F, 18.8316F, -22.1593F, 2, 1, 2, 0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 3.7613F, -27.8333F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, 0.2049F, 0.2224F, 0.0023F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1134F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 108, 102, -1.1F, -1.3164F, -12.6622F, 0, 2, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 95, 108, -1.1F, -1.6164F, -14.6622F, 0, 3, 1, 0.0F, false));

        this.neck22_r2 = new ModelRenderer(this);
        this.neck22_r2.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck22_r2);
        this.setRotateAngle(neck22_r2, 0.6476F, 0.688F, -0.7098F);
        this.neck22_r2.cubeList.add(new ModelBox(neck22_r2, 106, 44, 2.0645F, -8.072F, -11.5383F, 2, 0, 1, 0.0F, true));

        this.neck21_r5 = new ModelRenderer(this);
        this.neck21_r5.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck21_r5);
        this.setRotateAngle(neck21_r5, 0.8726F, 0.2891F, -0.2463F);
        this.neck21_r5.cubeList.add(new ModelBox(neck21_r5, 107, 25, -0.9091F, -8.9917F, -11.5383F, 2, 0, 1, 0.0F, true));

        this.neck20_r9 = new ModelRenderer(this);
        this.neck20_r9.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck20_r9);
        this.setRotateAngle(neck20_r9, 0.8726F, -0.2891F, 0.2463F);
        this.neck20_r9.cubeList.add(new ModelBox(neck20_r9, 107, 25, -3.1359F, -8.1808F, -11.5582F, 2, 0, 1, 0.0F, false));

        this.neck21_r6 = new ModelRenderer(this);
        this.neck21_r6.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck21_r6);
        this.setRotateAngle(neck21_r6, 0.6476F, -0.688F, 0.7098F);
        this.neck21_r6.cubeList.add(new ModelBox(neck21_r6, 106, 44, -5.3536F, -6.2893F, -11.5582F, 2, 0, 1, 0.0F, false));

        this.neck20_r10 = new ModelRenderer(this);
        this.neck20_r10.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck20_r10);
        this.setRotateAngle(neck20_r10, 0.6983F, 0.2426F, -0.2923F);
        this.neck20_r10.cubeList.add(new ModelBox(neck20_r10, 82, 38, -2.0179F, -6.1837F, -11.0701F, 2, 0, 1, 0.0F, true));

        this.neck21_r7 = new ModelRenderer(this);
        this.neck21_r7.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck21_r7);
        this.setRotateAngle(neck21_r7, 0.4907F, 0.5679F, -0.8023F);
        this.neck21_r7.cubeList.add(new ModelBox(neck21_r7, 100, 82, -2.3794F, -6.2995F, -11.0701F, 4, 0, 1, 0.0F, true));

        this.neck19_r12 = new ModelRenderer(this);
        this.neck19_r12.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck19_r12);
        this.setRotateAngle(neck19_r12, 0.6983F, -0.2426F, 0.2923F);
        this.neck19_r12.cubeList.add(new ModelBox(neck19_r12, 82, 38, -2.0271F, -5.3728F, -11.0901F, 2, 0, 1, 0.0F, false));

        this.neck20_r11 = new ModelRenderer(this);
        this.neck20_r11.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(neck20_r11);
        this.setRotateAngle(neck20_r11, 0.4907F, -0.5679F, 0.8023F);
        this.neck20_r11.cubeList.add(new ModelBox(neck20_r11, 100, 82, -2.9097F, -4.5168F, -11.0901F, 4, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.1F, -2.5473F, 11.2466F);
        this.neck.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3403F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 65, 16, -2.1F, -2.3481F, -16.5017F, 2, 2, 5, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.1F, -3.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0115F, 0.1304F, -0.088F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.3963F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 68, -2.6F, -26.5896F, -11.398F, 3, 2, 4, 0.004F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.7453F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 81, 11, -2.6F, -29.5383F, -2.2538F, 3, 1, 3, 0.008F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4974F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 83, -2.6F, -9.8373F, -25.2419F, 3, 2, 3, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7941F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 93, 16, -2.6F, -17.7267F, -23.61F, 3, 2, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6632F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 57, 97, -3.1F, -14.734F, -23.9069F, 4, 1, 1, -0.004F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 94, 53, -3.1F, -14.734F, -23.4069F, 4, 1, 1, 0.004F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5411F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 87, 0, -3.6F, -11.8909F, -24.0333F, 5, 2, 1, -0.008F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2967F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 70, -3.6F, -5.9688F, -25.2135F, 5, 4, 2, -0.004F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1222F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 64, -2.6F, 7.1561F, -25.2472F, 3, 3, 4, -0.003F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 80, 16, -3.1F, 3.5153F, -20.7825F, 4, 4, 2, 0.003F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 74, 83, -3.1F, 3.4885F, -21.8244F, 4, 3, 2, -0.003F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3752F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 87, 87, -2.1F, -4.2628F, -23.5903F, 2, 3, 3, -0.005F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 67, -3.6F, -3.0589F, -23.8928F, 5, 5, 2, -0.003F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.358F, 0.4346F, -0.0406F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 92, 63, 1.5574F, 6.8448F, -14.0707F, 3, 5, 1, 0.003F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.2612F, -0.797F, 0.8907F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 46, -11.5972F, 8.1728F, -2.4182F, 1, 5, 6, -0.008F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, 0.4747F, -0.2305F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 94, 0.0254F, 7.1944F, -12.9341F, 2, 6, 1, -0.003F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.233F, -0.6108F, 0.2093F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 56, -16.061F, 0.9178F, -19.2936F, 2, 1, 6, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3598F, -0.0434F, 0.8416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 84, 75, -2.8911F, -0.8506F, -20.0527F, 2, 1, 4, -0.004F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3843F, -0.3528F, 0.7191F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 74, 89, -9.4268F, -0.8506F, -19.2892F, 1, 1, 4, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3606F, -0.0761F, 0.8292F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 87, 81, -4.5897F, -0.8506F, -17.3811F, 2, 1, 4, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3634F, 0.1444F, 0.9126F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 54, 104, -1.3513F, -0.8506F, -14.3251F, 1, 1, 2, 0.004F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4199F, -0.5296F, 0.6361F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 92, 57, -9.4264F, -0.8506F, -12.9821F, 1, 1, 4, 0.009F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.233F, 0.6108F, -0.2093F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 15, 56, 12.2981F, 0.1881F, -20.3889F, 2, 1, 6, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4199F, 0.5296F, -0.6361F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 92, 57, 6.8991F, -2.4084F, -13.2656F, 1, 1, 4, 0.009F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3634F, -0.1444F, -0.9126F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 54, 104, -0.9805F, -2.4084F, -13.5254F, 1, 1, 2, 0.004F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3598F, 0.0434F, -0.8416F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 75, -0.5733F, -2.4084F, -19.5346F, 2, 1, 4, -0.004F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3606F, 0.0761F, -0.8292F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 87, 81, 1.1081F, -2.4084F, -16.9145F, 2, 1, 4, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3843F, 0.3528F, -0.7191F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 74, 89, 6.8734F, -2.4084F, -19.2761F, 1, 1, 4, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2443F, -0.0024F, 0.0301F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 91, 103, -3.0031F, -3.4393F, -21.9544F, 1, 2, 2, 0.2F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 98, 26, -3.8431F, -3.4393F, -21.9544F, 2, 2, 2, -0.6F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 103, 56, -3.5231F, -3.4393F, -21.9544F, 1, 2, 2, -0.3F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0018F, 0.0302F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 103, 98, -2.2926F, -9.612F, -25.5424F, 1, 1, 2, 0.2F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0912F, -0.2937F, 0.0035F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 68, 108, -10.5165F, 1.6857F, -24.0378F, 1, 1, 1, 0.2F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0912F, 0.2937F, -0.0035F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 68, 108, 7.4107F, 1.6199F, -24.6713F, 1, 1, 1, 0.2F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.5236F, -0.0018F, -0.0302F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 103, 98, -0.9064F, -9.6675F, -25.5057F, 1, 1, 2, 0.2F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2443F, 0.0024F, -0.0301F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 103, -0.1959F, -3.5049F, -21.9434F, 1, 2, 2, 0.2F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 103, 56, 0.3241F, -3.5049F, -21.9434F, 1, 2, 2, -0.3F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 98, 26, -0.3559F, -3.5049F, -21.9434F, 2, 2, 2, -0.6F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.733F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 66, 50, -3.1F, -11.9779F, -16.9012F, 4, 4, 3, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 104, -2.1F, -12.0779F, -13.9012F, 2, 2, 1, -0.005F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0349F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 98, 21, -2.1F, -0.9299F, -16.0025F, 2, 2, 2, 0.006F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.5934F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 97, 75, -2.1F, -10.1706F, -14.4601F, 2, 2, 2, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.4363F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 96, 70, -1.6F, -7.604F, -18.9316F, 1, 1, 3, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1309F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 84, 100, -2.1F, 1.7742F, -15.6179F, 2, 4, 1, 0.004F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 49, 50, -2.6F, 5.7742F, -19.6179F, 3, 3, 5, 0.004F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.5236F, -0.4747F, 0.2305F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 11, 94, -3.9305F, 7.1401F, -11.835F, 2, 6, 1, -0.003F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -1.2612F, 0.797F, -0.8907F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 46, 9.6303F, 8.5942F, -4.3488F, 1, 5, 6, -0.008F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(1.1F, -3.6473F, 14.3466F);
        this.head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.358F, -0.4346F, 0.0406F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 92, 63, -6.5513F, 6.6041F, -13.1726F, 3, 5, 1, 0.003F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.0446F, -1.7846F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2269F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 103, 12, -2.6F, 5.557F, -25.5848F, 3, 1, 1, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.5395F, -0.2745F, 0.0522F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 104, 15, -8.2737F, 21.3502F, -16.4323F, 1, 1, 2, -0.004F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -1.1179F, -0.376F, -0.2123F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 103, 93, -13.4515F, 23.1544F, -2.2525F, 1, 2, 2, 0.007F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -1.3022F, -0.4405F, -0.0562F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 94, 47, -13.6485F, 21.0076F, 2.6521F, 1, 2, 3, 0.007F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -1.7549F, -0.4246F, 0.1653F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 22, 81, -11.3066F, 21.41F, 13.6949F, 1, 2, 1, 0.005F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0785F, -0.4014F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 103, 47, -12.4116F, 5.9153F, -18.0632F, 1, 2, 2, -0.023F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3403F, -0.4014F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 88, -12.4116F, 1.0467F, -22.9518F, 1, 2, 4, -0.024F, true));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.576F, -0.4014F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 85, 94, -12.4116F, -2.5941F, -22.7154F, 1, 2, 3, 0.005F, true));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.3316F, -0.4014F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 94, 10, -12.4116F, 2.2843F, -20.0171F, 1, 2, 3, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.5236F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 94, 94, -5.6F, 14.5507F, -11.5181F, 1, 1, 3, -0.009F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 104, -5.6F, 13.6507F, -11.5181F, 1, 1, 2, -0.004F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 94, 94, 2.4F, 14.5507F, -11.5181F, 1, 1, 3, -0.009F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 104, 2.4F, 13.6507F, -11.5181F, 1, 1, 2, -0.004F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.0524F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 41, 77, -5.6F, 7.2407F, -17.4978F, 1, 1, 1, 0.004F, true));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 41, 77, 2.4F, 7.2407F, -17.4978F, 1, 1, 1, 0.004F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.5061F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 16, 103, -5.6F, -3.1617F, -20.6707F, 1, 2, 2, -0.004F, true));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 16, 103, 2.4F, -3.1617F, -20.6707F, 1, 2, 2, -0.004F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.192F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 94, 4, -5.6F, 11.2564F, -17.765F, 1, 2, 3, 0.004F, true));
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 94, 4, 2.4F, 11.2564F, -17.765F, 1, 2, 3, 0.004F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.1905F, -0.2745F, 0.0522F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 68, 104, -8.3316F, 15.1657F, -21.4213F, 1, 1, 2, -0.004F, true));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.5395F, 0.2745F, -0.0522F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 104, 15, 5.1589F, 21.5576F, -17.0022F, 1, 1, 2, -0.004F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.8988F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 98, 108, -1.6F, 26.9345F, -9.5309F, 1, 1, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.5149F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 61, 104, -1.6F, 21.7021F, -18.3603F, 1, 1, 2, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.1905F, 0.2745F, -0.0522F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 68, 104, 5.2168F, 15.1657F, -22.0277F, 1, 1, 2, -0.004F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1833F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 98, 31, -1.6F, 15.1657F, -22.8766F, 1, 1, 3, -0.003F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -1.1179F, 0.376F, 0.2123F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 103, 93, 10.4511F, 24.0675F, -2.1813F, 1, 2, 2, 0.007F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -1.3022F, 0.4405F, 0.0562F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 94, 47, 10.6616F, 21.9433F, 2.5226F, 1, 2, 3, 0.007F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -1.7549F, 0.4246F, -0.1653F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 22, 81, 8.3292F, 22.3551F, 13.5026F, 1, 2, 1, 0.005F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0785F, 0.4014F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 103, 47, 9.3865F, 5.8479F, -18.9201F, 1, 2, 2, -0.023F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.3403F, 0.4014F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 88, 9.3865F, 0.7597F, -23.7621F, 1, 2, 4, -0.024F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.576F, 0.4014F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 85, 94, 9.3865F, -3.0622F, -23.4363F, 1, 2, 3, 0.005F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(1.1F, -6.692F, 16.1312F);
        this.jaw.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.3316F, 0.4014F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 94, 10, 9.3865F, 2.0044F, -20.8299F, 1, 2, 3, 0.0F, false));

        this.leftTusk = new ModelRenderer(this);
        this.leftTusk.setRotationPoint(3.159F, 0.6541F, -4.1995F);
        this.head.addChild(leftTusk);
        this.setRotateAngle(leftTusk, -0.0196F, 0.1264F, -0.0341F);


        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0372F, 0.1717F, -0.1961F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 76, 102, 5.0535F, 5.7809F, -26.1275F, 1, 2, 2, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.3514F, 0.1717F, -0.1961F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 34, 43, 5.0535F, -0.6826F, -27.2541F, 1, 2, 1, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.7569F, 0.1717F, -0.1961F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 36, 100, 5.0535F, 21.0277F, -12.5281F, 1, 3, 2, -0.003F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.2343F, 0.2543F, 0.0253F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 108, 63, 9.2981F, 4.7051F, -26.1666F, 1, 2, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.135F, 0.1852F, -0.1868F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 107, 86, 5.3534F, 12.56F, -23.717F, 1, 2, 1, 0.003F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-2.059F, -4.3014F, 18.5461F);
        this.leftTusk.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.259F, 0.1577F, -0.3994F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 22, 85, 3.3214F, 10.7351F, -23.5416F, 1, 3, 4, 0.003F, false));

        this.rightTusk = new ModelRenderer(this);
        this.rightTusk.setRotationPoint(-3.159F, 0.6541F, -4.1995F);
        this.head.addChild(rightTusk);
        this.setRotateAngle(rightTusk, -0.0196F, -0.1264F, 0.0341F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0372F, -0.1717F, 0.1961F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 76, 102, -8.1796F, 6.223F, -25.775F, 1, 2, 2, 0.0F, true));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.3514F, -0.1717F, 0.1961F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 34, 43, -8.1796F, -0.1533F, -27.0555F, 1, 2, 1, 0.0F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.7569F, -0.1717F, 0.1961F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 36, 100, -8.1796F, 21.0862F, -11.9657F, 1, 3, 2, -0.003F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.2343F, -0.2543F, -0.0253F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 108, 63, -12.4266F, 4.7795F, -25.6155F, 1, 2, 1, 0.0F, true));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.135F, -0.1852F, 0.1868F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 107, 86, -8.4782F, 12.9114F, -23.2676F, 1, 2, 1, 0.003F, true));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(4.259F, -4.3014F, 18.5461F);
        this.rightTusk.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.259F, -0.1577F, 0.3994F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 22, 85, -6.323F, 11.4806F, -23.0148F, 1, 3, 4, 0.003F, true));

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
