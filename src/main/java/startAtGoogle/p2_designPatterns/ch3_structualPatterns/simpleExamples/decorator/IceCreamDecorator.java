package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.decorator;

public abstract class IceCreamDecorator implements IceCream {
    // This class implements IceCream and also wraps an instance of IceCream
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void flavor() {
        iceCream.flavor();
    }
}
