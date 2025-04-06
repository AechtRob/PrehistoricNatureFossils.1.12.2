package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSigmapycnodus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer sigmapycnodus;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer frontRightFin;
    private final ModelRenderer eye;
    private final ModelRenderer cube_r10;
    private final ModelRenderer eye2;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer tail4;
    private final ModelRenderer matrix;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;

    public ModelSkeletonSigmapycnodus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(fossil, 0.0F, -2.7925F, 0.0F);


        this.sigmapycnodus = new ModelRenderer(this);
        this.sigmapycnodus.setRotationPoint(-2.6485F, -2.225F, 6.852F);
        this.fossil.addChild(sigmapycnodus);
        this.setRotateAngle(sigmapycnodus, 2.0508F, 0.0F, -1.5708F);
        this.sigmapycnodus.cubeList.add(new ModelBox(sigmapycnodus, 0, 48, 0.075F, -15.0F, -8.0F, 2, 13, 8, 0.0F, false));
        this.sigmapycnodus.cubeList.add(new ModelBox(sigmapycnodus, 21, 68, 0.0F, -13.625F, -12.25F, 2, 9, 5, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -5.9315F, -15.1817F);
        this.sigmapycnodus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.789F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 0, 0.4F, 0.1F, -2.1F, 2, 2, 2, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 90, 0.475F, 0.0F, -2.0F, 2, 3, 2, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.525F, -8.5143F, -11.8158F);
        this.sigmapycnodus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4399F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 84, 0.5F, -3.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.475F, -11.2414F, -15.0658F);
        this.sigmapycnodus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.6581F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 84, -0.5F, 0.0F, -3.0F, 2, 3, 3, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.525F, -13.5396F, -13.1375F);
        this.sigmapycnodus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.8727F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 84, 0.5F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -15.8339F, -9.8608F);
        this.sigmapycnodus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 83, 0.975F, 0.0F, -4.0F, 2, 3, 4, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -16.8691F, -5.9971F);
        this.sigmapycnodus.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 83, 0.5F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -17.0F, -3.0F);
        this.sigmapycnodus.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 74, 0.5F, 0.0F, -3.0F, 2, 3, 6, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -1.5F, -8.0F);
        this.sigmapycnodus.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 81, 1.5F, -4.0F, -3.425F, 2, 4, 4, -0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.5F, -8.0F);
        this.sigmapycnodus.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 48, 0.5F, -3.0F, -0.425F, 2, 3, 8, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5F, -4.0F, -7.0F);
        this.sigmapycnodus.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1215F, 0.253F, 0.013F);


        this.frontRightFin = new ModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5F, -4.0F, -7.0F);
        this.sigmapycnodus.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1215F, -0.253F, -0.013F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(1.7F, -10.8616F, -12.523F);
        this.sigmapycnodus.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.95F, -0.3798F, -2.5428F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.6581F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 91, 0.3F, 1.5F, -1.6F, 1, 2, 2, 0.0F, false));

        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(-1.7F, -10.8616F, -12.523F);
        this.sigmapycnodus.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.681F, -11.3479F);
        this.sigmapycnodus.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.6546F, -2.9681F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.5708F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 91, 5, 0.45F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -1.2506F, -3.8338F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.789F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 78, 69, 0.95F, 2.0F, -2.75F, 2, 2, 2, -0.006F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 57, 0.9F, 0.1F, -3.4F, 2, 0, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 91, 11, 0.9F, 0.3F, -2.8F, 2, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 87, 76, 0.95F, 0.0F, -4.0F, 2, 4, 2, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.9874F, -0.172F);
        this.sigmapycnodus.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 21, 48, 0.0F, -5.3126F, -0.828F, 2, 13, 6, -0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, -7.6817F, 1.0561F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 84, 4.4F, -3.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -8.1435F, 0.1691F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 74, 0.95F, 0.0F, 0.0F, 2, 3, 6, 0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 9.2152F, 3.5206F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.288F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 83, 90, 0.45F, -2.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 9.3199F, -0.478F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0262F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 83, 83, 0.45F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 59, 60, -0.05F, -0.8126F, -1.328F, 2, 6, 7, 0.006F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -5.373F, -0.0088F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6545F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 80, 48, 3.425F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 48, 1.45F, 0.0F, 0.0F, 2, 5, 8, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 8.6472F, -0.0618F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4625F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 62, 0.45F, -4.0F, 0.0F, 2, 4, 7, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 70, -0.075F, 0.6874F, -0.828F, 2, 3, 7, 0.006F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.1117F, 0.0447F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 70, 74, 0.425F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 5.92F, -0.1922F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3752F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 60, 0.925F, -2.0F, 0.25F, 2, 2, 6, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 87, 69, 0.9F, 1.0874F, -0.828F, 1, 2, 4, 0.0F, false));

        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(matrix);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-5.6391F, -4.0F, 8.6598F);
        this.matrix.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.7418F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 26, -25.875F, 0.0F, -18.15F, 27, 2, 19, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(7.5F, -3.0F, 0.65F);
        this.matrix.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -11.5F, -1.0F, -12.0F, 22, 2, 23, 0.01F, false));

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
