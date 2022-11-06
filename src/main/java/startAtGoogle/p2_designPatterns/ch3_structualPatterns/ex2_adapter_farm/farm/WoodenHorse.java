package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_adapter_farm.farm;

public class WoodenHorse implements WoodenStructure {
    private String name;

    public WoodenHorse(String name) {
        this.name = name;
    }

    @Override
    public void roll() {
        System.out.println("roll - wooden horse roll");
    }

    @Override
    public WoodenHorse replicate(Animal partner) {
        if(!(partner instanceof WoodenStructureAdapter))
            throw new IllegalArgumentException("can't replicate with not WoodenStructureAdapter...");

        System.out.println("wooden horse replicate..");
        return new WoodenHorse("dakota");
    }


    @Override
    public String toString() {
        return "WoodenHorse{" +
                "name='" + name + '\'' +
                '}';
    }
}
