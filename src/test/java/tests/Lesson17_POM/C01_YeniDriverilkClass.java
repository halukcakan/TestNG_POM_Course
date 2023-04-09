package tests.Lesson17_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverilkClass {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com");

        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();

        Driver.getDriver().get("https://www.bestbuy.com");

        Driver.closeDriver();
    }
}
