package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.adapter;

public class Main {
    public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticDuck();

        System.out.println("Sparrow:");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("\nToyDuck:");
        toyDuck.squeak();

        // use a Bird as a ToyDuck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("\nBirdAdapter:");
        birdAdapter.squeak();                           // toyDuck's method
    }
}
