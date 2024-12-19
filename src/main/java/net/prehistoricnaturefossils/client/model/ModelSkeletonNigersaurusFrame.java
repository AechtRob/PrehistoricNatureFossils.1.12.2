package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNigersaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer hips_r1;
    private final ModelRenderer bodymiddle;
    private final ModelRenderer bodymiddle_r1;
    private final ModelRenderer bodyfront;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer neckbase;
    private final ModelRenderer neckbase_r1;
    private final ModelRenderer neckmiddlebase;
    private final ModelRenderer neckmiddlebase_r1;
    private final ModelRenderer neckmiddlefront;
    private final ModelRenderer neckfront;
    private final ModelRenderer neckfront_r1;
    private final ModelRenderer head;
    private final ModelRenderer lowerjawbase;
    private final ModelRenderer lowerjawmiddlebase;
    private final ModelRenderer lowerjawmiddlefront;
    private final ModelRenderer lowerjawfront;
    private final ModelRenderer lowerjawteeth;
    private final ModelRenderer lowerlip;
    private final ModelRenderer mouthslope;
    private final ModelRenderer upperjawbase;
    private final ModelRenderer upperjawmiddle;
    private final ModelRenderer upperjawfront;
    private final ModelRenderer leftupperjawside;
    private final ModelRenderer leftupperjawside2;
    private final ModelRenderer leftupperjawside6;
    private final ModelRenderer rightupperjawside;
    private final ModelRenderer upperjawteeth;
    private final ModelRenderer upperjawfront3;
    private final ModelRenderer leftupperjawside5;
    private final ModelRenderer rightupperjawside3;
    private final ModelRenderer upperjawteeth3;
    private final ModelRenderer upperjawfront2;
    private final ModelRenderer leftupperjawside3;
    private final ModelRenderer leftupperjawside4;
    private final ModelRenderer rightupperjawside2;
    private final ModelRenderer upperjawteeth2;
    private final ModelRenderer snoutslope;
    private final ModelRenderer headslopebase;
    private final ModelRenderer headslopemiddle;
    private final ModelRenderer headslopefront;
    private final ModelRenderer bone;
    private final ModelRenderer lefteye;
    private final ModelRenderer righteye;
    private final ModelRenderer neckflapfront;
    private final ModelRenderer neckskinfront;
    private final ModelRenderer neckflapmidfront;
    private final ModelRenderer neckskinmidfront;
    private final ModelRenderer neckflapmidbase;
    private final ModelRenderer neckskinmidbase;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer tail9;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg8;

    public ModelSkeletonNigersaurusFrame() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -34.0F, 13.1F, 1, 34, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -30.0F, -15.6F, 1, 30, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -33.0F, -15.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -15.8F, -9.0F, -0.5F, 1, 18, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -8.0F, 28.2F, 1, 16, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -9.2F, 15.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0188F, 0.0F, 0.0F);


        this.hips_r1 = new ModelRenderer(this);
        this.hips_r1.setRotationPoint(0.0F, 0.5F, -7.8F);
        this.hips.addChild(hips_r1);
        this.setRotateAngle(hips_r1, 0.0349F, 0.0F, 0.0F);
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 0, 59, -0.5F, -1.007F, 0.1001F, 1, 2, 14, 0.0F, false));

        this.bodymiddle = new ModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -0.4F, -7.7F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.2583F, 0.0F, 0.0F);


        this.bodymiddle_r1 = new ModelRenderer(this);
        this.bodymiddle_r1.setRotationPoint(0.0F, -2.9957F, -18.7643F);
        this.bodymiddle.addChild(bodymiddle_r1);
        this.setRotateAngle(bodymiddle_r1, -0.1047F, 0.0F, 0.0F);
        this.bodymiddle_r1.cubeList.add(new ModelBox(bodymiddle_r1, 0, 0, -0.5F, 0.9371F, 0.9492F, 1, 2, 18, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -1.7957F, -17.7643F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.1274F, 0.0F, 0.0F);


        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(0.0F, -1.7111F, -11.8942F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, -0.1745F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 79, 11, -0.5F, -0.5749F, -0.0301F, 1, 2, 12, 0.0F, false));

        this.neckbase = new ModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, -2.2592F, -11.4602F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.0813F, 0.2134F, -0.0418F);


        this.neckbase_r1 = new ModelRenderer(this);
        this.neckbase_r1.setRotationPoint(0.0F, 0.2505F, -10.5942F);
        this.neckbase.addChild(neckbase_r1);
        this.setRotateAngle(neckbase_r1, 0.0175F, 0.0F, 0.0F);
        this.neckbase_r1.cubeList.add(new ModelBox(neckbase_r1, 1, 92, -0.5F, 0.0F, -0.1F, 1, 2, 11, 0.0F, false));

        this.neckmiddlebase = new ModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, 0.3505F, -10.6942F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, 0.3113F, 0.2179F, 0.0107F);


        this.neckmiddlebase_r1 = new ModelRenderer(this);
        this.neckmiddlebase_r1.setRotationPoint(0.3F, 0.8539F, -10.3082F);
        this.neckmiddlebase.addChild(neckmiddlebase_r1);
        this.setRotateAngle(neckmiddlebase_r1, 0.0F, -0.0349F, 0.0F);
        this.neckmiddlebase_r1.cubeList.add(new ModelBox(neckmiddlebase_r1, 88, 83, -0.5F, -1.0F, -0.5F, 1, 2, 11, 0.0F, false));

        this.neckmiddlefront = new ModelRenderer(this);
        this.neckmiddlefront.setRotationPoint(0.0F, -0.3461F, -10.7082F);
        this.neckmiddlebase.addChild(neckmiddlefront);
        this.setRotateAngle(neckmiddlefront, 0.2412F, 0.4567F, -0.1684F);
        this.neckmiddlefront.cubeList.add(new ModelBox(neckmiddlefront, 110, 32, -0.5F, 0.1546F, -7.013F, 1, 2, 7, 0.0F, false));

        this.neckfront = new ModelRenderer(this);
        this.neckfront.setRotationPoint(0.0F, -0.3454F, -7.013F);
        this.neckmiddlefront.addChild(neckfront);
        this.setRotateAngle(neckfront, 0.2218F, 0.0511F, -0.0646F);
        this.neckfront.cubeList.add(new ModelBox(neckfront, 128, 24, -0.5F, 0.2788F, -4.6931F, 1, 1, 5, -0.15F, false));

        this.neckfront_r1 = new ModelRenderer(this);
        this.neckfront_r1.setRotationPoint(0.0F, 0.0788F, -4.6931F);
        this.neckfront.addChild(neckfront_r1);
        this.setRotateAngle(neckfront_r1, 0.1047F, 0.0F, 0.0F);
        this.neckfront_r1.cubeList.add(new ModelBox(neckfront_r1, 131, 107, -0.5F, 0.2F, -4.8F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4988F, -8.869F);
        this.neckfront.addChild(head);
        this.setRotateAngle(head, -0.2859F, 0.1645F, -0.25F);


        this.lowerjawbase = new ModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.01F, 2.1827F, 0.0487F);
        this.head.addChild(lowerjawbase);
        this.setRotateAngle(lowerjawbase, 0.6196F, 0.0F, 0.0F);


        this.lowerjawmiddlebase = new ModelRenderer(this);
        this.lowerjawmiddlebase.setRotationPoint(-0.01F, -0.2F, -1.4F);
        this.lowerjawbase.addChild(lowerjawmiddlebase);
        this.setRotateAngle(lowerjawmiddlebase, 0.7217F, 0.0F, 0.0F);


        this.lowerjawmiddlefront = new ModelRenderer(this);
        this.lowerjawmiddlefront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lowerjawmiddlebase.addChild(lowerjawmiddlefront);
        this.setRotateAngle(lowerjawmiddlefront, 0.3609F, 0.0F, 0.0F);


        this.lowerjawfront = new ModelRenderer(this);
        this.lowerjawfront.setRotationPoint(-0.01F, 1.0F, -1.0F);
        this.lowerjawmiddlefront.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.2972F, 0.0F, 0.0F);


        this.lowerjawteeth = new ModelRenderer(this);
        this.lowerjawteeth.setRotationPoint(0.01F, 0.0F, -1.0F);
        this.lowerjawfront.addChild(lowerjawteeth);
        this.setRotateAngle(lowerjawteeth, -0.8491F, 0.0F, 0.0F);


        this.lowerlip = new ModelRenderer(this);
        this.lowerlip.setRotationPoint(-0.01F, 0.02F, -0.58F);
        this.lowerjawfront.addChild(lowerlip);
        this.setRotateAngle(lowerlip, -0.0494F, 0.0F, 0.0F);


        this.mouthslope = new ModelRenderer(this);
        this.mouthslope.setRotationPoint(-0.09F, 0.0F, -2.0F);
        this.lowerjawmiddlebase.addChild(mouthslope);
        this.setRotateAngle(mouthslope, 0.8491F, 0.0F, 0.0F);


        this.upperjawbase = new ModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.0F, 3.2897F, -2.5512F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.743F, 0.0F, 0.0F);


        this.upperjawmiddle = new ModelRenderer(this);
        this.upperjawmiddle.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.upperjawbase.addChild(upperjawmiddle);
        this.setRotateAngle(upperjawmiddle, 0.4458F, 0.0F, 0.0F);


        this.upperjawfront = new ModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.upperjawmiddle.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, 0.4458F, 0.0F, 0.0F);


        this.leftupperjawside = new ModelRenderer(this);
        this.leftupperjawside.setRotationPoint(3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(leftupperjawside);
        this.setRotateAngle(leftupperjawside, -0.8067F, 0.0424F, 0.3396F);


        this.leftupperjawside2 = new ModelRenderer(this);
        this.leftupperjawside2.setRotationPoint(3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(leftupperjawside2);
        this.setRotateAngle(leftupperjawside2, -0.8067F, 0.0424F, 0.3396F);


        this.leftupperjawside6 = new ModelRenderer(this);
        this.leftupperjawside6.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(leftupperjawside6);
        this.setRotateAngle(leftupperjawside6, -0.8067F, -0.0424F, -0.3396F);


        this.rightupperjawside = new ModelRenderer(this);
        this.rightupperjawside.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(rightupperjawside);
        this.setRotateAngle(rightupperjawside, -0.8067F, -0.0424F, -0.3396F);


        this.upperjawteeth = new ModelRenderer(this);
        this.upperjawteeth.setRotationPoint(0.0F, -0.3F, -0.95F);
        this.upperjawfront.addChild(upperjawteeth);
        this.setRotateAngle(upperjawteeth, -0.8067F, 0.0F, 0.0F);


        this.upperjawfront3 = new ModelRenderer(this);
        this.upperjawfront3.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.upperjawmiddle.addChild(upperjawfront3);
        this.setRotateAngle(upperjawfront3, 0.4458F, 0.0F, 0.0F);


        this.leftupperjawside5 = new ModelRenderer(this);
        this.leftupperjawside5.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront3.addChild(leftupperjawside5);
        this.setRotateAngle(leftupperjawside5, -0.8067F, -0.0424F, -0.3396F);


        this.rightupperjawside3 = new ModelRenderer(this);
        this.rightupperjawside3.setRotationPoint(3.2F, -0.5F, 0.6F);
        this.upperjawfront3.addChild(rightupperjawside3);
        this.setRotateAngle(rightupperjawside3, -0.8067F, 0.0424F, 0.3396F);


        this.upperjawteeth3 = new ModelRenderer(this);
        this.upperjawteeth3.setRotationPoint(0.0F, -0.3F, -0.95F);
        this.upperjawfront3.addChild(upperjawteeth3);
        this.setRotateAngle(upperjawteeth3, -0.8067F, 0.0F, 0.0F);


        this.upperjawfront2 = new ModelRenderer(this);
        this.upperjawfront2.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.upperjawmiddle.addChild(upperjawfront2);
        this.setRotateAngle(upperjawfront2, 0.4458F, 0.0F, 0.0F);


        this.leftupperjawside3 = new ModelRenderer(this);
        this.leftupperjawside3.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront2.addChild(leftupperjawside3);
        this.setRotateAngle(leftupperjawside3, -0.8067F, -0.0424F, -0.3396F);


        this.leftupperjawside4 = new ModelRenderer(this);
        this.leftupperjawside4.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront2.addChild(leftupperjawside4);
        this.setRotateAngle(leftupperjawside4, -0.8067F, -0.0424F, -0.3396F);


        this.rightupperjawside2 = new ModelRenderer(this);
        this.rightupperjawside2.setRotationPoint(3.2F, -0.5F, 0.6F);
        this.upperjawfront2.addChild(rightupperjawside2);
        this.setRotateAngle(rightupperjawside2, -0.8067F, 0.0424F, 0.3396F);


        this.upperjawteeth2 = new ModelRenderer(this);
        this.upperjawteeth2.setRotationPoint(0.0F, -0.3F, -0.95F);
        this.upperjawfront2.addChild(upperjawteeth2);
        this.setRotateAngle(upperjawteeth2, -0.8067F, 0.0F, 0.0F);


        this.snoutslope = new ModelRenderer(this);
        this.snoutslope.setRotationPoint(0.1F, 0.0F, -2.0F);
        this.upperjawmiddle.addChild(snoutslope);
        this.setRotateAngle(snoutslope, 0.7217F, 0.0F, 0.0F);


        this.headslopebase = new ModelRenderer(this);
        this.headslopebase.setRotationPoint(0.0F, -1.7103F, -2.5512F);
        this.head.addChild(headslopebase);
        this.setRotateAngle(headslopebase, 0.743F, 0.0F, 0.0F);


        this.headslopemiddle = new ModelRenderer(this);
        this.headslopemiddle.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.headslopebase.addChild(headslopemiddle);
        this.setRotateAngle(headslopemiddle, 0.2335F, 0.0F, 0.0F);


        this.headslopefront = new ModelRenderer(this);
        this.headslopefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.headslopemiddle.addChild(headslopefront);
        this.setRotateAngle(headslopefront, 0.522F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.headslopebase.addChild(bone);


        this.lefteye = new ModelRenderer(this);
        this.lefteye.setRotationPoint(2.12F, -0.3103F, -0.9512F);
        this.head.addChild(lefteye);


        this.righteye = new ModelRenderer(this);
        this.righteye.setRotationPoint(-2.12F, -0.3103F, -0.9512F);
        this.head.addChild(righteye);


        this.neckflapfront = new ModelRenderer(this);
        this.neckflapfront.setRotationPoint(0.0F, 0.1788F, -6.9931F);
        this.neckfront.addChild(neckflapfront);
        this.setRotateAngle(neckflapfront, -0.1911F, 0.0F, 0.0F);


        this.neckskinfront = new ModelRenderer(this);
        this.neckskinfront.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.neckflapfront.addChild(neckskinfront);
        this.setRotateAngle(neckskinfront, -0.0848F, 0.0F, 0.0F);


        this.neckflapmidfront = new ModelRenderer(this);
        this.neckflapmidfront.setRotationPoint(0.01F, -0.2454F, -7.013F);
        this.neckmiddlefront.addChild(neckflapmidfront);
        this.setRotateAngle(neckflapmidfront, -0.2335F, 0.0F, 0.0F);


        this.neckskinmidfront = new ModelRenderer(this);
        this.neckskinmidfront.setRotationPoint(0.0F, 3.5F, -0.5F);
        this.neckflapmidfront.addChild(neckskinmidfront);
        this.setRotateAngle(neckskinmidfront, -0.0424F, 0.0F, 0.0F);


        this.neckflapmidbase = new ModelRenderer(this);
        this.neckflapmidbase.setRotationPoint(0.0F, 2.0539F, -11.4082F);
        this.neckmiddlebase.addChild(neckflapmidbase);
        this.setRotateAngle(neckflapmidbase, -0.1911F, 0.0F, 0.0F);


        this.neckskinmidbase = new ModelRenderer(this);
        this.neckskinmidbase.setRotationPoint(0.0F, 3.3F, 0.8F);
        this.neckflapmidbase.addChild(neckskinmidbase);
        this.setRotateAngle(neckskinmidbase, -0.0637F, 0.0F, 0.0F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(7.8412F, 10.6027F, -9.9017F);
        this.bodyfront.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5236F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.4079F, 11.6833F, -4.077F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.8239F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.8937F, 7.9632F, -1.8005F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.9948F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-7.8412F, 10.6027F, -9.9017F);
        this.bodyfront.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.0036F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.4079F, 11.6833F, -4.077F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.5184F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.8937F, 7.9632F, -1.8005F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3403F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9F, 6.2F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0774F, -0.087F, -0.0067F);
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 67, -0.5F, -0.093F, -0.0489F, 1, 2, 13, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2652F, 12.7171F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1024F, -0.1736F, 0.0178F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -0.5F, 0.1226F, 0.0231F, 1, 2, 18, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0588F, 18.1182F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0497F, -0.2179F, 0.0108F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 49, -0.5F, 0.1188F, -0.1343F, 1, 2, 15, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3234F, 14.8564F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0648F, -0.392F, -0.0248F);
        this.tail4.cubeList.add(new ModelBox(tail4, -2, 74, -0.5F, 0.2411F, -0.352F, 1, 1, 15, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1571F, 13.9274F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0375F, -0.5233F, -0.0187F);
        this.tail5.cubeList.add(new ModelBox(tail5, 78, 26, -0.5F, 0.0836F, 0.171F, 1, 1, 13, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1796F, 12.8562F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0121F, 0.349F, 0.0041F);
        this.tail6.cubeList.add(new ModelBox(tail6, 64, 67, -0.5F, 0.2382F, -0.1012F, 1, 1, 14, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.049F, 13.9722F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1293F, 0.2597F, -0.0334F);
        this.tail7.cubeList.add(new ModelBox(tail7, 48, 97, -0.5F, 0.2F, -0.3F, 1, 1, 10, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.01F, -0.0679F, 9.657F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.3485F, 0.2881F, -0.1029F);
        this.tail8.cubeList.add(new ModelBox(tail8, 71, 108, -0.5F, 0.2F, 0.0F, 1, 1, 9, -0.15F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(-0.01F, 0.0128F, 8.9121F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.357F, 0.246F, -0.0906F);
        this.tail9.cubeList.add(new ModelBox(tail9, 92, 108, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.4F, 0.625F, -1.6625F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.1781F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 1.8525F, -18.1897F);
        this.leftLeg.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.3491F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.0183F, 2.6466F, -12.0539F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0119F, -0.0163F, 0.0386F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -1.79F, -2.0694F);
        this.leftLeg4.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, -0.0349F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.4F, 0.625F, -1.6625F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 1.5272F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 1.8525F, -18.1897F);
        this.rightLeg.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.3054F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0183F, 2.6466F, -12.0539F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.2499F, 0.0163F, -0.0386F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -1.79F, -2.0694F);
        this.rightLeg4.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, -0.0349F, 0.0F, 0.0F);

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
