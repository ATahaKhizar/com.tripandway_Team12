package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_TC01_AhmetY {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void test01() {
        // 1-> Admin login sayfasina gidilir.Admin Login Url = https://qa.tripandway.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        // 2-> Doğru e-posta ve şifre ile giriş yapılır. email="admin34@tripandway.com" password="123123123"

        tripandwayPage = new TripandwayPage();
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();

        //3-> Admin paneli sayfasında olundugu doğrulanir.

        softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"),
                "Admin Panel sayfasinda degilsiniz");

        // 4-> Subscriber(Haber Listesi) Linkine Tıklanır-All Subscribers seceneğinin gorundugu dogrulanır.

        tripandwayPage.subscriberLinki.click();
        softAssert.assertTrue(tripandwayPage.allSubscribersLinki.isDisplayed()
                ,"All Subscribers Linki görülemedi");


        softAssert.assertAll();
        Driver.closeDriver();
    }
}
