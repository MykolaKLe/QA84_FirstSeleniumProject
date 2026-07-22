import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        //driver.navigate().refresh(); //refresh = reload page
        driver.navigate().forward();


    }
    @Test
    public void firstTest(){
        System.out.println("Google opened");

    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit(); // close all tabs in browser
        //driver.close();// close only current tub in browser
}

}
