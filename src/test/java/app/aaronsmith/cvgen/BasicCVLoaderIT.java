package app.aaronsmith.cvgen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import app.aaronsmith.cvgen.io.BasicCVLoader;
import app.aaronsmith.cvgen.model.CV;
import app.aaronsmith.cvgen.model.ContactDetails;
import app.aaronsmith.cvgen.model.EducationDescription;
import app.aaronsmith.cvgen.model.JobDescription;

public class BasicCVLoaderIT {

    private CV buildExpectedCV() {
        ContactDetails cd = new ContactDetails();
        cd.setTelephoneNumber("0123 456 7890");

        List<JobDescription> we = new ArrayList<JobDescription>();
        JobDescription jd1 = new JobDescription();
        jd1.setJobTitle("Plumber");
        jd1.setCompanyName("Silly Plumbs");
        jd1.setStartDate(new Date(5000000));
        we.add(jd1);

        JobDescription jd2 = new JobDescription();
        jd2.setJobTitle("Software Developer");
        jd2.setCompanyName("Warez 4 You");
        jd2.setStartDate(new Date(123289081));
        jd2.setDescription("I did a lot of software development in this job.");
        we.add(jd2);

        List<EducationDescription> et = new ArrayList<EducationDescription>();
        EducationDescription ed1 = new EducationDescription();
        ed1.setTitle("Software Development Bootcamp");
        ed1.setProvider("QA Training");
        ed1.setDescription("I learned a lot about software developement and object-oriented programming.");
        et.add(ed1);

        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Unit Testing");
        skills.add("Origami");

        CV cv = new CV();
        cv.setPersonalStatement("This is my personal statement.");
        cv.setContactDetails(cd);
        cv.setWorkExperience(we);
        cv.setEducation(et);
        cv.setSkills(skills);

        return cv;
    }

    @Test
    public void testLoadFromJson() {
        final String INPUT_PATH = "src/test/resources/TestDocument.json";
        final CV EXPECTED = buildExpectedCV();
        try {
            final CV ACTUAL = BasicCVLoader.load(INPUT_PATH);
            assertEquals(EXPECTED.toString(), ACTUAL.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
