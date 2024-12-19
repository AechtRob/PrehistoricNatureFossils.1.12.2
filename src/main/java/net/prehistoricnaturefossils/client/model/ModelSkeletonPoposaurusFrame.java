package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPoposaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Poposaurus;
    private final ModelRenderer Basin;
    private final ModelRenderer Body;
    private final ModelRenderer Chest;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LHand;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer LHand2;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LFoot;
    private final ModelRenderer LFoot2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer LFoot3;
    private final ModelRenderer LFoot4;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonPoposaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.1F, -15.1F, -10.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.6F, 0.1F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.1F, -11.7F, -10.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4316F, 0.0662F, 1.4282F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -4.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.2F, 1.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0694F, -0.0073F, 1.4663F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.8F, -5.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -15.1F, 1.1F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0698F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -0.9F, -0.5F, 1, 16, 1, -0.16F, false));

        this.Poposaurus = new ModelRenderer(this);
        this.Poposaurus.setRotationPoint(0.0F, -17.5F, -12.0F);
        this.fossil.addChild(Poposaurus);
        this.setRotateAngle(Poposaurus, -0.0436F, 0.0F, 0.0F);


        this.Basin = new ModelRenderer(this);
        this.Basin.setRotationPoint(0.0F, 0.8F, 13.0F);
        this.Poposaurus.addChild(Basin);
        this.setRotateAngle(Basin, 0.0F, 0.0F, -0.2182F);
        this.Basin.cubeList.add(new ModelBox(Basin, 21, 25, -0.5F, -0.4F, -3.0F, 1, 1, 8, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.573F, -3.0153F);
        this.Basin.addChild(Body);
        this.setRotateAngle(Body, 0.1072F, 0.217F, 0.0232F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 36, -0.5F, 0.143F, -6.7804F, 1, 1, 7, -0.15F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.124F, -6.921F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1056F, 0.217F, 0.0232F);
        this.Chest.cubeList.add(new ModelBox(Chest, 41, 15, -0.5F, 0.234F, -5.5594F, 1, 1, 6, -0.15F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.0641F, -4.9271F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.318F, 0.1384F, 0.0295F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0472F, -3.8931F);
        this.Neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 45, -0.5F, -0.2F, 0.0F, 1, 1, 4, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.4211F, -3.6994F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.2155F, 0.1973F, 0.149F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.4613F, -2.4732F);
        this.Neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0785F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 45, -1.0F, -0.348F, -1.5837F, 1, 1, 4, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.2387F, -4.0732F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0349F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.6F, -1.4F);
        this.Neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 60, -1.0F, -0.2F, -0.3F, 1, 1, 2, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0954F, -1.0944F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0082F, 0.2531F, -0.1886F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.7404F, -0.19F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.8727F, 0.0F, 0.0F);


        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(2.3383F, 3.5046F, -3.1407F);
        this.Chest.addChild(LArm);
        this.setRotateAngle(LArm, 0.73F, 0.1748F, -0.1311F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(0.0F, 3.767F, 0.4456F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.7017F, 0.0F, 0.0F);


        this.LHand = new ModelRenderer(this);
        this.LHand.setRotationPoint(0.2088F, 3.6137F, -0.1F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.6981F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-2.3383F, 3.5046F, -3.1407F);
        this.Chest.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.7836F, -0.0715F, 0.0501F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(0.0F, 3.767F, 0.4456F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, -0.8727F, 0.0F, 0.0F);


        this.LHand2 = new ModelRenderer(this);
        this.LHand2.setRotationPoint(-0.2088F, 3.6137F, -0.1F);
        this.LArm4.addChild(LHand2);
        this.setRotateAngle(LHand2, 0.0F, 0.0F, -0.6545F);


        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.3F, 0.9356F, 0.133F);
        this.Basin.addChild(LLeg);
        this.setRotateAngle(LLeg, -1.2654F, 0.0F, 0.0F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0F, 6.7188F, -0.1483F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 1.9635F, 0.0F, 0.0F);


        this.LFoot = new ModelRenderer(this);
        this.LFoot.setRotationPoint(0.0F, 6.6648F, 0.1163F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, -0.1484F, 0.0F, 0.0F);


        this.LFoot2 = new ModelRenderer(this);
        this.LFoot2.setRotationPoint(0.0F, -0.136F, -3.5362F);
        this.LFoot.addChild(LFoot2);
        this.setRotateAngle(LFoot2, 0.3054F, 0.0F, 0.0F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.3F, 0.9356F, 0.133F);
        this.Basin.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.1313F, 0.0057F, 0.1308F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-1.0F, 6.7188F, -0.1483F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.7399F, -0.0668F, 0.0562F);


        this.LFoot3 = new ModelRenderer(this);
        this.LFoot3.setRotationPoint(0.0F, 6.6648F, 0.1163F);
        this.LLeg4.addChild(LFoot3);
        this.setRotateAngle(LFoot3, 0.1581F, 0.1429F, -0.0656F);


        this.LFoot4 = new ModelRenderer(this);
        this.LFoot4.setRotationPoint(0.0F, -0.136F, -3.5362F);
        this.LFoot3.addChild(LFoot4);
        this.setRotateAngle(LFoot4, -1.0036F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5167F, 4.9235F);
        this.Basin.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0872F, -0.0038F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 14, -0.5F, 0.0979F, -0.204F, 1, 1, 9, -0.15F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 8, 22, -0.5F, 0.0979F, 8.296F, 1, 1, 1, -0.16F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0485F, 8.8956F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1118F, 0.2031F, -0.0795F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.1488F, 0.5276F);
        this.Tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 0, -0.5F, 0.0F, -0.6F, 1, 1, 8, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.7248F, 7.7079F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, -0.0859F, 0.0152F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.0718F, 0.2961F);
        this.Tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 14, -0.5F, 0.1F, -0.5F, 1, 1, 9, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 22, -0.5F, 0.1F, 8.1F, 1, 1, 1, -0.16F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.404F, 9.0763F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1398F, -0.4342F, 0.0212F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, 0.0206F, -0.1569F, 1, 1, 12, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1692F, 11.8107F);
        this.Tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1962F, -0.4721F, 0.0902F);
        this.tail5.cubeList.add(new ModelBox(tail5, 21, 35, -0.5F, 0.1858F, -0.3098F, 1, 1, 8, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2269F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 25, -0.5F, 0.2F, -0.4F, 1, 1, 9, -0.15F, false));

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
