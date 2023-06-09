package tests.US_13_19;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US16_TC01 {
    TripandwayPage tripandwayPage= new TripandwayPage();
    @Test
    public void Test01() {
        //Sık Sorulan Sorular sayfasının ulaşılabilir olduğunu doğrulamak


        //FAQ sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayFAQpageURL"));
        //FAQ sayfasının görünürlüğü doğrulanır
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.BannerKontrolElementi.isDisplayed(),"FAQ sayfası görüntülenmedi");
        softAssert.assertAll();

        /*Driver.closeDriver();*/




    }
}
