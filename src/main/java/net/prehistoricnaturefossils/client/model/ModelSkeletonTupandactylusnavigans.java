package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTupandactylusnavigans extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest6_r3;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest5_r6;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest4_r6;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r7;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest3_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body7_r2;
    private final ModelRenderer chest6_r5;
    private final ModelRenderer chest7_r2;
    private final ModelRenderer chest8_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r3;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body6_r4;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer chest5_r8;
    private final ModelRenderer chest7_r3;
    private final ModelRenderer chest6_r6;
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
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head6_r4;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw9_r1;
    private final ModelRenderer jaw9_r2;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw7_r2;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw5_r3;
    private final ModelRenderer jaw5_r4;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head2_r3;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head6_r5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head7_r5;
    private final ModelRenderer head6_r6;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer crest1;
    private final ModelRenderer crest4_r1;
    private final ModelRenderer crest8_r1;
    private final ModelRenderer crest7_r1;
    private final ModelRenderer crest6_r1;
    private final ModelRenderer crest6_r2;
    private final ModelRenderer crest6_r3;
    private final ModelRenderer crest6_r4;
    private final ModelRenderer crest4_r2;
    private final ModelRenderer crest3_r1;
    private final ModelRenderer crest2_r1;
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

    public ModelSkeletonTupandactylusnavigans() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 7.425F, -0.9694F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.2728F, -0.0355F, -0.126F);


        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-2.2F, 1.5037F, -2.9469F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 1.4822F, 0.5761F, -0.0103F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 66, 9, -0.6334F, -0.4061F, 0.0149F, 1, 1, 2, -0.2F, true));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 0.0357F, 0.2474F, 0.0746F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 56, 49, -0.9074F, -0.181F, 2.6195F, 1, 1, 3, -0.2F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.1826F, 0.0458F, -0.6994F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 73, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, 0.1239F, 0.142F, -1.3057F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 66, 27, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-2.2F, 3.3037F, -1.5469F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 2.2444F, 0.6105F, -0.2383F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 57, 9, 0.5174F, -0.0211F, -0.6544F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1579F, 0.2474F, 0.0746F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 33, 52, -0.9074F, 0.1775F, -0.0121F, 1, 1, 3, -0.2F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 72, 72, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 52, 20, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 72, 70, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 66, 25, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(2.2F, 1.5037F, -2.9469F);
        this.chest1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 1.4822F, -0.5761F, 0.0103F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 66, 9, -0.3666F, -0.4061F, 0.0149F, 1, 1, 2, -0.2F, false));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, 3.3037F, -1.5469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 2.2444F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 57, 9, -1.5174F, -0.0211F, -0.6544F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.0357F, -0.2474F, -0.0746F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 56, 49, -0.0926F, -0.181F, 2.6195F, 1, 1, 3, -0.2F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1579F, -0.2474F, -0.0746F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 33, 52, -0.0926F, 0.1775F, -0.0121F, 1, 1, 3, -0.2F, false));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1239F, -0.142F, 1.3057F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 66, 27, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.chest5_r6 = new ModelRenderer(this);
        this.chest5_r6.setRotationPoint(0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest5_r6);
        this.setRotateAngle(chest5_r6, 0.1826F, -0.0458F, 0.6994F);
        this.chest5_r6.cubeList.add(new ModelBox(chest5_r6, 73, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 72, 72, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r6 = new ModelRenderer(this);
        this.chest4_r6.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r6);
        this.setRotateAngle(chest4_r6, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r6.cubeList.add(new ModelBox(chest4_r6, 52, 20, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 72, 70, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, -0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 28, 44, -1.5F, 1.8311F, -0.3217F, 3, 1, 3, 0.0F, false));

        this.chest5_r7 = new ModelRenderer(this);
        this.chest5_r7.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r7);
        this.setRotateAngle(chest5_r7, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r7.cubeList.add(new ModelBox(chest5_r7, 66, 25, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.0F, -1.1F, 1.1F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.0F, 0.0F, 0.0F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 28, 35, 0.0F, -0.3924F, 1.0318F, 0, 1, 1, 0.0F, false));
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 65, 55, -0.5F, 0.0076F, 0.0318F, 1, 1, 2, 0.003F, false));

        this.chest3_r4 = new ModelRenderer(this);
        this.chest3_r4.setRotationPoint(0.0F, -0.4F, -2.5F);
        this.chest1.addChild(chest3_r4);
        this.setRotateAngle(chest3_r4, 0.1047F, 0.0F, 0.0F);
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 42, 52, 0.0F, -0.7123F, 2.6852F, 0, 1, 1, 0.0F, false));
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 10, 52, 0.0F, -0.7123F, 0.6852F, 0, 1, 1, 0.0F, false));
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 46, 22, -0.5F, -0.3123F, -0.3148F, 1, 1, 4, 0.003F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.2F, 2.9F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.0407F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.6232F, 5.3849F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 10, 49, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.7488F, 1.7871F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 10, 46, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 10, 55, 0.0F, -0.5F, -0.9F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 32, -0.5F, -0.1F, -1.9F, 1, 1, 6, 0.0F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-0.5397F, 1.9304F, 3.5211F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -1.3277F, 0.1083F, -0.5174F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 30, 70, -0.3482F, -0.4755F, -0.4833F, 1, 2, 1, -0.31F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-0.5397F, 2.0304F, 2.3211F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -1.1183F, 0.1083F, -0.5174F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 72, 49, -0.4288F, -0.2595F, -0.1792F, 1, 1, 1, -0.2F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, -0.531F, 5.5265F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -1.9809F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 66, 13, -0.5F, -0.5F, -0.6F, 1, 1, 2, -0.31F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 66, 13, 2.3F, -0.5F, -0.6F, 1, 1, 2, -0.31F, false));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-1.4F, 0.2372F, 4.7401F);
        this.body1.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 0.1309F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 40, 64, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 40, 64, 2.3F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(-1.6F, 2.0093F, 5.1447F);
        this.body1.addChild(body7_r2);
        this.setRotateAngle(body7_r2, -1.501F, 0.0F, -0.6545F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 10, 62, 0.5958F, -0.1553F, -1.027F, 1, 2, 2, -0.31F, true));

        this.chest6_r5 = new ModelRenderer(this);
        this.chest6_r5.setRotationPoint(-0.5F, -0.4924F, 3.1994F);
        this.body1.addChild(chest6_r5);
        this.setRotateAngle(chest6_r5, 0.2031F, 0.0116F, -0.9814F);
        this.chest6_r5.cubeList.add(new ModelBox(chest6_r5, 73, 12, -0.9869F, -0.0493F, -0.8967F, 1, 0, 1, 0.0F, true));

        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, -0.5987F, 0.796F);
        this.body1.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.2228F, 0.0794F, -0.6969F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 73, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest8_r1 = new ModelRenderer(this);
        this.chest8_r1.setRotationPoint(-0.5F, -0.5987F, 0.796F);
        this.body1.addChild(chest8_r1);
        this.setRotateAngle(chest8_r1, 0.1379F, 0.1925F, -1.3033F);
        this.chest8_r1.cubeList.add(new ModelBox(chest8_r1, 66, 44, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.6F, 0.2093F, 4.9447F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.0472F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 58, 63, -0.5F, -0.8145F, 0.2098F, 1, 2, 2, -0.3F, true));

        this.body7_r3 = new ModelRenderer(this);
        this.body7_r3.setRotationPoint(-1.4F, -0.3831F, 3.5879F);
        this.body1.addChild(body7_r3);
        this.setRotateAngle(body7_r3, 0.0785F, 0.0F, 0.0F);
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 51, 63, -0.5F, -0.2913F, -0.4F, 1, 2, 2, -0.3F, true));
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 51, 63, 2.3F, -0.2913F, -0.4F, 1, 2, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.8061F, 5.6461F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.4102F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 66, 33, -0.5F, -0.4F, -1.0F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 66, 33, 2.3F, -0.4F, -1.0F, 1, 1, 2, -0.31F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-0.5F, -0.372F, 4.7976F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.192F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 57, 42, -1.0F, -0.2F, -1.3F, 2, 1, 2, -0.3F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 57, 42, 0.0F, -0.2F, -1.3F, 2, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.3234F, 3.571F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.1094F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 56, 54, -0.3604F, -0.3644F, -2.7508F, 1, 1, 3, -0.3F, true));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.5397F, 2.0304F, 2.3211F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -1.1183F, -0.1083F, 0.5174F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 72, 49, -0.5712F, -0.2595F, -0.1792F, 1, 1, 1, -0.2F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.5397F, 1.9304F, 3.5211F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -1.3277F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 30, 70, -0.6518F, -0.4755F, -0.4833F, 1, 2, 1, -0.31F, false));

        this.body6_r4 = new ModelRenderer(this);
        this.body6_r4.setRotationPoint(1.6F, 2.0093F, 5.1447F);
        this.body1.addChild(body6_r4);
        this.setRotateAngle(body6_r4, -1.501F, 0.0F, 0.6545F);
        this.body6_r4.cubeList.add(new ModelBox(body6_r4, 10, 62, -1.5958F, -0.1553F, -1.027F, 1, 2, 2, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.6F, 0.2093F, 4.9447F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0472F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 58, 63, -0.5F, -0.8145F, 0.2098F, 1, 2, 2, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, -0.3234F, 3.571F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.1094F, 0.1854F, -0.0503F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 56, 54, -0.6396F, -0.3644F, -2.7508F, 1, 1, 3, -0.3F, false));

        this.chest5_r8 = new ModelRenderer(this);
        this.chest5_r8.setRotationPoint(0.5F, -0.4924F, 3.1994F);
        this.body1.addChild(chest5_r8);
        this.setRotateAngle(chest5_r8, 0.2031F, -0.0116F, 0.9814F);
        this.chest5_r8.cubeList.add(new ModelBox(chest5_r8, 73, 12, -0.0131F, -0.0493F, -0.8967F, 1, 0, 1, 0.0F, false));

        this.chest7_r3 = new ModelRenderer(this);
        this.chest7_r3.setRotationPoint(0.5F, -0.5987F, 0.796F);
        this.body1.addChild(chest7_r3);
        this.setRotateAngle(chest7_r3, 0.1379F, -0.1925F, 1.3033F);
        this.chest7_r3.cubeList.add(new ModelBox(chest7_r3, 66, 44, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest6_r6 = new ModelRenderer(this);
        this.chest6_r6.setRotationPoint(0.5F, -0.5987F, 0.796F);
        this.body1.addChild(chest6_r6);
        this.setRotateAngle(chest6_r6, 0.2228F, -0.0794F, 0.6969F);
        this.chest6_r6.cubeList.add(new ModelBox(chest6_r6, 73, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.3512F, 5.6871F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2208F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 62, 5, -0.5F, -1.0604F, 0.0341F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, 0.5665F, 4.3625F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 1.0142F, -0.1502F, -1.3956F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 57, 0, -0.3039F, 0.0711F, -0.3881F, 1, 7, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.31F, 7.0094F, 0.2905F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4685F, 0.2917F, 0.1681F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 18, 45, -1.15F, -2.0F, -0.5F, 1, 11, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 13, 45, -0.05F, -2.0F, -0.5F, 1, 11, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0171F, 10.3798F, 0.6075F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.1865F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 28, 38, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, 0.5665F, 4.3625F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.9928F, 0.2975F, 1.2995F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 5, 57, -0.6961F, 0.0711F, -0.3881F, 1, 7, 1, 0.0F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.31F, 7.0094F, 0.2905F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4685F, -0.2917F, -0.1681F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 0, 46, 0.15F, -2.0F, -0.5F, 1, 11, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 23, 45, -0.95F, -2.0F, -0.5F, 1, 11, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0171F, 10.3798F, 0.6075F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.2301F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 40, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

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
        this.setRotateAngle(neck1, -0.1575F, -0.1157F, 0.1067F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0436F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 43, 69, 0.0F, -1.2F, -0.7F, 0, 1, 1, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 47, 64, 0.0F, -1.2F, -2.7F, 0, 1, 1, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 15, 32, -0.5F, -0.9F, -3.7F, 1, 1, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4445F, -3.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1305F, 0.0406F, 0.0254F);
        this.neck2.cubeList.add(new ModelBox(neck2, 46, 34, -0.5F, -0.4178F, -3.9187F, 1, 1, 4, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 28, 32, 0.0F, -0.7178F, -2.9187F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 42, 55, 0.0F, -0.7178F, -0.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -3.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.129F, -0.3002F, -0.2163F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 35, 70, 0.0F, -0.6F, -1.5F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 57, 24, -0.5F, -0.3F, -2.5F, 1, 1, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2335F, -3.4161F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.8814F, 0.0F, 0.0F);


        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-0.71F, -0.3262F, 0.3578F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -1.1519F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 72, 52, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.203F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 72, 52, 0.92F, -0.5F, -0.6F, 1, 1, 1, -0.203F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(-0.71F, -0.8262F, 0.4578F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, -1.9373F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 53, 72, -0.5F, -0.8053F, -0.1839F, 1, 1, 1, -0.2F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 53, 72, 0.92F, -0.8053F, -0.1839F, 1, 1, 1, -0.2F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(-0.87F, 0.0271F, 0.725F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, -0.7941F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 72, 67, -0.51F, -0.45F, -0.8F, 1, 1, 1, -0.35F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 72, 55, -0.35F, -0.45F, -0.8F, 1, 1, 1, -0.2F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 72, 67, 1.25F, -0.45F, -0.8F, 1, 1, 1, -0.35F, false));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 72, 55, 1.09F, -0.45F, -0.8F, 1, 1, 1, -0.2F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-0.71F, 0.3184F, 0.2774F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -0.192F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 0, 71, -0.5F, -1.0F, -0.7F, 1, 2, 1, -0.2F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 0, 71, 0.92F, -1.0F, -0.7F, 1, 2, 1, -0.2F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(-0.71F, 0.131F, 0.4766F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.6894F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 5, 72, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.203F, true));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 5, 72, 0.92F, -1.0F, -0.5F, 1, 2, 1, -0.203F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(-0.82F, 0.4461F, 1.0845F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -0.8901F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 69, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.3F, true));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.82F, 0.4461F, 1.0845F);
        this.head.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.8901F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 69, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.3F, false));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(0.0F, -1.4412F, 2.8191F);
        this.head.addChild(head7_r3);
        this.setRotateAngle(head7_r3, 0.2531F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 57, 14, -0.5F, -0.5F, -2.4F, 1, 1, 3, 0.003F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, -0.3862F, 2.9134F);
        this.head.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 1.1257F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 10, 67, -1.0F, -1.0393F, 0.0117F, 2, 1, 1, 0.003F, false));

        this.head6_r4 = new ModelRenderer(this);
        this.head6_r4.setRotationPoint(0.5F, 0.3138F, 2.2134F);
        this.head.addChild(head6_r4);
        this.setRotateAngle(head6_r4, 0.8988F, 0.0F, 0.0F);
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 17, 67, -1.5F, -1.6273F, -0.0047F, 2, 1, 1, -0.007F, false));
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 66, 41, -1.5F, -0.9273F, -0.0047F, 2, 1, 1, 0.007F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.5F, 0.5138F, 2.3134F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.7941F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 66, 17, -1.5F, -2.1388F, -0.9322F, 2, 2, 1, 0.003F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.5F, 0.9138F, 1.6134F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, 0.4974F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 10, 58, -1.5F, -1.2683F, -2.2364F, 2, 1, 2, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -0.2955F, 0.5649F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.5882F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 57, 29, -1.0F, -1.1F, -1.0F, 2, 2, 2, -0.003F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, -1.6825F, -0.9527F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -0.3665F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 31, 66, -0.5F, -0.5F, -0.2F, 1, 1, 2, -0.23F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, -1.6825F, -0.9527F);
        this.head.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.5934F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 66, 29, -0.5F, -0.5F, -0.2F, 1, 1, 2, -0.2199F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -1.7825F, -0.7527F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, -0.1396F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 66, 37, -0.5F, -0.3053F, -1.8099F, 1, 1, 2, -0.2F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6535F, -0.0432F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4712F, 0.0F, 0.0F);


        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.5F, -0.6971F, -4.0606F);
        this.jaw.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.4363F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 57, 34, -1.5F, -0.7809F, -1.4428F, 2, 1, 2, -0.2F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.5F, -0.4971F, -2.3606F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.2793F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 33, 57, -1.5F, -0.5046F, -1.9321F, 2, 1, 2, -0.203F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.5F, -0.3882F, -0.9809F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.2443F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 57, 38, -1.5F, -0.2834F, -1.7395F, 2, 1, 2, -0.2F, false));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 0.1403F, -0.4696F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.5411F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 60, 59, -1.0F, -0.5F, -0.9F, 2, 1, 2, -0.203F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.1772F, -0.2629F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 46, 28, -0.5F, -1.9269F, -8.5293F, 1, 1, 4, -0.204F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(0.0F, -2.0819F, -2.1653F);
        this.jaw5.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, 0.3142F, 0.0F, 0.0F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 48, 72, -0.5F, -0.1798F, -0.2724F, 1, 1, 1, -0.204F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.6F, -4.1F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw9_r1 = new ModelRenderer(this);
        this.jaw9_r1.setRotationPoint(0.0F, -0.43F, -2.6413F);
        this.jaw4.addChild(jaw9_r1);
        this.setRotateAngle(jaw9_r1, 2.5307F, 0.0F, 0.0F);
        this.jaw9_r1.cubeList.add(new ModelBox(jaw9_r1, 57, 68, -0.5F, -0.2445F, -0.809F, 1, 2, 1, -0.202F, false));

        this.jaw9_r2 = new ModelRenderer(this);
        this.jaw9_r2.setRotationPoint(0.0F, -0.03F, -2.1413F);
        this.jaw4.addChild(jaw9_r2);
        this.setRotateAngle(jaw9_r2, 2.81F, 0.0F, 0.0F);
        this.jaw9_r2.cubeList.add(new ModelBox(jaw9_r2, 52, 68, -0.5F, -0.1703F, -1.0717F, 1, 2, 1, -0.2F, false));
        this.jaw9_r2.cubeList.add(new ModelBox(jaw9_r2, 47, 68, -0.5F, -0.1703F, -0.7717F, 1, 2, 1, -0.203F, false));

        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, -0.832F, -3.0408F);
        this.jaw4.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, 2.3038F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 38, 69, -0.5F, -0.2191F, -0.7999F, 1, 2, 1, -0.2F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, -1.932F, -2.8408F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 2.1642F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 33, 61, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.199F, false));

        this.jaw7_r2 = new ModelRenderer(this);
        this.jaw7_r2.setRotationPoint(0.0F, -0.1049F, -0.7906F);
        this.jaw4.addChild(jaw7_r2);
        this.setRotateAngle(jaw7_r2, -0.3491F, 0.0F, 0.0F);
        this.jaw7_r2.cubeList.add(new ModelBox(jaw7_r2, 62, 0, -0.5F, -1.7614F, -1.8253F, 1, 2, 2, -0.197F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, 0.1951F, -1.3906F);
        this.jaw4.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 0.4712F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 69, 4, -0.5F, -1.7563F, -0.1545F, 1, 2, 1, -0.199F, false));

        this.jaw5_r3 = new ModelRenderer(this);
        this.jaw5_r3.setRotationPoint(0.0F, -1.5626F, -0.3172F);
        this.jaw4.addChild(jaw5_r3);
        this.setRotateAngle(jaw5_r3, 0.8901F, 0.0F, 0.0F);
        this.jaw5_r3.cubeList.add(new ModelBox(jaw5_r3, 24, 62, -0.5F, -1.7949F, -0.8773F, 1, 2, 2, -0.199F, false));

        this.jaw5_r4 = new ModelRenderer(this);
        this.jaw5_r4.setRotationPoint(0.0F, -2.1109F, -1.7581F);
        this.jaw4.addChild(jaw5_r4);
        this.setRotateAngle(jaw5_r4, 1.6755F, 0.0F, 0.0F);
        this.jaw5_r4.cubeList.add(new ModelBox(jaw5_r4, 72, 46, -0.5F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));
        this.jaw5_r4.cubeList.add(new ModelBox(jaw5_r4, 17, 62, -0.5F, -1.3F, -1.0F, 1, 2, 2, -0.2F, false));

        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.5772F, -3.4629F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.4772F, -1.6629F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head2_r3 = new ModelRenderer(this);
        this.head2_r3.setRotationPoint(0.0F, 2.3F, 0.2F);
        this.head2.addChild(head2_r3);
        this.setRotateAngle(head2_r3, -0.1309F, 0.0F, 0.0F);
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 15, 39, -1.0F, -0.7932F, -3.7226F, 2, 1, 4, -0.204F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head6_r5 = new ModelRenderer(this);
        this.head6_r5.setRotationPoint(0.0F, 1.6315F, 1.1444F);
        this.head5.addChild(head6_r5);
        this.setRotateAngle(head6_r5, 0.2618F, 0.0F, 0.0F);
        this.head6_r5.cubeList.add(new ModelBox(head6_r5, 46, 40, -0.5F, -1.0505F, -3.9518F, 1, 1, 4, 0.0F, false));

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


        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(0.0F, 1.1896F, -5.0886F);
        this.head4.addChild(head7_r4);
        this.setRotateAngle(head7_r4, 0.6283F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 66, 21, -0.5F, -0.0115F, 0.0232F, 1, 1, 2, -0.01F, false));

        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(0.0F, 2.3896F, -6.2886F);
        this.head4.addChild(head7_r5);
        this.setRotateAngle(head7_r5, 0.8727F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 57, 19, -0.5F, 1.0364F, 1.1138F, 1, 1, 3, -0.018F, false));
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 65, 51, -0.5F, 0.1364F, -0.0862F, 1, 1, 2, -0.021F, false));

        this.head6_r6 = new ModelRenderer(this);
        this.head6_r6.setRotationPoint(0.0F, 4.0226F, 1.1536F);
        this.head4.addChild(head6_r6);
        this.setRotateAngle(head6_r6, -0.096F, 0.0F, 0.0F);
        this.head6_r6.cubeList.add(new ModelBox(head6_r6, 19, 58, -1.0F, -0.7706F, -1.6901F, 2, 1, 2, -0.2F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 3.7225F, 1.3443F);
        this.head4.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.3316F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 24, 67, -1.0F, -0.4F, -0.4F, 2, 1, 1, -0.2F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, 1.2477F, -3.4164F);
        this.head4.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -0.8203F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 25, 70, -0.5F, -1.1F, 0.0F, 1, 2, 1, 0.006F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -6.2568F, 7.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, 5.1692F, -10.8737F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -1.946F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 70, 63, -0.5F, -1.0F, -0.7F, 1, 2, 1, 0.003F, false));

        this.crest8_r1 = new ModelRenderer(this);
        this.crest8_r1.setRotationPoint(0.0F, 5.218F, -9.3255F);
        this.crest1.addChild(crest8_r1);
        this.setRotateAngle(crest8_r1, -1.8762F, 0.0F, 0.0F);
        this.crest8_r1.cubeList.add(new ModelBox(crest8_r1, 67, 69, -0.5F, -0.2839F, -0.4074F, 1, 2, 1, -0.195F, false));

        this.crest7_r1 = new ModelRenderer(this);
        this.crest7_r1.setRotationPoint(0.0F, 5.218F, -9.2255F);
        this.crest1.addChild(crest7_r1);
        this.setRotateAngle(crest7_r1, -1.3177F, 0.0F, 0.0F);
        this.crest7_r1.cubeList.add(new ModelBox(crest7_r1, 15, 70, -0.5F, -0.1863F, -0.429F, 1, 2, 1, -0.199F, false));

        this.crest6_r1 = new ModelRenderer(this);
        this.crest6_r1.setRotationPoint(0.0F, 1.8896F, 9.7614F);
        this.crest1.addChild(crest6_r1);
        this.setRotateAngle(crest6_r1, -1.2479F, 0.0F, 0.0F);
        this.crest6_r1.cubeList.add(new ModelBox(crest6_r1, 65, 46, -0.5F, 20.5308F, -4.5587F, 1, 2, 2, -0.028F, false));

        this.crest6_r2 = new ModelRenderer(this);
        this.crest6_r2.setRotationPoint(0.0F, -1.6917F, -13.3011F);
        this.crest1.addChild(crest6_r2);
        this.setRotateAngle(crest6_r2, 0.3403F, 0.0F, 0.0F);
        this.crest6_r2.cubeList.add(new ModelBox(crest6_r2, 41, 38, -0.5F, -11.8209F, -0.3636F, 1, 12, 1, -0.31F, false));

        this.crest6_r3 = new ModelRenderer(this);
        this.crest6_r3.setRotationPoint(0.0F, -1.8917F, -13.3011F);
        this.crest1.addChild(crest6_r3);
        this.setRotateAngle(crest6_r3, 0.3229F, 0.0F, 0.0F);
        this.crest6_r3.cubeList.add(new ModelBox(crest6_r3, 5, 66, -0.5F, -0.2518F, -0.4248F, 1, 4, 1, -0.3F, false));

        this.crest6_r4 = new ModelRenderer(this);
        this.crest6_r4.setRotationPoint(0.0F, 0.9083F, -12.1011F);
        this.crest1.addChild(crest6_r4);
        this.setRotateAngle(crest6_r4, 1.0908F, 0.0F, 0.0F);
        this.crest6_r4.cubeList.add(new ModelBox(crest6_r4, 43, 72, -0.5F, -0.3878F, -0.6743F, 1, 1, 1, -0.304F, false));
        this.crest6_r4.cubeList.add(new ModelBox(crest6_r4, 59, 46, -0.5F, 0.0122F, -0.6743F, 1, 1, 1, -0.3F, false));

        this.crest4_r2 = new ModelRenderer(this);
        this.crest4_r2.setRotationPoint(0.0F, 3.3083F, -12.3011F);
        this.crest1.addChild(crest4_r2);
        this.setRotateAngle(crest4_r2, 0.0785F, 0.0F, 0.0F);
        this.crest4_r2.cubeList.add(new ModelBox(crest4_r2, 65, 63, -0.5F, -2.0449F, 0.0657F, 1, 4, 1, -0.02F, false));

        this.crest3_r1 = new ModelRenderer(this);
        this.crest3_r1.setRotationPoint(0.0F, 4.3701F, -13.0247F);
        this.crest1.addChild(crest3_r1);
        this.setRotateAngle(crest3_r1, -0.4974F, 0.0F, 0.0F);
        this.crest3_r1.cubeList.add(new ModelBox(crest3_r1, 62, 69, -0.5F, -1.9529F, -0.0288F, 1, 2, 1, -0.01F, false));

        this.crest2_r1 = new ModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, 5.5522F, -12.9114F);
        this.crest1.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -0.3752F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 69, 59, -0.5F, -1.1F, -0.6F, 1, 2, 1, -0.023F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -1.1F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3078F, -0.4988F, -0.2341F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 46, 46, -0.25F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 10, 70, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.486F, 0.8768F, -2.761F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 51, 49, -0.9072F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 52, 10, -0.9072F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 0, 59, -0.3631F, 0.9633F, -3.2225F, 1, 4, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7436F, 7.6223F, -0.3825F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0391F, 0.2376F, 0.286F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 5, 46, -0.5F, 0.0F, 0.0F, 1, 9, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.1051F, 9.0992F, 0.6788F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.7203F, -0.6132F, -3.0972F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 14, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.1256F, 0.4829F, 13.3508F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1461F, 0.0632F, 0.1958F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 31, 22, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 31, 0, -0.5F, -1.0F, 0.2F, 1, 1, 9, -0.2F, false));

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
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 51, 59, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.rightwing1.setRotationPoint(-2.4F, -0.5F, -1.1F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.3078F, 0.4988F, 0.2341F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 28, 49, -4.75F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 20, 70, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.9655F, -1.0358F, -3.1168F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 52, 0, -0.0928F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 28, 52, -0.0928F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 0, 65, -0.6369F, 0.9633F, -3.2225F, 1, 4, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7436F, 7.6223F, -0.3825F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.0179F, -0.2401F, -0.1963F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 46, 49, -0.5F, 0.0F, 0.0F, 1, 9, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.1051F, 9.0992F, 0.6788F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.7203F, 0.6132F, 3.0972F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 16, -0.4201F, -0.5164F, -0.654F, 1, 1, 14, -0.2F, false));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.1256F, 0.4829F, 13.3508F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1461F, -0.0632F, -0.1958F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 31, 30, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 31, 11, -0.5F, -1.0F, 0.2F, 1, 1, 9, -0.2F, false));

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
        this.righthand2.cubeList.add(new ModelBox(righthand2, 42, 60, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
