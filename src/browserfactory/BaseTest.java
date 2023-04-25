package browserfactory;
/*
Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘Base Test’.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {


        public static String baseUrl =" https://www.saucedemo.com/";
        public static WebDriver driver;



        public static void openBrowser(String baseUrl){
            driver = new ChromeDriver();//launch the driver
            driver.get(baseUrl);//pass the baseUrl
            driver.manage().window().maximize();
            //Implicit TimeOut
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        public void closeBrowser(){
            //close all selenium instance browser
            driver.quit();
        }

    }


