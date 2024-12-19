package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJinzhousaurusFrame extends ModelBase {
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
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer neck;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonJinzhousaurusFrame() {
        this.textureWidth = 115;
        this.textureHeight = 115;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -32.0F, 4.5F, 1, 32, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.7F, -19.0F, -16.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.8F, -7.0F, -0.5F, 1, 26, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7F, -19.0F, -16.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -2.5F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -22.0F, 5.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 8.3F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -31.5F, 8.8F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0175F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -0.5F, 0.9926F, -5.2693F, 1, 2, 12, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(5.0F, 0.1534F, -3.7073F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.48F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 14.164F, -0.5551F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9861F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 14.2224F, -3.0953F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2531F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.0F, 0.1534F, -3.7073F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 14.164F, -0.5551F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7679F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 14.2224F, -3.0953F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1345F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3403F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9F, 2.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.143F, -0.216F, 0.0308F);
        this.tail.cubeList.add(new ModelBox(tail, 45, 63, -0.5F, -0.0766F, -0.2972F, 1, 2, 5, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1841F, 4.602F);
        this.tail.addChild(tail6);
        this.setRotateAngle(tail6, -0.0532F, -0.1743F, 0.0092F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4925F, 0.1008F);
        this.tail6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 26, -0.5F, 0.4F, -0.3F, 1, 2, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6925F, 9.0008F);
        this.tail6.addChild(tail2);
        this.setRotateAngle(tail2, 0.0715F, 0.2176F, 0.0155F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1999F, -0.014F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 15, -0.5F, 0.6F, 0.3F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6999F, 9.886F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2436F, 0.2544F, 0.0625F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 41, -0.5F, 0.7712F, -0.2996F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 7.8004F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0371F, 0.3488F, 0.0127F);
        this.tail4.cubeList.add(new ModelBox(tail4, -1, 29, -0.5F, 0.7F, -0.6F, 1, 1, 10, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5F, 8.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2193F, 0.2985F, -0.0655F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.1993F, 0.0262F, 1, 1, 13, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -9.8F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1404F, -0.1303F, -0.0126F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.3133F, -6.8562F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2007F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 0, -1.0F, -0.1139F, -6.8748F, 1, 2, 7, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.8436F, -7.0005F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0611F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 49, -0.5F, 1.0499F, 0.006F, 1, 2, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6564F, -13.4005F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1398F, -0.0871F, -0.0046F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.847F, -6.6248F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4276F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 0, -0.5F, 0.8459F, -2.1103F, 1, 2, 9, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.1502F, 10.6271F, -5.9923F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3353F, 0.2656F, -0.1834F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.4548F, 9.0785F, 3.3365F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9209F, 0.3882F, -0.1248F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2987F, 7.5154F, -1.6481F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1216F, 0.1335F, 0.2675F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.6109F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.1502F, 10.6271F, -5.9923F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4675F, 0.1224F, 0.3568F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.7889F, 8.9909F, 3.5814F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8614F, -0.6724F, -0.1116F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2987F, 7.5154F, -1.6481F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4126F, -0.007F, -0.3584F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.6109F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 3.122F, -8.4547F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.1745F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.682F, -4.0258F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 69, 29, -1.0F, -0.2375F, -0.0515F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 2.025F, -3.8701F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.6529F, -0.5316F, -0.1099F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.3436F, -3.51F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 67, -0.5F, -0.2052F, -0.0547F, 1, 1, 2, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.0436F, -2.01F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3142F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 96, 42, -0.5F, -0.3368F, -0.6394F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5436F, -3.21F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.4618F, -0.3077F, 0.1254F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.5195F, -5.0783F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.6458F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(bone);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 87, -0.5F, 0.316F, 0.7966F, 1, 1, 3, -0.15F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.911F, 3.5428F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.1868F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 57, -0.5F, -0.6445F, -0.299F, 1, 1, 6, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.111F, -1.3428F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.288F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.0006F, 2.7895F, -1.7165F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2532F, -0.0016F, 0.0113F);

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
