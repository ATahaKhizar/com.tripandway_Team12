package tests.US_01_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.driver;

public class US01_TC01_Zafer {

    @Test
    public void tripandwayTest(){

        // 1-Web sitesinin adresini yazınca web sitesine ulaşılabilmeli
        // 1-The website should be accessible when you type the address of the website

        Driver.getDriver().get("https://qa.tripandway.com");

        // 2-Web sitesindeki Title'ın görünür olduğu doğrulanabilmeli
        // 2-It can be verified that the Title on the website is visible

        String expectedTitle ="Tripandway";
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();
    }
}
