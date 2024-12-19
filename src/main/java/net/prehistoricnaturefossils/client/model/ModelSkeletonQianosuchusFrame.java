package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonQianosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer main;
    private final ModelRenderer cube_r2;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonQianosuchusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -12.0F, 7.9F, 1, 12, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -12.8F, -4.8F, 1, 13, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.0F, -4.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 3.5F, -4.0F, -0.5F, 1, 7, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.1F, -3.0F, 12.2F, 1, 5, 1, -0.15F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.25F, -6.25F, 5.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0436F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -7.1F, -0.8F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 0, -0.5F, 0.6F, -0.05F, 1, 1, 6, -0.15F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.9F, -5.4F, 3.25F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, 0.1309F, 0.0F, 0.0F);


        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 6.0111F, -0.4099F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.3927F, 0.0F, 0.0F);


        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 6.2791F, 0.6847F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.48F, 0.0F, 0.0F);


        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.9F, -5.4F, 3.25F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.5236F, 0.0F, 0.0F);


        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 6.0111F, -0.4099F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6109F, 0.0F, 0.0F);


        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 6.2791F, 0.6847F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.0873F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -6.4F, 5.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0982F, 0.0929F, -0.2388F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 25, -0.5F, 0.1497F, -0.5375F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0504F, 6.1581F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0487F, -0.387F, 0.0687F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -0.5F, 0.2362F, -0.1603F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3556F, 6.8133F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0813F, -0.261F, 0.021F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 8, -0.5F, 0.5564F, -0.301F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4564F, 8.999F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0911F, -0.2052F, -0.1897F);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 10, -0.5F, 0.0F, 0.2F, 1, 1, 7, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 6.6F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1548F, -0.5618F, -0.083F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 30, -0.5F, 0.5F, -0.1F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -6.825F, -0.75F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1051F, -0.0868F, -0.0091F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.1972F, -5.9158F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 19, -0.5F, 0.749F, 0.2052F, 1, 1, 6, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2972F, -10.9158F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 34, -0.5F, 0.5F, -0.5F, 1, 1, 6, -0.15F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.35F, 3.9362F, -9.2576F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0436F, 0.0F, 0.0F);


        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(-0.5F, 3.7931F, 0.4294F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.8727F, 0.0F, 0.0F);


        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 5.3398F, -0.0545F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.9599F, 0.0F, 0.0F);


        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-3.35F, 3.9362F, -9.2576F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.7418F, 0.0F, 0.0F);


        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.5F, 3.7931F, 0.4294F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9163F, 0.0F, 0.0F);


        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 5.3398F, -0.0545F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1309F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.9263F, -10.8942F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0115F, -0.1304F, -0.088F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.3327F, -4.5847F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 35, -0.5F, 0.0391F, -0.2142F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2459F, -4.5216F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1733F, -0.267F, 0.0812F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5412F, -3.8904F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 35, -0.5F, 0.6388F, -0.1082F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2118F, -3.8631F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.31F, -0.2595F, -0.035F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1706F, -3.5274F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 13, -0.5F, 0.2F, -0.5F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0894F, -4.2057F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1304F, -0.0114F, 0.0865F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0988F, 1.2264F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4573F, 0.013F, -0.0692F);

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
