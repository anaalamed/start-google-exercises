package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.adapter;

public class Sparrow implements Bird
{
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSound() {
        System.out.println("sparrow - Chirp Chirp");
    }
}
