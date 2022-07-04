package app.aaronsmith.cvgen.model;

import java.util.Date;

public class EducationDescription {

    private String title; // required
    private String provider; // required
    private Date startDate; // required
    private Date endDate; // optional
    private String description; // optional

    public EducationDescription() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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
        str.append("title=" + title);
        str.append(", provider=" + provider);
        str.append(", startDate=" + startDate);
        str.append(", endDate=" + endDate);
        str.append(", description=" + description);
        str.append("}");
        return str.toString();
    }

}
