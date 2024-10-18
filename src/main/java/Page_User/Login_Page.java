package Page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;


public class Login_Page extends BasePage {


    //WebDriver driver;
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-portal-home[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement platform_btn;

    public void User_Login() throws InterruptedException {


        //Thread.sleep(2000);
        clickElement(platform_btn);

    }




}
