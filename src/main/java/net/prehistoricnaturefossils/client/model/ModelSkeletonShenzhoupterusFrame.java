package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShenzhoupterusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
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
    private final ModelRenderer rightwing1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;

    public ModelSkeletonShenzhoupterusFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 28.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -6.4776F, 2.2083F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.1522F, 0.1022F, -0.6749F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, 0.3902F, -1.1749F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 1.5708F, -1.4137F, -1.5708F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 18, 35, -1.5F, -0.5F, -2.5F, 1, 1, 5, -0.16F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 20, 37, -0.5F, 0.3F, -1.5F, 1, 1, 3, -0.15F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, 0.2112F, 0.1297F, -0.0179F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, 0.7972F, 1.8344F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -1.5708F, -1.5359F, 1.5708F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 11, 25, 0.4F, -1.0F, -2.0F, 1, 1, 4, -0.16F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.4684F, -0.0226F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 11, 25, -0.5F, 0.7F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1663F, 4.099F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0243F, 0.2039F, -0.078F);
        this.tail1.cubeList.add(new ModelBox(tail1, 43, 42, -0.5F, 0.4947F, -0.6603F, 1, 1, 2, -0.15F, false));

        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, 0.2816F, 2.9774F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.5095F, 0.0453F, 1.5879F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0266F, 5.7318F, 0.1798F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4685F, -0.2917F, -0.1681F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1711F, 6.9929F, 0.8682F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.4046F, -0.0804F, 0.024F);


        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.5385F, 1.2638F, 0.8437F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, 0.2816F, 2.9774F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.8829F, -0.0962F, -1.3766F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0266F, 5.7318F, 0.1798F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4685F, 0.2917F, 0.1681F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1711F, 6.9929F, 0.8682F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.4046F, 0.0804F, -0.024F);


        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.5385F, 1.2638F, 0.8437F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.2925F, -3.1493F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.2346F, 0.2549F, -0.0602F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.8171F, -0.7855F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, -0.0262F, -0.0174F, 0.0005F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 36, 17, -0.6F, -0.5F, -2.0F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1207F, -2.5762F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1863F, 0.4517F, 0.2035F);
        this.neck2.cubeList.add(new ModelBox(neck2, 33, 24, -0.5F, 0.2F, -2.601F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0964F, -2.7411F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1984F, 0.1616F, 0.3224F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, 0.0929F, -3.8518F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0349F, 0.0349F, 0.0012F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 20, -1, -0.5F, 0.3124F, -0.4126F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0148F, -4.0109F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.658F, 0.0653F, 0.1119F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0029F, 1.7481F, -1.519F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0611F, 0.0009F, 0.0001F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0003F, 0.2702F, 0.0232F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3471F, 0.0F, 0.0F);


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
        this.underneck3.setRotationPoint(0.0003F, 0.6702F, -3.1768F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0003F, 0.5702F, -1.3768F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0029F, -0.326F, -2.941F);
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
        this.bone.setRotationPoint(0.0029F, 0.7322F, -0.3366F);
        this.head.addChild(bone);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone2);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.0F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.4435F, 0.3857F, -0.0804F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7549F, 0.1825F, 0.4233F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.4079F, -0.8455F, 2.9161F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.0869F, 5.8009F, 0.3333F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.4445F, -0.6088F, -0.6086F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.3159F, 6.5818F, -0.136F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.962F, 0.9707F, -2.9828F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0678F, 0.2873F, 8.3099F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1467F, 0.1095F, -0.1703F);


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
        this.setRotateAngle(righthand2, 1.2451F, -1.4993F, 2.6545F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.0F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3351F, -0.1271F, -0.2207F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7549F, 0.1825F, 0.4233F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.1897F, 0.8455F, -2.9161F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.0869F, 5.8009F, 0.3333F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0094F, 0.4544F, 0.5224F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.3159F, 6.5818F, -0.136F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.7276F, -0.6783F, -2.8597F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0678F, 0.2873F, 8.3099F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1477F, 0.2522F, -0.6392F);


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
        this.setRotateAngle(lefthand2, 1.2451F, 1.4993F, -2.6545F);

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
