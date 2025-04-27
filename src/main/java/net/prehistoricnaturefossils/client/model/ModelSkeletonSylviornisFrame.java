package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSylviornisFrame extends ModelBase {
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
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonSylviornisFrame() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -38.0F, -10.2F, 1, 38, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -29.0F, 7.0F, 1, 29, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -21.5F, 7.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -8.8F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -15.1F, -3.5F, -17.7F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.2506F, 4.9398F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1222F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.7F, -4.1F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4014F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 19, -1.0F, 0.9027F, 0.0176F, 1, 2, 15, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 3.253F, 2.3008F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.0744F, -0.0841F, 0.0234F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3F, 8.6355F, -0.0285F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.8681F, 0.0254F, 0.0458F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 17.1781F, -5.7949F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.117F, 0.0F, 0.0F);


        this.toe = new ModelRenderer(this);
        this.toe.setRotationPoint(-1.5241F, 6.5154F, 0.3935F);
        this.leftLeg3.addChild(toe);
        this.setRotateAngle(toe, 0.4644F, -0.5576F, -0.1164F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.0137F, 1.1925F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4363F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.4893F, -3.806F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0038F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 3.253F, 2.3008F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.3798F, 0.0841F, -0.0234F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3F, 8.6355F, -0.0285F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 2.3917F, -0.0254F, -0.0458F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 17.1781F, -5.7949F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1606F, 0.0F, 0.0F);


        this.toe2 = new ModelRenderer(this);
        this.toe2.setRotationPoint(1.5241F, 6.5154F, 0.3935F);
        this.rightLeg3.addChild(toe2);
        this.setRotateAngle(toe2, -0.321F, 0.5576F, 0.1164F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.0137F, 1.1925F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.3963F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.4893F, -3.806F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -1.1307F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 7.2591F, 10.4571F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.9512F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 43, 76, -0.5F, 0.4795F, -2.9597F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0188F, 0.8961F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1396F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 54, 68, -0.5F, 0.406F, -0.1402F, 1, 1, 3, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0519F, 2.9561F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3491F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 81, 9, -0.5F, 0.3585F, -0.1155F, 1, 1, 2, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0087F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.1F, -3.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3578F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 0, -1.0F, 0.9494F, -1.9332F, 1, 2, 6, -0.152F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0702F, -5.8129F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0262F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.4F, -1.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 24, -1.0F, -0.3F, -4.9F, 1, 2, 6, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(4.0897F, 1.9204F, -4.906F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.1519F, 0.8237F, -0.0575F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.4242F, 7.3808F, -1.3811F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.6902F, -0.3897F, -0.0257F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.4261F, 5.8606F, -0.4627F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.3508F, -0.0692F, 0.0532F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.0897F, 1.9204F, -4.906F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.082F, -0.9415F, 0.1478F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.4242F, 7.3808F, -1.3811F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3411F, 0.3897F, 0.0257F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.4261F, 5.8606F, -0.4627F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.569F, 0.0692F, -0.0532F);


        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -1.1464F, -5.2669F);
        this.chest.addChild(neck6);
        this.setRotateAngle(neck6, -0.2447F, -0.8422F, -0.0634F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.6F, -0.7F);
        this.neck6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4451F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 49, 0.0F, -0.9943F, -4.6586F, 1, 2, 6, -0.153F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.9759F, -3.6379F);
        this.neck6.addChild(neck5);
        this.setRotateAngle(neck5, -0.7592F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.3F, 0.2F);
        this.neck5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -1, 40, 0.0F, -0.1F, -5.4F, 1, 2, 6, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.5F, -4.2F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, 0.2443F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -3.7F, -3.5F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9774F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 45, -1.0F, -1.0981F, 0.1713F, 1, 2, 5, -0.1504F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.0F, -2.3F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1051F, -0.0868F, -0.0091F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -6.1F, -0.7F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 68, -1.0F, 2.5773F, -2.9318F, 1, 4, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -3.4068F, -0.6482F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.176F, -0.1289F, -0.0229F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.2F, -2.3F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7941F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 73, -1.0F, 1.4272F, -2.8396F, 1, 3, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.7107F, -1.5168F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0206F, -0.1319F, -0.0406F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.5F, -3.5F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1833F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 6, -1.0F, 0.8616F, -1.2862F, 1, 2, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8876F, -4.6461F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2749F, -0.0151F, -0.2172F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.2F, -18.1434F, -1.6146F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.2F, -18.1434F, -1.6146F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 1.7451F, -0.0812F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7076F, 0.0F, 0.0F);

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
