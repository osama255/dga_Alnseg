package Tests_User;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.helper;

import java.util.concurrent.TimeUnit;

public class testbase {
    //public WebDriver driver;
    public static WebDriver driver ;



    @BeforeSuite
    @Parameters({"browser"})

    public void startdriver(@Optional("chrome") String browsename) {

        ChromeOptions options = null;
        if (browsename.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            options = new ChromeOptions();
            options.addArguments("headless");

        } else if (browsename.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browsename.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("http://10.1.70.176:6032/iam_callback/?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI0NTU5NWZkNC02YTc0LTQ1ZGMtYTYyNS0wNTUzODI1Yjg1YmEiLCJqdGkiOiI5YjM5OTIyYS0xMWY4LTQyM2EtOTYxOS0zNTZmNWQwNWQxOTQiLCJ1bmlxdWVfbmFtZSI6IjEwMTYwMzMzNTciLCJlbWFpbCI6IiUjIyMjdGVtcCMjIyNAMzN0ZW1wMzMuY29tJSIsInJvbGUiOiJFeHRlcm5hbCIsImFnZW5jeUlkIjoiMjAzIiwiYWdlbmN5TmFtZSI6Ik1pbmlzdHJ5IE9mIEp1c3RpY2UiLCJleHAiOjE3MjkyNjQ1MTQsImlzcyI6IkRHQURpZ2l0YWxGYWJyaWMiLCJhdWQiOiJER0FEaWdpdGFsRmFicmljVXNlciJ9.08oAMG0yBDxOOfnT22SJU2IGNFNZo4N5eDBZqB5LoCs");
        //options.addArguments("--enable-cookies");
        //Set<Cookie> cookies = driver.manage().getCookies();
        //WebDriver driver = new ChromeDriver(options);
        // driver.navigate().to("https://login.microsoftonline.com/bb8286be-fc8d-4354-ab01-c4ee4b492d96/oauth2/v2.0/authorize?scope=openid+email+profile&state=NdxBp_Ej3mVzMVC6JpXrJzCTLUkBt0xXN-HNSy3Yro8.LRBEYoHU0eY.admin&response_type=code&client_id=80a47409-36c4-43e0-8ec4-3fec500c2620&redirect_uri=https%3A%2F%2Fsso.staging.svc.jahez.net%2Fauth%2Frealms%2Fadmin%2Fbroker%2Foidc%2Fendpoint&prompt=login&nonce=rqpzSLKbR3pMOO_8JPhEGg");
        //driver.navigate().to("https://portal.stage.svc.pik.sa/portal/admin/operations-dashboard");


    }





    @AfterSuite
    public void stop_driver() {
        //driver.quit();

    }

    //take screenshoot when testcase fail and add it in screen folder
    @AfterMethod
    public void screenshootonfailure(ITestResult result) {

        if(result.getStatus() == ITestResult.FAILURE)
        {

            System.out.print("failed");
            System.out.print("taking screenshoot ----");
           helper.capturescreenshoot(driver, result.getName());
        }

    }
}
