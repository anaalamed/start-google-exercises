package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // list of concrete classes - appliances (implement appliance)
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new Oven(1));
        appliances.add(new FoodProcessor(2));

        // concrete visitor
        CleaningVisitor cleaningVisitor = new CleaningVisitor();

        // visitor visit each appliance
        for (Appliance appliance : appliances) {
            appliance.accept(cleaningVisitor);
        }
    }
}
