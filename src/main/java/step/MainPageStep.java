package step;


import org.openqa.selenium.WebDriver;
import page.MainPage;

public class MainPageStep extends AbstractStep{

    private MainPage mainPage;

    public MainPageStep(WebDriver driver) {
        super(driver);
        mainPage = new MainPage(driver);
    }

    public MainPageStep loginGo(){
        mainPage.goToSignInPage();
        return new MainPageStep(driver);
    }

    public MainPageStep fillCountries(String origin, String destination){
        mainPage.fillOrigin(origin);
        mainPage.fillDestination(destination);
        mainPage.search();
        return new MainPageStep(driver);
    }


}
