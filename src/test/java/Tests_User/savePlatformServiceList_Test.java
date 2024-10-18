package Tests_User;


import Page_User.savePlatformServiceList_page;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class savePlatformServiceList_Test extends testbase{



    savePlatformServiceList_page savePlatformList_obj;
    JsonDataReader jsonReader;


    @Test
    public void platformThirdPhase_fn() throws IOException, ParseException, InterruptedException, AWTException {

        savePlatformList_obj=new savePlatformServiceList_page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        savePlatformList_obj.savePlatformList_fn(jsonReader.serviceName,jsonReader.serviceDescription,jsonReader.serviceFees1);
        savePlatformList_obj.savePlatformList1_fn(jsonReader.serviceName1,jsonReader.serviceDescription,jsonReader.serviceFees1);
        savePlatformList_obj.savePlatformList2_fn(jsonReader.serviceName2,jsonReader.serviceDescription,jsonReader.serviceFees1);




    }
}
