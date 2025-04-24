package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegaceropsFrame extends ModelBase {
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
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonMegaceropsFrame() {
        this.textureWidth = 124;
        this.textureHeight = 124;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.6F, -21.2F, -17.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3403F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.0F, -4.8F, -0.5F, 1, 26, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(7.6F, -21.2F, -17.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3403F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 1.2F, -5.5F, -0.5F, 1, 13, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -21.5F, 18.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0785F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 1.5F, -6.5F, -0.5F, 1, 13, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -21.5F, 18.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0785F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 1, -0.2F, -6.5F, -0.5F, 1, 28, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -30.3977F, 14.9477F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4451F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 39, -0.5F, 0.9014F, 0.2389F, 1, 2, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(5.7F, 6.6621F, 2.2668F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2531F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 13.1129F, -0.2759F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.829F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.4554F, -0.6588F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.2954F, 0.2929F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.2741F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0304F, -2.6933F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2618F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.7F, 6.6621F, 2.2668F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5323F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 13.1129F, -0.2759F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2217F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.4554F, -0.6588F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.2954F, 0.2929F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.2741F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0304F, -2.6933F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.6981F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.5F, -3.6F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.1251F, -0.2165F, -0.027F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.4F, -13.3F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.6F, 0.8488F, -0.2526F, 1, 2, 14, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, -14.4F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.0175F, -0.0873F, 0.0015F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, -0.5F, 0.0F, -12.0F, 1, 2, 13, 0.003F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.4F, -12.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0524F, -0.0436F, 0.0023F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.2F, -9.5F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 17, -0.5F, -0.908F, 1.84F, 1, 2, 9, 0.003F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.1F, 4.185F, -3.3682F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.2892F, 0.0193F, -0.1295F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(1.7616F, 9.6662F, 2.0035F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.5545F, 0.074F, 0.1081F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.5F, 8.4F, 0.1F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3853F, -0.0809F, -0.0328F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 2.8066F, 0.5533F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.3054F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(0.3F, 3.4019F, 0.5002F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, -0.5236F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.1F, 4.185F, -3.3682F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.1277F, -0.2904F, 0.18F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-1.7616F, 9.6662F, 2.0035F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.2491F, -0.074F, -0.1081F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.5F, 8.4F, 0.1F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.4001F, 0.0809F, 0.0328F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 2.8066F, 0.5533F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.4363F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(-0.3F, 3.4019F, 0.5002F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, -0.0436F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.4F, -7.8F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0685F, -0.3272F, 0.1064F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -4.6F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 52, -0.5F, 0.8F, 0.1F, 1, 2, 5, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.4F, -4.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2256F, -0.2555F, 0.0579F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -4.7F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, -1, 64, -0.5F, -0.1F, 0.4F, 1, 2, 5, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.671F, -3.5963F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -1.3439F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(3.0092F, 1.1018F, -0.8973F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-3.0092F, 1.1018F, -0.8973F);
        this.head.addChild(rightFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(2.8985F, 4.9977F, -1.6377F);
        this.head.addChild(leftOrbit);
        this.setRotateAngle(leftOrbit, 0.0F, 0.0F, 0.1571F);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-2.8985F, 4.9977F, -1.6377F);
        this.head.addChild(rightOrbit);
        this.setRotateAngle(rightOrbit, 0.0F, 0.0F, -0.1571F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.0442F, -0.5742F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.3875F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4726F, 1.7644F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.841F, 0.1468F, -0.162F);
        this.tail.cubeList.add(new ModelBox(tail, 75, 63, -0.5F, 0.6F, 0.3F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3617F, 3.8924F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1134F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 93, 16, -0.5F, 0.1818F, 0.153F, 1, 1, 3, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0855F, 2.8481F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2778F, 0.3367F, 0.0939F);
        this.tail3.cubeList.add(new ModelBox(tail3, 68, 76, -0.5F, 0.1136F, -0.3965F, 1, 1, 4, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 71, 79, -0.5F, 0.1136F, 3.3035F, 1, 1, 1, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0077F, 3.7226F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.5059F, 0.3082F, 0.1665F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 33, -0.5F, 0.1917F, -0.3091F, 1, 1, 7, -0.15F, false));

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
