package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

public interface Visitor {
    void visit(Oven oven);
    void visit(FoodProcessor foodProcessor);
}
