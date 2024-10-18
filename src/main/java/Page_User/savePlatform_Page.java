package Page_User;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.Locale;
import java.util.Random;

public class savePlatform_Page  extends BasePage{

    //WebDriver driver;
    public savePlatform_Page(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-input-text[1]/input[1]")
    public WebElement platformName_txt;

    @FindBy(xpath="//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-drop-down-multi-select[1]/ng-multiselect-dropdown[1]/div[1]/div[1]")
    public WebElement target_drop;

    @FindBy(xpath="//div[contains(text(),'الأفراد')]")
    public WebElement targetIndividual_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/app-drop-down-multi-select[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
    public WebElement targetType_drop;

    @FindBy(xpath = "//div[contains(text(),'الأمني')]")
    public WebElement targetTypeSecurity_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/app-drop-down[1]/select[1]")
    public WebElement platformClassification_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/app-drop-down[1]/select[1]")
    public WebElement workingTime_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/app-drop-down-multi-select[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
    public WebElement channels_drop;

    @FindBy(xpath = "//div[contains(text(),'بوابة الكترونية')]")
    public WebElement channelWebsite_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/app-drop-down[1]/select[1]")
    public WebElement dataLocation_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/div[1]/app-drop-down[1]/select[1]")
    public WebElement serverRange_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[9]/div[1]/app-drop-down[1]/select[1]")
    public WebElement platformType_drop;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[10]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement platformDescription_txt;

    @FindBy(xpath = "    //body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-information[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-input-text[1]/input[1]\n")
    public WebElement mainRange_txt;

    @FindBy(xpath = "//button[contains(text(),'التحقق من التوفر')]")
    public WebElement verifyAvailability_btn;

    @FindBy(xpath = "//button[contains(text(),'حسنا')]")
    public WebElement Ok_btn;

    @FindBy(xpath = "//label[contains(text(),'تلتزم الجهة بتطبيق نظام التصميم الموحد (كود المنصا')]")
    public WebElement accept_checkbox;

    @FindBy(xpath = "//button[contains(text(),'التالي')]")
    public WebElement continue_btn;



    @FindBy(xpath = "")
    public WebElement osama;




    public void savePlatform(String platformNew, String platformClassification, String workingTime, String platformDescription) throws InterruptedException {


       // platformName_txt.sendKeys("platform new");
        setTextElementText(platformName_txt,platformNew);

        clickElement(target_drop);
        clickElement(targetIndividual_drop);
        clickOnEmptySpace(driver); // Call your method here

        clickElement(targetType_drop);
        clickElement(targetTypeSecurity_drop);
        clickOnEmptySpace(driver); // Call your method here

        // Call the method from BasePage to select an option
        selectFromDropdown(platformClassification_drop, platformClassification, "text"); // Selecting by visible text
        // selectFromDropdown(dropdown, "1", "index"); // Selecting by index
        // selectFromDropdown(dropdown, "optionValue", "value"); // Selecting by value

        selectFromDropdown(workingTime_drop, workingTime, "text"); // Selecting by visible text

        clickElement(channels_drop);
        clickElement(channelWebsite_drop);
        clickOnEmptySpace(driver);

        selectFromDropdown(dataLocation_drop, "2", "index"); // Selecting by visible text;
        //استضافة داخل السعودية

        selectFromDropdown(serverRange_drop, "2", "index"); // Selecting by visible text;

        selectFromDropdown(platformType_drop, "1", "index"); // Selecting by visible text;

        setTextElementText(platformDescription_txt,platformDescription);

        //Create unique data for field "main range"
        Random random=new Random();
        int randomInt=random.nextInt();
        setTextElementText(mainRange_txt,randomInt+ ".sa");
        clickElement(verifyAvailability_btn);

       // clickOnEmptySpace(driver);
        Thread.sleep(3000);
        clickElement(Ok_btn);

        clickElement(accept_checkbox);

        clickElement(continue_btn);

















    }

}
