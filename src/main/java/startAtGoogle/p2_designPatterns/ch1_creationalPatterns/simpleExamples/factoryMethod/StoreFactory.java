package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.factoryMethod;

public class StoreFactory {
    enum StoreType{CLOTHES,TOYS}
    public Store createStore(StoreType type){
        switch (type){
            case CLOTHES:
                return new ClothingStore();
            case TOYS:
                return new ToyStore();
            default:
                throw new IllegalArgumentException(String.format("Store type not supported: %s", type));
        }
    }
}