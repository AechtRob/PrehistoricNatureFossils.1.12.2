package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMenocerasFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer leftMaxilla;
    private final ModelRenderer leftMaxilla2;
    private final ModelRenderer rightMaxilla;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail4;

    public ModelSkeletonMenocerasFrame() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 4.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.0F, -18.0F, -15.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, -5.0F, -0.5F, 1, 23, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.0F, -18.5F, -15.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6091F, -0.05F, -1.6423F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -5.0F, -0.5F, 1, 10, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -18.2F, 8.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0697F, -0.0055F, -1.5187F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -3.0F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -18.0F, 8.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1047F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -5.7F, -0.5F, 1, 24, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.124F, 8.6628F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.2269F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4451F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 2, -0.5F, 0.6014F, 0.1389F, 1, 1, 5, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 4.4176F, -0.9654F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1571F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.1454F, -1.2122F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9687F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 5.9611F, -0.008F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0908F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.8951F, 2.0967F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 2.0682F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.3491F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 4.4176F, -0.9654F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.0647F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.1454F, -1.2122F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6196F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 5.9611F, -0.008F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.3526F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.8951F, 2.0967F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.8937F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3491F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.7F, -3.5F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.0088F, 0.1309F, -0.0011F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.1675F, -13.1657F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -0.5F, 0.5488F, 6.7474F, 1, 1, 7, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.4248F, -6.5933F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1806F, 0.2577F, -0.0465F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5909F, -0.8958F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.3F, -9.8F, 1, 1, 11, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9932F, -10.7795F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.3835F, 0.2028F, -0.0811F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0094F, -9.5777F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 12, -0.5F, -1.208F, 3.34F, 1, 1, 8, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.5F, 6.3815F, -2.338F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 1.1781F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.2616F, 6.7705F, 2.6352F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.5184F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 6.6F, 0.8F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.3963F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.2F, 4.6494F, 0.4629F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 1.0123F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.5F, 6.3815F, -2.338F);
        this.chest.addChild(rightarm);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.2616F, 6.7705F, 2.6352F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.3439F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 6.6F, 0.8F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.9599F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.2F, 4.6494F, 0.4629F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.7505F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.4459F, -6.2693F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.1047F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9639F, -5.7128F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 63, -0.5F, 0.5F, 3.8F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.007F, -2.025F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1174F, 0.2601F, -0.0303F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5695F, -4.6993F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 50, -0.5F, -0.4F, 4.4F, 1, 1, 1, -0.15F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 49, -0.5F, -0.4F, 2.7F, 1, 1, 2, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5179F, -1.7365F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, -0.1634F, 0.4312F, -0.0688F);
        this.neck3.cubeList.add(new ModelBox(neck3, 38, 53, -0.5F, 0.1068F, -2.756F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2932F, -3.256F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.338F, 0.3095F, 0.409F);


        this.leftMaxilla = new ModelRenderer(this);
        this.leftMaxilla.setRotationPoint(0.0F, 7.8742F, -10.1729F);
        this.head.addChild(leftMaxilla);


        this.leftMaxilla2 = new ModelRenderer(this);
        this.leftMaxilla2.setRotationPoint(0.0F, 7.8742F, -10.1729F);
        this.head.addChild(leftMaxilla2);


        this.rightMaxilla = new ModelRenderer(this);
        this.rightMaxilla.setRotationPoint(0.0F, 7.8742F, -10.1729F);
        this.head.addChild(rightMaxilla);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(0.9F, 0.4736F, 2.2991F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-0.9F, 0.4736F, 2.2991F);
        this.head.addChild(rightOrbit);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.4593F, 5.1082F, -9.3221F);
        this.head.addChild(bone);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-0.4593F, 5.1082F, -9.3221F);
        this.head.addChild(bone2);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.2797F, -1.9798F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.309F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5463F, 0.8301F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.6222F, -0.1782F, 0.1265F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 38, -0.5F, 0.1897F, -0.214F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1897F, 3.586F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2739F, -0.2947F, -0.0814F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 39, -0.5F, -0.035F, -0.4039F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1176F, 3.895F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.6396F, -0.3209F, -0.2304F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9855F, -0.2425F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 14, -0.5F, -0.8F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1425F, 3.7909F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.6229F, -0.4F, -0.2727F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 35, -0.5F, 0.2894F, -0.249F, 1, 1, 4, -0.15F, false));

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
