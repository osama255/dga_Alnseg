package utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helper {
    public static void capturescreenshoot(WebDriver driver, String fileName) {
        // Cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Specify the destination for the screenshot
        File destination = new File("screenshots/" + fileName + ".png");

        try {
            // Create the destination folder if it doesn't exist
            destination.getParentFile().mkdirs();
            // Copy the screenshot to the destination
            FileHandler.copy(source, destination);
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }

}
