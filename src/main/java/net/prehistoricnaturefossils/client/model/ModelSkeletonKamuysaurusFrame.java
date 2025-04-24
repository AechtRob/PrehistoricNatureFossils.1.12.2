package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKamuysaurusFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer heads;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonKamuysaurusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.4F, -37.0F, 1.7F, 1, 37, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -26.0F, -21.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -3.0F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -26.0F, -21.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -3.1F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -29.0F, 2.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 5.5F, -7.0F, -0.5F, 1, 13, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -38.1385F, 1.6637F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1658F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.4114F, -5.2615F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 34, -0.5F, 0.9F, 1.0F, 1, 2, 12, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, 2.682F, 0.773F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1396F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.5051F, 1.898F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1781F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 16.1512F, -1.4354F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.2217F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.5943F, -0.1564F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.7505F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.5968F, -2.3348F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, 2.682F, 0.773F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4887F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.5051F, 1.898F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 16.1512F, -1.4354F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.2217F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.5943F, -0.1564F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.7505F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.5968F, -2.3348F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.3054F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.694F, -4.2634F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0175F, 0.0436F, 0.0008F);
        this.body.cubeList.add(new ModelBox(body, 36, 0, -0.5F, 0.2661F, -11.0274F, 1, 2, 11, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7339F, -10.9274F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 87, 24, -0.5F, 1.0022F, -4.0898F, 1, 2, 4, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.8127F, -14.7881F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0437F, 0.0436F, -0.0019F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2579F, -3.5104F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 89, 15, -0.5F, 0.9552F, -0.0381F, 1, 2, 4, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.8579F, -6.8104F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.8203F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 0, -0.5F, 0.9135F, -1.5546F, 1, 2, 6, -0.006F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.8258F, 10.4192F, -5.3054F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.3108F, 0.0255F, -0.076F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.8318F, 8.0901F, 1.5259F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3369F, 1.076F, -1.0434F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.1197F, 10.6878F, -0.6494F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.415F, 0.174F, 0.8492F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.1322F, 0.1729F, 0.6955F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.1222F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.8258F, 10.4192F, -5.3054F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4309F, -0.0255F, 0.076F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.8318F, 8.0901F, 1.5259F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3686F, -0.9908F, 1.0802F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.1197F, 10.6878F, -0.6494F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2109F, -0.3983F, -0.157F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1322F, 0.1729F, 0.6955F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.1222F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 5.966F, -6.8882F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0087F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.6772F, -3.6376F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 97, -0.5F, -1.0F, 2.0F, 1, 2, 3, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.5772F, -1.8376F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.176F, 0.1289F, 0.0229F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.7F, -5.6F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 77, 19, -0.5F, -0.9487F, 4.8661F, 1, 2, 2, -0.155F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 15, -0.5F, -0.9487F, -0.1339F, 1, 2, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.4F, -4.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.5273F, 0.1133F, -0.0657F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.6263F, -7.1488F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6807F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 94, -0.5F, 0.6982F, 9.8419F, 1, 2, 1, -0.15F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 91, -0.5F, 0.6982F, 6.1419F, 1, 2, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.9991F, -2.6096F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0181F, 0.3079F, 0.0777F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7867F, -1.2451F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 56, -0.5F, 0.2F, -3.6F, 1, 2, 5, -0.15F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -1.8201F, -4.2787F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, 0.4157F, 0.2878F, 0.1125F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.5F, -2.0417F, 0.306F);
        this.heads.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.5F, -2.0417F, 0.306F);
        this.heads.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.8006F, 0.6661F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.2356F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8886F, 7.3385F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0876F, 0.0869F, -0.0076F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.4099F, -0.0798F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 0, -0.5F, -1.0F, 0.0F, 1, 2, 15, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2099F, 14.9202F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.1309F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 18, -0.5F, 0.4F, -0.2F, 1, 2, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0975F, 0.1737F, -0.0169F);
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 34, -0.5F, 0.4F, -0.2F, 1, 2, 12, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0397F, 12.0011F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.0436F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 18, -0.5F, 0.2F, -0.6F, 1, 1, 14, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0052F, 14.0608F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.1745F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 23, 49, -0.5F, 0.2F, -1.0F, 1, 1, 10, -0.15F, false));

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
