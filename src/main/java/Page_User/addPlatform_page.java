package Page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addPlatform_page  extends BasePage{

    //WebDriver driver;
    public addPlatform_page(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(text(),'تسجيل منصة')]")
    public WebElement regPlatform_btn;

    @FindBy(xpath = "//a[contains(text(),'تسجيل منصة جديدة')]")
    public WebElement newRegPlatform_btn;

    public void Reg_platform( ) {

        clickElement(regPlatform_btn);
        clickElement(newRegPlatform_btn);



    }
}
