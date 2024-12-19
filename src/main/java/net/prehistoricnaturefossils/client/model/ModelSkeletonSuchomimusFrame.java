package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSuchomimusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer rightthigh;
    private final ModelRenderer rightshin;
    private final ModelRenderer rightankle;
    private final ModelRenderer rightfoot;
    private final ModelRenderer righttoes;
    private final ModelRenderer leftthigh;
    private final ModelRenderer leftshin;
    private final ModelRenderer leftankle;
    private final ModelRenderer leftfoot;
    private final ModelRenderer lefttoes;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer leftfingers;
    private final ModelRenderer leftclaw;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer rightfingers;
    private final ModelRenderer rightclaw;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r17;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftAngularSurangular;
    private final ModelRenderer leftDentary;

    public ModelSkeletonSuchomimusFrame() {
        this.textureWidth = 147;
        this.textureHeight = 147;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -36.0F, 1.3F, 1, 36, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.7F, -27.5F, -31.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.4F, -3.5F, -0.5F, 1, 31, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7F, -27.5F, -31.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -5.2F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -33.5F, 1.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 0.9F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -38.1882F, 0.6534F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.5F, -6.2F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 19, -1.5F, 0.6F, -0.1F, 1, 2, 16, 0.0F, false));

        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(4.077F, 4.1469F, 1.0529F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.6117F, -0.0243F, -0.0347F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(-0.3439F, 15.8243F, -2.7602F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.796F, 0.0F, 0.0424F);


        this.rightankle = new ModelRenderer(this);
        this.rightankle.setRotationPoint(-0.0524F, 16.5383F, 0.1517F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.5056F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.4743F, -0.8039F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.2358F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.rightfoot.addChild(righttoes);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-4.077F, 4.1469F, 1.0529F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, 0.1301F, 0.0243F, 0.0347F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(0.3439F, 15.8243F, -2.7602F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.5342F, 0.0F, -0.0424F);


        this.leftankle = new ModelRenderer(this);
        this.leftankle.setRotationPoint(0.0524F, 16.5383F, 0.1517F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.9856F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 4.4743F, -0.8039F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.2358F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.leftfoot.addChild(lefttoes);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.5559F, 9.5933F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1625F, 0.2585F, 0.0419F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.6485F, -1.2552F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 78, -0.5F, 3.7F, 1.5F, 1, 2, 10, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.6822F, 9.2232F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.062F, -0.1742F, 0.0108F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2694F, 8.9704F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 0, -0.5F, 0.8F, -9.0F, 1, 2, 16, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.3577F, 15.7924F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0542F, 0.2614F, -0.014F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 40, -0.5F, 0.3F, 0.0F, 1, 2, 18, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.21F, 18.1275F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1806F, 0.2577F, 0.0465F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 5.1974F, 8.7124F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 39, 0.5F, -4.2F, -10.1F, 1, 1, 20, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.4663F, 18.8959F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0037F, -0.5265F, 0.1204F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 4.0904F, 11.1196F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 61, 0.0F, -1.2F, -12.0F, 1, 1, 15, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 3.4718F, 14.0564F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0567F, -0.3921F, 0.0217F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.8282F, 5.135F);
        this.tail6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, -0.7F, -5.7F, 1, 1, 21, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0501F, -6.5075F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0175F, 0.0873F, 0.0015F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0501F, -13.6925F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.096F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 87, -0.5F, 0.9406F, -6.001F, 1, 2, 6, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0501F, -13.6925F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0611F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 1, 61, -0.5F, 0.9406F, -0.001F, 1, 2, 14, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1662F, -19.6337F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0349F, 0.0436F, 0.0015F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 3.1F, -4.0F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1571F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 78, 0.5F, -2.1F, -4.5F, 1, 2, 9, 0.005F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.5432F, 10.2151F, -7.4352F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -1.133F, 0.1966F, -0.2699F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.2598F, 3.8898F, 8.0395F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1329F, -0.4386F, -0.8718F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.9727F, 4.9738F, -0.9538F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.0873F, 0.0F, 0.0F);


        this.leftfingers = new ModelRenderer(this);
        this.leftfingers.setRotationPoint(-0.2273F, 4.0462F, -0.3604F);
        this.lefthand.addChild(leftfingers);


        this.leftclaw = new ModelRenderer(this);
        this.leftclaw.setRotationPoint(0.6951F, 0.3403F, -1.4667F);
        this.lefthand.addChild(leftclaw);
        this.setRotateAngle(leftclaw, -0.0436F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.5432F, 10.2151F, -7.4352F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.9148F, -0.1966F, 0.2699F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.2598F, 3.8898F, 8.0395F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0946F, 0.1827F, 0.9256F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.9727F, 4.9738F, -0.9538F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, -0.0873F, 0.0F, 0.0F);


        this.rightfingers = new ModelRenderer(this);
        this.rightfingers.setRotationPoint(0.2273F, 4.0462F, -0.3604F);
        this.righthand.addChild(rightfingers);


        this.rightclaw = new ModelRenderer(this);
        this.rightclaw.setRotationPoint(-0.6951F, 0.3403F, -1.4667F);
        this.righthand.addChild(rightclaw);
        this.setRotateAngle(rightclaw, -0.1302F, 0.1304F, 0.0115F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.4391F, -8.8957F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.2705F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.7814F, -3.933F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5061F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 104, 66, -0.5F, -0.1974F, -0.5778F, 1, 1, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0115F, -3.733F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0947F, -0.2555F, 0.0579F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -5.25F, -2.3938F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0297F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 106, 75, -1.0F, 0.7179F, 0.9454F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.1855F, -2.2293F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -3.2293F, -2.4464F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.8901F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 94, -1.0F, 0.5F, -1.9787F, 1, 1, 6, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -4.4459F, -3.7399F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1745F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.509F, -3.6302F);
        this.neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2967F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 95, 25, -1.0F, 0.5112F, -0.9487F, 1, 1, 5, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.7472F, -4.6625F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2094F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, -3.45F);
        this.neck5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0611F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 99, 87, 0.5F, 0.2224F, -1.4687F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2756F, -5.2684F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, -0.6649F, -0.2721F, 0.2382F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4321F, 2.0731F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.leftAngularSurangular = new ModelRenderer(this);
        this.leftAngularSurangular.setRotationPoint(0.5F, -0.1091F, -0.4042F);
        this.jaw.addChild(leftAngularSurangular);
        this.setRotateAngle(leftAngularSurangular, 0.0436F, 0.0F, 0.0F);


        this.leftDentary = new ModelRenderer(this);
        this.leftDentary.setRotationPoint(0.5F, 4.1F, -4.9F);
        this.leftAngularSurangular.addChild(leftDentary);
        this.setRotateAngle(leftDentary, 0.7243F, 0.0F, 0.0F);

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
