package mvm.daw.exemples;

import org.jetbrains.annotations.Contract;

import java.awt.*;

public class Esfera {
    double radi;
    Color color;
    final double PI = 3.141592;

    /**
     * Class constructor
     * @param r radius of sphere
     */
    Esfera (double r){
        color = Color.white;
        radi = r;
    }

    @Contract(pure = true)
    Esfera (Esfera e){
        radi = e.radi;
    }

    double area(){
        return 4.0 * PI * radi * radi;
    }

    void escalar(Esfera esfera, double escalat){
        esfera.radi *= escalat;
    }
}
