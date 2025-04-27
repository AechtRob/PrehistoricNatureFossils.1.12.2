package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLitocraniusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
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
    private final ModelRenderer head;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonLitocraniusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 1.3F, -64.0F, 0.1F, 1, 64, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -40.0F, 8.9F, 1, 40, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, -33.5F, 9.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -2.2F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.4F, -33.5F, 0.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -25.5F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -35.7925F, 11.909F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -1.1432F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 35, -0.5F, 0.6F, 0.5F, 1, 1, 4, -0.1F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.1919F, -0.583F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2793F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.4819F, 0.6655F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3526F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 13.9508F, -1.9836F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.576F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 11.6783F, -0.9325F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.117F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, 0.2143F, -5.3932F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.1919F, -0.583F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.4538F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.4819F, 0.6655F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.309F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 13.9508F, -1.9836F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7941F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 11.6783F, -0.9325F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.2043F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, 0.2143F, -5.3932F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.3528F, -3.2386F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.0175F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8F, -6.9F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.9F, -1.4F, 1, 1, 8, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2814F, -7.8925F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.3908F, -0.0903F, -0.1044F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2135F, 0.1404F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 2, -0.5F, 0.5F, -6.1F, 1, 1, 6, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9529F, -5.7577F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0175F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0551F, 0.0564F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 50, -0.5F, 0.4F, -3.1F, 1, 1, 3, -0.1F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5847F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 12, -0.5F, 0.7062F, -6.9914F, 1, 1, 7, -0.1F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.1F, 7.1806F, -6.2392F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.7243F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.4041F, 2.8932F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.6581F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 10.9412F, 1.2244F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.693F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 12.4827F, 0.1882F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.2618F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.1F, 7.1806F, -6.2392F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.5498F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.4041F, 2.8932F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.5272F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 10.9412F, 1.2244F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.8639F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 12.4827F, 0.1882F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.3927F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.9705F, -8.433F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.6818F, -0.0064F, -0.0614F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6F, -1.9F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5061F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 15, -0.5F, -0.2F, 1.7F, 1, 1, 1, -0.1F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 12, -0.5F, -0.2F, -2.1F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9687F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 18, -0.5F, 0.5319F, 3.2279F, 1, 1, 1, -0.1F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 12, -0.5F, 0.5319F, -3.5721F, 1, 1, 7, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.4807F, -3.9276F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.4684F, -0.238F, -0.1709F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.7F, -2.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 5, -0.5F, -2.3753F, -1.1709F, 1, 5, 1, -0.1F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -3.1671F, -3.6119F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 0.9758F, -0.0985F, -0.1443F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 75, -0.5F, -4.0F, -1.3F, 1, 4, 1, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.3154F, -0.5954F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.9604F, -0.025F, 0.0357F);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(1.8329F, -2.4279F, -4.7166F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 0.039F, -0.1033F, -0.6845F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-1.8329F, -2.4279F, -4.7166F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 0.039F, 0.1033F, 0.6845F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6359F, 3.8361F, -8.5986F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6359F, 3.8361F, -8.5986F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2983F, -2.4254F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4622F, 0.7082F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4097F, -0.2815F, 0.1201F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 48, -0.5F, 0.6503F, -0.4853F, 1, 1, 3, -0.1F, false));
        this.tail.cubeList.add(new ModelBox(tail, 28, 50, -0.5F, 0.6503F, 2.3147F, 1, 1, 1, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4319F, -0.2387F, -0.1086F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -0.5F, 0.6598F, -0.5232F, 1, 1, 5, -0.1F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 4, 27, -0.5F, 0.6598F, 4.2768F, 1, 1, 1, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.063F, 4.5763F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.5919F, -0.2188F, -0.1449F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 28, -0.5F, 0.6598F, -0.4232F, 1, 1, 5, -0.1F, false));

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
