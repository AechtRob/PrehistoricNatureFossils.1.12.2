package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNicrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer main;
    private final ModelRenderer hip;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer tail6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;

    public ModelSkeletonNicrosaurusFrame() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, -8.9F, -6.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -1.1F, -0.5F, 1, 10, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -8.9F, -6.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.1F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -9.75F, 10.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.25F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.75F, 10.4F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0175F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -1.05F, -0.5F, 1, 11, 1, -0.16F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.5F, -2.0F, 0.0F);
        this.fossil.addChild(main);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(-0.5F, -9.6F, 9.75F);
        this.main.addChild(hip);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1F, -1.95F);
        this.hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 42, -0.5F, 0.55F, -0.1F, 1, 1, 5, -0.15F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.9367F, 2.0782F, 0.5217F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.0269F, -0.0206F, -0.3166F);


        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.1005F, 6.5533F, 0.0486F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6833F, -0.1298F, 0.228F);


        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.1677F, 3.8238F, 1.1485F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.6175F, -0.0358F, 0.0619F);


        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.9367F, 2.0782F, 0.5217F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.5069F, 0.0206F, 0.3166F);


        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.1005F, 6.5533F, 0.0486F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.8142F, 0.1298F, -0.228F);


        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-0.1677F, 3.8238F, 1.1485F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3121F, 0.0358F, -0.0619F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.6872F, 2.5542F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.2436F, -0.2544F, 0.0625F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 19, -0.5F, 0.1957F, 0.1653F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1831F, 6.1715F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0587F, -0.4017F, -0.0981F);
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 42, -0.5F, 0.3638F, -0.1887F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.053F, 4.7604F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.009F, -0.3072F, -0.0805F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -0.5F, 0.3256F, -0.2928F, 1, 1, 7, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 29, -0.5F, 0.3256F, 6.2072F, 1, 1, 1, -0.154F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1328F, 6.8879F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0213F, -0.6108F, -0.0122F);
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 34, -0.5F, 0.1999F, -0.2087F, 1, 1, 6, -0.15F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 39, -0.5F, 0.1999F, 5.4913F, 1, 1, 1, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0982F, 6.0127F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2261F, 0.3837F, 0.0859F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 13, -0.5F, 0.2909F, -0.1042F, 1, 1, 8, -0.15F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 7, 20, -0.5F, 0.2909F, 7.4958F, 1, 1, 1, -0.153F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.5F, -0.2039F, 7.7959F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0567F, 0.3921F, 0.0217F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 0, -1.0F, 0.5F, 0.0F, 1, 1, 11, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3F, -1.85F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.0F, -10.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 6, 0.0F, -0.3F, 0.3F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.2F, -7.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 19, 0.0F, 0.625F, 0.0258F, 1, 1, 7, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.4F, -10.9F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.044F, 0.1308F, -0.0057F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.1079F, -4.0707F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 26, -0.5F, -0.3F, -0.2F, 1, 1, 5, -0.15F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.071F, 3.6929F, -3.3897F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.0834F, 0.3043F, -0.3075F);


        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.3258F, 3.7662F, 0.4296F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.6875F, 0.0317F, 0.3036F);


        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.4269F, 4.3014F, -0.4872F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.7055F, -0.0289F, -0.0272F);


        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-3.071F, 3.6929F, -3.3897F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.7893F, -0.3043F, 0.3075F);


        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.3258F, 3.7662F, 0.4296F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.6862F, -0.0648F, -0.3321F);


        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.4269F, 4.3014F, -0.4872F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, -0.1272F, 0.091F, -0.0343F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4631F, -3.8938F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, 0.073F, 0.3F, 0.105F);
        this.neck.cubeList.add(new ModelBox(neck, 49, 61, -0.5F, 0.3448F, -2.9769F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.029F, -2.8305F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.088F, 0.1304F, 0.0115F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0842F, -3.6464F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 53, -0.5F, 0.4483F, -0.0087F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.0F, -3.65F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.3491F, 0.3054F, 0.0436F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 1.2F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7767F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.5F, -0.5771F, -0.1017F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.5F, -0.5771F, -0.1017F);
        this.head.addChild(rightFace);

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
