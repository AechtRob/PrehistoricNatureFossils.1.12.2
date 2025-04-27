package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCoelophysisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer neck;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer Neckmiddle_r2;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Neckend;
    private final ModelRenderer Neckend_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawend;
    private final ModelRenderer Snout;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Headslope;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Tailend2;
    private final ModelRenderer Tailend_r2;
    private final ModelRenderer Tailend3;
    private final ModelRenderer Tailend_r3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Rightfoot2;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;
    private final ModelRenderer Leftfoot2;

    public ModelSkeletonCoelophysisFrame() {
        this.textureWidth = 87;
        this.textureHeight = 87;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -18.0F, -2.1F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.5F, -16.0F, -17.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4625F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.6F, -2.0F, -0.5F, 1, 18, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.5F, -16.0F, -17.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4625F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 0.8F, -3.0F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -16.0F, -1.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -1.8F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -20.6F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 2.099F, -0.5318F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0986F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 1.9702F, 0.4353F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0175F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 37, -0.5F, -2.0F, -4.7F, 1, 1, 7, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.4172F, -3.5662F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0427F, -0.2616F, -0.0111F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 2.1892F, -5.8242F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 21, 15, -0.49F, -1.7F, -3.6F, 1, 1, 9, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1892F, -9.3242F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0935F, -0.1661F, -0.1028F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.4128F, -0.1452F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 42, 10, -0.49F, 0.05F, -6.8F, 1, 1, 7, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.6012F, -7.0133F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.2694F, -0.2711F, -0.1466F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.0924F, -3.1767F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 51, 3, -0.49F, -0.2987F, 2.9368F, 1, 1, 1, -0.1F, false));
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 48, 0, -0.49F, -0.2987F, -0.8632F, 1, 1, 4, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.7848F, -3.5897F);
        this.Neckbase.addChild(neck);
        this.setRotateAngle(neck, -0.1822F, -0.2518F, -0.033F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, 0.1828F, 0.3121F);
        this.neck.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.0175F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 41, 46, -0.49F, 0.118F, -4.3524F, 1, 1, 4, -0.1F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.0499F, -3.9271F);
        this.neck.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, 0.1172F, -0.4184F, -0.2966F);


        this.Neckmiddle_r2 = new ModelRenderer(this);
        this.Neckmiddle_r2.setRotationPoint(0.0F, 0.2422F, -0.485F);
        this.Neckmiddle.addChild(Neckmiddle_r2);
        this.setRotateAngle(Neckmiddle_r2, 0.1571F, 0.0F, 0.0F);
        this.Neckmiddle_r2.cubeList.add(new ModelBox(Neckmiddle_r2, 0, 50, -0.49F, 0.1171F, -3.4025F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.6184F, -3.7389F);
        this.Neckmiddle.addChild(neck2);
        this.setRotateAngle(neck2, 0.0646F, -0.5572F, -0.2927F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 0, -0.49F, 0.2F, -2.9F, 1, 1, 3, -0.1F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.01F, 1.0315F, -2.5258F);
        this.neck2.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.4308F, -0.3878F, 0.0989F);


        this.Neckend_r1 = new ModelRenderer(this);
        this.Neckend_r1.setRotationPoint(0.0F, 0.9871F, -2.6603F);
        this.Neckend.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, 0.3142F, 0.0F, 0.0F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 57, 25, -0.5F, 0.2013F, -0.1332F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.56F, -2.5029F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.4569F, 0.0F, 0.0F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.1333F, -0.0924F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.3403F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.01F, 0.9926F, -2.2597F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0424F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.1F, -3.83F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.0637F, 0.0F, 0.0F);


        this.Upperjawend = new ModelRenderer(this);
        this.Upperjawend.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Upperjawbase.addChild(Upperjawend);
        this.setRotateAngle(Upperjawend, -0.1274F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -2.7F, -0.2F);
        this.Upperjawend.addChild(Snout);
        this.setRotateAngle(Snout, 0.3183F, 0.0F, 0.0F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, -0.2335F, 0.1485F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, 0.2335F, -0.1485F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -1.85F, 0.0F);
        this.Upperjawbase.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.0175F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.7639F, 4.6955F, -4.8779F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.6392F, 0.1859F, -0.2438F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.7205F, 4.3794F, 0.0748F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8436F, 0.2398F, 0.1911F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(0.8819F, 2.7246F, 0.0444F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.078F, 0.0103F, 0.3153F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.7439F, 4.6955F, -4.8779F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.8573F, -0.1859F, 0.2438F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.7205F, 4.3794F, 0.0748F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.8436F, -0.2398F, -0.1911F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(-0.8819F, 2.7246F, 0.0444F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.078F, -0.0103F, -0.3153F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.2062F, 2.9334F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1575F, 0.1724F, 0.0272F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 36, 7, -0.5F, 0.1698F, 7.2594F, 1, 1, 1, -0.1F, false));
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 29, 0, -0.5F, 0.1698F, -0.5406F, 1, 1, 8, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.2569F, 7.8363F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.2573F, 0.1689F, 0.0442F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.1038F, 0.9873F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 12, 12, -0.5F, 0.3F, 11.6F, 1, 1, 1, -0.1F, false));
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 0, 0, -0.5F, 0.3F, -1.2F, 1, 1, 13, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4655F, 12.9912F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1667F, 0.3751F, -0.1044F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, -0.0037F, 0.5038F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 0, 26, -0.5F, 0.2F, -0.5F, 1, 1, 9, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.5101F, 8.8559F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.2344F, 0.3698F, -0.0399F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, 0.0349F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 15, -0.5F, 0.2F, -0.5F, 1, 1, 9, -0.1F, false));

        this.Tailend2 = new ModelRenderer(this);
        this.Tailend2.setRotationPoint(0.0F, -0.3392F, 8.921F);
        this.Tailend.addChild(Tailend2);
        this.setRotateAngle(Tailend2, -0.445F, 0.1396F, -0.1138F);


        this.Tailend_r2 = new ModelRenderer(this);
        this.Tailend_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend2.addChild(Tailend_r2);
        this.setRotateAngle(Tailend_r2, 0.0349F, 0.0F, 0.0F);
        this.Tailend_r2.cubeList.add(new ModelBox(Tailend_r2, 21, 26, -0.5F, 0.3F, -0.4F, 1, 1, 9, -0.1F, false));

        this.Tailend3 = new ModelRenderer(this);
        this.Tailend3.setRotationPoint(0.0F, -0.2675F, 8.9066F);
        this.Tailend2.addChild(Tailend3);
        this.setRotateAngle(Tailend3, -0.3341F, 0.2895F, -0.0988F);


        this.Tailend_r3 = new ModelRenderer(this);
        this.Tailend_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend3.addChild(Tailend_r3);
        this.setRotateAngle(Tailend_r3, 0.0349F, 0.0F, 0.0F);
        this.Tailend_r3.cubeList.add(new ModelBox(Tailend_r3, 36, 37, -0.5F, 0.3F, -0.5F, 1, 1, 7, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 0.7994F, -0.8146F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.5556F, 0.0594F, 0.1167F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.5F, 7.2283F, 1.9698F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.2081F, 0.0F, 0.0F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.01F, 8.0916F, -0.049F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -1.0684F, -0.1149F, -0.0629F);


        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 4.0995F, 0.2951F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.539F, 0.0F, 0.0F);


        this.Rightfoot2 = new ModelRenderer(this);
        this.Rightfoot2.setRotationPoint(0.0F, 0.0118F, -1.4031F);
        this.Rightfoot.addChild(Rightfoot2);
        this.setRotateAngle(Rightfoot2, -0.0021F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.3F, 0.7994F, -0.8146F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0784F, -0.0103F, -0.1305F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.5F, 7.2283F, 1.9698F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.2081F, 0.0F, 0.0F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 8.0916F, -0.049F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.8933F, 0.1022F, 0.0819F);


        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 4.0995F, 0.2951F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.4953F, 0.0F, 0.0F);


        this.Leftfoot2 = new ModelRenderer(this);
        this.Leftfoot2.setRotationPoint(0.0F, 0.0118F, -1.4031F);
        this.Leftfoot.addChild(Leftfoot2);
        this.setRotateAngle(Leftfoot2, -0.4384F, 0.0F, 0.0F);


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
