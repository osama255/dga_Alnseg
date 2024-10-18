package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {




    public String platformNew,platformClassification,workingTime,platformDescription;

    public String workingRange, goal,justification, analysis, startegic;

    public String serviceName, serviceDescription, serviceFees, serviceFees1, serviceName1, serviceName2;



    public void jsonreader() throws FileNotFoundException, IOException, ParseException {

        String filePath= System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));
        for(Object jsonObj : jarray)
        {

            JSONObject person = (JSONObject) jsonObj ;

            platformNew  = (String) person.get("platformNew");
            System.out.println(platformNew);


            platformClassification  = (String) person.get("platformClassification");
            System.out.println(platformClassification);

            workingTime  = (String) person.get("workingTime");
            System.out.println(workingTime);

            platformDescription  = (String) person.get("platformDescription");
            System.out.println(platformDescription);

            ///////////////////////////////////////////////////////////////////
            workingRange  = (String) person.get("workingRange");
            System.out.println(workingRange);

            goal  = (String) person.get("goal");
            System.out.println(goal);

            justification  = (String) person.get("justification");
            System.out.println(justification);

            analysis  = (String) person.get("analysis");
            System.out.println(analysis);

            startegic  = (String) person.get("startegic");
            System.out.println(startegic);



            /////////////////////////////////////////////////

            serviceName  = (String) person.get("serviceName");
            System.out.println(serviceName);

            serviceDescription  = (String) person.get("serviceDescription");
            System.out.println(serviceDescription);

            serviceFees  = (String) person.get("serviceFees");
            System.out.println(serviceFees);

            serviceFees1  = (String) person.get("serviceFees1");
            System.out.println(serviceFees1);

            serviceName1  = (String) person.get("serviceName1");
            System.out.println(serviceName1);

            serviceName2  = (String) person.get("serviceName2");
            System.out.println(serviceName2);











        }


    }

}
