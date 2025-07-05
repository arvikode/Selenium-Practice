import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDropBetweenFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        try {
            driver.get("");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.switchTo().frame("");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement src = driver.findElement(By.xpath(""));
            WebElement dest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

            act.dragAndDrop(src, dest).perform();

            driver.switchTo().defaultContent();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
