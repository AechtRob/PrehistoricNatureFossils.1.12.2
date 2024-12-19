package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHippidionFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
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
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonHippidionFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -24.6F, 13.0F, 1, 25, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, -14.5F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -20.0F, -14.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.1F, -3.0F, -0.5F, 1, 6, 1, -0.16F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.9F, -4.0F, 27.0F, 1, 8, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.1766F, 12.3022F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.096F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.332F, -1.3594F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 0, -0.5F, 0.438F, -3.7591F, 1, 1, 4, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 17, -0.5F, 0.6F, 3.0F, 1, 1, 4, -0.154F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 3.0571F, 1.9857F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.6283F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.9427F, -1.4527F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7156F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.7997F, -1.3328F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8639F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 5.7835F, -0.7402F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.6319F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 3.0571F, 1.9857F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1571F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.9427F, -1.4527F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.6319F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.7997F, -1.3328F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.3439F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 5.7835F, -0.7402F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 2.3736F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3528F, -5.3386F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1658F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5623F, -4.8135F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, -0.5F, 0.9F, -0.7F, 1, 1, 6, -0.154F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0437F, -5.8061F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1833F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2135F, 0.1404F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 7, -0.5F, 0.5F, -6.5F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -5.7577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0349F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0551F, -0.0436F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2793F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 40, -0.5F, 0.4358F, -3.1066F, 1, 1, 3, -0.154F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.9643F, -2.4914F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.8334F, -6.7979F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.1F, 6.7469F, -8.834F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8772F, 0.1009F, -0.0835F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.5724F, 2.0947F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -2.0896F, -0.0547F, 0.0758F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.5907F, 0.6727F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 2.2618F, -0.0914F, 0.0963F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 4.8445F, 0.0263F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.6945F, -0.0162F, 0.093F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.1F, 6.7469F, -8.834F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0087F, -0.0011F, 0.1309F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.5724F, 2.0947F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.4362F, 0.0099F, -0.0539F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.5907F, 0.6727F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.8273F, 0.002F, -0.0466F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 4.8445F, 0.0263F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.042F, -0.0077F, -0.0493F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.0F, -8.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.4375F, 0.174F, 0.0138F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5061F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 44, -0.5F, -0.2F, -1.2F, 1, 1, 4, -0.154F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.3831F, -2.3411F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2007F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1042F, -1.8109F, -2.7183F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8988F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 31, -0.6042F, -0.8293F, -0.2534F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.1F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.4479F, 0.2221F, 0.0061F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.7F, -2.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 80, -0.5F, 0.5247F, -1.2709F, 1, 3, 1, -0.154F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.4157F, -1.3699F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 1.377F, 0.2081F, 0.0654F);
        this.neck4.cubeList.add(new ModelBox(neck4, 73, 78, -0.5F, -3.7887F, -0.9565F, 1, 2, 1, -0.154F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.7887F, 0.8435F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 79, 19, -0.5F, 0.0F, -1.8F, 1, 2, 1, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.5405F, -0.3011F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -1.2762F, -0.1713F, -0.051F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6359F, 3.7361F, -8.5987F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6359F, 3.7361F, -8.5987F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.1676F, -1.4077F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2109F, -0.0007F, 0.0241F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2344F, 2.7177F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 40, -0.5F, 0.6503F, -0.4853F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.4102F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 25, -0.5F, 0.6598F, -0.2232F, 1, 1, 4, -0.154F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1594F, 4.1193F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.4974F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 17, -0.5F, 0.6598F, -0.3232F, 1, 1, 5, -0.15F, false));

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
