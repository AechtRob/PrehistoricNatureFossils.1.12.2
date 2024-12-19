package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEdmontosaurusFrame extends ModelBase {
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
    private final ModelRenderer bone;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer bone2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer heads;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r15;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;

    public ModelSkeletonEdmontosaurusFrame() {
        this.textureWidth = 165;
        this.textureHeight = 165;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -44.0F, 3.7F, 1, 50, 1, -0.05F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(11.2F, -40.5F, -31.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.9F, -1.5F, -0.5F, 1, 48, 1, -0.05F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(11.2F, -40.5F, -31.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -10.0F, -8.0F, -0.5F, 1, 13, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -39.0F, 4.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.5F, -9.0F, -0.5F, 1, 17, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -40.9787F, 6.1958F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2094F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.4F, -5.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 0, -0.5F, 0.9F, 0.0F, 1, 2, 13, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, -0.3118F, -1.1366F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.288F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 21.0573F, -1.5592F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.48F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 20.4675F, -2.8413F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.2043F, -0.0455F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3665F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.leftLeg4.addChild(leftLeg5);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg.addChild(bone);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, -0.3118F, -1.1366F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1484F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 21.0573F, -1.5592F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5236F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 20.4675F, -2.8413F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.48F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.2043F, -0.0455F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3229F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.rightLeg4.addChild(rightLeg5);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg.addChild(bone2);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.8F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0358F, -0.218F, 0.0077F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.6661F, -0.1274F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 25, -0.5F, -0.4F, -14.9F, 1, 2, 15, -0.003F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.5634F, -14.8779F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0704F, -0.1306F, 0.0092F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.3282F, 0.8616F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 43, -0.5F, 1.0F, -10.1F, 1, 2, 9, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, 2.2981F, -8.6045F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.0648F, -0.0883F, -0.0415F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.9413F, -5.4164F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5061F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 107, 107, -0.5F, 0.9552F, -0.0381F, 1, 2, 6, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.5413F, -8.7164F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.8203F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 120, 59, -0.5F, 0.9135F, -0.1546F, 1, 2, 5, -0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 10.9914F, -11.5425F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7679F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 103, 59, -0.5F, -1.0025F, -0.1586F, 1, 2, 6, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.4491F, 18.5041F, -9.2527F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9264F, 0.1952F, -0.1478F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.014F, 10.0756F, 2.4052F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.4057F, 0.3693F, -0.1353F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0583F, 12.1999F, -0.2572F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1745F, 0.2709F, 0.6063F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0365F, 0.3564F, 0.6637F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.3927F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.4491F, 18.5041F, -9.2527F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.7082F, -0.1952F, 0.1478F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.014F, 10.0756F, 2.4052F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0602F, -0.3693F, 0.1353F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0583F, 12.1999F, -0.2572F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.5863F, -0.285F, -0.5167F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0365F, 0.3564F, 0.6637F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.3927F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 9.8413F, -12.0164F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.2787F, -0.15F, -0.0472F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.6772F, -3.6376F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5411F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 116, 27, -0.5F, -1.0F, -0.6F, 1, 2, 6, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.5772F, -3.9376F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.6272F, -0.2136F, -0.1525F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.7F, -5.6F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 100, -0.5F, -0.9487F, -1.2339F, 1, 2, 7, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.7875F, -5.5123F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.4183F, -0.3579F, 0.0337F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.6263F, -7.1488F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6807F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 99, 0, -0.5F, 0.6982F, 3.1419F, 1, 2, 7, -0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.9832F, -5.381F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.5528F, -0.4763F, 0.1444F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.2867F, -3.4451F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 147, 10, 0.0F, 0.9912F, -2.0576F, 1, 2, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.7867F, -1.2451F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2967F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 92, 130, 0.0F, 0.2F, -1.9F, 1, 2, 4, 0.0F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -1.143F, -5.2379F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.0785F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.5F, 9.3813F, -16.6358F);
        this.heads.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.5F, 9.3813F, -16.6358F);
        this.heads.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.3774F, 1.1854F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.6981F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.6F, 7.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1051F, 0.0868F, -0.0091F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.9126F, -0.1321F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.5F, -1.0F, 0.0F, 1, 2, 22, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1266F, 21.8598F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1152F, 0.1734F, -0.02F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 64, -0.5F, 0.4F, 0.0F, 1, 2, 13, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1392F, 0.346F, -0.0475F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 25, -0.5F, 0.4F, 0.0F, 1, 2, 19, -0.003F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 19.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1347F, 0.4329F, 0.0568F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 60, -0.5F, 0.0F, -0.1F, 1, 2, 13, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 12.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1584F, 0.1293F, 0.0206F);
        this.tail5.cubeList.add(new ModelBox(tail5, 77, 25, -0.5F, 0.1938F, -0.5782F, 1, 1, 10, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0716F, 8.7529F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0528F, 0.1307F, 0.0069F);
        this.tail6.cubeList.add(new ModelBox(tail6, 43, 43, -0.5F, 0.1F, 0.2F, 1, 1, 15, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.0999F, 15.0035F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0806F, 0.5222F, -0.0403F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 47, -0.5F, 0.1396F, -0.1976F, 1, 1, 15, -0.15F, false));

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
