package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFukuisaurusFrame extends ModelBase {
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
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer jaw;

    public ModelSkeletonFukuisaurusFrame() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 29.0F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.0F, 0.0F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.5F, -17.2F, -13.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.6F, -1.8F, -0.5F, 1, 14, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -17.2F, -13.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.8F, -6.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -16.0F, 0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -7.1F, -6.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -22.8608F, 3.6127F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0262F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 8, -0.5F, 1.4926F, -0.3693F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.1448F, -2.7216F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.4619F, -0.391F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8203F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.4198F, 0.2411F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6417F, 0.0393F, -0.0046F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.8044F, -0.4591F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1484F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -1.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2618F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.1448F, -2.7216F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.829F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.4619F, -0.391F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 2.042F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.4198F, 0.2411F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.4661F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.8044F, -0.4591F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.6755F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -1.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3927F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9316F, 1.1687F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0723F, -0.2611F, 0.0187F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 29, -0.5F, 0.0234F, 4.1205F, 1, 1, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4766F, 3.9205F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 35, -0.5F, 0.7F, -4.5F, 1, 1, 5, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0841F, 8.9197F);
        this.tail.addChild(tail6);
        this.setRotateAngle(tail6, -0.1051F, -0.0868F, 0.0091F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0075F, 0.0008F);
        this.tail6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5084F, 0.1027F, -0.1318F, 1, 1, 8, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2274F, 7.8994F);
        this.tail6.addChild(tail2);
        this.setRotateAngle(tail2, 0.0361F, 0.2616F, 0.0094F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2999F, -0.0157F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, 9, -0.4998F, 0.2025F, -0.4389F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.765F, 7.8853F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0983F, 0.2171F, 0.0212F);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 0, -0.4953F, 0.3719F, -0.1198F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.049F, 3.8892F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0709F, 0.1741F, -0.0123F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.4883F, 0.4029F, -0.2395F, 1, 1, 4, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.9791F, 3.8696F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1056F, 0.1302F, -0.0138F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 36, -0.4792F, -0.5914F, -0.3683F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.088F, 0.1304F, 0.0115F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.6F, -11.8F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2705F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 36, -0.5F, 0.6514F, 1.8985F, 1, 1, 4, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1F, -6.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 20, -0.5F, 0.7499F, -0.194F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.3F, -9.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0352F, 0.2178F, -0.0132F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.3F, -5.5F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4451F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 16, -0.5F, 0.689F, -0.02F, 1, 1, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.9183F, 5.5336F, -3.9724F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6981F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.4064F, 5.409F, 1.8476F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8217F, 0.4728F, -0.1272F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2F, 5.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.0605F, 0.3156F, -0.1689F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.9599F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.9183F, 5.5336F, -3.9724F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0873F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.4064F, 5.409F, 1.8476F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3889F, -0.4728F, 0.1272F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2F, 5.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2086F, -0.3228F, -0.4311F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.9599F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 2.7029F, -5.2177F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.5149F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.2623F, -3.4861F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4887F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 6, -1.0F, 0.617F, 0.3615F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 1.3488F, -2.3068F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1047F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.1683F, -3.6789F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 41, -0.5F, -0.8648F, -0.1785F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8683F, -2.7789F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.5411F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.3626F, -3.5573F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4712F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 52, -0.5F, 1.7F, 1.9F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.115F, -2.4679F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1738F, 0.1076F, 0.1506F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2443F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 47, -0.5F, 0.416F, 0.7966F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8087F, -2.0979F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 1.0314F, 0.0449F, 0.0749F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.1841F, -6.5421F);
        this.head.addChild(bone);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.0002F, 1.6541F, -1.0866F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0874F, -0.0016F, 0.0113F);

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
