import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();

            // Scroll to the web element
            WebElement garryWhiteRow = driver.findElement(By.xpath("//td[text()='Garry White']"));
            js.executeScript("arguments[0].scrollIntoView(true)", garryWhiteRow);
            Thread.sleep(5000);

            WebElement userNameEmail = driver.findElement(By.xpath("//input[@name='email']"));
            js.executeScript("arguments[0].scrollIntoView(true)", userNameEmail);

            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
