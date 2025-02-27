import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonMensFashion {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("version", "latest");
        options.merge(capabilities);

        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
            WebElement hamburgerMenu = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
            hamburgerMenu.click();
            Thread.sleep(2000);

            WebElement mensFashion = driver.findElement(By.xpath("//a[@class='hmenu-item' and @data-menu-id='10']//div[text()=\"Men's Fashion\"]"));
            js.executeScript("arguments[0].scrollIntoView(true)", mensFashion);
            mensFashion.click();
            Thread.sleep(2000);

            WebElement sportShoes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sports Shoes' and @href='/gp/browse.html?node=1983519031&ref_=nav_em_sbc_mfashion_sportshoes_0_2_10_15']")));
            js.executeScript("arguments[0].scrollIntoView(true)", sportShoes);
            js.executeScript("arguments[0].click()", sportShoes);
            Thread.sleep(2000);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
