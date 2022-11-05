package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.builder;

public class Person {
    private final String firstName;
    private String phone;

    // Private constructor
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.phone = builder.phone;
    }

    public static class Builder {
        //Required Parameters
        private final String firstName;

        //Optional Parameters
        private String phone = "123-456-789";

        //Constructor
        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
