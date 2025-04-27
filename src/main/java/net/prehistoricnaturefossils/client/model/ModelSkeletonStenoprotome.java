package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStenoprotome extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer stenoprotome;
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
    private final ModelRenderer matrix;
    private final ModelRenderer matrix2;
    private final ModelRenderer matrix3;

    public ModelSkeletonStenoprotome() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.stenoprotome = new ModelRenderer(this);
        this.stenoprotome.setRotationPoint(0.6627F, -1.5797F, 3.1896F);
        this.fossil.addChild(stenoprotome);
        this.setRotateAngle(stenoprotome, -0.0131F, -0.2618F, 0.0F);
        this.stenoprotome.cubeList.add(new ModelBox(stenoprotome, 34, 45, -1.5F, -0.5031F, -0.8845F, 3, 1, 3, 0.0F, false));
        this.stenoprotome.cubeList.add(new ModelBox(stenoprotome, 54, 56, -1.0F, -0.5031F, -1.6595F, 2, 1, 1, -0.003F, false));
        this.stenoprotome.cubeList.add(new ModelBox(stenoprotome, 58, 48, -1.9964F, -0.5281F, 1.6901F, 1, 1, 1, -0.003F, false));
        this.stenoprotome.cubeList.add(new ModelBox(stenoprotome, 0, 59, 0.9964F, -0.5281F, 1.6901F, 1, 1, 1, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4281F, 2.9155F);
        this.stenoprotome.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 56, -0.5F, -0.1F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5825F, -0.0031F, 0.7405F);
        this.stenoprotome.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.48F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 59, 0.35F, -0.5F, 3.0F, 1, 1, 1, 0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 55, 0.0F, -0.525F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5825F, -0.0281F, 0.7405F);
        this.stenoprotome.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 59, -1.35F, -0.5F, 3.0F, 1, 1, 1, 0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 54, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.7165F, -0.0281F, 1.2405F);
        this.stenoprotome.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2217F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 56, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.8911F, -0.0281F, 1.668F);
        this.stenoprotome.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.789F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 59, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.0281F, 1.3655F);
        this.stenoprotome.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 54, -1.25F, -0.5F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.8911F, -0.0281F, 1.668F);
        this.stenoprotome.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.789F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 59, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.7165F, -0.0281F, 1.2405F);
        this.stenoprotome.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.2217F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 54, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0619F, 0.6018F, -4.3071F);
        this.stenoprotome.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0524F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 45, -1.0F, -1.0F, -7.0F, 1, 1, 7, 0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0619F, 0.6018F, -4.3071F);
        this.stenoprotome.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0524F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 45, 0.0F, -1.0F, -7.0F, 1, 1, 7, 0.006F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2165F, -0.5281F, -1.3576F);
        this.stenoprotome.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, -0.0524F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 51, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.006F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2165F, -0.5281F, -1.3576F);
        this.stenoprotome.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0524F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 52, 51, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.006F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.0281F, 1.3655F);
        this.stenoprotome.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 50, 0.25F, -0.5F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5031F, 2.1155F);
        this.stenoprotome.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 45, -0.5F, 0.0F, 0.0F, 2, 1, 1, 0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.5031F, -1.6595F);
        this.stenoprotome.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 45, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.003F, false));

        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(matrix);
        this.matrix.cubeList.add(new ModelBox(matrix, 0, 0, -8.0F, -2.0F, -12.0F, 14, 1, 25, 0.01F, false));

        this.matrix2 = new ModelRenderer(this);
        this.matrix2.setRotationPoint(6.6609F, -1.0F, -2.3958F);
        this.fossil.addChild(matrix2);
        this.setRotateAngle(matrix2, 0.0F, -0.3054F, 0.0F);
        this.matrix2.cubeList.add(new ModelBox(matrix2, 0, 28, -3.5F, -1.0F, -9.0F, 6, 1, 14, -0.01F, false));

        this.matrix3 = new ModelRenderer(this);
        this.matrix3.setRotationPoint(8.3607F, -1.0F, 7.3506F);
        this.fossil.addChild(matrix3);
        this.setRotateAngle(matrix3, 0.0F, 0.2182F, 0.0F);
        this.matrix3.cubeList.add(new ModelBox(matrix3, 41, 28, -3.5F, -1.0F, -9.0F, 6, 1, 14, 0.0F, false));

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
