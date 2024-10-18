package Page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class savePlatformGoal_page extends BasePage{



    //WebDriver driver;
    public savePlatformGoal_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-target[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement workingRange_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-target[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement goal_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-target[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement justification_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-target[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement analysis_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-target[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/app-input-text[1]/textarea[1]")
    public WebElement strategic_txt;

    @FindBy(xpath = "//label[contains(text(),'لا')]")
    public WebElement similarPlatform_txt;

    @FindBy(xpath = "//button[contains(text(),'التالي')]")
    public WebElement next_btn;





    @FindBy(xpath = "")
    public WebElement osama;




    public void savePlatformgoal_fn(String workingRange, String goal, String justification,String analysis, String Strategic ) throws InterruptedException {

        //setTextElementText(workingRange_txt,workingRange);

        //setTextElementText(goal_txt,goal);
        setTextElementText(goal_txt,workingRange);
        setTextElementText(workingRange_txt,goal);
        setTextElementText(justification_txt, justification);
        setTextElementText(analysis_txt, analysis);
        setTextElementText(strategic_txt, Strategic);

        clickElement(similarPlatform_txt);
        clickElement(next_btn);







    }

}
