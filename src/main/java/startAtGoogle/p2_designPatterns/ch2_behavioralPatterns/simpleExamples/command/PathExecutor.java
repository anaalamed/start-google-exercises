package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

import java.util.LinkedList;

public class PathExecutor {
    // executor
    private LinkedList<Command> commands = new LinkedList<>();

    public void queueCommand(Command command){
        commands.add(command);
    }

    public void executeAll(){
        while(!commands.isEmpty()){
            commands.poll().execute();
        }
    }
}
