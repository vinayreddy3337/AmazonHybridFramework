package TestPackage;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage home;
    LoginPage login;


    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        home=new HomePage(driver);
        login=new LoginPage(driver);
    }
    @Test
    public void clicklogin()
    {

        login=home.clicklogin();
    }
}
