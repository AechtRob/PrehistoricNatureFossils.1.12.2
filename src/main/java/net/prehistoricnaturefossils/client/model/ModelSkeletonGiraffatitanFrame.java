package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGiraffatitanFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail8;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail9;
    private final ModelRenderer tail10;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail11;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail12;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail13;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck9;
    private final ModelRenderer neck10;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck11;
    private final ModelRenderer neck12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck16;
    private final ModelRenderer cube_r18;
    private final ModelRenderer head2;
    private final ModelRenderer bone;
    private final ModelRenderer bone9;
    private final ModelRenderer jaw2;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightHand;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftFoot2;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightFoot2;

    public ModelSkeletonGiraffatitanFrame() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.0F, -58.0F, 30.8F, 1, 58, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -80.5F, -20.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0349F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.9F, -36.5F, -0.5F, 1, 117, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -80.5F, -20.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.2F, -21.0F, -0.5F, 1, 44, 1, 0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -85.0F, 31.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 30.5F, -12.0F, -0.5F, 1, 25, 1, 0.002F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 1.45F, -25.0F);
        this.fossil.addChild(root);


        this.hips2 = new ModelRenderer(this);
        this.hips2.setRotationPoint(-0.5F, -62.5F, 57.0F);
        this.root.addChild(hips2);
        this.setRotateAngle(hips2, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0111F, -3.4302F);
        this.hips2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4712F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 68, -1.5F, -1.1232F, -6.2257F, 4, 5, 20, -0.003F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.5F, 3.25F, 8.2F);
        this.hips2.addChild(tail8);
        this.setRotateAngle(tail8, -0.1264F, 0.2598F, -0.0326F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.7F, 1.3F);
        this.tail8.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 135, -0.5F, 0.5409F, -1.4913F, 3, 4, 14, 0.0F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 1.95F, 13.375F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.3155F, -0.2494F, 0.0804F);
        this.tail9.cubeList.add(new ModelBox(tail9, 159, 33, -1.5F, -0.4555F, -0.0038F, 3, 4, 11, -0.003F, false));

        this.tail10 = new ModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, -0.1555F, 10.7962F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1506F, -0.1726F, 0.0261F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.1614F, -0.3608F);
        this.tail10.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 94, -0.5F, 0.9F, 0.175F, 2, 3, 20, 0.0F, false));

        this.tail11 = new ModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, -1.5614F, 19.6142F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, 0.407F, 0.1605F, 0.0688F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.1357F, 0.602F);
        this.tail11.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 102, 112, 0.0F, 1.1F, -0.925F, 1, 2, 20, 0.0F, false));

        this.tail12 = new ModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 0.2643F, 19.577F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, 0.0177F, 0.1745F, 0.0031F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.8186F, 0.1841F);
        this.tail12.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 89, 0.0F, 0.9F, -0.325F, 1, 1, 21, -0.003F, false));

        this.tail13 = new ModelRenderer(this);
        this.tail13.setRotationPoint(0.0F, -1.0186F, 20.6591F);
        this.tail12.addChild(tail13);
        this.setRotateAngle(tail13, -0.085F, 0.3914F, -0.0325F);
        this.tail13.cubeList.add(new ModelBox(tail13, 51, 89, -0.5F, 0.2063F, -0.4528F, 1, 1, 24, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.5F, -7.5F);
        this.hips2.addChild(body2);
        this.setRotateAngle(body2, 0.0089F, 0.0432F, 0.0061F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -9.2897F, -11.5791F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6021F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 121, 33, -2.5F, 0.6212F, 0.1209F, 4, 5, 14, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -26.2897F, -30.9791F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7069F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 0, -1.5F, 0.9488F, -0.3866F, 4, 5, 27, -0.003F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -24.5F, -32.2F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0349F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -14.7F, -14.65F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6894F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 62, -1.5F, 0.7569F, -0.4948F, 4, 5, 21, 0.0F, false));

        this.neck9 = new ModelRenderer(this);
        this.neck9.setRotationPoint(0.5F, -12.4595F, -16.0816F);
        this.body3.addChild(neck9);
        this.setRotateAngle(neck9, -0.8818F, -0.0198F, 0.0389F);
        this.neck9.cubeList.add(new ModelBox(neck9, 66, 33, -1.5F, -1.5165F, -22.3423F, 3, 5, 23, -0.005F, false));

        this.neck10 = new ModelRenderer(this);
        this.neck10.setRotationPoint(0.0F, -0.4165F, -22.3423F);
        this.neck9.addChild(neck10);
        this.setRotateAngle(neck10, -0.1134F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.75F, -0.5199F, -28.1713F);
        this.neck10.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 0, 0.75F, 1.2F, -0.35F, 2, 4, 29, 0.0F, false));

        this.neck11 = new ModelRenderer(this);
        this.neck11.setRotationPoint(0.0F, 1.4801F, -28.2213F);
        this.neck10.addChild(neck11);
        this.setRotateAngle(neck11, -0.0873F, 0.0F, 0.0F);
        this.neck11.cubeList.add(new ModelBox(neck11, 131, 0, -1.0F, -0.7651F, -14.7846F, 2, 4, 15, -0.002F, false));

        this.neck12 = new ModelRenderer(this);
        this.neck12.setRotationPoint(0.0F, 0.1349F, -14.7846F);
        this.neck11.addChild(neck12);
        this.setRotateAngle(neck12, 0.0872F, 0.0438F, 0.0038F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.25F, -2.4846F, -28.7085F);
        this.neck12.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 34, 0.25F, 1.0F, -0.15F, 2, 4, 29, 0.0F, false));

        this.neck13 = new ModelRenderer(this);
        this.neck13.setRotationPoint(0.0F, -0.8846F, -28.7585F);
        this.neck12.addChild(neck13);
        this.setRotateAngle(neck13, 0.3056F, 0.0433F, 0.0057F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.25F, -2.2886F, -14.5954F);
        this.neck13.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 81, 135, 0.25F, 0.7F, -0.05F, 2, 3, 15, -0.002F, false));

        this.neck14 = new ModelRenderer(this);
        this.neck14.setRotationPoint(0.0F, -0.5886F, -14.5954F);
        this.neck13.addChild(neck14);
        this.setRotateAngle(neck14, 0.192F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.25F, -2.946F, -12.6159F);
        this.neck14.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 153, 122, 0.25F, 0.9F, -0.05F, 2, 3, 13, 0.0F, false));

        this.neck15 = new ModelRenderer(this);
        this.neck15.setRotationPoint(0.0F, -1.696F, -12.7159F);
        this.neck14.addChild(neck15);
        this.setRotateAngle(neck15, 0.4362F, -0.0309F, -0.0534F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.9567F, -10.7093F);
        this.neck15.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2443F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 168, 0, -1.0F, 0.9495F, -0.0719F, 2, 3, 12, -0.002F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.5567F, -18.7093F);
        this.neck15.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 203, 141, -1.0F, 0.85F, -0.05F, 2, 3, 8, 0.0F, false));

        this.neck16 = new ModelRenderer(this);
        this.neck16.setRotationPoint(0.0F, -3.8907F, -18.6933F);
        this.neck15.addChild(neck16);
        this.setRotateAngle(neck16, 0.3927F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -2.3415F, -4.444F);
        this.neck16.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 126, 221, 0.0F, 0.9F, -1.0F, 1, 2, 6, -0.002F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(-0.5F, -2.4062F, -5.11F);
        this.neck16.addChild(head2);
        this.setRotateAngle(head2, 0.2472F, 0.0118F, 0.0477F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -81.5255F, 213.9679F);
        this.head2.addChild(bone);


        this.bone9 = new ModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone9);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.5F, 3.5127F, -0.1909F);
        this.head2.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.8116F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(18.5F, 19.3509F, -14.2686F);
        this.body3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.2967F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(-0.5F, 32.7613F, 0.3716F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, -0.6981F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(1.5F, 21.2963F, -3.8258F);
        this.leftArm5.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4363F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(-17.5F, 19.3509F, -14.2686F);
        this.body3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.2094F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.5F, 32.7613F, 0.3716F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, -1.1345F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-1.5F, 21.2963F, -3.8258F);
        this.rightArm5.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.6545F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(11.0F, 6.5691F, -0.0261F);
        this.hips2.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2618F, 0.0F, 0.0F);


        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.4F, 30.5593F, -0.1397F);
        this.leftLeg5.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.6981F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(1.0F, 20.9319F, 0.7163F);
        this.leftLeg6.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2182F, 0.0F, 0.0F);


        this.leftFoot2 = new ModelRenderer(this);
        this.leftFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.leftFoot.addChild(leftFoot2);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-10.0F, 6.5691F, -0.0261F);
        this.hips2.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.0564F, 0.0258F, 0.0173F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.4F, 30.5593F, -0.1397F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.7418F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-1.0F, 20.9319F, 0.7163F);
        this.rightLeg6.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.4363F, 0.0F, 0.0F);


        this.rightFoot2 = new ModelRenderer(this);
        this.rightFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.rightFoot.addChild(rightFoot2);

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
