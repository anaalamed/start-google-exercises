package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.factoryMethod;


public class ClothingStore implements Store{
    @Override
    public void sell(){
        System.out.println("Selling clothes");
    }
}


