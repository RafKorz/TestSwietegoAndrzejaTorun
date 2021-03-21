import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation

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
    public void test()
    {
        Assert.assertEquals(driver.getTitle(), "Parafia pw. Andrzeja Apostoła w Toruniu");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/a[1]")).click();
        Assert.assertEquals(driver.getTitle(), "Aktualności");

        driver.findElement(By.xpath("//*[@id=\"all\"]/nav/a[2]")).click();
        Assert.assertEquals(driver.getTitle(), "Msze Święte");

        driver.findElement(By.xpath("//*[@id=\"all\"]/nav/a[3]")).click();
        Assert.assertEquals(driver.getTitle(), "Ogłoszenia Parafialne");

        driver.findElement(By.xpath("//*[@id=\"all\"]/nav/a[4]")).click();
        Assert.assertEquals(driver.getTitle(), "Intencje Mszalne");

        driver.findElement(By.xpath("//*[@id=\"all\"]/nav/a[5]")).click();
        Assert.assertEquals(driver.getTitle(), "Parafia pw. Andrzeja Apostoła w Toruniu");

        driver.findElement(By.xpath("//*[@id=\"all\"]/nav/a[5]")).click();
        Assert.assertEquals(driver.getTitle(), "Parafia pw. Andrzeja Apostoła w Toruniu");

        driver.findElement(By.cssSelector("#prawa > ul:nth-child(2) > li:nth-child(2) > a")).click();
        Assert.assertEquals(driver.getTitle(), "Harmonogram zajęć Centrum Aktywności Lokalnej");

        driver.findElement(By.cssSelector("#prawa > ul:nth-child(2) > li:nth-child(3) > a")).click();
        Assert.assertEquals(driver.getTitle(), "Realizowany projekt: Wspólnie możemy więcej");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Biuro Parafialne");

        driver.findElement(By.cssSelector("#prawa > ul:nth-child(2) > li:nth-child(5) > a")).click();
        Assert.assertEquals(driver.getTitle(), "Historia Parafii");
/*
        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");

        driver.findElement(By.xpath("")).click();
        Assert.assertEquals(driver.getTitle(), "");*/
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}