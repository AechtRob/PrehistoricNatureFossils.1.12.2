package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRajasaurusFrame extends ModelBase {
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
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer bony;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonRajasaurusFrame() {
        this.textureWidth = 103;
        this.textureHeight = 103;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -26.0F, -2.9F, 1, 26, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.4F, -18.5F, -20.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.288F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.3F, -6.5F, -0.5F, 1, 25, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.4F, -20.0F, -20.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2878F, 0.0099F, 1.5373F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.8F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -25.5F, -2.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.4399F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.5F, -3.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -27.0007F, -1.7064F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1213F, 0.0592F, -0.1247F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7F, -4.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 29, -0.5F, 1.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 1.7336F, -0.7003F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.3526F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.4F, 10.496F, 2.2869F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.3533F, -0.1234F, 0.0619F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 10.254F, 0.8969F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0821F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.2071F, -0.0649F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.309F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.6545F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 1.7336F, -0.7003F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.4F, 10.496F, 2.2869F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0472F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 10.254F, 0.8969F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6458F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.2071F, -0.0649F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.7385F, 0.0312F, 0.1541F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.6545F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7F, 5.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2815F, -0.1258F, 0.0363F);
        this.tail.cubeList.add(new ModelBox(tail, 1, 16, -0.5F, 0.2984F, -0.0686F, 1, 2, 11, 0.007F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2984F, 10.8314F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0792F, -0.1305F, -0.0103F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 29, -0.5F, -1.7F, -0.2F, 1, 2, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1072F, 0.217F, 0.0232F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.2962F, -0.0679F, 1, 1, 14, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1271F, 13.8336F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1174F, 0.2601F, -0.0303F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 42, -0.5F, 0.1995F, -0.2782F, 1, 1, 8, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5005F, 8.0218F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1787F, 0.2148F, -0.0385F);
        this.tail5.cubeList.add(new ModelBox(tail5, 52, 8, -0.5F, 0.7F, -0.4F, 1, 1, 6, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0397F, 5.984F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3237F, -0.3323F, 0.109F);
        this.tail6.cubeList.add(new ModelBox(tail6, 27, 16, -0.5F, 0.7F, -0.3F, 1, 1, 11, -0.15F, false));

        this.bony = new ModelRenderer(this);
        this.bony.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(bony);
        this.setRotateAngle(bony, -0.088F, 0.1304F, -0.0115F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.2F, -5.9F);
        this.bony.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 51, -0.5F, 0.8833F, -5.8801F, 1, 2, 6, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.2F, -5.7F);
        this.bony.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 51, -0.5F, 0.892F, -0.0782F, 1, 2, 6, 0.007F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -11.6F);
        this.bony.addChild(chest);
        this.setRotateAngle(chest, -0.1584F, 0.1002F, 0.0721F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6349F, -5.9994F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 0, -0.5F, 0.9F, -2.0F, 1, 2, 8, 0.007F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.0451F, 7.0655F, -2.6929F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.4326F, 0.202F, -0.2303F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.6441F, -1.1321F, 4.4813F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.2116F, -0.0869F, 0.1515F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0696F, 0.3F, 1.4491F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3054F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.0451F, 7.0655F, -2.6929F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4326F, -0.202F, 0.2303F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.6441F, -1.1321F, 4.4813F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.2116F, 0.0869F, -0.1515F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0696F, 0.3F, 1.4491F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3054F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.0048F, -7.8967F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.4422F, 0.158F, 0.0744F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.2F, -3.8F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 52, -1.0F, 0.8F, 0.2F, 1, 2, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.9F, -3.6F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.124F, 0.1732F, -0.0215F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.4F, 0.0F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 7, -1.0F, 0.5082F, -3.485F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0179F, 0.2181F, -0.0039F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.4F, -3.2F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5585F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 77, -1.0F, 0.7F, 1.4F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0704F, 0.1306F, 0.0092F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6F, -1.7F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 77, -0.5F, 0.7F, -0.9F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5664F, -1.9233F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2295F, 0.2457F, -0.0914F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(-0.4F, 1.3936F, -1.65F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.4F, 1.3936F, -1.65F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2553F, 0.6204F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);

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
