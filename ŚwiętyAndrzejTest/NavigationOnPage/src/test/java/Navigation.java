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

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[5]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Historia Parafii");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[6]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Rady parafialne");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[7]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Patron - św. Andrzej Apostoł");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[8]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Parafia zbudowana z różnorodnych wspólnot");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[9]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Sakramenty święte");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[10]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Duszpasterze");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[11]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Katechezy");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[12]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Kącik dla dzieci");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[13]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Dla młodzieży");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[14]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Seniorzy");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[1]/li[15]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Małżonkowie");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[2]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Koncepcja Świątyni i domu parafialnego");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[2]/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Drodzy Parafianie");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/ul[2]/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Wsparcie budowy kościoła");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/a/img")).click();;
        Assert.assertEquals(driver.getTitle(), "Parafia pw. Andrzeja Apostoła w Toruniu");
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
