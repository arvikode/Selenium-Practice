import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OptionsAndCapabilities {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("version", "latest");
        options.merge(capabilities);

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.amazon.in/");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
