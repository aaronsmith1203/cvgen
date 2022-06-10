package app.aaronsmith.cvgen;

import java.util.HashMap;
import java.util.Map;

public class Section {
    private String name;
    private Map<String,String> elements = new HashMap<>();

    public Section(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void addElement(String name, String value) {
        elements.put(name, value);
    }

    public String getElement(String name) {
        return elements.get(name);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{ ");
        str.append("name=" + name + ", ");
        str.append("elements=" + elements.toString());
        str.append("}");
        return str.toString();
    }
}
