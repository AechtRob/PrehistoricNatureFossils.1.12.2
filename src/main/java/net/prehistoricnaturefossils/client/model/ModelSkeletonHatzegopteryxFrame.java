package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHatzegopteryxFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck5;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer crest1;
    private final ModelRenderer crest2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer lefthand2;
    private final ModelRenderer rightwing1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer righthand2;

    public ModelSkeletonHatzegopteryxFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -45.7F, -1.0F, 1, 46, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.8F, -31.5F, 10.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, -8.5F, -0.5F, 1, 40, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.8F, -31.5F, 10.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -8.4F, -2.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -31.5F, -0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -12.2F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -34.454F, -1.0949F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0357F, -9.3768F, 4.8614F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.7225F, 0.0F, 0.0F);


        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(0.0F, -1.1F, 4.1F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, -0.0872F, 0.0012F, -0.0018F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 116, 3, -0.5357F, 0.6076F, -0.3682F, 1, 1, 3, -0.15F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.1F, 1.1F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 99, 108, -0.5357F, 0.6076F, -0.1682F, 1, 1, 3, -0.15F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -2.5F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1047F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 79, 102, -0.5357F, 0.2877F, -0.3148F, 1, 1, 4, -0.15F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.49F, 5.8335F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.0147F, 0.1758F, 0.0847F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.3138F, 1.5406F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 31, 99, -0.5357F, 0.5F, -1.1F, 1, 1, 5, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0777F, 5.5403F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0393F, 0.3052F, -0.0118F);
        this.tail1.cubeList.add(new ModelBox(tail1, 44, 99, -0.5357F, 0.2371F, -0.4251F, 1, 1, 5, -0.15F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.5402F, 1.2802F, 4.3609F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.7393F, -0.0173F, -0.2564F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.4789F, 15.4725F, 1.7824F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.8085F, 0.1461F, 0.2048F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(-0.6634F, 23.8549F, 2.0793F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0873F, 0.0F, 0.0F);


        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.5279F, -0.2807F, 1.0913F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.6117F, 1.2802F, 4.3609F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 1.2629F, 0.0173F, 0.2564F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.4789F, 15.4725F, 1.7824F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.5177F, -0.2349F, -0.0517F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.6634F, 23.8549F, 2.0793F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0873F, 0.0F, 0.0F);


        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.5279F, -0.2807F, 1.0913F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.3F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, 0.1496F, -0.1295F, -0.0195F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.4445F, -0.5867F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0436F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 108, 29, -0.5357F, -0.2F, -2.0F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0288F, -2.8865F);
        this.neck1.addChild(neck);
        this.setRotateAngle(neck, -0.0528F, -0.1307F, 0.0069F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.3956F, -0.0591F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.1658F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 67, 101, -0.5357F, -0.2258F, -4.0016F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6275F, -3.6739F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0734F, -0.0281F, -0.1489F);
        this.neck2.cubeList.add(new ModelBox(neck2, 31, 81, -0.5357F, 0.2822F, -6.9187F, 1, 1, 7, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0477F, -6.8394F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1041F, -0.2604F, 0.0269F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.198F, -0.4517F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 77, 23, -0.5357F, 0.4F, -7.0F, 1, 1, 8, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5807F, -6.9432F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1891F, -0.0468F, -0.1223F);


        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, 0.2967F, 5.5443F);
        this.neck4.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.0873F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 91, 86, -0.5357F, 0.4F, -11.5F, 1, 1, 6, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.4792F, -5.8484F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, -0.3752F, 0.0F, 0.0F);


        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(0.0F, 0.2993F, 5.5209F);
        this.neck5.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, -0.0873F, 0.0F, 0.0F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 77, 94, -0.5357F, 0.4F, -10.8F, 1, 1, 6, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.355F, -4.7851F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 1.6232F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9329F, -2.0184F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2365F, -0.0003F, -0.0014F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.1772F, -0.2629F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.6F, -4.1F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.5772F, -3.4629F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.4772F, -1.6629F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.5125F, -3.419F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.lips1 = new ModelRenderer(this);
        this.lips1.setRotationPoint(-0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips1);
        this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2732F);


        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips2);
        this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2732F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.7136F, 1.3571F, -1.2198F);
        this.head2.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.7851F, 1.3571F, -1.2198F);
        this.head2.addChild(rightFace);


        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -6.8125F, 7.031F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(3.3581F, 1.9773F, -1.4163F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.2282F, -0.7691F, 0.7079F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(8.2415F, 0.4758F, -1.3315F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.998F, 0.4378F, -2.6739F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7356F, 17.7401F, -0.5254F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.1797F, 0.2226F, 0.5186F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.206F, 20.9665F, 0.1838F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.4671F, 0.3755F, -0.3424F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.1025F, 0.1525F, 25.3321F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1352F, 0.0277F, 0.7257F);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(-0.0528F, -0.2253F, 0.1507F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -2.1471F, 0.4613F, 0.445F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-3.4296F, 1.9773F, -1.4163F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.198F, 0.5985F, -0.7555F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-8.2415F, 0.4758F, -1.3315F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -2.1547F, -0.8222F, 2.9341F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7356F, 17.7401F, -0.5254F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.2154F, -0.497F, -0.7504F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.206F, 20.9665F, 0.1838F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.4843F, -0.3796F, 0.2956F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.1025F, 0.1525F, 25.3321F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1352F, -0.0277F, -0.7257F);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(0.0528F, -0.2253F, 0.1507F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -1.6637F, -0.1702F, -0.8462F);

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
