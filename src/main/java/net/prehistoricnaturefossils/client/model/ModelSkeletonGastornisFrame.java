package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGastornisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer toe;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer toe2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonGastornisFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -28.0F, 2.0F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -26.0F, -10.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3752F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.4F, -6.0F, -0.5F, 1, 32, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -26.0F, -10.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3752F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 1.8F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -24.0F, 2.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 4.5F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -30.0F, 2.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.7F, -4.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, -1, -1.0F, 0.9027F, -0.2824F, 1, 2, 9, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.3F, 0.5355F, 0.7846F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.4363F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.0F, 9.1596F, -0.1524F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6144F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 17.0357F, -1.9422F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);


        this.toe = new ModelRenderer(this);
        this.toe.setRotationPoint(-1.5267F, 8.3523F, 0.7405F);
        this.leftLeg3.addChild(toe);
        this.setRotateAngle(toe, 0.0873F, -0.3927F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.6358F, 0.5498F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.48F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.4894F, -3.806F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.6071F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.3F, 0.5355F, 0.7846F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.0036F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.0F, 9.1596F, -0.1524F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.6144F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 17.0357F, -1.9422F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);


        this.toe2 = new ModelRenderer(this);
        this.toe2.setRotationPoint(1.5267F, 8.3523F, 0.7405F);
        this.rightLeg3.addChild(toe2);
        this.setRotateAngle(toe2, 0.0873F, 0.3927F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.6358F, 0.5498F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.4894F, -3.806F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0038F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.5F, 3.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5939F, 0.0362F, -0.0244F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 11, -0.5F, 0.6944F, 0.5068F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3269F, 6.8022F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2102F, 0.2991F, 0.0628F);
        this.tail2.cubeList.add(new ModelBox(tail2, 78, 66, -0.5F, 0.406F, 0.0598F, 1, 1, 2, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0578F, 2.0666F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2739F, 0.2947F, 0.0814F);
        this.tail3.cubeList.add(new ModelBox(tail3, 68, 25, -0.5F, 0.2585F, -0.7155F, 1, 1, 3, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.1F, -3.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3578F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 7, -1.0F, 0.9494F, -0.1332F, 1, 2, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.4F, -4.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.4F, -1.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 31, -1.0F, -0.3F, -3.9F, 1, 2, 5, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.3353F, 4.0785F, -4.3422F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.8617F, 0.4939F, -0.7387F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.1918F, -0.4167F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.9639F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2872F, 2.7035F, -0.3772F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1291F, -0.0692F, 0.0532F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.3353F, 4.0785F, -4.3422F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.8922F, -0.2284F, 0.8363F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.1918F, -0.4167F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.9639F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2872F, 2.7035F, -0.3772F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1291F, 0.0692F, -0.0532F);


        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.2F, -4.6F);
        this.chest.addChild(neck6);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.8F, -0.2F);
        this.neck6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4451F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 70, 0.0F, -0.9943F, -1.5586F, 1, 2, 2, -0.155F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.1F, -1.6F);
        this.neck6.addChild(neck5);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.3F, 0.2F);
        this.neck5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 41, 0.0F, -0.1F, -3.3F, 1, 2, 4, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.8F, -2.3F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, 0.0F, -0.2182F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.7F, -3.5F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.0297F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 30, -1.0F, -1.2981F, -0.2287F, 1, 2, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.0F, -2.3F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -6.1F, -0.7F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 56, -1.0F, 0.5773F, -2.7317F, 1, 6, 2, -0.155F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -5.5F, -1.2F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -3.2F, -2.3F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7941F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 67, -1.0F, 0.2272F, -2.8396F, 1, 4, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.4F, -2.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.5F, -3.5F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1833F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 14, -1.0F, 0.8616F, -0.2862F, 1, 2, 4, -0.155F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -3.5F);
        this.neck.addChild(head);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.2F, 1.769F, -0.3621F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.2F, 1.769F, -0.3621F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 2.1F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);

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
