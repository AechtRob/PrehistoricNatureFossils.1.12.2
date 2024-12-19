package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDorudonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body5;
    private final ModelRenderer body4;
    private final ModelRenderer body3;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;

    public ModelSkeletonDorudonFrame() {
        this.textureWidth = 77;
        this.textureHeight = 77;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -16.1819F, -17.8833F);
        this.fossil.addChild(chest);
        this.setRotateAngle(chest, -0.1807F, 0.0653F, 0.3431F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.8926F, -1.4857F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -0.3403F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 24, -0.5F, -0.5F, -5.0F, 1, 1, 10, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.9551F, -2.3496F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.2305F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 29, -0.5F, 0.0F, 0.7F, 1, 1, 6, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.4854F, -9.7706F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3403F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 29, -0.5F, -0.908F, 4.84F, 1, 2, 6, 0.003F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0624F, -0.0171F);
        this.chest.addChild(body6);
        this.setRotateAngle(body6, 0.2095F, -0.0517F, 0.0336F);
        this.body6.cubeList.add(new ModelBox(body6, 22, 0, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3905F, 5.8543F);
        this.body6.addChild(body);
        this.setRotateAngle(body, -0.1531F, -0.0728F, 0.0994F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 11, -0.5F, 0.0F, -8.0F, 1, 2, 7, 0.008F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.4017F, 6.9651F);
        this.body.addChild(body5);
        this.setRotateAngle(body5, 0.1923F, -0.2183F, 0.0678F);
        this.body5.cubeList.add(new ModelBox(body5, 20, 20, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.0759F, 5.7934F);
        this.body5.addChild(body4);
        this.setRotateAngle(body4, 0.1638F, -0.1729F, 0.0303F);
        this.body4.cubeList.add(new ModelBox(body4, 37, 20, -0.5F, 0.0F, 0.1F, 1, 2, 5, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.105F, 4.9524F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, 0.1935F, -0.1338F, 0.062F);
        this.body3.cubeList.add(new ModelBox(body3, 1, 21, -0.5F, -0.1F, 0.0F, 1, 2, 6, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1393F, 5.9321F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.2597F, -0.2029F, 0.0797F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.5656F, -8.4997F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, -1, -0.5F, 0.8488F, 8.6474F, 1, 2, 6, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 1.3634F, 4.9213F);
        this.body2.addChild(hips);
        this.setRotateAngle(hips, 0.1344F, -0.3693F, 0.0445F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.1284F, 2.5256F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5708F, 0.4451F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 31, 0.6F, -0.5F, -2.0F, 1, 1, 4, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0106F, 2.5048F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1257F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 33, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.21F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.1F, 0.4F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4451F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 29, -0.5F, 0.9014F, 0.2389F, 1, 2, 6, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.4536F, 5.5845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.6398F, -0.176F, 0.1296F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 8, -0.5F, 0.8F, 0.3F, 1, 2, 5, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0398F, 4.9211F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3613F, -0.2134F, 0.1066F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 30, -0.5F, 0.8F, 0.4F, 1, 2, 6, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0921F, 6.2F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.4426F, -0.3027F, 0.0411F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.6F, -0.1F, 1, 1, 9, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.6879F, 4.3376F, 2.2271F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.3023F, -0.2186F, -0.3126F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.5009F, -0.2945F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.829F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1566F, 1.4322F, -0.3554F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 1.8441F, 0.5325F, -1.4981F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.6879F, 4.3376F, 2.2271F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3522F, 0.2186F, 0.3126F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.5009F, -0.2945F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.829F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1566F, 1.4322F, -0.3554F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 1.8441F, -0.5325F, 1.4981F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.1F, 5.6739F, -0.9915F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.4799F, 0.0756F, -1.0455F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 2.0968F, 0.7683F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.6109F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 2.775F, 0.4115F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.384F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.1F, 5.6739F, -0.9915F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2223F, -0.8136F, 1.1313F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 2.0968F, 0.7683F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.5672F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 2.775F, 0.4115F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.384F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.658F, -5.1829F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.6981F, 0.3341F, 0.103F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.2131F, -5.7998F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 53, -0.5F, 0.6F, 3.5F, 1, 2, 2, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2519F, -2.0121F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5695F, -4.6993F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 48, -0.5F, -0.1F, 3.8F, 1, 2, 1, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.288F, -2.2394F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.6768F, 0.2058F, 0.1137F);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(2.2F, 0.4933F, -1.5002F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-2.2F, 0.4933F, -1.5002F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, -0.2494F, 0.3182F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.2566F, 0.0F, 0.0F);

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
