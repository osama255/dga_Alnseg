package Page_User;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;

public class savePlatformServiceList_page extends BasePage{

    public savePlatformServiceList_page(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(text(),'إضافة خدمة جديدة')]")
    public WebElement addNewService_btn;


    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceName_txt;
    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceDescription_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceFees_txt;

    @FindBy(xpath = "//button[contains(text(),'إضافة خدمة جديدة')]")
    public WebElement addService_btn;


    // second point
    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceName1_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceDescription1_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceFees1_txt;



    //third time
    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceName2_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceDescription2_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/app-input-text[1]/input[1]")
    public WebElement serviceFees2_txt;

    @FindBy(xpath = "//label[contains(text(),'تعهد: تقر وزارة العدل بعدم وجود خدمات أخرى ستقدم ف')]")
    public WebElement accept_checkbox;

    @FindBy(xpath = "//button[contains(text(),'إرسال')]")
    public WebElement sent_btn;


    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/*[1]") // Adjust the selector to match your HTML
    private WebElement fileUploadInput;

    @FindBy(css = "input[type=file]")
    public WebElement uploadElement ;



    @FindBy(id = "file-cancel+-")
    public WebElement submitpopup_btn;






    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/*[1]")
    public WebElement fileUploader;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/*[1]")
    public WebElement fileUploader1;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/*[1]")
    public WebElement fileUploader2;

    @FindBy(xpath="//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/a[1]")
    public  WebElement delete1_btn;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement addFile1_btn;

   // @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    //public WebElement addFile1_btn;

    //@FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]")
    //public WebElement addFile1_btn; 8 seconds

    //@FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]")
    //public WebElement addFile1_btn;


    //@FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]")
    //public WebElement addFile1_btn;

   // @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
    //public WebElement addFile1_btn;



    //@FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    //public WebElement addfile2_btn ;


    //@FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-platform[1]/app-platform-container[1]/app-platform-container-layout[1]/div[2]/div[1]/div[2]/app-platform-service[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[4]/app-attachment-input[1]/app-attachment[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    //public WebElement addfile3_btn;

    @FindBy(xpath = "//button[contains(text(),'إرسال')]")
    public WebElement finalSent_btn;










    public void savePlatformList_fn(String serviceName, String serviceDescription, String serviceFees  ) throws InterruptedException, AWTException {


        clickElement(addNewService_btn);
        setTextElementText(serviceName_txt,serviceName);
        setTextElementText(serviceDescription_txt,serviceDescription);
        setTextElementText(serviceFees_txt,serviceFees);


       //////////////////////////////////////////////
        //uploadFile(fileUploadInput, filePath);
        //clickElement(fileUploadInput);

        //String filePath = Paths.get("uploads", fileName).toAbsolutePath().toString();

        // Locate the file input element (use the correct locator)

        // Upload the file
        //Thread.sleep(2000);
        //Alert alert = driver.switchTo().alert();
        //alert.sendKeys(filePath);

        //uploadElement.sendKeys(filePath);
        //Thread.sleep(2000);

        //clickElement(submitpopup_btn);

        ///////////////////////////




        //WebElement fileUploader55 = driver.findElement(By.id("file-upload"));

        //fileUploader55.sendKeys(imagePath);



        //WebElement fileUploader = driver.findElement(By.id("file-upload"));
        //fileUploader.click();




        //Thread.sleep(2000);


        //fileUploader.sendKeys(imagePath);



        //clickElement(addFile1_btn);

       //scrollToElement(addFile1_btn);
        clickElement(addNewService_btn);





    }

    public void savePlatformList1_fn(String serviceName1, String serviceDescription1, String serviceFees1 ) throws InterruptedException, AWTException {


        clickElement(addNewService_btn);
        setTextElementText(serviceName1_txt,serviceName1);
        setTextElementText(serviceDescription1_txt,serviceDescription1);
        setTextElementText(serviceFees1_txt,serviceFees1);

        clickElement(addNewService_btn);

    }

    public void savePlatformList2_fn(String serviceName2, String serviceDescription2, String serviceFees2 ) throws InterruptedException, AWTException {


        //clickElement(addNewService_btn);
        setTextElementText(serviceName2_txt,serviceName2);
        setTextElementText(serviceDescription2_txt,serviceDescription2);
        setTextElementText(serviceFees2_txt,serviceFees2);


      // clickElement(addService_btn);


        Thread.sleep(1000);
        scrollToElement(accept_checkbox);


        clickElement(accept_checkbox);
        //clickElement(sent_btn);

        clickElement(finalSent_btn);



    }


    }
