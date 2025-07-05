import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriverSingleton singletonWebDriver;
    private static WebDriver driver;

    private WebDriverSingleton() {
        if (singletonWebDriver != null) {
            throw new IllegalArgumentException("Object Already Exists!");
        }
    }

    private static void getInstance() {
        singletonWebDriver = new WebDriverSingleton();
    }

    public static WebDriver getdriver() {
        return driver;
    }

}
