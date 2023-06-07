package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US37_TC03_AhmetY extends TestBaseRapor {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void profilBilgileriDegistirmeEkraniTesti(){

        extentTest = extentReports.createTest("Profil Degistirme Ekrani Testi",
                                              "Kullanici admin panel sayfasinda " +
                                               "admin hesabi profil bilgileri degistirme ekranini görebilmeli ");



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

        // 4-> admin34 (profil-foto) linkine tiklanir,Change Password ve Change Photo elementlerinin gorundugu dogrulanir.

        tripandwayPage.adminProfilResmiLinki.click();
        extentTest.info("Admin Panel sayfasinda oldugunu dogrular.");
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(tripandwayPage.adminChangePasswordLinki.isDisplayed()
                ,"!!!Change Password elementi goruntulenemedi");
        extentTest.pass("Change Password linkinin goruntulendigini dogrular.");

        softAssert.assertTrue(tripandwayPage.adminChangePhotoLinki.isDisplayed()
                ,"!!!Change Photo elementi goruntulenemedi");
        extentTest.pass("Change Photo linkinin goruntulendigini dogrular.");

        //5-> Change Password linkine tiklanir gidilen sayfanin Edit Profile elementini icerdigi dogrulanir.
        tripandwayPage.adminChangePasswordLinki.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(tripandwayPage.adminEditProfilText.isDisplayed()
                ,"!!!Profil bilgileri degistirme ekrani goruntulenemedi");
        extentTest.pass("Gidilen sayfada " +
                        "Profil bilgileri degistirme ekranını(Edit Profile) goruntulendigini dogrular.");

        softAssert.assertAll();
        extentTest.pass(">SoftAssert ile yapılan tüm testlerin sonucunu raporlar.");

        //8-> Browser Kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
