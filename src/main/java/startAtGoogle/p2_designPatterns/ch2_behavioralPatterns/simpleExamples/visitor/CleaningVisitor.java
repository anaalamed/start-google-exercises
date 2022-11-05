package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

public class CleaningVisitor implements Visitor{
    // visit other impliances

    @Override
    public void visit(Oven oven) {
        System.out.printf("Cleaning the oven %s\n", oven);
    }

    @Override
    public void visit(FoodProcessor foodProcessor) {
        System.out.printf("Cleaning the foodProcessor %s\n", foodProcessor);
    }
}
