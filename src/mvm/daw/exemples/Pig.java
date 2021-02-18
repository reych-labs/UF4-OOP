package mvm.daw.exemples;

class Pig extends Animal implements Animable {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void makesSound(){
        System.out.println("wee wee");
    }
    public void goesToSleep(){
        System.out.println("I'm in bed");
    }
}
