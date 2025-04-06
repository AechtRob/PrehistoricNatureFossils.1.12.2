package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCeratosaurusSlab extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Head;
    private final ModelRenderer Hornslope_r1;
    private final ModelRenderer Horn_r1;
    private final ModelRenderer Rightcrestextensionslope_r1;
    private final ModelRenderer Rightcrestextension_r1;
    private final ModelRenderer Rightcrestextension_r2;
    private final ModelRenderer Upperjawslopebase_r1;
    private final ModelRenderer Leftcrestextensionslope_r1;
    private final ModelRenderer Leftcrestextension_r1;
    private final ModelRenderer Leftcrestextension_r2;
    private final ModelRenderer Leftcrestorbit_r1;
    private final ModelRenderer Leftcrestbase_r1;
    private final ModelRenderer Upperfrontteeth_r1;
    private final ModelRenderer Upperbackteeth_r1;
    private final ModelRenderer Upperjawslopefront_r1;
    private final ModelRenderer Upperjawslopefront_r2;
    private final ModelRenderer Upperjawslopebase_r2;
    private final ModelRenderer Upperjawslopebase_r3;
    private final ModelRenderer Upperjawfront_r1;
    private final ModelRenderer Upperjawfront_r2;
    private final ModelRenderer Upperjawbase_r1;
    private final ModelRenderer Upperjawbase_r2;
    private final ModelRenderer Upperjawbase_r3;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Head_r3;
    private final ModelRenderer Head_r4;
    private final ModelRenderer Head_r5;
    private final ModelRenderer Head_r6;
    private final ModelRenderer Head_r7;
    private final ModelRenderer Head_r8;
    private final ModelRenderer Head_r9;
    private final ModelRenderer Head_r10;
    private final ModelRenderer Head_r11;
    private final ModelRenderer Head_r12;
    private final ModelRenderer Head_r13;
    private final ModelRenderer Head_r14;
    private final ModelRenderer Head_r15;
    private final ModelRenderer Head_r16;
    private final ModelRenderer Head_r17;
    private final ModelRenderer Head_r18;
    private final ModelRenderer Head_r19;
    private final ModelRenderer Head_r20;
    private final ModelRenderer Head_r21;
    private final ModelRenderer matrix;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;

    public ModelSkeletonCeratosaurusSlab() {
        this.textureWidth = 75;
        this.textureHeight = 60;

        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.275F, -4.9626F, -0.5791F);
        this.fossil.addChild(Head);
        this.setRotateAngle(Head, 0.4727F, -0.0514F, -0.8352F);


        this.Hornslope_r1 = new ModelRenderer(this);
        this.Hornslope_r1.setRotationPoint(0.0F, -3.8077F, -1.6207F);
        this.Head.addChild(Hornslope_r1);
        this.setRotateAngle(Hornslope_r1, -1.2483F, 0.0F, 0.0F);
        this.Hornslope_r1.cubeList.add(new ModelBox(Hornslope_r1, 72, 90, -0.5F, 0.4841F, -0.0649F, 1, 2, 2, -0.2F, false));

        this.Horn_r1 = new ModelRenderer(this);
        this.Horn_r1.setRotationPoint(0.0F, -1.8077F, -3.6207F);
        this.Head.addChild(Horn_r1);
        this.setRotateAngle(Horn_r1, -0.4192F, 0.0F, 0.0F);
        this.Horn_r1.cubeList.add(new ModelBox(Horn_r1, 90, 67, -0.5F, -2.235F, -1.1862F, 1, 3, 2, -0.204F, false));

        this.Rightcrestextensionslope_r1 = new ModelRenderer(this);
        this.Rightcrestextensionslope_r1.setRotationPoint(-1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Rightcrestextensionslope_r1);
        this.setRotateAngle(Rightcrestextensionslope_r1, -1.0886F, -0.1201F, -0.4182F);
        this.Rightcrestextensionslope_r1.cubeList.add(new ModelBox(Rightcrestextensionslope_r1, 90, 82, -0.7336F, -0.9663F, -0.6078F, 1, 1, 2, -0.2F, false));

        this.Rightcrestextension_r1 = new ModelRenderer(this);
        this.Rightcrestextension_r1.setRotationPoint(-1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Rightcrestextension_r1);
        this.setRotateAngle(Rightcrestextension_r1, 0.2029F, -0.1201F, -0.4182F);
        this.Rightcrestextension_r1.cubeList.add(new ModelBox(Rightcrestextension_r1, 16, 91, -0.7336F, -0.9986F, -1.3679F, 1, 1, 2, -0.204F, false));

        this.Rightcrestextension_r2 = new ModelRenderer(this);
        this.Rightcrestextension_r2.setRotationPoint(-1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Rightcrestextension_r2);
        this.setRotateAngle(Rightcrestextension_r2, -0.3905F, -0.1201F, -0.4182F);
        this.Rightcrestextension_r2.cubeList.add(new ModelBox(Rightcrestextension_r2, 56, 27, -0.7336F, -0.1235F, -1.6204F, 1, 1, 1, -0.2F, false));
        this.Rightcrestextension_r2.cubeList.add(new ModelBox(Rightcrestextension_r2, 47, 77, -0.7336F, -0.5235F, -1.6204F, 1, 1, 1, -0.2F, false));
        this.Rightcrestextension_r2.cubeList.add(new ModelBox(Rightcrestextension_r2, 23, 91, -0.7336F, -1.1235F, -1.6204F, 1, 1, 2, -0.199F, false));

        this.Upperjawslopebase_r1 = new ModelRenderer(this);
        this.Upperjawslopebase_r1.setRotationPoint(-1.2F, -2.3077F, -3.9207F);
        this.Head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1233F, -0.1559F, -0.0192F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 64, 27, -0.2F, -0.235F, -0.1862F, 2, 1, 6, -0.201F, false));

        this.Leftcrestextensionslope_r1 = new ModelRenderer(this);
        this.Leftcrestextensionslope_r1.setRotationPoint(1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Leftcrestextensionslope_r1);
        this.setRotateAngle(Leftcrestextensionslope_r1, -1.0886F, 0.1201F, 0.4182F);
        this.Leftcrestextensionslope_r1.cubeList.add(new ModelBox(Leftcrestextensionslope_r1, 90, 78, -0.2664F, -0.9663F, -0.6078F, 1, 1, 2, -0.2F, false));

        this.Leftcrestextension_r1 = new ModelRenderer(this);
        this.Leftcrestextension_r1.setRotationPoint(1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Leftcrestextension_r1);
        this.setRotateAngle(Leftcrestextension_r1, -0.3905F, 0.1201F, 0.4182F);
        this.Leftcrestextension_r1.cubeList.add(new ModelBox(Leftcrestextension_r1, 76, 70, -0.2664F, -0.1235F, -1.6204F, 1, 1, 1, -0.2F, false));
        this.Leftcrestextension_r1.cubeList.add(new ModelBox(Leftcrestextension_r1, 81, 32, -0.2664F, -0.5235F, -1.6204F, 1, 1, 1, -0.2F, false));

        this.Leftcrestextension_r2 = new ModelRenderer(this);
        this.Leftcrestextension_r2.setRotationPoint(1.4F, -2.8077F, 0.8793F);
        this.Head.addChild(Leftcrestextension_r2);
        this.setRotateAngle(Leftcrestextension_r2, 0.2029F, 0.1201F, 0.4182F);
        this.Leftcrestextension_r2.cubeList.add(new ModelBox(Leftcrestextension_r2, 9, 91, -0.2664F, -0.9986F, -1.3679F, 1, 1, 2, -0.204F, false));

        this.Leftcrestorbit_r1 = new ModelRenderer(this);
        this.Leftcrestorbit_r1.setRotationPoint(0.9867F, -1.0063F, 1.1575F);
        this.Head.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, -0.0813F, 0.5861F, 0.2861F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 38, 73, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Leftcrestbase_r1 = new ModelRenderer(this);
        this.Leftcrestbase_r1.setRotationPoint(1.2005F, -2.3475F, 0.9423F);
        this.Head.addChild(Leftcrestbase_r1);
        this.setRotateAngle(Leftcrestbase_r1, -0.7956F, 0.3539F, -0.0157F);
        this.Leftcrestbase_r1.cubeList.add(new ModelBox(Leftcrestbase_r1, 51, 27, -0.5F, -0.5F, -0.3F, 1, 1, 1, 0.0F, false));

        this.Upperfrontteeth_r1 = new ModelRenderer(this);
        this.Upperfrontteeth_r1.setRotationPoint(-0.2F, 3.5923F, -3.8207F);
        this.Head.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.1543F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 82, 46, -0.8F, -2.259F, -2.3451F, 2, 2, 2, 0.0F, false));

        this.Upperbackteeth_r1 = new ModelRenderer(this);
        this.Upperbackteeth_r1.setRotationPoint(-0.2F, 3.5923F, -3.8207F);
        this.Head.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, 0.1222F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 43, 71, -0.8F, -1.9646F, 0.3092F, 2, 2, 3, 0.2F, false));

        this.Upperjawslopefront_r1 = new ModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, 0.3058F, -7.1888F);
        this.Head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 1.347F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 81, 70, -1.0F, -0.0001F, -0.1338F, 2, 2, 2, -0.004F, false));

        this.Upperjawslopefront_r2 = new ModelRenderer(this);
        this.Upperjawslopefront_r2.setRotationPoint(0.0F, -1.3942F, -6.6888F);
        this.Head.addChild(Upperjawslopefront_r2);
        this.setRotateAngle(Upperjawslopefront_r2, 0.2998F, 0.0F, 0.0F);
        this.Upperjawslopefront_r2.cubeList.add(new ModelBox(Upperjawslopefront_r2, 0, 71, -1.0F, -0.0868F, -0.0058F, 2, 3, 3, 0.0F, false));

        this.Upperjawslopebase_r2 = new ModelRenderer(this);
        this.Upperjawslopebase_r2.setRotationPoint(0.0F, -2.3077F, -3.9207F);
        this.Head.addChild(Upperjawslopebase_r2);
        this.setRotateAngle(Upperjawslopebase_r2, 0.1218F, 0.0F, 0.0F);
        this.Upperjawslopebase_r2.cubeList.add(new ModelBox(Upperjawslopebase_r2, 64, 35, -1.0F, 0.165F, 0.2138F, 2, 3, 5, 0.2F, false));

        this.Upperjawslopebase_r3 = new ModelRenderer(this);
        this.Upperjawslopebase_r3.setRotationPoint(1.2F, -2.3077F, -3.9207F);
        this.Head.addChild(Upperjawslopebase_r3);
        this.setRotateAngle(Upperjawslopebase_r3, 0.1233F, 0.1559F, 0.0192F);
        this.Upperjawslopebase_r3.cubeList.add(new ModelBox(Upperjawslopebase_r3, 0, 63, -1.8F, -0.235F, -0.1862F, 2, 1, 6, -0.201F, false));

        this.Upperjawfront_r1 = new ModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 1.1923F, -6.3207F);
        this.Head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.0115F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 88, 37, -1.0F, -0.9554F, -0.9071F, 2, 1, 2, 0.0F, false));

        this.Upperjawfront_r2 = new ModelRenderer(this);
        this.Upperjawfront_r2.setRotationPoint(0.0F, 2.0923F, -3.6207F);
        this.Head.addChild(Upperjawfront_r2);
        this.setRotateAngle(Upperjawfront_r2, -0.3026F, 0.0F, 0.0F);
        this.Upperjawfront_r2.cubeList.add(new ModelBox(Upperjawfront_r2, 68, 7, -1.0F, -2.0098F, -2.9526F, 2, 2, 3, 0.005F, false));

        this.Upperjawbase_r1 = new ModelRenderer(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, 2.2042F, -2.6757F);
        this.Head.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, -0.1222F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 90, 73, -1.0F, -2.9505F, -0.9341F, 2, 3, 1, 0.202F, false));

        this.Upperjawbase_r2 = new ModelRenderer(this);
        this.Upperjawbase_r2.setRotationPoint(0.0F, 1.7042F, 0.3243F);
        this.Head.addChild(Upperjawbase_r2);
        this.setRotateAngle(Upperjawbase_r2, 0.1571F, 0.0F, 0.0F);
        this.Upperjawbase_r2.cubeList.add(new ModelBox(Upperjawbase_r2, 68, 0, -1.0F, -2.926F, -2.9753F, 2, 3, 3, 0.205F, false));

        this.Upperjawbase_r3 = new ModelRenderer(this);
        this.Upperjawbase_r3.setRotationPoint(0.0F, 0.3042F, -1.1757F);
        this.Head.addChild(Upperjawbase_r3);
        this.setRotateAngle(Upperjawbase_r3, 0.0175F, 0.0F, 0.0F);
        this.Upperjawbase_r3.cubeList.add(new ModelBox(Upperjawbase_r3, 67, 55, -1.0F, -2.5F, 0.5F, 2, 4, 3, 0.202F, false));

        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(1.58F, -0.1991F, 2.1042F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, -1.0036F, 0.0F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 18, 80, -1.0F, -1.2F, -0.7F, 2, 3, 2, -0.501F, false));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(1.58F, 1.1966F, 1.4673F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, -2.2951F, 0.0F, 0.0F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 82, 41, -1.0F, -0.5694F, -1.4856F, 2, 2, 2, -0.5F, false));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(1.58F, -1.5778F, 2.3473F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, -1.7453F, 0.0F, 0.0F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 63, 86, -1.0F, -1.0F, -1.4F, 2, 2, 2, -0.501F, false));
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 45, 86, -1.0F, -0.3F, -1.4F, 2, 2, 2, -0.5F, false));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(-1.48F, -2.4678F, 4.3339F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, -1.8326F, 0.0F, 0.0F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 74, 85, -0.7F, -2.4499F, -0.4335F, 2, 2, 2, -0.5F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 18, 86, -0.7F, -1.4499F, -0.4335F, 2, 2, 2, -0.5F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 0, 85, 1.66F, -2.4499F, -0.4335F, 2, 2, 2, -0.5F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 9, 86, 1.66F, -1.4499F, -0.4335F, 2, 2, 2, -0.5F, false));

        this.Head_r5 = new ModelRenderer(this);
        this.Head_r5.setRotationPoint(1.58F, -1.0217F, 2.0462F);
        this.Head.addChild(Head_r5);
        this.setRotateAngle(Head_r5, -0.1745F, 0.0F, 0.0F);
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 9, 80, -1.0F, -1.7F, -0.8F, 2, 3, 2, -0.5F, false));
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 29, 73, -1.8F, -1.5F, -3.3F, 2, 4, 2, -0.5F, false));
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 0, 78, -1.0F, -1.7F, -1.5F, 2, 4, 2, -0.499F, false));

        this.Head_r6 = new ModelRenderer(this);
        this.Head_r6.setRotationPoint(1.58F, 0.2811F, 4.8006F);
        this.Head.addChild(Head_r6);
        this.setRotateAngle(Head_r6, -2.7751F, 0.0F, 0.0F);
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 36, 84, -1.0F, -1.3F, -0.6F, 2, 2, 2, -0.499F, false));
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 21, 49, -1.0F, -2.0F, -1.2F, 2, 4, 2, -0.5F, false));

        this.Head_r7 = new ModelRenderer(this);
        this.Head_r7.setRotationPoint(1.58F, -0.2457F, 4.1433F);
        this.Head.addChild(Head_r7);
        this.setRotateAngle(Head_r7, -1.885F, 0.0F, 0.0F);
        this.Head_r7.cubeList.add(new ModelBox(Head_r7, 54, 73, -1.0F, -3.0F, 0.5F, 2, 4, 2, -0.506F, false));

        this.Head_r8 = new ModelRenderer(this);
        this.Head_r8.setRotationPoint(1.58F, -0.2457F, 4.1433F);
        this.Head.addChild(Head_r8);
        this.setRotateAngle(Head_r8, -0.3142F, 0.0F, 0.0F);
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 63, 73, -1.0F, -2.0F, -1.0F, 2, 4, 2, -0.502F, false));

        this.Head_r9 = new ModelRenderer(this);
        this.Head_r9.setRotationPoint(0.78F, -2.2023F, -1.3905F);
        this.Head.addChild(Head_r9);
        this.setRotateAngle(Head_r9, 1.9024F, 0.0F, 0.0F);
        this.Head_r9.cubeList.add(new ModelBox(Head_r9, 79, 35, -1.0F, -1.6656F, -2.3385F, 2, 3, 2, -0.496F, false));
        this.Head_r9.cubeList.add(new ModelBox(Head_r9, 88, 0, -1.0F, -0.4656F, -1.5385F, 2, 2, 2, -0.499F, false));

        this.Head_r10 = new ModelRenderer(this);
        this.Head_r10.setRotationPoint(2.48F, 0.2372F, -4.2037F);
        this.Head.addChild(Head_r10);
        this.setRotateAngle(Head_r10, -2.618F, 0.0F, 0.0F);
        this.Head_r10.cubeList.add(new ModelBox(Head_r10, 88, 17, -2.66F, -0.9F, -1.0F, 2, 2, 2, -0.8F, false));

        this.Head_r11 = new ModelRenderer(this);
        this.Head_r11.setRotationPoint(3.78F, -0.825F, -4.2443F);
        this.Head.addChild(Head_r11);
        this.setRotateAngle(Head_r11, 2.4609F, 0.0F, 0.0F);
        this.Head_r11.cubeList.add(new ModelBox(Head_r11, 89, 56, -3.96F, -1.0F, -1.0F, 2, 2, 2, -0.8F, false));

        this.Head_r12 = new ModelRenderer(this);
        this.Head_r12.setRotationPoint(0.88F, -1.2769F, -3.2479F);
        this.Head.addChild(Head_r12);
        this.setRotateAngle(Head_r12, 3.0543F, 0.0F, 0.0F);
        this.Head_r12.cubeList.add(new ModelBox(Head_r12, 88, 22, -0.94F, -1.3565F, -0.7175F, 2, 2, 2, -0.7F, false));

        this.Head_r13 = new ModelRenderer(this);
        this.Head_r13.setRotationPoint(0.94F, -1.1074F, -5.6187F);
        this.Head.addChild(Head_r13);
        this.setRotateAngle(Head_r13, 1.9897F, 0.0F, 0.0F);
        this.Head_r13.cubeList.add(new ModelBox(Head_r13, 79, 6, -1.2F, -1.6F, -1.0F, 2, 3, 2, -0.701F, false));

        this.Head_r14 = new ModelRenderer(this);
        this.Head_r14.setRotationPoint(0.88F, -1.2769F, -3.2479F);
        this.Head.addChild(Head_r14);
        this.setRotateAngle(Head_r14, 2.2515F, 0.0F, 0.0F);
        this.Head_r14.cubeList.add(new ModelBox(Head_r14, 0, 90, -0.94F, -1.1491F, -0.9398F, 2, 2, 2, -0.701F, false));
        this.Head_r14.cubeList.add(new ModelBox(Head_r14, 87, 51, -0.94F, -0.5491F, -0.9398F, 2, 2, 2, -0.7F, false));

        this.Head_r15 = new ModelRenderer(this);
        this.Head_r15.setRotationPoint(0.78F, -0.9023F, -2.7905F);
        this.Head.addChild(Head_r15);
        this.setRotateAngle(Head_r15, 2.2689F, 0.0F, 0.0F);
        this.Head_r15.cubeList.add(new ModelBox(Head_r15, 65, 80, -1.0F, -0.5575F, -1.4426F, 2, 3, 2, -0.5F, false));

        this.Head_r16 = new ModelRenderer(this);
        this.Head_r16.setRotationPoint(0.78F, -1.1023F, -1.2905F);
        this.Head.addChild(Head_r16);
        this.setRotateAngle(Head_r16, 1.3963F, 0.0F, 0.0F);
        this.Head_r16.cubeList.add(new ModelBox(Head_r16, 38, 77, -1.0F, -2.0F, -2.0F, 2, 4, 2, -0.499F, false));

        this.Head_r17 = new ModelRenderer(this);
        this.Head_r17.setRotationPoint(1.0F, -1.1217F, 5.6462F);
        this.Head.addChild(Head_r17);
        this.setRotateAngle(Head_r17, 0.3403F, 0.0F, 0.0F);
        this.Head_r17.cubeList.add(new ModelBox(Head_r17, 17, 66, -3.0F, -0.3303F, -1.6959F, 4, 4, 2, 0.0F, false));

        this.Head_r18 = new ModelRenderer(this);
        this.Head_r18.setRotationPoint(-1.0F, 2.4783F, 4.6462F);
        this.Head.addChild(Head_r18);
        this.setRotateAngle(Head_r18, -0.0436F, 0.0F, 0.0F);
        this.Head_r18.cubeList.add(new ModelBox(Head_r18, 81, 27, 2.0F, -0.9873F, 0.0358F, 1, 1, 3, 0.02F, false));

        this.Head_r19 = new ModelRenderer(this);
        this.Head_r19.setRotationPoint(1.0F, 1.7783F, 1.7462F);
        this.Head.addChild(Head_r19);
        this.setRotateAngle(Head_r19, -0.2705F, 0.0F, 0.0F);
        this.Head_r19.cubeList.add(new ModelBox(Head_r19, 44, 65, -3.0F, -4.6877F, -0.5826F, 4, 1, 4, 0.02F, false));
        this.Head_r19.cubeList.add(new ModelBox(Head_r19, 61, 65, -3.0F, -4.0877F, 0.0174F, 4, 4, 3, 0.04F, false));

        this.Head_r20 = new ModelRenderer(this);
        this.Head_r20.setRotationPoint(1.0F, 1.7783F, 1.7462F);
        this.Head.addChild(Head_r20);
        this.setRotateAngle(Head_r20, -0.1134F, 0.0F, 0.0F);
        this.Head_r20.cubeList.add(new ModelBox(Head_r20, 35, 27, -3.0F, -4.6877F, -0.8826F, 4, 1, 1, 0.02F, false));
        this.Head_r20.cubeList.add(new ModelBox(Head_r20, 66, 13, -3.0F, -4.0877F, -1.1826F, 4, 4, 3, 0.01F, false));

        this.Head_r21 = new ModelRenderer(this);
        this.Head_r21.setRotationPoint(0.0F, -3.0217F, 5.8462F);
        this.Head.addChild(Head_r21);
        this.setRotateAngle(Head_r21, 0.4363F, 0.0F, 0.0F);
        this.Head_r21.cubeList.add(new ModelBox(Head_r21, 81, 17, -0.5F, 0.0F, -2.4F, 1, 1, 2, 0.02F, false));

        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(matrix);
        this.matrix.cubeList.add(new ModelBox(matrix, 0, 0, -4.0F, -2.0F, -5.0F, 11, 2, 11, 0.0F, false));
        this.matrix.cubeList.add(new ModelBox(matrix, 0, 30, -8.0F, -7.0F, -5.0F, 4, 7, 11, 0.0F, false));
        this.matrix.cubeList.add(new ModelBox(matrix, 45, 0, -8.0F, -8.0F, 6.0F, 7, 8, 4, 0.0F, false));
        this.matrix.cubeList.add(new ModelBox(matrix, 44, 56, -1.0F, -4.0F, 6.0F, 7, 4, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -4.5F, -7.5F);
        this.matrix.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5098F, -0.4701F, -1.0266F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 44, -1.7279F, -0.5F, -1.4042F, 4, 3, 8, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.4786F, -2.0F, -9.3126F);
        this.matrix.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.3526F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 83, 80, -1.125F, -2.0F, -0.225F, 1, 4, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, -7.5F);
        this.matrix.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 14, -5.325F, -4.0F, -0.75F, 7, 4, 8, 0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(4.7934F, -2.5F, -5.3912F);
        this.matrix.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1034F, -0.2931F, 0.7176F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 58, -2.325F, 0.25F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, 0.0F, -6.0F);
        this.matrix.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6545F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 20, -1.0F, -2.0F, -1.0F, 4, 2, 3, -0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.5F, -4.25F, 0.0F);
        this.matrix.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 14, 1.0F, -2.0F, -5.0F, 6, 4, 11, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -2.5F, 0.0F);
        this.matrix.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 30, 2.0F, -2.0F, -5.0F, 5, 2, 11, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-11.0F, 0.0F, 0.0F);
        this.matrix.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 49, 0.65F, -7.0F, -11.975F, 4, 7, 6, 0.02F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.4095F, -3.6244F, 8.0F);
        this.matrix.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.9163F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 44, -2.5F, -4.35F, -2.0F, 4, 6, 4, -0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(5.0F, -2.0F, 8.0F);
        this.matrix.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 66, -0.7F, 0.0F, -2.5F, 2, 2, 4, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.0F, -6.0F, 2.5F);
        this.matrix.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.48F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 56, -1.575F, -0.95F, -1.2F, 4, 2, 7, 0.0F, false));
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
