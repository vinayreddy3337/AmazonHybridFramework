package BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public BaseClass(){

        try{
            prop=new Properties();
            FileInputStream fi=new FileInputStream("/Users/innovapathinc/Desktop/Vinay Intellij/Flipkart Framework/" +
                    "src/main/java/ConfigPackage/Config.properties");
            prop.load(fi);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Initialization(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);



    }
}
