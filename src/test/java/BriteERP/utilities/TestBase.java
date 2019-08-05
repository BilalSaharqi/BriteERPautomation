package BriteERP.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {


    public WebDriver driver;
    public Actions actions;

    @BeforeMethod
    public void setup(){


        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(ConfigurationReader.getProperty("url"));


    }


    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }







}