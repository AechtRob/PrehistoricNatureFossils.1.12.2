package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMeiFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftSickleClaw;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightSickleClaw;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonMeiFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -26.0F, -6.3F, 1, 26, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.5F, -18.5F, -14.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6545F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.1F, -8.5F, -0.5F, 1, 27, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, -25.5F, -14.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6527F, -0.0531F, -1.6401F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.9F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -18.5F, -5.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 6.7F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.7933F, -4.6947F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3927F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -1.0F, -0.4F, -0.1F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.3F, 0.5208F, -1.1168F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1047F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.4759F, 0.059F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8988F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.0718F, 0.5234F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3927F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.309F, 0.0F, 0.0F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-1.4449F, -0.2224F, -0.0217F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -1.5895F, 0.2466F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.6109F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.3F, 0.5208F, -1.1168F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.7999F, 0.2894F, 0.3304F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.4759F, 0.059F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 2.3387F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.0718F, 0.5234F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.6581F, 0.0F, 0.0F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(1.4449F, -0.2224F, -0.0217F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.2805F, -0.2466F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.6109F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.287F, 0.3359F, 0.097F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, 2.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 0, -1.0F, 0.7044F, -5.7051F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -3.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1179F, 0.3482F, 0.0254F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -3.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, -1, -1.0F, 0.8036F, -2.6441F, 1, 1, 3, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -0.9F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 24, -1.0F, 0.3F, -2.8F, 1, 1, 4, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.2474F, 2.9395F, -4.4157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.0391F, 0.599F, -0.9739F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0818F, 2.9995F, -0.1146F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.5282F, 0.0442F, -0.0236F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2601F, 2.5927F, -0.0848F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.7704F, -0.212F, 0.2292F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.2474F, 2.9395F, -4.4157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.639F, -0.3327F, 1.5203F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0818F, 2.9995F, -0.1146F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3967F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2601F, 2.5927F, -0.0848F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7704F, 0.212F, -0.2292F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.1F, -5.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.2239F, 0.7848F, 0.0349F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 36, -1.0F, -0.0643F, 0.3306F, 1, 1, 1, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.6F, -3.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 40, -1.0F, -0.3F, -0.1F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0861F, -2.401F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.039F, 0.6041F, -0.0971F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.9F, -2.4F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7941F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 6, -1.0F, 0.6738F, 0.2312F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.324F, -2.5807F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.5287F, 0.2129F, 0.0479F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.3F, -1.6F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4014F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 29, -0.5F, 0.6324F, 0.0085F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3696F, 0.0317F, -0.0365F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.2234F, 0.8653F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.8727F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 2.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1571F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 24, -0.5F, 0.1F, -0.3F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1833F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 10, -0.5F, 0.1F, -0.4F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.5585F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.1F, 0.1F, 1, 1, 10, -0.15F, false));

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
