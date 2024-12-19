package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDaurlongFrame extends ModelBase {
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
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonDaurlongFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -20.6F, -0.9F, 1, 21, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -16.45F, -11.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0262F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -3.35F, -0.5F, 1, 20, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -16.45F, -11.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0262F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.45F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.5F, -0.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.271F, -0.8101F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1913F, -0.0166F, -0.0857F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1F, -1.35F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 6, -0.5F, 0.6F, -0.2F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.0F, 0.4873F, 0.8385F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.4087F, 0.0399F, 0.0777F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.0359F, -1.5924F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8826F, -0.1354F, 0.1105F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.9029F, 0.1797F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6178F, -0.0506F, -0.0711F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3488F, 0.0149F, -0.041F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.7261F, -0.2841F, 0.1996F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.6121F, 0.2466F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0174F, -2.4015F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.0436F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.0F, 0.4873F, 0.8385F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.2852F, 0.0424F, -0.0385F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.0359F, -1.5924F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7592F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.9029F, 0.1797F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1855F, 0.0809F, 0.0328F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3488F, -0.0149F, 0.041F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.7261F, -0.2841F, 0.1996F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.3503F, -0.2466F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0174F, -2.4015F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -0.0436F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.1F, 3.55F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.067F, 0.2002F, 0.0863F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2089F, -0.1695F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 0, -0.5F, 0.2F, 0.6F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2204F, 4.7363F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0791F, 0.1744F, 0.0062F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 23, -0.5F, 0.5916F, 0.1743F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3614F, 6.8539F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1594F, 0.1255F, 0.0374F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 15, -0.5F, 0.2605F, -0.1878F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2407F, 8.9832F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1965F, 0.2141F, 0.0423F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.3791F, -0.6996F, 1, 1, 13, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1672F, 0.1291F, 0.0217F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.45F, -4.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -0.5F, 0.5286F, -0.0265F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.05F, -7.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 43, -0.5F, 0.55F, 0.2F, 1, 1, 3, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.35F, -6.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.4192F, -0.0399F, -0.0178F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4339F, -3.9914F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 31, -0.5F, -0.4F, -0.6F, 1, 1, 5, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.8848F, 1.6889F, -4.0679F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.532F, 0.3187F, -0.1359F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.6353F, -0.6475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4839F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.9145F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0371F, 0.5313F, -0.6988F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.8848F, 1.6889F, -4.0679F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.4448F, -0.3187F, 0.1359F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.6353F, -0.6475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7457F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.9145F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(-0.0371F, 0.5313F, -0.6988F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.2661F, -4.0914F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2507F, 0.3006F, 0.1828F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4208F, -2.9F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0348F, -0.003F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 14, -0.5F, -0.4F, 0.0F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0527F, -2.6216F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.4749F, 0.4744F, -0.2307F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.805F, -4.8573F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 58, -0.6F, 0.3F, 2.5F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.0621F, -1.4962F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -1.0634F, 0.4256F, 0.0458F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7F, -4.0F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0348F, -0.003F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 32, -0.5F, 0.5F, 0.5F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2174F, -3.7909F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.4625F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6877F, 0.1599F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.192F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 60, -0.5F, 0.8047F, -1.9973F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.7072F, -1.52F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.2704F, 0.0469F, 0.2132F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3196F, -0.1186F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.5455F, 0.0F, 0.0F);

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
