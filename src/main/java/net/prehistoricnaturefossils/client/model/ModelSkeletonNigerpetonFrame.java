package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNigerpetonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone12;
    private final ModelRenderer bone14;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone3;
    private final ModelRenderer bone23;
    private final ModelRenderer bone13;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone4;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer jaw;
    private final ModelRenderer bone2;
    private final ModelRenderer bone11;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;

    public ModelSkeletonNigerpetonFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -4.0F, 1.7F, 1, 4, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.9F, -4.9F, -9.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3403F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -0.1F, -0.5F, 1, 5, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.9F, -4.9F, -9.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3403F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.6F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -7.0F, 2.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.3F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.55F, -4.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 7, -0.5F, 0.6F, 0.1F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.8723F, -1.5735F, -0.633F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.186F, 0.1457F, 0.3345F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.904F, 0.6363F, 1.1848F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -2.7225F, -1.2905F, 2.4819F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2267F, 0.9112F, -0.5097F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.8723F, -1.5735F, -0.633F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0702F, -1.244F, -0.4988F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.904F, 0.6363F, 1.1848F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.2654F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, -0.6981F, 0.4363F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.7F, 1.9F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2706F, -0.2527F, 0.0692F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 23, -0.5F, 0.3296F, -0.0668F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.019F, 4.8218F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1155F, -0.4338F, -0.0487F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 14, -0.5F, 0.2872F, -0.1038F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0126F, 4.9831F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0481F, -0.4359F, -0.0203F);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 9, -0.6F, 0.2938F, -0.4922F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0123F, 2.9956F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0472F, -0.3923F, -0.0181F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 30, -0.5F, 0.344F, 0.0165F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.2F, -4.1F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.65F, -5.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -2, 13, -0.5F, 0.6F, -0.3F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.25F, -4.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 7, -0.5F, 0.45F, 0.0F, 1, 1, 4, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.956F, 2.8681F, -2.4351F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.3143F, -0.0549F, 0.1605F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(3.784F, -0.1309F, -0.158F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1184F, 1.0224F, -0.0135F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(3.25F, 0.5F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0757F, 0.0011F, -0.3332F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.956F, 2.8681F, -2.4351F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0163F, 1.1189F, -0.3741F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-3.784F, -0.1309F, -0.158F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1533F, -0.8997F, 0.0011F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-3.25F, 0.5F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0873F, -0.3491F, 0.3054F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4822F, 0.0224F, 0.208F);
        this.neck.cubeList.add(new ModelBox(neck, 40, 15, -0.5F, 0.1F, -3.25F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -2.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1326F, -0.0001F, 0.1716F);


        this.bone9 = new ModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone9);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);


        this.bone10 = new ModelRenderer(this);
        this.bone10.setRotationPoint(2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone10);
        this.setRotateAngle(bone10, 0.0436F, -0.0436F, 0.0F);


        this.bone12 = new ModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone10.addChild(bone12);
        this.setRotateAngle(bone12, 0.0F, 0.6545F, 0.0F);


        this.bone14 = new ModelRenderer(this);
        this.bone14.setRotationPoint(-2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone14);
        this.setRotateAngle(bone14, 0.0436F, 0.0436F, 0.0F);


        this.bone17 = new ModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone14.addChild(bone17);
        this.setRotateAngle(bone17, 0.0F, -0.6545F, 0.0F);


        this.bone18 = new ModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone18);
        this.setRotateAngle(bone18, -0.0873F, 0.0F, 0.0F);


        this.bone19 = new ModelRenderer(this);
        this.bone19.setRotationPoint(-2.4F, -0.05F, -0.45F);
        this.bone18.addChild(bone19);
        this.setRotateAngle(bone19, 0.0436F, 0.0436F, 0.0F);


        this.bone20 = new ModelRenderer(this);
        this.bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone19.addChild(bone20);
        this.setRotateAngle(bone20, 0.0F, -0.6545F, 0.0F);


        this.bone21 = new ModelRenderer(this);
        this.bone21.setRotationPoint(2.4F, -0.05F, -0.45F);
        this.bone18.addChild(bone21);
        this.setRotateAngle(bone21, 0.0436F, -0.0436F, 0.0F);


        this.bone22 = new ModelRenderer(this);
        this.bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone21.addChild(bone22);
        this.setRotateAngle(bone22, 0.0F, 0.6545F, 0.0F);


        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone7);
        this.setRotateAngle(bone7, 0.0873F, 0.0F, 0.0F);


        this.bone8 = new ModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, -0.3054F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 1.5F, -6.5F);
        this.head.addChild(bone3);
        this.setRotateAngle(bone3, 0.0873F, 0.0F, 0.0F);


        this.bone23 = new ModelRenderer(this);
        this.bone23.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone3.addChild(bone23);
        this.setRotateAngle(bone23, -0.3054F, 0.0F, 0.0F);


        this.bone13 = new ModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, 0.5F, -7.9F);
        this.head.addChild(bone13);
        this.setRotateAngle(bone13, 0.1745F, 0.0F, 0.0F);


        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 3.35F);
        this.bone13.addChild(bone5);
        this.setRotateAngle(bone5, 0.2182F, 0.0F, 0.0F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.2618F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.5F, -7.9F);
        this.head.addChild(bone4);
        this.setRotateAngle(bone4, 0.1745F, 0.0F, 0.0F);


        this.bone15 = new ModelRenderer(this);
        this.bone15.setRotationPoint(0.0F, 0.0F, 3.35F);
        this.bone4.addChild(bone15);
        this.setRotateAngle(bone15, 0.2182F, 0.0F, 0.0F);


        this.bone16 = new ModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone15.addChild(bone16);
        this.setRotateAngle(bone16, -0.2618F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 0.8022F, 1.3642F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.672F, 0.0F, 0.0F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.1F, 1.4627F, -8.1411F);
        this.jaw.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);


        this.bone11 = new ModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.bone2.addChild(bone11);
        this.setRotateAngle(bone11, -0.2182F, 0.0F, 0.0F);


        this.bone24 = new ModelRenderer(this);
        this.bone24.setRotationPoint(0.1F, 1.4627F, -8.1411F);
        this.jaw.addChild(bone24);
        this.setRotateAngle(bone24, 0.1745F, 0.0F, 0.0F);


        this.bone25 = new ModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.bone24.addChild(bone25);
        this.setRotateAngle(bone25, -0.2182F, 0.0F, 0.0F);

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
