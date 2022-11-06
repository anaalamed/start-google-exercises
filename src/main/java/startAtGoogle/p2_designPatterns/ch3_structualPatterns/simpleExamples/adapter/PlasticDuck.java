package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.adapter;

public class PlasticDuck implements ToyDuck {
    public void squeak() {
        System.out.println("plastic duck Squeak");
    }
}