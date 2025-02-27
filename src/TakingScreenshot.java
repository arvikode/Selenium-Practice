import freemarker.core.OutputFormat;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class TakingScreenshot {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        TakesScreenshot ts = (TakesScreenshot) driver;
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        try{
            File src1 = ts.getScreenshotAs(OutputType.FILE);
            File dest1 = new File("C:\\Users\\aravi\\IdeaProjects\\Selenium Practice\\beforesendingkeysscreenshot.png");
            FileUtils.copyFile(src1, dest1);
            WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
            userName.sendKeys("Aravind");
            Thread.sleep(5000);
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\aravi\\IdeaProjects\\Selenium Practice\\aftersendingkeysscreenshot.png");
            FileUtils.copyFile(src, dest);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
