package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYuanyanglongFrame extends ModelBase {
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
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonYuanyanglongFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 26.0F, 7.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.6F, -32.0F, -7.3F, 1, 32, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.3F, -26.6F, -19.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2967F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.2F, -3.4F, -0.5F, 1, 30, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.3F, -26.6F, -19.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2967F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -2.6F, -3.5F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -24.5F, -6.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -6.5F, -2.5F, -0.5F, 1, 6, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -31.6F, -6.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, -0.1F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, -0.0174F, 0.0009F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, 16, -0.6F, -0.4F, -0.3F, 1, 1, 7, -0.2F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.3F, 0.7234F, -0.3841F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1913F, 0.0166F, 0.0857F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.488F, 2.968F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6756F, -0.0434F, -0.0046F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 14.1466F, 0.0891F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 7.998F, -0.3342F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.7418F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.3491F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.3F, 0.7234F, -0.3841F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.2007F, 0.0637F, -0.1626F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.488F, 2.968F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1519F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 14.1466F, 0.0891F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3924F, 0.0167F, 0.0403F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 7.998F, -0.3342F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3914F, -0.0334F, 0.0807F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0354F, -0.1744F, -0.0062F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, 2.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 5, -1.0F, 0.7044F, -6.8051F, 1, 1, 5, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0532F, -0.1743F, 0.0092F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -3.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 44, -0.9F, 0.8036F, -2.4441F, 1, 1, 3, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -0.9F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 12, -1.0F, 0.2F, -2.6F, 1, 1, 4, -0.2F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.1436F, 3.1193F, -4.8012F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.8985F, 0.3187F, -0.1359F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0972F, 4.1035F, -0.291F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.0948F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.1588F, 3.6311F, -0.2472F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.9973F, -0.212F, 0.2292F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.1436F, 3.1193F, -4.8012F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.6367F, -0.3187F, 0.1359F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0972F, 4.1035F, -0.291F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.0948F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.1588F, 3.6311F, -0.2472F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.9973F, 0.212F, -0.2292F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.1F, -5.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0903F, -0.2608F, -0.0233F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 62, -1.0F, -0.0643F, 0.5306F, 1, 1, 1, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.2F, -2.9F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 45, -1.0F, -0.8828F, -0.2287F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.1F, -2.5F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1222F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1359F, -0.6488F, -2.2858F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.762F, -0.0733F, 0.0748F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 45, -0.3745F, -0.7226F, -0.3064F, 1, 1, 3, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, -1.0F, -1.2F);
        this.neck2.addChild(neck4);
        this.setRotateAngle(neck4, -0.0475F, -0.346F, 0.1392F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.4F, 0.2F, -0.6F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.314F, -0.0108F, 0.0332F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 52, -0.6F, -2.7F, -0.7F, 1, 3, 1, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -2.8F, -1.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0F, -0.1745F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, -0.1F, 0.5F);
        this.neck5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2604F, -0.0271F, 0.1012F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 22, -0.7F, -2.2068F, -1.6518F, 1, 3, 1, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -1.79F, -0.4566F);
        this.neck5.addChild(neck);
        this.setRotateAngle(neck, -0.2375F, -0.2974F, 0.0708F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.843F, -0.7968F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9774F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 46, -0.5F, 0.5383F, 0.047F, 1, 1, 2, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.643F, -2.6968F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4014F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 46, -0.5F, 0.5324F, 0.0085F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.343F, -2.6968F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.5236F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 0.9338F, 0.6112F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7505F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3174F, 2.6015F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1828F, -0.3006F, 0.0547F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 18, -0.4F, 0.1F, 0.2F, 1, 1, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.128F, -0.3031F, -0.0384F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 17, -0.5F, 0.1F, -0.3F, 1, 1, 6, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2096F, 6.0005F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1737F, 0.3011F, -0.052F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.3087F, -0.5804F, 1, 1, 8, -0.2F, false));

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
