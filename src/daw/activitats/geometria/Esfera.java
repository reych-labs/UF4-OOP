package daw.activitats.geometria;

import java.awt.*;

public class Esfera extends Figure{
    double radi;
    Color colour;
    final double PI = 3.141592;

    /**
     * Class constructor.
     */
    Esfera(double r){
        super(0,0);
        radi = r;
    }

    Esfera(double r, Color c){
        super(0,0);
        radi = r;
        colour = c;
    }

    public double getRadi(){ return radi;}

    public void setRadi(double r){
        if(r>=0.0) {
            radi = r;
        }
    }

    /**
    * Modifica el valor que s'obté per param
    * @param v double que recull el valor per teclat
    *
    */
    public void modifyValue(double v){
        v = 5.8;
        System.out.println(v);
    }

    public void modifyValue(Esfera e, double v){
       e.radi *=v;
    }

    /**
     *  Mètode que retorna un objecte de tipus Esfera i modifica
     *  el radi de l'esfera multiplicant per 2
     * @return l'objecte Esfera
     * @see Esfera
     */
    public Esfera doubleEsfera(){
        Esfera e = new Esfera(2*radi);
        return e;
    }

    @Override
    public double area() {
        return 4*PI*radi*radi;
    }
}
