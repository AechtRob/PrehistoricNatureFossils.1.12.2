package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSkorpiovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonSkorpiovenatorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.75F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -24.6F, -5.3F, 1, 24, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -22.6F, -23.2F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -16.5F, -22.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.9F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 7.0F, -4.5F, 17.4F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.9F, -4.6F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1222F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.7F, -4.5F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 13, -0.5F, 1.0F, 0.3F, 1, 2, 10, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 0.8676F, -0.2003F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.7854F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.4F, 9.3448F, 1.2795F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2217F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 10.1721F, 0.9543F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.2071F, -0.0649F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2618F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 0.8676F, -0.2003F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6109F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.4F, 9.3448F, 1.2795F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9163F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 10.1721F, 0.9543F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.2071F, -0.0649F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1745F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7F, 5.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0698F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 1, 13, -0.5F, 0.2984F, -0.0686F, 1, 2, 11, 0.005F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2984F, 10.8314F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, -2, -0.5F, 0.0F, -0.6F, 1, 2, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.48F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 25, -0.5F, 0.2961F, -0.8679F, 1, 1, 12, -0.1508F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0961F, 10.8321F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 40, -0.5F, 0.1995F, -0.1782F, 1, 1, 8, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5005F, 8.0218F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2618F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -0.5F, -0.3F, -0.4F, 1, 1, 11, -0.1508F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0524F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2F, -5.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 40, -0.5F, 0.8833F, -5.8801F, 1, 2, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.2F, -5.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 40, -0.5F, 0.892F, 0.0218F, 1, 2, 6, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -11.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0349F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6349F, -5.9994F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 49, -0.5F, 0.9F, 0.0F, 1, 2, 6, 0.005F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.481F, 6.9537F, -3.2566F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.9886F, -1.0435F, -1.5832F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.6993F, -0.5682F, 2.8784F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5302F, -0.0869F, 0.1515F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0094F, 0.3F, 1.6399F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3054F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.481F, 6.9537F, -3.2566F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.9886F, 1.0435F, 1.5832F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.6993F, -0.5682F, 2.8784F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5302F, 0.0869F, -0.1515F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0094F, 0.3F, 1.6399F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3054F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.9349F, -5.8994F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.3927F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.2F, -2.9F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 62, -1.0F, 0.6F, 0.5F, 1, 1, 4, -0.1504F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.9F, -2.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0611F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.2003F, -4.2189F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 56, -1.0F, -1.3918F, 0.0149F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.4F, -3.2F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 71, -1.0F, 0.7F, 1.1F, 1, 1, 3, -0.1504F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0785F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -1.7F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 71, -0.5F, 0.7F, -1.1F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(-0.4F, 1.3936F, -1.65F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.4F, 1.3936F, -1.65F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1F, 1.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);

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
