package BriteERP.pages;

import BriteERP.utilities.ConfigurationReader;
import BriteERP.utilities.Driver;
import BriteERP.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public WebDriver driver = Driver.getDriver();

public  LoginPage(){
    PageFactory.initElements(driver, this);
}


    @FindBy(css = "input[name='login']")
    public WebElement usernameLocator;

    @FindBy(css = "input[type=password]#password")
    public WebElement passwordLocator;

    @FindBy(css = "button[type=submit]")
    public WebElement submitLocator;

    @FindBy(xpath = "//p[@class='alert alert-danger'][contains(text(),'Wrong login/password')]")
    public WebElement errorLocator;





    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        usernameLocator.sendKeys(username);
        passwordLocator.sendKeys(password);
        submitLocator.click();
    }





}
