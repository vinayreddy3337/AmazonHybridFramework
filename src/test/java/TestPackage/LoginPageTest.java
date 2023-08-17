package TestPackage;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    HomePage home;
    LoginPage login;
    LandingPage land;


    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        home=new HomePage(driver);
        login=new LoginPage(driver);
        login=home.clicklogin();

    }


    @Test(priority = 1)
    public void entermobile(){
        login.Number(prop.getProperty("number"));
        login.enterpass(prop.getProperty("password"));
        land= login.clicksubmit();
    }

}
