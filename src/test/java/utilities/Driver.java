package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private Driver(){
        /*Singleton pattern kullanilarak
        istenmeyen yöntemlerle driver objesine
        erisilmesini engelledik

        Constructer'i private yaparak bu classdan
        obje olusturularak class uyelerinin kullanilmasinin
        onune gectik.

         */

    }

    public static WebDriver getDriver() {

        String istenenBrowser = ConfigReader.getProperty("browser");


        if (driver == null) {



                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;

        }
    }
    public static void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;


        }




    }


}

