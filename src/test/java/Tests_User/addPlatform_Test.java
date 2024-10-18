package Tests_User;

import Page_User.Login_Page;
import Page_User.addPlatform_page;
import data.JsonDataReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class addPlatform_Test extends testbase {

    Login_Page login_obj;

    addPlatform_page addplaformobj_obj;
    JsonDataReader jsonReader;

    @Description("move to regstration platform")


    /*

    @Test(priority = 1)
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException {


        login_obj=new Login_Page(driver);
        login_obj.User_Login();
    }

*/

    @Test
    public void UserCanRegisterPlatform() throws IOException, ParseException {
        addplaformobj_obj=new addPlatform_page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        addplaformobj_obj.Reg_platform();
    }
}
