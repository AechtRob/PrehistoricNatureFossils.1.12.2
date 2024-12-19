package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSimosthenurusFrame extends ModelBase {
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
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftThumb;
    private final ModelRenderer leftThumb2;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightThumb;
    private final ModelRenderer rightThumb2;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer leftZygomaticarch;
    private final ModelRenderer rightZygomaticarch;
    private final ModelRenderer leftMaxilla;
    private final ModelRenderer rightMaxilla;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonSimosthenurusFrame() {
        this.textureWidth = 102;
        this.textureHeight = 102;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, 14.3F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -21.0F, 14.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.1F, -7.0F, -0.5F, 1, 13, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.3F, -27.25F, -8.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -6.75F, -0.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.3F, -27.25F, -8.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.6F, -10.35F, -0.5F, 1, 38, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.7597F, 15.6796F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.925F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 29, -0.5F, 0.7F, -1.6F, 1, 1, 7, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.1F, 0.7727F, -1.0827F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.8116F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.0F, 8.4682F, 3.6188F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.6704F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 20.796F, -2.1496F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.5621F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 4.6671F, -1.2262F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.5934F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.1F, 0.7727F, -1.0827F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.2479F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.0F, 8.4682F, 3.6188F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 2.3911F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 20.796F, -2.1496F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.4748F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 4.6671F, -1.2262F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.2479F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.573F, -4.8887F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.2741F, -4.018F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 60, -1.0F, 0.6F, -0.2F, 1, 1, 5, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7741F, -3.818F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -0.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 61, -1.0F, 0.2F, -3.4F, 1, 1, 4, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.5F, 0.4537F, -3.7643F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, 0.2021F, 0.06F, 0.1454F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1F, -0.2F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2793F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 0, -1.0F, 0.351F, -5.1633F, 1, 1, 5, -0.15F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 1.3F, -4.9F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.7161F, 0.0329F, 0.0286F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.4F, -6.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 38, -1.0F, -0.7978F, -0.1163F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, 0.3463F, -5.8357F);
        this.body4.addChild(chest);
        this.setRotateAngle(chest, -0.129F, 0.1414F, 0.069F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.778F, -4.0456F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2967F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 43, -0.5F, 0.6186F, -0.0595F, 1, 1, 4, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.378F, -7.2456F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4887F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 46, -0.5F, -0.1747F, 0.0866F, 1, 1, 4, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.6F, 7.3915F, -7.1202F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6191F, 0.0927F, -0.3822F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 6.5302F, 3.9849F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.0322F, 0.0295F, 0.7413F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 9.0209F, -3.6281F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.9599F, -1.3526F, 1.5708F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.2911F, 1.5818F, -0.2411F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.6533F, 0.0337F, 0.0294F);


        this.leftThumb = new ModelRenderer(this);
        this.leftThumb.setRotationPoint(-0.9707F, 0.5969F, -0.3022F);
        this.leftArm3.addChild(leftThumb);
        this.setRotateAngle(leftThumb, 0.1752F, 0.0983F, 0.2957F);


        this.leftThumb2 = new ModelRenderer(this);
        this.leftThumb2.setRotationPoint(0.5992F, 0.9143F, -0.3746F);
        this.leftArm3.addChild(leftThumb2);
        this.setRotateAngle(leftThumb2, 0.3233F, -0.1537F, -0.8139F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.6F, 7.3915F, -7.1202F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.0354F, -0.0927F, 0.3822F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 6.5302F, 3.9849F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.0357F, -0.025F, -0.6104F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 9.0209F, -3.6281F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.9599F, 1.3526F, -1.5708F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(-0.2911F, 1.5818F, -0.2411F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.6533F, -0.0337F, -0.0294F);


        this.rightThumb = new ModelRenderer(this);
        this.rightThumb.setRotationPoint(0.9707F, 0.5969F, -0.3022F);
        this.rightArm3.addChild(rightThumb);
        this.setRotateAngle(rightThumb, 0.1752F, -0.0983F, -0.2957F);


        this.rightThumb2 = new ModelRenderer(this);
        this.rightThumb2.setRotationPoint(-0.5992F, 0.9143F, -0.3746F);
        this.rightArm3.addChild(rightThumb2);
        this.setRotateAngle(rightThumb2, 0.3233F, 0.1537F, 0.8139F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.978F, -7.3456F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.2269F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2F, -0.7F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2269F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 36, -0.5F, 0.2F, -3.6F, 1, 1, 5, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0F, -3.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2612F, 0.4294F, 0.3097F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7F, -1.7F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 83, 53, -0.5F, 0.6595F, -1.8625F, 1, 1, 2, -0.15F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.3F, -2.4F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 82, 36, -0.5F, 0.2F, 0.8F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3199F, -2.7513F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.704F, 0.2359F, 0.1959F);


        this.leftZygomaticarch = new ModelRenderer(this);
        this.leftZygomaticarch.setRotationPoint(2.9316F, -0.5966F, -5.585F);
        this.head.addChild(leftZygomaticarch);
        this.setRotateAngle(leftZygomaticarch, 0.0F, 0.3491F, 0.0F);


        this.rightZygomaticarch = new ModelRenderer(this);
        this.rightZygomaticarch.setRotationPoint(-2.9316F, -0.5966F, -5.585F);
        this.head.addChild(rightZygomaticarch);
        this.setRotateAngle(rightZygomaticarch, 0.0F, -0.3491F, 0.0F);


        this.leftMaxilla = new ModelRenderer(this);
        this.leftMaxilla.setRotationPoint(0.417F, -0.2803F, -8.7339F);
        this.head.addChild(leftMaxilla);


        this.rightMaxilla = new ModelRenderer(this);
        this.rightMaxilla.setRotationPoint(-0.417F, -0.2803F, -8.7339F);
        this.head.addChild(rightMaxilla);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.5616F, -4.3199F, -5.488F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.5616F, -4.3199F, -5.488F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3F, -1.3901F, -1.5979F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.8228F, 1.6852F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3328F, -0.0825F, 0.0285F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -0.5F, 0.3427F, 0.3074F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1427F, 8.7574F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4061F, -0.3227F, -0.1355F);
        this.tail2.cubeList.add(new ModelBox(tail2, -2, 26, -0.5F, 0.2F, -0.3F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.429F, 0.0794F, 0.0363F);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 0, -0.5F, 0.2F, 0.0F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.5243F, 0.504F, 0.2723F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.2F, -0.6F, 1, 1, 15, -0.15F, false));

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
