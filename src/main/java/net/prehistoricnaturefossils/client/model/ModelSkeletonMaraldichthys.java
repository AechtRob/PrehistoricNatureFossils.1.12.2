package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMaraldichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer maraldichthys;
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
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer analFin;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer backRightFin;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer frontRightFin;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer matrix;
    public ModelSkeletonMaraldichthys() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.maraldichthys = new ModelRenderer(this);
        this.maraldichthys.setRotationPoint(1.65F, -1.575F, 5.3F);
        this.fossil.addChild(maraldichthys);
        this.setRotateAngle(maraldichthys, 1.7453F, 0.0F, 1.5708F);
        this.maraldichthys.cubeList.add(new ModelBox(maraldichthys, 0, 46, -0.45F, -23.4421F, -1.0596F, 0, 8, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.4736F, -2.5058F);
        this.maraldichthys.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4399F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 31, -0.5F, 0.0F, -4.65F, 1, 1, 5, 0.006F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.125F, -9.915F, -1.7198F);
        this.maraldichthys.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 2.7925F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 51, -0.45F, -0.1F, -0.2F, 1, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 46, 0.225F, -0.1F, -0.2F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, -9.6845F, -2.6401F);
        this.maraldichthys.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 2.138F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 46, -0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.025F, -10.6835F, -2.6837F);
        this.maraldichthys.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 51, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.975F, -12.4962F, -1.8385F);
        this.maraldichthys.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 40, -1.5F, 0.0F, -2.0F, 1, 2, 3, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.45F, -6.8316F, 1.7947F);
        this.maraldichthys.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.5446F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 31, -0.025F, 0.0F, -3.75F, 0, 1, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.45F, -10.8302F, 1.69F);
        this.maraldichthys.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.2828F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 50, 0.0F, 0.0F, -2.4F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.475F, -3.4529F, 0.7533F);
        this.maraldichthys.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.7279F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 31, 0.0F, -0.5F, -3.5F, 0, 1, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.2948F, 0.6446F);
        this.maraldichthys.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.6406F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -0.5F, -0.325F, -0.65F, 1, 1, 8, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.9258F, 0.9394F);
        this.maraldichthys.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.6232F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 45, -0.5F, -0.075F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.1419F, -0.0164F);
        this.maraldichthys.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.4573F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 38, -0.5F, -0.425F, -5.0F, 1, 1, 5, -0.006F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.2247F, -1.6158F);
        this.maraldichthys.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.2654F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 41, -0.5F, -1.675F, -0.25F, 1, 1, 3, -0.006F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 41, -0.5F, -0.75F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.5921F, 0.3809F);
        this.maraldichthys.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0908F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 46, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 51, -0.5F, 1.0F, -2.0F, 1, 1, 1, -0.003F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.025F, -7.5921F, 0.3809F);
        this.maraldichthys.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2094F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 45, -0.5F, -3.0F, -2.0F, 1, 3, 2, -0.006F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.35F, -23.4857F, -1.3587F);
        this.maraldichthys.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 51, -0.125F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -15.4933F, -1.7076F);
        this.maraldichthys.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 51, -0.5F, 1.025F, -0.075F, 1, 2, 1, -0.003F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -15.4933F, -1.7076F);
        this.maraldichthys.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2356F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 3, 46, -0.5F, 0.175F, 0.725F, 1, 5, 1, -0.01F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -12.4962F, -1.8385F);
        this.maraldichthys.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 40, -0.5F, -11.0F, 0.0F, 1, 11, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.025F, -12.5F, 0.0F);
        this.maraldichthys.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 36, -0.5F, 0.25F, -1.825F, 1, 2, 2, -0.003F, false));

        this.analFin = new ModelRenderer(this);
        this.analFin.setRotationPoint(-0.475F, -13.4083F, 0.1733F);
        this.maraldichthys.addChild(analFin);
        this.setRotateAngle(analFin, 1.2217F, 0.0F, 0.0F);
        this.analFin.cubeList.add(new ModelBox(analFin, 24, 46, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.95F, -8.6604F, 0.2525F);
        this.maraldichthys.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0873F, 0.0F, 0.0F);


        this.backRightFin = new ModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.95F, -8.6604F, 0.2525F);
        this.maraldichthys.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0873F, 0.0F, 0.0F);


        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.5F, -0.4834F, -0.3984F);
        this.maraldichthys.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.6682F, 0.3879F, -0.2902F);


        this.frontRightFin = new ModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.5F, -0.4834F, -0.3984F);
        this.maraldichthys.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.6109F, 0.0F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 49, 51, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.45F, -15.0542F, -0.3719F);
        this.maraldichthys.addChild(tail);
        this.setRotateAngle(tail, 1.1781F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 50, -0.025F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0634F, 1.6902F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 41, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(1.1F, 0.0F, 1.25F);
        this.fossil.addChild(matrix);
        this.matrix.cubeList.add(new ModelBox(matrix, 0, 0, -8.35F, -2.0F, -22.65F, 14, 1, 29, 0.0F, false));

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
