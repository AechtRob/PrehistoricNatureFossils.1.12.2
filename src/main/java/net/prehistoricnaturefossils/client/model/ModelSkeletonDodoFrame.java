package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDodoFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonDodoFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 18.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.4F, -31.0F, -9.5F, 1, 31, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -31.0F, -25.4F, 1, 31, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -24.0F, -24.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 6.3F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 6.4F, -5.0F, 15.4F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -31.0506F, -9.3602F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.7F, -4.1F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 60, -1.0F, -0.0973F, 0.0176F, 1, 3, 11, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.2F, 0.0295F, 0.4622F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6807F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3F, 9.1596F, -0.1524F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6319F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 18.1888F, -2.5424F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0908F, 0.0F, 0.0F);


        this.toe = new ModelRenderer(this);
        this.toe.setRotationPoint(-1.5267F, 8.3523F, 0.7405F);
        this.leftLeg3.addChild(toe);
        this.setRotateAngle(toe, 0.0873F, -0.3927F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.6358F, 0.5498F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3927F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.4893F, -3.806F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.258F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.2F, 0.0295F, 0.4622F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.0734F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3F, 9.1596F, -0.1524F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.6319F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 18.1888F, -2.5424F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0036F, 0.0F, 0.0F);


        this.toe2 = new ModelRenderer(this);
        this.toe2.setRotationPoint(1.5267F, 8.3523F, 0.7405F);
        this.rightLeg3.addChild(toe2);
        this.setRotateAngle(toe2, 0.0873F, 0.3927F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.6358F, 0.5498F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.4893F, -3.806F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0038F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.6914F, 6.5701F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4548F, 0.276F, -0.1325F);
        this.tail.cubeList.add(new ModelBox(tail, 92, 18, -0.5F, 0.6944F, -0.9932F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3337F, 1.7626F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1189F, 0.3034F, 0.0357F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 104, -0.5F, 0.306F, -0.2402F, 1, 1, 1, -0.15F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 104, -0.5F, 0.306F, 0.4598F, 1, 1, 1, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0268F, 1.0231F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.264F, 0.1264F, 0.0341F);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 101, -0.5F, 0.2585F, -0.2155F, 1, 1, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0524F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.1F, -3.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3578F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 0, -1.0F, 0.9494F, -1.9332F, 1, 2, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0702F, -5.8129F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0611F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.4F, -1.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -1.0F, -0.3F, -5.9F, 1, 2, 7, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(4.026F, 0.8657F, -5.4528F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.7515F, 0.2707F, 0.2717F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1392F, 6.992F, -0.7117F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.2923F, -0.3897F, -0.0257F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.4193F, 6.6195F, -0.9465F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.0017F, -0.0692F, 0.0532F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.026F, 0.8657F, -5.4528F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.6206F, -0.2707F, -0.2717F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1392F, 6.992F, -0.7117F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.2923F, 0.3897F, 0.0257F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.4193F, 6.6195F, -0.9465F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.0017F, 0.0692F, -0.0532F);


        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.4237F, -6.7631F);
        this.chest.addChild(neck6);
        this.setRotateAngle(neck6, 0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.8F, -0.2F);
        this.neck6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4451F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, 0.0F, -0.9943F, -4.9586F, 1, 2, 5, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -2.1759F, -4.0379F);
        this.neck6.addChild(neck5);
        this.setRotateAngle(neck5, -0.4456F, -0.1974F, 0.0934F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.4F, -5.3F);
        this.neck5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4014F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 39, -0.5F, -1.79F, 3.8805F, 1, 2, 2, -0.155F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 36, -0.5F, -1.79F, -0.1195F, 1, 2, 5, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.5F, -4.2F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, -0.1355F, -0.2595F, 0.035F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -3.7F, -4.4F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 19, -1.0F, -1.8695F, 4.2348F, 1, 2, 2, -0.155F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 16, -1.0F, -1.8695F, 0.1348F, 1, 2, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.0F, -2.3F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.1658F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -6.1F, -0.7F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 62, -1.0F, 0.5773F, -2.9318F, 1, 6, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -5.5F, -1.2F);
        this.neck3.addChild(neck2);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.2F, -2.3F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7941F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 71, -1.0F, 0.9272F, -2.8396F, 1, 3, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.6269F, -1.8657F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0785F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1162F, -0.4686F, -0.1694F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.2F, -7.1434F, -1.6146F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.2F, -7.1434F, -1.6146F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 1.7583F, -0.0308F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.533F, 0.0F, 0.0F);

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
