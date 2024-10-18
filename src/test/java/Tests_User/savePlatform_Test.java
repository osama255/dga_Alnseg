package Tests_User;

import Page_User.Login_Page;
import Page_User.addPlatform_page;
import Page_User.savePlatform_Page;
import data.JsonDataReader;
import io.qameta.allure.Description;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class savePlatform_Test extends testbase{


    savePlatform_Page saveplatformobj_obj;
    JsonDataReader jsonReader;


    @Description("save platform first phase")
    @Test
    public void UserCansavePlatform() throws IOException, ParseException, InterruptedException {
        saveplatformobj_obj=new savePlatform_Page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        saveplatformobj_obj.savePlatform(jsonReader.platformNew,jsonReader.platformClassification, jsonReader.workingTime,jsonReader.platformDescription);
    }
}
