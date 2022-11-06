package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_adapter_farm.farm;

public class WoodenStructureAdapter implements Animal {
    // WoodenHorse act as an Animal
    WoodenStructure woodenStructure;

    public WoodenStructureAdapter(WoodenStructure woodenStructure) {
        this.woodenStructure = woodenStructure;
    }

    @Override
    public void move() {                      // move - animal's method
        System.out.println("wooden structure adapter move");
        woodenStructure.roll();               // roll - wooden's method
    }

    @Override
    public Animal mate(Animal partner) {
        try {
            System.out.println("adapter mate");
            WoodenHorse woodenHorse =  woodenStructure.replicate(partner);

            return new WoodenStructureAdapter(woodenHorse);
        } catch (IllegalArgumentException ex) {
            System.out.println("mate ex -> " + ex.getMessage());
            return null;
        }
    }

    @Override
    public Gender getGender() {
        return null;
    }

    @Override
    public String toString() {
        return "WoodenStructureAdapter{" +
                "woodenStructure=" + woodenStructure +
                '}';
    }
}
