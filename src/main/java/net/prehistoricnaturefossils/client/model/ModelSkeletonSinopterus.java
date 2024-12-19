package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSinopterus extends ModelBase {
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
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r2;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer body2_r2;
    private final ModelRenderer body1_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing3;
    private final ModelRenderer rightlegwing4;
    private final ModelRenderer neck1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer head;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head10_r2;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head9_r2;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head9_r3;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head8_r4;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw8_r2;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw6_r2;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head7_r5;
    private final ModelRenderer head7_r6;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head8_r5;
    private final ModelRenderer head5_r3;
    private final ModelRenderer head4_r3;
    private final ModelRenderer crest1;
    private final ModelRenderer crest5_r1;
    private final ModelRenderer crest4_r1;
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

    public ModelSkeletonSinopterus() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -10.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.7858F, -1.0618F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.5892F, 0.0F, 0.0F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.0503F, -0.3905F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 36, 47, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 26, 43, 0.0F, -1.0F, -1.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 0, 25, -0.5F, -0.8F, -1.6F, 1, 1, 3, -0.2F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 18, 27, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 26, 16, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 48, 35, -0.8471F, 0.1279F, -0.5165F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 37, 13, -1.7563F, -0.3857F, -0.5278F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 48, 33, -0.8408F, 0.1178F, -0.5278F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 14, 43, -2.7673F, -0.3811F, -0.5165F, 2, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 18, 27, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 26, 16, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 48, 35, -0.1529F, 0.1279F, -0.5165F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 37, 13, 0.7563F, -0.3857F, -0.5278F, 1, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 48, 33, -0.1592F, 0.1178F, -0.5278F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.1571F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 15, 11, -1.5F, -0.3F, -1.5F, 3, 1, 3, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 14, 43, 0.7673F, -0.3811F, -0.5165F, 2, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.2F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1977F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.3155F, 3.3771F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 11, 19, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.4412F, -0.2207F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 21, 39, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-0.2397F, 1.5381F, 1.9133F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.6645F, 0.1083F, -0.5174F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 43, 30, -0.6F, -1.0F, -0.5F, 1, 2, 1, -0.31F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.011F, 0.0329F, 2.553F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.8029F, 0.0F, -0.6545F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 43, 34, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.1F, 0.4169F, 2.9369F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.0472F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 24, 32, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, 0.1787F, 3.7763F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -0.1658F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 35, 15, -0.5F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 35, 15, 2.3F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.3213F, 3.3763F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.6545F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 0, 35, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 0, 35, 2.3F, -0.5F, -0.9F, 1, 1, 2, -0.31F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-1.4F, -0.0158F, 2.4632F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.2618F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 30, 5, -0.1F, -0.6315F, -0.6971F, 2, 1, 2, -0.303F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 30, 5, 0.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.299F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.0158F, 2.8632F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.2665F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 21, 5, -0.3F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.1847F, 1.1916F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.2054F, 0.1483F, -0.953F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 46, 6, -0.8854F, 0.1631F, -0.5165F, 1, 0, 1, 0.0F, true));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.2397F, 1.5381F, 1.9133F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.6645F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 43, 30, -0.4F, -1.0F, -0.5F, 1, 2, 1, -0.31F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.011F, 0.0329F, 2.553F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.8029F, 0.0F, 0.6545F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 43, 34, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.1F, 0.4169F, 2.9369F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0472F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 24, 32, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, -0.0158F, 2.8632F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.2665F, 0.1854F, -0.0503F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 21, 5, -0.7F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.1847F, 1.1916F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 46, 6, -0.1719F, 0.2446F, -0.5247F, 1, 0, 1, 0.0F, false));

        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, -0.3269F, 3.0632F);
        this.body1.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.1568F, 0.0054F, -0.0058F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 17, 18, -0.5F, -0.2423F, -0.1854F, 1, 1, 1, -0.2F, false));

        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, -0.4412F, -0.2207F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0524F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 15, 16, -0.5F, -0.3F, -0.5F, 1, 1, 4, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.6588F, 3.5793F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.1632F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 31, 32, -0.5F, -1.1604F, -0.1659F, 1, 1, 2, -0.2F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, 0.3088F, 2.7793F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.7968F, -0.1274F, -0.4204F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 31, 36, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.5095F, 0.1974F, 0.16F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 24, 37, -1.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 38, 30, -0.05F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.3582F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 21, 0, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.7F, 0.3088F, 2.7793F);
        this.body1.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.535F, 0.1274F, 0.4204F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 31, 36, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, true));

        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.3627F, -0.1376F, -0.3263F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg4.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 24, 37, 0.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 38, 30, -0.95F, -2.0F, -0.5F, 1, 4, 1, -0.1F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg4.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3145F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 21, 0, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.rightlegwing3 = new ModelRenderer(this);
        this.rightlegwing3.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg4.addChild(rightlegwing3);
        this.setRotateAngle(rightlegwing3, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing4 = new ModelRenderer(this);
        this.rightlegwing4.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg3.addChild(rightlegwing4);
        this.setRotateAngle(rightlegwing4, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, 0.4538F, 0.0F, 0.0F);


        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 27, 27, -0.5F, -1.1F, -2.0F, 1, 1, 3, -0.25F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2945F, -1.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.249F, 0.1723F, 0.028F);
        this.neck2.cubeList.add(new ModelBox(neck2, 11, 22, -0.5F, -0.5178F, -3.0187F, 1, 1, 3, -0.255F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3468F, 0.3298F, -0.1165F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.0873F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 9, 27, -0.5F, -0.3F, -2.4F, 1, 1, 3, -0.25F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0335F, -2.2161F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);


        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(-0.02F, -0.1102F, -3.6377F);
        this.head.addChild(head10_r1);
        this.setRotateAngle(head10_r1, 1.7017F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 44, 8, -0.5F, 0.5F, -0.5F, 1, 1, 1, 0.007F, true));
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 5, 47, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.007F, true));

        this.head10_r2 = new ModelRenderer(this);
        this.head10_r2.setRotationPoint(1.0F, 0.6404F, -2.7965F);
        this.head.addChild(head10_r2);
        this.setRotateAngle(head10_r2, 1.3701F, 0.0F, 0.0F);
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 31, 47, -1.52F, -0.9875F, 0.004F, 1, 1, 1, 0.005F, true));
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 31, 47, -1.48F, -0.9875F, 0.004F, 1, 1, 1, 0.005F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(1.0F, 0.7404F, -1.7965F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, 1.4923F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 20, 47, -1.52F, -0.9923F, 0.0253F, 1, 1, 1, 0.0F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 20, 47, -1.48F, -0.9923F, 0.0253F, 1, 1, 1, 0.0F, false));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(1.0F, 0.5404F, -0.7965F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, 1.7715F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 0, 47, -1.52F, -1.0121F, 0.0287F, 1, 1, 1, -0.009F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 0, 47, -1.48F, -1.0121F, 0.0287F, 1, 1, 1, -0.009F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(1.0F, -1.6596F, -2.1965F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, -1.5446F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 47, 11, -1.52F, -0.9157F, 0.8722F, 1, 1, 1, 0.009F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 47, 11, -1.48F, -0.9157F, 0.8722F, 1, 1, 1, 0.009F, false));

        this.head9_r2 = new ModelRenderer(this);
        this.head9_r2.setRotationPoint(1.0F, -0.7596F, -1.2965F);
        this.head.addChild(head9_r2);
        this.setRotateAngle(head9_r2, -1.7017F, 0.0F, 0.0F);
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 48, 0, -1.52F, -0.6396F, -0.0511F, 1, 1, 1, 0.003F, true));
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 48, 0, -1.48F, -0.6396F, -0.0511F, 1, 1, 1, 0.003F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(0.5F, 0.5404F, -0.8965F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -0.2356F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 47, 14, -1.02F, -1.0421F, -0.976F, 1, 1, 1, 0.005F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 47, 14, -0.98F, -1.0421F, -0.976F, 1, 1, 1, 0.005F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(0.8F, 0.1014F, 0.4075F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -0.8116F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 43, 26, -1.72F, -0.9F, -0.6F, 1, 2, 1, -0.4F, true));
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 43, 26, -0.88F, -0.9F, -0.6F, 1, 2, 1, -0.4F, false));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(-0.21F, 0.0361F, 0.1315F);
        this.head.addChild(head7_r3);
        this.setRotateAngle(head7_r3, -0.7592F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 26, 46, -0.5F, -0.2819F, -0.8432F, 1, 1, 1, -0.203F, true));

        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(-0.53F, -0.3432F, -0.0076F);
        this.head.addChild(head8_r3);
        this.setRotateAngle(head8_r3, -0.2531F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 10, 48, -0.3F, -0.5F, -0.5426F, 1, 1, 1, -0.3F, true));
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 38, 23, -0.41F, -0.5F, -0.5426F, 1, 1, 1, -0.4F, true));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(-0.21F, -0.2639F, 0.0315F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.2182F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 45, 18, -0.5F, -0.6F, -0.6F, 1, 1, 1, -0.2F, true));

        this.head9_r3 = new ModelRenderer(this);
        this.head9_r3.setRotationPoint(0.02F, -0.1102F, -3.6377F);
        this.head.addChild(head9_r3);
        this.setRotateAngle(head9_r3, 1.7017F, 0.0F, 0.0F);
        this.head9_r3.cubeList.add(new ModelBox(head9_r3, 44, 8, -0.5F, 0.5F, -0.5F, 1, 1, 1, 0.007F, false));
        this.head9_r3.cubeList.add(new ModelBox(head9_r3, 5, 47, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.007F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.21F, 0.0361F, 0.1315F);
        this.head.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.7592F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 26, 46, -0.5F, -0.2819F, -0.8432F, 1, 1, 1, -0.203F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.21F, -0.2639F, 0.0315F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.2182F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 45, 18, -0.5F, -0.6F, -0.6F, 1, 1, 1, -0.2F, false));

        this.head8_r4 = new ModelRenderer(this);
        this.head8_r4.setRotationPoint(0.53F, -0.3432F, -0.0076F);
        this.head.addChild(head8_r4);
        this.setRotateAngle(head8_r4, -0.2531F, 0.0F, 0.0F);
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 39, 23, -0.59F, -0.5F, -0.5426F, 1, 1, 1, -0.4F, false));
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 10, 48, -0.7F, -0.5F, -0.5426F, 1, 1, 1, -0.3F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.5F, -0.0862F, -1.3866F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.0436F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 15, 45, -1.0F, -0.2F, 0.1F, 1, 1, 1, 0.003F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, -0.6374F, 1.4485F);
        this.head.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -0.7243F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 39, 45, -0.5F, -0.8146F, -0.7761F, 1, 1, 1, -0.2F, false));

        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(0.0F, -1.8374F, 2.4485F);
        this.head.addChild(head7_r4);
        this.setRotateAngle(head7_r4, -0.5498F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 29, 42, -0.5F, -1.7369F, -0.6961F, 1, 2, 1, -0.254F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, -1.4374F, 1.4485F);
        this.head.addChild(head6_r3);
        this.setRotateAngle(head6_r3, -0.7592F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 46, 3, -0.5F, -1.2154F, -0.246F, 1, 1, 1, -0.25F, false));
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 44, 45, -0.5F, -0.7154F, -0.246F, 1, 1, 1, -0.25F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, -1.4374F, 1.4485F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -1.1257F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 45, 21, -0.5F, -0.2154F, -0.246F, 1, 1, 1, -0.199F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, -0.8374F, 0.9485F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -1.1781F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 10, 45, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.5F, 0.9725F, -0.4536F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.8988F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 0, 43, -1.0F, -1.9142F, -0.9823F, 1, 2, 1, -0.003F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -0.9553F, -1.3795F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0873F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 37, 9, -0.5F, -0.0082F, 0.0999F, 1, 1, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0317F, -0.3721F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4451F, 0.0F, 0.0F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, -0.1834F, -2.702F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.0349F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 38, 19, -0.8F, -0.3F, 1.2F, 1, 1, 2, -0.3F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 38, 19, -0.2F, -0.3F, 1.2F, 1, 1, 2, -0.3F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.4166F, -0.102F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.jaw2.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.192F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 36, 36, -0.8F, -0.3029F, -1.7057F, 1, 1, 2, -0.299F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 36, 36, -0.2F, -0.3029F, -1.7057F, 1, 1, 2, -0.299F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.0F, -0.8256F, 0.3974F);
        this.jaw5.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.0175F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 0, 30, -0.5F, 0.425F, -1.1882F, 1, 1, 3, -0.299F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, -0.13F, -4.5413F);
        this.jaw4.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, -3.0194F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 43, 42, -0.5F, -0.2754F, -0.2524F, 1, 1, 1, -0.298F, false));

        this.jaw8_r2 = new ModelRenderer(this);
        this.jaw8_r2.setRotationPoint(0.0F, -0.5486F, -5.1698F);
        this.jaw4.addChild(jaw8_r2);
        this.setRotateAngle(jaw8_r2, -3.002F, 0.0F, 0.0F);
        this.jaw8_r2.cubeList.add(new ModelBox(jaw8_r2, 39, 4, -0.5F, -0.5F, -1.4F, 1, 1, 2, -0.304F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, -0.1049F, -4.9906F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 3.0194F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 36, 26, -0.5F, -0.3154F, -0.2883F, 1, 1, 2, -0.3F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, -0.2049F, -4.5906F);
        this.jaw4.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 0.4189F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 36, 40, -0.5F, -0.6482F, -0.3326F, 1, 1, 2, -0.3F, false));

        this.jaw6_r2 = new ModelRenderer(this);
        this.jaw6_r2.setRotationPoint(0.0F, -0.9626F, -3.0172F);
        this.jaw4.addChild(jaw6_r2);
        this.setRotateAngle(jaw6_r2, -0.0175F, 0.0F, 0.0F);
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 7, 40, -0.8F, -0.5055F, -2.0362F, 1, 1, 2, -0.303F, true));
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 14, 39, -0.8F, -0.5055F, -1.7362F, 1, 1, 2, -0.3F, true));
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 7, 40, -0.2F, -0.5055F, -2.0362F, 1, 1, 2, -0.303F, false));
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 14, 39, -0.2F, -0.5055F, -1.7362F, 1, 1, 2, -0.3F, false));

        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.8166F, -3.302F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.7166F, -1.502F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.5F, 1.7764F, -0.2191F);
        this.head2.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -0.1134F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 48, 27, -1.0F, -1.0616F, -1.745F, 1, 1, 1, -0.015F, false));
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 48, 24, -1.0F, -1.0616F, -1.045F, 1, 1, 1, 0.015F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.5F, 1.7764F, 0.7809F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.0262F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 15, 48, -1.0F, -1.0354F, -1.0446F, 1, 1, 1, 0.015F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(0.0F, 1.6315F, -0.0556F);
        this.head5.addChild(head7_r5);
        this.setRotateAngle(head7_r5, 0.6283F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 28, 10, -0.5F, -0.4413F, -0.2903F, 1, 1, 3, -0.305F, false));

        this.head7_r6 = new ModelRenderer(this);
        this.head7_r6.setRotationPoint(0.0F, 1.1315F, 1.8444F);
        this.head5.addChild(head7_r6);
        this.setRotateAngle(head7_r6, 0.3491F, 0.0F, 0.0F);
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 0, 39, -0.5F, -0.8213F, -1.1468F, 1, 1, 2, -0.3F, false));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 20, 22, -0.5F, -0.6213F, -2.6468F, 1, 1, 3, -0.299F, false));

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


        this.head8_r5 = new ModelRenderer(this);
        this.head8_r5.setRotationPoint(0.0F, 2.7394F, -2.4041F);
        this.head4.addChild(head8_r5);
        this.setRotateAngle(head8_r5, 0.7156F, 0.0F, 0.0F);
        this.head8_r5.cubeList.add(new ModelBox(head8_r5, 5, 44, -0.5F, -0.7F, 0.1F, 1, 1, 1, -0.01F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(0.0F, 3.45F, 0.2F);
        this.head4.addChild(head5_r3);
        this.setRotateAngle(head5_r3, 0.0349F, 0.0F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 34, 44, -0.5F, -0.9905F, 0.0379F, 1, 1, 1, 0.005F, false));

        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, 0.35F, 0.1F);
        this.head4.addChild(head4_r3);
        this.setRotateAngle(head4_r3, -0.0524F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 29, 21, -0.5F, 1.3F, -1.7F, 1, 1, 3, 0.003F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -0.2568F, 4.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest5_r1 = new ModelRenderer(this);
        this.crest5_r1.setRotationPoint(0.0F, -0.4544F, -8.8836F);
        this.crest1.addChild(crest5_r1);
        this.setRotateAngle(crest5_r1, -2.6267F, 0.0F, 0.0F);
        this.crest5_r1.cubeList.add(new ModelBox(crest5_r1, 48, 30, -0.5F, -0.8606F, 0.0012F, 1, 1, 1, 0.007F, false));

        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, -0.2544F, -8.5836F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -2.1555F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 43, 38, -0.5F, -1.6F, 0.0F, 1, 2, 1, 0.0F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.0799F, -0.46F, 0.2713F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 41, 0, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 21, 43, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.3412F, 1.0096F, -1.6677F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 19, 32, -0.9072F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 14, 32, -0.9072F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 42, 13, -0.3631F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.3415F, 4.754F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.255F, 0.1238F, 0.5816F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 9, 32, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.1172F, 5.6557F, 0.301F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.4864F, -0.5178F, -0.4679F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2889F, 0.2876F, 0.2714F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 11, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 19, -0.5F, -1.0F, 0.2F, 1, 1, 4, -0.2F, false));

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
        this.setRotateAngle(lefthand2, -2.1762F, -0.0989F, -2.0846F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 32, 0, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.setRotateAngle(rightwing1, -0.1781F, 0.5548F, -0.4113F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 41, 0, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 21, 43, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.2103F, -1.0096F, 1.6677F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 19, 32, -0.0928F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 14, 32, -0.0928F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 42, 13, -0.6369F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.3415F, 4.754F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.255F, -0.1238F, -0.5816F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 9, 32, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.1172F, 5.6557F, 0.301F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.4864F, 0.5178F, 0.4679F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2889F, -0.2876F, -0.2714F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 0, 11, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 19, -0.5F, -1.0F, 0.2F, 1, 1, 4, -0.2F, true));

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
        this.setRotateAngle(righthand2, -2.2635F, 0.0989F, 2.0846F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 32, 0, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

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
