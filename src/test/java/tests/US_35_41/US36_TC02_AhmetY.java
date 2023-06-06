package tests.US_35_41;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US36_TC02_AhmetY {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;

    @Test
    public void sendEmailTesti() {

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

        //4-> Subscriber(Haber Listesi) Linkine Tıklanır-Send Email to Subscribers secenegine tıklanır.
        tripandwayPage.subscriberLinki.click();
        tripandwayPage.sendEmailSubscribersLinki.click();


        //5-> All subscribers butonunun göründügü dogrulanır.

        softAssert.assertTrue(tripandwayPage.allSubscribersButonu.isDisplayed()
                , "All Subscribers Butonu goruntulenemedi");

        //6-> Subject ve Message kutularina text gönderilip, .

        tripandwayPage.subjectTextKutusu.sendKeys("Merhaba Arkadaslar");
        tripandwayPage.messageTextKutusu.sendKeys("Calismalar Nasil Gidiyor");
        ReusableMethods.waitFor(2);

        // Send Email butonuna basılıp gonderim yapılır.
        tripandwayPage.sendEmailButonu.click();
        ReusableMethods.waitFor(2);

        //7-> Tüm Üyelere Mail başarılı gönderildi yazı elementi (Email is sent successfully to all subscribers!)
        softAssert.assertTrue(tripandwayPage.emailBasariliGonderildiYaziElementi.isDisplayed()
                , "Email is sent successfully to all subscribers! elementi goruntulenemedi");


        softAssert.assertAll();
        //8-> Browser Kapatilir.
        Driver.closeDriver();
    }
}
