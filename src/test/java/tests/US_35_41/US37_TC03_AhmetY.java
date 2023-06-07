package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US37_TC03_AhmetY {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void profilBilgileriDegistirmeEkraniTesti(){


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

        // 4-> admin34 (profil-foto) linkine tiklanir,Change Password ve Change Photo elementlerinin gorundugu dogrulanir.

        tripandwayPage.adminProfilResmiLinki.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(tripandwayPage.adminChangePasswordLinki.isDisplayed()
                ,"!!!Change Password elementi goruntulenemedi");

        softAssert.assertTrue(tripandwayPage.adminChangePhotoLinki.isDisplayed()
                ,"!!!Change Photo elementi goruntulenemedi");

        //5-> Change Password linkine tiklanir gidilen sayfanin Edit Profile elementini icerdigi dogrulanir.
        tripandwayPage.adminChangePasswordLinki.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(tripandwayPage.adminEditProfilText.isDisplayed()
                ,"!!!Profil bilgileri degistirme ekrani goruntulenemedi");

        softAssert.assertAll();

        //8-> Browser Kapatilir.
        Driver.closeDriver();
    }
}
