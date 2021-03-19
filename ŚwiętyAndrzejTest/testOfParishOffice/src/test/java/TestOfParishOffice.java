import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeTest

{
    private WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafal\\Desktop\\ChromeDriver\\ChromeDriver89\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://andrzej-torun.pl");
    }

    @Test
    public void wikiTest()
    {
        Assert.assertEquals(driver.getTitle(), "Parafia pw. Andrzeja Apostoła w Toruniu");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[4]/a")).click();

        Assert.assertEquals(driver.getTitle(), "Biuro Parafialne");



    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
