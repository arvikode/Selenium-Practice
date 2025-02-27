import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.time.Duration;

public class selectorsHubCheckbox {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();
            Thread.sleep(1000);

            FluentWait<WebDriver> fWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(NoSuchElementException.class);

            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll by a certain pixel
//            js.executeScript("window.scrollBy(0,350)");
//            Thread.sleep(2000);

            // Scroll until a certain element is found
//            WebElement row = fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Garry White']")));
//            js.executeScript("arguments[0].scrollIntoView();", row);
//
//            WebElement checkBox = fWait
//                    .until(ExpectedConditions
//                            .elementToBeClickable(By.xpath("//td[text()='John Smith']/preceding-sibling::td/input[@type='checkbox']")));;

            try{
                Actions act = new Actions(driver);
                WebElement submitButton = fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value=\"Submit\"]")));
                // Perform an action without building
                act.moveToElement(submitButton).perform();

                // Perform an action with building
                Action toDo = act.click().build();
                toDo.perform();
                Thread.sleep(2000);
            } catch (Exception e){
                System.out.println("Element not clickable");
                e.printStackTrace();
            }
//            TakesScreenshot screenShot = (TakesScreenshot) driver;
//            screenShot.getScreenshotAs(OutputType.FILE);


            try{
//                FileUtils.copyFile(screenShot, new File("screenshots/screenshot.png"));
            } catch (Exception e){
                System.out.println(e);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
