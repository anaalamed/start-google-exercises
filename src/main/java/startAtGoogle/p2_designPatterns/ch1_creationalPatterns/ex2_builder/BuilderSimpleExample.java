package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex2_builder;

public class BuilderSimpleExample {
    private final String firstName;
    private String phone;

    // Private constructor
    private BuilderSimpleExample(Builder builder) {
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

        public BuilderSimpleExample build() {
            return new BuilderSimpleExample(this);
        }
    }

    @Override
    public String toString() {
        return "BuilderSimpleExample{" +
                "firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
