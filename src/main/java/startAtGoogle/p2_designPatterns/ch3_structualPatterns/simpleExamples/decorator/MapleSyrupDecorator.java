package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.decorator;

public class MapleSyrupDecorator extends IceCreamDecorator{
    public MapleSyrupDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void flavor() {
        // still calls the super.flavor()
        // thus “decorating” it but not replacing it
        super.flavor();
        addMapleSyrup();
    }
    private void addMapleSyrup(){
        System.out.println("With maple syrup");
    }
}
