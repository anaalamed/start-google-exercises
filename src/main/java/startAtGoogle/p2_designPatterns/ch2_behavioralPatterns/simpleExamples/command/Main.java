package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public class Main {
    public static void main(String[] args) {
        // receiver
        Car myCar = new Car();

        // executor
        PathExecutor pathExecutor = new PathExecutor();

        // add commands to the queue
        pathExecutor.queueCommand(new TurnLeftCommand(myCar));
        pathExecutor.queueCommand(new GoCommand(myCar));
        pathExecutor.queueCommand(new TurnRightCommand(myCar));
        pathExecutor.queueCommand(new TurnRightCommand(myCar));
        pathExecutor.executeAll();
    }
}
