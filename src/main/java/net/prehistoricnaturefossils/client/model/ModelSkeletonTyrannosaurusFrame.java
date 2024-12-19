package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTyrannosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonTyrannosaurusFrame() {
        this.textureWidth = 180;
        this.textureHeight = 180;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -46.0F, -1.3F, 1, 46, 1, -0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -35.05F, -36.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.2F, -8.95F, -0.5F, 1, 44, 1, -0.005F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -30.6F, -36.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0521F, 0.0055F, -1.6754F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 0.3F, -6.5F, -0.5F, 1, 15, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -39.5F, -0.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 3.5F, -8.5F, -0.5F, 1, 16, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -46.3771F, -2.6002F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0524F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.25F, -4.7F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 75, -0.5F, -0.9822F, -0.6026F, 1, 5, 14, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.5F, 3.6158F, 2.2847F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.288F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 18.9038F, 2.7796F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.4748F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 19.8568F, -2.4858F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.9803F, -0.8129F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.1745F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.5746F, -2.9368F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.3453F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.5F, 3.6158F, 2.2847F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.8552F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 18.9038F, 2.7796F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5184F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 19.8568F, -2.4858F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.829F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.9803F, -0.8129F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1745F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.5746F, -2.9368F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0038F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 8.6F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2024F, -0.1283F, 0.0262F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.1562F, 0.0709F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 16, 0.0F, -0.9F, 0.1F, 1, 4, 16, 0.005F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -8.0925F, 7.6858F);
        this.tail1.addChild(bone);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.7119F, 15.7733F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1329F, -0.173F, -0.023F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.3933F, 0.9298F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -0.5F, -0.9F, -1.0F, 1, 3, 17, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1933F, 17.0298F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0266F, 0.1745F, 0.0046F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.059F, -0.4024F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 57, -0.5F, 1.1F, 0.2F, 1, 3, 15, 0.005F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.109F, 14.6976F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.124F, 0.1732F, 0.0215F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6459F, 0.1329F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 56, -0.5F, 1.0F, -0.2F, 1, 2, 16, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5041F, 15.9329F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0447F, 0.218F, -0.0097F);
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 37, -0.5F, 0.2052F, -0.3213F, 1, 1, 17, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.5016F, 16.8368F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1162F, 0.2167F, -0.0251F);
        this.tail6.cubeList.add(new ModelBox(tail6, -1, 75, -0.5F, 0.7F, -0.4F, 1, 1, 15, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.1599F, 13.9833F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2376F, 0.1273F, -0.0307F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 37, -0.5F, 0.5386F, -0.0016F, 1, 1, 18, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.131F, -0.0433F, -0.0057F);
        this.body.cubeList.add(new ModelBox(body, 69, 75, -0.5F, -0.669F, -19.9704F, 1, 6, 12, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.669F, -7.8704F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 97, 74, -1.0F, 1.0F, -0.1F, 1, 6, 8, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.069F, -19.8704F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 142, -0.5F, -1.2141F, -0.0945F, 1, 6, 3, 0.005F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -12.0F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 94, -0.5F, -0.9F, 0.0F, 1, 5, 9, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(7.0147F, 13.3333F, -12.7115F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9361F, 0.5526F, -0.2115F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3F, 5.1325F, 0.8904F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.543F, -0.4375F, 0.0278F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8693F, 0.2266F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.0147F, 13.3333F, -12.7115F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.3752F, -0.2618F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3F, 5.1325F, 0.8904F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9732F, 0.2849F, -0.3917F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8693F, 0.2266F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.8219F, -11.4055F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.6791F, 0.1839F, 0.0187F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.7415F, -5.052F);
        this.neck1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3142F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 128, 6, -0.5F, -1.0F, 1.1F, 1, 4, 6, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.5771F, -4.5361F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0175F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.8F, -6.3F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 95, -0.5F, 0.0067F, -0.3097F, 1, 3, 9, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.8572F, -7.4387F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.5918F, -0.1453F, -0.097F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.1315F, -2.0346F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 131, 37, 0.0F, 0.8815F, -4.9683F, 1, 3, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0685F, 1.3654F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 151, 85, 0.0F, 0.5F, -3.4F, 1, 3, 3, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2511F, -7.7344F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1445F, -0.2592F, -0.0373F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.2282F, 1.3923F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5236F, 0.0F, 0.0F);

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
