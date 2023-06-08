package tests.US_20_24;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US21_TC01_Hilal extends TestBaseRapor {
    @Test
    public void testCase01(){

        //Ödeme geçmişini görüntüleyebildiğimi doğrulayabilmeliyim...

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        extentTest =extentReports.createTest("US_21 Login odeme gecmisini dogrulama testi",
                                            "Kullanici odeme gecmisini goruntuleyebilmeli");

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));
        extentTest.info("Kullanici login oldu");

        // Payment History Butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.paymentHistoryButton.click();
        extentTest.info("Payment History Butonuna tiklandi");

        // Ödeme geçmişinin görünürlüğü doğrulanır:
        ReusableMethods.waitForVisibility(tripandwaypage.viewAllPaymentsYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.viewAllPaymentsYazisi);
        extentTest.pass("odeme gecmisinin görünürlügü dogrulandi:");
    }
}
