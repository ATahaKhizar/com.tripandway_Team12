package tests.US_01_08;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;




public class US01_TC01_Zafer extends TestBaseRapor {

    TripandwayPage tripandwayPages=new TripandwayPage();

    @Test
    public void tripandwayTest (){
        extentTest =extentReports.createTest("US_01 Web sayfası Testi ",
                "Kullanici web sitesine girebilmeli ve Titl'ı görebilmeli");

        // 1-Web sitesinin adresini yazınca web sitesine ulaşılabilmeli
        // 1-The website should be accessible when you type the address of the website

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");
        // 2-Web sitesindeki Title'ın görünür olduğu doğrulanabilmeli
        // 2-It can be verified that the Title on the website is visible

        String expectedTitle ="Tripandway";
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Title'ın gorunurlugu dogrulandi");
        Driver.closeDriver();
    }
}
