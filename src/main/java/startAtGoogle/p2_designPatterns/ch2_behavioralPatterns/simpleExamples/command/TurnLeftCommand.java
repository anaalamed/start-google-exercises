package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public class TurnLeftCommand extends Command{
    // Concrete commands
    public TurnLeftCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.turn(Car.Direction.LEFT);
    }
}
