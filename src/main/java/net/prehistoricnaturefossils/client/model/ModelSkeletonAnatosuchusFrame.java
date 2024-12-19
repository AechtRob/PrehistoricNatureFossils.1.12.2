package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnatosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer backLeftLeg4;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer backRightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftside;
    private final ModelRenderer rightside;
    private final ModelRenderer horn;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonAnatosuchusFrame() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -9.0F, 2.9F, 1, 9, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.9F, -8.5F, -6.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, -0.5F, -0.5F, 1, 9, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.9F, -8.5F, -6.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.1F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -8.5F, 3.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.0F, -2.5F, -0.5F, 1, 4, 1, -0.15F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -0.2F, -3.25F);
        this.fossil.addChild(main);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -9.75F, 5.9F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2269F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 30, 0.0F, 0.5563F, 0.1637F, 1, 1, 3, -0.15F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.0F, -8.8F, 6.6F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3491F, 0.0F, 0.0F);


        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 4.5394F, -1.5987F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 0.0F);


        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.25F, 4.9365F, 0.4649F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.1745F, 0.0F, 0.0F);


        this.backLeftLeg4 = new ModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.25F, -0.0204F, -1.5008F);
        this.backLeftLeg3.addChild(backLeftLeg4);


        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.0F, -8.8F, 6.6F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.2618F, 0.0F, 0.0F);


        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 4.5394F, -1.5987F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6545F, 0.0F, 0.0F);


        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.25F, 4.9365F, 0.4649F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3491F, 0.0F, 0.0F);


        this.backRightLeg4 = new ModelRenderer(this);
        this.backRightLeg4.setRotationPoint(-0.25F, -0.0204F, -1.5008F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, -0.3927F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.425F, 5.85F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -0.075F, -3.85F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 19, -1.5F, 0.05F, -0.35F, 1, 1, 5, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.body.addChild(body2);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.025F, -0.05F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 24, -1.5F, 0.05F, -3.85F, 1, 1, 4, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.075F, -2.85F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, 0.05F, -4.05F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 9, -2.0F, 0.35F, 0.25F, 1, 1, 3, -0.15F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.5F, 2.8F, -2.45F);
        this.body3.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.2174F, 0.0189F, 0.0852F);


        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.9717F, 0.56F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.5806F, 0.2069F, -0.0822F);


        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 4.5501F, -0.1535F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.8247F, 0.0F, 0.0F);


        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.5F, 2.8F, -2.45F);
        this.body3.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.7418F, 0.0F, 0.0F);


        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.9717F, 0.56F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.8727F, 0.0F, 0.0F);


        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 4.5501F, -0.1535F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1265F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2872F, -3.9962F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, 0.1933F, 0.3694F, 0.226F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0034F, -1.9822F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0262F, -0.0349F, 0.0009F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 19, -0.5F, 0.0736F, -0.1997F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1534F, -1.9322F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.4363F, 0.3491F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.55F, -0.05F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1484F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 33, -1.5F, -0.3263F, -2.0102F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5436F, -1.999F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.149F, -0.0077F, -0.139F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7252F, 0.0537F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2967F, 0.0F, 0.0F);


        this.leftside = new ModelRenderer(this);
        this.leftside.setRotationPoint(0.7143F, -0.3137F, -1.7528F);
        this.head.addChild(leftside);
        this.setRotateAngle(leftside, 0.043F, -0.0076F, 0.1744F);


        this.rightside = new ModelRenderer(this);
        this.rightside.setRotationPoint(-0.7143F, -0.3137F, -1.7528F);
        this.head.addChild(rightside);
        this.setRotateAngle(rightside, 0.043F, 0.0076F, -0.1744F);


        this.horn = new ModelRenderer(this);
        this.horn.setRotationPoint(0.0F, 0.364F, -6.7315F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.1091F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -8.7083F, 8.709F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.5186F, 0.1139F, -0.0647F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, 0.0998F, 0.026F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0953F, 4.8628F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0975F, 0.1737F, -0.0169F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 7, 0.0F, 0.0028F, -0.1325F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0199F, 4.7417F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1264F, 0.2598F, 0.0326F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 2, 0.0F, 0.0045F, -0.4019F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0671F, 2.8764F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3878F, 0.325F, 0.1297F);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 0, 0.0F, 0.1549F, 0.0734F, 1, 1, 5, -0.15F, false));

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
