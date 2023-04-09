package tests.Lesson16_Notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Priority extends TestBase {

    @Test (priority = 2)
    public void test01() {

        driver.get("https://www.amazon.com");

    }

    @Test (priority = 1)
    public void test02() {

        driver.get("https://www.bestbuy.com");

    }
}
