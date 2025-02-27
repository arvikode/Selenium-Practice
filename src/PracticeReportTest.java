import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Time;
import java.time.Duration;

public class PracticeReportTest {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void setup(){
        // Initialize Extent Reports
        reports = new ExtentReports();

        // Create and initialize a Spark Reporter
        ExtentSparkReporter spark = new ExtentSparkReporter("practicereporttest.html");

        // Set the title
        spark.config().setReportName("Selectors Hub Test");
        spark.config().setDocumentTitle("Automation Test");

        reports.attachReporter(spark);

        // Set additional info
        reports.setSystemInfo("Tester", "Aravind");
        reports.setSystemInfo("Env", "Testing");

        // Initialize driver instance
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // Initialize the test with title and descirption
        test = reports.createTest("Clicking buttons", "Just clicks some buttons");
    }

    @Test
    public void test(){
        // Click button 1
        try{
            test.info("Step 1: Clicking on a button");
            WebElement userNameButton = driver.findElement(By.xpath("//input[@name='email']"));
            userNameButton.click();
            userNameButton.sendKeys("Aravind");
            test.pass("Input Entered Successfully");


        } catch (Exception e){
            test.fail("Input Not Entered Successfully"+e.getMessage());
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try{
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @AfterClass
    public void teardown(){
        driver.quit();
        reports.flush();
    }
}
