package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSilesaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Silesaurus;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer MetacarpalL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer MetacarpalL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonSilesaurusFrame() {
        this.textureWidth = 82;
        this.textureHeight = 82;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, 1.8F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.7F, -12.95F, -11.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1484F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.45F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.7F, -12.95F, -11.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1484F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -8.05F, -0.5F, 1, 21, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -15.0F, 2.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.4F, -3.0F, -0.5F, 1, 6, 1, -0.15F, false));

        this.Silesaurus = new ModelRenderer(this);
        this.Silesaurus.setRotationPoint(0.0F, -22.8F, 3.0F);
        this.fossil.addChild(Silesaurus);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.5F, -0.1F, -3.0F);
        this.Silesaurus.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.0524F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 22, 34, -1.0F, 0.7F, -0.3F, 1, 1, 8, -0.1F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.2F, 1.4891F, -0.2853F);
        this.Silesaurus.addChild(LegL);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.1F, 9.4508F, 0.0988F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.2654F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(-0.1F, 8.8959F, -0.2334F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.8988F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.0458F, 0.0285F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.7453F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.2F, 1.4891F, -0.2853F);
        this.Silesaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -1.1082F, 0.1167F, -0.037F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(-0.1F, 9.4508F, 0.0988F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 1.6144F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.1F, 8.8959F, -0.2334F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -1.4224F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 4.0458F, 0.0285F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 1.6581F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.9F, 3.9F);
        this.Silesaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0524F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.0354F, 0.421F, 1, 1, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.5564F, 10.8991F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0263F, -0.0872F, 0.0023F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 13, -0.5F, -0.0607F, 0.3991F, 1, 1, 10, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1936F, 9.8118F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0262F, -0.0436F, -0.0011F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 23, 13, -0.5F, 0.1178F, 0.2815F, 1, 1, 10, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.257F, 9.9231F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1595F, -0.1724F, 0.0276F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 23, 25, -0.5F, 0.3026F, 0.26F, 1, 1, 8, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.035F, 7.8917F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1072F, -0.217F, 0.0232F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 25, -0.5F, 0.3026F, -0.04F, 1, 1, 10, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.1995F, -2.9791F);
        this.Silesaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0524F, -0.0436F, -0.0023F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4F, -4.1F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 14, -0.5F, 0.7592F, -0.0866F, 1, 1, 4, -0.1F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -10.1F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 43, -0.5F, 0.7787F, 0.0267F, 1, 1, 6, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.2739F, -10.0862F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.0444F, -0.1308F, 0.0058F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.6F, -5.8F);
        this.Chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1658F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 25, -0.5F, -0.0261F, 0.2308F, 1, 1, 6, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.9F, 7.1F, -2.0F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 1.0036F, 0.0F, 0.0F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 6.0569F, 0.1241F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -1.5708F, -0.5411F, -1.5708F);


        this.MetacarpalL = new ModelRenderer(this);
        this.MetacarpalL.setRotationPoint(0.9F, 8.914F, -0.6001F);
        this.ElbowL.addChild(MetacarpalL);
        this.setRotateAngle(MetacarpalL, -0.6981F, -1.5533F, 1.5708F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 0.6777F, 0.5719F);
        this.MetacarpalL.addChild(HandL);
        this.setRotateAngle(HandL, 1.1956F, 0.0F, 0.0F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.9F, 7.1F, -2.0F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 1.309F, 0.0F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 6.0569F, 0.1241F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -1.6537F, 0.3574F, 1.3376F);


        this.MetacarpalL2 = new ModelRenderer(this);
        this.MetacarpalL2.setRotationPoint(-0.9F, 8.914F, -0.6001F);
        this.ElbowL2.addChild(MetacarpalL2);
        this.setRotateAngle(MetacarpalL2, 1.6495F, 1.4561F, 1.1699F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 0.6777F, 0.5719F);
        this.MetacarpalL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 1.3265F, 0.0F, 0.0F);


        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.9223F, -5.7458F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1848F, -0.1287F, 0.024F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.4F, -2.8F);
        this.Neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 3, -0.5F, 0.7128F, -0.223F, 1, 1, 4, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.0043F, -2.7718F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.133F, -0.2163F, -0.0287F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6F, 0.7F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4276F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 35, -0.5F, 0.1F, -6.6F, 1, 1, 6, -0.1F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.4716F, -5.2193F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0282F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 32, 61, -0.4714F, 0.3995F, -1.989F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -1.8F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.0F, -0.3927F, -0.1309F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 1.0315F, 0.6908F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6894F, 0.0F, 0.0F);

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
