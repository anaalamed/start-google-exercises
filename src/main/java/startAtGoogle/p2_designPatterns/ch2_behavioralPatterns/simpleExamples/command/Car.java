package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.command;

public class Car {
    // receiver
    public enum Direction{LEFT,RIGHT}
    boolean stopped = true;

    public void turn(Direction direction){
        if(stopped){
            System.out.println("Can't turn while stopped");
        }else{
            System.out.printf("Turning %s%n",direction);
        }
    }
    public void stop(){
        if(stopped){
            System.out.println("Already stopped");
        }else{
            stopped=true;
            System.out.println("Stopping");
        }
    }

    public void go(){
        if(!stopped){
            System.out.println("Already going");
        }else{
            stopped=false;
            System.out.println("Going...");
        }
    }
}

