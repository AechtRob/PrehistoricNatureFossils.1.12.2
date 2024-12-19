package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonWuerhosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer plate11;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Plate4;
    private final ModelRenderer plate13;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer plate14;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer plate15;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer plate19;
    private final ModelRenderer tail5;
    private final ModelRenderer plate20;
    private final ModelRenderer plate12;
    private final ModelRenderer plate21;
    private final ModelRenderer tail6;
    private final ModelRenderer thagomizer4;
    private final ModelRenderer thagomizer3;
    private final ModelRenderer thagomizer2;
    private final ModelRenderer thagomizer5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer plate7;
    private final ModelRenderer plate8;
    private final ModelRenderer Plate3;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer plate5;
    private final ModelRenderer plate6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer plate9;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer plate22;
    private final ModelRenderer neck2;
    private final ModelRenderer plate23;
    private final ModelRenderer neck5;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r14;
    private final ModelRenderer plate24;
    private final ModelRenderer plate16;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer plate18;
    private final ModelRenderer plate17;
    private final ModelRenderer plate25;
    private final ModelRenderer head;
    private final ModelRenderer eye;
    private final ModelRenderer jaw;
    private final ModelRenderer frontrightleg5;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontleftleg5;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg4;

    public ModelSkeletonWuerhosaurusFrame() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.0F, -9.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -30.0F, 15.4F, 1, 31, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -24.5F, -9.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0698F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 1.4F, -1.5F, -0.5F, 1, 27, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -24.5F, -9.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -9.0F, -7.0F, -0.5F, 1, 17, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -33.0F, 15.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -3.5F, -10.0F, -0.5F, 1, 19, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -27.5118F, 15.8041F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.3139F, -3.369F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, -0.5F, -0.4358F, 0.381F, 1, 2, 11, -0.15F, false));

        this.plate11 = new ModelRenderer(this);
        this.plate11.setRotationPoint(-1.0966F, -11.4285F, 8.0849F);
        this.body.addChild(plate11);
        this.setRotateAngle(plate11, -0.0305F, 0.001F, -0.0971F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(7.0F, -2.4191F, -0.0904F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.1309F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 17.1433F, 0.0595F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.6109F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0096F, 11.0466F, 2.3329F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.1298F, -0.0084F, -0.0044F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.5F, 2.0114F, -1.5115F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.0873F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-7.0F, -2.4191F, -0.0904F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.1745F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 17.1433F, 0.0595F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.4363F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(-0.0096F, 11.0466F, 2.3329F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2607F, 0.0084F, 0.0044F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.5F, 2.0114F, -1.5115F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0436F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.163F, 7.4237F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0337F, -0.1307F, 0.007F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0972F, -0.1185F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -0.5F, 0.2711F, 0.2702F, 1, 2, 10, -0.15F, false));

        this.Plate4 = new ModelRenderer(this);
        this.Plate4.setRotationPoint(-1.1F, -3.8392F, 4.9184F);
        this.tail.addChild(Plate4);
        this.setRotateAngle(Plate4, -0.0602F, -0.0106F, -0.1742F);


        this.plate13 = new ModelRenderer(this);
        this.plate13.setRotationPoint(0.9496F, -6.8389F, 8.321F);
        this.tail.addChild(plate13);
        this.setRotateAngle(plate13, -0.1003F, -0.001F, 0.0971F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.539F, 10.1153F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1077F, -0.0879F, -0.0037F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1919F, 0.0825F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 31, -0.5F, 0.067F, -0.2727F, 1, 2, 10, -0.15F, false));

        this.plate14 = new ModelRenderer(this);
        this.plate14.setRotationPoint(-0.9012F, -6.9772F, 7.2106F);
        this.tail2.addChild(plate14);
        this.setRotateAngle(plate14, -0.1003F, 0.001F, -0.0971F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6483F, 9.5885F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0437F, 0.2182F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5704F, -0.0912F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 65, 44, -0.5F, -0.0878F, 0.0652F, 1, 2, 8, -0.15F, false));

        this.plate15 = new ModelRenderer(this);
        this.plate15.setRotationPoint(0.8046F, -5.4329F, 6.5769F);
        this.tail3.addChild(plate15);
        this.setRotateAngle(plate15, -0.1003F, -0.001F, 0.0971F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2742F, 8.1296F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1671F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6479F, 0.2589F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.096F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 86, -0.5F, -0.2709F, -0.4162F, 1, 2, 6, -0.15F, false));

        this.plate19 = new ModelRenderer(this);
        this.plate19.setRotationPoint(-0.7959F, -5.1545F, 6.4871F);
        this.tail4.addChild(plate19);
        this.setRotateAngle(plate19, -0.1003F, 0.001F, -0.0971F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5025F, 5.8263F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0548F, 0.3891F, -0.0542F);
        this.tail5.cubeList.add(new ModelBox(tail5, 23, 44, -0.5F, 0.3487F, -0.3982F, 1, 1, 10, -0.15F, false));

        this.plate20 = new ModelRenderer(this);
        this.plate20.setRotationPoint(0.739F, -4.1244F, 5.9342F);
        this.tail5.addChild(plate20);
        this.setRotateAngle(plate20, -0.1003F, -0.001F, 0.0971F);


        this.plate12 = new ModelRenderer(this);
        this.plate12.setRotationPoint(-0.6961F, -3.7262F, 9.9141F);
        this.tail5.addChild(plate12);
        this.setRotateAngle(plate12, -0.1003F, 0.001F, -0.0971F);


        this.plate21 = new ModelRenderer(this);
        this.plate21.setRotationPoint(0.5596F, -2.3216F, 9.5111F);
        this.tail5.addChild(plate21);
        this.setRotateAngle(plate21, -0.2137F, -0.001F, 0.0971F);


        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1593F, 9.8982F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3914F, -0.0807F, 0.0333F);
        this.tail6.cubeList.add(new ModelBox(tail6, 48, 15, -0.5F, 0.1889F, -0.3591F, 1, 1, 9, -0.15F, false));

        this.thagomizer4 = new ModelRenderer(this);
        this.thagomizer4.setRotationPoint(1.0563F, -0.4812F, 6.943F);
        this.tail6.addChild(thagomizer4);
        this.setRotateAngle(thagomizer4, 0.0938F, -0.3846F, -0.4922F);


        this.thagomizer3 = new ModelRenderer(this);
        this.thagomizer3.setRotationPoint(-1.0563F, -0.4812F, 6.943F);
        this.tail6.addChild(thagomizer3);
        this.setRotateAngle(thagomizer3, 0.0938F, 0.3846F, 0.4922F);


        this.thagomizer2 = new ModelRenderer(this);
        this.thagomizer2.setRotationPoint(0.7F, -0.5681F, 2.8821F);
        this.tail6.addChild(thagomizer2);
        this.setRotateAngle(thagomizer2, -0.1297F, -0.0531F, -0.4668F);


        this.thagomizer5 = new ModelRenderer(this);
        this.thagomizer5.setRotationPoint(-0.7F, -0.5681F, 2.8821F);
        this.tail6.addChild(thagomizer5);
        this.setRotateAngle(thagomizer5, -0.1297F, 0.0531F, 0.4668F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -4.0767F, -3.0647F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0877F, -0.0869F, -0.0076F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.1608F, -12.5096F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.5F, 0.1F, -0.05F, 1, 2, 13, -0.15F, false));

        this.plate7 = new ModelRenderer(this);
        this.plate7.setRotationPoint(-1.3978F, -8.2033F, -6.8494F);
        this.body2.addChild(plate7);
        this.setRotateAngle(plate7, 0.0044F, 0.0447F, -0.097F);


        this.plate8 = new ModelRenderer(this);
        this.plate8.setRotationPoint(1.6128F, -7.4108F, 1.0797F);
        this.body2.addChild(plate8);
        this.setRotateAngle(plate8, -0.0654F, -0.001F, 0.0971F);


        this.Plate3 = new ModelRenderer(this);
        this.Plate3.setRotationPoint(-1.6F, -4.2452F, -2.9738F);
        this.body2.addChild(Plate3);
        this.setRotateAngle(Plate3, 0.1902F, 0.0844F, -0.2481F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.2592F, -12.6204F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0877F, -0.0435F, 0.0038F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.1786F, 0.0355F);
        this.upperbody.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 104, 62, -0.5F, 0.1137F, -4.721F, 1, 2, 5, -0.15F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.5166F, -4.3828F);
        this.upperbody.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5934F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 80, -0.5F, 0.1232F, -7.7945F, 1, 2, 8, -0.15F, false));

        this.plate5 = new ModelRenderer(this);
        this.plate5.setRotationPoint(-1.0924F, -3.1723F, -8.8711F);
        this.upperbody.addChild(plate5);
        this.setRotateAngle(plate5, 0.6066F, 0.0883F, -0.0968F);


        this.plate6 = new ModelRenderer(this);
        this.plate6.setRotationPoint(1.711F, -5.0617F, -2.5218F);
        this.upperbody.addChild(plate6);
        this.setRotateAngle(plate6, 0.3099F, -0.0883F, 0.0968F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 5.7011F, -9.8326F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, -0.1298F, 0.017F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 3.3903F, -4.3944F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7243F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 86, -0.5F, 0.0907F, -0.9765F, 1, 2, 6, -0.15F, false));

        this.plate9 = new ModelRenderer(this);
        this.plate9.setRotationPoint(1.8976F, -3.0166F, -3.2408F);
        this.neck.addChild(plate9);
        this.setRotateAngle(plate9, 0.6066F, -0.0883F, 0.0968F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 3.2903F, -4.4944F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, -0.0894F, -0.2173F, 0.0193F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.1F, 0.6F);
        this.neck4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5501F, -0.0298F, -0.0182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 78, 103, -0.5F, -0.9272F, -4.9582F, 1, 2, 5, -0.15F, false));

        this.plate22 = new ModelRenderer(this);
        this.plate22.setRotationPoint(-1.0204F, -1.9887F, -1.486F);
        this.neck4.addChild(plate22);
        this.setRotateAngle(plate22, 0.4478F, 0.0254F, -0.1271F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.6258F, -3.7937F);
        this.neck4.addChild(neck2);
        this.setRotateAngle(neck2, 0.055F, -0.1213F, -0.224F);


        this.plate23 = new ModelRenderer(this);
        this.plate23.setRotationPoint(1.0581F, -3.2465F, -1.8764F);
        this.neck2.addChild(plate23);
        this.setRotateAngle(plate23, -0.1611F, 0.0668F, 0.0716F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.4952F, -6.7774F);
        this.neck2.addChild(neck5);
        this.setRotateAngle(neck5, 0.0F, -0.0873F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck5.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 104, 70, -0.5F, 0.2F, -0.1F, 1, 1, 5, -0.15F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.8097F, 4.8824F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 81, 33, -0.5F, -0.5293F, -0.3201F, 1, 2, 8, -0.15F, false));

        this.plate24 = new ModelRenderer(this);
        this.plate24.setRotationPoint(-0.8603F, -2.9832F, 1.7014F);
        this.neck5.addChild(plate24);
        this.setRotateAngle(plate24, -0.1611F, -0.0668F, -0.0716F);


        this.plate16 = new ModelRenderer(this);
        this.plate16.setRotationPoint(0.6922F, -3.2476F, -1.0882F);
        this.neck5.addChild(plate16);
        this.setRotateAngle(plate16, -0.1611F, 0.0668F, 0.0716F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck5.addChild(neck3);
        this.setRotateAngle(neck3, 0.1439F, -0.0432F, -0.0063F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3828F, -2.4827F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 120, -0.5F, 0.05F, -1.35F, 1, 1, 4, -0.15F, false));

        this.plate18 = new ModelRenderer(this);
        this.plate18.setRotationPoint(-0.7581F, -0.7321F, 1.6314F);
        this.neck3.addChild(plate18);
        this.setRotateAngle(plate18, -0.4887F, 0.0378F, -0.1681F);


        this.plate17 = new ModelRenderer(this);
        this.plate17.setRotationPoint(-0.5215F, -3.1509F, 1.4681F);
        this.neck3.addChild(plate17);
        this.setRotateAngle(plate17, -0.1611F, -0.0668F, -0.0716F);


        this.plate25 = new ModelRenderer(this);
        this.plate25.setRotationPoint(0.1573F, -1.9207F, -2.6273F);
        this.neck3.addChild(plate25);
        this.setRotateAngle(plate25, 0.0484F, 0.0668F, 0.0716F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4952F, -3.6127F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3217F, -0.1657F, -0.0549F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(-0.775F, 0.0771F, -2.8709F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.1745F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7457F, 0.4672F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2923F, 0.0F, 0.0F);


        this.frontrightleg5 = new ModelRenderer(this);
        this.frontrightleg5.setRotationPoint(6.75F, 14.4025F, -3.6421F);
        this.upperbody.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0F, -0.1745F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.0F, 1.1735F, -4.524F);
        this.frontrightleg5.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1745F, 0.0F, 0.0F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.0541F, 8.487F, 0.2162F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.3016F, 0.045F, 0.1687F);


        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.0618F, 8.2964F, -0.3459F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 0.5149F, 0.0F, 0.0F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-5.75F, 14.4025F, -3.6421F);
        this.upperbody.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.0F, 0.1745F);


        this.frontleftleg5 = new ModelRenderer(this);
        this.frontleftleg5.setRotationPoint(-2.0F, 1.1735F, -4.524F);
        this.frontrightleg2.addChild(frontleftleg5);
        this.setRotateAngle(frontleftleg5, 0.829F, 0.0F, 0.0F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0541F, 8.487F, 0.2162F);
        this.frontleftleg5.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.3453F, -0.045F, -0.1687F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.0618F, 8.2964F, -0.3459F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.2531F, 0.0F, 0.0F);

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
