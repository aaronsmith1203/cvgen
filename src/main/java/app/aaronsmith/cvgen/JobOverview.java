package app.aaronsmith.cvgen;

import java.util.Date;
import java.util.List;

public class JobOverview {

    private final String jobTitle; // required
    private final String companyName; // required
    private final Date startDate; // required
    private final Date endDate; // optional
    private final String description; // optional
    private List<String> duties; // optional
    private List<String> achievements; // optional

    private JobOverview(Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.companyName = builder.companyName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.description = builder.description;
    }

    @Override
    public String toString() {
        return "[JobOverview] { achievements=" + achievements + ", companyName=" + companyName + ", description="
                + description + ", duties=" + duties + ", endDate=" + endDate + ", jobTitle=" + jobTitle
                + ", startDate=" + startDate + "}";
    }

    public static class Builder {

        private final String jobTitle;
        private final String companyName;
        private final Date startDate;
        private Date endDate;
        private String description;

        public Builder(String jobTitle, String companyName, Date startDate) {
            this.jobTitle = jobTitle;
            this.companyName = companyName;
            this.startDate = startDate;
        }

        public Builder endDate(Date date) {
            this.endDate = date;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public JobOverview build() {
            return new JobOverview(this);
        }
    }
}
