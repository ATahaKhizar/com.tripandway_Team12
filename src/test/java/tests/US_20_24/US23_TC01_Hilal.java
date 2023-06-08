package tests.US_20_24;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US23_TC01_Hilal extends TestBaseRapor {

    @Test
    public void testCase01(){

        // Kullanıcı çıkışı yapabildiğimi doğrulayabilmeliyim...

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        extentTest =extentReports.createTest("US_23 Kullanici cikis testi",
                                            "Kullanici Profil hesabından cikabilmeli");

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));
        extentTest.info("Kullanici login oldu");

        // Logout Butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.logoutButton.click();
        extentTest.info("Logout Butonuna tiklandi");

        //Çıkış yapıldığı doğrulanır:
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.letsGoTravelPicture);
        extentTest.pass("Kullanıcı cikisi yapildi");
    }
}
