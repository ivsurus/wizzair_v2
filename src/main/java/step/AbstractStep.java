package step;

import helper.FactoryDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public abstract class AbstractStep {

    protected WebDriver driver;
    protected Logger logger = Logger.getLogger("wizzairLogger");


    public AbstractStep(WebDriver driver) {
        this.driver = FactoryDriver.getInstance();
    }


    public void switchToNewTab() {
        String mainTabName = driver.getWindowHandle();
        for (String tabsName : driver.getWindowHandles()) {
            if (!tabsName.equals(mainTabName)) {
                driver.switchTo().window(tabsName);
            }
        }
    }
}
