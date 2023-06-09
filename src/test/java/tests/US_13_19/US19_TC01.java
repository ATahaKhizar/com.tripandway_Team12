package tests.US_13_19;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US19_TC01 {
    TripandwayPage tripandwayPage = new TripandwayPage();

    @Test
    public void Test01(){
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        tripandwayPage.homePageLoginElementi.click();
        tripandwayPage.kullaniciKayitEmailkutusu.sendKeys("Xerath2973@gmail.com");
        tripandwayPage.kullaniciKayitPasswordkutusu.sendKeys("Xerath.2973"+ Keys.TAB+Keys.ENTER);
        Assert.assertTrue(tripandwayPage.tripandwayLogo.isDisplayed());
        Driver.closeDriver();



    }
}
