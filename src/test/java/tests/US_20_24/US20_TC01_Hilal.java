package tests.US_20_24;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US20_TC01_Hilal {
    @Test
    public void testCase01() {

        //Bir kullanıcı olarak login olduktan sonra profil
        // bilgilerimi düzenleyebildiğimi doğrulayabilmeliyim.

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));

        // Dashboard sayfasında Update Profile Butonuna Tıklanır.
        TripandwayPage tripandwaypage = new TripandwayPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwaypage.dashboardUpdateProfileButton.isDisplayed());
        tripandwaypage.dashboardUpdateProfileButton.click();

        // Kullanıcı bilgileri doldurulur.
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(tripandwaypage.updateProfileNameTextbox)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        // Profil bilgilerinin başarılı olarak güncellendiği doğrulanır (Toaster).
        softAssert.assertTrue(tripandwaypage.basariliDegisiklikYazisi.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();

    }
}
