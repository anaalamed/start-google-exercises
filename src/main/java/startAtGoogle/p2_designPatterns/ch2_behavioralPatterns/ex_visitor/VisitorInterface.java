package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.ex_visitor;

public interface VisitorInterface  {
    void visit(User user);
    void visit(Group group);
    void visit( Asset asset );
}

