package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDinocrocutaFrame extends ModelBase {
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
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
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
    private final ModelRenderer leftCanine;
    private final ModelRenderer rightCanine;
    private final ModelRenderer leftCanine2;
    private final ModelRenderer rightCanine2;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer leftCanine3;
    private final ModelRenderer rightCanine3;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonDinocrocutaFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.0F, 13.0F, 1, 19, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.1F, -18.45F, -10.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, -1.55F, -0.5F, 1, 20, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.1F, -18.45F, -10.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.05F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -19.0F, 13.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.7F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.0788F, 10.4604F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.3142F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -0.5F, 0.6014F, 0.0389F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.9264F, 2.5896F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4999F, -0.217F, 0.0232F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.8268F, -0.0612F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.9809F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.6477F, -0.1878F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.4399F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.5459F, 0.6573F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.6894F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.9264F, 2.5896F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2793F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.8268F, -0.0612F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3653F, -0.2137F, 0.0442F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.6477F, -0.1878F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.742F, 0.0012F, 0.004F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.5459F, 0.6573F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.6894F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.7F, -3.5F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.2015F, 0.0855F, -0.0174F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1675F, -13.1658F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 27, -0.5F, 0.6488F, 9.7474F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7069F, -3.6736F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.22F, 0.1278F, -0.0285F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4949F, -5.9528F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -2, 15, -0.5F, 0.3241F, -5.2807F, 1, 1, 6, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5909F, -0.8958F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 8, -0.5F, -0.3F, -4.7F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.7948F, -10.8655F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0175F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0094F, -9.5777F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -0.5F, -1.2785F, 6.84F, 1, 1, 4, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.9F, 3.3294F, -1.6256F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0555F, 0.4412F, 0.0555F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 8.2115F, 2.1039F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.7767F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.1764F, 8.09F, 1.6564F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2443F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.0236F, 3.7946F, 0.37F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.2705F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.9F, 3.3294F, -1.6256F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6981F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 8.2115F, 2.1039F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.0385F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.1764F, 8.09F, 1.6564F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2443F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0236F, 3.7946F, 0.37F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.2531F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.3661F, -3.5483F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.108F, 0.4779F, 0.046F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9638F, -5.7128F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 53, -0.5F, 0.4F, 3.5F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.3943F, -1.9248F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2675F, 0.3271F, 0.0546F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1695F, -4.6993F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 29, -0.5F, -0.5F, 1.1F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5493F, -3.7036F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.0903F, 0.2608F, 0.0233F);
        this.neck3.cubeList.add(new ModelBox(neck3, 39, 0, -0.5F, 0.1068F, -2.456F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0922F, -2.8674F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.4422F, 0.1535F, 0.0354F);


        this.leftCanine = new ModelRenderer(this);
        this.leftCanine.setRotationPoint(1.2887F, 6.6948F, -3.8857F);
        this.head.addChild(leftCanine);
        this.setRotateAngle(leftCanine, -0.0132F, -0.1647F, -0.1461F);


        this.rightCanine = new ModelRenderer(this);
        this.rightCanine.setRotationPoint(-1.2887F, 6.6948F, -3.8857F);
        this.head.addChild(rightCanine);
        this.setRotateAngle(rightCanine, -0.0132F, 0.1647F, 0.1461F);


        this.leftCanine2 = new ModelRenderer(this);
        this.leftCanine2.setRotationPoint(0.7976F, 6.8366F, -4.4388F);
        this.head.addChild(leftCanine2);
        this.setRotateAngle(leftCanine2, -0.3797F, -0.1647F, -0.1461F);


        this.rightCanine2 = new ModelRenderer(this);
        this.rightCanine2.setRotationPoint(-0.7976F, 6.8366F, -4.4388F);
        this.head.addChild(rightCanine2);
        this.setRotateAngle(rightCanine2, -0.3797F, 0.1647F, 0.1461F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.4495F, -5.0505F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.4495F, -5.0505F);
        this.head.addChild(rightFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(1.4F, 1.7856F, 3.4765F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-1.4F, 1.7856F, 3.4765F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 2.0931F, -0.2739F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.3614F, 0.0F, 0.0F);


        this.leftCanine3 = new ModelRenderer(this);
        this.leftCanine3.setRotationPoint(0.0776F, 0.8623F, -6.1163F);
        this.jaw.addChild(leftCanine3);
        this.setRotateAngle(leftCanine3, -0.77F, -0.1235F, -2.6798F);


        this.rightCanine3 = new ModelRenderer(this);
        this.rightCanine3.setRotationPoint(-1.2776F, 0.8623F, -6.1163F);
        this.jaw.addChild(rightCanine3);
        this.setRotateAngle(rightCanine3, -0.77F, 0.1235F, 2.6798F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.7941F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 11, 27, -0.5F, 0.2897F, -0.014F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1897F, 3.586F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.4498F, 0.2368F, -0.1128F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 37, -0.5F, 0.065F, 0.0961F, 1, 1, 3, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1285F, 2.7952F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3102F, 0.2917F, 0.0919F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 37, -0.5F, 0.0855F, -0.5425F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0331F, 2.6833F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4538F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 35, -0.5F, 0.2894F, 0.051F, 1, 1, 3, -0.15F, false));

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
