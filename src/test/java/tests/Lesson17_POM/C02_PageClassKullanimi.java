package tests.Lesson17_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void test01() {

        AmazonPage amazonPage = new AmazonPage();

        Driver.getDriver().get("https://www.amazon.com");

        amazonPage.searchBox.sendKeys("nutella" + Keys.ENTER);


    }
}
