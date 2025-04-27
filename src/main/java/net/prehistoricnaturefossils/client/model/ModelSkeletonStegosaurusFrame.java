package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStegosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer plate2;
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
    private final ModelRenderer plate3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer plate4;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer plate5;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer plate6;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r9;
    private final ModelRenderer plate7;
    private final ModelRenderer tail7;
    private final ModelRenderer tail6;
    private final ModelRenderer thagomizer2;
    private final ModelRenderer thagomizer4;
    private final ModelRenderer thagomizer3;
    private final ModelRenderer thagomizer5;
    private final ModelRenderer plate9;
    private final ModelRenderer plate10;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer plate8;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer plate11;
    private final ModelRenderer plate12;
    private final ModelRenderer chest;
    private final ModelRenderer plate13;
    private final ModelRenderer plate19;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer plate14;
    private final ModelRenderer plate15;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r15;
    private final ModelRenderer plate20;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer plate21;
    private final ModelRenderer plate16;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r17;
    private final ModelRenderer plate17;
    private final ModelRenderer plate22;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r18;
    private final ModelRenderer plate23;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer eye;
    private final ModelRenderer eye2;
    private final ModelRenderer jaw;

    public ModelSkeletonStegosaurusFrame() {
        this.textureWidth = 208;
        this.textureHeight = 208;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -44.0F, 6.2F, 1, 44, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -27.0F, -22.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 2.9F, -11.0F, -0.5F, 1, 38, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -27.0F, -22.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -3.2F, -3.5F, -0.5F, 1, 13, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -28.5F, 6.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 13.0F, -8.5F, -0.5F, 1, 17, 1, -0.15F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.fossil.addChild(main);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -40.4078F, 3.5545F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.3139F, -3.369F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 111, 95, -0.5F, -0.4358F, 0.481F, 1, 2, 8, -0.15F, false));

        this.plate2 = new ModelRenderer(this);
        this.plate2.setRotationPoint(-1.4764F, -13.2659F, -0.7516F);
        this.body.addChild(plate2);
        this.setRotateAngle(plate2, -0.109F, 0.001F, -0.0971F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(7.0F, -0.7077F, 0.6028F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0873F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 24.9936F, -0.4037F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.4363F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0342F, 15.7939F, 1.8943F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.2607F, -0.0084F, -0.0044F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.5F, 1.1114F, -0.4115F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.1745F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-7.0F, -0.7077F, 0.6028F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3491F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 24.9936F, -0.4037F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 1.0908F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(-0.0342F, 15.7939F, 1.8943F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.2629F, 0.0084F, 0.0044F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.5F, 1.1114F, -0.4115F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0436F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -3.4095F, 4.3369F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.1688F, 0.1794F, -0.0132F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0972F, -0.1185F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 87, 0, -0.5F, 0.2711F, 0.1702F, 1, 2, 10, -0.15F, false));

        this.plate3 = new ModelRenderer(this);
        this.plate3.setRotationPoint(1.9319F, -9.5479F, 8.8283F);
        this.tail.addChild(plate3);
        this.setRotateAngle(plate3, 0.1092F, -0.001F, 0.0971F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.539F, 10.1152F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2732F, 0.2637F, -0.0293F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.1919F, 0.0825F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 91, -0.5F, 0.067F, -0.2727F, 1, 2, 9, -0.15F, false));

        this.plate4 = new ModelRenderer(this);
        this.plate4.setRotationPoint(-0.9021F, -9.8955F, 9.4953F);
        this.tail2.addChild(plate4);
        this.setRotateAngle(plate4, -0.109F, 0.001F, -0.0971F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5276F, 8.6745F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0916F, 0.3042F, -0.0275F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.5704F, -0.0912F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 87, -0.5F, -0.0878F, 0.1652F, 1, 2, 9, -0.15F, false));

        this.plate5 = new ModelRenderer(this);
        this.plate5.setRotationPoint(1.6852F, -7.2781F, 13.6071F);
        this.tail3.addChild(plate5);
        this.setRotateAngle(plate5, -0.1963F, -0.001F, 0.0971F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, -0.2853F, 9.1346F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1002F, 0.2131F, -0.0641F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6479F, 0.2589F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 39, -0.5F, -0.2709F, -0.6162F, 1, 2, 12, -0.15F, false));

        this.plate6 = new ModelRenderer(this);
        this.plate6.setRotationPoint(-1.0706F, -5.9338F, 15.4672F);
        this.tail4.addChild(plate6);
        this.setRotateAngle(plate6, -0.109F, 0.001F, -0.0971F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(-0.5F, -0.4209F, 12.6065F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1833F, 0.3006F, -0.0548F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.2561F, -0.8306F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 92, 46, -0.5F, -1.8F, -0.1F, 1, 2, 9, -0.15F, false));

        this.plate7 = new ModelRenderer(this);
        this.plate7.setRotationPoint(1.5281F, -5.1514F, 9.8627F);
        this.tail5.addChild(plate7);
        this.setRotateAngle(plate7, -0.109F, -0.001F, 0.0971F);


        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.5F, -0.5786F, 7.9725F);
        this.tail5.addChild(tail7);
        this.setRotateAngle(tail7, -0.1828F, 0.3006F, -0.0547F);
        this.tail7.cubeList.add(new ModelBox(tail7, 145, 51, -0.5F, 0.8F, -0.2F, 1, 1, 6, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.5171F, 6.0408F);
        this.tail7.addChild(tail6);
        this.setRotateAngle(tail6, -0.2347F, 0.2975F, -0.07F);
        this.tail6.cubeList.add(new ModelBox(tail6, 90, 99, -0.5F, 0.1889F, -0.5591F, 1, 1, 9, -0.15F, false));

        this.thagomizer2 = new ModelRenderer(this);
        this.thagomizer2.setRotationPoint(1.0025F, -0.9742F, 1.6481F);
        this.tail6.addChild(thagomizer2);
        this.setRotateAngle(thagomizer2, -0.0917F, -0.2841F, -0.5728F);


        this.thagomizer4 = new ModelRenderer(this);
        this.thagomizer4.setRotationPoint(-1.0025F, -0.9742F, 1.6481F);
        this.tail6.addChild(thagomizer4);
        this.setRotateAngle(thagomizer4, -0.0917F, 0.2841F, 0.5728F);


        this.thagomizer3 = new ModelRenderer(this);
        this.thagomizer3.setRotationPoint(0.6821F, -0.4726F, 5.5156F);
        this.tail6.addChild(thagomizer3);
        this.setRotateAngle(thagomizer3, -0.1128F, -0.6749F, -0.5279F);


        this.thagomizer5 = new ModelRenderer(this);
        this.thagomizer5.setRotationPoint(-0.6821F, -0.4726F, 5.5156F);
        this.tail6.addChild(thagomizer5);
        this.setRotateAngle(thagomizer5, -0.1128F, 0.6749F, 0.5279F);


        this.plate9 = new ModelRenderer(this);
        this.plate9.setRotationPoint(-0.9259F, -3.6167F, 7.1171F);
        this.tail7.addChild(plate9);
        this.setRotateAngle(plate9, -0.109F, 0.001F, -0.0971F);


        this.plate10 = new ModelRenderer(this);
        this.plate10.setRotationPoint(0.8866F, -3.2489F, 10.4969F);
        this.tail7.addChild(plate10);
        this.setRotateAngle(plate10, -0.109F, -0.001F, 0.0971F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -4.0768F, -3.0647F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1583F, -0.1289F, -0.0031F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.1608F, -12.5096F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 72, 0.5F, 0.1F, 1.95F, 1, 2, 11, -0.15F, false));

        this.plate8 = new ModelRenderer(this);
        this.plate8.setRotationPoint(2.1536F, -10.9055F, -7.2137F);
        this.body2.addChild(plate8);
        this.setRotateAngle(plate8, 0.0655F, -0.001F, 0.0971F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.2835F, -10.6105F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.1051F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.3525F, -0.3671F);
        this.upperbody.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3403F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 128, 0.0F, 0.0665F, -6.2319F, 1, 2, 7, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.9525F, -6.3671F);
        this.upperbody.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4887F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 126, 0.0F, 0.5636F, -6.8463F, 1, 2, 7, -0.15F, false));

        this.plate11 = new ModelRenderer(this);
        this.plate11.setRotationPoint(-1.1536F, -9.3945F, -6.4766F);
        this.upperbody.addChild(plate11);
        this.setRotateAngle(plate11, 0.4146F, 0.001F, -0.0971F);


        this.plate12 = new ModelRenderer(this);
        this.plate12.setRotationPoint(1.9348F, -7.0815F, -12.9435F);
        this.upperbody.addChild(plate12);
        this.setRotateAngle(plate12, 0.6589F, -0.001F, 0.0971F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.6064F, 4.9757F, -12.2513F);
        this.upperbody.addChild(chest);
        this.setRotateAngle(chest, 0.808F, -0.1233F, -0.003F);
        this.chest.cubeList.add(new ModelBox(chest, 92, 58, -0.6064F, 0.7F, -9.2F, 1, 2, 9, -0.15F, false));

        this.plate13 = new ModelRenderer(this);
        this.plate13.setRotationPoint(-1.3456F, -10.0756F, 1.7756F);
        this.chest.addChild(plate13);
        this.setRotateAngle(plate13, 0.2662F, 0.001F, -0.0971F);


        this.plate19 = new ModelRenderer(this);
        this.plate19.setRotationPoint(1.0218F, -8.8642F, -5.0733F);
        this.chest.addChild(plate19);
        this.setRotateAngle(plate19, -0.1701F, -0.001F, 0.0971F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(7.3504F, 11.5517F, -12.313F);
        this.chest.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.0842F, -0.05F, -0.121F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.5744F, 11.624F, 0.5224F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -1.3937F, 0.0216F, 0.1318F);


        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.0618F, 12.5457F, -1.3371F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 1.693F, 0.0F, 0.0F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-7.5633F, 11.5517F, -12.313F);
        this.chest.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.2588F, 0.05F, 0.121F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.5744F, 11.624F, 0.5224F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.4338F, -0.0216F, -0.1318F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.0618F, 12.5457F, -1.3371F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, -0.0087F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.6064F, 0.8647F, -8.8819F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -1.2032F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 3.3903F, -4.3943F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7243F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 140, 122, -0.5F, 0.1907F, 5.2235F, 1, 2, 1, -0.15F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 135, 117, -0.5F, 0.1907F, -0.4765F, 1, 2, 6, -0.15F, false));

        this.plate14 = new ModelRenderer(this);
        this.plate14.setRotationPoint(-0.5581F, -0.5183F, -6.6784F);
        this.neck.addChild(plate14);
        this.setRotateAngle(plate14, 0.1221F, 0.0378F, -0.1681F);


        this.plate15 = new ModelRenderer(this);
        this.plate15.setRotationPoint(1.4581F, 0.4817F, -8.6784F);
        this.neck.addChild(plate15);
        this.setRotateAngle(plate15, -0.096F, -0.0378F, 0.1681F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 3.7903F, -3.8943F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.neck4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 182, 144, -0.5F, -0.9272F, -0.5582F, 1, 2, 1, -0.15F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 180, 142, -0.5F, -0.9272F, -3.2582F, 1, 2, 3, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.6103F, -2.7881F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2327F, -0.1417F, -0.1659F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.6F, -2.6F);
        this.neck5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 145, -0.5F, 0.2246F, 1.8669F, 1, 2, 1, -0.15F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 119, 140, -0.5F, 0.2246F, -3.8331F, 1, 2, 6, -0.15F, false));

        this.plate20 = new ModelRenderer(this);
        this.plate20.setRotationPoint(-0.5251F, -7.8069F, -2.1608F);
        this.neck5.addChild(plate20);
        this.setRotateAngle(plate20, 0.0917F, 0.001F, -0.0971F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8586F, -6.0224F);
        this.neck5.addChild(neck2);
        this.setRotateAngle(neck2, -0.0419F, -0.3911F, -0.0404F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.5789F, -3.6993F);
        this.neck2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 128, 55, -0.5F, 0.3197F, -3.1913F, 1, 2, 7, -0.15F, false));

        this.plate21 = new ModelRenderer(this);
        this.plate21.setRotationPoint(0.3996F, -5.6049F, -1.3525F);
        this.neck2.addChild(plate21);
        this.setRotateAngle(plate21, -0.0392F, -0.001F, 0.0971F);


        this.plate16 = new ModelRenderer(this);
        this.plate16.setRotationPoint(-0.2063F, -3.5764F, -5.5355F);
        this.neck2.addChild(plate16);
        this.setRotateAngle(plate16, -0.0217F, 0.001F, -0.0971F);


        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.5789F, -6.6993F);
        this.neck2.addChild(neck6);
        this.setRotateAngle(neck6, -0.132F, -0.4517F, -0.1018F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 150, -0.5F, 0.0F, -4.9F, 1, 2, 5, -0.15F, false));

        this.plate17 = new ModelRenderer(this);
        this.plate17.setRotationPoint(0.1588F, -2.4738F, -2.2485F);
        this.neck6.addChild(plate17);
        this.setRotateAngle(plate17, -0.0217F, -0.001F, 0.0971F);


        this.plate22 = new ModelRenderer(this);
        this.plate22.setRotationPoint(-0.0984F, -1.8289F, -4.6631F);
        this.neck6.addChild(plate22);
        this.setRotateAngle(plate22, -0.0217F, 0.001F, -0.0971F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.3708F, -4.9169F);
        this.neck6.addChild(neck3);
        this.setRotateAngle(neck3, 0.1351F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.2857F, 2.5523F);
        this.neck3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 183, 126, -0.5F, 0.05F, -5.15F, 1, 1, 3, -0.15F, false));

        this.plate23 = new ModelRenderer(this);
        this.plate23.setRotationPoint(0.0456F, -1.6393F, -1.4588F);
        this.neck3.addChild(plate23);
        this.setRotateAngle(plate23, -0.0217F, -0.001F, 0.0971F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.8222F, -2.533F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0553F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.6028F, -1.0518F, -2.7607F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.6028F, -1.0518F, -2.7607F);
        this.head.addChild(rightFace);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(-0.775F, -0.11F, -3.441F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.1745F, 0.0F, 0.0F);


        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(0.775F, -0.11F, -3.441F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, -0.1745F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2209F, 0.0894F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7723F, 0.0F, 0.0F);

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
