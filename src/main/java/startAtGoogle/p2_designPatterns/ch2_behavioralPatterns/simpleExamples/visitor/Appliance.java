package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.simpleExamples.visitor;

public interface Appliance {
    // common interface
    void accept(Visitor visitor);
}
