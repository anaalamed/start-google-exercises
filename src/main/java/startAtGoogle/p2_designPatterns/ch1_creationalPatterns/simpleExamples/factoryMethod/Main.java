package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.factoryMethod;

public class Main {
        public static void main(String[] args) {
            StoreFactory storeFactory = new StoreFactory();
            Store store1 = storeFactory.createStore(StoreFactory.StoreType.TOYS);
            Store store2 = storeFactory.createStore(StoreFactory.StoreType.CLOTHES);
            store1.sell();
            store2.sell();
        }
}
