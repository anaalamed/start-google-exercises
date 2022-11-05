package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public class GoCommand extends Command{
    // Concrete commands
    public GoCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.go();
    }
}