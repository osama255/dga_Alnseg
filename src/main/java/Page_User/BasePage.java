package Page_User;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    // Custom method to wait for an element
    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void invisibilityOfelement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(element));    }

    // Custom method to click an element
    public void clickon(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clickElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            scrollToElement(element); // Ensure the element is in view
            element.click();
        } catch (ElementClickInterceptedException e) {
            // If the element is still not clickable, try JS click
            jsClick(element);
        }
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickono_overlay(WebElement element) {
        invisibilityOfelement(element);
        element.click();
    }


    /*
    // Custom method to enter text
    public void enterText(WebElement element, String text) {
        waitForElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }
    */

    protected  void setTextElementText
            (WebElement textElement , String value)
    {
        waitForElementToBeVisible(textElement);
        textElement.clear();
        textElement.sendKeys(value);
    }

    public void clickOnEmptySpace(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Click at coordinates (x, y) on the screen
        js.executeScript("document.elementFromPoint(200, 200).click();");
    }

    //custom method for dropdown
    public void selectFromDropdown(WebElement dropdownElement, String selection, String selectBy) {
        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Choose selection method based on the selectBy parameter
        switch (selectBy.toLowerCase()) {
            case "text":
                dropdown.selectByVisibleText(selection);
                break;
            case "index":
                int index = Integer.parseInt(selection);
                dropdown.selectByIndex(index);
                break;
            case "value":
                dropdown.selectByValue(selection);
                break;
            default:
                throw new IllegalArgumentException("Invalid selectBy option: " + selectBy);
        }
    }



    // Method to upload a file
    public void uploadFile(WebElement uploadElement, String filePath) {
        uploadElement.sendKeys(filePath);
    }

    public void crtlc() throws AWTException {
        String imageName = "logo.jpeg";
        String imagePath = System.getProperty("user.dir")+"\\uploads\\"+imageName;
        // clickElement(fileUploader);

        // Code using robot class for file upload

        Robot robot = new Robot();

        // CTRL + C copy image path
        StringSelection selection = new StringSelection(imagePath);
        System.out.println(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);

    }

    public void crtv () throws AWTException {
        Robot robot = new Robot();

        // Click on CTRL + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //Thread.sleep(1000);
    }

}
