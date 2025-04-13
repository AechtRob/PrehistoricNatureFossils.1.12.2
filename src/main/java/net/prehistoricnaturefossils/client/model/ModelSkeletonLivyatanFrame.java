package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLivyatanFrame extends ModelBase {
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
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;

    public ModelSkeletonLivyatanFrame() {
        this.textureWidth = 224;
        this.textureHeight = 224;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -18.4609F, -55.701F);
        this.fossil.addChild(chest);
        this.setRotateAngle(chest, 0.0232F, -0.0121F, 0.4798F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 10.0543F, 2.5551F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -0.3054F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 87, 9.0F, -1.0F, -18.5F, 2, 2, 37, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.1239F, 1.1031F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.2654F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 97, -1.0F, 0.0F, 1.5F, 2, 2, 27, -0.006F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.2854F, -5.5706F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 111, -1.0F, 0.8065F, -0.3873F, 2, 4, 13, 0.003F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -1.393F, 6.83F);
        this.chest.addChild(body6);
        this.setRotateAngle(body6, 0.2137F, -0.0762F, -0.061F);
        this.body6.cubeList.add(new ModelBox(body6, 28, 111, -1.0F, -0.4F, -0.3F, 2, 4, 14, 0.009F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.7413F, 13.7215F);
        this.body6.addChild(body);
        this.setRotateAngle(body, -0.1402F, -0.0864F, 0.0122F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.8F, -0.4F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 88, -1.0F, -2.9154F, 0.0794F, 2, 4, 18, 0.008F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.1509F, 16.9254F);
        this.body.addChild(body5);
        this.setRotateAngle(body5, -0.131F, -0.0435F, 0.0038F);
        this.body5.cubeList.add(new ModelBox(body5, 50, 21, -1.0F, -1.4F, 0.0F, 2, 4, 19, 0.009F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.2953F, 18.7348F);
        this.body5.addChild(body4);
        this.setRotateAngle(body4, -0.2999F, -0.115F, 0.1073F);
        this.body4.cubeList.add(new ModelBox(body4, 1, 46, -1.0F, 0.0F, 0.1F, 2, 4, 19, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.9902F, 18.8764F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, -0.2453F, -0.1696F, 0.0706F);
        this.body3.cubeList.add(new ModelBox(body3, 1, 21, -1.0F, -0.85F, 0.0F, 2, 4, 20, 0.009F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.493F, 20.1306F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, -0.01F, -0.1807F, 0.0394F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0656F, -8.4997F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 93, 64, -0.5F, 0.8487F, 8.7474F, 1, 4, 18, 0.012F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.5025F, 17.4822F);
        this.body2.addChild(hips);
        this.setRotateAngle(hips, 0.1061F, -0.2276F, 0.0014F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1F, 0.4F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4451F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 64, -0.5F, 0.9014F, 0.0389F, 1, 4, 19, 0.009F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 8.6562F, 16.6935F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3584F, -0.2316F, 0.0042F);
        this.tail.cubeList.add(new ModelBox(tail, 101, 34, -0.5F, -0.8F, 0.0F, 1, 4, 16, 0.008F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0898F, 15.9733F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0089F, -0.1745F, -0.0015F);
        this.tail2.cubeList.add(new ModelBox(tail2, 65, 129, -0.5F, -0.9F, 0.0F, 1, 4, 12, 0.009F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2449F, 11.7572F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.248F, -0.1693F, -0.0426F);
        this.tail3.cubeList.add(new ModelBox(tail3, 68, 146, -0.5F, -0.3F, -0.4F, 1, 3, 9, 0.007F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2443F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 136, 64, -0.5F, -0.2F, -1.0F, 1, 2, 12, 0.009F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(19.3771F, 18.9206F, 5.6884F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.5895F, 0.1069F, -1.0829F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 8.1511F, 0.1813F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1745F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 6.4838F, 1.9099F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.384F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-19.3771F, 18.9206F, 5.6884F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3529F, -0.1337F, 0.9011F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 8.1511F, 0.1813F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.1745F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 6.4838F, 1.9099F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.384F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.6838F, -5.0159F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.288F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.0744F, -0.277F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.043F, -0.0076F, -0.1744F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.062F, -3.6409F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 171, -1.5F, -2.7679F, -0.0951F, 2, 4, 4, 0.009F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.438F, -5.5409F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3229F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 171, -1.5F, -1.0F, -1.1F, 2, 4, 4, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.6832F, -8.526F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -1.0384F, 0.4668F, -0.1748F);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(3.2F, 11.6405F, -7.4633F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-3.2F, 11.6405F, -7.4633F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 4.4061F, 5.2837F);
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
