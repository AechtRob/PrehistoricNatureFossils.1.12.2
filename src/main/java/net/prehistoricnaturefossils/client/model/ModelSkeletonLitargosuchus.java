package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLitargosuchus extends ModelBase {
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
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer backLeftLeg4;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer backRightLeg4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer body9_r1;
    private final ModelRenderer body12_r1;
    private final ModelRenderer body9_r2;
    private final ModelRenderer body10_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body9_r3;
    private final ModelRenderer body10_r2;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body11_r1;
    private final ModelRenderer body9_r4;
    private final ModelRenderer body8_r2;
    private final ModelRenderer body9_r5;
    private final ModelRenderer body8_r3;
    private final ModelRenderer body7_r2;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body8_r4;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer body2;
    private final ModelRenderer body10_r3;
    private final ModelRenderer cube_r26;
    private final ModelRenderer body8_r5;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body7_r3;
    private final ModelRenderer body8_r6;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer body9_r6;
    private final ModelRenderer body7_r4;
    private final ModelRenderer body7_r5;
    private final ModelRenderer body6_r4;
    private final ModelRenderer body5_r2;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontLeftLeg4;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer frontRightLeg4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;

    public ModelSkeletonLitargosuchus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -12.35F, 1.0F);
        this.fossil.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 21, 52, 0.0F, -1.0F, -1.9F, 1, 1, 2, -0.203F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 9, -0.5F, -1.0F, -3.4F, 1, 1, 5, -0.2F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 16, -0.8F, -1.3F, -3.4F, 1, 1, 5, -0.2F, false));
        this.main.cubeList.add(new ModelBox(main, 44, 42, 0.5F, -1.1F, -2.4F, 1, 1, 3, -0.2F, false));
        this.main.cubeList.add(new ModelBox(main, 21, 52, -1.0F, -1.0F, -1.9F, 1, 1, 2, -0.203F, true));
        this.main.cubeList.add(new ModelBox(main, 44, 42, -1.5F, -1.1F, -2.4F, 1, 1, 3, -0.2F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7032F, 0.7026F, -2.7941F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.1519F, 0.0F, -0.2443F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 36, -0.4266F, -0.1153F, -2.3641F, 1, 1, 3, -0.3F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6537F, 0.2978F, -0.8169F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4108F, 0.2086F, -0.3343F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 32, -0.5726F, -0.4665F, -0.334F, 1, 1, 2, -0.3F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.576F, 0.0F, -0.2443F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 59, -0.2F, -0.2106F, -0.0896F, 1, 1, 1, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, -0.2443F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 43, -0.2F, 0.2439F, -1.0113F, 1, 1, 2, -0.202F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5585F, 0.0F, -0.2443F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 61, -0.2F, -0.7F, 0.1F, 1, 1, 1, -0.199F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6109F, 0.0F, -0.2443F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 59, -0.2F, -0.5F, -0.5F, 1, 2, 1, -0.199F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7032F, 0.7026F, -2.7941F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1519F, 0.0F, 0.2443F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 36, -0.5734F, -0.1153F, -2.3641F, 1, 1, 3, -0.3F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6537F, 0.2978F, -0.8169F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4108F, -0.2086F, 0.3343F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 32, -0.4274F, -0.4665F, -0.334F, 1, 1, 2, -0.3F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.576F, 0.0F, 0.2443F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 65, 59, -0.8F, -0.2106F, -0.0896F, 1, 1, 1, -0.2F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1222F, 0.0F, 0.2443F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 43, -0.8F, 0.2439F, -1.0113F, 1, 1, 2, -0.202F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5585F, 0.0F, 0.2443F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 61, -0.8F, -0.7F, 0.1F, 1, 1, 1, -0.199F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.2F, -0.3533F, -1.4909F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6109F, 0.0F, 0.2443F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 59, -0.8F, -0.5F, -0.5F, 1, 2, 1, -0.199F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.3F, 0.1F, 1.1F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 59, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.2F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.1114F, 0.5363F, -1.6339F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1745F, 0.0F, -0.1309F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2997F, 3.2554F, -0.2904F);
        this.backLeftLeg.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1571F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 56, -0.5F, -0.7F, -0.2F, 1, 3, 1, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2997F, 2.7554F, -0.3904F);
        this.backLeftLeg.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 59, -0.5F, -3.4F, -0.1558F, 1, 1, 1, -0.2F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 56, -0.5F, -2.8F, -0.1558F, 1, 3, 1, -0.2F, false));

        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0464F, 5.5022F, 0.5442F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 1.1558F, -0.0181F, 0.1193F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 9, 48, 0.0431F, -0.4064F, -0.415F, 1, 6, 1, -0.3F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 49, -0.6069F, -0.4064F, -0.415F, 1, 6, 1, -0.25F, false));

        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.1931F, 5.3866F, 0.3901F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -1.0036F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 5, 56, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.2F, false));

        this.backLeftLeg4 = new ModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 2.5939F, 0.0386F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, 0.5498F, 0.0F, 0.0F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 49, 4, -1.0F, -0.3027F, -1.561F, 2, 1, 2, -0.2F, false));

        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.1114F, 0.5363F, -1.6339F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.0436F, 0.0F, 0.1309F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2997F, 3.2554F, -0.2904F);
        this.backRightLeg.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 56, -0.5F, -0.7F, -0.2F, 1, 3, 1, -0.2F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2997F, 2.7554F, -0.3904F);
        this.backRightLeg.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 59, -0.5F, -3.4F, -0.1558F, 1, 1, 1, -0.2F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 56, -0.5F, -2.8F, -0.1558F, 1, 3, 1, -0.2F, true));

        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.0464F, 5.5022F, 0.5442F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 1.1994F, 0.0181F, -0.1193F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 9, 48, -1.0431F, -0.4064F, -0.415F, 1, 6, 1, -0.3F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 49, -0.3931F, -0.4064F, -0.415F, 1, 6, 1, -0.25F, true));

        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-0.1931F, 5.3866F, 0.3901F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.48F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 5, 56, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.2F, true));

        this.backRightLeg4 = new ModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 2.5939F, 0.0386F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, 0.8988F, 0.0F, 0.0F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 49, 4, -1.0F, -0.3027F, -1.561F, 2, 1, 2, -0.2F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.425F, 1.4F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0318F, 0.0771F, -0.1369F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 11, -0.5F, -0.6034F, -0.2224F, 1, 1, 7, -0.203F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.3F, 1.07F, 1.3768F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5847F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 56, -0.5F, 1.3F, 3.5F, 1, 1, 1, -0.204F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 62, -0.5F, 0.7F, 2.5F, 1, 1, 1, -0.204F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 62, -0.5F, 0.1F, 1.5F, 1, 1, 1, -0.204F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 63, 48, -0.5F, -1.0F, 0.5F, 1, 1, 1, -0.204F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 62, -0.5F, -0.4F, 0.5F, 1, 1, 1, -0.204F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 6, -0.5F, -1.7F, -0.5F, 1, 2, 1, -0.204F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.6034F, -0.0224F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0175F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 20, -0.8F, -0.3F, -0.2F, 1, 1, 7, -0.204F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2801F, 6.552F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0685F, -0.2231F, 0.0736F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 29, -0.5F, -0.291F, -0.2129F, 1, 1, 7, -0.2F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.3F, 0.8187F, 0.2416F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4538F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 63, 51, -0.5F, 1.5F, 4.5F, 1, 1, 1, -0.2F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 63, 31, -0.5F, 1.1F, 3.5F, 1, 1, 1, -0.2F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 63, -0.5F, 0.7F, 2.5F, 1, 1, 1, -0.2F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 63, -0.5F, 0.2F, 1.5F, 1, 1, 1, -0.2F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 63, 6, -0.5F, -0.2F, 0.5F, 1, 1, 1, -0.2F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 60, 62, -0.5F, -0.8F, -0.5F, 1, 1, 1, -0.2F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.491F, -0.0129F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0349F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 30, -0.8F, -0.2F, -0.2F, 1, 1, 7, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1162F, 6.5678F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1963F, -0.3684F, -0.1224F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, -0.5F, -0.4246F, -0.264F, 1, 1, 8, -0.203F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1015F, 7.4871F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0395F, -0.3167F, -0.1017F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5174F, -0.1992F, 1, 1, 9, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -3.225F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.2395F, -0.2924F, -0.0995F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 3.2049F, -3.3528F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0087F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 23, -2.5F, -1.8429F, -0.1969F, 3, 2, 3, -0.2F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 5.1049F, -7.5528F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1658F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 29, -2.5F, -4.41F, 0.0319F, 3, 2, 4, -0.203F, false));

        this.body9_r1 = new ModelRenderer(this);
        this.body9_r1.setRotationPoint(-0.3F, -0.337F, -5.1683F);
        this.body.addChild(body9_r1);
        this.setRotateAngle(body9_r1, 0.1253F, 0.2288F, -1.242F);
        this.body9_r1.cubeList.add(new ModelBox(body9_r1, 50, 59, -3.0779F, -0.9499F, -0.4803F, 1, 1, 1, -0.203F, true));
        this.body9_r1.cubeList.add(new ModelBox(body9_r1, 20, 56, -2.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, true));

        this.body12_r1 = new ModelRenderer(this);
        this.body12_r1.setRotationPoint(-0.3F, -0.237F, -1.3683F);
        this.body.addChild(body12_r1);
        this.setRotateAngle(body12_r1, 0.0277F, -0.0974F, -1.3016F);
        this.body12_r1.cubeList.add(new ModelBox(body12_r1, 45, 59, -2.0779F, -0.9499F, -0.4803F, 1, 1, 1, -0.204F, true));
        this.body12_r1.cubeList.add(new ModelBox(body12_r1, 40, 59, -1.6779F, -0.9499F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body9_r2 = new ModelRenderer(this);
        this.body9_r2.setRotationPoint(-0.3F, -0.237F, -1.3683F);
        this.body.addChild(body9_r2);
        this.setRotateAngle(body9_r2, -0.0627F, -0.0795F, -0.3552F);
        this.body9_r2.cubeList.add(new ModelBox(body9_r2, 64, 43, -0.79F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body10_r1 = new ModelRenderer(this);
        this.body10_r1.setRotationPoint(-0.3F, -0.237F, -1.3683F);
        this.body.addChild(body10_r1);
        this.setRotateAngle(body10_r1, -0.0248F, -0.0981F, -0.7754F);
        this.body10_r1.cubeList.add(new ModelBox(body10_r1, 61, 35, -1.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-0.3F, -0.237F, -3.2683F);
        this.body.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 0.1749F, 0.0082F, -0.3636F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 15, 64, -0.79F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body9_r3 = new ModelRenderer(this);
        this.body9_r3.setRotationPoint(-0.3F, -0.237F, -3.2683F);
        this.body.addChild(body9_r3);
        this.setRotateAngle(body9_r3, 0.1568F, 0.0783F, -0.777F);
        this.body9_r3.cubeList.add(new ModelBox(body9_r3, 61, 28, -1.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));

        this.body10_r2 = new ModelRenderer(this);
        this.body10_r2.setRotationPoint(-0.3F, -0.237F, -3.2683F);
        this.body.addChild(body10_r2);
        this.setRotateAngle(body10_r2, 0.0969F, 0.1461F, -1.2997F);
        this.body10_r2.cubeList.add(new ModelBox(body10_r2, 56, 32, -2.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-0.3F, -0.337F, -5.1683F);
        this.body.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.2227F, 0.1359F, -0.7176F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 61, 22, -1.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-0.3F, -0.337F, -5.1683F);
        this.body.addChild(body6_r1);
        this.setRotateAngle(body6_r1, 0.258F, 0.0348F, -0.3094F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 5, 64, -0.79F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body11_r1 = new ModelRenderer(this);
        this.body11_r1.setRotationPoint(0.3F, -0.237F, -1.3683F);
        this.body.addChild(body11_r1);
        this.setRotateAngle(body11_r1, 0.0277F, 0.0974F, 1.3016F);
        this.body11_r1.cubeList.add(new ModelBox(body11_r1, 45, 59, 1.0779F, -0.9499F, -0.4803F, 1, 1, 1, -0.204F, false));
        this.body11_r1.cubeList.add(new ModelBox(body11_r1, 40, 59, 0.6779F, -0.9499F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.body9_r4 = new ModelRenderer(this);
        this.body9_r4.setRotationPoint(0.3F, -0.237F, -1.3683F);
        this.body.addChild(body9_r4);
        this.setRotateAngle(body9_r4, -0.0248F, 0.0981F, 0.7754F);
        this.body9_r4.cubeList.add(new ModelBox(body9_r4, 61, 35, 0.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));

        this.body8_r2 = new ModelRenderer(this);
        this.body8_r2.setRotationPoint(0.3F, -0.237F, -1.3683F);
        this.body.addChild(body8_r2);
        this.setRotateAngle(body8_r2, -0.0627F, 0.0795F, 0.3552F);
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 64, 43, -0.21F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.body9_r5 = new ModelRenderer(this);
        this.body9_r5.setRotationPoint(0.3F, -0.237F, -3.2683F);
        this.body.addChild(body9_r5);
        this.setRotateAngle(body9_r5, 0.0969F, -0.1461F, 1.2997F);
        this.body9_r5.cubeList.add(new ModelBox(body9_r5, 56, 32, 0.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, false));

        this.body8_r3 = new ModelRenderer(this);
        this.body8_r3.setRotationPoint(0.3F, -0.237F, -3.2683F);
        this.body.addChild(body8_r3);
        this.setRotateAngle(body8_r3, 0.1568F, -0.0783F, 0.777F);
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 61, 28, 0.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(0.3F, -0.237F, -3.2683F);
        this.body.addChild(body7_r2);
        this.setRotateAngle(body7_r2, 0.1749F, -0.0082F, 0.3636F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 15, 64, -0.21F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(0.3F, -0.337F, -5.1683F);
        this.body.addChild(body5_r1);
        this.setRotateAngle(body5_r1, 0.258F, -0.0348F, 0.3094F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 5, 64, -0.21F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(0.3F, -0.337F, -5.1683F);
        this.body.addChild(body6_r2);
        this.setRotateAngle(body6_r2, 0.2227F, -0.1359F, 0.7176F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 61, 22, 0.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));

        this.body8_r4 = new ModelRenderer(this);
        this.body8_r4.setRotationPoint(0.3F, -0.337F, -5.1683F);
        this.body.addChild(body8_r4);
        this.setRotateAngle(body8_r4, 0.1253F, -0.2288F, 1.242F);
        this.body8_r4.cubeList.add(new ModelBox(body8_r4, 50, 59, 2.0779F, -0.9499F, -0.4803F, 1, 1, 1, -0.203F, false));
        this.body8_r4.cubeList.add(new ModelBox(body8_r4, 20, 56, 0.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, -0.8951F, -6.4528F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0611F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 0, -1.8F, -0.2678F, -0.2053F, 1, 1, 7, -0.204F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -0.1951F, -7.3528F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 21, -1.5F, -0.6064F, 0.6633F, 1, 1, 7, -0.203F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1968F, -6.479F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.2252F, -0.1181F, 0.0714F);


        this.body10_r3 = new ModelRenderer(this);
        this.body10_r3.setRotationPoint(-0.3F, 0.5598F, -2.3894F);
        this.body2.addChild(body10_r3);
        this.setRotateAngle(body10_r3, 0.3127F, 0.7889F, -1.2599F);
        this.body10_r3.cubeList.add(new ModelBox(body10_r3, 40, 62, -1.9451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));
        this.body10_r3.cubeList.add(new ModelBox(body10_r3, 40, 62, -1.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.6F, 2.6995F, -2.0127F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.3106F, 0.1796F, 0.3999F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 52, -1.0F, -1.0F, -0.2F, 2, 2, 1, -0.2F, true));

        this.body8_r5 = new ModelRenderer(this);
        this.body8_r5.setRotationPoint(-0.3F, 0.5598F, -2.3894F);
        this.body2.addChild(body8_r5);
        this.setRotateAngle(body8_r5, 0.6279F, 0.5945F, -0.7738F);
        this.body8_r5.cubeList.add(new ModelBox(body8_r5, 30, 65, -0.79F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body6_r3);
        this.setRotateAngle(body6_r3, 0.4431F, 0.0881F, -0.3847F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 65, 0, -0.79F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, true));

        this.body7_r3 = new ModelRenderer(this);
        this.body7_r3.setRotationPoint(-0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body7_r3);
        this.setRotateAngle(body7_r3, 0.3752F, 0.2569F, -0.7744F);
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 30, 62, -1.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, true));

        this.body8_r6 = new ModelRenderer(this);
        this.body8_r6.setRotationPoint(-0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body8_r6);
        this.setRotateAngle(body8_r6, 0.1973F, 0.4085F, -1.3061F);
        this.body8_r6.cubeList.add(new ModelBox(body8_r6, 34, 56, -2.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.2F, -0.1713F, -1.5319F);
        this.body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 2.042F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 61, 16, -0.5F, -0.7225F, -0.705F, 1, 1, 1, -0.199F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.2F, 1.1287F, -1.8319F);
        this.body2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.1345F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 47, -0.5F, -0.5F, -1.4F, 1, 1, 3, -0.2F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.2F, -0.1713F, -1.5319F);
        this.body2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 2.042F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 16, -0.5F, -0.7225F, -0.705F, 1, 1, 1, -0.199F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6F, 2.6995F, -2.0127F);
        this.body2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.3106F, -0.1796F, -0.3999F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 52, -1.0F, -1.0F, -0.2F, 2, 2, 1, -0.2F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.2F, 1.1287F, -1.8319F);
        this.body2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.1345F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 47, -0.5F, -0.5F, -1.4F, 1, 1, 3, -0.2F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0052F, -3.5307F);
        this.body2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2094F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 0, -0.8F, -0.2351F, -0.3149F, 1, 1, 4, -0.2F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.4052F, -4.3307F);
        this.body2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2443F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 36, -0.5F, -0.8F, 0.8F, 1, 1, 4, -0.2F, false));

        this.body9_r6 = new ModelRenderer(this);
        this.body9_r6.setRotationPoint(0.3F, 0.5598F, -2.3894F);
        this.body2.addChild(body9_r6);
        this.setRotateAngle(body9_r6, 0.3127F, -0.7889F, 1.2599F);
        this.body9_r6.cubeList.add(new ModelBox(body9_r6, 40, 62, 0.9451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));
        this.body9_r6.cubeList.add(new ModelBox(body9_r6, 40, 62, 0.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));

        this.body7_r4 = new ModelRenderer(this);
        this.body7_r4.setRotationPoint(0.3F, 0.5598F, -2.3894F);
        this.body2.addChild(body7_r4);
        this.setRotateAngle(body7_r4, 0.6279F, -0.5945F, 0.7738F);
        this.body7_r4.cubeList.add(new ModelBox(body7_r4, 30, 65, -0.21F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.body7_r5 = new ModelRenderer(this);
        this.body7_r5.setRotationPoint(0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body7_r5);
        this.setRotateAngle(body7_r5, 0.1973F, -0.4085F, 1.3061F);
        this.body7_r5.cubeList.add(new ModelBox(body7_r5, 34, 56, 0.6779F, -0.9499F, -0.4803F, 2, 1, 1, -0.2F, false));

        this.body6_r4 = new ModelRenderer(this);
        this.body6_r4.setRotationPoint(0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body6_r4);
        this.setRotateAngle(body6_r4, 0.3752F, -0.2569F, 0.7744F);
        this.body6_r4.cubeList.add(new ModelBox(body6_r4, 30, 62, 0.3451F, -0.4447F, -0.4803F, 1, 1, 1, -0.203F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(0.3F, -0.0402F, -0.5894F);
        this.body2.addChild(body5_r2);
        this.setRotateAngle(body5_r2, 0.4431F, -0.0881F, 0.3847F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 65, 0, -0.21F, -0.1884F, -0.4803F, 1, 1, 1, -0.2F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.3954F, 2.3012F, -2.0491F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0814F, -0.1706F, -0.056F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.4309F, 2.5591F, -1.5565F);
        this.frontLeftLeg.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -0.1309F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 59, -0.2F, 0.2F, 1.0F, 1, 1, 1, -0.2F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 49, 26, -0.5F, -2.8F, 1.0F, 1, 4, 1, -0.2F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.1959F, 0.7745F, -0.0565F);
        this.frontLeftLeg.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2618F, 0.0F, -0.1309F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 57, -0.5F, -1.0F, -0.7F, 1, 2, 1, -0.203F, false));

        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.5471F, 3.4215F, 0.118F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -1.0469F, 0.0664F, 0.0462F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 49, 12, -0.1429F, -0.1492F, -0.5044F, 1, 5, 1, -0.25F, false));
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 49, 19, -0.7429F, -0.1492F, -0.5044F, 1, 5, 1, -0.3F, false));

        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.04F, 4.5479F, -0.2442F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.4282F, -0.0079F, -0.0112F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 54, 45, -0.497F, -0.1085F, -0.3045F, 1, 3, 1, -0.2F, false));

        this.frontLeftLeg4 = new ModelRenderer(this);
        this.frontLeftLeg4.setRotationPoint(-0.0157F, 2.391F, 0.2084F);
        this.frontLeftLeg3.addChild(frontLeftLeg4);
        this.setRotateAngle(frontLeftLeg4, 1.423F, -0.0223F, -0.0068F);
        this.frontLeftLeg4.cubeList.add(new ModelBox(frontLeftLeg4, 49, 0, -1.0F, -0.3F, -1.5F, 2, 1, 2, -0.2F, false));

        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.3954F, 2.3012F, -2.0491F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3561F, -0.0468F, 0.0737F);


        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.4309F, 2.5591F, -1.5565F);
        this.frontRightLeg.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.1309F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 59, -0.8F, 0.2F, 1.0F, 1, 1, 1, -0.2F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 26, -0.5F, -2.8F, 1.0F, 1, 4, 1, -0.2F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.1959F, 0.7745F, -0.0565F);
        this.frontRightLeg.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2618F, 0.0F, 0.1309F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 57, -0.5F, -1.0F, -0.7F, 1, 2, 1, -0.203F, true));

        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.5471F, 3.4215F, 0.118F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -1.3088F, -0.0674F, -0.0446F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 49, 12, -0.8571F, -0.1492F, -0.5044F, 1, 5, 1, -0.25F, true));
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 49, 19, -0.2571F, -0.1492F, -0.5044F, 1, 5, 1, -0.3F, true));

        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.04F, 4.5479F, -0.2442F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.4669F, -0.0001F, 0.0839F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 54, 45, -0.503F, -0.1085F, -0.3045F, 1, 3, 1, -0.2F, true));

        this.frontRightLeg4 = new ModelRenderer(this);
        this.frontRightLeg4.setRotationPoint(0.0157F, 2.391F, 0.2084F);
        this.frontRightLeg3.addChild(frontRightLeg4);
        this.setRotateAngle(frontRightLeg4, 0.9867F, 0.0223F, 0.0068F);
        this.frontRightLeg4.cubeList.add(new ModelBox(frontRightLeg4, 49, 0, -1.0F, -0.3F, -1.5F, 2, 1, 2, -0.2F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.7911F, -3.4403F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1907F, -0.3053F, -0.0083F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -1.0178F, -2.4449F);
        this.neck.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 27, 47, -1.3F, -0.2536F, -0.2012F, 1, 1, 3, -0.204F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.4178F, -2.4449F);
        this.neck.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 26, 42, -1.0F, -0.2513F, -0.2535F, 1, 1, 3, -0.203F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1141F, -2.5261F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2954F, -0.4606F, -0.1773F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, -0.9037F, 0.0312F);
        this.neck2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1047F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 39, -1.3F, -0.2448F, -2.5625F, 1, 1, 3, -0.2F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, -1.1037F, -2.6688F);
        this.neck2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2443F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 38, -1.0F, -0.1039F, 0.1057F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4795F, -1.9514F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2184F, 0.0416F, 0.0131F);
        this.head.cubeList.add(new ModelBox(head, 54, 36, -0.5F, -0.6231F, -1.8018F, 1, 1, 2, -0.2F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.7095F, -0.2994F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.7679F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 55, 56, -1.0F, -0.2743F, -0.1938F, 2, 1, 1, -0.2F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.8F, -0.9231F, -2.4018F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0087F, -0.3092F, 0.0564F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 65, -0.2F, -0.2622F, -1.3879F, 1, 1, 1, -0.2F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 45, 65, -0.2F, -0.2622F, -0.7879F, 1, 1, 1, -0.2F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.9864F, 0.2428F, -0.2919F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -1.1454F, 1.3149F, -0.5998F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 65, 62, -0.4F, -1.1F, -0.5F, 1, 1, 1, -0.2F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 60, 65, -0.4F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.3821F, 0.1325F, -0.8188F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.4131F, 0.7096F, -0.2291F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 66, 24, -0.4479F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.6803F, -0.2231F, -1.3496F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0258F, -0.0224F, -0.0535F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 66, 18, -0.2597F, -0.2122F, -0.1757F, 1, 1, 1, -0.2F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.2803F, 0.0769F, -2.9496F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0177F, -0.28F, -0.009F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 66, 21, -0.1835F, -1.0408F, 0.8619F, 1, 1, 1, -0.2F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 54, 24, -0.1835F, -0.5408F, -0.1381F, 1, 1, 2, -0.2F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.9803F, 0.2769F, -3.5496F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0359F, -0.4347F, 0.0186F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 20, 66, -0.1718F, -0.7702F, -0.0772F, 1, 1, 1, -0.2F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.4F, -0.1964F, -2.3028F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.055F, -0.3137F, 0.017F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 9, 43, -0.8F, -0.5F, -2.3F, 1, 1, 3, -0.2F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 55, 59, -0.81F, -0.4862F, -2.1F, 1, 1, 1, -0.2F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0F, 0.1769F, -3.5518F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1007F, -0.3778F, 0.07F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 42, 52, -0.2F, -0.6866F, -1.1998F, 1, 1, 2, -0.2F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.0231F, -6.4518F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0213F, -0.2062F, 0.0369F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 36, 47, -0.5F, -0.5F, -0.3F, 1, 1, 3, -0.3F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.2231F, -6.4518F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1693F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 65, 65, -0.51F, -0.2895F, -0.1965F, 1, 1, 1, -0.3F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 65, 65, -0.49F, -0.2895F, -0.1965F, 1, 1, 1, -0.3F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 49, 52, -0.5F, -0.3F, -0.2965F, 1, 1, 2, -0.3F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.6F, -0.5169F, -2.5866F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.124F, -0.2652F, 0.4699F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 26, 38, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.202F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 9, 39, -0.5F, -0.1F, -0.9F, 1, 1, 2, -0.2F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 61, 13, -0.63F, -0.4F, -0.4F, 1, 1, 1, -0.3F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 61, 10, -0.52F, -0.4F, -0.4F, 1, 1, 1, -0.2F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0743F, -0.3938F, 0.0924F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 48, 56, -0.1931F, -0.2205F, -0.8138F, 2, 1, 1, -0.2F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.2197F, 0.3898F, -0.0151F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 58, 0, -0.2F, -0.2144F, -0.1642F, 2, 1, 1, -0.2F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0671F, -0.395F, 0.0736F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 56, 50, -0.1931F, -0.2205F, -1.4138F, 2, 1, 1, -0.2F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.6F, -0.9095F, -0.3994F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.2621F, 0.6731F, -0.1182F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 58, 3, -0.2F, -0.1019F, -0.1514F, 2, 1, 1, -0.2F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.1F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2269F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 55, 65, -1.0F, -0.2231F, -0.1642F, 1, 1, 1, -0.2F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 55, 65, 0.2F, -0.2231F, -0.1642F, 1, 1, 1, -0.2F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 56, 53, -0.9F, -0.2144F, -0.1642F, 2, 1, 1, -0.2F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.1F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0524F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 60, 40, -1.0F, -0.2231F, -0.7642F, 1, 1, 1, -0.2F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 60, 40, 0.2F, -0.2231F, -0.7642F, 1, 1, 1, -0.2F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 49, 8, -0.9F, -0.2144F, -1.7642F, 2, 1, 2, -0.2F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.2197F, -0.3898F, 0.0151F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 58, 0, -1.8F, -0.2144F, -0.1642F, 2, 1, 1, -0.2F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(1.6F, -0.9095F, -0.3994F);
        this.head.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2621F, -0.6731F, 0.1182F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 58, 3, -1.8F, -0.1019F, -0.1514F, 2, 1, 1, -0.2F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.6F, -0.5169F, -2.5866F);
        this.head.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.124F, 0.2652F, -0.4699F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 9, 39, -0.5F, -0.1F, -0.9F, 1, 1, 2, -0.2F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 61, 13, -0.37F, -0.4F, -0.4F, 1, 1, 1, -0.3F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 61, 10, -0.48F, -0.4F, -0.4F, 1, 1, 1, -0.2F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 26, 38, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.202F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.4F, -0.1964F, -2.3028F);
        this.head.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.055F, 0.3137F, -0.017F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 55, 59, -0.19F, -0.4862F, -2.1F, 1, 1, 1, -0.2F, false));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 9, 43, -0.2F, -0.5F, -2.3F, 1, 1, 3, -0.2F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.0671F, 0.395F, -0.0736F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 56, 50, -1.8069F, -0.2205F, -1.4138F, 2, 1, 1, -0.2F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(1.8F, -0.9095F, -0.8994F);
        this.head.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.0743F, 0.3938F, -0.0924F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 48, 56, -1.8069F, -0.2205F, -0.8138F, 2, 1, 1, -0.2F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -0.5231F, -5.0018F);
        this.head.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.2269F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 40, 65, -0.5F, -0.187F, -0.7366F, 1, 1, 1, -0.2F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -0.9231F, -3.5018F);
        this.head.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.2967F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 28, 52, -0.5F, -0.243F, -1.788F, 1, 1, 2, -0.199F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.8F, -0.9231F, -2.4018F);
        this.head.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0087F, 0.3092F, -0.0564F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 45, 65, -0.8F, -0.2622F, -0.7879F, 1, 1, 1, -0.2F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 50, 65, -0.8F, -0.2622F, -1.3879F, 1, 1, 1, -0.2F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, -0.9231F, -2.4018F);
        this.head.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0175F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 65, 38, -0.5F, -0.2622F, -1.2879F, 1, 1, 1, -0.202F, false));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 35, 65, -0.5F, -0.2622F, -0.7879F, 1, 1, 1, -0.2F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.9864F, 0.2428F, -0.2919F);
        this.head.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -1.1454F, -1.3149F, 0.5998F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 65, 62, -0.6F, -1.1F, -0.5F, 1, 1, 1, -0.2F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 60, 65, -0.6F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(1.3821F, 0.1325F, -0.8188F);
        this.head.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.4131F, -0.7096F, 0.2291F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 66, 24, -0.5521F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(1.6803F, -0.2231F, -1.3496F);
        this.head.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0258F, 0.0224F, 0.0535F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 66, 18, -0.7403F, -0.2122F, -0.1757F, 1, 1, 1, -0.2F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.9803F, 0.2769F, -3.5496F);
        this.head.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.0359F, 0.4347F, -0.0186F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 20, 66, -0.8282F, -0.7702F, -0.0772F, 1, 1, 1, -0.2F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(1.2803F, 0.0769F, -2.9496F);
        this.head.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.0177F, 0.28F, 0.009F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 66, 21, -0.8165F, -1.0408F, 0.8619F, 1, 1, 1, -0.2F, false));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 54, 24, -0.8165F, -0.5408F, -0.1381F, 1, 1, 2, -0.2F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.2518F, 0.1768F, -5.2842F);
        this.head.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.0911F, -0.2062F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 45, 47, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.35F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.6511F, 0.2149F, -3.6252F);
        this.head.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0541F, -0.3243F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 54, 20, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.35F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.6511F, 0.2149F, -3.6252F);
        this.head.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0541F, 0.3243F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 54, 20, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.35F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(1.0F, 0.1769F, -3.5518F);
        this.head.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.1007F, 0.3778F, -0.07F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 42, 52, -0.8F, -0.6866F, -1.1998F, 1, 1, 2, -0.2F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.2518F, 0.1768F, -5.2842F);
        this.head.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.0911F, 0.2062F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 45, 47, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.35F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, -0.0231F, -6.4518F);
        this.head.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.0213F, 0.2062F, -0.0369F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 36, 47, -0.5F, -0.5F, -0.3F, 1, 1, 3, -0.3F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.3769F, -0.1018F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5061F, 0.0F, 0.0F);


        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(-1.6F, 0.1436F, -1.1481F);
        this.jaw.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.1396F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 54, 28, -0.5F, -0.4F, -0.35F, 1, 1, 2, -0.3F, true));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-1.5803F, 0.6436F, -2.1459F);
        this.jaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.1649F, -0.2103F, 0.0452F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 53, 41, -0.3F, -0.6676F, -0.3075F, 1, 1, 2, -0.3F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-1.7803F, 0.0436F, -0.8459F);
        this.jaw.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0467F, -0.2087F, 0.03F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 54, 16, -0.3487F, -0.3249F, -1.6854F, 1, 1, 2, -0.299F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-1.5158F, 0.3212F, -1.7061F);
        this.jaw.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.0096F, -0.1929F, 0.045F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 66, 9, -0.5F, -0.5F, -0.45F, 1, 1, 1, -0.35F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 66, 12, -0.5F, -0.5F, -0.75F, 1, 1, 1, -0.35F, true));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.7941F, 0.3141F, -3.0134F);
        this.jaw.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0497F, -0.4005F, 0.0204F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 66, 15, -0.7459F, -0.4567F, 0.4961F, 1, 1, 1, -0.35F, true));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.7941F, 0.3141F, -3.0134F);
        this.jaw.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.049F, -0.3656F, 0.0222F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 54, 12, -0.6833F, -0.4567F, -0.5039F, 1, 1, 2, -0.3F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-1.0803F, 0.5436F, -3.4459F);
        this.jaw.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.1276F, -0.383F, 0.0282F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 35, 52, -0.2775F, -0.7209F, -0.306F, 1, 1, 2, -0.3F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.8F, 0.3436F, -3.8481F);
        this.jaw.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, -0.5061F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 60, 59, -0.2802F, -0.5F, -0.4252F, 1, 1, 1, -0.3F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 61, -0.2802F, -0.5F, -0.0252F, 1, 1, 1, -0.3F, true));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.8F, 0.1436F, -3.8481F);
        this.jaw.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.0524F, -0.5061F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 5, 61, -0.2802F, -0.5005F, -0.4113F, 1, 1, 1, -0.35F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 10, 61, -0.2802F, -0.5005F, 0.1887F, 1, 1, 1, -0.35F, true));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(1.6F, 0.1436F, -1.1481F);
        this.jaw.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0F, -0.1396F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 54, 28, -0.5F, -0.4F, -0.35F, 1, 1, 2, -0.3F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.8F, 0.3436F, -3.8481F);
        this.jaw.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.5061F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 0, 61, -0.7198F, -0.5F, -0.0252F, 1, 1, 1, -0.3F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 60, 59, -0.7198F, -0.5F, -0.4252F, 1, 1, 1, -0.3F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.8F, 0.1436F, -3.8481F);
        this.jaw.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.0524F, 0.5061F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 10, 61, -0.7198F, -0.5005F, 0.1887F, 1, 1, 1, -0.35F, false));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 5, 61, -0.7198F, -0.5005F, -0.4113F, 1, 1, 1, -0.35F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, 0.3436F, -6.1481F);
        this.jaw.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, -0.2443F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 35, 42, -0.5F, -0.5F, -0.3F, 1, 1, 3, -0.3F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.3436F, -6.1481F);
        this.jaw.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0349F, -0.2443F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 44, -0.5F, -0.6F, -0.3F, 1, 1, 3, -0.35F, true));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 0.3436F, -6.1481F);
        this.jaw.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0349F, 0.2443F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 44, -0.5F, -0.6F, -0.3F, 1, 1, 3, -0.35F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, 0.3436F, -6.1481F);
        this.jaw.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, 0.2443F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 35, 42, -0.5F, -0.5F, -0.3F, 1, 1, 3, -0.303F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(1.7803F, 0.0436F, -0.8459F);
        this.jaw.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0467F, 0.2087F, -0.03F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 54, 16, -0.6513F, -0.3249F, -1.6854F, 1, 1, 2, -0.299F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.7941F, 0.3141F, -3.0134F);
        this.jaw.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0497F, 0.4005F, -0.0204F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 66, 15, -0.2541F, -0.4567F, 0.4961F, 1, 1, 1, -0.35F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.7941F, 0.3141F, -3.0134F);
        this.jaw.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.049F, 0.3656F, -0.0222F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 54, 12, -0.3167F, -0.4567F, -0.5039F, 1, 1, 2, -0.3F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(1.5158F, 0.3212F, -1.7061F);
        this.jaw.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.0096F, 0.1929F, -0.045F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 66, 12, -0.5F, -0.5F, -0.75F, 1, 1, 1, -0.35F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 66, 9, -0.5F, -0.5F, -0.45F, 1, 1, 1, -0.35F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(1.5803F, 0.6436F, -2.1459F);
        this.jaw.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.1649F, 0.2103F, -0.0452F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 53, 41, -0.7F, -0.6676F, -0.3075F, 1, 1, 2, -0.3F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(1.0803F, 0.5436F, -3.4459F);
        this.jaw.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.1276F, 0.383F, -0.0282F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 35, 52, -0.7225F, -0.7209F, -0.306F, 1, 1, 2, -0.3F, false));

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
