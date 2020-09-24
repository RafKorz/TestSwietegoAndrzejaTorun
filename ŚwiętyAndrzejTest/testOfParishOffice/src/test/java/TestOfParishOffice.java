import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestOfParishOffice {


        WebDriver driver = new ChromeDriver();

        @Before
        public void setUp()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafal\\IdeaProjects\\parishTestOffice\\src\\test\\java\\chromedriver.exe");

            driver.get("http://andrzej-torun.pl/");  // open page
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        }

        @Test()
        public void autoOfficeTest()
        {
            driver.findElement(By.cssSelector("#prawa > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
            Assert.assertTrue(Boolean.parseBoolean("Biuro parafialne czynne:"));
            Assert.assertTrue(Boolean.parseBoolean(" Kontakt pod numerem 725 481 830"));
            Assert.assertTrue(Boolean.parseBoolean("Adres: ul. Watzenrodego 14/13"));
        }

        @After
        public void tearDown()
        {
            driver.quit();
        }

}
