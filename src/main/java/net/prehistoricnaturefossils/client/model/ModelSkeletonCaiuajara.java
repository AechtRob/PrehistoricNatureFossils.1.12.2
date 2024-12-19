package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCaiuajara extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body3_r2;
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
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head9_r2;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head8_r4;
    private final ModelRenderer head11_r1;
    private final ModelRenderer head10_r2;
    private final ModelRenderer head9_r3;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head10_r3;
    private final ModelRenderer head9_r4;
    private final ModelRenderer head8_r5;
    private final ModelRenderer head8_r6;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head4_r3;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head4_r4;
    private final ModelRenderer head3_r4;
    private final ModelRenderer head5_r3;
    private final ModelRenderer head3_r5;
    private final ModelRenderer head2_r3;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw10_r1;
    private final ModelRenderer jaw9_r1;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer jaw4_r2;
    private final ModelRenderer jaw13_r1;
    private final ModelRenderer jaw13_r2;
    private final ModelRenderer jaw12_r1;
    private final ModelRenderer jaw12_r2;
    private final ModelRenderer jaw9_r2;
    private final ModelRenderer jaw5_r3;
    private final ModelRenderer jaw4_r3;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw12_r3;
    private final ModelRenderer jaw12_r4;
    private final ModelRenderer jaw11_r1;
    private final ModelRenderer jaw11_r2;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer shape64;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r5;
    private final ModelRenderer head3_r6;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head9_r5;
    private final ModelRenderer head8_r7;
    private final ModelRenderer head8_r8;
    private final ModelRenderer head7_r5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head11_r2;
    private final ModelRenderer head10_r4;
    private final ModelRenderer head9_r6;
    private final ModelRenderer head9_r7;
    private final ModelRenderer head8_r9;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head5_r4;
    private final ModelRenderer crest1;
    private final ModelRenderer crest4_r1;
    private final ModelRenderer crest5_r1;
    private final ModelRenderer crest4_r2;
    private final ModelRenderer crest3_r1;
    private final ModelRenderer crest8_r1;
    private final ModelRenderer crest8_r2;
    private final ModelRenderer crest7_r1;
    private final ModelRenderer crest7_r2;
    private final ModelRenderer crest6_r1;
    private final ModelRenderer crest4_r3;
    private final ModelRenderer crest3_r2;
    private final ModelRenderer crest4_r4;
    private final ModelRenderer crest3_r3;
    private final ModelRenderer crest3_r4;
    private final ModelRenderer crest5_r2;
    private final ModelRenderer crest4_r5;
    private final ModelRenderer crest3_r5;
    private final ModelRenderer crest2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer upperwing8_r1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer wing10_r1;
    private final ModelRenderer wing8_r1;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer wingfinger9_r1;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
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
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;

    public ModelSkeletonCaiuajara() {
        this.textureWidth = 63;
        this.textureHeight = 63;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.025F, -0.5694F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.1836F, 0.0644F, -0.4081F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.0503F, -0.3905F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 59, 12, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 10, 59, 0.0F, -1.0F, -1.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 9, 30, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 32, 5, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 18, 31, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 47, 26, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 42, 22, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 41, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 46, 12, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 32, 5, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 18, 31, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 47, 26, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 42, 22, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 41, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.1571F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 0, 19, -1.5F, -0.3F, -1.5F, 3, 1, 3, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 46, 12, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1372F, 0.0865F, -0.0119F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.9744F, 4.4978F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 40, 58, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -1.1F, 0.9F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 26, 44, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 13, 19, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.2397F, 0.8793F, 3.034F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.6645F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 50, 49, -0.4F, -1.0F, -0.5F, 1, 2, 1, -0.31F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.8029F, 0.0F, -0.6545F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 0, 51, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.0472F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 37, 38, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, -0.4801F, 4.897F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -0.1658F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 41, 0, -0.5F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 41, 0, 2.3F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.9801F, 4.497F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.6545F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 40, 24, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 40, 24, 2.3F, -0.5F, -0.9F, 1, 1, 2, -0.31F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-1.4F, -0.6746F, 3.5838F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.2618F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 33, 16, -0.1F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 33, 16, 0.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.2665F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 24, 19, -0.3F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.2054F, 0.1483F, -0.953F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 31, 29, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.8029F, 0.0F, 0.6545F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 0, 51, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0472F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 37, 38, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.2665F, 0.1854F, -0.0503F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 24, 19, -0.7F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 31, 29, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2823F, 0.2519F, -0.0722F);
        this.tail1.cubeList.add(new ModelBox(tail1, 5, 39, -0.5F, -1.0604F, 0.0341F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.35F, 3.9F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 1.2186F, 0.1897F, -1.2344F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 18, 25, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7991F, 0.1376F, 0.3263F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 44, 41, -1.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 0, 45, -0.05F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.9072F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 21, 6, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, -0.35F, 3.9F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.8259F, -0.1897F, 1.2344F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 18, 25, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3627F, -0.1376F, -0.3263F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 44, 41, 0.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 0, 45, -0.95F, -2.0F, -0.5F, 1, 4, 1, -0.1F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.9945F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 21, 6, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.3927F, 0.2618F, 0.0F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.1539F, -0.8135F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1745F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 59, 15, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 32, 0, -0.5F, -0.9F, -1.7F, 1, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4445F, -1.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3147F, 0.227F, -0.1627F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 24, -0.5F, -0.4178F, -2.9187F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 30, 16, 0.0F, -0.7178F, -2.9187F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 58, 52, 0.0F, -0.7178F, -0.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2916F, 0.3571F, -0.1882F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 43, 58, 0.0F, -0.6F, -1.5F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 31, 24, -0.5F, -0.3F, -2.5F, 1, 1, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2456F, -2.8525F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.7137F, -0.3614F, 0.3876F);


        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(-0.52F, -0.4015F, -4.7309F);
        this.head.addChild(head10_r1);
        this.setRotateAngle(head10_r1, 2.0682F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 15, 52, -0.5F, -1.0016F, -0.9674F, 1, 1, 1, 0.003F, true));
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 15, 52, 0.54F, -1.0016F, -0.9674F, 1, 1, 1, 0.003F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(-0.52F, -1.0828F, -2.9735F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, -3.0892F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 57, 27, -0.5F, -0.9275F, -0.9822F, 1, 1, 1, 0.0F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 35, 57, -0.5F, -1.5275F, -0.4822F, 1, 1, 1, 0.0F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 35, 57, 0.54F, -1.5275F, -0.4822F, 1, 1, 1, 0.0F, false));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 57, 27, 0.54F, -0.9275F, -0.9822F, 1, 1, 1, 0.0F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-0.52F, 0.9202F, -2.1814F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -0.3927F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 47, 56, -0.5F, -0.8642F, -0.9656F, 1, 1, 1, 0.0F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 47, 56, 0.54F, -0.8642F, -0.9656F, 1, 1, 1, 0.0F, false));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-0.52F, 0.1811F, -1.8752F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -0.2356F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 52, 56, -0.5F, -1.0642F, -0.9656F, 1, 1, 1, 0.006F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 52, 56, 0.54F, -1.0642F, -0.9656F, 1, 1, 1, 0.006F, false));

        this.head9_r2 = new ModelRenderer(this);
        this.head9_r2.setRotationPoint(-0.52F, -1.1003F, -2.8661F);
        this.head.addChild(head9_r2);
        this.setRotateAngle(head9_r2, 1.9635F, 0.0F, 0.0F);
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 38, 50, -0.5F, -2.0344F, -0.9242F, 1, 2, 1, 0.007F, true));
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 38, 50, 0.54F, -2.0344F, -0.9242F, 1, 2, 1, 0.007F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(-0.52F, -0.0007F, -3.2546F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, 1.4748F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 33, 47, -0.5F, -1.829F, -0.9683F, 1, 3, 1, 0.005F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 33, 47, 0.54F, -1.829F, -0.9683F, 1, 3, 1, 0.005F, false));

        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(-1.32F, 0.1014F, -0.0925F);
        this.head.addChild(head8_r3);
        this.setRotateAngle(head8_r3, -1.0559F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 32, 52, -0.5F, -0.4F, -0.3F, 1, 1, 1, -0.3F, true));
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 52, 29, -0.5F, -0.8F, -0.3F, 1, 1, 1, -0.3F, true));
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 32, 52, 2.14F, -0.4F, -0.3F, 1, 1, 1, -0.3F, false));
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 52, 29, 2.14F, -0.8F, -0.3F, 1, 1, 1, -0.3F, false));

        this.head8_r4 = new ModelRenderer(this);
        this.head8_r4.setRotationPoint(-1.21F, -0.8552F, -1.5193F);
        this.head.addChild(head8_r4);
        this.setRotateAngle(head8_r4, -1.2828F, 0.0F, 0.0F);
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 20, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.2F, true));
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 54, 21, -0.5F, -0.8F, 0.2F, 1, 1, 1, -0.2F, true));

        this.head11_r1 = new ModelRenderer(this);
        this.head11_r1.setRotationPoint(-1.21F, -0.6621F, 0.1117F);
        this.head.addChild(head11_r1);
        this.setRotateAngle(head11_r1, -3.1154F, 0.0F, 0.0F);
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 37, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.198F, true));

        this.head10_r2 = new ModelRenderer(this);
        this.head10_r2.setRotationPoint(-1.21F, -1.0518F, -0.3446F);
        this.head.addChild(head10_r2);
        this.setRotateAngle(head10_r2, -2.2777F, 0.0F, 0.0F);
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 30, 43, -0.5F, -0.8F, -0.2F, 1, 1, 2, -0.203F, true));

        this.head9_r3 = new ModelRenderer(this);
        this.head9_r3.setRotationPoint(-1.21F, -1.0256F, -0.944F);
        this.head.addChild(head9_r3);
        this.setRotateAngle(head9_r3, -1.5272F, 0.0F, 0.0F);
        this.head9_r3.cubeList.add(new ModelBox(head9_r3, 25, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.2F, true));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(-1.21F, 0.5575F, -1.4544F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -0.096F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 49, 18, -0.5F, -1.6F, -0.4F, 1, 2, 1, -0.199F, true));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(-1.21F, 0.8083F, -1.1271F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.9338F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 49, 14, -0.5F, -1.8F, -0.8F, 1, 2, 1, -0.2F, true));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(0.0F, -0.6682F, -0.9652F);
        this.head.addChild(head7_r3);
        this.setRotateAngle(head7_r3, -0.6545F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 56, 35, -1.62F, -0.5F, -0.1F, 1, 1, 1, -0.1F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 54, 18, -1.83F, -0.5F, -0.1F, 1, 1, 1, -0.3F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 54, 18, 0.83F, -0.5F, -0.1F, 1, 1, 1, -0.3F, false));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 56, 35, 0.62F, -0.5F, -0.1F, 1, 1, 1, -0.1F, false));

        this.head10_r3 = new ModelRenderer(this);
        this.head10_r3.setRotationPoint(1.21F, -0.6621F, 0.1117F);
        this.head.addChild(head10_r3);
        this.setRotateAngle(head10_r3, -3.1154F, 0.0F, 0.0F);
        this.head10_r3.cubeList.add(new ModelBox(head10_r3, 37, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.198F, false));

        this.head9_r4 = new ModelRenderer(this);
        this.head9_r4.setRotationPoint(1.21F, -1.0518F, -0.3446F);
        this.head.addChild(head9_r4);
        this.setRotateAngle(head9_r4, -2.2777F, 0.0F, 0.0F);
        this.head9_r4.cubeList.add(new ModelBox(head9_r4, 30, 43, -0.5F, -0.8F, -0.2F, 1, 1, 2, -0.203F, false));

        this.head8_r5 = new ModelRenderer(this);
        this.head8_r5.setRotationPoint(1.21F, -1.0256F, -0.944F);
        this.head.addChild(head8_r5);
        this.setRotateAngle(head8_r5, -1.5272F, 0.0F, 0.0F);
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 25, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

        this.head8_r6 = new ModelRenderer(this);
        this.head8_r6.setRotationPoint(1.21F, -0.8552F, -1.5193F);
        this.head.addChild(head8_r6);
        this.setRotateAngle(head8_r6, -1.2828F, 0.0F, 0.0F);
        this.head8_r6.cubeList.add(new ModelBox(head8_r6, 54, 21, -0.5F, -0.8F, 0.2F, 1, 1, 1, -0.2F, false));
        this.head8_r6.cubeList.add(new ModelBox(head8_r6, 20, 54, -0.5F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(1.21F, 0.5575F, -1.4544F);
        this.head.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.096F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 49, 18, -0.5F, -1.6F, -0.4F, 1, 2, 1, -0.199F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(1.21F, 0.8083F, -1.1271F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.9338F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 49, 14, -0.5F, -1.8F, -0.8F, 1, 2, 1, -0.2F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, 1.0909F, -1.9385F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.4625F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 0, 34, -1.5F, -2.0F, -0.5F, 3, 2, 1, 0.003F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, -1.4591F, -1.896F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -1.5621F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 17, 48, -0.5F, -1.2F, 0.0F, 1, 2, 1, -0.003F, false));

        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(0.0F, -1.9709F, 1.9902F);
        this.head.addChild(head7_r4);
        this.setRotateAngle(head7_r4, -0.6021F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 55, 46, -0.5F, -0.9999F, -0.5638F, 1, 1, 1, -0.199F, false));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 51, 32, -0.5F, -0.4999F, -0.5638F, 1, 2, 1, -0.204F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, -2.2609F, 2.0894F);
        this.head.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -1.1432F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 5, 51, -0.5F, -0.1743F, -0.4074F, 1, 2, 1, -0.2F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, -1.3887F, -1.1587F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -1.3352F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 45, 47, -0.5F, -2.3329F, 0.0139F, 1, 3, 1, -0.005F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, -0.9381F, 0.6317F);
        this.head.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -1.597F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 33, 20, -1.5F, 0.1F, -0.2F, 3, 2, 1, -0.006F, false));

        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0F, 1.4095F, -1.4869F);
        this.head.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -1.0559F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 0, 29, -1.5F, -3.0F, -1.0F, 3, 3, 1, -0.003F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -0.1742F, 1.0476F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.4974F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 26, 47, -1.0F, -0.9957F, -0.8999F, 2, 1, 1, -0.009F, false));

        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, -1.9326F, -2.6832F);
        this.head.addChild(head4_r3);
        this.setRotateAngle(head4_r3, 0.2967F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 54, 15, -0.5F, 0.1438F, 3.8383F, 1, 1, 1, -0.3F, false));
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 5, 43, -0.5F, 0.1438F, 2.4383F, 1, 1, 2, -0.3F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, -1.9326F, -2.6832F);
        this.head.addChild(head2_r2);
        this.setRotateAngle(head2_r2, 0.1745F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 42, 18, -0.5F, -0.1939F, 1.1242F, 1, 1, 2, -0.303F, false));

        this.head4_r4 = new ModelRenderer(this);
        this.head4_r4.setRotationPoint(0.0F, -2.0723F, -2.6611F);
        this.head.addChild(head4_r4);
        this.setRotateAngle(head4_r4, -0.0698F, 0.0F, 0.0F);
        this.head4_r4.cubeList.add(new ModelBox(head4_r4, 49, 41, -0.5F, -1.2745F, -0.3233F, 1, 2, 1, -0.299F, false));

        this.head3_r4 = new ModelRenderer(this);
        this.head3_r4.setRotationPoint(0.0F, -1.9326F, -2.6832F);
        this.head.addChild(head3_r4);
        this.setRotateAngle(head3_r4, -0.9425F, 0.0F, 0.0F);
        this.head3_r4.cubeList.add(new ModelBox(head3_r4, 54, 12, -0.5F, -0.4745F, -0.4233F, 1, 1, 1, -0.3F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(0.0F, -2.0391F, -2.1299F);
        this.head.addChild(head5_r3);
        this.setRotateAngle(head5_r3, -0.0175F, 0.0F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 0, 55, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.303F, false));
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 54, 40, -0.5F, -0.5F, -0.4F, 1, 1, 1, -0.307F, false));

        this.head3_r5 = new ModelRenderer(this);
        this.head3_r5.setRotationPoint(0.0F, -2.2818F, -1.5459F);
        this.head.addChild(head3_r5);
        this.setRotateAngle(head3_r5, -0.8552F, 0.0F, 0.0F);
        this.head3_r5.cubeList.add(new ModelBox(head3_r5, 37, 43, -0.5F, -0.3F, -1.3F, 1, 1, 2, -0.303F, false));

        this.head2_r3 = new ModelRenderer(this);
        this.head2_r3.setRotationPoint(0.0F, -1.995F, -1.3273F);
        this.head.addChild(head2_r3);
        this.setRotateAngle(head2_r3, -0.3316F, 0.0F, 0.0F);
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 42, 14, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.3F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -1.9326F, -2.6832F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.1571F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 9, 25, -0.5F, -0.2141F, -1.2375F, 1, 1, 3, -0.297F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5224F, -1.2924F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.2832F, 0.202F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3908F, 0.0F, 0.0F);


        this.jaw10_r1 = new ModelRenderer(this);
        this.jaw10_r1.setRotationPoint(0.5F, 0.9108F, -5.2007F);
        this.jaw2.addChild(jaw10_r1);
        this.setRotateAngle(jaw10_r1, -0.384F, 0.0F, 0.0F);
        this.jaw10_r1.cubeList.add(new ModelBox(jaw10_r1, 55, 49, -1.0F, -0.8F, -0.8F, 1, 1, 1, -0.199F, true));

        this.jaw9_r1 = new ModelRenderer(this);
        this.jaw9_r1.setRotationPoint(0.5F, 1.0962F, -4.63F);
        this.jaw2.addChild(jaw9_r1);
        this.setRotateAngle(jaw9_r1, -0.3142F, 0.0F, 0.0F);
        this.jaw9_r1.cubeList.add(new ModelBox(jaw9_r1, 53, 9, -1.0F, -0.8F, -0.8F, 1, 1, 1, -0.2F, true));

        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, 0.6279F, -3.8359F);
        this.jaw2.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, 0.4189F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 58, 3, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.203F, true));
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 20, 57, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.2F, true));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-1.0F, 0.3906F, 0.0721F);
        this.jaw2.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.1571F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 52, 26, -0.5F, -0.8F, -0.9F, 1, 1, 1, -0.2F, true));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 52, 26, 1.5F, -0.8F, -0.9F, 1, 1, 1, -0.2F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-1.0F, -0.5403F, -0.6303F);
        this.jaw2.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.384F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 57, 24, -0.5F, -0.2F, 0.3F, 1, 1, 1, -0.203F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 56, 32, -0.5F, -0.2F, -0.2F, 1, 1, 1, -0.199F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 57, 24, 1.5F, -0.2F, 0.3F, 1, 1, 1, -0.203F, false));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 56, 32, 1.5F, -0.2F, -0.2F, 1, 1, 1, -0.199F, false));

        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(-0.2F, 0.489F, -2.0906F);
        this.jaw2.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, 0.2094F, 0.0F, 0.0F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 46, 8, -1.0F, -0.8307F, -1.7057F, 1, 1, 2, -0.2F, true));
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 46, 8, 0.4F, -0.8307F, -1.7057F, 1, 1, 2, -0.2F, false));

        this.jaw4_r2 = new ModelRenderer(this);
        this.jaw4_r2.setRotationPoint(-0.2F, -0.5F, -0.6F);
        this.jaw2.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, 0.1222F, 0.0F, 0.0F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 23, 40, -1.0F, -0.0307F, -1.8057F, 1, 1, 2, -0.199F, true));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 23, 40, 0.4F, -0.0307F, -1.8057F, 1, 1, 2, -0.199F, false));

        this.jaw13_r1 = new ModelRenderer(this);
        this.jaw13_r1.setRotationPoint(0.3F, 0.1272F, -5.9997F);
        this.jaw2.addChild(jaw13_r1);
        this.setRotateAngle(jaw13_r1, 0.2618F, 0.0F, 0.0F);
        this.jaw13_r1.cubeList.add(new ModelBox(jaw13_r1, 53, 6, -1.0F, -0.2809F, -1.3F, 1, 1, 1, -0.3F, true));
        this.jaw13_r1.cubeList.add(new ModelBox(jaw13_r1, 53, 3, -1.0F, -0.2809F, -1.1F, 1, 1, 1, -0.299F, true));
        this.jaw13_r1.cubeList.add(new ModelBox(jaw13_r1, 43, 52, -1.0F, -0.2809F, -0.7F, 1, 1, 1, -0.3F, true));

        this.jaw13_r2 = new ModelRenderer(this);
        this.jaw13_r2.setRotationPoint(0.3F, 0.638F, -5.8831F);
        this.jaw2.addChild(jaw13_r2);
        this.setRotateAngle(jaw13_r2, -0.2094F, 0.0F, 0.0F);
        this.jaw13_r2.cubeList.add(new ModelBox(jaw13_r2, 10, 56, -1.0F, -0.6809F, -0.4F, 1, 1, 1, -0.299F, true));

        this.jaw12_r1 = new ModelRenderer(this);
        this.jaw12_r1.setRotationPoint(0.3F, 0.6171F, -6.2825F);
        this.jaw2.addChild(jaw12_r1);
        this.setRotateAngle(jaw12_r1, -0.0524F, 0.0F, 0.0F);
        this.jaw12_r1.cubeList.add(new ModelBox(jaw12_r1, 53, 0, -1.0F, -0.6809F, -0.3F, 1, 1, 1, -0.305F, true));

        this.jaw12_r2 = new ModelRenderer(this);
        this.jaw12_r2.setRotationPoint(0.3F, 0.1272F, -5.9997F);
        this.jaw2.addChild(jaw12_r2);
        this.setRotateAngle(jaw12_r2, 0.1047F, 0.0F, 0.0F);
        this.jaw12_r2.cubeList.add(new ModelBox(jaw12_r2, 12, 44, -1.0F, -0.2809F, -0.3F, 1, 1, 2, -0.303F, true));

        this.jaw9_r2 = new ModelRenderer(this);
        this.jaw9_r2.setRotationPoint(0.3F, -0.2018F, -3.7198F);
        this.jaw2.addChild(jaw9_r2);
        this.setRotateAngle(jaw9_r2, 0.1571F, 0.0F, 0.0F);
        this.jaw9_r2.cubeList.add(new ModelBox(jaw9_r2, 45, 28, -1.0F, -0.2F, -1.5F, 1, 1, 2, -0.2F, true));
        this.jaw9_r2.cubeList.add(new ModelBox(jaw9_r2, 45, 28, -0.6F, -0.2F, -1.5F, 1, 1, 2, -0.2F, false));

        this.jaw5_r3 = new ModelRenderer(this);
        this.jaw5_r3.setRotationPoint(0.3F, -0.4245F, -3.7364F);
        this.jaw2.addChild(jaw5_r3);
        this.setRotateAngle(jaw5_r3, 0.3316F, 0.0F, 0.0F);
        this.jaw5_r3.cubeList.add(new ModelBox(jaw5_r3, 5, 47, -1.0F, -0.2307F, -1.8057F, 1, 1, 2, -0.199F, true));
        this.jaw5_r3.cubeList.add(new ModelBox(jaw5_r3, 5, 47, -0.6F, -0.2307F, -1.8057F, 1, 1, 2, -0.199F, false));

        this.jaw4_r3 = new ModelRenderer(this);
        this.jaw4_r3.setRotationPoint(-0.2F, -0.2911F, -1.9886F);
        this.jaw2.addChild(jaw4_r3);
        this.setRotateAngle(jaw4_r3, -0.0698F, 0.0F, 0.0F);
        this.jaw4_r3.cubeList.add(new ModelBox(jaw4_r3, 30, 11, -1.0F, -0.2307F, -2.0057F, 1, 1, 3, -0.2093F, true));
        this.jaw4_r3.cubeList.add(new ModelBox(jaw4_r3, 30, 11, 0.4F, -0.2307F, -2.0057F, 1, 1, 3, -0.2093F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-0.2F, -0.5F, -0.6F);
        this.jaw2.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.1571F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 39, 10, -1.0F, -0.2307F, -1.8057F, 1, 1, 2, -0.2F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 39, 10, 0.4F, -0.2307F, -1.8057F, 1, 1, 2, -0.2F, false));

        this.jaw12_r3 = new ModelRenderer(this);
        this.jaw12_r3.setRotationPoint(-0.3F, 0.1272F, -5.9997F);
        this.jaw2.addChild(jaw12_r3);
        this.setRotateAngle(jaw12_r3, 0.2618F, 0.0F, 0.0F);
        this.jaw12_r3.cubeList.add(new ModelBox(jaw12_r3, 53, 6, 0.0F, -0.2809F, -1.3F, 1, 1, 1, -0.3F, false));
        this.jaw12_r3.cubeList.add(new ModelBox(jaw12_r3, 53, 3, 0.0F, -0.2809F, -1.1F, 1, 1, 1, -0.299F, false));
        this.jaw12_r3.cubeList.add(new ModelBox(jaw12_r3, 43, 52, 0.0F, -0.2809F, -0.7F, 1, 1, 1, -0.3F, false));

        this.jaw12_r4 = new ModelRenderer(this);
        this.jaw12_r4.setRotationPoint(-0.3F, 0.638F, -5.8831F);
        this.jaw2.addChild(jaw12_r4);
        this.setRotateAngle(jaw12_r4, -0.2094F, 0.0F, 0.0F);
        this.jaw12_r4.cubeList.add(new ModelBox(jaw12_r4, 10, 56, 0.0F, -0.6809F, -0.4F, 1, 1, 1, -0.299F, false));

        this.jaw11_r1 = new ModelRenderer(this);
        this.jaw11_r1.setRotationPoint(-0.3F, 0.6171F, -6.2825F);
        this.jaw2.addChild(jaw11_r1);
        this.setRotateAngle(jaw11_r1, -0.0524F, 0.0F, 0.0F);
        this.jaw11_r1.cubeList.add(new ModelBox(jaw11_r1, 53, 0, 0.0F, -0.6809F, -0.3F, 1, 1, 1, -0.305F, false));

        this.jaw11_r2 = new ModelRenderer(this);
        this.jaw11_r2.setRotationPoint(-0.3F, 0.1272F, -5.9997F);
        this.jaw2.addChild(jaw11_r2);
        this.setRotateAngle(jaw11_r2, 0.1047F, 0.0F, 0.0F);
        this.jaw11_r2.cubeList.add(new ModelBox(jaw11_r2, 12, 44, 0.0F, -0.2809F, -0.3F, 1, 1, 2, -0.303F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.5F, 1.0962F, -4.63F);
        this.jaw2.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 0.0698F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 48, 5, -1.0F, -0.8F, -0.2F, 1, 1, 1, -0.203F, false));

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


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head4_r5 = new ModelRenderer(this);
        this.head4_r5.setRotationPoint(0.0F, 2.0849F, -1.0359F);
        this.head2.addChild(head4_r5);
        this.setRotateAngle(head4_r5, 0.0087F, 0.0F, 0.0F);
        this.head4_r5.cubeList.add(new ModelBox(head4_r5, 36, 29, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.015F, false));

        this.head3_r6 = new ModelRenderer(this);
        this.head3_r6.setRotationPoint(0.0F, 1.5589F, -2.0225F);
        this.head2.addChild(head3_r6);
        this.setRotateAngle(head3_r6, -0.0262F, 0.0F, 0.0F);
        this.head3_r6.cubeList.add(new ModelBox(head3_r6, 23, 36, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.015F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head9_r5 = new ModelRenderer(this);
        this.head9_r5.setRotationPoint(-0.2F, 1.5849F, -0.8424F);
        this.head5.addChild(head9_r5);
        this.setRotateAngle(head9_r5, 1.5533F, 0.0F, 0.0F);
        this.head9_r5.cubeList.add(new ModelBox(head9_r5, 25, 57, -0.5F, -0.4142F, -0.4F, 1, 1, 1, -0.303F, true));
        this.head9_r5.cubeList.add(new ModelBox(head9_r5, 25, 57, -0.1F, -0.4142F, -0.4F, 1, 1, 1, -0.303F, false));

        this.head8_r7 = new ModelRenderer(this);
        this.head8_r7.setRotationPoint(-0.2F, 2.0105F, -1.1585F);
        this.head5.addChild(head8_r7);
        this.setRotateAngle(head8_r7, 1.1345F, 0.0F, 0.0F);
        this.head8_r7.cubeList.add(new ModelBox(head8_r7, 44, 33, -0.5F, -0.2793F, -0.3181F, 1, 1, 2, -0.296F, true));
        this.head8_r7.cubeList.add(new ModelBox(head8_r7, 44, 33, -0.1F, -0.2793F, -0.3181F, 1, 1, 2, -0.296F, false));

        this.head8_r8 = new ModelRenderer(this);
        this.head8_r8.setRotationPoint(-0.2F, 1.6315F, -0.0556F);
        this.head5.addChild(head8_r8);
        this.setRotateAngle(head8_r8, 0.5934F, 0.0F, 0.0F);
        this.head8_r8.cubeList.add(new ModelBox(head8_r8, 44, 37, -0.5F, -0.6776F, -1.1663F, 1, 1, 2, -0.299F, true));
        this.head8_r8.cubeList.add(new ModelBox(head8_r8, 44, 37, -0.1F, -0.6776F, -1.1663F, 1, 1, 2, -0.299F, false));

        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(-0.2F, 2.7499F, -1.7137F);
        this.head5.addChild(head7_r5);
        this.setRotateAngle(head7_r5, 0.5236F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 27, 31, -0.5F, -0.6776F, -0.0663F, 1, 1, 3, -0.3F, true));
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 27, 31, -0.1F, -0.6776F, -0.0663F, 1, 1, 3, -0.3F, false));

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


        this.head11_r2 = new ModelRenderer(this);
        this.head11_r2.setRotationPoint(0.0F, 0.7888F, -1.1748F);
        this.head4.addChild(head11_r2);
        this.setRotateAngle(head11_r2, 1.7453F, 0.0F, 0.0F);
        this.head11_r2.cubeList.add(new ModelBox(head11_r2, 53, 53, -0.5F, -0.0114F, -0.8984F, 1, 1, 1, -0.014F, false));

        this.head10_r4 = new ModelRenderer(this);
        this.head10_r4.setRotationPoint(0.0F, 0.7366F, -1.6721F);
        this.head4.addChild(head10_r4);
        this.setRotateAngle(head10_r4, 1.4661F, 0.0F, 0.0F);
        this.head10_r4.cubeList.add(new ModelBox(head10_r4, 0, 58, -0.5F, -0.0114F, -0.7984F, 1, 1, 1, -0.01F, false));

        this.head9_r6 = new ModelRenderer(this);
        this.head9_r6.setRotationPoint(0.0F, 0.3956F, -2.0378F);
        this.head4.addChild(head9_r6);
        this.setRotateAngle(head9_r6, 0.8203F, 0.0F, 0.0F);
        this.head9_r6.cubeList.add(new ModelBox(head9_r6, 57, 56, -0.5F, -0.0114F, -0.7984F, 1, 1, 1, -0.014F, false));

        this.head9_r7 = new ModelRenderer(this);
        this.head9_r7.setRotationPoint(0.0F, 2.8607F, -3.4247F);
        this.head4.addChild(head9_r7);
        this.setRotateAngle(head9_r7, 0.192F, 0.0F, 0.0F);
        this.head9_r7.cubeList.add(new ModelBox(head9_r7, 48, 53, -0.5F, -0.6F, -0.8F, 1, 1, 1, 0.01F, false));

        this.head8_r9 = new ModelRenderer(this);
        this.head8_r9.setRotationPoint(0.0F, 0.95F, -4.5F);
        this.head4.addChild(head8_r9);
        this.setRotateAngle(head8_r9, 1.2043F, 0.0F, 0.0F);
        this.head8_r9.cubeList.add(new ModelBox(head8_r9, 37, 33, -0.5F, 0.1886F, -1.0984F, 1, 2, 2, -0.03F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, 2.2232F, -4.3226F);
        this.head4.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 1.4137F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 41, 4, -0.5F, -0.5625F, -0.5F, 1, 1, 2, -0.02F, false));

        this.head5_r4 = new ModelRenderer(this);
        this.head5_r4.setRotationPoint(0.0F, 0.35F, 0.1F);
        this.head4.addChild(head5_r4);
        this.setRotateAngle(head5_r4, -0.0524F, 0.0F, 0.0F);
        this.head5_r4.cubeList.add(new ModelBox(head5_r4, 19, 44, -1.0F, 0.9F, 0.0F, 2, 2, 1, 0.003F, false));
        this.head5_r4.cubeList.add(new ModelBox(head5_r4, 21, 0, -1.0F, 0.9F, -3.0F, 2, 2, 3, 0.003F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -4.7836F, 4.6646F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, -3.2671F, -9.6413F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -3.0892F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 12, 48, -0.5F, -1.9753F, 0.0053F, 1, 2, 1, 0.003F, false));

        this.crest5_r1 = new ModelRenderer(this);
        this.crest5_r1.setRotationPoint(0.0F, 1.044F, -8.721F);
        this.crest1.addChild(crest5_r1);
        this.setRotateAngle(crest5_r1, -0.7941F, 0.0F, 0.0F);
        this.crest5_r1.cubeList.add(new ModelBox(crest5_r1, 22, 50, -0.5F, -0.0186F, -0.3347F, 1, 2, 1, 0.0F, false));

        this.crest4_r2 = new ModelRenderer(this);
        this.crest4_r2.setRotationPoint(0.0F, 0.1652F, -9.1981F);
        this.crest1.addChild(crest4_r2);
        this.setRotateAngle(crest4_r2, -1.0734F, 0.0F, 0.0F);
        this.crest4_r2.cubeList.add(new ModelBox(crest4_r2, 15, 55, -0.5F, -0.0186F, -0.0347F, 1, 1, 1, 0.004F, false));

        this.crest3_r1 = new ModelRenderer(this);
        this.crest3_r1.setRotationPoint(0.0F, -2.342F, -11.086F);
        this.crest1.addChild(crest3_r1);
        this.setRotateAngle(crest3_r1, -1.3177F, 0.0F, 0.0F);
        this.crest3_r1.cubeList.add(new ModelBox(crest3_r1, 47, 22, -0.5F, -1.2186F, 1.2653F, 1, 1, 2, 0.0F, false));

        this.crest8_r1 = new ModelRenderer(this);
        this.crest8_r1.setRotationPoint(0.0F, -4.2092F, -9.4572F);
        this.crest1.addChild(crest8_r1);
        this.setRotateAngle(crest8_r1, -0.2356F, 0.0F, 0.0F);
        this.crest8_r1.cubeList.add(new ModelBox(crest8_r1, 51, 36, -0.5F, -0.3506F, -0.7632F, 1, 2, 1, -0.198F, false));

        this.crest8_r2 = new ModelRenderer(this);
        this.crest8_r2.setRotationPoint(0.0F, 1.906F, -7.9678F);
        this.crest1.addChild(crest8_r2);
        this.setRotateAngle(crest8_r2, -1.3177F, 0.0F, 0.0F);
        this.crest8_r2.cubeList.add(new ModelBox(crest8_r2, 30, 58, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.2F, false));

        this.crest7_r1 = new ModelRenderer(this);
        this.crest7_r1.setRotationPoint(0.0F, 1.7939F, -7.7524F);
        this.crest1.addChild(crest7_r1);
        this.setRotateAngle(crest7_r1, -1.6668F, 0.0F, 0.0F);
        this.crest7_r1.cubeList.add(new ModelBox(crest7_r1, 10, 52, -0.5F, -0.6437F, -0.5085F, 1, 2, 1, -0.198F, false));

        this.crest7_r2 = new ModelRenderer(this);
        this.crest7_r2.setRotationPoint(0.0F, -4.7552F, -9.2084F);
        this.crest1.addChild(crest7_r2);
        this.setRotateAngle(crest7_r2, -0.4276F, 0.0F, 0.0F);
        this.crest7_r2.cubeList.add(new ModelBox(crest7_r2, 15, 58, -0.5F, -0.2506F, -0.7632F, 1, 1, 1, -0.2F, false));

        this.crest6_r1 = new ModelRenderer(this);
        this.crest6_r1.setRotationPoint(0.0F, -4.3621F, -10.16F);
        this.crest1.addChild(crest6_r1);
        this.setRotateAngle(crest6_r1, -0.672F, 0.0F, 0.0F);
        this.crest6_r1.cubeList.add(new ModelBox(crest6_r1, 58, 9, -0.5F, -1.1506F, -0.2632F, 1, 1, 1, -0.199F, false));
        this.crest6_r1.cubeList.add(new ModelBox(crest6_r1, 58, 6, -0.5F, -0.8506F, -0.2632F, 1, 1, 1, -0.2F, false));

        this.crest4_r3 = new ModelRenderer(this);
        this.crest4_r3.setRotationPoint(0.0F, -3.0741F, -10.7177F);
        this.crest1.addChild(crest4_r3);
        this.setRotateAngle(crest4_r3, -0.48F, 0.0F, 0.0F);
        this.crest4_r3.cubeList.add(new ModelBox(crest4_r3, 5, 58, -0.5F, -1.6506F, -0.3632F, 1, 1, 1, -0.2F, false));

        this.crest3_r2 = new ModelRenderer(this);
        this.crest3_r2.setRotationPoint(0.0F, -3.0741F, -10.7177F);
        this.crest1.addChild(crest3_r2);
        this.setRotateAngle(crest3_r2, -0.3229F, 0.0F, 0.0F);
        this.crest3_r2.cubeList.add(new ModelBox(crest3_r2, 58, 0, -0.5F, -0.9617F, -0.0593F, 1, 1, 1, -0.025F, false));

        this.crest4_r4 = new ModelRenderer(this);
        this.crest4_r4.setRotationPoint(0.0F, -2.2578F, -10.9323F);
        this.crest1.addChild(crest4_r4);
        this.setRotateAngle(crest4_r4, -0.2705F, 0.0F, 0.0F);
        this.crest4_r4.cubeList.add(new ModelBox(crest4_r4, 5, 55, -0.5F, -0.9617F, -0.0593F, 1, 1, 1, -0.02F, false));

        this.crest3_r3 = new ModelRenderer(this);
        this.crest3_r3.setRotationPoint(0.0F, 0.6236F, -11.2606F);
        this.crest1.addChild(crest3_r3);
        this.setRotateAngle(crest3_r3, -0.1134F, 0.0F, 0.0F);
        this.crest3_r3.cubeList.add(new ModelBox(crest3_r3, 48, 0, -0.5F, -2.9617F, -0.0593F, 1, 3, 1, -0.02F, false));

        this.crest3_r4 = new ModelRenderer(this);
        this.crest3_r4.setRotationPoint(0.0F, 4.42F, -11.4264F);
        this.crest1.addChild(crest3_r4);
        this.setRotateAngle(crest3_r4, -0.0436F, 0.0F, 0.0F);
        this.crest3_r4.cubeList.add(new ModelBox(crest3_r4, 30, 55, -0.5F, -4.7617F, 0.8407F, 1, 1, 1, -0.02F, false));
        this.crest3_r4.cubeList.add(new ModelBox(crest3_r4, 24, 24, -0.5F, -3.8617F, -0.0593F, 1, 4, 2, -0.024F, false));

        this.crest5_r2 = new ModelRenderer(this);
        this.crest5_r2.setRotationPoint(0.0F, 2.8193F, -8.8688F);
        this.crest1.addChild(crest5_r2);
        this.setRotateAngle(crest5_r2, -0.8814F, 0.0F, 0.0F);
        this.crest5_r2.cubeList.add(new ModelBox(crest5_r2, 55, 43, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.crest4_r5 = new ModelRenderer(this);
        this.crest4_r5.setRotationPoint(0.0F, 3.317F, -8.9168F);
        this.crest1.addChild(crest4_r5);
        this.setRotateAngle(crest4_r5, -0.096F, 0.0F, 0.0F);
        this.crest4_r5.cubeList.add(new ModelBox(crest4_r5, 27, 50, -0.5F, -1.0F, -1.0F, 1, 2, 1, -0.027F, false));

        this.crest3_r5 = new ModelRenderer(this);
        this.crest3_r5.setRotationPoint(0.0F, 2.6229F, -9.9059F);
        this.crest1.addChild(crest3_r5);
        this.setRotateAngle(crest3_r5, 0.5323F, 0.0F, 0.0F);
        this.crest3_r5.cubeList.add(new ModelBox(crest3_r5, 42, 55, -0.5F, 1.0F, -0.5F, 1, 1, 1, -0.02F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.0229F, 0.2716F, -0.521F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 38, 47, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 50, 45, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.6977F, 1.0403F, 2.7875F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 32, 36, -0.9072F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 0, 38, -0.9072F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 12, 39, -0.3631F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.3415F, 4.754F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.0044F, 0.1681F, 0.5806F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 18, 36, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.1172F, 5.6557F, 0.301F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.8984F, 0.1508F, -2.7784F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.309F, 0.4545F, 0.3265F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 15, 11, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 11, -0.5F, -1.0F, 0.2F, 1, 1, 6, -0.2F, false));

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
        this.setRotateAngle(lefthand2, -0.3371F, -1.3691F, 0.4229F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 9, 35, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(0.5397F, 0.1609F, 0.9501F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, -0.5F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.2917F, 0.2793F, -0.1116F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 38, 47, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 50, 45, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.6699F, -0.8669F, -2.8215F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 32, 36, -0.0928F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 0, 38, -0.0928F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 12, 39, -0.6369F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.3415F, 4.754F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0141F, -0.6041F, -0.5303F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 18, 36, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.1172F, 5.6557F, 0.301F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.8984F, -0.1508F, 2.7784F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.309F, -0.4545F, -0.3265F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 15, 11, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 11, -0.5F, -1.0F, 0.2F, 1, 1, 6, -0.2F, true));

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
        this.setRotateAngle(righthand2, -0.3371F, 1.3691F, -0.4229F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 9, 35, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-0.5397F, 0.1609F, 0.9501F);
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
