package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDamadamaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;

    public ModelSkeletonDamadamaFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, -21.5F, -12.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1484F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.7F, -6.1F, -0.5F, 1, 28, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, -21.5F, -12.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1484F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 1.9F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -22.5F, 12.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 3.5F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -22.5F, 12.9F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0524F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 1, -1.0F, -7.3F, -0.5F, 1, 30, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -29.9546F, 12.7623F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.096F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, -0.5F, 0.5F, 1.0F, 1, 1, 5, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.3878F, 1.1265F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5061F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.0874F, -0.0674F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.405F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.2281F, -0.6452F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.5359F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 9.214F, -0.5463F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 2.33F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, 0.2142F, -5.3932F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.3878F, 1.1265F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0698F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.0874F, -0.0674F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0559F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.2281F, -0.6452F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.925F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 9.214F, -0.5463F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.1083F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, 0.2142F, -5.3932F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3528F, -3.2386F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1134F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8F, -6.9F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.8F, -0.8F, 1, 1, 8, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2814F, -7.8926F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.2214F, -0.1704F, 0.0381F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2135F, 0.1404F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 15, -0.5F, 0.5F, -6.4F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -5.7577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0961F, -0.0434F, -0.0042F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0551F, 0.0564F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3665F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 24, -0.5F, 0.4F, -3.3F, 1, 1, 3, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.9F, -2.9F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4102F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, -0.5F, 0.6145F, -6.9515F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.1F, 7.9941F, -8.0663F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6761F, 0.1226F, -0.0132F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.3217F, 2.4213F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.5498F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 8.0123F, 0.575F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.8727F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 9.0963F, 0.3452F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.48F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.1F, 7.9941F, -8.0663F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2443F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.3217F, 2.4213F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.6807F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 8.0123F, 0.575F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.48F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 9.0963F, 0.3452F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.6981F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.0F, -8.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.9161F, -0.2628F, -0.1289F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5061F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 41, -0.5F, -0.2F, -2.2F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.3026F, -0.1795F, -0.0107F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9687F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 44, -0.5F, 0.5319F, -0.0721F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.1F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.4303F, -0.3566F, 0.2878F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.7F, -2.0F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8727F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 82, -0.5F, -0.9753F, -1.1709F, 1, 4, 1, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.9365F, -2.1677F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 1.1493F, -0.0349F, 0.248F);
        this.neck4.cubeList.add(new ModelBox(neck4, 32, 79, -0.5F, -3.0F, -1.2F, 1, 3, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.5494F, 0.0474F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -1.3916F, -0.0479F, -0.0799F);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(1.33F, -2.3267F, -1.8342F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 0.039F, -0.1033F, -0.6845F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-1.33F, -2.3267F, -1.8342F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 0.039F, 0.1033F, 0.6845F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6359F, 3.8361F, -8.5987F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6359F, 3.8361F, -8.5987F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6F, -1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 1.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2628F, -0.0843F, 0.0226F);
        this.tail.cubeList.add(new ModelBox(tail, 45, 36, -0.5F, 0.5503F, -0.0853F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2466F, -0.2967F, 0.0735F);
        this.tail2.cubeList.add(new ModelBox(tail2, 66, 42, -0.5F, 0.5598F, -0.0232F, 1, 1, 2, -0.15F, false));

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
