package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTyrannotitanFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer hips_r1;
    private final ModelRenderer bodymiddle;
    private final ModelRenderer bodyfront;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer neckbase;
    private final ModelRenderer neckbase_r1;
    private final ModelRenderer neckmiddlebase;
    private final ModelRenderer neckmiddlebase_r1;
    private final ModelRenderer neckmiddleend;
    private final ModelRenderer neckmiddleend_r1;
    private final ModelRenderer neckend;
    private final ModelRenderer head;
    private final ModelRenderer upperjawbase;
    private final ModelRenderer upperjawmiddle;
    private final ModelRenderer upperjawfront;
    private final ModelRenderer nose;
    private final ModelRenderer rupperteethfront;
    private final ModelRenderer upperfrontteeth;
    private final ModelRenderer nasalridgebase;
    private final ModelRenderer rupperteethmidfront;
    private final ModelRenderer rightnasalridgebase;
    private final ModelRenderer rightnasalridgeend;
    private final ModelRenderer rupperteethmidback;
    private final ModelRenderer upperjawbase2;
    private final ModelRenderer upperjawmiddle2;
    private final ModelRenderer upperjawfront2;
    private final ModelRenderer nose2;
    private final ModelRenderer rupperteethfront2;
    private final ModelRenderer upperfrontteeth2;
    private final ModelRenderer nasalridgebase2;
    private final ModelRenderer rupperteethmidfront2;
    private final ModelRenderer leftnasalridgebase;
    private final ModelRenderer leftnasalridgeend;
    private final ModelRenderer rupperteethmidback2;
    private final ModelRenderer lowerjawback;
    private final ModelRenderer lowerjawmiddleback;
    private final ModelRenderer lowerjawmiddle;
    private final ModelRenderer lowerjawmiddlefront;
    private final ModelRenderer lowerjawend;
    private final ModelRenderer chin;
    private final ModelRenderer rlowerteethfront;
    private final ModelRenderer lowerfrontteeth;
    private final ModelRenderer rlowerteethmidfront;
    private final ModelRenderer rlowerteethmidback;
    private final ModelRenderer rlowerteethback;
    private final ModelRenderer lowerjawmiddleback2;
    private final ModelRenderer lowerjawmiddle2;
    private final ModelRenderer lowerjawmiddlefront2;
    private final ModelRenderer lowerjawend2;
    private final ModelRenderer chin2;
    private final ModelRenderer rlowerteethfront2;
    private final ModelRenderer lowerfrontteeth2;
    private final ModelRenderer rlowerteethmidfront2;
    private final ModelRenderer rlowerteethmidback2;
    private final ModelRenderer rlowerteethback2;
    private final ModelRenderer rightjawflank;
    private final ModelRenderer leftjawflank;
    private final ModelRenderer rightheadflank;
    private final ModelRenderer rightlacrimalcrest;
    private final ModelRenderer rightlacrimalfront;
    private final ModelRenderer rightlacrimalback;
    private final ModelRenderer leftheadflank;
    private final ModelRenderer leftlacrimalcrest;
    private final ModelRenderer leftlacrimalfront;
    private final ModelRenderer leftlacrimalback;
    private final ModelRenderer chestslope;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer bellyslope;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tailridge2;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;

    public ModelSkeletonTyrannotitanFrame() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -48.0F, 2.3F, 1, 48, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -31.05F, -30.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.2F, -8.95F, -0.5F, 1, 40, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -31.05F, -30.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 3.45F, -6.0F, -0.5F, 1, 17, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -35.0F, 2.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -11.5F, -8.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.16F, 2.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.3478F, 0.0F, 0.0F);


        this.hips_r1 = new ModelRenderer(this);
        this.hips_r1.setRotationPoint(0.0F, -5.1F, -8.0F);
        this.hips.addChild(hips_r1);
        this.setRotateAngle(hips_r1, -0.1222F, 0.0F, 0.0F);
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 50, 27, -0.5F, 0.9F, 0.0F, 1, 3, 20, 0.005F, false));

        this.bodymiddle = new ModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -3.9F, -7.6F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.1077F, 0.0868F, -0.0094F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 1, 0, -0.5F, -0.2312F, -23.099F, 1, 3, 23, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.3688F, -22.999F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, -0.0012F, 0.0436F, 0.0F);


        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(0.0F, 1.1369F, -10.8602F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, 0.1571F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 46, 74, -0.5F, 0.0F, 0.0F, 1, 3, 11, 0.005F, false));

        this.neckbase = new ModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, 1.1369F, -10.6602F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.3436F, 0.1233F, -0.044F);


        this.neckbase_r1 = new ModelRenderer(this);
        this.neckbase_r1.setRotationPoint(0.0F, 0.9649F, -7.8657F);
        this.neckbase.addChild(neckbase_r1);
        this.setRotateAngle(neckbase_r1, -0.0175F, 0.0F, 0.0F);
        this.neckbase_r1.cubeList.add(new ModelBox(neckbase_r1, 75, 97, -0.5F, -1.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.neckmiddlebase = new ModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, -0.2351F, -7.3657F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.2828F, 0.2046F, 0.0751F);


        this.neckmiddlebase_r1 = new ModelRenderer(this);
        this.neckmiddlebase_r1.setRotationPoint(0.0F, -1.554F, -4.9205F);
        this.neckmiddlebase.addChild(neckmiddlebase_r1);
        this.setRotateAngle(neckmiddlebase_r1, -0.1397F, 0.0344F, -0.0061F);
        this.neckmiddlebase_r1.cubeList.add(new ModelBox(neckmiddlebase_r1, 0, 129, -0.5F, 1.0F, 0.7F, 1, 2, 5, 0.005F, false));

        this.neckmiddleend = new ModelRenderer(this);
        this.neckmiddleend.setRotationPoint(-0.01F, -0.654F, -5.0205F);
        this.neckmiddlebase.addChild(neckmiddleend);
        this.setRotateAngle(neckmiddleend, 0.0266F, 0.2172F, 0.0484F);


        this.neckmiddleend_r1 = new ModelRenderer(this);
        this.neckmiddleend_r1.setRotationPoint(0.0F, -1.6164F, -5.671F);
        this.neckmiddleend.addChild(neckmiddleend_r1);
        this.setRotateAngle(neckmiddleend_r1, -0.1222F, 0.0F, 0.0F);
        this.neckmiddleend_r1.cubeList.add(new ModelBox(neckmiddleend_r1, 121, 19, -0.49F, 1.0F, 0.7F, 1, 2, 6, 0.0F, false));

        this.neckend = new ModelRenderer(this);
        this.neckend.setRotationPoint(0.0F, -0.5164F, -5.371F);
        this.neckmiddleend.addChild(neckend);
        this.setRotateAngle(neckend, 0.1097F, 0.2125F, 0.0661F);
        this.neckend.cubeList.add(new ModelBox(neckend, 124, 88, -0.49F, -0.098F, -4.8684F, 1, 2, 5, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.302F, -4.3684F);
        this.neckend.addChild(head);
        this.setRotateAngle(head, 0.0637F, 0.0F, 0.0F);


        this.upperjawbase = new ModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.0F, -1.8211F, -7.7631F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.2546F, 0.0F, 0.0F);


        this.upperjawmiddle = new ModelRenderer(this);
        this.upperjawmiddle.setRotationPoint(0.0F, 8.0F, -10.0F);
        this.upperjawbase.addChild(upperjawmiddle);
        this.setRotateAngle(upperjawmiddle, -0.2546F, 0.0F, 0.0F);


        this.upperjawfront = new ModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.upperjawmiddle.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, -0.1061F, 0.0F, 0.0F);


        this.nose = new ModelRenderer(this);
        this.nose.setRotationPoint(-0.01F, -3.0F, -3.0F);
        this.upperjawfront.addChild(nose);
        this.setRotateAngle(nose, -0.672F, 0.0F, 0.0F);


        this.rupperteethfront = new ModelRenderer(this);
        this.rupperteethfront.setRotationPoint(1.7F, -0.55F, -1.2F);
        this.upperjawfront.addChild(rupperteethfront);
        this.setRotateAngle(rupperteethfront, 0.2759F, 0.1061F, 0.0F);


        this.upperfrontteeth = new ModelRenderer(this);
        this.upperfrontteeth.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.upperjawfront.addChild(upperfrontteeth);
        this.setRotateAngle(upperfrontteeth, 0.3821F, 0.0F, 0.0F);


        this.nasalridgebase = new ModelRenderer(this);
        this.nasalridgebase.setRotationPoint(-0.01F, -6.0F, -4.0F);
        this.upperjawmiddle.addChild(nasalridgebase);
        this.setRotateAngle(nasalridgebase, -0.658F, 0.0F, 0.0F);


        this.rupperteethmidfront = new ModelRenderer(this);
        this.rupperteethmidfront.setRotationPoint(2.05F, -0.4F, -1.9F);
        this.upperjawmiddle.addChild(rupperteethmidfront);
        this.setRotateAngle(rupperteethmidfront, -0.1698F, 0.1061F, 0.0F);


        this.rightnasalridgebase = new ModelRenderer(this);
        this.rightnasalridgebase.setRotationPoint(2.25F, -0.6F, -10.1F);
        this.upperjawbase.addChild(rightnasalridgebase);
        this.setRotateAngle(rightnasalridgebase, 0.1911F, 0.0213F, -0.0424F);


        this.rightnasalridgeend = new ModelRenderer(this);
        this.rightnasalridgeend.setRotationPoint(-1.6F, 1.2F, 5.9F);
        this.rightnasalridgebase.addChild(rightnasalridgeend);
        this.setRotateAngle(rightnasalridgeend, -0.4387F, 0.3379F, 0.0594F);


        this.rupperteethmidback = new ModelRenderer(this);
        this.rupperteethmidback.setRotationPoint(2.4F, 8.0F, -7.2F);
        this.upperjawbase.addChild(rupperteethmidback);
        this.setRotateAngle(rupperteethmidback, 0.0F, 0.0424F, 0.0F);


        this.upperjawbase2 = new ModelRenderer(this);
        this.upperjawbase2.setRotationPoint(0.02F, -1.8211F, -7.7631F);
        this.head.addChild(upperjawbase2);
        this.setRotateAngle(upperjawbase2, 0.2546F, 0.0F, 0.0F);


        this.upperjawmiddle2 = new ModelRenderer(this);
        this.upperjawmiddle2.setRotationPoint(0.0F, 8.0F, -10.0F);
        this.upperjawbase2.addChild(upperjawmiddle2);
        this.setRotateAngle(upperjawmiddle2, -0.2546F, 0.0F, 0.0F);


        this.upperjawfront2 = new ModelRenderer(this);
        this.upperjawfront2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.upperjawmiddle2.addChild(upperjawfront2);
        this.setRotateAngle(upperjawfront2, -0.1061F, 0.0F, 0.0F);


        this.nose2 = new ModelRenderer(this);
        this.nose2.setRotationPoint(0.01F, -3.0F, -3.0F);
        this.upperjawfront2.addChild(nose2);
        this.setRotateAngle(nose2, -0.672F, 0.0F, 0.0F);


        this.rupperteethfront2 = new ModelRenderer(this);
        this.rupperteethfront2.setRotationPoint(-1.7F, -0.55F, -1.2F);
        this.upperjawfront2.addChild(rupperteethfront2);
        this.setRotateAngle(rupperteethfront2, 0.2759F, -0.1061F, 0.0F);


        this.upperfrontteeth2 = new ModelRenderer(this);
        this.upperfrontteeth2.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.upperjawfront2.addChild(upperfrontteeth2);
        this.setRotateAngle(upperfrontteeth2, 0.3821F, 0.0F, 0.0F);


        this.nasalridgebase2 = new ModelRenderer(this);
        this.nasalridgebase2.setRotationPoint(0.01F, -6.0F, -4.0F);
        this.upperjawmiddle2.addChild(nasalridgebase2);
        this.setRotateAngle(nasalridgebase2, -0.658F, 0.0F, 0.0F);


        this.rupperteethmidfront2 = new ModelRenderer(this);
        this.rupperteethmidfront2.setRotationPoint(-2.05F, -0.4F, -1.9F);
        this.upperjawmiddle2.addChild(rupperteethmidfront2);
        this.setRotateAngle(rupperteethmidfront2, -0.1698F, -0.1061F, 0.0F);


        this.leftnasalridgebase = new ModelRenderer(this);
        this.leftnasalridgebase.setRotationPoint(-2.25F, -0.6F, -10.1F);
        this.upperjawbase2.addChild(leftnasalridgebase);
        this.setRotateAngle(leftnasalridgebase, 0.1911F, -0.0213F, 0.0424F);


        this.leftnasalridgeend = new ModelRenderer(this);
        this.leftnasalridgeend.setRotationPoint(1.6F, 1.2F, 5.9F);
        this.leftnasalridgebase.addChild(leftnasalridgeend);
        this.setRotateAngle(leftnasalridgeend, -0.4387F, -0.3379F, -0.0594F);


        this.rupperteethmidback2 = new ModelRenderer(this);
        this.rupperteethmidback2.setRotationPoint(-2.4F, 8.0F, -7.2F);
        this.upperjawbase2.addChild(rupperteethmidback2);
        this.setRotateAngle(rupperteethmidback2, 0.0F, -0.0424F, 0.0F);


        this.lowerjawback = new ModelRenderer(this);
        this.lowerjawback.setRotationPoint(0.0F, 5.488F, 3.6328F);
        this.head.addChild(lowerjawback);
        this.setRotateAngle(lowerjawback, 0.6894F, 0.0F, 0.0F);


        this.lowerjawmiddleback = new ModelRenderer(this);
        this.lowerjawmiddleback.setRotationPoint(0.0F, 0.4161F, -11.4452F);
        this.lowerjawback.addChild(lowerjawmiddleback);
        this.setRotateAngle(lowerjawmiddleback, 0.1061F, 0.0F, 0.0F);


        this.lowerjawmiddle = new ModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.lowerjawmiddleback.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, 0.1911F, 0.0F, 0.0F);


        this.lowerjawmiddlefront = new ModelRenderer(this);
        this.lowerjawmiddlefront.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.lowerjawmiddle.addChild(lowerjawmiddlefront);
        this.setRotateAngle(lowerjawmiddlefront, -0.2546F, 0.0F, 0.0F);


        this.lowerjawend = new ModelRenderer(this);
        this.lowerjawend.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.lowerjawmiddlefront.addChild(lowerjawend);
        this.setRotateAngle(lowerjawend, -0.1274F, 0.0F, 0.0F);


        this.chin = new ModelRenderer(this);
        this.chin.setRotationPoint(-0.01F, 0.2F, 0.12F);
        this.lowerjawend.addChild(chin);
        this.setRotateAngle(chin, 0.1485F, 0.0F, 0.0F);


        this.rlowerteethfront = new ModelRenderer(this);
        this.rlowerteethfront.setRotationPoint(1.3F, -3.0F, -2.1F);
        this.lowerjawend.addChild(rlowerteethfront);
        this.setRotateAngle(rlowerteethfront, 0.1698F, 0.1698F, 0.0F);


        this.lowerfrontteeth = new ModelRenderer(this);
        this.lowerfrontteeth.setRotationPoint(0.0F, -2.7F, -3.4F);
        this.lowerjawend.addChild(lowerfrontteeth);
        this.setRotateAngle(lowerfrontteeth, 0.0213F, 0.0F, 0.0F);


        this.rlowerteethmidfront = new ModelRenderer(this);
        this.rlowerteethmidfront.setRotationPoint(1.8F, -3.1F, -2.4F);
        this.lowerjawmiddlefront.addChild(rlowerteethmidfront);
        this.setRotateAngle(rlowerteethmidfront, -0.1274F, 0.1061F, 0.0F);


        this.rlowerteethmidback = new ModelRenderer(this);
        this.rlowerteethmidback.setRotationPoint(2.2F, 0.2F, -1.7F);
        this.lowerjawmiddle.addChild(rlowerteethmidback);
        this.setRotateAngle(rlowerteethmidback, -0.1698F, 0.0848F, 0.0F);


        this.rlowerteethback = new ModelRenderer(this);
        this.rlowerteethback.setRotationPoint(2.45F, 0.7F, -2.5F);
        this.lowerjawmiddleback.addChild(rlowerteethback);
        this.setRotateAngle(rlowerteethback, -0.1274F, 0.0637F, 0.0F);


        this.lowerjawmiddleback2 = new ModelRenderer(this);
        this.lowerjawmiddleback2.setRotationPoint(0.02F, 0.4161F, -11.4452F);
        this.lowerjawback.addChild(lowerjawmiddleback2);
        this.setRotateAngle(lowerjawmiddleback2, 0.1061F, 0.0F, 0.0F);


        this.lowerjawmiddle2 = new ModelRenderer(this);
        this.lowerjawmiddle2.setRotationPoint(0.01F, 0.0F, -4.0F);
        this.lowerjawmiddleback2.addChild(lowerjawmiddle2);
        this.setRotateAngle(lowerjawmiddle2, 0.1911F, 0.0F, 0.0F);


        this.lowerjawmiddlefront2 = new ModelRenderer(this);
        this.lowerjawmiddlefront2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.lowerjawmiddle2.addChild(lowerjawmiddlefront2);
        this.setRotateAngle(lowerjawmiddlefront2, -0.2546F, 0.0F, 0.0F);


        this.lowerjawend2 = new ModelRenderer(this);
        this.lowerjawend2.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.lowerjawmiddlefront2.addChild(lowerjawend2);
        this.setRotateAngle(lowerjawend2, -0.1274F, 0.0F, 0.0F);


        this.chin2 = new ModelRenderer(this);
        this.chin2.setRotationPoint(0.01F, 0.2F, 0.12F);
        this.lowerjawend2.addChild(chin2);
        this.setRotateAngle(chin2, 0.1485F, 0.0F, 0.0F);


        this.rlowerteethfront2 = new ModelRenderer(this);
        this.rlowerteethfront2.setRotationPoint(-1.3F, -3.0F, -2.1F);
        this.lowerjawend2.addChild(rlowerteethfront2);
        this.setRotateAngle(rlowerteethfront2, 0.1698F, -0.1698F, 0.0F);


        this.lowerfrontteeth2 = new ModelRenderer(this);
        this.lowerfrontteeth2.setRotationPoint(0.0F, -2.7F, -3.4F);
        this.lowerjawend2.addChild(lowerfrontteeth2);
        this.setRotateAngle(lowerfrontteeth2, 0.0213F, 0.0F, 0.0F);


        this.rlowerteethmidfront2 = new ModelRenderer(this);
        this.rlowerteethmidfront2.setRotationPoint(-1.8F, -3.1F, -2.4F);
        this.lowerjawmiddlefront2.addChild(rlowerteethmidfront2);
        this.setRotateAngle(rlowerteethmidfront2, -0.1274F, -0.1061F, 0.0F);


        this.rlowerteethmidback2 = new ModelRenderer(this);
        this.rlowerteethmidback2.setRotationPoint(-2.2F, 0.2F, -1.7F);
        this.lowerjawmiddle2.addChild(rlowerteethmidback2);
        this.setRotateAngle(rlowerteethmidback2, -0.1698F, -0.0848F, 0.0F);


        this.rlowerteethback2 = new ModelRenderer(this);
        this.rlowerteethback2.setRotationPoint(-2.45F, 0.7F, -2.5F);
        this.lowerjawmiddleback2.addChild(rlowerteethback2);
        this.setRotateAngle(rlowerteethback2, -0.1274F, -0.0637F, 0.0F);


        this.rightjawflank = new ModelRenderer(this);
        this.rightjawflank.setRotationPoint(5.27F, 2.6161F, -7.3452F);
        this.lowerjawback.addChild(rightjawflank);
        this.setRotateAngle(rightjawflank, 0.0848F, 0.4033F, 0.0F);


        this.leftjawflank = new ModelRenderer(this);
        this.leftjawflank.setRotationPoint(-5.25F, 2.6161F, -7.3452F);
        this.lowerjawback.addChild(leftjawflank);
        this.setRotateAngle(leftjawflank, 0.0848F, -0.4033F, 0.0F);


        this.rightheadflank = new ModelRenderer(this);
        this.rightheadflank.setRotationPoint(5.33F, 1.9789F, -3.4631F);
        this.head.addChild(rightheadflank);
        this.setRotateAngle(rightheadflank, 0.0848F, 0.3821F, 0.0F);


        this.rightlacrimalcrest = new ModelRenderer(this);
        this.rightlacrimalcrest.setRotationPoint(-0.7291F, -3.4123F, -2.184F);
        this.rightheadflank.addChild(rightlacrimalcrest);
        this.setRotateAngle(rightlacrimalcrest, -0.2972F, -0.0637F, 0.1061F);


        this.rightlacrimalfront = new ModelRenderer(this);
        this.rightlacrimalfront.setRotationPoint(-1.05F, -2.9032F, -0.2609F);
        this.rightlacrimalcrest.addChild(rightlacrimalfront);
        this.setRotateAngle(rightlacrimalfront, 0.6369F, 0.0213F, 0.0F);


        this.rightlacrimalback = new ModelRenderer(this);
        this.rightlacrimalback.setRotationPoint(-1.0F, -2.3032F, 1.1891F);
        this.rightlacrimalcrest.addChild(rightlacrimalback);
        this.setRotateAngle(rightlacrimalback, -0.0213F, -0.3396F, -0.1061F);


        this.leftheadflank = new ModelRenderer(this);
        this.leftheadflank.setRotationPoint(-5.31F, 1.9789F, -3.4631F);
        this.head.addChild(leftheadflank);
        this.setRotateAngle(leftheadflank, 0.0848F, -0.3821F, 0.0F);


        this.leftlacrimalcrest = new ModelRenderer(this);
        this.leftlacrimalcrest.setRotationPoint(0.7291F, -3.4123F, -2.184F);
        this.leftheadflank.addChild(leftlacrimalcrest);
        this.setRotateAngle(leftlacrimalcrest, -0.2972F, 0.0637F, -0.1061F);


        this.leftlacrimalfront = new ModelRenderer(this);
        this.leftlacrimalfront.setRotationPoint(1.05F, -2.9032F, -0.2609F);
        this.leftlacrimalcrest.addChild(leftlacrimalfront);
        this.setRotateAngle(leftlacrimalfront, 0.6369F, -0.0213F, 0.0F);


        this.leftlacrimalback = new ModelRenderer(this);
        this.leftlacrimalback.setRotationPoint(1.0F, -2.3032F, 1.1891F);
        this.leftlacrimalcrest.addChild(leftlacrimalback);
        this.setRotateAngle(leftlacrimalback, -0.0213F, 0.3396F, 0.1061F);


        this.chestslope = new ModelRenderer(this);
        this.chestslope.setRotationPoint(-0.01F, 16.9369F, -10.6602F);
        this.bodyfront.addChild(chestslope);
        this.setRotateAngle(chestslope, -0.2122F, 0.0F, 0.0F);


        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(8.4232F, 12.5695F, -4.7148F);
        this.bodyfront.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0791F, -0.654F, -0.5567F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3F, 5.0347F, 0.6893F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1784F, -0.0167F, 0.0403F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8693F, 0.2266F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-8.4232F, 12.5695F, -4.7148F);
        this.bodyfront.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.2256F, 0.9301F, 0.7002F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3F, 5.0347F, 0.6893F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8727F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8693F, 0.2266F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);


        this.bellyslope = new ModelRenderer(this);
        this.bellyslope.setRotationPoint(0.0F, 20.1688F, -23.099F);
        this.bodymiddle.addChild(bellyslope);
        this.setRotateAngle(bellyslope, -0.1274F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.4F, 11.9F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1471F, 0.1727F, -0.0254F);
        this.tail1.cubeList.add(new ModelBox(tail1, 1, 27, -0.5F, -0.3074F, -0.2935F, 1, 3, 21, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2074F, 20.6065F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.097F, 0.1303F, 0.0126F);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 51, -0.5F, -0.022F, -0.796F, 1, 2, 20, 0.005F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2679F, 18.6857F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0131F, -0.2181F, 0.0028F);
        this.tail3.cubeList.add(new ModelBox(tail3, 53, 0, -0.5F, -0.3429F, -0.2462F, 1, 2, 17, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4485F, 16.6649F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1116F, -0.1735F, 0.0193F);
        this.tail4.cubeList.add(new ModelBox(tail4, 74, 84, -0.5F, 0.0711F, -0.1829F, 1, 2, 11, 0.005F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5083F, 10.7379F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0995F, -0.2606F, 0.0257F);
        this.tail5.cubeList.add(new ModelBox(tail5, 94, 51, -0.5F, 0.3213F, 0.0141F, 1, 1, 10, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1038F, 9.8236F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1239F, -0.2599F, 0.032F);
        this.tail6.cubeList.add(new ModelBox(tail6, 96, 98, -0.5F, 0.3957F, -0.0983F, 1, 1, 9, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.5F, 0.2957F, 8.9017F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2533F, -0.1691F, 0.0435F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 105, -1.0F, 0.1439F, -0.1005F, 1, 1, 8, -0.15F, false));

        this.tailridge2 = new ModelRenderer(this);
        this.tailridge2.setRotationPoint(0.0F, -2.522F, -0.296F);
        this.tail2.addChild(tailridge2);
        this.setRotateAngle(tailridge2, -0.2122F, 0.0F, 0.0F);


        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.5F, -0.3305F, 1.4922F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.7418F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 20.7052F, 1.2374F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 17.1525F, -1.6529F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6283F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.1011F, -0.1323F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.3216F, -3.098F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.0835F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.5F, -0.3305F, 1.4922F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4363F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 20.7052F, 1.2374F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9163F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 17.1525F, -1.6529F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6283F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.1011F, -0.1323F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.3216F, -3.098F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -0.3453F, 0.0F, 0.0F);

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
