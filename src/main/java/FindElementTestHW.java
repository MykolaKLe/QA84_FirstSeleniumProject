import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTestHW {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void findElementByTag(){
        WebElement p = driver.findElement(By.tagName("p"));
        System.out.println(p.getText());
        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getText());
        WebElement input = driver.findElement(By.tagName("input"));
        System.out.println(input.getText());
        WebElement img = driver.findElement(By.tagName("img"));
        System.out.println(img.getText());
    }
    @Test
    public void findElementById(){
        WebElement error = driver.findElement(By.id("dialog-notifications-error"));
        System.out.println(error.getAttribute("id"));
        WebElement success = driver.findElement(By.id("dialog-notifications-success"));
        System.out.println(success.getAttribute("id"));
        WebElement notification = driver.findElement(By.id("bar-notification"));
        System.out.println(notification.getAttribute("id"));
    }

    @Test
    public void findElementByClass(){
        WebElement footer = driver.findElement(By.className("footer"));
        System.out.println(footer.getAttribute("class"));
        WebElement close = driver.findElement(By.className("close"));
        System.out.println(close.getAttribute("class"));
        WebElement wrapper = driver.findElement(By.className("master-wrapper-main"));
        System.out.println(wrapper.getAttribute("class"));
    }
}