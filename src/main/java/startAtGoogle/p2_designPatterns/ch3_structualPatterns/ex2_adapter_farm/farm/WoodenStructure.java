package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_adapter_farm.farm;

public interface WoodenStructure {
    public void roll();
    public WoodenStructure replicate(Animal partner);
}
