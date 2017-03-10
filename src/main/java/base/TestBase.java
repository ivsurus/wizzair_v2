package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import helper.FactoryDriver;
import step.LoginPageStep;
import step.MainPageStep;


public class TestBase {

    protected WebDriver driver;
    protected Logger logger;
    protected LoginPageStep loginPageStep;
    protected MainPageStep mainPageStep;

    @BeforeMethod
    public void setUp() throws Exception {
        this.driver = FactoryDriver.getInstance();
        this.logger = Logger.getRootLogger();
        this.loginPageStep = new LoginPageStep(driver);
        this.mainPageStep = new MainPageStep(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
      // FactoryDriver.closeDriver();
      // driver.quit();
    }

}