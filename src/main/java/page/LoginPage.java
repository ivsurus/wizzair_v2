package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    /*@FindBy(xpath = "//ul[@class='navigation__container']/li[3]")
    private WebElement signInButton;*/

    @FindBy(xpath = "//form[@name='login-form']//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//form[@name='login-form']//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//form[@name='login-form']//button[@type='submit']")
    private WebElement submitSingInButton;


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void loginSubmit(){
        submitSingInButton.click();
    }

  /*  public void openSignInForm()
    {
        signInButton.click();
    }*/

    public void fillEmailField(String email){
        emailField.sendKeys(email);
    }

    public void fillPasswordField(String password){
        passwordField.sendKeys(password);
    }

}
