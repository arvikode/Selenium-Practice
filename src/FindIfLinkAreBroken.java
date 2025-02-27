import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindIfLinkAreBroken {


    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        try{
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();

            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total Links Found: "+links.size());
            System.out.println(links);

            for (WebElement element:links){
                String url = element.getAttribute("href");

                if (url==null||url.isEmpty()){
                    System.out.println("Skipping Empty or Null URL");
                    continue;
                }
                Boolean isWorking = linkCheck(url);
                if (isWorking){
                    System.out.println("Link Working");
                } else {
                    System.out.println("Link Not Working");
                }
            }

            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }

    }

    public static boolean linkCheck(String url){
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("Head");
            connection.connect();

            int connectionResponseCode = connection.getResponseCode();

            return connectionResponseCode >= 200 && connectionResponseCode < 400;
        }catch (MalformedURLException e){
            System.out.println("Link Malformed Exception");
        }catch (IOException e){
            System.out.println("IO Exception")
            ;
        }

        return true;
    }

}
