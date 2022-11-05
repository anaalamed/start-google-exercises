package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex2_builder;
import java.time.LocalDate;

public class JobPosition {
    private LocalDate publishedDate;
    private String title;
    private String description;
    private String location;
    private int salaryCap;
    private boolean isRemote;
    private int yearsOfExperience;

    public static class Builder {
        //Required Parameters
        private LocalDate publishedDate;
        private String title;
        private boolean isRemote;

        //Optional Parameters
        private String description = "";
        private String location = "";
        private int salaryCap = 0;
        private int yearsOfExp = 0;

        // Required constructor
        public Builder(LocalDate publishedDate, String title, boolean isRemote) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        // Set optional values
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder yearsOfExp(int yearsOfExp) {
            this.yearsOfExp = yearsOfExp;
            return this;
        }

        public Builder salaryCap(int salaryCap) {
            this.salaryCap = salaryCap;
            return this;
        }

        public JobPosition build() {
            return new JobPosition(this);
        }
    }

    // only build() access to this private constructor
    private JobPosition(Builder builder) {
        this.publishedDate = builder.publishedDate;
        this.title = builder.title;
        this.description = builder.description;
        this.location = builder.location;
        this.salaryCap = builder.salaryCap;
        this.isRemote = builder.isRemote;
        this.yearsOfExperience = builder.yearsOfExp;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salaryCap=" + salaryCap +
                ", isRemote=" + isRemote +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}