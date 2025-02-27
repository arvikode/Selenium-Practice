import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        try {
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();

            WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
            String colorBeforeHover = submitButton.getCssValue("background-color");
            act.moveToElement(submitButton).perform();
            String colorAfterHover = submitButton.getCssValue("background-color");
            System.out.println(colorBeforeHover+", "+colorAfterHover);
            Thread.sleep(2000);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
