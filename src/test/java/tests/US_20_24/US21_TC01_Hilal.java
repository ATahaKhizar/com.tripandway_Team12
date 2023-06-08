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

public class US21_TC01_Hilal {
    @Test
    public void testCase01(){

        //Ödeme geçmişini görüntüleyebildiğimi doğrulayabilmeliyim...

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));

        // Payment History Butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.paymentHistoryButton.click();

        // Ödeme geçmişinin görünürlüğü doğrulanır:

        ReusableMethods.waitForVisibility(tripandwaypage.viewAllPaymentsYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.viewAllPaymentsYazisi);

        Driver.closeDriver();
    }
}
