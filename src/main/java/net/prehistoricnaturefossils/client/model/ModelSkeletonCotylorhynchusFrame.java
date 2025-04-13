package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCotylorhynchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer main;
    private final ModelRenderer bodyCentreFront;
    private final ModelRenderer bodyCentreFront_r1;
    private final ModelRenderer bodyCentreFront_r2;
    private final ModelRenderer bodyCentreFront_r3;
    private final ModelRenderer shoulder;
    private final ModelRenderer shoulderU_r1;
    private final ModelRenderer shoulderU_r2;
    private final ModelRenderer legFrontL;
    private final ModelRenderer legFrontLLower;
    private final ModelRenderer legFrontLFoot;
    private final ModelRenderer legFrontL2;
    private final ModelRenderer legFrontLLower2;
    private final ModelRenderer legFrontLFoot2;
    private final ModelRenderer neck;
    private final ModelRenderer neck_r1;
    private final ModelRenderer neck_r2;
    private final ModelRenderer head;
    private final ModelRenderer skullTop;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer skullJaw;
    private final ModelRenderer rump;
    private final ModelRenderer rump_r1;
    private final ModelRenderer bodyBack;
    private final ModelRenderer rump_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6_r1;
    private final ModelRenderer tail6;
    private final ModelRenderer tail6_r2;
    private final ModelRenderer legBackL3;
    private final ModelRenderer legBackLLower3;
    private final ModelRenderer legBackLFoot3;
    private final ModelRenderer legBackL2;
    private final ModelRenderer legBackLLower2;
    private final ModelRenderer legBackLFoot2;

    public ModelSkeletonCotylorhynchusFrame() {
        this.textureWidth = 120;
        this.textureHeight = 120;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3F, -17.5F, -17.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0611F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.4F, 1.5F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.3F, -17.5F, -17.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0611F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -9.4F, -7.5F, -0.5F, 1, 16, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -17.5F, 17.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -7.9F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -17.5F, 17.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 1, -0.5F, 3.5F, -0.5F, 1, 14, 1, -0.16F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.5F, -2.0F, -4.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.1134F, 0.0F, 0.0F);


        this.bodyCentreFront = new ModelRenderer(this);
        this.bodyCentreFront.setRotationPoint(0.5F, -17.4581F, 8.7919F);
        this.main.addChild(bodyCentreFront);


        this.bodyCentreFront_r1 = new ModelRenderer(this);
        this.bodyCentreFront_r1.setRotationPoint(1.2F, 0.3839F, -5.4494F);
        this.bodyCentreFront.addChild(bodyCentreFront_r1);
        this.setRotateAngle(bodyCentreFront_r1, -0.0524F, 0.0F, 0.0F);
        this.bodyCentreFront_r1.cubeList.add(new ModelBox(bodyCentreFront_r1, 0, 70, -1.7F, 0.7886F, 0.1331F, 1, 1, 7, -0.1F, false));

        this.bodyCentreFront_r2 = new ModelRenderer(this);
        this.bodyCentreFront_r2.setRotationPoint(1.2F, 0.5839F, -10.4494F);
        this.bodyCentreFront.addChild(bodyCentreFront_r2);
        this.setRotateAngle(bodyCentreFront_r2, 0.0524F, 0.0F, 0.0F);
        this.bodyCentreFront_r2.cubeList.add(new ModelBox(bodyCentreFront_r2, 87, 7, -1.7F, 0.8505F, 0.2367F, 1, 1, 5, -0.1F, false));

        this.bodyCentreFront_r3 = new ModelRenderer(this);
        this.bodyCentreFront_r3.setRotationPoint(0.0F, 2.6F, -16.0999F);
        this.bodyCentreFront.addChild(bodyCentreFront_r3);
        this.setRotateAngle(bodyCentreFront_r3, 0.1745F, 0.0F, 0.0F);
        this.bodyCentreFront_r3.cubeList.add(new ModelBox(bodyCentreFront_r3, 71, 74, -0.5F, -0.1806F, -0.5519F, 1, 1, 7, -0.1F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, 1.369F, -18.517F);
        this.bodyCentreFront.addChild(shoulder);
        this.setRotateAngle(shoulder, 0.0F, 0.0436F, 0.0F);


        this.shoulderU_r1 = new ModelRenderer(this);
        this.shoulderU_r1.setRotationPoint(0.0F, 2.0461F, -4.5278F);
        this.shoulder.addChild(shoulderU_r1);
        this.setRotateAngle(shoulderU_r1, 0.2531F, 0.0F, 0.0F);
        this.shoulderU_r1.cubeList.add(new ModelBox(shoulderU_r1, 70, 0, -0.5F, 0.7872F, -0.429F, 1, 1, 7, -0.1F, false));

        this.shoulderU_r2 = new ModelRenderer(this);
        this.shoulderU_r2.setRotationPoint(0.0F, 4.4461F, -8.9278F);
        this.shoulder.addChild(shoulderU_r2);
        this.setRotateAngle(shoulderU_r2, 0.3229F, 0.0F, 0.0F);
        this.shoulderU_r2.cubeList.add(new ModelBox(shoulderU_r2, 0, 87, -0.5F, -0.0926F, -0.3949F, 1, 1, 5, -0.1F, false));

        this.legFrontL = new ModelRenderer(this);
        this.legFrontL.setRotationPoint(7.9653F, 10.6954F, -4.0368F);
        this.shoulder.addChild(legFrontL);
        this.setRotateAngle(legFrontL, 0.0538F, -0.4353F, -0.0895F);


        this.legFrontLLower = new ModelRenderer(this);
        this.legFrontLLower.setRotationPoint(5.3294F, 1.2591F, 4.2973F);
        this.legFrontL.addChild(legFrontLLower);
        this.setRotateAngle(legFrontLLower, -0.15F, 0.1062F, -0.0407F);


        this.legFrontLFoot = new ModelRenderer(this);
        this.legFrontLFoot.setRotationPoint(1.6716F, 5.9642F, 0.4576F);
        this.legFrontLLower.addChild(legFrontLFoot);
        this.setRotateAngle(legFrontLFoot, 0.1745F, -0.0873F, 0.0436F);


        this.legFrontL2 = new ModelRenderer(this);
        this.legFrontL2.setRotationPoint(-7.9653F, 10.6954F, -4.0368F);
        this.shoulder.addChild(legFrontL2);
        this.setRotateAngle(legFrontL2, -0.1797F, -1.3359F, 0.3496F);


        this.legFrontLLower2 = new ModelRenderer(this);
        this.legFrontLLower2.setRotationPoint(-5.3294F, 1.2591F, 4.2973F);
        this.legFrontL2.addChild(legFrontLLower2);
        this.setRotateAngle(legFrontLLower2, -0.0613F, 0.3052F, 0.3973F);


        this.legFrontLFoot2 = new ModelRenderer(this);
        this.legFrontLFoot2.setRotationPoint(-1.6716F, 5.9642F, 0.4576F);
        this.legFrontLLower2.addChild(legFrontLFoot2);
        this.setRotateAngle(legFrontLFoot2, 0.4829F, 0.6521F, -0.4931F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 3.9186F, -9.9167F);
        this.shoulder.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.3491F, 0.0F);


        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(0.0F, 1.5658F, -3.9073F);
        this.neck.addChild(neck_r1);
        this.setRotateAngle(neck_r1, 0.1745F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 87, 0, 0.0F, -0.2741F, 0.1729F, 1, 1, 5, -0.1F, false));

        this.neck_r2 = new ModelRenderer(this);
        this.neck_r2.setRotationPoint(0.0F, 1.5658F, -2.9073F);
        this.neck.addChild(neck_r2);
        this.setRotateAngle(neck_r2, 0.0436F, 0.0F, 0.0F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 107, 76, 0.0F, -0.3177F, -2.5261F, 1, 1, 2, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.2F, 0.6536F, -5.1125F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);


        this.skullTop = new ModelRenderer(this);
        this.skullTop.setRotationPoint(-1.2F, -0.2F, 0.6F);
        this.head.addChild(skullTop);
        this.setRotateAngle(skullTop, 0.132F, 0.2618F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(-0.5F, -1.1F, -0.9F);
        this.skullTop.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(1.5F, -1.1F, -0.9F);
        this.skullTop.addChild(rightFace);


        this.skullJaw = new ModelRenderer(this);
        this.skullJaw.setRotationPoint(0.5012F, 0.8717F, -0.6978F);
        this.skullTop.addChild(skullJaw);
        this.setRotateAngle(skullJaw, 0.2356F, 0.0F, 0.0F);


        this.rump = new ModelRenderer(this);
        this.rump.setRotationPoint(0.0F, 0.1442F, 1.7994F);
        this.bodyCentreFront.addChild(rump);
        this.setRotateAngle(rump, 0.0F, -0.2182F, 0.0F);


        this.rump_r1 = new ModelRenderer(this);
        this.rump_r1.setRotationPoint(-5.5F, 1.597F, -0.2456F);
        this.rump.addChild(rump_r1);
        this.setRotateAngle(rump_r1, -0.0873F, 0.0F, 0.0F);
        this.rump_r1.cubeList.add(new ModelBox(rump_r1, 21, 68, 5.0F, -0.2129F, -0.2778F, 1, 1, 8, -0.1F, false));

        this.bodyBack = new ModelRenderer(this);
        this.bodyBack.setRotationPoint(-0.5F, 1.397F, 8.2544F);
        this.rump.addChild(bodyBack);


        this.rump_r2 = new ModelRenderer(this);
        this.rump_r2.setRotationPoint(-5.0F, -0.1F, -0.6F);
        this.bodyBack.addChild(rump_r2);
        this.setRotateAngle(rump_r2, -0.1222F, 0.0F, 0.0F);
        this.rump_r2.cubeList.add(new ModelBox(rump_r2, 56, 74, 5.0F, 0.7646F, -0.2715F, 1, 1, 7, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.2F, 5.4F);
        this.bodyBack.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, -0.3054F, 0.0F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -0.6F, -0.1F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.1484F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 23, 57, 0.0F, 0.8053F, 0.1932F, 1, 1, 9, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.1633F, 8.4496F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.3054F, 0.0F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -0.6F, 0.3F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.192F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 27, 45, -0.5F, 0.9203F, 0.0153F, 1, 1, 10, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.3543F, 10.0111F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1396F, 0.3927F, 0.0F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0436F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 58, 19, -0.5F, -2.2F, -0.7F, 1, 1, 9, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.7824F, 8.9393F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0175F, 0.2182F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 64, 64, -0.5F, 0.4F, -0.6F, 1, 1, 9, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0744F, 7.8654F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.3054F, 0.0F);


        this.tail6_r1 = new ModelRenderer(this);
        this.tail6_r1.setRotationPoint(0.0F, 3.0523F, 0.5977F);
        this.tail5.addChild(tail6_r1);
        this.setRotateAngle(tail6_r1, 0.0436F, 0.0F, 0.0F);
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 50, 45, -0.5F, -2.5995F, -0.514F, 1, 1, 9, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.3477F, 8.7977F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0524F, 0.0F, 0.0F);


        this.tail6_r2 = new ModelRenderer(this);
        this.tail6_r2.setRotationPoint(0.0F, 0.1F, 0.1F);
        this.tail6.addChild(tail6_r2);
        this.setRotateAngle(tail6_r2, 0.0873F, 0.0F, 0.0F);
        this.tail6_r2.cubeList.add(new ModelBox(tail6_r2, 45, 0, -0.5F, 0.2844F, -0.2533F, 1, 1, 11, -0.1F, false));

        this.legBackL3 = new ModelRenderer(this);
        this.legBackL3.setRotationPoint(2.1551F, 4.5722F, 2.5434F);
        this.bodyBack.addChild(legBackL3);
        this.setRotateAngle(legBackL3, 0.1026F, -0.0051F, -0.006F);


        this.legBackLLower3 = new ModelRenderer(this);
        this.legBackLLower3.setRotationPoint(5.8629F, 4.5938F, -7.1683F);
        this.legBackL3.addChild(legBackLLower3);
        this.setRotateAngle(legBackLLower3, -0.3923F, -0.0057F, -0.1308F);


        this.legBackLFoot3 = new ModelRenderer(this);
        this.legBackLFoot3.setRotationPoint(1.6311F, 5.4518F, 0.7962F);
        this.legBackLLower3.addChild(legBackLFoot3);
        this.setRotateAngle(legBackLFoot3, 0.4726F, -0.3884F, -0.0542F);


        this.legBackL2 = new ModelRenderer(this);
        this.legBackL2.setRotationPoint(-1.1551F, 4.5722F, 2.5434F);
        this.bodyBack.addChild(legBackL2);
        this.setRotateAngle(legBackL2, 0.079F, 0.9138F, 0.0752F);


        this.legBackLLower2 = new ModelRenderer(this);
        this.legBackLLower2.setRotationPoint(-5.8629F, 4.5938F, -7.1683F);
        this.legBackL2.addChild(legBackLLower2);
        this.setRotateAngle(legBackLLower2, 0.7854F, 0.0F, 0.0F);


        this.legBackLFoot2 = new ModelRenderer(this);
        this.legBackLFoot2.setRotationPoint(-1.6311F, 5.4518F, 0.7962F);
        this.legBackLLower2.addChild(legBackLFoot2);
        this.setRotateAngle(legBackLFoot2, -0.4928F, 0.079F, -0.0687F);

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
