import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementInTable {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void findCssSelectorInTable() {

        List<WebElement> rows =
                driver.findElements(By.cssSelector("#customers tr"));

        System.out.println(rows.size());

        for (WebElement row : rows) {
            System.out.println(
                    row.getTagName() + " / " + row.getText()
            );
        }

        System.out.println(
                "************************************************************"
        );
        System.out.println();

        List<WebElement> tdElements =
                driver.findElements(By.cssSelector("#customers td"));

        System.out.println(tdElements.size());

        for (WebElement td : tdElements) {
            System.out.println(
                    td.getTagName() + " / " + td.getText()
            );
        }

        System.out.println(
                "************************************************************"
        );
        System.out.println();


        WebElement tr2 = driver.findElement(
                By.cssSelector("#customers tr:nth-child(2)")
        );

        System.out.println(tr2.getText());


        WebElement maria = driver.findElement(
                By.cssSelector(
                        "#customers tr:nth-child(2) td:nth-child(2)"
                )
        );

        System.out.println(maria.getText());
    }
}