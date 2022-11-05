package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Plain vanilla:");
        new Vanilla().flavor();

        // decorator
        // add functionality, not replace it
        System.out.println("Decorated vanilla:");
        new MapleSyrupDecorator(new Vanilla()).flavor();
    }

}
