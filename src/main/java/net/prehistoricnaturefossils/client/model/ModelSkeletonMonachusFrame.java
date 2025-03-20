package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMonachusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm4;
    private final ModelRenderer leftarm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightarm4;
    private final ModelRenderer rightarm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
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
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftCanine;
    private final ModelRenderer rightCanine;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer leftCanine3;
    private final ModelRenderer rightCanine3;
    private final ModelRenderer bone;

    public ModelSkeletonMonachusFrame() {
        this.textureWidth = 77;
        this.textureHeight = 77;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-7.0F, -5.1791F, -9.1025F);
        this.fossil.addChild(chest);
        this.setRotateAngle(chest, -0.4974F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.8854F, -3.7706F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3578F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 20, -0.5F, 0.4447F, -0.5229F, 1, 1, 2, -0.155F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 18, -0.5F, 0.4447F, 0.2771F, 1, 1, 4, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.8462F, -1.6065F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, -0.3578F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 14, 0.2F, -0.5F, -4.0F, 1, 1, 8, -0.156F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.9728F, -2.3069F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.213F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 20, -0.5F, -0.5F, 0.6F, 1, 1, 2, -0.15F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.1455F, -0.0389F);
        this.chest.addChild(body6);
        this.setRotateAngle(body6, 0.319F, 0.1929F, -0.0285F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.1921F, 1.0781F);
        this.body6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 6, -0.5F, 0.3F, -1.0F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.186F, 3.9776F);
        this.body6.addChild(body);
        this.setRotateAngle(body, -0.1591F, 0.1655F, -0.0706F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4433F, 8.9202F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -0.5F, -0.3F, -9.1F, 1, 1, 4, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1307F, 3.6903F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2233F, 0.2129F, 0.0479F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.2624F, -7.4423F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 11, -0.5F, 0.5488F, 7.5474F, 1, 1, 3, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.2994F, 2.8653F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3452F, 0.1644F, -0.0588F);
        this.body3.cubeList.add(new ModelBox(body3, 22, 18, -0.5F, 0.2F, -0.4F, 1, 1, 4, -0.15F, false));
        this.body3.cubeList.add(new ModelBox(body3, 25, 21, -0.5F, 0.2F, 3.3F, 1, 1, 1, -0.15F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1084F, 0.2603F, -0.028F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 24, -0.5F, 0.2F, 0.0F, 1, 1, 4, -0.15F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1436F, 0.1998F, -0.1578F);
        this.body5.cubeList.add(new ModelBox(body5, 11, 24, -0.5F, 0.2F, -0.3F, 1, 1, 4, -0.15F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 27, -0.5F, 0.2F, 3.4F, 1, 1, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0414F, 3.9235F);
        this.body5.addChild(hips);
        this.setRotateAngle(hips, 0.5411F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4676F, 1.5843F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.5708F, -1.1257F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, -4, -0.1F, 0.2F, -3.5F, 1, 1, 7, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.4473F, 0.1279F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4451F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -0.5F, 0.6014F, 0.1389F, 1, 1, 4, -0.15F, false));

        this.leftarm4 = new ModelRenderer(this);
        this.leftarm4.setRotationPoint(2.5896F, 1.6128F, 2.8807F);
        this.hips.addChild(leftarm4);
        this.setRotateAngle(leftarm4, -1.5722F, 0.1905F, -1.136F);


        this.leftarm5 = new ModelRenderer(this);
        this.leftarm5.setRotationPoint(-0.0084F, 1.8324F, 1.6299F);
        this.leftarm4.addChild(leftarm5);
        this.setRotateAngle(leftarm5, 1.4787F, -0.9407F, 0.5458F);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(-0.2559F, 6.7147F, 0.7899F);
        this.leftarm5.addChild(leftArm6);
        this.setRotateAngle(leftArm6, -0.0744F, 0.001F, -0.1323F);


        this.rightarm4 = new ModelRenderer(this);
        this.rightarm4.setRotationPoint(-2.5896F, 1.6128F, 2.8807F);
        this.hips.addChild(rightarm4);
        this.setRotateAngle(rightarm4, -1.1219F, -0.1138F, 0.7984F);


        this.rightarm5 = new ModelRenderer(this);
        this.rightarm5.setRotationPoint(0.0084F, 1.8324F, 1.6299F);
        this.rightarm4.addChild(rightarm5);
        this.setRotateAngle(rightarm5, 1.5088F, 0.5056F, -0.5013F);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(0.2559F, 6.7147F, 0.7899F);
        this.rightarm5.addChild(rightArm6);
        this.setRotateAngle(rightArm6, -0.0744F, -0.001F, 0.1323F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.491F, 3.6799F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4363F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 30, -0.5F, 0.3098F, -0.2618F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0057F, 2.7985F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 7, 35, -0.5F, 0.3006F, -0.2157F, 1, 1, 3, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0097F, 2.9368F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1134F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 12, -0.5F, 0.2756F, -0.4278F, 1, 1, 4, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.4736F, 3.1263F, -1.6057F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.7222F, 0.465F, -0.0618F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.2779F, 2.3818F, 2.6859F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1989F, -0.2165F, 0.083F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0321F, 3.0053F, 1.48F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.9696F, -0.03F, 0.0837F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.4736F, 3.1263F, -1.6057F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0359F, 0.0566F, 0.8215F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.2779F, 2.3818F, 2.6859F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.0372F, -0.1946F, -0.1214F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0321F, 3.0053F, 1.48F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.9696F, 0.03F, -0.0837F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.2539F, -3.7545F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0715F, -0.2176F, -0.0155F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1313F, 0.0158F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 44, -0.5F, 0.2685F, -1.8645F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0299F, -1.7964F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0049F, -0.0064F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 9, -0.5F, 0.234F, -1.816F, 1, 1, 2, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0049F, -1.9064F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.6109F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 44, -0.5F, 0.3F, -1.8F, 1, 1, 2, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.4F, -1.8F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 21, -0.5F, 0.3F, -1.8F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3382F, -1.7601F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.2865F, -0.3294F, -0.1674F);


        this.leftCanine = new ModelRenderer(this);
        this.leftCanine.setRotationPoint(0.6328F, 4.1225F, -4.2599F);
        this.head.addChild(leftCanine);
        this.setRotateAngle(leftCanine, -0.0278F, -0.093F, -0.2528F);


        this.rightCanine = new ModelRenderer(this);
        this.rightCanine.setRotationPoint(-0.6328F, 4.1225F, -4.2599F);
        this.head.addChild(rightCanine);
        this.setRotateAngle(rightCanine, -0.0278F, 0.093F, 0.2528F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.0495F, -4.4505F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.0495F, -4.4505F);
        this.head.addChild(rightFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(1.2F, 1.0328F, 2.6323F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-1.2F, 1.0328F, 2.6323F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.5818F, -0.7775F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.2305F, 0.0F, 0.0F);


        this.leftCanine3 = new ModelRenderer(this);
        this.leftCanine3.setRotationPoint(-0.2572F, 0.9281F, -4.2069F);
        this.jaw.addChild(leftCanine3);
        this.setRotateAngle(leftCanine3, -1.1202F, 0.0554F, -2.6677F);


        this.rightCanine3 = new ModelRenderer(this);
        this.rightCanine3.setRotationPoint(-0.9428F, 0.9281F, -4.2069F);
        this.jaw.addChild(rightCanine3);
        this.setRotateAngle(rightCanine3, -1.1202F, -0.0554F, 2.6677F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(bone);

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
