package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSinclairomeryxFrame extends ModelBase {
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
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightFace;
    private final ModelRenderer rightHorn;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;

    public ModelSkeletonSinclairomeryxFrame() {
        this.textureWidth = 92;
        this.textureHeight = 92;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.0F, 4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -26.0F, 8.0F, 1, 26, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -19.7F, -18.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 1.0F, -5.3F, -0.5F, 1, 25, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -19.7F, -18.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.8F, -1.7F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -20.0F, 8.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.6F, -5.0F, -0.5F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -26.28F, 8.1369F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.288F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 13, -0.5F, 0.5F, 1.0F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.0765F, 1.5178F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0698F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.9944F, 0.2414F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6406F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.2048F, -1.8569F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.405F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 8.7492F, -0.7306F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.2741F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, 0.5893F, -2.4816F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.0873F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.0765F, 1.5178F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5498F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.9944F, 0.2414F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5795F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.2048F, -1.8569F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.2741F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 8.7492F, -0.7306F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.1868F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, 0.5893F, -2.4816F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.4102F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3528F, -3.2386F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1222F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8F, -6.9F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -0.5F, 0.8F, -1.0F, 1, 1, 8, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2814F, -7.8926F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.1048F, -0.0434F, -0.0046F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2135F, 0.1404F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -0.5F, 0.4F, -6.0F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -5.7577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.044F, -0.1308F, 0.0057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0551F, 0.0564F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 35, -0.5F, 0.3F, -2.8F, 1, 1, 3, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9F, -2.9F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4102F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, -1, -0.5F, 0.5145F, -9.4515F, 1, 1, 10, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.9956F, 10.3173F, -9.2559F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 1.1067F, 0.2752F, 0.0168F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.1867F, 2.6698F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.9354F, 0.0305F, 0.1273F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 8.0123F, 0.575F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.7453F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 6.4862F, 0.1163F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.7854F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.9956F, 10.3173F, -9.2559F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.7209F, -0.0583F, 0.1173F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.1867F, 2.6698F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.7573F, -0.0305F, -0.1273F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 8.0123F, 0.575F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3491F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 6.4862F, 0.1163F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.6981F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.7063F, -10.8368F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.1222F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5061F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 32, -0.5F, -0.2F, -2.2F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2791F, -0.3295F, -0.0368F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.8619F, -1.5451F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.9689F, -0.0198F, 0.0288F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 40, -0.4F, -0.5F, 0.5F, 1, 1, 2, -0.155F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 39, -0.4F, -0.5F, -1.5F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.1565F, -1.5193F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.085F, -0.359F, -0.3449F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -1.4F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8708F, -0.0668F, 0.0562F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 78, 46, -0.5F, -0.4753F, -1.1709F, 1, 2, 1, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.2365F, -1.5677F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 1.1375F, -0.4789F, -0.12F);
        this.neck4.cubeList.add(new ModelBox(neck4, 43, 68, -0.5F, -3.0F, -1.2F, 1, 3, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.6246F, -0.0123F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.8287F, -0.2125F, -0.0491F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6359F, 4.4013F, -7.8154F);
        this.head.addChild(leftFace);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(0.8369F, -4.6665F, 4.793F);
        this.leftFace.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 1.2255F, 0.083F, -1.1318F);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6359F, 4.4013F, -7.8154F);
        this.head.addChild(rightFace);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-0.8369F, -4.6665F, 4.793F);
        this.rightFace.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 1.2255F, -0.083F, 1.1318F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.0568F, -1.3894F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2262F, 2.7023F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4418F, 0.1646F, -0.1326F);
        this.tail.cubeList.add(new ModelBox(tail, 49, 54, -0.5F, 0.5503F, -0.0853F, 1, 1, 2, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0331F, 1.8714F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.192F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 54, 12, -0.5F, 0.5598F, -0.0232F, 1, 1, 2, -0.15F, false));

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
