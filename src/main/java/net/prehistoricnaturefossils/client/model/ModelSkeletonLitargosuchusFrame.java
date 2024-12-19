package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLitargosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer backLeftLeg4;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer backRightLeg4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontLeftLeg4;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer frontRightLeg4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonLitargosuchusFrame() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -12.8F, -1.0F, 1, 13, 1, -0.31F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, -10.0F, -0.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.5F, -1.0F, -0.5F, 1, 3, 1, -0.31F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.9F, -11.0F, -10.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.5F, -2.0F, -0.5F, 1, 4, 1, -0.31F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.9F, -11.0F, -10.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, 0.0F, -0.5F, 1, 11, 1, -0.31F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -12.35F, 1.0F);
        this.fossil.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 36, 9, -0.5F, -0.5F, -3.4F, 1, 1, 5, -0.3F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.1114F, 0.5363F, -1.6339F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1745F, 0.0F, -0.1309F);


        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0464F, 5.5022F, 0.5442F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 1.1558F, -0.0181F, 0.1193F);


        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.1931F, 5.3866F, 0.3901F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -1.0036F, 0.0F, 0.0F);


        this.backLeftLeg4 = new ModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 2.5939F, 0.0386F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, 0.5498F, 0.0F, 0.0F);


        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.1114F, 0.5363F, -1.6339F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.0436F, 0.0F, 0.1309F);


        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.0464F, 5.5022F, 0.5442F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 1.1994F, 0.0181F, -0.1193F);


        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-0.1931F, 5.3866F, 0.3901F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.48F, 0.0F, 0.0F);


        this.backRightLeg4 = new ModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 2.5939F, 0.0386F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, 0.8988F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.425F, 1.4F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0318F, 0.0771F, -0.1369F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 11, -0.5F, -0.1034F, -0.4224F, 1, 1, 7, -0.3F, false));
        this.tail.cubeList.add(new ModelBox(tail, 25, 17, -0.5F, -0.1034F, 5.9776F, 1, 1, 1, -0.3F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2801F, 6.552F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0685F, -0.2231F, 0.0736F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 29, -0.5F, 0.109F, -0.2129F, 1, 1, 7, -0.3F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1162F, 6.5678F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1963F, -0.3684F, -0.1224F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, -0.5F, -0.0246F, -0.564F, 1, 1, 8, -0.3F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 17, -0.5F, -0.0246F, 6.836F, 1, 1, 1, -0.3F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1015F, 7.4871F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0395F, -0.3167F, -0.1017F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.1174F, -0.2992F, 1, 1, 9, -0.3F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -3.225F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.2395F, -0.2924F, -0.0995F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.1951F, -7.3528F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 27, -1.5F, -0.1064F, 6.8633F, 1, 1, 1, -0.3F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -1.5F, -0.1064F, 0.4633F, 1, 1, 7, -0.3F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1968F, -6.479F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.2252F, -0.1181F, 0.0714F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.4052F, -4.3307F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 36, -0.5F, -0.4F, 0.8F, 1, 1, 4, -0.3F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.3954F, 2.3012F, -2.0491F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0814F, -0.1706F, -0.056F);


        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.5471F, 3.4215F, 0.118F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -1.0469F, 0.0664F, 0.0462F);


        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.04F, 4.5479F, -0.2442F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.4282F, -0.0079F, -0.0112F);


        this.frontLeftLeg4 = new ModelRenderer(this);
        this.frontLeftLeg4.setRotationPoint(-0.0157F, 2.391F, 0.2084F);
        this.frontLeftLeg3.addChild(frontLeftLeg4);
        this.setRotateAngle(frontLeftLeg4, 1.423F, -0.0223F, -0.0068F);


        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.3954F, 2.3012F, -2.0491F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3561F, -0.0468F, 0.0737F);


        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.5471F, 3.4215F, 0.118F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -1.3088F, -0.0674F, -0.0446F);


        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.04F, 4.5479F, -0.2442F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.4669F, -0.0001F, 0.0839F);


        this.frontRightLeg4 = new ModelRenderer(this);
        this.frontRightLeg4.setRotationPoint(0.0157F, 2.391F, 0.2084F);
        this.frontRightLeg3.addChild(frontRightLeg4);
        this.setRotateAngle(frontRightLeg4, 0.9867F, 0.0223F, 0.0068F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.7911F, -3.4403F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1907F, -0.3053F, -0.0083F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.4178F, -2.4449F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 41, -1.0F, 0.0487F, -0.7535F, 1, 1, 4, -0.3F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1141F, -2.5261F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2954F, -0.4606F, -0.1773F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.1037F, -2.6688F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2443F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 38, -1.0F, 0.1961F, 0.2057F, 1, 1, 3, -0.3F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4795F, -1.9514F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2184F, 0.0416F, 0.0131F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.3769F, -0.1018F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5061F, 0.0F, 0.0F);

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
