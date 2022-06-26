package app.aaronsmith.cvgen.model;

import java.util.ArrayList;
import java.util.List;

public class CV {
    private String title = "Default Title";
    private String personalStatement;
    private List<JobDescription> workExperience = new ArrayList<>();
    private List<EducationDescription> education = new ArrayList<>();
    private List<String> skills = new ArrayList<>();

    public CV() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPersonalStatement() {
        return personalStatement;
    }

    public void setPersonalStatement(String personalStatement) {
        this.personalStatement = personalStatement;
    }

    public List<JobDescription> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(List<JobDescription> workExperience) {
        this.workExperience = workExperience;
    }

    public List<EducationDescription> getEducation() {
        return education;
    }

    public void setEducation(List<EducationDescription> education) {
        this.education = education;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{");
        str.append("title=" + this.title + ", ");
        if (personalStatement != null) {
            str.append("personalStatement=" + this.personalStatement + ", ");
        }
        str.append("workExperience=" + workExperience + ", ");
        str.append("education=" + education + ", ");
        str.append("skills=" + skills);
        str.append("}");
        return str.toString();
    }
}
