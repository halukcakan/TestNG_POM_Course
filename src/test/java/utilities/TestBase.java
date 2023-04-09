package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {

    /*
    bu class'tan obje uretip ondan sonra kullanalimin onune gecmektir
     */

    protected WebDriver driver;

    /*

      protected veya public olmali
      protected daha dar kapsamli ve guvenlik aciklarini engeller
        sadece child class'lardan kullanacagim icin protected yaptik

     */

    @BeforeMethod
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
