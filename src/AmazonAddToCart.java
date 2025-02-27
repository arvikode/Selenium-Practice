import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonAddToCart {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://www.amazon.in/ref=nav_logo");
            WebElement searchBar = eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
            searchBar.sendKeys("AC");
            Thread.sleep(2000);

            searchBar.submit();
            Thread.sleep(2000);

            WebElement addToCart = eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/child::div[@data-asin='B0DSJ9FQLD']//button[text()='Add to cart']")));
            js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
            addToCart.click();
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
