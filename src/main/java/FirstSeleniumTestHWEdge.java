import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTestHWEdge {
    WebDriver driver;
    @BeforeMethod

    public void setUp(){

        driver = new EdgeDriver();
        driver.navigate().to("https://github.com");
        driver.get("https://my.account.sony.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
    }
    @Test
    public void firstTest() {
        System.out.println("Edge opened");

    }
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();

    }
}