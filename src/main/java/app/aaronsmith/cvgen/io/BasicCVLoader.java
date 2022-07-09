package app.aaronsmith.cvgen.io;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.aaronsmith.cvgen.model.CV;

// This class exists to load the CV content from a JSON file into a `CV` POJO and all composite objects. 
// The properties in the JSON file are bound 1-2-1 against the fields in the POJOs.
// The names and nesting of the JSON properties have to match against the field names in the POJOs.
// If a property name is used that does not exist in the POJO,it is ignored and not loaded.

public class BasicCVLoader {

    public static CV load(String path) throws IOException, DatabindException {
        ObjectMapper mapper = new ObjectMapper();
        CV cv = mapper.readValue(new File(path), CV.class);
        return cv;
    }
}
