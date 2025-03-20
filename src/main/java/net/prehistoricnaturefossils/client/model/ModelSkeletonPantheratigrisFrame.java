package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPantheratigrisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftArm5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightArm5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer sternum;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftThumb;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightThumb;
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
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonPantheratigrisFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.9F, -23.0F, 14.0F, 1, 23, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -18.5F, 14.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 3.3F, -4.5F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -22.0F, -13.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 3.0F, -3.5F, -0.5F, 1, 7, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -22.0F, -13.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.6F, -6.0F, -0.5F, 1, 28, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.9075F, 12.1984F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1396F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, 0.6014F, 0.0389F, 1, 1, 6, -0.153F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.2F, 1.5126F, 2.5223F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.4974F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.2449F, -0.6572F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9338F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.0528F, -0.2661F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.309F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(-0.0384F, 4.5364F, 0.7627F);
        this.leftLeg3.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 1.0559F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.2F, 1.5126F, 2.5223F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.2833F, -0.1677F, -0.0486F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.2449F, -0.6572F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8901F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.0528F, -0.2661F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.2654F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.0384F, 4.5364F, 0.7627F);
        this.rightLeg3.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 1.0996F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.7F, -3.5F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.0698F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1675F, -13.1658F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 32, -0.5F, 0.5487F, 9.6474F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8028F, -3.6452F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.289F, 0.0837F, -0.0248F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4949F, -5.9528F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.3241F, -7.6807F, 1, 1, 8, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5909F, -0.8958F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 10, -0.5F, -0.3F, -4.9F, 1, 1, 6, -0.153F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.203F, -13.7595F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.288F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0094F, -9.5777F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -2, 32, -0.5F, -1.2785F, 6.54F, 1, 1, 5, -0.153F, false));

        this.sternum = new ModelRenderer(this);
        this.sternum.setRotationPoint(0.1359F, 6.2734F, 0.9649F);
        this.chest.addChild(sternum);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.9F, 3.7137F, -3.1594F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0212F, 0.1643F, -0.2594F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 7.8623F, 1.7487F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.7491F, -0.7033F, 0.724F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.1764F, 7.3379F, 1.3658F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2955F, -0.5902F, -0.1678F);


        this.leftThumb = new ModelRenderer(this);
        this.leftThumb.setRotationPoint(-1.2383F, 2.1254F, -0.2606F);
        this.leftArm3.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.1021F, 0.2158F, 1.0023F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.0236F, 3.0605F, 0.0949F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 1.7104F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.9F, 3.7137F, -3.1594F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6258F, -0.6203F, 0.1553F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 7.8623F, 1.7487F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.8689F, 0.5608F, -0.3741F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.1764F, 7.3379F, 1.3658F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1403F, 1.0746F, 0.4786F);


        this.rightThumb = new ModelRenderer(this);
        this.rightThumb.setRotationPoint(1.2383F, 2.1254F, -0.2606F);
        this.rightArm3.addChild(rightThumb);
        this.setRotateAngle(rightThumb, -0.0924F, -0.22F, -1.0467F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0236F, 3.0605F, 0.0949F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 1.5795F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.3783F, -3.4491F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.096F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9639F, -5.7128F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 4, -0.5F, 0.5F, 4.2F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.3943F, -1.9248F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.4637F, 0.2749F, 0.1349F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1695F, -4.6993F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -0.5F, -0.4F, 0.0F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6493F, -4.7036F);
        this.neck.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 60, -0.5F, 0.1068F, -1.656F, 1, 1, 2, -0.153F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.081F, -1.0864F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.3981F, 0.1611F, -0.0674F);


        this.leftCanine = new ModelRenderer(this);
        this.leftCanine.setRotationPoint(0.641F, 5.8486F, -4.6207F);
        this.head.addChild(leftCanine);
        this.setRotateAngle(leftCanine, 0.0595F, -0.093F, -0.2528F);


        this.rightCanine = new ModelRenderer(this);
        this.rightCanine.setRotationPoint(-0.641F, 5.8486F, -4.6207F);
        this.head.addChild(rightCanine);
        this.setRotateAngle(rightCanine, 0.0595F, 0.093F, 0.2528F);


        this.leftCanine2 = new ModelRenderer(this);
        this.leftCanine2.setRotationPoint(0.5976F, 5.8418F, -5.1098F);
        this.head.addChild(leftCanine2);
        this.setRotateAngle(leftCanine2, -0.3797F, -0.1647F, -0.1461F);


        this.rightCanine2 = new ModelRenderer(this);
        this.rightCanine2.setRotationPoint(-0.5976F, 5.8418F, -5.1098F);
        this.head.addChild(rightCanine2);
        this.setRotateAngle(rightCanine2, -0.3797F, 0.1647F, 0.1461F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.4495F, -5.0505F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.4495F, -5.0505F);
        this.head.addChild(rightFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(1.4F, 1.4328F, 2.0323F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-1.4F, 1.4328F, 2.0323F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.2061F, -0.5724F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.5795F, 0.0F, 0.0F);


        this.leftCanine3 = new ModelRenderer(this);
        this.leftCanine3.setRotationPoint(-0.2113F, 1.536F, -6.3325F);
        this.jaw.addChild(leftCanine3);
        this.setRotateAngle(leftCanine3, -1.1202F, 0.0554F, -2.6677F);


        this.rightCanine3 = new ModelRenderer(this);
        this.rightCanine3.setRotationPoint(-0.9887F, 1.536F, -6.3325F);
        this.jaw.addChild(rightCanine3);
        this.setRotateAngle(rightCanine3, -1.1202F, -0.0554F, 2.6677F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.6096F, -0.2163F, 0.1487F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 27, -0.5F, 0.2897F, -0.114F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1897F, 3.586F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3981F, -0.1611F, -0.0674F);
        this.tail2.cubeList.add(new ModelBox(tail2, -1, 38, -0.5F, 0.065F, -0.4039F, 1, 1, 4, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1285F, 2.7952F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1865F, -0.4728F, -0.0857F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 20, -0.5F, 0.1855F, 0.1575F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0132F, 4.6957F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2815F, -0.1258F, -0.0363F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 0, -0.5F, 0.2894F, -0.249F, 1, 1, 5, -0.15F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 23, 4, -0.5F, 0.2894F, 4.451F, 1, 1, 1, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5578F, 4.9631F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.4899F, -0.1932F, -0.102F);
        this.tail5.cubeList.add(new ModelBox(tail5, 11, 33, -0.5F, -0.1759F, -0.1632F, 1, 1, 4, -0.15F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 36, -0.5F, -0.1759F, 3.5368F, 1, 1, 1, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.7505F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 30, 9, -0.5F, -0.2F, -0.3F, 1, 1, 4, -0.155F, false));

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
