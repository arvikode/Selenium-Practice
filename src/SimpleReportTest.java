import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
public class SimpleReportTest {
    // Declare the Web Driver here so that we can access it over the whole class
    WebDriver driver;

    // Declare ExtentReports instance to generate reports
    ExtentReports extentReport;

    // Declare ExtentTest instance to log test status
    ExtentTest extentTest;

    @BeforeClass
    public void Setup(){
        // Create a HTML report
        ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");

        // Initailize the extentReporter and attach it with the spark HTML file
        extentReport = new ExtentReports();
        extentReport.attachReporter(spark);

        // If the Chrome Driver path is not set use below.
//        System.setProperties("webdriver.chrome.driver", "path to chrome driver");
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // Initialize the extentTest with desired title and description
        extentTest = extentReport.createTest("Test", "Selectors Hub");
    }

    @Test
    public void tst(){
        String title = driver.getTitle();
        System.out.println(title);
        extentTest.pass("Title of the site: "+title);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

        // Write all the information
        extentReport.flush();
    }
}
