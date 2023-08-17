package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {


        @FindBy(xpath = "//input[@type=\"email\"]")
        WebElement number;

        @FindBy(id ="continue")
        WebElement cont;

        @FindBy(xpath = "//input[@type=\"password\"]")
        WebElement pass;


        @FindBy(id ="signInSubmit")
        WebElement submit;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

        public void Number(String num){
        number.sendKeys(num);
        cont.click();
    }
        public void enterpass(String pwd){
        pass.sendKeys(pwd);

    }

        public LandingPage clicksubmit(){
        submit.click();
        return new LandingPage();
    }
}
