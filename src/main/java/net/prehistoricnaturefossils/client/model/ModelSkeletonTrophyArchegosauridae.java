package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyArchegosauridae extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Neck_r5;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Neck_r6;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Neck_r7;
    private final ModelRenderer Neck_r8;
    private final ModelRenderer Neck_r9;
    private final ModelRenderer Neck_r10;
    private final ModelRenderer Neck_r11;
    private final ModelRenderer Neck_r12;
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
    private final ModelRenderer Bodyfront;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck_r23;
    private final ModelRenderer Neck_r24;
    private final ModelRenderer Neck_r25;
    private final ModelRenderer Neck_r26;
    private final ModelRenderer Neck_r27;
    private final ModelRenderer Neck_r28;
    private final ModelRenderer Neck_r29;
    private final ModelRenderer Neck_r30;
    private final ModelRenderer Neck_r31;
    private final ModelRenderer Neck_r32;
    private final ModelRenderer Neck_r33;
    private final ModelRenderer Neck_r34;
    private final ModelRenderer Neck_r35;
    private final ModelRenderer Neck_r36;
    private final ModelRenderer Neck_r37;
    private final ModelRenderer Neck_r38;
    private final ModelRenderer Neck_r39;
    private final ModelRenderer Neck_r40;
    private final ModelRenderer Neck_r41;
    private final ModelRenderer Neck_r42;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r43;
    private final ModelRenderer Neck_r44;
    private final ModelRenderer Neck_r45;
    private final ModelRenderer Neck_r46;
    private final ModelRenderer Neck_r47;
    private final ModelRenderer Neck_r48;
    private final ModelRenderer Head;
    private final ModelRenderer Eyeportion;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperjawslope2;
    private final ModelRenderer Leftupperteeth2;
    private final ModelRenderer Rightupperteeth2;
    private final ModelRenderer Upperjawslope1;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Righteye_r1;
    private final ModelRenderer Righteye2;
    private final ModelRenderer Righteye_r2;
    private final ModelRenderer Leftupperlip1;
    private final ModelRenderer Leftupperlip2;
    private final ModelRenderer Leftupperlip3;
    private final ModelRenderer Leftupperteeth1;
    private final ModelRenderer Rightupperlip1;
    private final ModelRenderer Rightupperlip2;
    private final ModelRenderer Rightupperlip3;
    private final ModelRenderer Rightupperteeth1;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddlebase;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Leftlowerteeth2;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Rightlowerteeth4;
    private final ModelRenderer Leftlowerlip3;
    private final ModelRenderer Rightlowerlip3;
    private final ModelRenderer Rightlowerlip4;
    private final ModelRenderer Lowerjawslope1;
    private final ModelRenderer Lowerjawslope2;
    private final ModelRenderer Lowerjawslope2_r1;
    private final ModelRenderer Leftlowerteeth1;
    private final ModelRenderer Rightlowerteeth1;
    private final ModelRenderer Rightlowerteeth3;
    private final ModelRenderer Leftlowerlip1;
    private final ModelRenderer Leftlowerlip2;
    private final ModelRenderer Rightlowerlip1;
    private final ModelRenderer Rightlowerlip2;
    private final ModelRenderer Rightlowerlip3_r1;
    private final ModelRenderer Rightlowerlip5;
    private final ModelRenderer Rightlowerlip6;
    private final ModelRenderer Rightlowerlip4_r1;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r2;
    private final ModelRenderer Tailbase_r3;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailbase_r4;
    private final ModelRenderer Tailbase_r5;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailbase_r6;
    private final ModelRenderer Tailbase_r7;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailfinend;
    private final ModelRenderer Tailfindorsal4;
    private final ModelRenderer Tailfinventral4;
    private final ModelRenderer Tailfindorsal3;
    private final ModelRenderer Tailfinventral3;
    private final ModelRenderer Tailfindorsal2;
    private final ModelRenderer Tailfinventral2;
    private final ModelRenderer Tailfindorsal1;
    private final ModelRenderer Tailfinventral1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonTrophyArchegosauridae() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 55, -8.0F, -4.0F, -24.0F, 16, 4, 48, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -2.0F, -26.0F, 20, 2, 52, 0.005F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 15, 137, -2.0F, -19.0F, -17.0F, 1, 15, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 105, 142, 2.5F, -16.0F, 13.0F, 1, 12, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-8.0F, -4.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 108, 0.0F, 0.0F, -7.0F, 2, 3, 14, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(-1.0F, -7.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(4.0F, -8.9F, 11.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, 0.0997F, -0.0179F, 0.0787F);
        this.Hips.cubeList.add(new ModelBox(Hips, 33, 123, -0.5F, -0.7028F, -5.4109F, 1, 1, 9, 0.001F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.6F, 1.7332F, -1.0581F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0295F, -0.0322F, 0.8286F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 137, 148, -0.172F, -3.0672F, -0.1343F, 1, 3, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.6F, 1.7332F, -2.0581F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0334F, 0.028F, -0.6977F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 132, 0.0F, -0.0338F, -0.1352F, 1, 3, 6, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.6F, 1.7332F, -2.0581F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0334F, -0.028F, 0.6977F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 85, 132, -1.0F, -0.0338F, -0.1352F, 1, 3, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(2.6F, 1.7332F, -1.0581F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0295F, 0.0322F, -0.8286F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 148, -0.828F, -3.0672F, -0.1343F, 1, 3, 2, 0.0F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-0.5F, -0.5028F, -1.9109F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.1619F, 0.1239F, -0.5918F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 154, 133, -0.839F, 0.0078F, -0.3982F, 1, 0, 1, 0.0F, false));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-0.5F, -0.5028F, -3.9109F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.1596F, 0.1521F, -1.3189F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 110, 147, -2.2712F, -1.1984F, -0.3982F, 1, 0, 1, 0.0F, false));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(-0.5F, -0.5028F, -3.9109F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0137F, 0.2196F, -0.5664F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 48, 153, -1.839F, 0.0078F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(0.5F, -0.5028F, -1.9109F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.1619F, -0.1239F, 0.5918F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 9, 151, -0.161F, 0.0078F, -0.3982F, 1, 0, 1, 0.0F, false));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(0.5F, -0.5028F, -3.9109F);
        this.Hips.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.1596F, -0.1521F, 1.3189F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 85, 130, 1.2712F, -1.1984F, -0.3982F, 1, 0, 1, 0.0F, false));

        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, -0.6593F, 3.9618F);
        this.Hips.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.3491F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 151, 154, 0.0F, 1.9845F, -7.4447F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 154, 139, 0.0F, 1.1822F, -5.6127F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 139, 154, 0.0F, 0.3799F, -3.7807F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 136, 154, 0.0F, -0.2392F, -1.8684F, 0, 1, 1, 0.0F, false));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(0.5F, -0.5028F, -3.9109F);
        this.Hips.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.0137F, -0.2196F, 0.5664F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 34, 153, -0.161F, 0.0078F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.2885F, -4.6614F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.114F, 0.083F, -0.1016F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 64, 122, -0.5F, -0.4F, -8.8F, 1, 1, 9, 0.0F, false));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-0.5F, -0.2F, -1.3F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.1596F, 0.1521F, -1.3189F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 7, 153, -3.3712F, -1.1984F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-0.5F, -0.2F, -1.3F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0137F, 0.2196F, -0.5664F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 76, 153, -1.839F, 0.0078F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(-0.5F, -0.2F, -3.3F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0137F, 0.2196F, -0.5664F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 56, 151, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(-0.5F, -0.2F, -3.3F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.1596F, 0.1521F, -1.3189F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 153, 150, -4.0712F, -1.8984F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(-0.5F, -0.2F, -5.3F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, -0.1596F, 0.1521F, -1.3189F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 69, 149, -5.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(-0.5F, -0.2F, -5.3F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, -0.0137F, 0.2196F, -0.5664F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 78, 149, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-0.5F, -0.2F, -7.3F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, -0.0137F, 0.2196F, -0.5664F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 150, 80, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-0.5F, -0.2F, -7.3F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, -0.1596F, 0.1521F, -1.3189F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 148, 64, -6.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 83, 153, -5.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(0.5F, -0.2F, -1.3F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, -0.0137F, -0.2196F, 0.5664F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 55, 153, -0.161F, 0.0078F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(0.5F, -0.2F, -1.3F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.1596F, -0.1521F, 1.3189F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 0, 153, 1.3712F, -1.1984F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(0.5F, -0.2F, -3.3F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.0137F, -0.2196F, 0.5664F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 47, 151, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(0.5F, -0.2F, -3.3F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.1596F, -0.1521F, 1.3189F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 97, 153, 2.0712F, -1.8984F, -0.3982F, 2, 0, 1, 0.0F, false));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(0.5F, -0.2F, -5.3F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0137F, -0.2196F, 0.5664F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 51, 149, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(0.5F, -0.2F, -5.3F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.1596F, -0.1521F, 1.3189F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 60, 149, 2.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(0.5F, -0.2F, -7.3F);
        this.Bodymiddle.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.1485F, 0.0399F, 0.5517F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 150, 78, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(0.5F, -0.2F, -7.3F);
        this.Bodymiddle.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.1367F, -0.0705F, 1.2857F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 69, 153, 3.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 148, 56, 2.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.1F, 0.1F, -8.1F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.171F, 0.1802F, -0.0744F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 64, 108, -0.4F, -0.4874F, -11.7045F, 1, 1, 12, 0.001F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 33, 108, -0.9F, 4.0178F, -17.6631F, 2, 1, 13, 0.02F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.9F, 3.5678F, -4.6631F);
        this.Bodyfront.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 116, 108, 3.1F, -0.25F, -11.0F, 1, 1, 11, 0.02F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.3F, 4.0678F, -9.6631F);
        this.Bodyfront.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.5411F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 141, 114, -2.2473F, -0.2909F, -3.0F, 3, 1, 5, 0.02F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.2F, 2.6678F, -12.4631F);
        this.Bodyfront.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2641F, -1.018F, -1.002F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 145, 0, 0.0245F, -0.1644F, -1.7847F, 4, 1, 2, 0.02F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, 4.0678F, -9.6631F);
        this.Bodyfront.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.5411F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 141, 107, -0.7527F, -0.2909F, -3.0F, 3, 1, 5, 0.02F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(5.1F, 3.5678F, -4.6631F);
        this.Bodyfront.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 91, 108, -4.1F, -0.25F, -11.0F, 1, 1, 11, 0.02F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(4.4F, 2.6678F, -12.4631F);
        this.Bodyfront.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2641F, 1.018F, 1.002F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 143, -4.0245F, -0.1644F, -1.7847F, 4, 1, 2, 0.02F, false));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(-0.4F, -0.2874F, -1.2045F);
        this.Bodyfront.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, -0.0354F, 0.1075F, -1.2155F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 148, 127, -6.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 154, 50, -5.0712F, -1.8984F, 0.1018F, 2, 0, 1, 0.0F, false));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(-0.4F, -0.2874F, -1.2045F);
        this.Bodyfront.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0468F, 0.1031F, -0.4694F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 74, 151, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(-0.4F, -0.2874F, -3.2045F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, -0.1596F, 0.1521F, -1.188F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 151, 152, -5.3712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 146, 104, -6.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(-0.4F, -0.2874F, -3.2045F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, -0.0137F, 0.2196F, -0.4355F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 150, 82, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(-0.4F, -0.2874F, -5.2045F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, -0.1596F, 0.1521F, -1.092F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 90, 153, -5.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 148, 66, -6.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(-0.4F, -0.2874F, -5.2045F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, -0.0137F, 0.2196F, -0.3395F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 150, 84, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(-0.4F, -0.2874F, -7.2045F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, -0.0137F, 0.2196F, -0.357F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 92, 151, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(-0.4F, -0.2874F, -7.2045F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, -0.1596F, 0.1521F, -1.1094F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 40, 149, -6.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 110, 154, -5.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(-0.4F, -0.2874F, -9.2045F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, -0.1596F, 0.1521F, -1.1007F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 41, 153, -4.6712F, -1.8984F, 0.2018F, 2, 0, 1, 0.0F, false));
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 144, 150, -5.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(-0.4F, -0.2874F, -9.2045F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, -0.0137F, 0.2196F, -0.3483F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 150, 86, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r33 = new ModelRenderer(this);
        this.Neck_r33.setRotationPoint(0.6F, -0.2874F, -1.2045F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, -0.2453F, -0.1733F, 1.2455F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 154, 48, 3.0712F, -1.8984F, 0.1018F, 2, 0, 1, 0.0F, false));
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 148, 125, 2.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r34 = new ModelRenderer(this);
        this.Neck_r34.setRotationPoint(0.6F, -0.2874F, -1.2045F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, -0.0626F, -0.2929F, 0.4916F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 65, 151, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r35 = new ModelRenderer(this);
        this.Neck_r35.setRotationPoint(0.6F, -0.2874F, -3.2045F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, -0.0137F, -0.2196F, 0.4355F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 150, 76, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r36 = new ModelRenderer(this);
        this.Neck_r36.setRotationPoint(0.6F, -0.2874F, -3.2045F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, -0.1596F, -0.1521F, 1.188F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 144, 152, 3.3712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 133, 130, 2.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r37 = new ModelRenderer(this);
        this.Neck_r37.setRotationPoint(0.6F, -0.2874F, -5.2045F);
        this.Bodyfront.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, -0.0137F, -0.2196F, 0.3395F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 150, 74, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r38 = new ModelRenderer(this);
        this.Neck_r38.setRotationPoint(0.6F, -0.2874F, -5.2045F);
        this.Bodyfront.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, -0.1596F, -0.1521F, 1.092F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 62, 153, 3.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 148, 54, 2.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r39 = new ModelRenderer(this);
        this.Neck_r39.setRotationPoint(0.6F, -0.2874F, -7.2045F);
        this.Bodyfront.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, -0.0137F, -0.2196F, 0.357F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 83, 151, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r40 = new ModelRenderer(this);
        this.Neck_r40.setRotationPoint(0.6F, -0.2874F, -7.2045F);
        this.Bodyfront.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, -0.1596F, -0.1521F, 1.1094F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 154, 52, 3.0712F, -1.8984F, 0.3018F, 2, 0, 1, 0.0F, false));
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 148, 72, 2.0712F, -1.8984F, -0.3982F, 4, 0, 1, 0.0F, false));

        this.Neck_r41 = new ModelRenderer(this);
        this.Neck_r41.setRotationPoint(0.6F, -0.2874F, -9.2045F);
        this.Bodyfront.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, -0.1596F, -0.1521F, 1.1007F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 27, 153, 2.6712F, -1.8984F, 0.2018F, 2, 0, 1, 0.0F, false));
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 119, 149, 2.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r42 = new ModelRenderer(this);
        this.Neck_r42.setRotationPoint(0.6F, -0.2874F, -9.2045F);
        this.Bodyfront.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, -0.0137F, -0.2196F, 0.3483F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 20, 150, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.1F, -0.445F, -10.7054F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.0072F, 0.0663F, -0.1118F);
        this.Neck.cubeList.add(new ModelBox(Neck, 92, 142, -0.5F, -0.0637F, -4.998F, 1, 1, 5, 0.0F, false));

        this.Neck_r43 = new ModelRenderer(this);
        this.Neck_r43.setRotationPoint(-0.5F, 0.1363F, -0.498F);
        this.Neck.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, -0.237F, 0.1945F, -1.2013F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 0, 151, -5.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r44 = new ModelRenderer(this);
        this.Neck_r44.setRotationPoint(-0.5F, 0.1363F, -0.498F);
        this.Neck.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, -0.0411F, 0.3027F, -0.4426F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 29, 151, -2.839F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r45 = new ModelRenderer(this);
        this.Neck_r45.setRotationPoint(-0.5F, 0.1363F, -2.698F);
        this.Neck.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, -0.0547F, 0.3006F, -0.3574F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 38, 151, -2.8F, 0.0F, -0.3F, 3, 0, 1, 0.0F, false));

        this.Neck_r46 = new ModelRenderer(this);
        this.Neck_r46.setRotationPoint(0.5F, 0.1363F, -0.498F);
        this.Neck.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, -0.237F, -0.1945F, 1.2013F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 110, 149, 2.0712F, -1.8984F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r47 = new ModelRenderer(this);
        this.Neck_r47.setRotationPoint(0.5F, 0.1363F, -0.498F);
        this.Neck.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, -0.0411F, -0.3027F, 0.4426F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 96, 149, -0.161F, 0.0078F, -0.3982F, 3, 0, 1, 0.0F, false));

        this.Neck_r48 = new ModelRenderer(this);
        this.Neck_r48.setRotationPoint(0.5F, 0.1363F, -2.698F);
        this.Neck.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, -0.0547F, -0.3006F, 0.3574F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 87, 149, -0.2F, 0.0F, -0.3F, 3, 0, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1363F, -3.998F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.5038F, 0.0413F, 0.305F);
        this.Head.cubeList.add(new ModelBox(Head, 129, 75, -3.5F, -1.0F, -3.0F, 7, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 129, 82, -3.5F, -1.0F, -3.0F, 7, 3, 3, 0.0F, false));

        this.Eyeportion = new ModelRenderer(this);
        this.Eyeportion.setRotationPoint(0.0F, -0.9F, -3.0F);
        this.Head.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, 0.1061F, 0.0F, 0.0F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 2.7F, -2.0F);
        this.Eyeportion.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, -0.1061F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 66, 142, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 112, 121, -0.49F, -1.0F, -9.0F, 1, 1, 9, 0.001F, false));

        this.Upperjawslope2 = new ModelRenderer(this);
        this.Upperjawslope2.setRotationPoint(-0.01F, -1.0F, -5.9F);
        this.Upperjaw2.addChild(Upperjawslope2);
        this.setRotateAngle(Upperjawslope2, 0.1663F, 0.0F, 0.0F);
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 115, 141, -0.48F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Leftupperteeth2 = new ModelRenderer(this);
        this.Leftupperteeth2.setRotationPoint(-0.4F, -0.5F, -5.3F);
        this.Upperjaw2.addChild(Leftupperteeth2);
        this.setRotateAngle(Leftupperteeth2, 0.0F, -0.0157F, 0.0F);
        this.Leftupperteeth2.cubeList.add(new ModelBox(Leftupperteeth2, 54, 133, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Rightupperteeth2 = new ModelRenderer(this);
        this.Rightupperteeth2.setRotationPoint(0.4F, -0.5F, -5.3F);
        this.Upperjaw2.addChild(Rightupperteeth2);
        this.setRotateAngle(Rightupperteeth2, 0.0F, 0.0157F, 0.0F);
        this.Rightupperteeth2.cubeList.add(new ModelBox(Rightupperteeth2, 69, 133, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Upperjawslope1 = new ModelRenderer(this);
        this.Upperjawslope1.setRotationPoint(0.01F, -2.0F, -4.0F);
        this.Upperjaw1.addChild(Upperjawslope1);
        this.setRotateAngle(Upperjawslope1, 0.1998F, 0.0F, 0.0F);
        this.Upperjawslope1.cubeList.add(new ModelBox(Upperjawslope1, 145, 38, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));
        this.Upperjawslope1.cubeList.add(new ModelBox(Upperjawslope1, 145, 43, -1.0F, 0.0F, 3.0F, 2, 1, 3, 0.0F, false));

        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(0.4F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0848F, 0.2122F, -0.2546F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(-0.4F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0F, -0.2122F, 0.2546F);


        this.Righteye_r1 = new ModelRenderer(this);
        this.Righteye_r1.setRotationPoint(1.41F, 0.3F, -0.1F);
        this.Righteye.addChild(Righteye_r1);
        this.setRotateAngle(Righteye_r1, 0.0289F, 0.2163F, 0.134F);
        this.Righteye_r1.cubeList.add(new ModelBox(Righteye_r1, 148, 68, -0.802F, -0.2602F, -0.6968F, 2, 1, 2, 0.0F, false));

        this.Righteye2 = new ModelRenderer(this);
        this.Righteye2.setRotationPoint(0.42F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Righteye2);
        this.setRotateAngle(Righteye2, 0.0F, 0.2122F, -0.2546F);


        this.Righteye_r2 = new ModelRenderer(this);
        this.Righteye_r2.setRotationPoint(-1.41F, 0.3F, -0.1F);
        this.Righteye2.addChild(Righteye_r2);
        this.setRotateAngle(Righteye_r2, 0.0289F, -0.2163F, -0.134F);
        this.Righteye_r2.cubeList.add(new ModelBox(Righteye_r2, 148, 121, -1.198F, -0.2602F, -0.6968F, 2, 1, 2, 0.0F, false));

        this.Leftupperlip1 = new ModelRenderer(this);
        this.Leftupperlip1.setRotationPoint(-3.5F, -0.02F, -2.2F);
        this.Head.addChild(Leftupperlip1);
        this.setRotateAngle(Leftupperlip1, 0.0F, -0.3821F, 0.0F);
        this.Leftupperlip1.cubeList.add(new ModelBox(Leftupperlip1, 130, 141, 0.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Leftupperlip2 = new ModelRenderer(this);
        this.Leftupperlip2.setRotationPoint(0.0F, 1.99F, -4.0F);
        this.Leftupperlip1.addChild(Leftupperlip2);
        this.setRotateAngle(Leftupperlip2, 0.0F, 0.0424F, 0.0F);
        this.Leftupperlip2.cubeList.add(new ModelBox(Leftupperlip2, 145, 4, 0.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Leftupperlip3 = new ModelRenderer(this);
        this.Leftupperlip3.setRotationPoint(0.0F, 0.01F, -3.0F);
        this.Leftupperlip2.addChild(Leftupperlip3);
        this.setRotateAngle(Leftupperlip3, 0.0F, 0.1698F, 0.0F);
        this.Leftupperlip3.cubeList.add(new ModelBox(Leftupperlip3, 146, 94, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Leftupperteeth1 = new ModelRenderer(this);
        this.Leftupperteeth1.setRotationPoint(0.1F, 1.5F, -5.1F);
        this.Leftupperlip1.addChild(Leftupperteeth1);
        this.setRotateAngle(Leftupperteeth1, 0.0F, 0.0424F, 0.0F);
        this.Leftupperteeth1.cubeList.add(new ModelBox(Leftupperteeth1, 133, 121, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Rightupperlip1 = new ModelRenderer(this);
        this.Rightupperlip1.setRotationPoint(3.5F, -0.01F, -2.2F);
        this.Head.addChild(Rightupperlip1);
        this.setRotateAngle(Rightupperlip1, 0.0F, 0.3821F, 0.0F);
        this.Rightupperlip1.cubeList.add(new ModelBox(Rightupperlip1, 51, 142, -3.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Rightupperlip2 = new ModelRenderer(this);
        this.Rightupperlip2.setRotationPoint(0.0F, 1.99F, -4.0F);
        this.Rightupperlip1.addChild(Rightupperlip2);
        this.setRotateAngle(Rightupperlip2, 0.0F, -0.0424F, 0.0F);
        this.Rightupperlip2.cubeList.add(new ModelBox(Rightupperlip2, 145, 10, -2.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Rightupperlip3 = new ModelRenderer(this);
        this.Rightupperlip3.setRotationPoint(0.0F, 0.01F, -3.0F);
        this.Rightupperlip2.addChild(Rightupperlip3);
        this.setRotateAngle(Rightupperlip3, 0.0F, -0.1698F, 0.0F);
        this.Rightupperlip3.cubeList.add(new ModelBox(Rightupperlip3, 146, 99, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Rightupperteeth1 = new ModelRenderer(this);
        this.Rightupperteeth1.setRotationPoint(-0.1F, 1.5F, -5.1F);
        this.Rightupperlip1.addChild(Rightupperteeth1);
        this.setRotateAngle(Rightupperteeth1, 0.0F, -0.0424F, 0.0F);
        this.Rightupperteeth1.cubeList.add(new ModelBox(Rightupperteeth1, 21, 134, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.4397F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 54, 123, 2.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 145, 48, -3.48F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.Lowerjawmiddlebase = new ModelRenderer(this);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, -0.01F, -3.0F);
        this.Lowerjawbase.addChild(Lowerjawmiddlebase);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawmiddlefront);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 110, 151, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.01F, -2.6F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 91, 121, -0.5F, 0.0F, -9.0F, 1, 1, 9, 0.0F, false));

        this.Leftlowerteeth2 = new ModelRenderer(this);
        this.Leftlowerteeth2.setRotationPoint(-0.4F, 0.5F, -4.1F);
        this.Lowerjawfront.addChild(Leftlowerteeth2);
        this.setRotateAngle(Leftlowerteeth2, 0.0F, -0.0213F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(0.3F, 0.5F, -4.0F);
        this.Lowerjawfront.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, 0.0F, 0.0213F, 0.0F);
        this.Rightlowerteeth2.cubeList.add(new ModelBox(Rightlowerteeth2, 115, 132, 0.0F, -1.0F, -4.5F, 0, 1, 7, 0.0F, false));

        this.Rightlowerteeth4 = new ModelRenderer(this);
        this.Rightlowerteeth4.setRotationPoint(-0.28F, 0.5F, -4.0F);
        this.Lowerjawfront.addChild(Rightlowerteeth4);
        this.setRotateAngle(Rightlowerteeth4, 0.0F, -0.0213F, 0.0F);
        this.Rightlowerteeth4.cubeList.add(new ModelBox(Rightlowerteeth4, 130, 132, 0.0F, -1.0F, -4.5F, 0, 1, 7, 0.0F, false));

        this.Leftlowerlip3 = new ModelRenderer(this);
        this.Leftlowerlip3.setRotationPoint(-1.0F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Leftlowerlip3);
        this.setRotateAngle(Leftlowerlip3, 0.0F, -0.1698F, 0.0F);


        this.Rightlowerlip3 = new ModelRenderer(this);
        this.Rightlowerlip3.setRotationPoint(1.0F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Rightlowerlip3);
        this.setRotateAngle(Rightlowerlip3, 0.0F, 0.1698F, 0.0F);
        this.Rightlowerlip3.cubeList.add(new ModelBox(Rightlowerlip3, 145, 130, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Rightlowerlip4 = new ModelRenderer(this);
        this.Rightlowerlip4.setRotationPoint(-0.98F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Rightlowerlip4);
        this.setRotateAngle(Rightlowerlip4, 0.0F, -0.1698F, 0.0F);
        this.Rightlowerlip4.cubeList.add(new ModelBox(Rightlowerlip4, 145, 135, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Lowerjawslope1 = new ModelRenderer(this);
        this.Lowerjawslope1.setRotationPoint(-0.01F, 2.0F, -3.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawslope1);
        this.setRotateAngle(Lowerjawslope1, -0.1698F, 0.0F, 0.0F);


        this.Lowerjawslope2 = new ModelRenderer(this);
        this.Lowerjawslope2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Lowerjawslope1.addChild(Lowerjawslope2);
        this.setRotateAngle(Lowerjawslope2, 0.0726F, 0.0F, 0.0F);


        this.Lowerjawslope2_r1 = new ModelRenderer(this);
        this.Lowerjawslope2_r1.setRotationPoint(0.02F, 0.91F, -0.1F);
        this.Lowerjawslope2.addChild(Lowerjawslope2_r1);
        this.setRotateAngle(Lowerjawslope2_r1, 0.0349F, 0.0F, 0.0F);
        this.Lowerjawslope2_r1.cubeList.add(new ModelBox(Lowerjawslope2_r1, 79, 142, -0.52F, -1.01F, -4.9F, 1, 1, 5, 0.0F, false));

        this.Leftlowerteeth1 = new ModelRenderer(this);
        this.Leftlowerteeth1.setRotationPoint(-1.7F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Leftlowerteeth1);
        this.setRotateAngle(Leftlowerteeth1, 0.0F, -0.3396F, 0.0F);


        this.Rightlowerteeth1 = new ModelRenderer(this);
        this.Rightlowerteeth1.setRotationPoint(1.7F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Rightlowerteeth1);
        this.setRotateAngle(Rightlowerteeth1, 0.0F, 0.3396F, 0.0F);
        this.Rightlowerteeth1.cubeList.add(new ModelBox(Rightlowerteeth1, 36, 134, 0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Rightlowerteeth3 = new ModelRenderer(this);
        this.Rightlowerteeth3.setRotationPoint(-1.68F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Rightlowerteeth3);
        this.setRotateAngle(Rightlowerteeth3, 0.0F, -0.3396F, 0.0F);
        this.Rightlowerteeth3.cubeList.add(new ModelBox(Rightlowerteeth3, 0, 137, 0.0F, -1.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.Leftlowerlip1 = new ModelRenderer(this);
        this.Leftlowerlip1.setRotationPoint(-3.5F, 0.02F, -2.2F);
        this.Lowerjawbase.addChild(Leftlowerlip1);
        this.setRotateAngle(Leftlowerlip1, 0.0F, -0.3821F, 0.0F);


        this.Leftlowerlip2 = new ModelRenderer(this);
        this.Leftlowerlip2.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Leftlowerlip1.addChild(Leftlowerlip2);
        this.setRotateAngle(Leftlowerlip2, 0.0F, 0.0424F, 0.0F);


        this.Rightlowerlip1 = new ModelRenderer(this);
        this.Rightlowerlip1.setRotationPoint(3.5F, 0.01F, -2.2F);
        this.Lowerjawbase.addChild(Rightlowerlip1);
        this.setRotateAngle(Rightlowerlip1, 0.0F, 0.3821F, 0.0F);
        this.Rightlowerlip1.cubeList.add(new ModelBox(Rightlowerlip1, 21, 126, -1.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.Rightlowerlip2 = new ModelRenderer(this);
        this.Rightlowerlip2.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Rightlowerlip1.addChild(Rightlowerlip2);
        this.setRotateAngle(Rightlowerlip2, 0.0F, -0.0424F, 0.0F);
        this.Rightlowerlip2.cubeList.add(new ModelBox(Rightlowerlip2, 145, 140, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Rightlowerlip3_r1 = new ModelRenderer(this);
        this.Rightlowerlip3_r1.setRotationPoint(0.01F, 2.0F, 0.0F);
        this.Rightlowerlip2.addChild(Rightlowerlip3_r1);
        this.setRotateAngle(Rightlowerlip3_r1, -0.1745F, 0.0F, 0.0F);
        this.Rightlowerlip3_r1.cubeList.add(new ModelBox(Rightlowerlip3_r1, 145, 16, -1.01F, -1.0F, -4.0F, 1, 1, 4, -0.002F, false));

        this.Rightlowerlip5 = new ModelRenderer(this);
        this.Rightlowerlip5.setRotationPoint(-3.48F, 0.01F, -2.2F);
        this.Lowerjawbase.addChild(Rightlowerlip5);
        this.setRotateAngle(Rightlowerlip5, 0.0F, -0.3821F, 0.0F);
        this.Rightlowerlip5.cubeList.add(new ModelBox(Rightlowerlip5, 20, 143, 0.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.Rightlowerlip6 = new ModelRenderer(this);
        this.Rightlowerlip6.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Rightlowerlip5.addChild(Rightlowerlip6);
        this.setRotateAngle(Rightlowerlip6, 0.0F, 0.0424F, 0.0F);
        this.Rightlowerlip6.cubeList.add(new ModelBox(Rightlowerlip6, 145, 145, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Rightlowerlip4_r1 = new ModelRenderer(this);
        this.Rightlowerlip4_r1.setRotationPoint(-0.01F, 2.0F, 0.0F);
        this.Rightlowerlip6.addChild(Rightlowerlip4_r1);
        this.setRotateAngle(Rightlowerlip4_r1, -0.1745F, 0.0F, 0.0F);
        this.Rightlowerlip4_r1.cubeList.add(new ModelBox(Rightlowerlip4_r1, 145, 22, 0.01F, -1.0F, -4.0F, 1, 1, 4, -0.002F, false));

        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.2F, -2.1F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3396F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 2.6137F, -10.3536F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.3091F, -1.1444F, 0.5561F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 20, 152, -0.3015F, -0.1659F, -0.3854F, 2, 1, 1, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.9F, 0.5F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.3572F, -0.1545F, -0.8875F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 85, 122, -0.7F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.2F, 1.0F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.5601F, -0.1698F, 0.3183F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 54, 129, -1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.1F, 2.6137F, -10.3536F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3415F, 1.1857F, -0.5915F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 117, 151, -1.6985F, -0.1659F, -0.3854F, 2, 1, 1, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.9F, 0.5F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.1236F, 0.1183F, 1.167F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 85, 126, -0.3F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.2F, 1.0F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.4729F, 0.1698F, -0.3183F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 31, 147, -1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.3131F, 3.1123F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.2009F, -0.1243F, 0.142F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 129, 89, -0.5F, -0.3897F, -0.1232F, 1, 1, 7, 0.0F, false));

        this.Tailbase_r2 = new ModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, 0.6103F, 0.9768F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.2618F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 110, 142, 0.0F, 0.7872F, 3.8218F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 14, 154, 0.0F, 0.3936F, 1.8609F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 127, 151, 0.0F, 0.0F, -0.1F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r3 = new ModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, -0.3462F, 0.8495F);
        this.Tailbase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, -0.3491F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 117, 154, 0.0F, -3.0049F, 3.9085F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 51, 139, 0.0F, -1.0415F, -0.0364F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 142, 154, 0.0F, -1.6606F, 1.8759F, 0, 1, 1, 0.0F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.0227F, 6.1004F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1178F, -0.5031F, 0.1067F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 129, 65, -0.5F, -0.4F, 0.0F, 1, 1, 8, 0.001F, false));

        this.Tailbase_r4 = new ModelRenderer(this);
        this.Tailbase_r4.setRotationPoint(0.0F, 0.59F, -5.2F);
        this.Tailmiddlebase.addChild(Tailbase_r4);
        this.setRotateAngle(Tailbase_r4, 0.2618F, 0.0F, 0.0F);
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 12, 146, 0.0F, 3.0235F, 11.5006F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 124, 151, 0.0F, 2.5059F, 9.5687F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 9, 146, 0.0F, 1.9882F, 7.6369F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 51, 134, 0.0F, 1.5672F, 5.6791F, 0, 3, 1, 0.0F, false));

        this.Tailbase_r5 = new ModelRenderer(this);
        this.Tailbase_r5.setRotationPoint(0.0F, -0.3665F, -5.3273F);
        this.Tailmiddlebase.addChild(Tailbase_r5);
        this.setRotateAngle(Tailbase_r5, -0.3491F, 0.0F, 0.0F);
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 133, 154, 0.0F, -5.6666F, 11.4352F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 130, 154, 0.0F, -5.3585F, 9.4191F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 154, 129, 0.0F, -4.6744F, 7.5397F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 120, 154, 0.0F, -3.9904F, 5.6603F, 0, 2, 1, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.1F, 7.3F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.0137F, -0.4459F, 0.0403F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 0, 126, -0.5F, -0.3024F, 0.0764F, 1, 1, 9, -0.001F, false));

        this.Tailbase_r6 = new ModelRenderer(this);
        this.Tailbase_r6.setRotationPoint(0.0F, 0.6874F, -12.4172F);
        this.Tailmiddle.addChild(Tailbase_r6);
        this.setRotateAngle(Tailbase_r6, 0.2618F, 0.0F, 0.0F);
        this.Tailbase_r6.cubeList.add(new ModelBox(Tailbase_r6, 145, 154, 0.0F, 4.722F, 19.3151F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r6.cubeList.add(new ModelBox(Tailbase_r6, 154, 142, 0.0F, 4.3283F, 17.3542F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r6.cubeList.add(new ModelBox(Tailbase_r6, 154, 135, 0.0F, 3.6406F, 15.4523F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r6.cubeList.add(new ModelBox(Tailbase_r6, 17, 154, 0.0F, 3.5411F, 13.4324F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r7 = new ModelRenderer(this);
        this.Tailbase_r7.setRotationPoint(0.0F, -0.2691F, -12.5445F);
        this.Tailmiddle.addChild(Tailbase_r7);
        this.setRotateAngle(Tailbase_r7, -0.3491F, 0.0F, 0.0F);
        this.Tailbase_r7.cubeList.add(new ModelBox(Tailbase_r7, 148, 154, 0.0F, -6.1624F, 15.1703F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r7.cubeList.add(new ModelBox(Tailbase_r7, 154, 145, 0.0F, -5.7265F, 13.1778F, 0, 1, 1, 0.0F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.2994F, 8.3191F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.155F, -0.4445F, -0.0189F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 129, 55, -0.5F, -0.6008F, 0.0255F, 1, 1, 8, 0.001F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0988F, 7.4618F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1177F, -0.3414F, -0.1616F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 129, 98, -0.5F, -0.5018F, 0.0424F, 1, 1, 7, 0.0F, false));

        this.Tailfinend = new ModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, 1.5942F, 0.1358F);
        this.Tailend.addChild(Tailfinend);


        this.Tailfindorsal4 = new ModelRenderer(this);
        this.Tailfindorsal4.setRotationPoint(0.01F, 0.198F, 0.0637F);
        this.Tailmiddleend.addChild(Tailfindorsal4);
        this.setRotateAngle(Tailfindorsal4, -0.0848F, 0.0F, 0.0F);


        this.Tailfinventral4 = new ModelRenderer(this);
        this.Tailfinventral4.setRotationPoint(0.01F, 2.798F, 0.0637F);
        this.Tailmiddleend.addChild(Tailfinventral4);
        this.setRotateAngle(Tailfinventral4, 0.0848F, 0.0F, 0.0F);


        this.Tailfindorsal3 = new ModelRenderer(this);
        this.Tailfindorsal3.setRotationPoint(0.0F, 0.1974F, 0.0828F);
        this.Tailmiddle.addChild(Tailfindorsal3);
        this.setRotateAngle(Tailfindorsal3, -0.0213F, 0.0F, 0.0F);


        this.Tailfinventral3 = new ModelRenderer(this);
        this.Tailfinventral3.setRotationPoint(0.0F, 3.5974F, 0.0828F);
        this.Tailmiddle.addChild(Tailfinventral3);
        this.setRotateAngle(Tailfinventral3, 0.0637F, 0.0F, 0.0F);


        this.Tailfindorsal2 = new ModelRenderer(this);
        this.Tailfindorsal2.setRotationPoint(-0.01F, -0.6F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfindorsal2);
        this.setRotateAngle(Tailfindorsal2, 0.0213F, 0.0F, 0.0F);


        this.Tailfinventral2 = new ModelRenderer(this);
        this.Tailfinventral2.setRotationPoint(0.01F, 3.2F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinventral2);
        this.setRotateAngle(Tailfinventral2, -0.0213F, 0.0F, 0.0F);


        this.Tailfindorsal1 = new ModelRenderer(this);
        this.Tailfindorsal1.setRotationPoint(0.0F, 0.9103F, 0.0768F);
        this.Tailbase.addChild(Tailfindorsal1);
        this.setRotateAngle(Tailfindorsal1, 0.2122F, 0.0F, 0.0F);


        this.Tailfinventral1 = new ModelRenderer(this);
        this.Tailfinventral1.setRotationPoint(0.0F, 4.2103F, 0.8768F);
        this.Tailbase.addChild(Tailfinventral1);
        this.setRotateAngle(Tailfinventral1, -0.1698F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, 2.6472F, 0.3891F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 2.4133F, -0.1035F, -1.6977F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 146, -0.4765F, -0.4378F, -2.6381F, 1, 1, 3, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.7594F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 44, 143, -0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 1.2123F, 0.4033F, 0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 145, 28, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.5F, 2.6472F, 0.3891F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 2.6873F, 0.3946F, 1.1699F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 146, 89, -0.5235F, -0.4378F, -2.6381F, 1, 1, 3, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.8467F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 148, 58, -0.5F, -0.5F, -0.5F, 1, 3, 2, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.0378F, -0.4033F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 145, 33, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

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
