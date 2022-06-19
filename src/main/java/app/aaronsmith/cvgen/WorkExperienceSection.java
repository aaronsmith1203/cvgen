package app.aaronsmith.cvgen;

import java.util.ArrayList;
import java.util.List;

public class WorkExperienceSection {

    private List<JobOverview> jobs;

    public WorkExperienceSection(int initialSize) {
        jobs = new ArrayList<>(initialSize);
    }

    public void addJob(JobOverview job) {
        jobs.add(job);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{ ");
        str.append("jobs=" + jobs.toString());
        str.append("}");
        return str.toString();
    }
}
