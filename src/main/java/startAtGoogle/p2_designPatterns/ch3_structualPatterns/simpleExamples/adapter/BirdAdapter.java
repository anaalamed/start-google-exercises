package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.adapter;

public class BirdAdapter implements ToyDuck {
    // use a Bird as a ToyDuck
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {       // toyDuck's method
        bird.makeSound();        // bird's method
    }
}
