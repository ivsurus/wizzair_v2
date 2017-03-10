package page;

import helper.ExplicitWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public abstract class AbstractPage {

    WebDriver driver;
    protected ExplicitWait wait;
    protected Actions actions;
    protected Alert alert;


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new ExplicitWait(driver);
        actions = new Actions(this.driver);
    }
}
