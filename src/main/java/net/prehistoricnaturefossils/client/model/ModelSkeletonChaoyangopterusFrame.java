package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonChaoyangopterusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer shape64;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
    private final ModelRenderer rightwing1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;

    public ModelSkeletonChaoyangopterusFrame() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -15.0F, 2.5F, 1, 11, 1, -0.21F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -16.7F, -2.1F, 1, 13, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -16.0F, -1.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.2F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -16.0F, 3.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.5F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -6.4776F, 2.2083F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.5805F, 0.0F, 0.0F);


        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 32, 5, -0.5F, 0.2F, -1.8F, 1, 1, 3, -0.2F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1367F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.4684F, -0.0226F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 20, -1, -0.5F, 0.6F, -0.3F, 1, 1, 5, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1663F, 4.099F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.3604F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 41, 32, -0.5F, 0.2947F, 0.0397F, 1, 1, 2, -0.202F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, 0.2816F, 2.9774F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1195F, -0.1274F, -0.4204F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0266F, 5.7318F, 0.1798F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.0227F, 0.0335F, 0.3905F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1711F, 6.9929F, 0.8682F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.4019F, 0.0788F, -0.0263F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, 0.2816F, 2.9774F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.4914F, 0.1274F, 0.4204F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0266F, 5.7318F, 0.1798F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.0227F, -0.0335F, -0.3905F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1711F, 6.9929F, 0.8682F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.4019F, -0.0788F, 0.0263F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.2925F, -3.1493F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, 0.124F, 0.1732F, 0.0215F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.6734F, 0.5272F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, -0.0437F, 0.0698F, -0.0018F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 31, -1, -0.5F, -0.3219F, -3.9084F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1207F, -2.5762F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3172F, 0.4517F, 0.2035F);
        this.neck2.cubeList.add(new ModelBox(neck2, 11, 29, -0.5F, 0.2F, -3.101F, 1, 1, 3, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0964F, -2.7411F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2134F, 0.099F, -0.0193F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, 0.0929F, -3.8518F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0349F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 13, 17, -0.5F, 0.3124F, -0.2126F, 1, 1, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.002F, 0.1422F, -3.9045F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.9922F, -0.1883F, 0.1206F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0045F, 1.9856F, -1.3203F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0262F, 0.0009F, 0.0001F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3922F, 0.2973F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.7922F, -2.9027F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.6922F, -1.1027F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.004F, -0.1085F, -2.8891F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.lips1 = new ModelRenderer(this);
        this.lips1.setRotationPoint(-0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips1);
        this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2732F);


        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips2);
        this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2732F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.004F, 0.9497F, -0.2847F);
        this.head.addChild(bone);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone2);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.0F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.1227F, 0.0276F, 0.2358F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7549F, 0.1825F, 0.4233F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.232F, 1.0483F, -1.3129F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.0869F, 5.8009F, 0.3333F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3244F, 0.1557F, 0.4534F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.3159F, 6.5818F, -0.136F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.4375F, -0.5083F, -0.3684F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0678F, 0.2873F, 8.3099F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.0885F, 0.162F, 0.2337F);


        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.0413F, -0.1155F, 0.5237F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -2.7434F, -0.0989F, -2.0846F);


        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(1.0649F, -0.8826F, 0.8782F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.0F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.3953F, 0.4053F, -0.1795F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7549F, 0.1825F, 0.4233F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.9542F, -0.8632F, 1.9417F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.0869F, 5.8009F, 0.3333F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3492F, -0.0834F, -0.6608F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.3159F, 6.5818F, -0.136F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.5615F, 0.5239F, 0.6187F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0678F, 0.2873F, 8.3099F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.0885F, -0.162F, -0.2337F);


        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.0413F, -0.1155F, 0.5237F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -2.132F, -0.0309F, 2.1009F);


        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-1.0649F, -0.8826F, 0.8782F);
        this.rightwing2.addChild(rightwing3membrance);


        this.rightwing1membrance = new ModelRenderer(this);
        this.rightwing1membrance.setRotationPoint(-1.3496F, 0.2368F, 2.9355F);
        this.rightwing1.addChild(rightwing1membrance);
        this.setRotateAngle(rightwing1membrance, 0.0021F, 0.3752F, 0.0093F);

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
