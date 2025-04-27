package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTherizinosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck6;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
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

    public ModelSkeletonTherizinosaurusFrame() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -38.0F, -1.2F, 1, 38, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.7F, -35.65F, -28.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -16.35F, -0.5F, 1, 52, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7F, -35.65F, -28.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 3.85F, -10.0F, -0.5F, 1, 19, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -31.0F, -0.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 5.5F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.9076F, -0.1745F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2356F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.1F, -6.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4189F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 0, -0.5F, 1.0F, 0.0F, 1, 3, 17, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -8.0F, -7.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0399F, 0.089F, 0.0399F);
        this.body.cubeList.add(new ModelBox(body, 92, 50, -0.5F, -1.7F, -14.0F, 1, 3, 6, 0.004F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 66, -0.5F, 0.8F, 0.0F, 1, 3, 9, -0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -13.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0361F, 0.0453F, 0.0414F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6F, -0.3F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 62, -0.5F, 0.9F, -9.8F, 1, 3, 10, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(8.67F, 10.5868F, -7.6405F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.9044F, -0.2333F, -1.0074F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.2306F, 2.3536F, 12.0364F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5678F, -0.3865F, -0.1857F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0438F, 8.9975F, -0.2953F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.0433F, 0.0057F, 0.3489F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.6011F, -0.0651F, -0.2986F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(0.0F, 4.0F, 1.0F);
        this.leftArm3.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 0.0F, 0.0F, -0.3054F);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.leftArm3.addChild(leftArm6);
        this.setRotateAngle(leftArm6, 0.4303F, 0.0393F, -0.303F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-8.67F, 10.5868F, -7.6405F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.432F, 0.5044F, 0.854F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.2306F, 2.3536F, 12.0364F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5332F, 0.2004F, 0.0666F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0438F, 8.9975F, -0.2953F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0433F, -0.0057F, -0.3489F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.6011F, 0.0651F, 0.2986F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.0F, 4.0F, 1.0F);
        this.rightArm3.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 0.0F, 0.0F, 0.3054F);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.rightArm3.addChild(rightArm6);
        this.setRotateAngle(rightArm6, 0.1249F, -0.0393F, 0.303F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.1F, -9.3F);
        this.chest.addChild(neck5);
        this.setRotateAngle(neck5, -0.0961F, 0.0434F, -0.0042F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.1F, -5.0F);
        this.neck5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 75, -0.5F, 1.1F, -3.0F, 1, 2, 9, 0.004F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -2.0335F, -7.9736F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, -0.1745F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3F, 0.4F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2705F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 71, -0.5F, 0.1583F, -8.8835F, 1, 2, 9, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.7759F, -8.072F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.2998F, 0.1707F, 0.0366F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.6286F, -12.5275F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6458F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 36, -0.5F, -1.7657F, -0.0113F, 1, 2, 15, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -7.0141F, -9.7104F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1567F, 0.0099F, 0.0867F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.0275F, -6.9742F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6807F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 76, -0.5F, 1.0F, -1.3F, 1, 2, 9, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -7.5711F, -8.7081F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -5.2F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3142F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 66, -0.5F, 0.6F, 0.3F, 1, 2, 6, -0.154F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -2.0601F, -5.2093F);
        this.neck.addChild(neck6);
        this.setRotateAngle(neck6, 0.3054F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 83, 101, -0.5F, 0.5F, -6.0F, 1, 2, 6, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5552F, -5.7707F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.2F, -0.0052F, -1.304F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.2F, -0.0052F, -1.304F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.9043F, -0.9921F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1548F, 8.9126F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3424F, -0.2472F, 0.087F);
        this.tail.cubeList.add(new ModelBox(tail, 67, 17, -0.5F, -0.0164F, -0.2023F, 1, 2, 10, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2209F, 9.6922F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0611F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 87, 64, -0.5F, 0.1015F, -0.1488F, 1, 2, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0015F, 7.5512F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3065F, 0.0832F, -0.0263F);
        this.tail3.cubeList.add(new ModelBox(tail3, 89, 30, -0.5F, -0.0532F, -0.0544F, 1, 2, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.47F, 6.8584F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0532F, 0.1743F, 0.0092F);
        this.tail4.cubeList.add(new ModelBox(tail4, 67, 87, -0.5F, 0.4006F, -0.3791F, 1, 1, 8, -0.15F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 74, 94, -0.5F, 0.4006F, 7.3209F, 1, 1, 1, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0006F, 8.0209F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3099F, 0.1664F, 0.053F);
        this.tail5.cubeList.add(new ModelBox(tail5, 88, 75, -0.5F, 0.3185F, -0.4797F, 1, 1, 8, -0.15F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 95, 82, -0.5F, 0.3185F, 7.2203F, 1, 1, 1, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.01F, 7.6567F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1962F, 0.4721F, 0.0902F);
        this.tail6.cubeList.add(new ModelBox(tail6, 45, 106, -0.5F, 0.3408F, -0.0336F, 1, 1, 6, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0401F, 5.8543F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.219F, 0.0852F, 0.0189F);
        this.tail7.cubeList.add(new ModelBox(tail7, 106, 64, -0.5F, 0.2528F, -0.5182F, 1, 1, 6, -0.15F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 111, 69, -0.5F, 0.2528F, 5.1818F, 1, 1, 1, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.2468F, 6.1824F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.2355F, 0.3829F, -0.0894F);
        this.tail8.cubeList.add(new ModelBox(tail8, 122, 110, -0.5F, 0.6F, -0.3F, 1, 1, 4, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.0F, -2.5236F, -1.6627F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.6068F, 0.0749F, 0.1074F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.0F, 15.591F, 5.9009F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.4625F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, -0.0979F, 16.7847F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5218F, 0.1478F, -0.0932F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.5F, 0.6635F, 4.9103F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -1.2915F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0174F, 3.9015F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.0F, -2.5236F, -1.6627F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2164F, -0.0283F, -0.1278F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.0F, 15.591F, 5.9009F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.5498F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, -0.0979F, 16.7847F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5602F, -0.074F, 0.0463F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.5F, 0.6635F, 4.9103F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -1.5533F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0174F, 3.9015F);
        this.rightLeg4.addChild(rightLeg5);

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
