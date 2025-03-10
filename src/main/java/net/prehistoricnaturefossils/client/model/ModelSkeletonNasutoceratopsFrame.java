package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNasutoceratopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer leftCheek;
    private final ModelRenderer rightCheek;
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer leftFace;
    private final ModelRenderer browHorn;
    private final ModelRenderer rightFace;
    private final ModelRenderer browHorn2;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLowerbeak;
    private final ModelRenderer rightLowerbeak;
    private final ModelRenderer frill;
    private final ModelRenderer leftFrill;
    private final ModelRenderer rightFrill;

    public ModelSkeletonNasutoceratopsFrame() {
        this.textureWidth = 137;
        this.textureHeight = 140;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -28.9F, 8.0F, 1, 29, 1, -0.15F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 0.6F, -23.8F, -13.2F, 1, 24, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -23.5F, -12.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 4.5F, -6.5F, -0.5F, 1, 12, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -3.5F, -6.5F, 20.7F, 1, 14, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.2F, 9.6F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 1, 0, -0.5F, -3.5695F, -4.6874F, 1, 3, 12, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.407F, 7.1771F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5522F, 0.1222F, -0.0484F);
        this.tail.cubeList.add(new ModelBox(tail, 24, 43, -0.5F, 0.8039F, 0.0069F, 1, 2, 9, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9361F, 8.8961F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3319F, 0.0413F, 0.0142F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 13, -0.5F, -0.1697F, -0.5085F, 1, 2, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9271F, 9.6761F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.6047F, -0.2909F, -0.1957F);
        this.tail3.cubeList.add(new ModelBox(tail3, 53, 12, -0.5F, 0.497F, -1.0166F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2587F, 8.9301F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.204F, -0.3424F, 0.0693F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 43, -0.5F, 0.2313F, -0.3314F, 1, 1, 10, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(5.9F, -1.4832F, -1.5527F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.672F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 13.4081F, -4.3221F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.06F, -0.004F, 0.0088F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 11.3793F, 6.8355F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0262F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0873F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.2793F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-5.9F, -1.4832F, -1.5527F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4974F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 13.4081F, -4.3221F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.1926F, 0.0005F, 0.0072F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 11.3793F, 6.8355F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.2007F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0873F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.0611F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.9194F, -4.923F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2979F, -0.0822F, -0.0292F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5816F, -5.8961F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2531F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 26, -0.5F, -0.0745F, -7.9424F, 1, 3, 8, 0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.6816F, -6.2961F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 55, -0.5F, 1.022F, 0.0672F, 1, 3, 7, 0.008F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6952F, -13.1049F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1664F, 0.0884F, 0.0134F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 5.3667F, -8.9016F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5061F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 16, -0.5F, -0.907F, -1.4667F, 1, 3, 12, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(6.1006F, 9.4675F, -6.6224F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.2531F, 0.0F, -0.1745F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.5043F, 6.7362F, 3.7131F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.1444F, -0.7991F, 1.6517F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.7995F, 7.4704F, -2.5839F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 2.0909F, 0.6331F, -0.3409F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-6.1006F, 9.4675F, -6.6224F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.0785F, 0.0F, 0.1745F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.5043F, 6.7362F, 3.7131F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.6727F, 1.244F, 0.0807F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.7995F, 7.4704F, -2.5839F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 2.0116F, -0.7174F, 0.537F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 5.3801F, -10.1607F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.2177F, 0.1176F, 0.191F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 74, -0.5F, -0.1F, -3.3F, 1, 2, 5, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.4119F, 0.1747F, -0.0029F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 0, -0.5F, -0.7F, -4.8F, 1, 2, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1487F, -5.8739F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.7186F, -0.1504F, -0.0672F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(3.26F, 0.0838F, 0.1911F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.3458F, 0.1033F, 0.1865F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-3.26F, 0.0838F, 0.1911F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.3458F, -0.1033F, -0.1865F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.7296F, 8.1386F, -10.9243F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.2791F, -0.0096F, 0.0336F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.7296F, 8.1386F, -10.9243F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.2791F, 0.0096F, -0.0336F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.1433F, -6.3625F);
        this.head.addChild(leftFace);


        this.browHorn = new ModelRenderer(this);
        this.browHorn.setRotationPoint(0.5452F, -8.5015F, 1.9825F);
        this.leftFace.addChild(browHorn);
        this.setRotateAngle(browHorn, -0.001F, -0.4617F, 1.1609F);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.1433F, -6.3625F);
        this.head.addChild(rightFace);


        this.browHorn2 = new ModelRenderer(this);
        this.browHorn2.setRotationPoint(-0.5452F, -8.5015F, 1.9825F);
        this.rightFace.addChild(browHorn2);
        this.setRotateAngle(browHorn2, -0.001F, 0.4617F, -1.1609F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.6F, 2.9517F, -0.4895F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(-0.9033F, 7.6041F, -1.8655F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.48F, 0.0F, 0.0F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-2.2967F, 7.6041F, -1.8655F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.48F, 0.0F, 0.0F);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -0.8567F, -2.0625F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(0.8451F, -7.3786F, 4.0313F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, -0.0975F, -0.0527F, 0.1038F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-0.8451F, -7.3786F, 4.0313F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, -0.0975F, 0.0527F, -0.1038F);

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
