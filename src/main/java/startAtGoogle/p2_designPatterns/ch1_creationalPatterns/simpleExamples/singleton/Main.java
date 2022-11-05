package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.singleton;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // we can call StaticData.getInstance() anywhere, because it is static
        // an then call the non static method getNotes() which belongs to the inner instance of StaticData.
        List<String> notes = StaticData.getInstance().getNotes(5);
        System.out.println(notes);
    }
}
