package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProdinocerasFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer leftMaxilla;
    private final ModelRenderer leftCanine;
    private final ModelRenderer rightMaxilla;
    private final ModelRenderer rightCanine;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonProdinocerasFrame() {
        this.textureWidth = 77;
        this.textureHeight = 77;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -16.8F, 8.7F, 1, 17, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-10.7F, -12.0F, -16.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.8552F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.8F, -2.0F, -0.5F, 1, 14, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-10.7F, -12.0F, -16.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.8552F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 1.0F, -3.5F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, -13.4F, 9.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.6232F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.5F, -4.0F, -0.5F, 1, 8, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.2239F, 8.4628F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.3142F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -0.5F, 0.6014F, -0.3611F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.6F, 2.929F, 0.4801F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5411F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.2289F, 0.1913F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0123F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 5.8263F, 0.0345F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.7017F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 1.7097F, -0.0561F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.925F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.3491F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.6F, 2.929F, 0.4801F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.2392F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.2289F, 0.1913F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3177F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 5.8263F, 0.0345F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1781F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 1.7097F, -0.0561F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.4923F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.1329F, -1.8045F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3491F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.7F, -3.5F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.1174F, 0.2601F, -0.0303F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1675F, -13.1658F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 13, -0.5F, 0.5488F, 6.3474F, 1, 1, 7, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.4248F, -6.5933F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1772F, 0.1719F, -0.0306F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5909F, -0.8958F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.3F, -10.2F, 1, 1, 11, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9932F, -10.7795F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0189F, 0.3926F, 0.0072F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 5.0094F, -9.5777F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3403F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 13, -0.5F, -1.208F, 3.64F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.5F, 6.509F, -6.6595F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6981F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.7819F, 2.0166F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8639F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.2F, 5.5265F, 0.5065F);
        this.leftarm2.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.3403F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.5F, 6.509F, -6.6595F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.1745F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.7819F, 2.0166F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.9512F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.2F, 5.5265F, 0.5065F);
        this.rightarm2.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.6196F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.4459F, -6.2693F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.5354F, 0.2648F, 0.154F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9638F, -5.7128F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 17, -0.5F, 0.5F, 3.8F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.007F, -2.0249F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2648F, 0.2954F, -0.0788F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5695F, -4.6993F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 53, -0.5F, -0.4F, 2.4F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5179F, -1.7365F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, -0.7772F, 0.4815F, -0.0579F);
        this.neck3.cubeList.add(new ModelBox(neck3, 44, 34, -0.5F, 0.1068F, -2.556F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1932F, -2.456F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.3525F, 0.4241F, 0.0472F);


        this.leftMaxilla = new ModelRenderer(this);
        this.leftMaxilla.setRotationPoint(0.0F, 7.2742F, -9.7729F);
        this.head.addChild(leftMaxilla);


        this.leftCanine = new ModelRenderer(this);
        this.leftCanine.setRotationPoint(0.8385F, -2.5968F, 6.041F);
        this.leftMaxilla.addChild(leftCanine);
        this.setRotateAngle(leftCanine, 0.0F, 0.0873F, -0.1222F);


        this.rightMaxilla = new ModelRenderer(this);
        this.rightMaxilla.setRotationPoint(0.0F, 7.2742F, -9.7729F);
        this.head.addChild(rightMaxilla);


        this.rightCanine = new ModelRenderer(this);
        this.rightCanine.setRotationPoint(-0.8385F, -2.5968F, 6.041F);
        this.rightMaxilla.addChild(rightCanine);
        this.setRotateAngle(rightCanine, 0.0F, -0.0873F, 0.1222F);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(0.9F, 0.3856F, 3.1765F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-0.9F, 0.3856F, 3.1765F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 0.391F, -1.4509F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.789F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.8018F, 0.122F, -0.1251F);
        this.tail.cubeList.add(new ModelBox(tail, 28, 29, -0.5F, 0.2897F, -0.314F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1897F, 3.586F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0075F, 0.1334F, -0.1129F);
        this.tail2.cubeList.add(new ModelBox(tail2, -2, 34, -0.5F, 0.065F, -0.3039F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1176F, 3.895F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2442F, 0.3455F, -0.0506F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 35, -0.5F, 0.2855F, -0.0425F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1425F, 3.7909F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.6981F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 6, -0.5F, 0.1894F, -0.949F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0237F, 4.0501F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.5411F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 33, 35, -0.5F, 0.3399F, -0.2423F, 1, 1, 4, -0.15F, false));

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
