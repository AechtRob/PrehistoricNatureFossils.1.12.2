package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnthracosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodymiddle_r2;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Shoulderslope;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmidbase;
    private final ModelRenderer Lowerjawmidfront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawslopefront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Snoutfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Snoutmiddle;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Leftupperteeth;
    private final ModelRenderer Snoutbase;
    private final ModelRenderer Upperjawbase2;
    private final ModelRenderer Upperjawmiddle2;
    private final ModelRenderer Upperjawfront2;
    private final ModelRenderer Snoutfront2;
    private final ModelRenderer Upperfrontteeth2;
    private final ModelRenderer Snoutmiddle2;
    private final ModelRenderer Rightupperteeth2;
    private final ModelRenderer Leftupperteeth2;
    private final ModelRenderer Snoutbase2;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonAnthracosaurusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 9.0F, 0.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1958F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-1.0F, 0.8259F, 15.0075F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 1.5708F, -0.1484F, -1.5708F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 5, 5, -2.6F, -0.5F, -3.0F, 1, 1, 6, -0.15F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.0F, 0.5302F, 13.0294F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 1.4224F, 0.0F, 0.0F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 10, 10, -0.5F, 1.5F, -2.2F, 1, 1, 2, -0.16F, false));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-1.0F, -1.0194F, 6.9966F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.1484F, 0.0F, 0.0F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 0, -0.5F, 0.2F, -0.2F, 1, 1, 12, -0.15F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-1.0F, -1.2194F, 6.8966F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1991F, -0.1712F, -0.0344F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.4762F, -8.9003F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0698F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 27, -0.5F, 0.2F, -0.1F, 1, 1, 9, -0.15F, false));

        this.Bodymiddle_r2 = new ModelRenderer(this);
        this.Bodymiddle_r2.setRotationPoint(0.0F, -0.6507F, -8.9353F);
        this.Bodymiddle.addChild(Bodymiddle_r2);
        this.setRotateAngle(Bodymiddle_r2, 0.1222F, -0.192F, 0.0F);
        this.Bodymiddle_r2.cubeList.add(new ModelBox(Bodymiddle_r2, 0, 14, -0.5F, 0.3744F, -10.965F, 1, 1, 11, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(2.0979F, 0.8227F, -19.4203F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2447F, -0.3495F, 0.0288F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 1.0194F, -7.207F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -1.5708F, -0.0262F, 1.5708F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 39, 34, 2.8F, -0.5F, -5.0F, 1, 1, 10, -0.15F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, 0.9147F, -3.2083F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -1.5446F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 46, 41, -0.5F, 3.5F, 0.1F, 1, 1, 3, -0.16F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.0F, 0.5196F, -7.2201F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.0262F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 42, 37, -0.5F, 0.0F, 0.0F, 1, 1, 8, -0.15F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(0.0F, 0.7196F, -7.3201F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 0.2356F, 0.0F, 0.0F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 46, 26, -0.5F, -0.145F, -6.7834F, 1, 1, 7, -0.15F, false));

        this.Shoulderslope = new ModelRenderer(this);
        this.Shoulderslope.setRotationPoint(0.0F, -2.3804F, 0.8799F);
        this.Bodyfront.addChild(Shoulderslope);
        this.setRotateAngle(Shoulderslope, 0.1772F, 0.0F, 0.0F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.7196F, -13.6201F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, 0.0628F, -0.3222F, 0.0301F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.484F, 3.5363F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, -0.3491F, 0.0F, 0.0F);


        this.Lowerjawmidbase = new ModelRenderer(this);
        this.Lowerjawmidbase.setRotationPoint(0.0F, -1.1282F, -0.829F);
        this.Lowerjawback.addChild(Lowerjawmidbase);
        this.setRotateAngle(Lowerjawmidbase, 1.2779F, 0.0F, 0.0F);


        this.Lowerjawmidfront = new ModelRenderer(this);
        this.Lowerjawmidfront.setRotationPoint(0.0F, -0.2256F, -5.7775F);
        this.Lowerjawmidbase.addChild(Lowerjawmidfront);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Lowerjawmidfront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawslopefront = new ModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, 1.0F, 0.1F);
        this.Lowerjawfront.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.3396F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.5F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(2.45F, 0.5F, -1.0F);
        this.Lowerjawmidfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.1911F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(-2.45F, 0.5F, -1.0F);
        this.Lowerjawmidfront.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, 0.0F, -0.1911F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-2.45F, 0.5F, -1.0F);
        this.Lowerjawmidfront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.1911F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -0.516F, -0.4637F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.0213F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Upperjawbase.addChild(Upperjawmiddle);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);


        this.Snoutfront = new ModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.0F, -2.02F, -0.1F);
        this.Upperjawfront.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, 0.2972F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);


        this.Snoutmiddle = new ModelRenderer(this);
        this.Snoutmiddle.setRotationPoint(0.0F, -1.0559F, -1.3767F);
        this.Upperjawmiddle.addChild(Snoutmiddle);
        this.setRotateAngle(Snoutmiddle, 0.3721F, 0.0F, 0.0F);


        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.1911F, 0.0F);


        this.Leftupperteeth = new ModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.1911F, 0.0F);


        this.Snoutbase = new ModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Upperjawbase.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.3187F, 0.0F, 0.0F);


        this.Upperjawbase2 = new ModelRenderer(this);
        this.Upperjawbase2.setRotationPoint(0.0F, -0.516F, -0.4637F);
        this.Head.addChild(Upperjawbase2);
        this.setRotateAngle(Upperjawbase2, 0.0213F, 0.0F, 0.0F);


        this.Upperjawmiddle2 = new ModelRenderer(this);
        this.Upperjawmiddle2.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Upperjawbase2.addChild(Upperjawmiddle2);


        this.Upperjawfront2 = new ModelRenderer(this);
        this.Upperjawfront2.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Upperjawmiddle2.addChild(Upperjawfront2);
        this.setRotateAngle(Upperjawfront2, -0.0213F, 0.0F, 0.0F);


        this.Snoutfront2 = new ModelRenderer(this);
        this.Snoutfront2.setRotationPoint(0.0F, -2.02F, -0.1F);
        this.Upperjawfront2.addChild(Snoutfront2);
        this.setRotateAngle(Snoutfront2, 0.2972F, 0.0F, 0.0F);


        this.Upperfrontteeth2 = new ModelRenderer(this);
        this.Upperfrontteeth2.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront2.addChild(Upperfrontteeth2);


        this.Snoutmiddle2 = new ModelRenderer(this);
        this.Snoutmiddle2.setRotationPoint(0.0F, -1.0559F, -1.3767F);
        this.Upperjawmiddle2.addChild(Snoutmiddle2);
        this.setRotateAngle(Snoutmiddle2, 0.3721F, 0.0F, 0.0F);


        this.Rightupperteeth2 = new ModelRenderer(this);
        this.Rightupperteeth2.setRotationPoint(-2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle2.addChild(Rightupperteeth2);
        this.setRotateAngle(Rightupperteeth2, 0.0F, -0.1911F, 0.0F);


        this.Leftupperteeth2 = new ModelRenderer(this);
        this.Leftupperteeth2.setRotationPoint(2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle2.addChild(Leftupperteeth2);
        this.setRotateAngle(Leftupperteeth2, 0.0F, 0.1911F, 0.0F);


        this.Snoutbase2 = new ModelRenderer(this);
        this.Snoutbase2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Upperjawbase2.addChild(Snoutbase2);
        this.setRotateAngle(Snoutbase2, 0.3187F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.1313F, 4.1269F, -7.4067F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1717F, -1.4481F, -0.3616F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.0858F, 0.1059F, 0.5969F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.3712F, -0.3035F, -1.1647F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.429F, 4.7042F, -0.7941F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.8006F, -0.14F, 0.1039F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.1313F, 4.1269F, -7.4067F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.1717F, 1.4481F, 0.3616F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.0858F, 0.1059F, 0.5969F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.3712F, 0.3035F, 1.1647F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.429F, 4.7042F, -0.7941F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.8006F, 0.14F, -0.1039F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, 0.7806F, 17.9966F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.2474F, 0.2117F, -0.053F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, -0.2002F, 0.0192F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.1222F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 25, 14, -0.5F, 0.3F, 0.0F, 1, 1, 10, -0.15F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.9998F, 9.9192F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.0053F, 0.3507F, -0.0802F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.0684F, -0.9099F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.0698F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 25, 26, -0.5F, 0.2F, 0.7F, 1, 1, 9, -0.15F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.7684F, 8.9901F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.0249F, 0.4353F, -0.0948F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 26, -1, -0.5F, 0.1F, -0.7F, 1, 1, 10, -0.15F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.1F, 8.7F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0194F, 0.3951F, -0.0768F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 21, 37, -0.5F, 0.2874F, -0.0201F, 1, 1, 9, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0874F, 8.7799F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0089F, -0.309F, 0.1221F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 38, -0.5F, 0.1F, -0.2F, 1, 1, 8, -0.15F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.2223F, 2.6235F, 14.2081F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 2.7787F, -0.1761F, -1.6876F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.455F, 0.9656F, -5.3113F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -1.118F, 0.0967F, -0.1959F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.4686F, 4.3979F, -0.315F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.7441F, 0.1227F, -0.1583F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.2223F, 2.6235F, 14.2081F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 2.7787F, 0.1761F, 1.6876F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.455F, 0.9656F, -5.3113F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -1.118F, -0.0967F, 0.1959F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.4686F, 4.3979F, -0.315F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.7441F, -0.1227F, 0.1583F);

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
