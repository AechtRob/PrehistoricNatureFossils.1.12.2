package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPrionolepis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer prionolepis;
    private final ModelRenderer cube_r1;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer backRightFin;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer frontRightFin;
    private final ModelRenderer head;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer matrix;

    public ModelSkeletonPrionolepis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.prionolepis = new ModelRenderer(this);
        this.prionolepis.setRotationPoint(2.7613F, 0.3709F, -0.5011F);
        this.fossil.addChild(prionolepis);
        this.setRotateAngle(prionolepis, 1.5708F, 0.0F, -1.5708F);
        this.prionolepis.cubeList.add(new ModelBox(prionolepis, 0, 18, 0.5F, -0.9636F, -0.3681F, 1, 3, 5, 0.003F, false));
        this.prionolepis.cubeList.add(new ModelBox(prionolepis, 20, 24, 0.5F, -0.9636F, -4.3681F, 1, 2, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.0364F, -0.3681F);
        this.prionolepis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 18, 1.5F, -2.0F, -3.75F, 1, 2, 4, -0.006F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 1.5364F, 4.3819F);
        this.prionolepis.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3654F, 0.0F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 34, 29, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new ModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.4F, 1.5364F, 4.3819F);
        this.prionolepis.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.5509F, -0.3007F, 0.18F);


        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.625F, 1.5364F, -3.6181F);
        this.prionolepis.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1434F, 0.0F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 16, 32, -0.1F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new ModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.6F, 1.5364F, -3.6181F);
        this.prionolepis.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4674F, -0.3542F, 0.1733F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.5364F, -3.8681F);
        this.prionolepis.addChild(head);
        this.setRotateAngle(head, -0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 6, 32, 1.0F, -1.5F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.5267F, -7.7352F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1484F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 11, 0.45F, -1.0F, 0.0F, 1, 1, 6, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.5F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 25, 0.45F, 0.0F, -6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 30, 0.475F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.2376F, -5.1283F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0894F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 32, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.5F, 3.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 32, 1.5F, -3.0F, -5.75F, 1, 3, 1, -0.009F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 30, 1.525F, -3.0F, -4.95F, 1, 3, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 1.2247F, -2.4796F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.698F, -5.2556F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, 0.45F, -0.4F, -0.3F, 1, 1, 6, -0.003F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.6223F, 4.2962F);
        this.prionolepis.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.414F, 0.0857F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2007F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 27, 0.975F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.586F, 0.0857F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0305F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, 0.975F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2194F, 3.7899F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 11, 0.45F, -1.2166F, -0.2043F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.6572F, 0.7878F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4756F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 32, 1.925F, -0.2F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.7834F, -0.2043F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1265F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 16, 0.45F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6166F, 3.2957F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 21, 0.45F, -0.5F, 0.0F, 1, 1, 3, -0.006F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 18, 1.425F, -2.5F, -0.25F, 0, 5, 4, 0.0F, false));

        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(matrix);
        this.matrix.cubeList.add(new ModelBox(matrix, 0, 0, -18.0F, -1.0F, -6.0F, 35, 1, 10, 0.0F, false));

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
