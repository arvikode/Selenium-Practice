import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class CheckIfAllLinksAreWorkingAmazon {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.amazon.in");
//            Thread.sleep(Duration.ofSeconds(2));
            List<WebElement> linkList = driver.findElements(By.tagName("a"));
            System.out.println("Total links found: " + linkList.size());
            for (WebElement link: linkList) {
                String url = link.getDomAttribute("href");
                System.out.println("Link is: " + url);

                if (url == null || url.isEmpty()) continue;

                boolean linkStatus = linkChecker(url);

                if (linkStatus) {
                    System.out.println("Working Link");
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public static boolean linkChecker(String url) {
        boolean linkStatus = false;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode > 200 || responseCode < 399) {
                linkStatus = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return linkStatus;
    }
}
