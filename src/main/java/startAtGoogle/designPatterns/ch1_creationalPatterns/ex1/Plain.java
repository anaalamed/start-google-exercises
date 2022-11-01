package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1;

public class Plain implements Vehicle{

    public void transport(Passenger passenger) {
        System.out.println(passenger.getName());
    }
}
