package daw.activitats.geometria;

import java.awt.*;

public class GeometriaTester {
    public static void main(String[] args){
        Esfera lamevaesfera1 = new Esfera(3.0), lamevaesfera2 = new Esfera(2.5, Color.cyan );
        Esfera lamevaesfera3;
        // lamevaesfera4 = new Esfera(lamevaesfera1);
        double size = lamevaesfera1.radi;
        double total = size*3;
        lamevaesfera3 = new Esfera(1.5);
        System.out.println(lamevaesfera1.radi);
        System.out.println(lamevaesfera2.radi);
        System.out.println(lamevaesfera3.radi);

        lamevaesfera1.modifyValue(size);
        System.out.println(size);

        //System.out.println("Les referències lamevaesfera1 i lamevaesfera4 " + ((lamevaesfera1==lamevaesfera4)?"si":"no")+ " apunten al mateix objecte");
        lamevaesfera1.modifyValue(lamevaesfera1,5);
        System.out.println(lamevaesfera1.radi+" -- ");
        Esfera lamevaesfera4 = lamevaesfera3.doubleEsfera();
        System.out.println(lamevaesfera4.radi);
        lamevaesfera4.setRadi(5.5);
        System.out.println(lamevaesfera4.getRadi());
        System.out.println(lamevaesfera1.area());

    }



}
