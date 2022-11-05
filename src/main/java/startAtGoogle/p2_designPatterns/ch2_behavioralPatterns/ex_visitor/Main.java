package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.ex_visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create instances
        List<CommonInterface> instances = new ArrayList<>();
        instances.add(new Asset(1, "ana", 0.2 ));
        instances.add(new Group(2, 5));
        instances.add(new User(3, "ana", "1234"));

        // create visitor
        Visitor convertVisitor = new Visitor();

        for (CommonInterface instance : instances) {
            instance.accept(convertVisitor);
        }

    }

}
