package tests.US_20_24;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_TC01_Hilal {

    @Test
    public void testCase01(){

        // Kullanıcı çıkışı yapabildiğimi doğrulayabilmeliyim...

        // https://qa.tripandway.com adresine gidilir:
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        TripandwayPage tripandwaypage = new TripandwayPage();

        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        tripandwaypage.loginButton.click();

        // Login sayfasında email ve password dataları girilir.
        Actions actions = new Actions(Driver.getDriver());
        actions.click(tripandwaypage.loginEmailTextbox)
                .sendKeys("hilal.12@yahoo.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1234qwer.")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        // Logout Butonuna tıklanır:
        SoftAssert softAssert = new SoftAssert();
        tripandwaypage.logoutButton.click();

        //Çıkış yapıldığı doğrulanır:
        softAssert.assertTrue(tripandwaypage.letsGoTravelPicture.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
