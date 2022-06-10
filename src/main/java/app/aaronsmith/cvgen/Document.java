package app.aaronsmith.cvgen;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Section> sections = new ArrayList<>();

    public void addSection(Section s) {
        sections.add(s);
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{");
        str.append("sections=" + sections.toString());
        str.append("}");
        return str.toString();
    }

}
