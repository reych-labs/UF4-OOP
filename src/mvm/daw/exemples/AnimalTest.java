package mvm.daw.exemples;

public class AnimalTest {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        Dog myDog = new Dog();
        myPig.animalSound();
        myDog.animalSound();
        myPig.makesSound();
        myPig.goesToSleep();
    }
}
