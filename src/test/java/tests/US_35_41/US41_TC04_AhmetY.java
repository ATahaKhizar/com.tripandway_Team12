package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US41_TC04_AhmetY extends TestBaseRapor {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void logoutTesti() {

        extentTest = extentReports.createTest("Logout Testi",
                "Kullanici admin panel sayfasinda Logout linkine basip Site Ekranina gidebilmeli");

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

        //4-> admin34 (profil-foto) linkine tiklanir acilan alt sekmedeki Logout linkine tiklanir.
        tripandwayPage.adminProfilResmiLinki.click();
        ReusableMethods.waitFor(2);
        tripandwayPage.logoutLinki.click();
        extentTest.info("Kullanici Logout linkine tiklar.");
        ReusableMethods.waitFor(1);

        //5->  Gidilen sayfanin site ekranı (Title'inin Tripandway) oldugu dogrulanir.
        String expectedTitle = "Tripandway";
        //Gidilen sayfanin Title'i
        String actualTitle = Driver.getDriver().getTitle();

        softAssert.assertEquals(actualTitle, expectedTitle
                , "!!!Cıkıs yapıldıktan sonra gidilen sayfa, Site Sayfasi degil");
        extentTest.info("Gidilen sayfanin Title'inin Tripandway oldugunu dogrular.");


        softAssert.assertAll();

        extentTest.pass(">SoftAssert ile yapılan tüm testlerin sonucunu raporlar.");

        //6-> Browser Kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
