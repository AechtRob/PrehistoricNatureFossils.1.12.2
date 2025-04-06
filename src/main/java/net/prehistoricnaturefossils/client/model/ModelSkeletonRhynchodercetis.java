package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRhynchodercetis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer rhynchodercetis;
    private final ModelRenderer body;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer backRightFin;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer Matrix;

    public ModelSkeletonRhynchodercetis() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(5.3577F, 33.125F, -8.0962F);
        this.setRotateAngle(fossil, 0.0F, -1.5708F, 0.0F);


        this.rhynchodercetis = new ModelRenderer(this);
        this.rhynchodercetis.setRotationPoint(2.3086F, -9.25F, 11.8429F);
        this.fossil.addChild(rhynchodercetis);
        this.setRotateAngle(rhynchodercetis, -0.3491F, 0.0F, -1.5708F);
        this.rhynchodercetis.cubeList.add(new ModelBox(rhynchodercetis, 45, 40, 0.025F, -1.0F, -2.5F, 1, 2, 5, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.5F, -2.5F);
        this.rhynchodercetis.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 52, 55, -0.475F, -0.659F, -7.5605F, 1, 2, 4, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 63, 59, -0.45F, -0.3188F, -8.5801F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.5776F, -0.5283F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 63, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 1.9961F, -7.5138F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 65, 0.5F, -1.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.8391F, -3.5169F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0393F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 59, 0.5F, -1.0F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.0F, 0.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 62, 0.0F, 1.5F, -4.0F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.5552F, -11.4667F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 62, 0.0F, -0.85F, 0.075F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2945F, -11.4444F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -0.5F, 0.0F, -6.925F, 1, 1, 7, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.5747F, -8.5131F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.096F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 62, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.659F, -7.5605F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 55, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.006F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.675F, -3.75F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 56, 0.025F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, 0.825F, -2.25F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.7828F, 0.4242F, -0.3887F);


        this.frontRightFin = new ModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0F, 0.825F, -2.25F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.7828F, -0.4242F, 0.3887F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.7913F, -8.4085F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0567F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.236F, -2.9582F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 62, -0.05F, 0.15F, -0.025F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.926F, -2.5134F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0262F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 40, -0.05F, -1.0F, -6.0F, 1, 1, 6, -0.003F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.rhynchodercetis.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 48, 0.025F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 58, 40, 0.0F, -1.0F, 0.0F, 1, 2, 4, -0.003F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 0.488F, 3.196F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.4606F, 0.3152F, -0.1526F);


        this.backRightFin = new ModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 0.488F, 3.196F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.4606F, -0.3152F, 0.1526F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.0003F, 3.8101F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.829F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.9994F, -0.0538F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 55, 0.0F, -1.0F, 0.0F, 1, 1, 5, -0.006F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0253F, -0.0101F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 55, 0.0F, 0.0F, -0.025F, 1, 1, 5, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.0219F, 4.4682F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.7418F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.7284F, 0.0217F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0305F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 52, 0.0F, -1.0F, 0.0F, 1, 1, 5, -0.009F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.7716F, 0.0217F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.048F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 49, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.003F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0284F, 4.5217F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.5236F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 48, -0.025F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 22, 62, -0.025F, -0.5F, 0.0F, 1, 1, 4, -0.003F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 43, 48, -0.025F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.05F, 4.5F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.2182F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 17, 40, 0.95F, -2.45F, 0.0F, 0, 5, 6, 0.0F, false));

        this.Matrix = new ModelRenderer(this);
        this.Matrix.setRotationPoint(1.6423F, -8.125F, 1.9539F);
        this.fossil.addChild(Matrix);
        this.Matrix.cubeList.add(new ModelBox(Matrix, 0, 0, -12.0F, -2.0F, -16.0F, 37, 1, 38, 0.0F, false));

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
