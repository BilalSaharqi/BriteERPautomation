package BriteERP.tests;

import BriteERP.pages.LoginPage;
import BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class Login_Test extends TestBase {
    LoginPage loginPage = new LoginPage();



    @Test(priority = 1)
    public void test1(){
        loginPage.login();
    }




}