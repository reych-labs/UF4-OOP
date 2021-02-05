package mvm.daw.exemples;

public class GeometriaTester {
    public static void main(String args[]){
        Esfera lamevaesfera1 = new Esfera(1.0);
        Esfera lamevaesfera2;
        Esfera lamevaesfera3 = new Esfera(2.0);
        lamevaesfera2 = lamevaesfera1;

        System.out.println("Àrea de l'esfera 1: "+ lamevaesfera1.area());
        System.out.println("Àrea de l'esfera 2: "+ lamevaesfera2.area());
        System.out.println("Àrea de l'esfera 3: "+ lamevaesfera3.area());

        System.out.println("Les referèncias lamevaesfera1 i lamevaesfera2 " +(lamevaesfera1==lamevaesfera2?"si":"no")+" apunten al mateix objecte");
        System.out.println("Les referèncias lamevaesfera1 i lamevaesfera3 " +(lamevaesfera1==lamevaesfera3?"si":"no")+" apunten al mateix objecte");

        lamevaesfera1.escalar(lamevaesfera1, 2.0);
        System.out.println("Radi d'esfera 1 escalat: "+ lamevaesfera1.radi);
    }
}
