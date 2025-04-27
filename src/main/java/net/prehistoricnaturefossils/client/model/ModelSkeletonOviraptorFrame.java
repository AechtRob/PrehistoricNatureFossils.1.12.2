package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOviraptorFrame extends ModelBase {
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
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonOviraptorFrame() {
        this.textureWidth = 87;
        this.textureHeight = 87;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -21.0F, -0.6F, 1, 21, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.7F, -18.0F, -12.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2269F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.6F, -3.0F, -0.5F, 1, 21, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.7F, -18.0F, -12.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2269F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 0.9F, -3.1F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -16.0F, -0.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 4.2F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.5958F, 0.4919F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 14, -1.0F, -0.3F, 0.1F, 1, 1, 5, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.3F, 0.8576F, -0.3968F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.5655F, 0.0468F, 0.0737F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.3714F, 2.0694F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1345F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.0765F, -0.209F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8708F, -0.0668F, -0.0562F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.3F, 0.8576F, -0.3968F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.7437F, 0.0643F, -0.059F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.3714F, 2.0694F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.6144F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.0765F, -0.209F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.7455F, 0.043F, -0.0076F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.9635F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0701F, -0.0871F, -0.0061F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.7F, -3.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -1.0F, 0.7F, -0.7F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2432F, -4.8202F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1584F, -0.1293F, 0.0206F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -2.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 32, -1.0F, 0.7036F, -4.344F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, 0.1F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 45, -1.0F, 0.2F, -0.7F, 1, 1, 1, -0.15F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 43, -1.0F, 0.2F, -3.4F, 1, 1, 3, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.3419F, 2.7512F, -5.3517F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7119F, -0.1711F, -1.0002F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0913F, 4.7205F, -0.7657F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.7894F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.1977F, 4.7312F, -0.5441F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.0541F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4717F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.3419F, 2.7512F, -5.3517F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.6559F, 0.1704F, 1.0711F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0913F, 4.7205F, -0.7657F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7894F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.1977F, 4.7312F, -0.5441F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.0541F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4717F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.6473F, -6.6262F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.3752F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.6F, -2.1F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 39, -1.0F, -0.3F, -1.2F, 1, 1, 3, -0.15F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 41, -1.0F, -0.3F, 1.5F, 1, 1, 1, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.285F, -2.6097F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1728F, 0.0869F, 0.0144F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.1F, -2.3F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7941F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 3, -1.0F, 0.6738F, 3.2312F, 1, 1, 1, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 0, -1.0F, 0.6738F, -0.4688F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.7F, -2.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -1.3469F, 0.0948F, -0.023F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.2F, -1.6F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4014F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 25, -0.5F, 0.6324F, 1.7085F, 1, 1, 1, -0.15F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 21, -0.5F, 0.6324F, -2.9915F, 1, 1, 5, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -2.0F, -4.3F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 0.0865F, -0.0114F, 0.1304F);
        this.neck4.cubeList.add(new ModelBox(neck4, 39, 21, -0.5F, 0.3F, -2.9F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.4F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0113F, -0.0375F, -0.0479F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.33F, 2.5023F, -6.8842F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.33F, 2.5023F, -6.8842F);
        this.head.addChild(rightFace);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.2553F, 2.8357F, -4.8092F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.1391F, -0.0121F, 0.0864F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.2553F, 2.8357F, -4.8092F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.1391F, 0.0121F, -0.0864F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.8859F, 0.5741F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.8378F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 1.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1143F, -0.0847F, 0.0212F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 0, -0.5F, 0.2F, -0.2F, 1, 1, 6, -0.15F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 5, -0.5F, 0.2F, 5.5F, 1, 1, 1, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0048F, 5.8975F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1848F, -0.1287F, -0.024F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 25, -0.5F, 0.2F, 0.1F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0422F, 4.9602F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1398F, -0.0432F, -0.0061F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, -0.5F, 0.1F, -0.3F, 1, 1, 7, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 15, -0.5F, 0.1F, 6.2F, 1, 1, 1, -0.16F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0384F, 6.871F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2628F, -0.0843F, 0.0226F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.2F, 0.0F, 1, 1, 7, -0.15F, false));

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
