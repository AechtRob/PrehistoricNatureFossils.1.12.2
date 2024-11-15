package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTeraterpetonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hip;
    private final ModelRenderer lowerbody;
    private final ModelRenderer cube_r4;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonTeraterpetonFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -6.0F, 4.2F, 1, 6, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.7F, -6.5F, -6.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4014F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, 0.5F, -0.5F, 1, 6, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.7F, -6.5F, -6.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4014F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.0F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -8.5F, 4.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -1.5F, -0.5F, 1, 4, 1, -0.15F, false));

        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -4.5F, 7.0F);
        this.fossil.addChild(hip);


        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -2.1F, -3.2F);
        this.hip.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.492F, -0.0527F);
        this.lowerbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 29, -0.5F, 0.7527F, -0.2936F, 1, 1, 5, -0.15F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(1.9546F, 1.4878F, 1.3969F);
        this.lowerbody.addChild(legL);
        this.setRotateAngle(legL, 1.0539F, -1.1782F, -1.0104F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-0.1046F, 0.5277F, -3.3738F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.48F, 0.3491F, 0.0F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.0583F, 3.8686F, 0.6464F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.6196F, 0.0F, 0.0F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-1.9546F, 1.4878F, 1.3969F);
        this.lowerbody.addChild(legL4);
        this.setRotateAngle(legL4, 0.5102F, 0.8216F, 0.3801F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.1046F, 0.5277F, -3.3738F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.48F, -0.3491F, 0.0F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.0583F, 3.8686F, 0.6464F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, -0.6196F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.392F, 3.8473F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.0097F, -0.218F, 0.0447F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -0.5F, 0.35F, 0.1F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0206F, -0.2642F, -0.0695F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 7, -0.5F, 0.2F, -0.3F, 1, 1, 6, -0.15F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 12, -0.5F, 0.2F, 5.4F, 1, 1, 1, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(-0.4992F, 0.0666F, 6.0044F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0526F, -0.4375F, 0.0196F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 15, 0.0115F, 0.1055F, -0.2662F, 1, 1, 6, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 20, 0.0115F, 0.1055F, 5.4338F, 1, 1, 1, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5115F, -0.0738F, 5.8613F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2112F, -0.3283F, -0.0661F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.1641F, -0.2278F, 1, 1, 7, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -3.2F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -0.5F, 0.2F, -7.1F, 1, 1, 7, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0438F, -0.0872F, -0.0038F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.7528F, -3.7793F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 31, -1.0F, -0.3F, 0.0F, 1, 1, 4, -0.15F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(2.5069F, 2.1243F, -2.9588F);
        this.body2.addChild(armL);
        this.setRotateAngle(armL, 0.0387F, 0.8935F, 0.0453F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(-0.1371F, 0.2679F, 3.2911F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.2182F, 0.2182F, 0.0F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(-0.5675F, 3.7081F, 0.8169F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -0.6868F, -1.1558F, 0.438F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-2.5069F, 2.1243F, -2.9588F);
        this.body2.addChild(armL4);
        this.setRotateAngle(armL4, -2.7445F, -0.5036F, 2.6148F);


        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(0.1371F, 0.2679F, 3.2911F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, 0.534F, 0.4269F, 0.6923F);


        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(0.5675F, 3.7081F, 0.8169F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 3.1343F, 1.5312F, 2.0819F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 0.2528F, -3.5793F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1478F, -0.263F, -0.0753F);
        this.neck.cubeList.add(new ModelBox(neck, 37, 23, 0.0F, 0.2105F, -2.8435F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.0105F, -2.6435F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.4518F, -0.2865F, -0.1074F);
        this.neck2.cubeList.add(new ModelBox(neck2, 37, 28, -0.5F, 0.1881F, -2.9365F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1924F, -2.2664F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1838F, 0.0438F, 0.0047F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9002F, -0.1576F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0087F, 0.0F, 0.0F);

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
