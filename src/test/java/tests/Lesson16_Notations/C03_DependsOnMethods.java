package tests.Lesson16_Notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_DependsOnMethods extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.amazon.com");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);

    }

    @Test (dependsOnMethods = "test01")
    public void test02() {

    }
}
