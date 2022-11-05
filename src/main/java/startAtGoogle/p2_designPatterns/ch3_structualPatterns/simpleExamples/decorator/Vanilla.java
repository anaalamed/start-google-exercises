package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.decorator;

public class Vanilla implements IceCream{

    @Override
    public void flavor() {
        System.out.println("Vanilla");
    }
}