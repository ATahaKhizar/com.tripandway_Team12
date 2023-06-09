package tests.US_13_19;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US18_TC01 {
    TripandwayPage tripandwayPage= new TripandwayPage();
    @Test
    public void test1()  {

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        tripandwayPage.kullaniciAnasayfadakiRegistration.click();
        tripandwayPage.kullaniciKayitIsimKutusu.sendKeys("Mehmet");
        tripandwayPage.kullaniciKayitEmailkutusu.sendKeys("Xerath2973@gmail.com");
        tripandwayPage.kullaniciKayitPasswordkutusu.sendKeys("Xerath.2973"+ Keys.TAB+Keys.ENTER);
        Driver.closeDriver();











    }

}
