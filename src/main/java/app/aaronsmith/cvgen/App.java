package app.aaronsmith.cvgen;

import app.aaronsmith.cvgen.io.BasicCVLoader;
import app.aaronsmith.cvgen.model.CV;

public class App 
{
    public static void main( String[] args )
    {
        try {
            final String filePath = args[0]; // path to json file
            final CV cv = BasicCVLoader.load(filePath);

            // temporary sysout to show content loaded into CV class model
            System.out.println(cv.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
