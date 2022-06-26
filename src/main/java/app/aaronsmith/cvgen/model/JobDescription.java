package app.aaronsmith.cvgen.model;

import java.util.Date;

public class JobDescription {

    private String jobTitle; // required
    private String companyName; // required
    private Date startDate; // required
    private Date endDate; // optional
    private String description; // optional

    public JobDescription() {
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{");
        str.append("jobTitle=" + jobTitle);
        str.append(", companyName=" + companyName);
        str.append(", startDate=" + startDate);
        str.append(", endDate=" + endDate);
        str.append(", description=" + description);
        str.append("}");
        return str.toString();
    }

}
