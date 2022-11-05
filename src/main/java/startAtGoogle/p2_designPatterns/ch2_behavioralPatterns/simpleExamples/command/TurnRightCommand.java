package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public class TurnRightCommand extends Command{
    // Concrete commands
    public TurnRightCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.turn(Car.Direction.RIGHT);
    }
}
