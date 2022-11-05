package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

public class FoodProcessor implements Appliance{
    private int id;

    public FoodProcessor(int id) {
        this.id = id;
    }

    public void ownLogic(){
        System.out.println("my own logic...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FoodProcessor{" +
                "id=" + id +
                '}';
    }
}
