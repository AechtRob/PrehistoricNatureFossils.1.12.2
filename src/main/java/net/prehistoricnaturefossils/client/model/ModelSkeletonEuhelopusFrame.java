package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEuhelopusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail7;
    private final ModelRenderer cube_r11;
    private final ModelRenderer body;
    private final ModelRenderer cube_r12;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r18;
    private final ModelRenderer neck7;
    private final ModelRenderer cube_r19;
    private final ModelRenderer neck8;
    private final ModelRenderer cube_r20;
    private final ModelRenderer head;
    private final ModelRenderer ForeHead;
    private final ModelRenderer ForeHead2;
    private final ModelRenderer Snout;
    private final ModelRenderer Snout2;
    private final ModelRenderer Snout3;
    private final ModelRenderer Nose;
    private final ModelRenderer Nose2;
    private final ModelRenderer jaw;
    private final ModelRenderer Jaw2;
    private final ModelRenderer Jaw3;

    public ModelSkeletonEuhelopusFrame() {
        this.textureWidth = 208;
        this.textureHeight = 208;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -40.0F, 10.2F, 1, 40, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -37.0F, -22.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0349F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.9F, -21.0F, -0.5F, 1, 58, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -37.0F, -22.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -5.5F, -12.0F, -0.5F, 1, 28, 1, -0.005F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -42.0F, 10.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -6.5F, -8.0F, -0.5F, 1, 15, 1, -0.005F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -35.4408F, 13.9016F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, -0.2182F, 0.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.8755F, -0.5185F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 53, -1.0F, -0.5F, -7.5F, 2, 4, 15, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(7.0F, -0.1879F, 0.4316F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.3491F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 19.2608F, -2.167F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1134F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.2F, 13.8954F, 0.674F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2793F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.5183F, -4.6842F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-7.0F, -0.1879F, 0.4316F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 19.2608F, -2.167F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5934F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.2F, 13.8954F, 0.674F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1571F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.5183F, -4.6842F);
        this.rightFoot.addChild(rightToes);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.9F, 6.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3303F, 0.1514F, -0.0975F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7298F, 6.1422F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 82, 32, -1.0F, -0.3F, -6.5F, 2, 3, 13, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.9803F, 12.3651F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0031F, 0.1312F, -0.0429F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.63F, -0.1866F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 86, -1.0F, 1.0F, 0.0F, 2, 3, 13, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.93F, 12.6134F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1967F, 0.1369F, -0.0169F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.9728F, 0.0373F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 85, -0.5F, 0.9F, -0.1F, 1, 2, 14, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.1228F, 13.6373F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0358F, -0.218F, -0.0077F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.3962F, 0.2872F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 88, 49, -0.5F, 0.8F, -0.2F, 1, 1, 14, -0.003F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.6462F, 14.0872F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0354F, -0.1744F, 0.0062F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 101, -0.5F, 0.6F, -0.4F, 1, 1, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.65F, 12.9F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.2494F, -0.4244F, -0.1045F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.206F, 0.0522F);
        this.tail6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 107, 85, -0.5F, 0.6F, -0.1F, 1, 1, 12, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.594F, 11.9522F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2916F, -0.3777F, 0.1102F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3381F, -0.0261F);
        this.tail7.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 92, -0.5F, 0.6F, -0.3F, 1, 1, 14, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.6F, -8.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.22F, -0.1278F, 0.0285F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.1873F, -15.3874F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 31, -1.0F, 0.8455F, -0.0348F, 2, 4, 17, -0.003F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.284F, -15.063F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.394F, 0.0806F, 0.0335F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.3784F, -13.5053F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3229F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 67, -1.0F, 0.8639F, -0.3668F, 2, 3, 15, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(8.75F, 18.0716F, -6.6053F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.48F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.25F, -1.4402F, -7.4691F);
        this.leftArm.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.8588F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.5F, -4.8751F, -17.584F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.7854F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(1.0F, -3.5961F, -9.1411F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 0.6196F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-21.75F, -1.4402F, -7.4691F);
        this.leftArm.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 1.4224F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.5F, -4.8751F, -17.584F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.5236F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(-1.0F, -3.5961F, -9.1411F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 0.2269F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.2956F, -13.6225F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.7854F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.6499F, 0.3554F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, -0.0349F, -0.0012F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 1, 73, -1.0F, -1.7617F, -14.9954F, 2, 3, 15, -0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4117F, -13.9703F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2931F, -0.1627F, -0.2235F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.6563F, -32.8293F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 1, 0, -1.0F, 0.7F, 6.0F, 2, 3, 27, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0817F, -26.8308F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0175F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 75, 67, -1.0F, -0.7696F, -13.9233F, 2, 3, 14, -0.003F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.2696F, -13.8233F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1309F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.3612F, -14.6799F);
        this.neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1222F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 83, 14, -1.0F, 1.0F, 0.8F, 2, 3, 14, 0.0F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.6612F, -13.7799F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0175F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.8971F, -16.2753F);
        this.neck5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1396F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 31, -0.5F, 1.0F, -1.3F, 1, 2, 18, 0.0F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -1.9493F, -17.6787F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1745F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4119F, 0.2562F);
        this.neck6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1398F, -0.0518F, 0.0073F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 133, -0.5F, -0.4851F, -7.164F, 1, 2, 7, -0.003F, false));

        this.neck7 = new ModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -1.33F, -6.5485F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.2127F, -0.0932F, -0.1971F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.2262F, 0.0078F, 2.1942F);
        this.neck7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1396F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 122, 53, -1.7262F, 0.5933F, -10.1634F, 1, 2, 8, 0.0F, false));

        this.neck8 = new ModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -1.0784F, -7.5944F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, -0.235F, -0.0862F, -0.0137F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.2062F, -0.621F);
        this.neck8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 157, -0.5F, 0.1F, -4.4F, 1, 2, 5, -0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.6502F, -4.8819F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);


        this.ForeHead = new ModelRenderer(this);
        this.ForeHead.setRotationPoint(0.0F, -2.5408F, -1.9619F);
        this.head.addChild(ForeHead);
        this.setRotateAngle(ForeHead, -0.3054F, 0.0F, 0.0F);


        this.ForeHead2 = new ModelRenderer(this);
        this.ForeHead2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.ForeHead.addChild(ForeHead2);
        this.setRotateAngle(ForeHead2, 0.3491F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -1.5408F, -1.9619F);
        this.head.addChild(Snout);
        this.setRotateAngle(Snout, 0.0873F, 0.0F, 0.0F);


        this.Snout2 = new ModelRenderer(this);
        this.Snout2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Snout.addChild(Snout2);
        this.setRotateAngle(Snout2, -0.2618F, 0.0F, 0.0F);


        this.Snout3 = new ModelRenderer(this);
        this.Snout3.setRotationPoint(0.0F, -0.15F, -1.5F);
        this.Snout2.addChild(Snout3);
        this.setRotateAngle(Snout3, 0.1309F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Snout2.addChild(Nose);
        this.setRotateAngle(Nose, -0.1309F, 0.0F, 0.0F);


        this.Nose2 = new ModelRenderer(this);
        this.Nose2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Nose.addChild(Nose2);
        this.setRotateAngle(Nose2, 0.9861F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3917F, -0.4476F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0611F, 0.0F, 0.0F);


        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(0.0F, -0.195F, -2.4516F);
        this.jaw.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1309F, 0.0F, 0.0F);


        this.Jaw3 = new ModelRenderer(this);
        this.Jaw3.setRotationPoint(0.0F, 1.0F, -3.95F);
        this.Jaw2.addChild(Jaw3);

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
