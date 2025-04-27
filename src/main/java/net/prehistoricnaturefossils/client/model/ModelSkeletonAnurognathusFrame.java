package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnurognathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftWing;
    private final ModelRenderer leftWing2;
    private final ModelRenderer leftWing3;
    private final ModelRenderer hand;
    private final ModelRenderer leftWing4;
    private final ModelRenderer leftWing5;
    private final ModelRenderer leftWing6;
    private final ModelRenderer rightWing;
    private final ModelRenderer rightWing2;
    private final ModelRenderer rightWing3;
    private final ModelRenderer hand2;
    private final ModelRenderer rightWing4;
    private final ModelRenderer rightWing5;
    private final ModelRenderer rightWing6;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLegMembrane;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer finger;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLegMembrane;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer finger2;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Head;
    private final ModelRenderer lefFace;
    private final ModelRenderer lefFace2;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;

    public ModelSkeletonAnurognathusFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -13.75F, -2.5F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.3127F, 0.2033F, 0.6402F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.3693F, 7.1337F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 1.3265F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 37, -1.0F, -0.5F, -1.5F, 1, 1, 3, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.05F, 6.4F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 38, -0.5F, 0.6996F, 0.0553F, 1, 1, 2, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.25F, 3.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1396F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 8, -0.5F, 0.494F, 2.1549F, 1, 1, 1, -0.15F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 6, -0.5F, 0.494F, -0.5451F, 1, 1, 3, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, 0.3F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 6, -0.5F, 0.2941F, -0.0471F, 1, 1, 3, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5785F, -0.503F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5708F, -1.4661F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 30, -1.5F, 0.1F, -3.5F, 1, 1, 7, -0.16F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.85F, -1.525F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 35, -0.5F, -0.3368F, 0.0448F, 1, 1, 2, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.3F, -2.7F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 51, -0.5F, -0.25F, 0.7F, 1, 1, 1, -0.15F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 51, -0.5F, -0.25F, 0.0F, 1, 1, 1, -0.15F, false));

        this.leftWing = new ModelRenderer(this);
        this.leftWing.setRotationPoint(3.4061F, -0.2488F, -1.5373F);
        this.main.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.2834F, 0.1327F, -1.7233F);


        this.leftWing2 = new ModelRenderer(this);
        this.leftWing2.setRotationPoint(0.2412F, 5.8727F, -0.2435F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, -0.6224F, -0.3717F, -0.1701F);


        this.leftWing3 = new ModelRenderer(this);
        this.leftWing3.setRotationPoint(0.3122F, 8.8961F, -0.1544F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.3552F, 0.0407F, 0.145F);


        this.hand = new ModelRenderer(this);
        this.hand.setRotationPoint(-0.5681F, 2.6135F, -0.4817F);
        this.leftWing3.addChild(hand);
        this.setRotateAngle(hand, 1.1191F, -0.0329F, -2.8332F);


        this.leftWing4 = new ModelRenderer(this);
        this.leftWing4.setRotationPoint(0.1275F, 2.7906F, -0.3423F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -1.0491F, 0.3686F, 0.2225F);


        this.leftWing5 = new ModelRenderer(this);
        this.leftWing5.setRotationPoint(-0.3844F, -0.9491F, 10.6873F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 0.0826F, -0.2075F, -0.0505F);


        this.leftWing6 = new ModelRenderer(this);
        this.leftWing6.setRotationPoint(-0.0697F, -1.7249F, 8.5816F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.4795F, -0.1455F, -0.0965F);


        this.rightWing = new ModelRenderer(this);
        this.rightWing.setRotationPoint(-3.4061F, -0.2488F, -1.5373F);
        this.main.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.4111F, -0.2309F, 1.732F);


        this.rightWing2 = new ModelRenderer(this);
        this.rightWing2.setRotationPoint(-0.2412F, 5.8727F, -0.2435F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, -0.6224F, 0.3717F, 0.1701F);


        this.rightWing3 = new ModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.3122F, 8.8961F, -0.1544F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.3552F, -0.0407F, -0.145F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.5681F, 2.6135F, -0.4817F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, 1.1191F, 0.0329F, 2.8332F);


        this.rightWing4 = new ModelRenderer(this);
        this.rightWing4.setRotationPoint(-0.1275F, 2.7906F, -0.3423F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -1.4505F, 0.0212F, -0.1733F);


        this.rightWing5 = new ModelRenderer(this);
        this.rightWing5.setRotationPoint(0.3844F, -0.9491F, 10.6873F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 0.0826F, 0.2075F, 0.0505F);


        this.rightWing6 = new ModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0697F, -1.7249F, 8.5816F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.4795F, 0.1455F, 0.0965F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.3529F, 0.2138F, 7.2672F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.4728F, 0.0378F, -1.1719F);


        this.leftLegMembrane = new ModelRenderer(this);
        this.leftLegMembrane.setRotationPoint(0.0F, 1.0F, 1.6F);
        this.leftLeg.addChild(leftLegMembrane);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.462F, 4.078F, -0.3473F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4954F, -0.0413F, 0.3525F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.536F, 6.8471F, 0.3961F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 1.2482F, 0.0868F, -0.0091F);


        this.finger = new ModelRenderer(this);
        this.finger.setRotationPoint(-1.0F, 0.5F, 0.3F);
        this.leftLeg3.addChild(finger);
        this.setRotateAngle(finger, -0.288F, 0.103F, -1.2367F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, -0.0133F, -3.6149F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4632F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.3529F, 0.2138F, 7.2672F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1673F, -0.0378F, 1.1719F);


        this.rightLegMembrane = new ModelRenderer(this);
        this.rightLegMembrane.setRotationPoint(0.0F, 1.0F, 1.6F);
        this.rightLeg.addChild(rightLegMembrane);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.462F, 4.078F, -0.3473F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8444F, 0.0413F, -0.3525F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.536F, 6.8471F, 0.3961F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.9864F, -0.0868F, 0.0091F);


        this.finger2 = new ModelRenderer(this);
        this.finger2.setRotationPoint(1.0F, 0.5F, 0.3F);
        this.rightLeg3.addChild(finger2);
        this.setRotateAngle(finger2, -0.288F, -0.103F, 1.2367F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, -0.0133F, -3.6149F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4632F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -2.525F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -1.0406F, -0.0869F, -0.1515F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4543F, -3.819F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5498F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 18, -0.5F, -0.3F, -0.5F, 1, 1, 1, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.3431F, -0.7856F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 0, -0.5F, -0.42F, 0.3604F, 1, 1, 1, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 0, -0.5F, -0.42F, -0.3396F, 1, 1, 1, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2431F, -1.9856F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 24, -0.5F, -0.2782F, -1.7438F, 1, 1, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.1931F, -4.4106F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, 0.7163F, -0.079F, -0.4783F);


        this.lefFace = new ModelRenderer(this);
        this.lefFace.setRotationPoint(-0.4672F, 0.8055F, -1.0576F);
        this.Head.addChild(lefFace);


        this.lefFace2 = new ModelRenderer(this);
        this.lefFace2.setRotationPoint(-0.5329F, 0.8055F, -1.0576F);
        this.Head.addChild(lefFace2);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4741F, -0.2871F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, 1.7017F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0945F, 8.1607F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.2531F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 12, 47, -0.5F, 0.1412F, -0.6958F, 1, 1, 2, -0.15F, false));
        this.tail.cubeList.add(new ModelBox(tail, 12, 47, -0.5F, 0.1412F, 0.4042F, 1, 1, 2, -0.154F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 1.725F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 5, 58, -0.5F, 0.2558F, 0.1913F, 1, 1, 1, -0.15F, false));

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
