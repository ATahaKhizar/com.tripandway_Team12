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

public class US22_TC01_TC02_Hilal {
    @Test (priority = 1)
    public void testCase01(){

        //Test Case 01 Şifremi değiştirebildiğimi doğrulayabilmeliyim

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));

        //Dashboard sayfasında Update Password Butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.updatePasswordButton.click();

        // Update Password yazısının görünürlüğü doğrulanır:
       ReusableMethods.waitForVisibility(tripandwaypage.updatePasswordYazisi,5);
       ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.updatePasswordYazisi);

        // New Password textbox'ına yeni şifre datası girilir, update butonuna basılır:

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(tripandwaypage.newPasswordTextbox)
                .sendKeys(ConfigReader.getProperty("loginGirisSifreHilal"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        // Şifre değişikliği doğrulanıır:

        ReusableMethods.waitForVisibility(tripandwaypage.basariliPasswordDegisikligiYazisi,5);
        ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.basariliPasswordDegisikligiYazisi);

    }
    @Test (priority = 2)
    public void TestCase02(){

        // Test Case 02 Şifremi unutursam şifremi unuttum linki ile
        // şifremi alabileceğimi doğrulayabilmeliyim...


        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.logoutButton.click();

        //Forget Password butonuna tıklanır:

        tripandwaypage.cookieButton.click();
        ReusableMethods.waitForVisibility(tripandwaypage.loginPageForgetPasswordButton,5);
        tripandwaypage.loginPageForgetPasswordButton.click();

        // Email Address textbox'ına ilgili mail datası girilir, Submit Butonuna tıklanır:

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(tripandwaypage.forgetPasswordPageEmailAddressTextbox)
                .sendKeys(ConfigReader.getProperty("loginEmailGirisHilal"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        // Email hesabına link gönderildiğine ilişkin yazının görünürlüğü doğrulanır:

       ReusableMethods.waitForVisibility(tripandwaypage.emailKontrolEtYazisi,5);
       ReusableMethods.assertElementisDisplayedMethod(tripandwaypage.emailKontrolEtYazisi);

        Driver.closeDriver();
    }
}
