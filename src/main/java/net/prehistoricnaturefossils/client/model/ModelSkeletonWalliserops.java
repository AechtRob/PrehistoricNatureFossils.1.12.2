package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonWalliserops extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer folk;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;

    public ModelSkeletonWalliserops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 49, -7.0F, -1.0F, -9.0F, 13, 1, 14, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 54, -3.0F, -4.0F, -7.0F, 6, 3, 7, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 11, 54, -4.0F, -2.0F, -5.0F, 8, 1, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 54, -2.5F, -5.0F, -6.0F, 5, 1, 5, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 54, -3.0F, -3.0F, 0.0F, 5, 1, 3, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 54, -2.5F, -4.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.25F, 2.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.3054F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 14, 14, -0.49F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 17, -1.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, -1.0F, -5.0F, 4, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.25F, -4.75F, 5, 0, 8, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 18, -2.0F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -0.5F, -1.25F, -2.75F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, -2.5F, -0.5F, -2.0F, 5, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 8, -2.0F, -1.0F, -1.5F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, 1.75F, -3.0F, -1.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 6, 0.0F, -3.0F, -0.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -1.75F, -3.0F, -1.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -3.25F, -0.25F, 0.0F, 1, 0, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 2.25F, -0.25F, 0.0F, 1, 0, 2, 0.0F, false));

        this.folk = new ModelRenderer(this);
        this.folk.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.head.addChild(folk);
        this.folk.cubeList.add(new ModelBox(folk, 10, 10, -2.0F, -0.5F, -6.9F, 4, 0, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.folk.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -0.001F, -4.0F, 1, 0, 4, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.folk.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 3, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

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
