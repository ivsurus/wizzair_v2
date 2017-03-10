package step;


import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class LoginPageStep extends AbstractStep {

    private LoginPage loginPage;

    public LoginPageStep(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public LoginPageStep loginWizzAir(String email, String password){
        loginPage.fillEmailField(email);
        loginPage.fillPasswordField(password);
        loginPage.loginSubmit();
        logger.info("Login performed");
        return new LoginPageStep(driver);
    }
}
