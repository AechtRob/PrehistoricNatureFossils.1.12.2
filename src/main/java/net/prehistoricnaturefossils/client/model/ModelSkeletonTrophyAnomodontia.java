package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyAnomodontia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Neck_r5;
    private final ModelRenderer Neck_r6;
    private final ModelRenderer Neck_r7;
    private final ModelRenderer Neck_r8;
    private final ModelRenderer Neck_r9;
    private final ModelRenderer Neck_r10;
    private final ModelRenderer Neck_r11;
    private final ModelRenderer Neck_r12;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Neck_r13;
    private final ModelRenderer Neck_r14;
    private final ModelRenderer Neck_r15;
    private final ModelRenderer Neck_r16;
    private final ModelRenderer Neck_r17;
    private final ModelRenderer Neck_r18;
    private final ModelRenderer Neck_r19;
    private final ModelRenderer Neck_r20;
    private final ModelRenderer Neck_r21;
    private final ModelRenderer Neck_r22;
    private final ModelRenderer Neck_r23;
    private final ModelRenderer Neck_r24;
    private final ModelRenderer Neck_r25;
    private final ModelRenderer Neck_r26;
    private final ModelRenderer Neck_r27;
    private final ModelRenderer Neck_r28;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r29;
    private final ModelRenderer Neck_r30;
    private final ModelRenderer Neck_r31;
    private final ModelRenderer Neck_r32;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Head_r3;
    private final ModelRenderer Head_r4;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperbeak;
    private final ModelRenderer Lefttusk;
    private final ModelRenderer Righttusk;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerbeak;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Eyes;
    private final ModelRenderer Eyes_r1;
    private final ModelRenderer Eyes_r2;
    private final ModelRenderer Eyes_r3;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonTrophyAnomodontia() {
        this.textureWidth = 150;
        this.textureHeight = 143;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 46, -13.0F, -6.0F, -18.0F, 26, 6, 36, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -16.0F, -3.0F, -21.0F, 32, 3, 42, 0.006F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-13.0F, -6.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7156F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 89, 0.0F, 0.0F, -7.0F, 2, 4, 14, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -29.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(2.5F, 9.85F, -2.9F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1061F, -0.1309F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 62, 89, -1.0F, -1.9435F, 7.749F, 2, 2, 9, 0.001F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-6.0F, -1.8946F, 9.7702F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2182F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 56, 120, 4.0F, -0.2489F, 1.9788F, 2, 1, 4, 0.001F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 43, 120, 6.0F, -0.2489F, 1.9788F, 2, 1, 4, 0.001F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 85, 109, 3.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 108, 106, 8.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, 2.3054F, 12.3702F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.6419F, 0.291F, -0.2113F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 67, 110, -0.1F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, false));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(3.0F, 2.3054F, 12.3702F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.6419F, -0.291F, 0.2113F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 52, 110, -0.9F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 88, 134, -0.1626F, 0.1453F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0529F, 0.107F, 0.374F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 134, 89, -1.5883F, 1.441F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 134, 54, 0.1626F, 0.1453F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0529F, -0.107F, -0.374F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 134, 58, 1.5883F, 1.441F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.0446F, 8.2702F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1077F, 0.1735F, 0.0187F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 33, 89, -1.0F, -0.8977F, -11.4576F, 2, 2, 12, 0.0F, false));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 29, 133, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 9, 130, -1.5592F, 1.5114F, 1.6159F, 0, 7, 1, 0.0F, false));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 49, 133, -1.7087F, 1.5684F, 3.6095F, 0, 6, 1, 0.0F, false));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 79, 133, -1.8582F, 1.6253F, 5.6031F, 0, 5, 1, 0.0F, false));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 85, 134, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 132, 133, -0.0935F, 0.1775F, 1.6159F, 0, 2, 1, 0.0F, false));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 126, 133, -0.1653F, 0.3205F, 3.6095F, 0, 2, 1, 0.0F, false));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 134, 101, -0.237F, 0.4635F, 5.6031F, 0, 2, 1, 0.0F, false));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.0529F, 0.107F, 0.374F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 106, 133, -1.4097F, 1.4545F, -0.3777F, 0, 3, 1, 0.0F, false));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 3, 135, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0529F, -0.107F, -0.374F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 103, 133, 1.4097F, 1.4545F, -0.3777F, 0, 3, 1, 0.0F, false));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 0, 135, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 134, 93, 0.237F, 0.4635F, 5.6031F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 123, 133, 0.1653F, 0.3205F, 3.6095F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 129, 133, 0.0935F, 0.1775F, 1.6159F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 134, 50, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 76, 133, 1.8582F, 1.6253F, 5.6031F, 0, 5, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 46, 133, 1.7087F, 1.5684F, 3.6095F, 0, 6, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 82, 110, 1.5592F, 1.5114F, 1.6159F, 0, 7, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 73, 130, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0023F, -11.0576F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0772F, 0.1739F, -0.004F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-3.5F, 6.3888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.04F, -0.2194F, -1.0477F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 78, 125, -0.8815F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(3.5F, 6.3888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.04F, 0.2194F, 1.0477F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 125, 70, -0.1185F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-2.0F, 1.1888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2222F, -0.0187F, 0.2589F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 104, 123, -1.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(2.0F, 1.1888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.2222F, 0.0187F, -0.2589F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 95, 123, 0.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, 0.1888F, -7.3821F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.1309F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 85, 89, -1.0F, -0.15F, -0.3F, 2, 2, 8, 0.001F, false));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.1449F, 0.0151F, 0.2561F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 100, 133, -1.3227F, 1.6691F, -0.5221F, 0, 4, 1, 0.0F, false));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.1384F, -0.0182F, 0.1296F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 94, 133, -1.3486F, 1.7464F, -2.5834F, 0, 4, 1, 0.0F, false));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0901F, -0.1068F, 0.8678F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 120, 133, 0.2205F, 0.2084F, -2.5834F, 0, 2, 1, 0.0F, false));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.1174F, -0.0866F, 0.9917F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 134, 74, 0.1873F, 0.134F, -0.5221F, 0, 2, 1, 0.0F, false));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0691F, 0.0585F, 0.3841F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 60, 133, -1.5276F, 1.5697F, 1.5194F, 0, 5, 1, 0.0F, false));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, 0.0905F, -0.0035F, 1.1237F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 134, 97, -0.0308F, 0.1991F, 1.5194F, 0, 2, 1, 0.0F, false));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0121F, 0.091F, 0.3781F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 35, 133, -1.7957F, 1.3312F, 3.5186F, 0, 6, 1, 0.0F, false));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0527F, 0.0752F, 1.1224F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 15, 134, -0.3897F, 0.2044F, 3.5186F, 0, 2, 1, 0.0F, false));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.1384F, 0.0182F, -0.1296F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 82, 133, 1.3486F, 1.7464F, -2.5834F, 0, 4, 1, 0.0F, false));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0901F, 0.1068F, -0.8678F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 109, 133, -0.2205F, 0.2084F, -2.5834F, 0, 2, 1, 0.0F, false));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.1449F, -0.0151F, -0.2561F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 97, 133, 1.3227F, 1.6691F, -0.5221F, 0, 4, 1, 0.0F, false));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.1174F, 0.0866F, -0.9917F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 134, 46, -0.1873F, 0.134F, -0.5221F, 0, 2, 1, 0.0F, false));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0691F, -0.0585F, -0.3841F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 52, 133, 1.5276F, 1.5697F, 1.5194F, 0, 5, 1, 0.0F, false));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0905F, 0.0035F, -1.1237F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 91, 134, 0.0308F, 0.1991F, 1.5194F, 0, 2, 1, 0.0F, false));

        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.0527F, -0.0752F, -1.1224F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 12, 134, 0.3897F, 0.2044F, 3.5186F, 0, 2, 1, 0.0F, false));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, -0.0121F, -0.091F, -0.3781F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 32, 133, 1.7957F, 1.3312F, 3.5186F, 0, 6, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.9388F, -7.1821F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.0831F, 0.7771F, 0.1315F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 116, -1.0F, -0.7984F, -4.9686F, 2, 2, 5, 0.0F, false));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.6516F, -1.4686F);
        this.Neck.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.2533F, -0.067F, 0.2533F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 134, 70, 0.0F, 0.0296F, -1.6553F, 0, 2, 1, 0.0F, false));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 1.1516F, -0.7686F);
        this.Neck.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.2382F, -0.1096F, 0.4232F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 26, 124, 0.0281F, -0.012F, -0.202F, 0, 3, 1, 0.0F, false));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 1.1516F, -0.7686F);
        this.Neck.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.2382F, 0.1096F, -0.4232F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 78, 120, -0.0281F, -0.012F, -0.202F, 0, 3, 1, 0.0F, false));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.6516F, -1.4686F);
        this.Neck.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.2533F, 0.067F, -0.2533F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 18, 134, 0.0F, 0.0296F, -1.6553F, 0, 2, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1016F, -2.9686F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.3874F, 0.2509F, -0.0823F);
        this.Head.cubeList.add(new ModelBox(Head, 33, 104, -1.5F, -2.6843F, -5.8526F, 3, 5, 6, 0.0F, false));

        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-3.59F, -1.4343F, -0.7526F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 1.2331F, 1.0853F, 1.9594F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 82, 119, -0.6654F, -0.7655F, -0.1036F, 2, 1, 4, -0.001F, false));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(-2.39F, 1.4657F, -6.3526F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.5438F, -0.4421F, 0.2152F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 125, 64, 0.11F, 0.0334F, 2.9184F, 1, 1, 4, -0.001F, false));
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 131, 128, 0.11F, 0.0334F, -0.0816F, 1, 1, 3, -0.001F, false));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(3.61F, -1.4343F, -0.7526F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, 1.2331F, -1.0853F, -1.9594F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 113, 116, -1.3346F, -0.7655F, -0.1036F, 2, 1, 4, -0.001F, false));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(2.41F, 1.4657F, -6.3526F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.5438F, 0.4421F, -0.2152F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 21, 108, -1.11F, 0.0334F, 2.9184F, 1, 1, 4, -0.001F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 64, 130, -1.11F, 0.0334F, -0.0816F, 1, 1, 3, -0.001F, false));

        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -3.5843F, -3.0526F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.0637F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 1.0613F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 108, 97, -1.99F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.Upperbeak = new ModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.2972F, 0.0F, 0.0F);
        this.Upperbeak.cubeList.add(new ModelBox(Upperbeak, 122, 128, -1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F, false));

        this.Lefttusk = new ModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -1.1037F, 0.1274F, 0.0F);


        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -1.1037F, -0.1274F, 0.0F);
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 95, 119, 0.0F, 0.3F, -0.5F, 1, 2, 1, 0.0F, false));
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 64, 126, -3.98F, -0.1F, -0.3F, 1, 2, 1, 0.0F, false));

        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.8157F, -0.8426F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.3722F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 46, 126, 1.5F, 0.0F, -3.0F, 1, 3, 3, -0.001F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 55, 126, -2.48F, 0.0F, -3.0F, 1, 3, 3, -0.001F, false));

        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.2972F, 0.0F, 0.0F);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 132, 105, 1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 113, 132, -1.98F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.3609F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 100, 109, 0.5F, -3.0F, -1.5F, 1, 3, 2, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 22, 129, -1.48F, -3.0F, -1.5F, 1, 3, 2, 0.0F, false));

        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.4882F, 0.0F, 0.0F);
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 0, 130, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerbeak = new ModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerbeak);
        this.Lowerbeak.cubeList.add(new ModelBox(Lowerbeak, 13, 129, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.01F, 0.5F, -4.2F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);


        this.Eyes = new ModelRenderer(this);
        this.Eyes.setRotationPoint(0.0F, -2.2843F, -4.2526F);
        this.Head.addChild(Eyes);
        this.setRotateAngle(Eyes, -0.0637F, 0.0F, 0.0F);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 15, 116, -1.99F, -1.5F, -1.8F, 4, 4, 3, 0.01F, false));

        this.Eyes_r1 = new ModelRenderer(this);
        this.Eyes_r1.setRotationPoint(0.01F, -1.45F, 1.5F);
        this.Eyes.addChild(Eyes_r1);
        this.setRotateAngle(Eyes_r1, -0.2618F, 0.0F, 0.0F);
        this.Eyes_r1.cubeList.add(new ModelBox(Eyes_r1, 13, 124, -1.5F, 0.05F, -0.3F, 3, 1, 3, 0.0F, false));

        this.Eyes_r2 = new ModelRenderer(this);
        this.Eyes_r2.setRotationPoint(-2.89F, 2.15F, 1.2F);
        this.Eyes.addChild(Eyes_r2);
        this.setRotateAngle(Eyes_r2, 0.3453F, -0.4873F, 0.3356F);
        this.Eyes_r2.cubeList.add(new ModelBox(Eyes_r2, 55, 133, -0.5F, -3.25F, 0.4F, 1, 3, 1, 0.0F, false));

        this.Eyes_r3 = new ModelRenderer(this);
        this.Eyes_r3.setRotationPoint(2.91F, 2.15F, 1.2F);
        this.Eyes.addChild(Eyes_r3);
        this.setRotateAngle(Eyes_r3, 0.3453F, 0.4873F, -0.3356F);
        this.Eyes_r3.cubeList.add(new ModelBox(Eyes_r3, 132, 111, -0.5F, -3.25F, 0.4F, 1, 3, 1, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8469F, 0.1059F, -1.2821F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 122, 122, -1.1997F, -0.0792F, -1.8757F, 3, 2, 3, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 52, 104, -0.8997F, 1.9208F, -1.2757F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 30, 116, -0.8997F, 4.9208F, -2.2757F, 2, 2, 4, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.8997F, 5.7208F, 0.4243F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.4481F, 0.1959F, 1.3144F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 69, 120, -0.5F, -1.0F, -0.5F, 2, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 39, 126, -0.5F, -1.0F, -2.0F, 2, 7, 1, 0.0F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.0806F, 5.2224F, 0.3635F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.1061F, -0.0281F, 0.0979F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 106, 89, -1.9F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.6644F, -0.037F, 1.3937F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 124, -1.8003F, -0.0792F, -1.8757F, 3, 2, 3, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 126, 116, -1.1003F, 1.9208F, -1.2757F, 2, 3, 2, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 100, 116, -1.1003F, 4.9208F, -2.2757F, 2, 2, 4, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.8997F, 5.7208F, 0.4243F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.7039F, -0.2954F, -1.1047F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 113, 122, -1.5F, -1.0F, -0.5F, 2, 7, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 87, 125, -1.5F, -1.0F, -2.0F, 2, 7, 1, 0.0F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.6698F, 0.3203F, -0.1465F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 0, 108, -3.1F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.9446F, 16.6702F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3725F, 0.2446F, -0.0943F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 125, 78, -1.0F, -0.8963F, -0.3183F, 2, 2, 3, -0.001F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3034F, 2.4703F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2746F, 0.3794F, -0.104F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 125, 84, -1.0F, -0.5898F, -0.137F, 2, 1, 3, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.0399F, 2.5309F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.3725F, 0.5355F, -0.1968F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 43, 116, -0.5F, -0.5011F, -0.3162F, 1, 1, 2, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4785F, 0.0152F, -1.0078F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 30, 123, -1.0285F, -0.5839F, -0.9225F, 2, 7, 2, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.7285F, 5.9161F, -0.1225F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2508F, -0.2325F, 1.2031F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 125, 46, -0.8248F, -0.3182F, -1.2453F, 2, 6, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 127, 89, -0.8248F, -0.3182F, 1.4547F, 2, 6, 1, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0752F, 4.6818F, 0.6547F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, -0.4245F, 0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 85, 100, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.5751F, -0.0299F, 0.7061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 123, 106, -0.9715F, -0.5839F, -0.9225F, 2, 7, 2, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.7285F, 5.9161F, -0.1225F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5754F, 0.1343F, -0.8622F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 125, 55, -1.1752F, -0.3182F, -1.2453F, 2, 6, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 127, 97, -1.1752F, -0.3182F, 1.4547F, 2, 6, 1, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.0752F, 4.6818F, 0.6547F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 62, 101, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

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
