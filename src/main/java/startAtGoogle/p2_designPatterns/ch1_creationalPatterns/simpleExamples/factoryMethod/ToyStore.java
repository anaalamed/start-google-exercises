package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.factoryMethod;

public class ToyStore implements Store {
    @Override
    public void sell() {
        System.out.println("Selling toys");
    }
}
