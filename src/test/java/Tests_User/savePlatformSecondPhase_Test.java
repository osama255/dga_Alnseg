package Tests_User;

import Page_User.savePlatformGoal_page;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class savePlatformSecondPhase_Test extends testbase{

    savePlatformGoal_page savePlatformGoal_obj;
    JsonDataReader jsonReader;


    @Test
    public void platformSecondPhase_fn() throws IOException, ParseException, InterruptedException {

        savePlatformGoal_obj=new savePlatformGoal_page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        savePlatformGoal_obj.savePlatformgoal_fn(jsonReader.workingRange,jsonReader.goal,jsonReader.justification,
                jsonReader.analysis,jsonReader.startegic);


    }


}
