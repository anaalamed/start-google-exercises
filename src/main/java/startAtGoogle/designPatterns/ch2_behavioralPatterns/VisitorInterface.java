package startAtGoogle.designPatterns.ch2_behavioralPatterns;

public interface VisitorInterface  {
    void visit(User user);
    void visit(Group group);
    void visit( Asset asset );
}

