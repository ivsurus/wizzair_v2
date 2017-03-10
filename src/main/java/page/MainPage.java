package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends AbstractPage {

    @FindBy(id= "search-departure-station")
    private WebElement inputOriginName;

    @FindBy(id = "search-arrival-station")
    private WebElement inputDestinationName;

    @FindBy(id = "search-departure-date")
    private WebElement departureDateName;

    @FindBy(id = "search-return-date")
    private WebElement returnDateName;

    @FindBy(xpath = "//form[@name='flight-search']//button[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//ul[@class='navigation__container']/li[3]")
    private WebElement loginButton;




    public MainPage(WebDriver driver){
        super(driver);
    }

    public void goToSignInPage(){
        loginButton.click();
    }

    public void fillOrigin(String origin){
       // wait.waitForElementIsClickable(inputOriginName);
        inputOriginName.click();
        inputOriginName.sendKeys(origin);
        driver.findElement(By.xpath("//div[@id='flight-search']//strong[text()='Prague']")).click();
    }

    public void fillDestination(String destination){
        //wait.waitForElementIsClickable(inputDestinationName);
       // wait.until(ExpectedConditions.elementToBeClickable(inputDestinationName));
        inputDestinationName.click();
        inputDestinationName.sendKeys(destination);
        driver.findElement(By.xpath("//div[@id='flight-search']//strong[text()='Bari']")).click();
    }

    public void fillDepartureDate(int day) {
        departureDateName.click();
    }

    public void fillReturnDate(int day) {
        returnDateName.click();

    }

    public void search() {
        searchButton.click();
    }
}
