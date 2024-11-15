package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrilophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer armLw;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer neckflap;
    private final ModelRenderer armRw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonTrilophosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -6.0F, 3.4F, 1, 6, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.7F, -7.65F, -9.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6632F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.4F, 0.65F, -0.5F, 1, 7, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.7F, -7.65F, -9.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6632F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 3.25F, -3.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.0F, 3.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 4.2F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.1F, -6.5F, -2.0F);
        this.fossil.addChild(body);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1069F, -1.253F, 3.8243F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 6, -0.5069F, 0.6712F, -0.1283F, 1, 1, 6, -0.15F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.6546F, 1.047F, 5.7137F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 1.1515F, -0.8125F, -0.7373F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.0F, 0.5F, -4.45F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.48F, 0.3491F, 0.0F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.0684F, 4.4868F, 0.3167F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -1.1091F, -0.0407F, 0.6517F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.6546F, 1.047F, 5.7137F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.9163F, 0.0F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.0F, 0.5F, -4.45F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.48F, -0.3491F, 0.0F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.0684F, 4.4868F, 0.3167F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, -0.5672F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.1069F, -0.853F, 3.6243F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0365F, -0.2151F, -0.008F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9F, -3.8F);
        this.body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 48, -0.5069F, 0.6365F, 0.1388F, 1, 1, 4, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4F, -8.8F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, -0.5069F, -0.4F, 0.4F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4151F, -8.189F);
        this.body1.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.3054F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.3559F, -1.4791F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 53, -0.5069F, -0.2F, -2.0F, 1, 1, 4, -0.15F, false));

        this.armLw = new ModelRenderer(this);
        this.armLw.setRotationPoint(2.5F, 1.5651F, -3.611F);
        this.chest.addChild(armLw);


        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.armLw.addChild(armL);
        this.setRotateAngle(armL, 0.2182F, 0.9163F, 0.0F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.0887F, 0.0726F, 4.3097F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.2182F, 0.2182F, 0.0F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.451F, 4.2046F, 0.7678F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -0.1745F, -1.2217F, 0.0F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-5.2138F, 1.6F, 0.0F);
        this.armLw.addChild(armL4);
        this.setRotateAngle(armL4, -1.2206F, -1.1757F, 1.318F);


        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(-0.0793F, 0.2679F, 4.2674F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, -0.2838F, -0.1194F, 0.3858F);


        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(-0.5F, 4.5F, 0.75F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 0.2249F, 1.2936F, -0.3593F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.1849F, -2.411F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4752F, -0.3931F, 0.1946F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.7556F, -0.2976F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3499F, -0.0656F, 0.0239F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 54, -0.5069F, -0.35F, -3.0F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8444F, -2.7976F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.257F, -0.5522F, -0.137F);
        this.neck2.cubeList.add(new ModelBox(neck2, 65, 30, -0.5069F, -0.6435F, -4.6802F, 1, 1, 2, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.3935F, 0.0198F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 54, -0.5069F, 0.65F, -2.8F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.1F, -0.9935F, -3.9052F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2643F, -0.5944F, -0.1504F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.578F, 0.1422F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1047F, 0.0F, 0.0F);


        this.neckflap = new ModelRenderer(this);
        this.neckflap.setRotationPoint(0.0F, 0.8056F, -4.0976F);
        this.neck.addChild(neckflap);
        this.setRotateAngle(neckflap, 0.2225F, 0.0F, 0.0F);


        this.armRw = new ModelRenderer(this);
        this.armRw.setRotationPoint(-2.5F, 1.5651F, -3.611F);
        this.chest.addChild(armRw);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.1069F, 1.047F, 9.3243F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2796F, 0.2521F, -0.0715F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.1966F, -0.7776F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0175F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, -1, 26, -0.4069F, -0.1F, -0.1F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1835F, 7.8379F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0879F, 0.6526F, 0.0535F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 15, -0.5069F, 0.2563F, -0.3137F, 1, 1, 9, -0.15F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 24, -0.5069F, 0.2563F, 8.3863F, 1, 1, 1, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0586F, 8.934F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2807F, -0.7219F, -0.1883F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, -0.5069F, 0.1784F, -0.2034F, 1, 1, 9, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 23, -0.5069F, 0.1784F, 8.4966F, 1, 1, 1, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.271F, 8.8704F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1594F, -0.6049F, -0.0911F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5069F, 0.4809F, -0.1029F, 1, 1, 14, -0.15F, false));

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
