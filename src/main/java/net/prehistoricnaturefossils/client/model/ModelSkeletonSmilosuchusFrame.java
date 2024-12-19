package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSmilosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontLeftLeg;
    private final ModelRenderer frontLeftLeg2;
    private final ModelRenderer frontLeftLeg3;
    private final ModelRenderer frontLeftLeg4;
    private final ModelRenderer frontRightLeg;
    private final ModelRenderer frontRightLeg2;
    private final ModelRenderer frontRightLeg3;
    private final ModelRenderer frontRightLeg4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer backLeftLeg;
    private final ModelRenderer backLeftLeg2;
    private final ModelRenderer backLeftLeg3;
    private final ModelRenderer backLeftLeg4;
    private final ModelRenderer backRightLeg;
    private final ModelRenderer backRightLeg2;
    private final ModelRenderer backRightLeg3;
    private final ModelRenderer backRightLeg4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;

    public ModelSkeletonSmilosuchusFrame() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -13.0F, -27.0F, 1, 13, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -9.0F, -26.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.2F, -7.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.2F, -4.2F, 0.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2612F, -0.0181F, -1.5034F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.1F, -5.0F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.2F, -6.45F, 0.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.7F, -1.55F, -0.5F, 1, 8, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -11.9473F, -11.6417F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.1396F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.4112F, -14.8333F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 63, -0.5F, -0.1728F, -0.1329F, 1, 2, 12, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.0F, -23.95F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1484F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 99, -0.5F, -0.4F, 4.2F, 1, 2, 5, -0.002F, false));

        this.frontLeftLeg = new ModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(7.071F, 6.9187F, -14.0009F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 1.579F, 0.3629F, -0.2344F);


        this.frontLeftLeg2 = new ModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(-0.2144F, 7.9822F, -1.227F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -2.3024F, -0.0014F, 0.2752F);


        this.frontLeftLeg3 = new ModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.2688F, 7.7494F, 0.1964F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.8136F, -0.2138F, 0.1598F);


        this.frontLeftLeg4 = new ModelRenderer(this);
        this.frontLeftLeg4.setRotationPoint(-4.5F, 0.1F, -1.3F);
        this.frontLeftLeg3.addChild(frontLeftLeg4);


        this.frontRightLeg = new ModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-7.071F, 6.9187F, -14.0009F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, -0.4717F, -0.3629F, 0.2344F);


        this.frontRightLeg2 = new ModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.1415F, 7.7498F, -1.4022F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9329F, -0.1964F, -0.4478F);


        this.frontRightLeg3 = new ModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.2549F, 7.6644F, -0.1943F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 1.4094F, -0.0369F, -0.0065F);


        this.frontRightLeg4 = new ModelRenderer(this);
        this.frontRightLeg4.setRotationPoint(4.5F, 0.1F, -1.3F);
        this.frontRightLeg3.addChild(frontRightLeg4);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -3.35F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.035F, -0.0872F, 0.0031F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.05F, -0.6F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 43, -0.5F, 0.0F, 0.2F, 1, 2, 17, 0.002F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.4F, 16.1F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0962F, -0.2172F, 0.0208F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1573F, 0.1309F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 79, -0.5F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.backLeftLeg = new ModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.4367F, 3.9623F, 0.9793F);
        this.tail.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -1.6996F, -0.0235F, -0.1859F);


        this.backLeftLeg2 = new ModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.6189F, 9.6341F, 0.6427F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 2.3514F, -0.0557F, 0.1196F);


        this.backLeftLeg3 = new ModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0602F, 6.9434F, 0.9818F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3732F, -0.0358F, 0.0619F);


        this.backLeftLeg4 = new ModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(-0.0007F, 0.4836F, -3.7202F);
        this.backLeftLeg3.addChild(backLeftLeg4);


        this.backRightLeg = new ModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.4367F, 3.9623F, 0.9793F);
        this.tail.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -1.2074F, 0.301F, 0.785F);


        this.backRightLeg2 = new ModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.6189F, 9.6341F, 0.6427F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 2.3077F, 0.0557F, -0.1196F);


        this.backRightLeg3 = new ModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-0.0602F, 6.9434F, 0.9818F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.0362F, 0.0767F, -0.2765F);


        this.backRightLeg4 = new ModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0007F, 0.4836F, -3.7202F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, -0.4207F, -0.3172F, -0.3665F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0073F, 9.6309F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0573F, -0.3372F, 0.3509F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0181F, 0.1294F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 44, -0.5F, 0.0F, 0.0F, 1, 2, 17, -0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.3329F, 17.3282F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2546F, -0.5558F, 0.0754F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0943F, -0.3801F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 20, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5218F, 19.6218F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3561F, -0.8555F, -0.0361F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4621F, -0.6281F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 23, -0.5F, -0.2F, 0.5F, 1, 1, 18, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.6152F, 17.8821F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.213F, -0.6515F, 0.0592F);
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 63, -0.5F, 0.347F, -0.212F, 1, 1, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.047F, 13.5897F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3705F, -0.6452F, 0.1188F);
        this.tail6.cubeList.add(new ModelBox(tail6, 45, 0, -0.5F, 0.2896F, -0.0759F, 1, 1, 14, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.698F, -19.4115F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1874F, -0.581F, -0.0138F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2773F, -10.0841F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 102, -0.5F, -0.5F, 5.0F, 1, 2, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3227F, -5.0841F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1309F, -0.2182F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.5229F, -4.6055F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 101, 103, -0.5F, 1.0F, -3.0F, 1, 2, 3, -0.004F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 101, -0.5F, 0.3F, -4.8F, 1, 2, 5, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.2711F, -7.2601F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.5357F, -0.2947F, -0.0814F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.3726F, 1.8295F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3732F, -0.0034F, -0.0127F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.5F, -2.5771F, 0.8983F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.5F, -2.5771F, 0.8983F);
        this.head.addChild(rightFace);

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
