package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShenzhoupterus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r2;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r2;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer tail1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer upperleg7_r1;
    private final ModelRenderer upperleg6_r1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer upperleg8_r1;
    private final ModelRenderer upperleg7_r2;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg8_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head4_r3;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head5_r3;
    private final ModelRenderer head4_r4;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head3_r4;
    private final ModelRenderer head2_r2;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw8_r2;
    private final ModelRenderer jaw6_r2;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer shape64;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head2_r3;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head16_r1;
    private final ModelRenderer head13_r1;
    private final ModelRenderer head12_r1;
    private final ModelRenderer head11_r1;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head8_r4;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head5_r4;
    private final ModelRenderer bone;
    private final ModelRenderer head8_r5;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head8_r6;
    private final ModelRenderer head7_r5;
    private final ModelRenderer head10_r2;
    private final ModelRenderer head9_r2;
    private final ModelRenderer head7_r6;
    private final ModelRenderer head11_r2;
    private final ModelRenderer bone2;
    private final ModelRenderer rightwing1;
    private final ModelRenderer upperwing9_r1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer wing11_r1;
    private final ModelRenderer wing9_r1;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer wingfinger10_r1;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer upperwing10_r1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer wing12_r1;
    private final ModelRenderer wing10_r1;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer wingfinger11_r1;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;

    public ModelSkeletonShenzhoupterus() {
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


        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 56, 25, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 20, 37, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 29, 37, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 0, 36, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 54, 40, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 42, 27, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 48, 16, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 53, 20, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 29, 37, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 0, 36, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 54, 40, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 42, 27, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 48, 16, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.0262F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 11, 31, -1.5F, -0.5F, -1.7F, 3, 1, 2, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 53, 20, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, 0.2112F, 0.1297F, -0.0179F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.3428F, 3.5752F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 5, 44, 0.0F, -0.2F, -1.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.4684F, -0.0226F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 56, 28, 0.0F, -0.5F, 0.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 11, 25, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-0.6867F, 0.964F, 1.9508F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -1.1013F, -0.2719F, -0.6165F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 30, 55, -0.3F, -0.65F, -0.5F, 1, 1, 1, -0.32F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 49, 31, -0.3F, -0.35F, -0.5F, 1, 1, 1, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.011F, 0.0056F, 2.7512F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.8029F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 15, 54, -0.8044F, -0.7841F, -0.1476F, 1, 2, 1, -0.3F, true));
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 53, 50, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, 0.0129F, 3.4686F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.2705F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 36, 42, -0.5F, -0.8F, -1.5F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 36, 42, 2.3F, -0.8F, -1.5F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.3486F, 3.5744F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.6545F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 46, 55, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 46, 55, 2.3F, -0.5F, -0.6F, 1, 1, 1, -0.31F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-1.4F, -0.043F, 2.6613F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.2618F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 42, 23, -0.1F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 42, 23, 0.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.043F, 3.0613F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.1268F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 11, 35, -0.3F, -0.5279F, -2.6834F, 1, 1, 3, -0.3F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.212F, 1.3898F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.2054F, 0.1483F, -0.953F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 33, 29, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.6867F, 0.964F, 1.9508F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -1.1013F, 0.2719F, 0.6165F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 30, 55, -0.7F, -0.65F, -0.5F, 1, 1, 1, -0.32F, false));
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 49, 31, -0.7F, -0.35F, -0.5F, 1, 1, 1, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.011F, 0.0056F, 2.7512F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.8029F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 15, 54, -0.1956F, -0.7841F, -0.1476F, 1, 2, 1, -0.3F, false));
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 53, 50, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.6F, -0.043F, 3.0613F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.1268F, 0.1854F, -0.0503F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 11, 35, -0.7F, -0.5279F, -2.6834F, 1, 1, 3, -0.3F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.212F, 1.3898F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 33, 29, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1663F, 4.099F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0243F, 0.2039F, -0.078F);
        this.tail1.cubeList.add(new ModelBox(tail1, 43, 42, -0.5F, -0.2053F, -0.0603F, 1, 1, 2, 0.003F, false));

        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, 0.2816F, 2.9774F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.5095F, 0.0453F, 1.5879F);


        this.upperleg7_r1 = new ModelRenderer(this);
        this.upperleg7_r1.setRotationPoint(-0.1669F, 4.6413F, -0.0605F);
        this.rightleg1.addChild(upperleg7_r1);
        this.setRotateAngle(upperleg7_r1, 0.2007F, 0.0F, 0.0F);
        this.upperleg7_r1.cubeList.add(new ModelBox(upperleg7_r1, 0, 50, -0.5F, -1.8F, -0.5F, 1, 3, 1, -0.3F, true));

        this.upperleg6_r1 = new ModelRenderer(this);
        this.upperleg6_r1.setRotationPoint(-0.8606F, 3.7104F, -0.1448F);
        this.rightleg1.addChild(upperleg6_r1);
        this.setRotateAngle(upperleg6_r1, -0.0349F, 0.0F, 0.0F);
        this.upperleg6_r1.cubeList.add(new ModelBox(upperleg6_r1, 36, 46, 0.1645F, -4.2167F, -0.7295F, 1, 4, 1, -0.3F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0266F, 5.7318F, 0.1798F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4685F, -0.2917F, -0.1681F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0885F, 2.7638F, 0.2437F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 14, 40, 0.15F, -3.0F, -0.5F, 1, 7, 1, -0.3F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 0, 41, -0.7F, -3.0F, -0.5F, 1, 7, 1, -0.25F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1711F, 6.9929F, 0.8682F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.4046F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 31, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

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


        this.upperleg8_r1 = new ModelRenderer(this);
        this.upperleg8_r1.setRotationPoint(0.1669F, 4.6413F, -0.0605F);
        this.leftleg1.addChild(upperleg8_r1);
        this.setRotateAngle(upperleg8_r1, 0.2007F, 0.0F, 0.0F);
        this.upperleg8_r1.cubeList.add(new ModelBox(upperleg8_r1, 0, 50, -0.5F, -1.8F, -0.5F, 1, 3, 1, -0.3F, false));

        this.upperleg7_r2 = new ModelRenderer(this);
        this.upperleg7_r2.setRotationPoint(0.8606F, 3.7104F, -0.1448F);
        this.leftleg1.addChild(upperleg7_r2);
        this.setRotateAngle(upperleg7_r2, -0.0349F, 0.0F, 0.0F);
        this.upperleg7_r2.cubeList.add(new ModelBox(upperleg7_r2, 36, 46, -1.1645F, -4.2167F, -0.7295F, 1, 4, 1, -0.3F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0266F, 5.7318F, 0.1798F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4685F, 0.2917F, 0.1681F);


        this.leg8_r1 = new ModelRenderer(this);
        this.leg8_r1.setRotationPoint(-0.0885F, 2.7638F, 0.2437F);
        this.leftleg2.addChild(leg8_r1);
        this.setRotateAngle(leg8_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg8_r1.cubeList.add(new ModelBox(leg8_r1, 14, 40, -1.15F, -3.0F, -0.5F, 1, 7, 1, -0.3F, false));
        this.leg8_r1.cubeList.add(new ModelBox(leg8_r1, 0, 41, -0.3F, -3.0F, -0.5F, 1, 7, 1, -0.25F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1711F, 6.9929F, 0.8682F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.4046F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 31, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.6734F, -2.4728F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.1047F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 35, 56, 0.0F, -1.2113F, 1.9962F, 0, 1, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -0.1853F, -2.0641F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0349F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 38, 56, 0.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.6734F, -2.4728F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, -0.0262F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 37, 18, -0.5F, -1.1005F, -0.1095F, 1, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1207F, -2.5762F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1863F, 0.4517F, 0.2035F);
        this.neck2.cubeList.add(new ModelBox(neck2, 33, 24, -0.5F, -0.5F, -2.901F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 57, 0, 0.0F, -0.8F, -1.901F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0964F, -2.7411F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1984F, 0.1616F, 0.3224F);
        this.neck3.cubeList.add(new ModelBox(neck3, 5, 41, 0.0F, -0.7036F, -1.0598F, 0, 1, 1, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, 0.0929F, -3.8518F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0349F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 56, 22, 0.0F, -0.6876F, 0.7874F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 21, 0, -0.5F, -0.3876F, -0.2126F, 1, 1, 4, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0148F, -4.0109F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.658F, 0.0653F, 0.1119F);


        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(-0.0029F, -1.5245F, -2.7236F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.0175F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 47, 38, -0.8F, -0.4276F, 1.3206F, 1, 1, 2, 0.0F, true));
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 47, 38, -0.1943F, -0.4276F, 1.3206F, 1, 1, 2, 0.0F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0964F, 0.0355F, -0.4468F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.48F, -0.0013F, -0.0002F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 31, 51, -1.0F, -1.5F, -0.5F, 1, 2, 1, 0.002F, true));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(-0.0029F, -1.9371F, -1.7962F);
        this.head.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -2.0246F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 31, 31, -0.9F, -1.9666F, -0.0516F, 1, 2, 3, 0.004F, true));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 31, 31, -0.0943F, -1.9666F, -0.0516F, 1, 2, 3, 0.001F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.4029F, 1.0434F, -1.5632F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.6632F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 55, 13, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.005F, true));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 55, 13, 0.3057F, -0.5F, -0.5F, 1, 1, 1, -0.007F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0971F, 0.696F, -1.2036F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.8029F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 20, 54, -1.0F, -0.4F, -0.5F, 1, 1, 1, -0.007F, true));
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 20, 54, -0.1943F, -0.4F, -0.5F, 1, 1, 1, -0.003F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0971F, 0.4145F, -0.9153F);
        this.head.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -1.2392F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 54, 37, -1.0F, -0.5F, -0.5F, 1, 1, 1, -0.003F, true));
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 54, 37, -0.1943F, -0.5F, -0.5F, 1, 1, 1, -0.007F, false));

        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(-0.0964F, 0.0355F, -0.4468F);
        this.head.addChild(head4_r3);
        this.setRotateAngle(head4_r3, -0.48F, 0.0013F, 0.0002F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 31, 51, 0.0F, -1.5F, -0.5F, 1, 2, 1, 0.002F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0046F, -1.043F, 0.0982F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -1.2566F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 21, 6, -0.5F, -0.9F, -1.1F, 1, 2, 2, -0.3F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(0.0029F, -2.8393F, -0.1333F);
        this.head.addChild(head5_r3);
        this.setRotateAngle(head5_r3, -0.4887F, 0.0F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 48, 12, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.203F, false));

        this.head4_r4 = new ModelRenderer(this);
        this.head4_r4.setRotationPoint(0.0029F, -2.8168F, -1.3304F);
        this.head.addChild(head4_r4);
        this.setRotateAngle(head4_r4, -0.6632F, 0.0F, 0.0F);
        this.head4_r4.cubeList.add(new ModelBox(head4_r4, 48, 8, -0.5F, -0.7942F, -0.1623F, 1, 1, 2, -0.2F, false));

        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0029F, -2.0168F, -0.9304F);
        this.head.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.5061F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 54, 34, -0.5F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));

        this.head3_r4 = new ModelRenderer(this);
        this.head3_r4.setRotationPoint(0.0029F, -1.6383F, -0.1213F);
        this.head.addChild(head3_r4);
        this.setRotateAngle(head3_r4, -0.1396F, 0.0F, 0.0F);
        this.head3_r4.cubeList.add(new ModelBox(head3_r4, 22, 31, -0.5F, -1.0F, -1.7F, 1, 2, 3, -0.3F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0029F, -3.3245F, -0.5236F);
        this.head.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.4014F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 54, 31, -0.5F, 0.9778F, -0.0196F, 1, 1, 1, 0.003F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0029F, 1.7481F, -1.519F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0611F, 0.0009F, 0.0001F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-1.0061F, 0.2397F, -0.5955F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.5585F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 41, 50, -0.1F, -0.7995F, -0.4999F, 1, 1, 2, -0.2F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 41, 50, 1.1064F, -0.7995F, -0.4999F, 1, 1, 2, -0.2F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0003F, 0.2702F, 0.0232F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3471F, 0.0F, 0.0F);


        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-0.0064F, 0.1F, -3.2F);
        this.jaw2.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.1833F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 29, 47, -0.9F, -0.7594F, -2.1651F, 1, 1, 2, -0.199F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 29, 47, -0.0936F, -0.7594F, -2.1651F, 1, 1, 2, -0.199F, false));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-0.0064F, 0.2F, -3.6F);
        this.jaw2.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, 0.096F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 50, 0, -0.9F, -0.7849F, -0.2535F, 1, 1, 2, -0.203F, true));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 50, 0, -0.0936F, -0.7849F, -0.2535F, 1, 1, 2, -0.203F, false));

        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(-0.0064F, -0.6F, -0.6F);
        this.jaw2.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.0698F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 0, 18, -0.9F, -0.2425F, -4.8075F, 1, 1, 5, -0.2F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 0, 18, -0.0936F, -0.2425F, -4.8075F, 1, 1, 5, -0.2F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, -0.1283F, -3.1148F);
        this.jaw5.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, -0.3578F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 39, 5, -0.5F, -0.7107F, -2.7294F, 1, 1, 3, -0.299F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, -0.7866F, -3.1288F);
        this.jaw5.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, -0.1484F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 49, 27, -0.5F, -0.4612F, -1.0F, 1, 1, 2, -0.3F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, -0.7283F, -2.9148F);
        this.jaw5.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, -0.2007F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 38, 37, -0.5F, -0.4404F, -3.5392F, 1, 1, 3, -0.303F, false));

        this.jaw8_r2 = new ModelRenderer(this);
        this.jaw8_r2.setRotationPoint(0.0F, 0.6717F, -0.9148F);
        this.jaw5.addChild(jaw8_r2);
        this.setRotateAngle(jaw8_r2, 0.1396F, 0.0F, 0.0F);
        this.jaw8_r2.cubeList.add(new ModelBox(jaw8_r2, 55, 46, -0.5F, -1.205F, -0.3912F, 1, 1, 1, -0.214F, false));
        this.jaw8_r2.cubeList.add(new ModelBox(jaw8_r2, 19, 50, -0.5F, -0.805F, -0.1912F, 1, 1, 2, -0.21F, false));

        this.jaw6_r2 = new ModelRenderer(this);
        this.jaw6_r2.setRotationPoint(0.0F, -0.8283F, -2.9148F);
        this.jaw5.addChild(jaw6_r2);
        this.setRotateAngle(jaw6_r2, -0.3491F, 0.0F, 0.0F);
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 39, 10, -0.5F, -0.0795F, -0.3825F, 1, 1, 3, -0.199F, false));

        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(0.0F, -0.8283F, -2.9148F);
        this.jaw5.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, -0.1658F, 0.0F, 0.0F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 22, 25, -0.5F, -0.3032F, 0.0021F, 1, 1, 4, -0.2F, false));

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


        this.head2_r3 = new ModelRenderer(this);
        this.head2_r3.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.head2.addChild(head2_r3);
        this.setRotateAngle(head2_r3, 0.0436F, 0.0F, 0.0F);
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 0, 11, -1.0F, -0.9858F, -4.6221F, 2, 1, 5, -0.2F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(0.0F, 0.9315F, -3.1556F);
        this.head5.addChild(head8_r1);
        this.setRotateAngle(head8_r1, 0.4189F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 26, 18, -0.5F, -0.6863F, -1.529F, 1, 1, 4, -0.2F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(0.0F, 0.9941F, -2.0653F);
        this.head5.addChild(head8_r2);
        this.setRotateAngle(head8_r2, 0.2443F, -0.0005F, -0.0002F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 12, 49, -0.5F, -0.7F, -1.1F, 1, 1, 2, -0.2F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(0.0F, 1.4315F, 0.0444F);
        this.head5.addChild(head7_r1);
        this.setRotateAngle(head7_r1, 0.0524F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 28, 6, -0.5F, -0.8268F, -3.7283F, 1, 1, 4, -0.199F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(0.0F, 1.5315F, -5.9556F);
        this.head5.addChild(head7_r2);
        this.setRotateAngle(head7_r2, 0.384F, -0.0002F, -0.0001F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 28, 12, -0.5002F, -0.2689F, -0.3579F, 1, 1, 4, -0.303F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.0F, 1.5315F, -2.7556F);
        this.head5.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 0.1396F, -0.0002F, -0.0001F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 13, 18, -0.5008F, -0.721F, -4.7329F, 1, 1, 5, -0.3F, false));

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


        this.head16_r1 = new ModelRenderer(this);
        this.head16_r1.setRotationPoint(0.0F, -1.1062F, 4.2209F);
        this.head4.addChild(head16_r1);
        this.setRotateAngle(head16_r1, 0.1396F, 0.0F, 0.0F);
        this.head16_r1.cubeList.add(new ModelBox(head16_r1, 5, 49, -0.5F, -0.1F, -2.2F, 1, 1, 2, -0.207F, false));
        this.head16_r1.cubeList.add(new ModelBox(head16_r1, 48, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

        this.head13_r1 = new ModelRenderer(this);
        this.head13_r1.setRotationPoint(0.0F, -0.55F, 3.4F);
        this.head4.addChild(head13_r1);
        this.setRotateAngle(head13_r1, -0.5411F, 0.0F, 0.0F);
        this.head13_r1.cubeList.add(new ModelBox(head13_r1, 36, 52, -0.5F, -1.0924F, -0.0449F, 1, 2, 1, -0.204F, false));

        this.head12_r1 = new ModelRenderer(this);
        this.head12_r1.setRotationPoint(0.0F, -1.65F, 2.1F);
        this.head4.addChild(head12_r1);
        this.setRotateAngle(head12_r1, -0.2443F, 0.0F, 0.0F);
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 41, 46, -0.5F, -0.2034F, -0.2471F, 1, 1, 2, -0.204F, false));

        this.head11_r1 = new ModelRenderer(this);
        this.head11_r1.setRotationPoint(0.0F, -1.45F, 0.6F);
        this.head4.addChild(head11_r1);
        this.setRotateAngle(head11_r1, 0.0175F, 0.0F, 0.0F);
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 46, 18, -0.5F, -0.3549F, -0.2416F, 1, 1, 2, -0.205F, false));

        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(0.0F, -1.05F, -0.9F);
        this.head4.addChild(head10_r1);
        this.setRotateAngle(head10_r1, 0.3142F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 50, 42, -0.5F, -0.254F, -0.2567F, 1, 1, 2, -0.204F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(0.0F, -0.05F, -3.2F);
        this.head4.addChild(head9_r1);
        this.setRotateAngle(head9_r1, 0.4363F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 40, 29, -0.5F, -0.1936F, -0.293F, 1, 1, 3, -0.2F, false));

        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(0.0F, -0.05F, -3.2F);
        this.head4.addChild(head8_r3);
        this.setRotateAngle(head8_r3, 0.384F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 32, 0, -0.5F, -0.1936F, -2.793F, 1, 1, 3, -0.204F, false));

        this.head8_r4 = new ModelRenderer(this);
        this.head8_r4.setRotationPoint(0.5003F, -0.208F, 0.8367F);
        this.head4.addChild(head8_r4);
        this.setRotateAngle(head8_r4, 0.1396F, 0.0016F, -0.0001F);
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 53, 54, -1.0012F, -0.1278F, -0.1138F, 1, 1, 1, -0.11F, false));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(0.5003F, 0.692F, 1.5367F);
        this.head4.addChild(head7_r3);
        this.setRotateAngle(head7_r3, -0.384F, 0.0016F, -0.0001F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 41, 54, -1.0F, -0.7F, -1.1F, 1, 1, 1, -0.104F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.5F, 1.1843F, -0.3814F);
        this.head4.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.8901F, 0.0016F, -0.0001F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 29, 42, -1.0028F, -1.9004F, -0.1755F, 1, 2, 2, -0.11F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.5F, 1.6843F, -0.8814F);
        this.head4.addChild(head6_r3);
        this.setRotateAngle(head6_r3, -0.4887F, 0.0013F, -0.0001F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 48, 4, -1.0035F, -0.0871F, -0.0796F, 1, 1, 2, -0.1F, false));

        this.head5_r4 = new ModelRenderer(this);
        this.head5_r4.setRotationPoint(0.5F, 0.3843F, 1.4186F);
        this.head4.addChild(head5_r4);
        this.setRotateAngle(head5_r4, -0.6807F, 0.0016F, -0.0001F);
        this.head5_r4.cubeList.add(new ModelBox(head5_r4, 47, 34, -0.9999F, 1.5707F, -1.0489F, 1, 1, 2, -0.104F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0029F, 0.7322F, -0.3366F);
        this.head.addChild(bone);


        this.head8_r5 = new ModelRenderer(this);
        this.head8_r5.setRotationPoint(-0.8257F, 0.1067F, -0.9305F);
        this.bone.addChild(head8_r5);
        this.setRotateAngle(head8_r5, -0.8552F, 0.0F, 0.0F);
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 53, 16, -0.5F, -1.5941F, -0.5349F, 1, 2, 1, -0.4F, true));
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 0, 55, -0.5F, -1.7941F, -0.5349F, 1, 1, 1, -0.4F, true));
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 0, 55, 1.1457F, -1.7941F, -0.5349F, 1, 1, 1, -0.4F, false));
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 53, 16, 1.1457F, -1.5941F, -0.5349F, 1, 2, 1, -0.4F, false));

        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(-0.8257F, -0.3933F, -0.4305F);
        this.bone.addChild(head7_r4);
        this.setRotateAngle(head7_r4, -0.9774F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 5, 53, -0.5F, -1.1F, -0.4F, 1, 2, 1, -0.399F, true));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 5, 53, 1.1457F, -1.1F, -0.4F, 1, 2, 1, -0.399F, false));

        this.head8_r6 = new ModelRenderer(this);
        this.head8_r6.setRotationPoint(-0.8954F, -0.8888F, -1.5292F);
        this.bone.addChild(head8_r6);
        this.setRotateAngle(head8_r6, -0.9163F, 0.0F, 0.0F);
        this.head8_r6.cubeList.add(new ModelBox(head8_r6, 26, 51, -0.3288F, -1.5709F, -0.507F, 1, 2, 1, -0.302F, true));
        this.head8_r6.cubeList.add(new ModelBox(head8_r6, 26, 51, 1.1139F, -1.5709F, -0.507F, 1, 2, 1, -0.302F, false));

        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(-0.8954F, -1.5888F, -0.8292F);
        this.bone.addChild(head7_r5);
        this.setRotateAngle(head7_r5, -1.2305F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 51, 22, -0.3288F, -0.862F, -0.0808F, 1, 2, 1, -0.3F, true));
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 51, 22, 1.1139F, -0.862F, -0.0808F, 1, 2, 1, -0.3F, false));

        this.head10_r2 = new ModelRenderer(this);
        this.head10_r2.setRotationPoint(-0.8954F, -1.8888F, -0.2292F);
        this.bone.addChild(head10_r2);
        this.setRotateAngle(head10_r2, -2.2777F, 0.0F, 0.0F);
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 55, 7, -0.3288F, -0.6832F, -0.3011F, 1, 1, 1, -0.302F, true));
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 55, 7, 1.1139F, -0.6832F, -0.3011F, 1, 1, 1, -0.302F, false));

        this.head9_r2 = new ModelRenderer(this);
        this.head9_r2.setRotationPoint(-0.8954F, -1.7888F, -0.6292F);
        this.bone.addChild(head9_r2);
        this.setRotateAngle(head9_r2, -1.4224F, 0.0F, 0.0F);
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 55, 4, -0.3288F, -0.6936F, -0.3409F, 1, 1, 1, -0.3F, true));
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 55, 4, 1.1139F, -0.6936F, -0.3409F, 1, 1, 1, -0.3F, false));

        this.head7_r6 = new ModelRenderer(this);
        this.head7_r6.setRotationPoint(-0.8954F, -2.5888F, -0.8292F);
        this.bone.addChild(head7_r6);
        this.setRotateAngle(head7_r6, -0.9861F, 0.0F, 0.0F);
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 25, 55, -0.3503F, -0.231F, 0.6724F, 1, 1, 1, -0.3F, true));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 40, 34, -0.4388F, -0.231F, 0.6724F, 2, 1, 1, -0.38F, true));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 25, 55, 1.1354F, -0.231F, 0.6724F, 1, 1, 1, -0.3F, false));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 40, 34, 0.2239F, -0.231F, 0.6724F, 2, 1, 1, -0.38F, false));

        this.head11_r2 = new ModelRenderer(this);
        this.head11_r2.setRotationPoint(-0.8954F, -1.5888F, 0.0708F);
        this.bone.addChild(head11_r2);
        this.setRotateAngle(head11_r2, -2.9932F, 0.0F, 0.0F);
        this.head11_r2.cubeList.add(new ModelBox(head11_r2, 55, 10, -0.3288F, -0.6603F, -0.2895F, 1, 1, 1, -0.299F, true));
        this.head11_r2.cubeList.add(new ModelBox(head11_r2, 55, 10, 1.1139F, -0.6603F, -0.2895F, 1, 1, 1, -0.299F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone2);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.0F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.4435F, 0.3857F, -0.0804F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 39, 15, -2.75F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 10, 53, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7549F, 0.1825F, 0.4233F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.4079F, -0.8455F, 2.9161F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(-0.4534F, 1.8204F, -0.2518F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 19, 42, -0.0928F, -1.9026F, -0.7631F, 1, 6, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 24, 42, -0.0928F, -1.9026F, 0.0369F, 1, 6, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(-0.4534F, 1.8204F, -0.2518F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 48, 50, -0.6369F, 0.5633F, -2.1225F, 1, 3, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.0869F, 5.8009F, 0.3333F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.4445F, -0.6088F, -0.6086F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 9, 40, -0.6393F, -0.1869F, -0.8325F, 1, 7, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.3159F, 6.5818F, -0.136F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.962F, 0.9707F, -2.9828F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0678F, 0.2873F, 8.3099F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1467F, 0.1095F, -0.1703F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 0, 25, -0.5286F, -0.8024F, -0.3117F, 1, 1, 4, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(-0.0286F, 0.1976F, 5.0883F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 15, 11, -0.5F, -1.2F, -1.8F, 1, 1, 5, -0.204F, true));

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
        this.righthand2.cubeList.add(new ModelBox(righthand2, 41, 0, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.0F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3351F, -0.1271F, -0.2207F);


        this.upperwing10_r1 = new ModelRenderer(this);
        this.upperwing10_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing10_r1);
        this.setRotateAngle(upperwing10_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing10_r1.cubeList.add(new ModelBox(upperwing10_r1, 39, 15, -0.25F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.upperwing10_r1.cubeList.add(new ModelBox(upperwing10_r1, 10, 53, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7549F, 0.1825F, 0.4233F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.1897F, 0.8455F, -2.9161F);


        this.wing12_r1 = new ModelRenderer(this);
        this.wing12_r1.setRotationPoint(0.4534F, 1.8204F, -0.2518F);
        this.leftwing2.addChild(wing12_r1);
        this.setRotateAngle(wing12_r1, 0.0F, 0.0F, 0.0F);
        this.wing12_r1.cubeList.add(new ModelBox(wing12_r1, 19, 42, -0.9072F, -1.9026F, -0.7631F, 1, 6, 1, -0.2F, false));
        this.wing12_r1.cubeList.add(new ModelBox(wing12_r1, 24, 42, -0.9072F, -1.9026F, 0.0369F, 1, 6, 1, -0.15F, false));

        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(0.4534F, 1.8204F, -0.2518F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 48, 50, -0.3631F, 0.5633F, -2.1225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.0869F, 5.8009F, 0.3333F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0094F, 0.4544F, 0.5224F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 9, 40, -0.3607F, -0.1869F, -0.8325F, 1, 7, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.3159F, 6.5818F, -0.136F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.7276F, -0.6783F, -2.8597F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0678F, 0.2873F, 8.3099F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1477F, 0.2522F, -0.6392F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 25, -0.4714F, -0.8024F, -0.3117F, 1, 1, 4, -0.2F, false));

        this.wingfinger11_r1 = new ModelRenderer(this);
        this.wingfinger11_r1.setRotationPoint(0.0286F, 0.1976F, 5.0883F);
        this.leftwing5.addChild(wingfinger11_r1);
        this.setRotateAngle(wingfinger11_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger11_r1.cubeList.add(new ModelBox(wingfinger11_r1, 15, 11, -0.5F, -1.2F, -1.8F, 1, 1, 5, -0.204F, false));

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
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 41, 0, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
