package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPyrotheriumFrame extends ModelBase {
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
    private final ModelRenderer leftLeg6;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonPyrotheriumFrame() {
        this.textureWidth = 102;
        this.textureHeight = 102;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.0F, 13.3F, 1, 23, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.0F, -18.0F, -12.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -4.0F, -0.5F, 1, 22, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.0F, -18.0F, -12.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.1F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -18.0F, 13.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.5F, -5.5F, -0.5F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.389F, 12.9842F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.9014F, -0.9611F, 1, 2, 7, 0.01F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.9F, 2.6024F, 1.407F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.4363F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.7441F, -1.3073F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9425F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.3F, 6.3384F, -1.1938F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.672F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.3F, 1.9895F, 0.2386F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.48F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.6317F, 1.0072F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.925F, 0.0F, 0.0F);


        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 0.3329F, -3.5045F);
        this.leftLeg5.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.3491F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.9F, 2.6024F, 1.407F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0436F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.7441F, -1.3073F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3752F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.3F, 6.3384F, -1.1938F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.672F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.3F, 1.9895F, 0.2386F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.48F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.6317F, 1.0072F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.925F, 0.0F, 0.0F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 0.3329F, -3.5045F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.3491F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.8596F, -4.2992F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1496F, 0.1295F, 0.0195F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.4656F, -13.1997F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 22, -0.5F, 0.8488F, 8.7474F, 1, 2, 5, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.702F, -4.6624F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1051F, 0.0868F, -0.0091F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 30, -0.5F, 0.0F, -4.0F, 1, 2, 5, 0.008F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.2F, -5.0F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 12, -0.5F, 1.0148F, -6.0846F, 1, 2, 6, 0.008F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 1.4732F, -5.3281F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.5098F, 0.1144F, 0.0637F);
        this.body4.cubeList.add(new ModelBox(body4, 20, 0, -0.5F, 0.2F, -6.2F, 1, 2, 6, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2929F, -5.7994F);
        this.body4.addChild(chest);
        this.setRotateAngle(chest, -0.1056F, 0.1302F, -0.0138F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.3854F, -10.0706F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 21, -0.5F, -0.908F, 4.84F, 1, 2, 6, 0.003F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 5.537F, -3.5797F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.384F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 8.1849F, 3.5351F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.1222F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 5.7969F, 0.0286F);
        this.leftarm2.addChild(leftArm3);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 1.973F, -0.2155F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.2094F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 5.537F, -3.5797F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.1831F, -0.0079F, 0.0429F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 8.1849F, 3.5351F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.733F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 5.7969F, 0.0286F);
        this.rightarm2.addChild(rightArm3);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 1.973F, -0.2155F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.8378F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.4854F, -5.2706F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.4192F, -0.0399F, -0.0178F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0131F, -5.7998F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 55, -0.5F, 0.8F, 2.8F, 1, 2, 3, 0.008F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.1555F, -2.8108F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2024F, 0.1283F, -0.0262F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0305F, -1.6993F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 64, -0.5F, 0.3835F, -0.4594F, 1, 2, 2, 0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0179F, -1.8365F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.2102F, 0.0854F, 0.0182F);
        this.neck3.cubeList.add(new ModelBox(neck3, 1, 44, -0.5F, 0.4F, -4.0F, 1, 1, 4, 0.008F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5334F, -3.7673F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -1.2705F, 0.4067F, -0.3262F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, 7.7298F, -5.0083F);
        this.head.addChild(leftFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(0.9F, 3.1795F, -0.5001F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-0.9F, 3.1795F, -0.5001F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.1838F, 0.0235F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.3631F, 0.0113F, -0.0038F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5958F, -0.1815F, 0.1218F);
        this.tail.cubeList.add(new ModelBox(tail, 67, 27, -0.5F, 0.6F, 0.0F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.031F, 2.9564F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.4969F, 0.3097F, -0.1638F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 64, -0.5F, 0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0037F, 2.8952F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2317F, 0.3405F, -0.0786F);
        this.tail3.cubeList.add(new ModelBox(tail3, 53, 25, -0.5F, 0.5F, -0.2F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1631F, 3.8807F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2225F, 0.5992F, -0.1269F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 39, -0.5F, 0.3807F, -0.324F, 1, 1, 5, -0.15F, false));

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
