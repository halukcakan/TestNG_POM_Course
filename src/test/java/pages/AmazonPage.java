package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    /*
    this bu class'taki driver
    solundaki driver'dir
    parametresiz constructor -> obje olusturdugumuzda esitligin sag tarafindaki kisimdir
    bu sayafada ki driver'i @FindBy kullanabildik
     */

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;


}
