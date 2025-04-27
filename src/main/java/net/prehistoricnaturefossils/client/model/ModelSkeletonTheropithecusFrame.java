package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTheropithecusFrame extends ModelBase {
   private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
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
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer tail9;

    public ModelSkeletonTheropithecusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -10.0F, 5.9F, 1, 10, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -13.0F, 6.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -10.2F, -4.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.5F, -13.0F, -8.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6545F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 3.4F, -1.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(4.5F, -13.0F, -8.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 1.1F, -9.0F, -0.5F, 1, 22, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -8.3642F, 7.7417F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -1.0559F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -0.5F, 0.5F, -0.1F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 4.0253F, 3.7699F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.9333F, -0.0994F, -0.2453F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.8633F, -3.4541F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.5569F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.7051F, -1.8679F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -2.1463F, 0.0238F, 0.0366F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 3.3749F, 0.0205F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.5708F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, -0.2629F, -4.5144F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 4.0253F, 3.7699F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.0084F, 0.1109F, 0.0697F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.8633F, -3.4541F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.946F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.7051F, -1.8679F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.4578F, -0.0099F, 0.0867F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 3.3749F, 0.0205F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.5708F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, -0.2629F, -4.5144F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1658F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8F, -6.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -0.5F, 0.8F, 0.0F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -6.0F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.1706F, -0.2506F, -0.3514F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1F, -0.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.4F, -6.1F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1F, -6.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3695F, -0.1106F, -0.1855F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.4F, -5.4F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3229F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 23, -0.5F, -0.289F, 0.2677F, 1, 1, 1, -0.15F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 19, -0.5F, -0.289F, 0.9677F, 1, 1, 5, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.6F, 6.3429F, -3.4821F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8383F, 0.1334F, -0.2909F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.1372F, 7.8696F, 6.7191F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.199F, -0.1151F, 1.1502F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.3F, 11.5311F, 0.8987F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.5236F, -0.2042F, 0.3378F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 2.7399F, -0.0221F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.7418F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.6F, 6.3429F, -3.4821F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3577F, -0.0806F, 0.3787F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.1372F, 7.8696F, 6.7191F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.0648F, -0.0636F, -0.3467F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.3F, 11.5311F, 0.8987F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4352F, -0.1187F, -0.1282F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 2.7399F, -0.0221F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.9163F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.5F, -4.3F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.171F, -0.1951F, -0.0973F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4775F, -0.9338F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5078F, -0.0763F, 0.0424F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 0, -0.5F, -0.5F, -1.2F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8F, -1.6F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.4837F, -0.4261F, -0.389F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.2841F, -2.0393F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9693F, -0.0296F, 0.0432F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 22, -0.5F, -0.5681F, -0.2721F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.1F, -1.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.8359F, 2.5361F, -9.8986F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.8359F, 2.5361F, -9.8986F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0955F, -0.9208F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1134F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3448F, 1.4809F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2502F, -0.0779F, -0.2956F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 62, -0.5F, 0.5503F, -0.0853F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2954F, 2.7846F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0829F, 0.6106F, -0.426F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.0315F, -0.3345F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0175F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 32, -0.5F, 0.2F, 0.0F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3885F, 4.5405F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.7437F, 0.1623F, -0.546F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0349F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 38, -0.5F, 0.6F, -3.6F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0335F, 3.7642F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.8904F, 0.0344F, 0.2635F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.5F, 0.6F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0132F, 3.9051F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.5167F, -0.2094F, 0.2184F);
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 26, -0.5F, 0.6F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1386F, 3.8873F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3665F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 13, 38, -0.5F, 0.5F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.1011F, 3.882F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.4306F, -0.0024F, 0.2065F);
        this.tail7.cubeList.add(new ModelBox(tail7, 26, 26, -0.5F, 0.5F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.1637F, 4.6089F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.4625F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 30, 8, -0.5F, 0.5F, -0.5F, 1, 1, 5, -0.15F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 34, 12, -0.5F, 0.5F, 4.2F, 1, 1, 1, -0.15F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.5675F, 4.4346F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, 1.0123F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 39, 32, -0.5F, 0.1983F, -0.507F, 1, 1, 4, -0.15F, false));

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
