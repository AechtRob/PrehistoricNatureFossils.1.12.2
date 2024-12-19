package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLotosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer body2;
    private final ModelRenderer Belly_r1;
    private final ModelRenderer body;
    private final ModelRenderer Belly;
    private final ModelRenderer Belly_r2;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck2;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Faceslopefront;
    private final ModelRenderer Faceslopemiddle;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawslopeback;
    private final ModelRenderer Lowerjawslopefront;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Bellyhump;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailbasehump;
    private final ModelRenderer Hiphumpfront;
    private final ModelRenderer Hiphumpback;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightheel;
    private final ModelRenderer Righttoes;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftheel;
    private final ModelRenderer Lefttoes;

    public ModelSkeletonLotosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -11.85F, -5.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5585F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -3.75F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -11.85F, -5.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5585F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.65F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -14.55F, 8.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.05F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -14.55F, 8.6F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1222F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -2.45F, -0.5F, 1, 17, 1, -0.16F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 7.0252F, 8.4832F);
        this.root.addChild(Hips);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-0.1F, 0.3312F, 0.4732F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1222F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 28, 31, -0.4F, -0.2F, -2.4F, 1, 1, 5, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.4809F, -1.5666F);
        this.Hips.addChild(body2);
        this.setRotateAngle(body2, 0.0354F, 0.1744F, 0.0062F);


        this.Belly_r1 = new ModelRenderer(this);
        this.Belly_r1.setRotationPoint(0.0F, -0.7F, -4.0F);
        this.body2.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, -0.0873F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 37, 38, -0.5F, 0.6855F, 0.1307F, 1, 1, 4, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -4.0F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.044F, 0.1308F, 0.0057F);
        this.body.cubeList.add(new ModelBox(body, 23, 0, -0.5F, 0.1855F, -5.5693F, 1, 1, 6, -0.15F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.2493F, -5.9347F);
        this.body.addChild(Belly);
        this.setRotateAngle(Belly, 0.111F, 0.0F, 0.0F);


        this.Belly_r2 = new ModelRenderer(this);
        this.Belly_r2.setRotationPoint(0.0F, 0.9493F, -5.9653F);
        this.Belly.addChild(Belly_r2);
        this.setRotateAngle(Belly_r2, 0.0698F, 0.0F, 0.0F);
        this.Belly_r2.cubeList.add(new ModelBox(Belly_r2, 14, 30, -0.5F, 0.0F, 0.7F, 1, 1, 6, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.4069F, -5.0662F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1406F, 0.1728F, 0.0243F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 1.0466F, -5.7052F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 26, 38, -0.5F, -0.297F, 1.7697F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5F, -3.8F);
        this.Bodyfront.addChild(neck3);
        this.setRotateAngle(neck3, -0.0777F, 0.4086F, 0.1306F);
        this.neck3.cubeList.add(new ModelBox(neck3, 57, 49, -0.5F, 0.2F, -1.6F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.2792F, -1.7595F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3526F, 0.116F, -0.0607F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(0.0F, 1.1F, -5.6F);
        this.neck2.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.192F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 21, 47, -0.5F, 0.4553F, 2.3796F, 1, 1, 4, -0.15F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.6417F, -2.76F);
        this.neck2.addChild(Neck);
        this.setRotateAngle(Neck, -0.1337F, 0.3464F, 0.0437F);


        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(0.0F, 0.3983F, -2.8177F);
        this.Neck.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, 0.192F, 0.0F, 0.0F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 14, 49, -0.5F, 0.4553F, -0.1204F, 1, 1, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.363F, -2.8704F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.5792F, 0.2883F, 0.1765F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.3761F, -2.1269F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0424F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.93F, -1.6F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, 0.1061F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.82F, -1.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.1698F, 0.0F, 0.0F);


        this.Faceslopefront = new ModelRenderer(this);
        this.Faceslopefront.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.Upperjawfront.addChild(Faceslopefront);
        this.setRotateAngle(Faceslopefront, 0.7391F, 0.0F, 0.0F);


        this.Faceslopemiddle = new ModelRenderer(this);
        this.Faceslopemiddle.setRotationPoint(-0.01F, -0.41F, -1.75F);
        this.Upperjawmiddle.addChild(Faceslopemiddle);
        this.setRotateAngle(Faceslopemiddle, 0.2546F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0424F, -0.1911F, 0.0F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0424F, 0.1911F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5239F, 0.6731F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.0873F, 0.0F, 0.0F);


        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.0899F, -2.6656F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.0424F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, 0.0848F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1323F, 0.0F, 0.0F);


        this.Lowerjawslopeback = new ModelRenderer(this);
        this.Lowerjawslopeback.setRotationPoint(-0.01F, 1.9F, -0.12F);
        this.Lowerjawmiddleback.addChild(Lowerjawslopeback);
        this.setRotateAngle(Lowerjawslopeback, -0.1698F, 0.0F, 0.0F);


        this.Lowerjawslopefront = new ModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, -0.01F, -1.7F);
        this.Lowerjawslopeback.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.0087F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.9905F, 6.2235F, -1.0481F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.271F, 0.0F, -0.0424F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.0985F, 4.1856F, 0.5657F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.7652F, 0.0F, 0.0424F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.0254F, 6.1692F, -0.3025F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.7842F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.9905F, 6.2235F, -1.0481F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.558F, 0.0F, 0.0424F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.0985F, 4.1856F, 0.5657F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.8088F, 0.0F, -0.0424F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0254F, 6.1692F, -0.3025F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.2596F, 0.0225F, -0.0843F);


        this.Bellyhump = new ModelRenderer(this);
        this.Bellyhump.setRotationPoint(0.0F, -1.2507F, 0.0347F);
        this.Belly.addChild(Bellyhump);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.0443F, 3.3614F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1964F, -0.257F, 0.0505F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, -0.0338F, -0.9239F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.0436F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 6, 14, -0.5F, 0.4F, 8.1F, 1, 1, 1, -0.15F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 0, 8, -0.5F, 0.4F, 0.4F, 1, 1, 8, -0.15F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.4911F, 7.9609F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.2064F, 0.2565F, -0.0531F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, -0.5963F, 0.014F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 25, 14, -0.5F, 0.8F, 6.4F, 1, 1, 1, -0.16F, false));
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 19, 8, -0.5F, 0.8F, -0.1F, 1, 1, 7, -0.15F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.3698F, 6.9713F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.3382F, 0.1281F, 0.0269F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 21, 17, -0.5F, 0.0943F, -0.0998F, 1, 1, 6, -0.15F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0364F, 5.7995F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.2916F, 0.3881F, 0.0613F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 36, 18, -0.5F, 0.1F, -0.5F, 1, 1, 4, -0.15F, false));
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 39, 21, -0.5F, 0.1F, 3.2F, 1, 1, 1, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0192F, 3.9068F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.2336F, 0.345F, 0.0542F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 15, 38, -0.5F, 0.1F, -0.1F, 1, 1, 4, -0.15F, false));

        this.Tailbasehump = new ModelRenderer(this);
        this.Tailbasehump.setRotationPoint(0.0F, -1.5338F, -1.2239F);
        this.Tailbase.addChild(Tailbasehump);
        this.setRotateAngle(Tailbasehump, -0.1061F, 0.0F, 0.0F);


        this.Hiphumpfront = new ModelRenderer(this);
        this.Hiphumpfront.setRotationPoint(0.0F, -1.4302F, -7.6013F);
        this.Hips.addChild(Hiphumpfront);
        this.setRotateAngle(Hiphumpfront, -0.0637F, 0.0F, 0.0F);


        this.Hiphumpback = new ModelRenderer(this);
        this.Hiphumpback.setRotationPoint(-0.01F, -5.0F, 6.0F);
        this.Hiphumpfront.addChild(Hiphumpback);
        this.setRotateAngle(Hiphumpback, -0.2122F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.1923F, 0.8431F, 0.0365F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.41F, -0.0376F, -0.0196F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 8.926F, -0.1976F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4705F, 0.0F, 0.0F);


        this.Rightheel = new ModelRenderer(this);
        this.Rightheel.setRotationPoint(0.0F, 7.4688F, 0.6196F);
        this.Rightshin.addChild(Rightheel);
        this.setRotateAngle(Rightheel, -0.0625F, 0.0F, 0.0F);


        this.Righttoes = new ModelRenderer(this);
        this.Righttoes.setRotationPoint(0.01F, -0.2772F, -2.799F);
        this.Rightheel.addChild(Righttoes);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.1923F, 0.8431F, 0.0365F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.2882F, 0.0376F, 0.0196F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 8.926F, -0.1976F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5142F, 0.0F, 0.0F);


        this.Leftheel = new ModelRenderer(this);
        this.Leftheel.setRotationPoint(0.0F, 7.4688F, 0.6196F);
        this.Leftshin.addChild(Leftheel);
        this.setRotateAngle(Leftheel, -0.1061F, 0.0F, 0.0F);


        this.Lefttoes = new ModelRenderer(this);
        this.Lefttoes.setRotationPoint(-0.01F, -0.2772F, -2.799F);
        this.Leftheel.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, -0.5672F, 0.0F, 0.0F);

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
