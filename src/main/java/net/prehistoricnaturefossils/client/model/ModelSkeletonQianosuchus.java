package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonQianosuchus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer cube_r21;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
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
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer head;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;

    public ModelSkeletonQianosuchus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.25F, -6.25F, 5.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0436F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -7.1F, -0.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 23, 0.0F, -1.7F, 4.95F, 0, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 48, -1.0F, 0.1F, 2.55F, 1, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 33, -2.0F, 0.8F, 3.05F, 1, 1, 2, 0.005F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 42, -2.0F, -0.2F, 2.05F, 1, 1, 4, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 19, 0.0F, -1.7F, 2.95F, 0, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 65, 0.0F, -1.7F, 0.95F, 0, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 33, 1.0F, 0.8F, 3.05F, 1, 1, 2, 0.005F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 48, 0.0F, 0.1F, 2.55F, 1, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 42, 1.0F, -0.2F, 2.05F, 1, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 0, -0.5F, -0.1F, -0.05F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -5.1187F, 3.5768F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7641F, 0.2173F, -0.2037F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 61, 0.4F, -0.9756F, 1.3373F, 1, 2, 1, 0.005F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 45, 0.4F, -0.4756F, -1.2627F, 1, 1, 3, -0.004F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.3F, -5.5423F, 2.4725F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7156F, -0.2443F, -0.0698F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 37, 0.0F, -0.7839F, -3.1063F, 1, 1, 2, 0.005F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.3F, -5.5423F, 2.4725F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4363F, -0.2443F, -0.0698F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 51, 0.0F, -0.4268F, -1.2719F, 1, 1, 2, -0.006F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -6.7894F, 0.4629F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2005F, 0.0608F, -0.5873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 68, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -6.7894F, 0.4629F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1591F, 0.1368F, -1.0014F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 66, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.7894F, 0.4629F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2005F, -0.0608F, 0.5873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 68, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.7894F, 0.4629F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1591F, -0.1368F, 1.0014F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 66, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.3F, -5.5423F, 2.4725F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7156F, 0.2443F, 0.0698F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 37, -1.0F, -0.7839F, -3.1063F, 1, 1, 2, 0.005F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -5.1187F, 3.5768F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7641F, -0.2173F, 0.2037F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 61, -1.4F, -0.9756F, 1.3373F, 1, 2, 1, 0.005F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 45, -1.4F, -0.4756F, -1.2627F, 1, 1, 3, -0.004F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.3F, -5.5423F, 2.4725F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.2443F, 0.0698F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 51, -1.0F, -0.4268F, -1.2719F, 1, 1, 2, -0.006F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.9F, -5.4F, 3.25F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, 0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.3315F, 0.7444F);
        this.backLeftLeg.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.192F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 21, -0.5F, -1.9512F, -0.9064F, 1, 2, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 5.1315F, -0.8556F);
        this.backLeftLeg.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3142F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 6, -0.5F, 0.0133F, -0.0609F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.8315F, 0.3444F);
        this.backLeftLeg.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 53, -0.5F, -1.5F, -0.8F, 1, 4, 1, 0.003F, false));

        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 6.0111F, -0.4099F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.3927F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 49, 21, -0.8F, -0.0152F, -0.1661F, 1, 6, 1, -0.1F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.2848F, 0.2339F);
        this.backLeftLeg2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 48, 0.5F, -0.2726F, -0.2654F, 1, 6, 1, -0.2F, false));

        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 6.2791F, 0.6847F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.48F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.backLeftLeg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 21, -1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F, false));

        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.9F, -5.4F, 3.25F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.5236F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.3315F, 0.7444F);
        this.backRightLeg.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.192F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 25, -0.5F, -1.9512F, -0.9064F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.1315F, -0.8556F);
        this.backRightLeg.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3142F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 65, -0.5F, 0.0133F, -0.0609F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.8315F, 0.3444F);
        this.backRightLeg.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.192F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 13, -0.5F, -1.5F, -0.8F, 1, 4, 1, 0.003F, false));

        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 6.0111F, -0.4099F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6109F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 50, -0.2F, -0.0152F, -0.1661F, 1, 6, 1, -0.1F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.2848F, 0.2339F);
        this.backRightLeg2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 48, -1.5F, -0.2726F, -0.2654F, 1, 6, 1, -0.2F, false));

        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 6.2791F, 0.6847F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.backRightLeg3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 28, -1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -6.4F, 5.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0982F, 0.0929F, -0.2388F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 27, -0.5F, -0.4503F, 0.0625F, 1, 1, 6, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 66, 35, 0.0F, -2.0503F, 1.0625F, 0, 2, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.4503F, 5.0625F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.096F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 67, 0.0F, -1.6F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.4503F, 3.0625F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0349F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 66, 39, 0.0F, -1.6F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.5497F, 1.0625F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5061F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 68, 13, 0.0F, 1.3808F, 3.5506F, 0, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 49, 29, 0.0F, 0.7123F, 1.8202F, 0, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 67, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0504F, 6.1581F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0487F, -0.387F, 0.0687F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -0.5F, -0.3638F, -0.1603F, 1, 1, 7, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.3638F, 4.8397F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1222F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 67, 0.0F, -1.2F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.3638F, 2.8397F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1222F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 67, 0.0F, -1.4F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3638F, 0.8397F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 9, 0.0F, -1.6F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.6001F, -5.0956F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5061F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 69, 52, 0.0F, 5.0808F, 8.8506F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 69, 0.0F, 4.2808F, 7.1506F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 56, 0.0F, 2.4808F, 5.3506F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3556F, 6.8133F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0813F, -0.261F, 0.021F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 10, -0.5F, -0.0436F, -0.001F, 1, 1, 9, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 69, 0.0F, -0.8436F, 7.999F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.0436F, 5.999F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1134F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 43, 69, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.0436F, 3.999F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 67, 0.0F, -1.2F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.0436F, 1.999F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0698F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 67, 0.0F, -1.1F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.0436F, -0.001F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0524F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 40, 69, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.9557F, -11.909F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5061F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 67, 68, 0.0F, 9.1808F, 17.4506F, 0, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 5, 50, 0.0F, 8.3808F, 15.7506F, 0, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 9, 45, 0.0F, 7.5808F, 14.0506F, 0, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 69, 0.0F, 6.6808F, 12.1506F, 0, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 55, 69, 0.0F, 5.8808F, 10.4506F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4564F, 8.999F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0911F, -0.2052F, -0.1897F);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 10, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 69, 0.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 69, 49, 0.0F, -0.8F, 3.0F, 0, 1, 1, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 6.6F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1548F, -0.5618F, -0.083F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 30, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -6.825F, -0.75F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1051F, -0.0868F, -0.0091F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.1972F, -5.9158F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1222F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 65, 0.0F, -1.451F, 5.0052F, 0, 2, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 43, 65, 0.0F, -1.251F, 3.0052F, 0, 2, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 65, 0.0F, -1.051F, 1.0052F, 0, 2, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 19, -0.5F, 0.049F, 0.0052F, 1, 1, 6, 0.003F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.2F, 2.2241F, -9.691F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.0088F, 0.2018F, 0.3081F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 33, 57, 0.7F, -0.6645F, -0.8974F, 2, 2, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.7F, 2.1387F, -8.7418F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.8901F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 29, -0.5F, -0.2F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 29, 4.9F, -0.2F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.7F, -0.2837F, -5.9823F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.1519F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 12, 59, -0.5F, 0.0334F, -0.0452F, 1, 3, 1, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 12, 59, 4.9F, 0.0334F, -0.0452F, 1, 3, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.7F, 0.6163F, -5.6823F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -1.3788F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 6, -0.5F, -0.0586F, 0.0106F, 1, 3, 1, 0.008F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 6, 4.9F, -0.0586F, 0.0106F, 1, 3, 1, 0.008F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.7F, -0.6837F, -8.1823F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1571F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 5, 57, -0.5F, -0.008F, 0.0947F, 1, 1, 2, -0.004F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 5, 57, 4.9F, -0.008F, 0.0947F, 1, 1, 2, -0.004F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.7F, 0.5163F, -8.9823F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4014F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 33, 52, -0.5F, -0.8F, -0.7F, 1, 2, 2, 0.003F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 33, 52, 4.9F, -0.8F, -0.7F, 1, 2, 2, 0.003F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-2.7F, 2.1387F, -8.7418F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4538F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 50, 56, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.004F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 50, 56, 4.9F, -0.6F, -1.0F, 1, 1, 2, 0.004F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1109F, 0.3684F, -1.4454F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 43, -6.3833F, -1.3833F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3687F, 0.1097F, -0.4508F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 57, 67, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.296F, 0.2483F, -0.8529F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 67, 55, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0893F, 0.3016F, -1.3303F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 41, 41, -7.3833F, -1.3833F, -0.5F, 6, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2405F, 0.2041F, -0.7432F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 67, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3013F, 0.0905F, -0.3353F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 67, 47, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2508F, 0.0757F, -0.2872F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 67, 45, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1995F, 0.1706F, -0.6985F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 67, 43, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0737F, 0.2514F, -1.2822F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 21, 19, -6.3833F, -1.3833F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2005F, 0.0608F, -0.4651F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 27, 67, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1591F, 0.1368F, -0.8792F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 22, 67, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0585F, 0.2012F, -1.4602F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 58, 19, -3.3833F, -1.3833F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0636F, 0.218F, -1.3719F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 56, 41, -4.3833F, -1.3833F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1725F, 0.1481F, -0.79F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 35, 68, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2173F, 0.0658F, -0.3768F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 68, 17, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0737F, 0.2514F, -1.352F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 5, -5.3833F, -1.3833F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1995F, 0.1706F, -0.7683F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 66, 27, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2508F, 0.0757F, -0.357F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 64, 53, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0585F, -0.2012F, 1.4602F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 58, 19, 1.3833F, -1.3833F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1591F, -0.1368F, 0.8792F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 22, 67, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.5F, -0.1907F, -0.5813F);
        this.body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.2005F, -0.0608F, 0.4651F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 27, 67, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2173F, -0.0658F, 0.3768F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 68, 17, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1725F, -0.1481F, 0.79F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 35, 68, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, -0.3907F, -2.5813F);
        this.body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0636F, -0.218F, 1.3719F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 56, 41, 1.3833F, -1.3833F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.296F, -0.2483F, 0.8529F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 67, 55, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.3687F, -0.1097F, 0.4508F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 57, 67, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, -0.8907F, -10.4813F);
        this.body.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1109F, -0.3684F, 1.4454F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 43, 1.3833F, -1.3833F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.3013F, -0.0905F, 0.3353F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 67, 47, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2405F, -0.2041F, 0.7432F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 52, 67, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, -0.8907F, -8.4813F);
        this.body.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0893F, -0.3016F, 1.3303F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 41, 41, 1.3833F, -1.3833F, -0.5F, 6, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0737F, -0.2514F, 1.2822F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 21, 19, 1.3833F, -1.3833F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1995F, -0.1706F, 0.6985F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 67, 43, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, -0.5907F, -6.4813F);
        this.body.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.2508F, -0.0757F, 0.2872F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 67, 45, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0737F, -0.2514F, 1.352F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 44, 5, 1.3833F, -1.3833F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.1995F, -0.1706F, 0.7683F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 66, 27, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, -0.5907F, -4.5813F);
        this.body.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.2508F, -0.0757F, 0.357F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 64, 53, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 5.8028F, -7.3158F);
        this.body.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0349F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 0, -3.0F, -0.9754F, 0.0458F, 6, 1, 8, 0.0F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -1.2972F, -10.9158F);
        this.body.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.0698F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 69, 38, 0.0F, -1.0F, 4.0F, 0, 1, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 69, 35, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 69, 32, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 15, 35, -0.5F, -0.2F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(3.2F, 2.2241F, -9.691F);
        this.body.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 1.0088F, -0.2018F, -0.3081F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 33, 57, -2.7F, -0.6645F, -0.8974F, 2, 2, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, 3.3662F, -8.7358F);
        this.body.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.5236F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 24, 42, -0.5F, 0.4F, -2.1F, 1, 1, 4, 0.0F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.35F, 3.9362F, -9.2576F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0436F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 57, 55, -0.5F, -0.3844F, -0.388F, 1, 4, 1, 0.0F, false));

        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(-0.5F, 3.7931F, 0.4294F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.8727F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 28, 52, 0.0F, -0.7504F, 0.0316F, 1, 6, 1, -0.1F, false));
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 40, 52, 0.0F, 0.2496F, -0.7684F, 1, 5, 1, -0.2F, false));

        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 5.3398F, -0.0545F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.9599F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 0, 38, -1.0F, -0.5301F, -2.5954F, 3, 1, 3, 0.0F, false));

        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-3.35F, 3.9362F, -9.2576F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.7418F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 0, 58, -0.5F, -0.3844F, -0.388F, 1, 4, 1, 0.0F, false));

        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.5F, 3.7931F, 0.4294F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9163F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 52, 29, -1.0F, -0.7504F, 0.0316F, 1, 6, 1, -0.1F, false));
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 45, 52, -1.0F, 0.2496F, -0.7684F, 1, 5, 1, -0.2F, false));

        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 5.3398F, -0.0545F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1309F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 38, 8, -2.0F, -0.5301F, -2.5954F, 3, 1, 3, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.9263F, -10.8942F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0115F, -0.1304F, -0.088F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, -1.3327F, -4.5847F);
        this.neck.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.3054F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 69, 29, 0.0F, -1.2609F, 2.9858F, 0, 1, 1, 0.0F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 28, 69, 0.0F, -1.2609F, 0.9858F, 0, 1, 1, 0.0F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 28, 35, -0.5F, -0.6609F, -0.0142F, 1, 1, 5, 0.003F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.5F, -1.1644F, -3.2871F);
        this.neck.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.1063F, 0.4717F, -1.3261F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 55, 4, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.5F, -1.1644F, -3.2871F);
        this.neck.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.2971F, 0.3862F, -0.8743F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 67, 59, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.5F, -0.4644F, -1.2871F);
        this.neck.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.2497F, 0.3323F, -0.8037F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 67, 57, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.5F, -0.4644F, -1.2871F);
        this.neck.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0879F, 0.4039F, -1.2466F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 29, 8, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.5F, -1.1644F, -3.2871F);
        this.neck.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.2971F, -0.3862F, 0.8743F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 67, 59, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.5F, -1.1644F, -3.2871F);
        this.neck.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.1063F, -0.4717F, 1.3261F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 55, 4, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, -0.4644F, -1.2871F);
        this.neck.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.2497F, -0.3323F, 0.8037F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 67, 57, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, -0.4644F, -1.2871F);
        this.neck.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0879F, -0.4039F, 1.2466F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 29, 8, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2459F, -4.5216F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1733F, -0.267F, 0.0812F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, -0.5412F, -3.8904F);
        this.neck2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0349F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 25, 69, 0.0F, -0.6612F, 2.8918F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 69, 22, 0.0F, -0.7612F, 0.8918F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 41, 35, -0.5F, -0.0612F, -0.1082F, 1, 1, 4, 0.0F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-0.5F, -0.1185F, -2.6655F);
        this.neck2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0968F, 0.9742F, -1.3631F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 60, 43, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.5F, -0.1185F, -2.6655F);
        this.neck2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.6042F, 0.8237F, -0.7249F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 67, 64, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.5F, -0.2185F, -0.5655F);
        this.neck2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.2428F, 0.8406F, -1.2413F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 60, 11, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.5F, -0.2185F, -0.5655F);
        this.neck2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.6069F, 0.6629F, -0.7166F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 62, 67, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, -0.1185F, -2.6655F);
        this.neck2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.6042F, -0.8237F, 0.7249F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 67, 64, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, -0.1185F, -2.6655F);
        this.neck2.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0968F, -0.9742F, 1.3631F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 60, 43, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.5F, -0.2185F, -0.5655F);
        this.neck2.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.2428F, -0.8406F, 1.2413F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 60, 11, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.5F, -0.2185F, -0.5655F);
        this.neck2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.6069F, -0.6629F, 0.7166F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 62, 67, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2118F, -3.8631F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.31F, -0.2595F, -0.035F);


        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, 0.1706F, -3.5274F);
        this.neck3.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0175F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 22, 69, 0.0F, -1.2F, 2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 69, 19, 0.0F, -1.2F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 38, 13, -0.5F, -0.5F, -0.5F, 1, 1, 4, 0.003F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.5F, 0.1933F, -2.8024F);
        this.neck3.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.382F, 1.0273F, -1.0178F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 47, 60, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.5F, 0.1933F, -0.8024F);
        this.neck3.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.3215F, 0.9237F, -1.0691F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 60, 45, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.5F, 0.1933F, -2.8024F);
        this.neck3.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.382F, -1.0273F, 1.0178F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 47, 60, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.5F, 0.1933F, -0.8024F);
        this.neck3.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.3215F, -0.9237F, 1.0691F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 60, 45, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0894F, -4.2057F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1304F, -0.0114F, 0.0865F);
        this.head.cubeList.add(new ModelBox(head, 51, 7, -1.5F, 0.2988F, -0.7236F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 48, -1.0F, 0.1988F, -3.6236F, 2, 1, 2, 0.001F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.325F, 1.4572F, -6.6311F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.288F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 25, 64, -0.175F, -0.5F, -0.6F, 1, 1, 1, -0.2F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, 1.8867F, -5.1303F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 1.3352F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 64, 29, -0.6F, -1.1199F, -0.0546F, 1, 1, 1, -0.202F, true));
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 64, 29, -0.4F, -1.1199F, -0.0546F, 1, 1, 1, -0.202F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, 2.1988F, -5.0236F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.3054F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 22, 60, -0.675F, -1.8028F, -0.0987F, 1, 2, 1, -0.2F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 27, 60, -0.675F, -1.8028F, 0.7013F, 1, 2, 1, -0.2F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 27, 60, -0.325F, -1.8028F, 0.7013F, 1, 2, 1, -0.2F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 22, 60, -0.325F, -1.8028F, -0.0987F, 1, 2, 1, -0.2F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.475F, 1.6488F, -3.5236F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.1396F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 46, 48, -1.5F, -0.8F, -0.2F, 2, 1, 2, -0.2F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 1.0984F, -6.7131F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.1309F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 54, 21, -0.5F, -0.6F, -0.7F, 1, 1, 2, -0.199F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, 0.0188F, -5.4694F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.5149F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 52, 64, -0.5F, -0.1728F, -1.414F, 1, 1, 1, -0.2F, false));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 64, 50, -0.5F, -0.1728F, -0.814F, 1, 1, 1, -0.2F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, -0.2812F, -4.5694F);
        this.head.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.3229F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 64, 32, -0.5F, 0.0261F, -0.9627F, 1, 1, 1, 0.001F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, -0.3812F, -3.6694F);
        this.head.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.2007F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 20, 64, -0.5F, -0.0553F, -0.8646F, 1, 1, 1, 0.003F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.5F, -1.0012F, -1.7986F);
        this.head.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.288F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 40, 59, -0.5F, 0.9884F, -1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 28, 48, -0.5F, -0.0116F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.2F, -0.1085F, -4.6569F);
        this.head.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 1.9635F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 0, 64, -0.52F, -1.1134F, -0.8128F, 1, 1, 1, -0.2F, true));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 10, 64, -0.42F, -1.7134F, -0.8128F, 1, 1, 1, -0.199F, true));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 63, 16, -0.52F, -0.8134F, -0.8128F, 1, 1, 1, -0.199F, true));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(-0.2F, 0.1915F, -4.3569F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 1.6144F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 63, 13, -0.52F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.7F, 0.079F, -2.4187F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 1.4923F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 17, 60, -0.51F, -1.5F, -0.5F, 1, 2, 1, -0.2F, true));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(-0.7F, 0.4455F, -3.3492F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 1.6319F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 60, 0, -0.51F, -0.6F, -0.2F, 1, 2, 1, -0.199F, true));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, -1.1512F, 1.4014F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.0436F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 57, 64, -1.51F, 0.1994F, -3.101F, 1, 1, 1, -0.001F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 64, 61, -1.51F, 0.5994F, -3.101F, 1, 1, 1, -0.001F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 65, 0, -1.8F, 0.2994F, -3.101F, 1, 1, 1, -0.25F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 62, 64, -1.61F, 0.2994F, -3.101F, 1, 1, 1, -0.1F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 64, 61, 0.51F, 0.5994F, -3.101F, 1, 1, 1, -0.001F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 65, 0, 0.8F, 0.2994F, -3.101F, 1, 1, 1, -0.25F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 62, 64, 0.61F, 0.2994F, -3.101F, 1, 1, 1, -0.1F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 57, 64, 0.51F, 0.1994F, -3.101F, 1, 1, 1, -0.001F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 49, 17, -1.5F, -0.0006F, -3.201F, 3, 2, 1, -0.001F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(-1.2F, 0.5108F, 0.4171F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 1.3875F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 59, 61, -0.52F, -0.5F, -0.5F, 1, 1, 1, -0.204F, true));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 59, 61, 1.92F, -0.5F, -0.5F, 1, 1, 1, -0.204F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(-1.2F, -0.5917F, 0.1497F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.4625F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 47, 62, -0.52F, 0.406F, -0.7526F, 1, 1, 1, -0.2F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 42, 62, -0.52F, -0.194F, -0.7526F, 1, 1, 1, -0.204F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 47, 62, 1.92F, 0.406F, -0.7526F, 1, 1, 1, -0.2F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 42, 62, 1.92F, -0.194F, -0.7526F, 1, 1, 1, -0.204F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(-1.2F, 0.7083F, 0.1497F);
        this.head.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 1.0734F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 32, 61, -0.52F, -0.8574F, -0.2726F, 1, 1, 1, -0.199F, true));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-1.2F, 0.0083F, 0.0497F);
        this.head.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.0785F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 62, 58, -0.52F, -0.3F, -0.7F, 1, 1, 1, -0.2F, true));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 62, 55, -0.52F, -0.9F, -0.7F, 1, 1, 1, -0.199F, true));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 62, 58, 1.92F, -0.3F, -0.7F, 1, 1, 1, -0.2F, false));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 62, 55, 1.92F, -0.9F, -0.7F, 1, 1, 1, -0.199F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(0.0F, 0.6399F, 0.6333F);
        this.head.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -1.1694F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 54, 61, -1.5F, -0.4F, -1.3F, 1, 1, 1, 0.0F, true));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 54, 61, 0.5F, -0.4F, -1.3F, 1, 1, 1, 0.0F, false));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, -0.7012F, 0.5764F);
        this.head.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.48F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 62, 47, -1.5F, 0.001F, -0.6271F, 1, 1, 1, 0.0F, true));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 62, 47, 0.5F, 0.001F, -0.6271F, 1, 1, 1, 0.0F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 1.2988F, 0.2764F);
        this.head.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.1745F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 37, 62, -1.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 37, 62, 0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(0.2F, -0.1085F, -4.6569F);
        this.head.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 1.9635F, 0.0F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 10, 64, -0.58F, -1.7134F, -0.8128F, 1, 1, 1, -0.199F, false));
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 0, 64, -0.48F, -1.1134F, -0.8128F, 1, 1, 1, -0.2F, false));
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 63, 16, -0.48F, -0.8134F, -0.8128F, 1, 1, 1, -0.199F, false));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.2F, 0.1915F, -4.3569F);
        this.head.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 1.6144F, 0.0F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 63, 13, -0.48F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.7F, 0.4455F, -3.3492F);
        this.head.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 1.6319F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 60, 0, -0.49F, -0.6F, -0.2F, 1, 2, 1, -0.199F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.7F, 0.079F, -2.4187F);
        this.head.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 1.4923F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 17, 60, -0.49F, -1.5F, -0.5F, 1, 2, 1, -0.2F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(1.2F, 0.7083F, 0.1497F);
        this.head.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 1.0734F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 32, 61, -0.48F, -0.8574F, -0.2726F, 1, 1, 1, -0.199F, false));

        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(0.0F, -1.0512F, -0.7986F);
        this.head.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.0436F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 49, 13, -1.5F, -0.0045F, 0.0013F, 3, 2, 1, -0.001F, false));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(0.0F, 1.0282F, -5.1657F);
        this.head.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 1.2828F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 15, 64, -0.5F, -0.8851F, -0.3811F, 1, 1, 1, -0.1F, false));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(0.0F, 1.1988F, -3.3236F);
        this.head.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.0785F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 53, 0, -0.5F, -0.9618F, -1.9139F, 1, 1, 2, 0.0F, false));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(0.0F, 1.2988F, -0.7236F);
        this.head.addChild(cube_r134);
        this.setRotateAngle(cube_r134, -0.1047F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 51, 10, -1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0988F, 1.2264F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4573F, 0.013F, -0.0692F);
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 43, 0.2F, -0.0346F, -4.7791F, 1, 1, 2, -0.199F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 64, -0.4F, -0.3346F, -5.1791F, 1, 1, 1, -0.2F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 43, -1.2F, -0.0346F, -4.7791F, 1, 1, 2, -0.199F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 64, -0.6F, -0.3346F, -5.1791F, 1, 1, 1, -0.2F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 43, -0.6F, -0.2346F, -7.8791F, 1, 1, 3, -0.2F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 43, -0.4F, -0.2346F, -7.8791F, 1, 1, 3, -0.2F, true));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(0.0F, 0.4654F, -6.3791F);
        this.jaw.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.0698F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 44, 0, -0.7F, -0.4F, -0.5F, 1, 1, 3, -0.204F, true));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 55, 47, -0.5F, -0.4F, -1.5F, 1, 1, 2, -0.203F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 44, 0, -0.3F, -0.4F, -0.5F, 1, 1, 3, -0.2F, false));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(-0.2F, 0.1654F, -4.5791F);
        this.jaw.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.2269F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 54, 25, -1.0F, -0.2F, -0.1F, 1, 1, 2, -0.2F, true));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 54, 25, 0.4F, -0.2F, -0.1F, 1, 1, 2, -0.2F, false));

        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(-0.1F, -0.3346F, -2.3791F);
        this.jaw.addChild(cube_r137);
        this.setRotateAngle(cube_r137, -0.1047F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 35, 43, -1.59F, -0.2061F, -0.2223F, 1, 1, 3, -0.206F, true));

        this.cube_r138 = new ModelRenderer(this);
        this.cube_r138.setRotationPoint(-0.1F, -0.1346F, -2.9791F);
        this.jaw.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.1745F, 0.0F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 65, 3, -1.59F, -0.2989F, -0.1967F, 1, 1, 1, -0.199F, true));
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 65, 3, 0.79F, -0.2989F, -0.1967F, 1, 1, 1, -0.199F, false));

        this.cube_r139 = new ModelRenderer(this);
        this.cube_r139.setRotationPoint(-1.1F, 0.3629F, -0.0749F);
        this.jaw.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 0.2793F, 0.0F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 52, 37, -0.59F, -0.5F, -1.0F, 1, 1, 2, -0.2F, true));
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 52, 37, 1.79F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

        this.cube_r140 = new ModelRenderer(this);
        this.cube_r140.setRotationPoint(-0.1F, 0.9654F, -1.4791F);
        this.jaw.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.192F, 0.0F, 0.0F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 50, 52, -1.59F, -0.752F, -0.2342F, 1, 1, 2, -0.204F, true));
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 50, 52, 0.79F, -0.752F, -0.2342F, 1, 1, 2, -0.204F, false));

        this.cube_r141 = new ModelRenderer(this);
        this.cube_r141.setRotationPoint(-0.1F, 0.7654F, -3.0791F);
        this.jaw.addChild(cube_r141);
        this.setRotateAngle(cube_r141, -0.1571F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 17, 56, -1.59F, -1.2047F, 0.1774F, 1, 1, 2, -0.202F, true));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 5, 53, -1.59F, -0.8047F, -0.2226F, 1, 1, 2, -0.2F, true));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 5, 65, -1.6F, -1.1047F, 0.7774F, 1, 1, 1, -0.2F, true));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 5, 65, 0.8F, -1.1047F, 0.7774F, 1, 1, 1, -0.2F, false));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 17, 56, 0.79F, -1.2047F, 0.1774F, 1, 1, 2, -0.202F, false));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 5, 53, 0.79F, -0.8047F, -0.2226F, 1, 1, 2, -0.2F, false));

        this.cube_r142 = new ModelRenderer(this);
        this.cube_r142.setRotationPoint(0.1F, -0.3346F, -2.3791F);
        this.jaw.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.1047F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 35, 43, 0.59F, -0.2061F, -0.2223F, 1, 1, 3, -0.206F, false));

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
