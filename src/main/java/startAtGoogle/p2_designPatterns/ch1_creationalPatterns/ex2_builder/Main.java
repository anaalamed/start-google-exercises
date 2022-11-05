package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex2_builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        JobPosition developer = new JobPosition.Builder(LocalDate.now(), "developer", true)
                .description("booom")
                .location("Tel Aviv")
                .salaryCap(10)
                .yearsOfExp(1)
                .build();
        System.out.println(developer);
    }
}
