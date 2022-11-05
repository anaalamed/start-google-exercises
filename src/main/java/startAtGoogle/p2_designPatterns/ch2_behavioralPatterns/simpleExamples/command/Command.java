package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public abstract class Command {
    // base command
    protected Car car;

    public Command(Car car) {
        this.car = car;
    }

    public abstract void execute();
}