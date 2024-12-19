package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDecennatheriumFrame extends ModelBase {
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftMaxilla;
    private final ModelRenderer rightMaxilla;
    private final ModelRenderer leftFrontossicone;
    private final ModelRenderer rightFrontossicone;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonDecennatheriumFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, 11.2F, 1, 28, 1, -0.17F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(8.8F, -27.0F, -11.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.733F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -10.0F, -0.5F, 1, 37, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.8F, -29.0F, -11.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6969F, 0.0467F, -1.6227F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -5.5F, -0.5F, 1, 14, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -25.5F, 11.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.5F, -4.5F, -0.5F, 1, 9, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -30.0F, 10.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 35, -0.5F, 0.9014F, 0.8389F, 1, 2, 6, -0.16F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.9F, 2.9733F, 3.3561F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0524F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.815F, -0.099F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3963F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.0111F, -1.5073F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0908F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 9.0505F, -0.9549F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.6196F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.3491F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.9F, 2.9733F, 3.3561F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2745F, -0.1681F, 0.0471F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.815F, -0.099F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2654F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.0111F, -1.5073F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0908F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 9.0505F, -0.9549F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.925F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3491F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.4F, -3.5F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.348F, -0.2055F, -0.0739F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.4656F, -13.1997F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 35, -0.5F, 0.8488F, 8.7474F, 1, 2, 5, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7124F, -4.7618F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.2901F, -0.2884F, -0.0468F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 0, -0.5F, 0.0F, -10.0F, 1, 2, 11, 0.008F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.2023F, -10.6837F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.2872F, -0.1633F, -0.0851F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.3854F, -10.0706F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3403F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 26, -0.5F, -0.908F, 4.84F, 1, 2, 6, 0.003F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(6.4F, 8.5973F, -1.2591F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.48F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 7.932F, 2.6305F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.1727F, -0.1611F, -0.0674F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 9.3893F, 1.7239F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7767F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 7.904F, 0.3209F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.6981F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-6.4F, 8.5973F, -1.2591F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 1.0472F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 7.932F, 2.6305F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.2654F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 9.3893F, 1.7239F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.8639F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 7.904F, 0.3209F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.4363F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.4854F, -5.2706F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.1131F, -0.3311F, -0.2863F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0131F, -5.7998F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 34, -0.5F, 0.8F, -0.2F, 1, 2, 6, 0.008F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.4131F, -5.6998F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2464F, -0.2219F, -0.1244F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5695F, -4.6993F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 9, -0.5F, -0.1F, -0.2F, 1, 2, 5, 0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5695F, -4.6993F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.2262F, -0.3153F, -0.1554F);
        this.neck3.cubeList.add(new ModelBox(neck3, 28, 0, -0.5F, -0.1F, -5.9F, 1, 2, 6, 0.008F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -5.0F);
        this.neck3.addChild(head);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(0.8126F, -0.5412F, -3.1566F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, -1.668F, 0.6564F, -1.0893F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-0.8126F, -0.5412F, -3.1566F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, -1.668F, -0.6564F, 1.0893F);


        this.leftMaxilla = new ModelRenderer(this);
        this.leftMaxilla.setRotationPoint(0.0F, 7.9742F, -2.7729F);
        this.head.addChild(leftMaxilla);


        this.rightMaxilla = new ModelRenderer(this);
        this.rightMaxilla.setRotationPoint(0.0F, 7.9742F, -2.7729F);
        this.head.addChild(rightMaxilla);


        this.leftFrontossicone = new ModelRenderer(this);
        this.leftFrontossicone.setRotationPoint(0.6989F, 1.2987F, -4.1355F);
        this.head.addChild(leftFrontossicone);
        this.setRotateAngle(leftFrontossicone, 0.0F, -0.0873F, 0.0F);


        this.rightFrontossicone = new ModelRenderer(this);
        this.rightFrontossicone.setRotationPoint(-0.6989F, 1.2987F, -4.1355F);
        this.head.addChild(rightFrontossicone);
        this.setRotateAngle(rightFrontossicone, 0.0F, 0.0873F, 0.0F);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(0.9F, 1.0856F, -1.9235F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-0.9F, 1.0856F, -1.9235F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 0.3771F, -1.1007F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1345F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.829F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 73, 14, -0.5F, 0.5F, 1.1F, 1, 1, 2, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0347F, 1.9387F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 61, -0.5F, 0.4F, 0.6F, 1, 1, 3, -0.14F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0037F, 2.8952F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 50, -0.5F, 0.4F, -0.1F, 1, 1, 4, -0.15F, false));

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
