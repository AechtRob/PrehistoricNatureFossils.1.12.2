package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCompsognathusSlab extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Compsognathus;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer LegL;
    private final ModelRenderer cube_r1;
    private final ModelRenderer KneeL;
    private final ModelRenderer cube_r2;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer cube_r3;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer KneeL2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer ArmL;
    private final ModelRenderer cube_r19;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer cube_r20;
    private final ModelRenderer ArmL2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;

    public ModelSkeletonCompsognathusSlab() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 29.0F, 0.0F);


        this.Compsognathus = new ModelRenderer(this);
        this.Compsognathus.setRotationPoint(1.0945F, -5.85F, -0.007F);
        this.fossil.addChild(Compsognathus);
        this.setRotateAngle(Compsognathus, 0.3491F, 0.0F, -1.5708F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.5315F, 4.549F, -2.4265F);
        this.Compsognathus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -1.5063F, 0.0267F, 0.0009F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 14, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-0.1F, 0.6416F, -0.7447F);
        this.Compsognathus.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -2.0196F, -0.2222F, -0.0364F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 12, 13, -0.5F, -0.538F, -0.5058F, 1, 1, 5, 0.0F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-0.1F, 0.9245F, -0.1981F);
        this.Compsognathus.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.847F, 0.0289F, -0.0327F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 0, 40, -0.5F, -0.4F, -0.3F, 1, 1, 4, 0.0F, false));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(0.65F, -0.4F, -2.3F);
        this.Compsognathus.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -0.0611F, 0.0F, 0.0F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 48, 39, -1.0F, 0.6938F, 1.1788F, 1, 1, 2, 0.0F, false));
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 14, 0, -1.0F, -0.3062F, -0.0212F, 1, 1, 5, 0.0F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(0.3F, 0.7F, -0.3F);
        this.Compsognathus.addChild(LegL);
        this.setRotateAngle(LegL, -0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -0.35F, -0.8851F);
        this.LegL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 48, 2.0F, -0.1F, 0.4F, 1, 5, 1, 0.0F, false));

        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 4.85F, -0.0851F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.48F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.4F, 0.3486F, -0.8883F);
        this.KneeL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 46, 1.9F, 0.7601F, 1.4092F, 1, 5, 1, -0.2F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 47, 1.9F, 0.7601F, 0.4093F, 1, 5, 1, -0.001F, false));

        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 1.2486F, 4.6117F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.2F, 0.0F, 0.1F);
        this.MetatarsalL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.3F, -0.2683F, -0.0378F, 1, 1, 4, -0.002F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.2217F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 29, 39, -1.0F, -0.4F, -3.8F, 2, 1, 4, 0.0F, false));

        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-0.3F, 0.7F, -0.3F);
        this.Compsognathus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.9599F, 0.0F, -0.2167F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, -0.35F, -0.8851F);
        this.LegL2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 48, -3.0F, 0.9F, 0.4F, 1, 4, 1, 0.0F, true));

        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 6.1F, 0.9149F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 0.6543F, -0.2442F, 0.0329F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(2.3F, 0.3486F, -0.8883F);
        this.KneeL2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 46, -2.9F, 0.7601F, 1.4092F, 1, 5, 1, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.1F, 0.3486F, -0.8883F);
        this.KneeL2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.1341F, 0.0395F, -0.0184F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 47, -2.9F, 0.7601F, 0.4093F, 1, 5, 1, -0.001F, true));

        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 1.2486F, 4.6117F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 1.1781F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2F, 0.0F, 0.1F);
        this.MetatarsalL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.3963F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.7F, -0.2683F, -0.0378F, 1, 1, 4, -0.002F, true));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.7854F, 0.0F, 0.0F);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 30, 39, 0.0F, -0.4F, -3.8F, 1, 1, 4, 0.0F, true));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.Compsognathus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.8727F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.9725F, 3.2572F);
        this.Tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2967F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 19, 0.0F, 0.6792F, 3.1973F, 0, 2, 1, 0.002F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 39, 0.0F, -0.2088F, 1.3612F, 0, 2, 1, 0.002F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 39, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.002F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 29, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.002F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 7.9F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.5672F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 13, -0.5F, -0.4128F, -0.0981F, 1, 1, 9, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.9725F, -4.6428F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2967F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, 0.0F, 2.7967F, 11.1951F, 0, 1, 1, 0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 13, 0.0F, 2.4967F, 9.1951F, 0, 1, 1, 0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, 1.1967F, 7.1951F, 0, 2, 1, 0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 0, 0.0F, 0.9864F, 5.1837F, 0, 2, 1, 0.002F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.1872F, 8.8019F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.2823F, -0.3786F, -0.1068F);


        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.7F, 8.7F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, -0.6109F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.6F, -2.3F);
        this.Compsognathus.addChild(Body);
        this.setRotateAngle(Body, -0.3235F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 16, 37, -0.5F, -0.4F, -5.0F, 1, 1, 5, 0.002F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0387F, 0.0201F, 1.5268F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 49, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.002F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0266F, 0.0346F, 1.963F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 50, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.002F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0387F, -0.0201F, 1.3522F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 44, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.002F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0266F, -0.0346F, 1.7885F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 25, 0.9063F, -0.4226F, -0.5F, 3, 0, 1, 0.002F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, -4.5F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1868F, -0.0889F, 1.3425F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 40, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.002F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, -4.5F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1321F, -0.1593F, 1.7766F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 24, 0.9063F, -0.4226F, -0.5F, 4, 0, 1, 0.002F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(-1.5F, -0.2F, -4.9F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.4363F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, 1.7939F, -1.4562F);
        this.Chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9599F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 29, -0.8F, -0.5F, -1.5F, 1, 1, 3, 0.002F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.2F, 0.6F, -1.6F);
        this.Chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.247F, -0.3085F, 1.0959F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 20, 0.9063F, -0.4226F, -0.5F, 3, 0, 1, 0.002F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.0F, 2.8F, -1.8F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.5236F, 0.0F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmL.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 42, -0.8F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.5F, 1.0F, 2.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.2182F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 12, 13, -1.3F, 0.0F, -0.83F, 1, 3, 1, -0.002F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.6981F, 0.0F, 0.1309F);
        this.HandL.cubeList.add(new ModelBox(HandL, 28, 29, -1.2974F, 0.03F, -0.6552F, 1, 2, 1, -0.002F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.HandL.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 6, -1.2974F, 0.0373F, -0.0418F, 1, 1, 1, -0.004F, false));

        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(1.25F, 2.8F, -1.8F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.1745F, 0.0F, 0.0F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmL2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.48F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 42, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.5F, 1.0F, 2.7F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, 0.0873F, 0.0F, 0.0F);
        this.ElbowL2.cubeList.add(new ModelBox(ElbowL2, 12, 13, 0.0F, 0.0F, -0.83F, 1, 3, 1, -0.002F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 2.0508F, 0.0F, 0.0F);
        this.HandL2.cubeList.add(new ModelBox(HandL2, 28, 29, 0.0F, 0.0F, -0.63F, 1, 2, 1, -0.002F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.HandL2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 6, 6, 0.0F, 0.0F, -0.03F, 1, 1, 1, -0.004F, true));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(1.5F, 1.1F, -2.1F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, -1.0908F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.7072F, -3.0332F);
        this.Neck3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 21, -0.5F, -0.8106F, -0.3409F, 1, 1, 3, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.1971F, -1.2851F);
        this.Neck3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.8216F, -0.1392F, 0.2427F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 14, 48, 0.0028F, -0.5609F, -0.0108F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -0.6971F, -3.2851F);
        this.Neck3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.6937F, -0.1473F, 0.17F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 29, 0.0028F, -0.5609F, -0.0108F, 0, 1, 2, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.6F, -2.5F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.7418F, 0.0F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -3.5F, -2.7F);
        this.Neck2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6545F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 41, 36, -0.5F, 0.6F, 0.5F, 1, 1, 3, 0.002F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -1.2971F, -2.0851F);
        this.Neck2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.9375F, -0.041F, 0.2108F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 49, 0.0432F, -0.3191F, -0.1516F, 0, 1, 2, 0.0F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.35F, -2.2F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -1.5708F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 1.1733F, -1.0141F);
        this.Neck1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5252F, -0.1895F, 0.1087F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 6, 0.0F, -0.4839F, 0.0096F, 0, 1, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 1.1733F, -1.0141F);
        this.Neck1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.5581F, -0.3767F, 0.2257F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 6, 0.0F, -0.4839F, 0.0096F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.5F, -1.5F);
        this.Neck1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1658F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 47, 34, -0.5F, -0.4F, -0.4F, 1, 1, 2, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.6F, 1.85F, -2.75F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.3751F, -0.1171F, -0.1836F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 1.9231F, -4.3503F);
        this.Head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6458F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 29, -1.0F, -0.0349F, -0.0013F, 1, 1, 3, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 2.7231F, -4.1503F);
        this.Head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4411F, -0.1423F, -0.0668F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 44, 1.0F, -0.8097F, -0.0224F, 0, 1, 3, -0.002F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 2.7231F, -4.1503F);
        this.Head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4411F, 0.1423F, 0.0668F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 45, -1.0F, -0.8097F, -0.0224F, 1, 1, 3, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.4769F, -0.1503F);
        this.Head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 45, 44, -1.0F, 0.4F, -5.0F, 1, 1, 3, -0.001F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 1, 34, -0.5F, 0.4F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.1231F, -2.0503F);
        this.Head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.5585F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 1, 18, 0.0F, -0.0408F, -0.1244F, 1, 1, 2, -0.002F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.8F, 1.0448F, -2.0737F);
        this.Head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 2.0207F, 0.1417F, 0.0681F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 22, 0, -0.67F, -1.5F, -0.7F, 1, 2, 1, -0.2F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.4345F, -0.9259F);
        this.Head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.4887F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 12, 29, 0.22F, -1.0F, 0.2F, 1, 2, 1, -0.2F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 44, -0.08F, -0.5F, -0.8F, 1, 1, 1, 0.1F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.225F, 0.8231F, 0.4497F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 1.9F, -4.5F);
        this.Jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4411F, 0.1423F, 0.0668F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 13, -1.0116F, 0.0983F, 0.0877F, 1, 1, 3, -0.04F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.1F, 0.1F);
        this.Jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4363F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 45, 49, -0.5F, -0.0331F, -4.9257F, 1, 1, 1, -0.042F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4363F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 15, 7, 0.0F, -0.1F, -2.0F, 1, 1, 2, -0.001F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, -10, 63, -17.0F, -6.0F, -14.0F, 32, 1, 39, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 113, -13.0F, -6.125F, -1.0F, 28, 1, 14, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 56, 41, -8.0F, -6.125F, -14.0F, 23, 1, 13, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, -5.5F, -3.0F);
        this.bone.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.6981F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 7, 80, -5.125F, -0.5F, -18.725F, 32, 1, 22, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(21.641F, -5.5F, -17.6646F);
        this.bone.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.1571F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 59, -7.0F, -0.5F, -0.075F, 7, 1, 43, -0.001F, false));

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
