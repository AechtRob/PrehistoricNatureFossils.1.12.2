package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRangiferFrame extends ModelBase {
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
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonRangiferFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.0F, 4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -4.9F, 7.7F, 1, 6, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.7F, -6.05F, -17.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3142F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -3.75F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7F, -6.05F, -17.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3088F, 0.059F, -1.7536F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -2.8142F, -2.3721F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, -3.8F, 8.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.9897F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -1.5F, -3.5F, -0.5F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.5553F, 8.3073F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1571F, 0.0F, -0.2618F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 10, -0.5F, 0.5F, 0.9F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.7008F, 1.3755F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.817F, -0.3189F, -0.2756F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.0874F, -0.0674F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.2895F, 0.1653F, 0.143F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.2856F, -1.2868F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.5794F, 0.0011F, 0.1309F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 8.7492F, -0.7306F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.4994F, -0.2073F, -0.0684F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, 0.2142F, -5.3932F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.7008F, 1.3755F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.5026F, -0.1211F, -0.8046F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.0874F, -0.0674F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.8435F, 0.1261F, 0.0352F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.2856F, -1.2868F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.3612F, 0.0015F, -0.0055F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 8.7492F, -0.7306F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 2.2686F, 0.0978F, -0.0795F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, 0.2142F, -5.3932F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3528F, -3.2386F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.0087F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8F, -6.9F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 0.8F, -1.0F, 1, 1, 8, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2814F, -7.8926F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.2024F, -0.1283F, 0.0262F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2135F, 0.1404F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 18, -0.5F, 0.4F, -5.8F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -5.7577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0449F, -0.156F, -0.0693F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0551F, 0.0564F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, -1, -0.5F, 0.4F, -3.6F, 1, 1, 4, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9F, -2.9F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4102F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, -0.5F, 0.6145F, -7.2515F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.1F, 9.6885F, -6.2172F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8208F, 0.2729F, -0.2264F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.1867F, 2.6698F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.8619F, -0.2253F, 0.0314F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 8.9886F, 0.7915F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.8839F, 0.6739F, 0.3438F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 5.4098F, 0.485F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 1.0523F, 0.2167F, 0.3644F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.1F, 9.6885F, -6.2172F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 1.1802F, 0.0196F, -0.3164F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.1867F, 2.6698F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.8586F, -0.4113F, -0.3602F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 8.9886F, 0.7915F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 1.9647F, 0.586F, -0.1994F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 5.4098F, 0.485F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.1988F, -0.2454F, -0.0153F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.0F, -8.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.2608F, -0.0226F, 0.0843F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5061F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 31, -0.5F, -0.2F, -1.5F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2789F, -0.3705F, 0.0321F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1745F, 0.9748F, -0.2505F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.9687F, -0.0099F, 0.0144F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 48, -0.6745F, -0.4733F, -3.7469F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.1565F, -1.5193F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.4073F, -0.3549F, 0.2899F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -1.4F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 68, -0.5F, -0.3753F, -1.1709F, 1, 2, 1, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.2365F, -1.5677F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 1.0964F, -0.369F, 0.0471F);
        this.neck4.cubeList.add(new ModelBox(neck4, 14, 81, -0.5F, -2.8F, -1.2F, 1, 3, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.9339F, -0.2194F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.9619F, -0.2085F, -0.0647F);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(1.0665F, -1.7566F, -1.3789F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 0.0511F, 0.0068F, -0.8018F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-1.0665F, -1.7566F, -1.3789F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 0.0511F, -0.0068F, 0.8018F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6359F, 3.5361F, -8.5987F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6359F, 3.5361F, -8.5987F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.4917F, -1.5909F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2262F, 2.7023F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.721F, -0.2364F, -0.3195F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0644F, 0.7731F, 2.5083F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1396F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 47, -0.5644F, -0.2228F, -2.5937F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.5411F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 70, 26, -0.5F, 0.5598F, -0.0232F, 1, 1, 2, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.9804F, 4.529F);
        this.tail.addChild(tail3);
        this.setRotateAngle(tail3, -0.8949F, 0.2838F, -0.336F);
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 36, -0.5F, 0.5598F, -0.0232F, 1, 1, 3, -0.15F, false));

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
