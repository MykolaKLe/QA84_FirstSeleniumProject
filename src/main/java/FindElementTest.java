import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void findElementByTag(){
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());
        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getAttribute("class"));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());



    }
    @Test
    public void findElementById(){
       WebElement city = driver.findElement(By.id("city"));
        System.out.println(city.getAttribute("id"));
    }
    @Test
    public void findElementByClassName(){
        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        WebElement description = driver.findElement(By.className("description"));
        System.out.println(description.getText());
    }
    @Test
    public void findElementByCssSelector(){
        //driver.findElement(By.tagName("h1"));
        //tagName -> "h1"
        //css -> "h1"
        driver.findElement(By.cssSelector("h1"));

        //driver.findElement(By.id("city"));
        //id->"city"
        //css-> "#city"
        driver.findElement(By.cssSelector("#city"));

        //driver.findElement(By.className("telephone"));
        // className ->"telephone"
        // css -> ".telephone"
        driver.findElement(By.cssSelector(".telephone"));

        // [attr='par']
        WebElement element = driver.findElement(By.cssSelector("[hrer='/search]"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.cssSelector("[for ='city']"));
        System.out.println(element1.getText());

        driver.findElement(By.cssSelector("[href*='car']"));

        driver.findElement(By.cssSelector("[href^='/terms']"));

        driver.findElement(By.cssSelector("[href$='work']"));

        driver.findElement(By.cssSelector("a.navigation-link[href='/search']"));

        driver.findElement(By.cssSelector("div.social-networks"));

        driver.findElement(By.cssSelector(".logo>img"));

        driver.findElement(By.cssSelector(".feedback-card .feedback-date"));

        WebElement feedback = driver.findElement(By.cssSelector(".feedback-card:nth-child(5)"));
        System.out.println(feedback.getText());

    }
}
