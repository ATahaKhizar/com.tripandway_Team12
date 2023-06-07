package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US35_TC01_AhmetY extends TestBaseRapor {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void allSubscriberGorunurlukTesti() {
        extentTest = extentReports.createTest("All Subscribers Testi",
                "Kullanici admin panel sayfasinda tum haber listesi uyelerini goruntuleyebilmeli");

        // 1-> Admin login sayfasina gidilir.Admin Login Url = https://qa.tripandway.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Kullanici Admin Panel sayfasina gider.");

        // 2-> Doğru e-posta ve şifre ile giriş yapılır. email="admin34@tripandway.com" password="123123123"

        tripandwayPage = new TripandwayPage();
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        extentTest.info("Email ve passwordunu dogru girerek giris yapar.");

        //3-> Admin paneli sayfasında olundugu doğrulanir.

        softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"),
                "Admin Panel sayfasinda degilsiniz");
        extentTest.pass("Admin Panel sayfasinda oldugunu dogrular.");

        // 4-> Subscriber(Haber Listesi) Linkine Tıklanır-All Subscribers seceneğinin gorundugu dogrulanır.

        tripandwayPage.subscriberLinki.click();
        softAssert.assertTrue(tripandwayPage.allSubscribersLinki.isDisplayed()
                ,"All Subscribers Linki görülemedi");

        softAssert.assertAll();
        extentTest.pass("Subscriber linkine tiklanip,All Subscribers elementinin gorundugu dogrulanir.");

        // 5-> Browser Kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
