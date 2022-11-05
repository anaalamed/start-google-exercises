package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.builder;


public class Main {
    public static void main(String[] args) {
        // builder
        Person example = new Person.Builder("aaa")
                .phone("1234")
                .build();
        System.out.println("\n" + example);
    }
}
