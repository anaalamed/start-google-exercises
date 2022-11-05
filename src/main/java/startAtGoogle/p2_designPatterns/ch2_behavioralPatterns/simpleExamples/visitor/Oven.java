package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

public class Oven implements Appliance{
    private int id;

    public Oven(int id) {
        this.id = id;
    }

    public void bakeBread(){
        System.out.println("Baking bread...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "id=" + id +
                '}';
    }
}
