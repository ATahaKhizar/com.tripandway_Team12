package tests.US_20_24;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.tripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US22_TC01_Hilal {
    @Test
    public void testCase01(){

        //Şifremi değiştirebildiğimi doğrulayabilmeliyim

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        tripandwayPage tripandwaypage = new tripandwayPage();
        tripandwaypage.loginButton.click();

        Faker faker =new Faker();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(tripandwaypage.loginEmailTextbox)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        tripandwaypage.updatePasswordButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwaypage.updatePasswordYazisi.isDisplayed());

        actions.sendKeys(tripandwaypage.newPasswordTextbox)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        softAssert.assertTrue(tripandwaypage.basariliPasswordDegisikligiYazisi.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
