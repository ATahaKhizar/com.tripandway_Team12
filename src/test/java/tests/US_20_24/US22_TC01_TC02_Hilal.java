package tests.US_20_24;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US22_TC01_TC02_Hilal extends TestBaseRapor {
    @Test (priority = 1)
    public void testCase01(){

        //Test Case 01 Şifremi değiştirebildiğimi doğrulayabilmeliyim

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        extentTest =extentReports.createTest("US_22 Tripandway Login sifre guncelleme testi",
                                            "Kullanici sifresini guncelleyebilmeli");

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));
        extentTest.info("Kullanici login oldu");

        //Dashboard sayfasında Update Password Butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.updatePasswordButton.click();
        extentTest.info("Dashboard sayfasinda Update Password Butonuna tiklandi");

        // Update Password yazısının görünürlüğü doğrulanır:
        ReusableMethods.waitForVisibility(tripandwaypage.updatePasswordYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.updatePasswordYazisi);
        extentTest.pass("Update Password yazisinin gorunurlugu dogrulandi");

        // New Password textbox'ına yeni şifre datası girilir, update butonuna basılır:

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(tripandwaypage.newPasswordTextbox)
                .sendKeys(ConfigReader.getProperty("loginGirisSifreHilal"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("New Password textboxina yeni sifre datasi girilip update butonuna basildi");

        // Şifre değişikliği doğrulanıır:
        ReusableMethods.waitForVisibility(tripandwaypage.basariliPasswordDegisikligiYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.basariliPasswordDegisikligiYazisi);
        extentTest.pass("sifre degisikligi dogrulandi:");

    }
    @Test (priority = 2)
    public void TestCase02(){

        // Test Case 02 Şifremi unutursam şifremi unuttum linki ile
        // şifremi alabileceğimi doğrulayabilmeliyim...

        extentTest =extentReports.createTest("US_22 Tripandway sifremi unuttum linki ile sifre guncelleme testi",
                                            "Kullanıcı sifresini guncelleyebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("https://qa.tripandway.com sayfasina gidildi");

        // Login butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.loginButton.click();
        extentTest.info("Login butonuna tiklandi");

        //Forget Password butonuna tıklanır:
        tripandwaypage.cookieButton.click();
        ReusableMethods.waitForVisibility(tripandwaypage.loginPageForgetPasswordButton,5);
        tripandwaypage.loginPageForgetPasswordButton.click();
        extentTest.info("Forget Password butonuna tiklandi");

        // Email Address textbox'ına ilgili mail datası girilir, Submit Butonuna tıklanır:
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(tripandwaypage.forgetPasswordPageEmailAddressTextbox)
                .sendKeys(ConfigReader.getProperty("loginEmailGirisHilal"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Email Address textbox'ina ilgili mail datasi girilip Submit Butonuna tiklandi");

        // Email hesabına link gönderildiğine ilişkin yazının görünürlüğü doğrulanır:
        ReusableMethods.waitForVisibility(tripandwaypage.emailKontrolEtYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.emailKontrolEtYazisi);
        extentTest.pass("Email hesabina link gonderildigine iliskin yazinin gorunurlugu dogrulandi");
    }
}
