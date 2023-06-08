package tests.US_20_24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US24_TC01_TC02_Hilal {
    @Test
    public void TestCase01(){

        //TestCase01_ Bir kullanıcı olarak login olduktan sonra
        //herhangi package seçip sepete ekleyebilmeliyim

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

        //Package butonuna tıklanır:
        tripandwaypage.packagesButton.click();

        //California Tatiline tıklanır:
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.californiaButonu);
        tripandwaypage.californiaButonu.click();

        // Book Your Seat Butonuna tıklanır:
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.bookYourSeatButton);
        tripandwaypage.bookYourSeatButton.click();
    }
    @Test
    public void TestCase02(){

        //TestCase02_ Ödeme yapabildiğimi doğrulayabilmeliyim...

        // Pay With Card Butonuna tıklanır:
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        TripandwayPage tripandwaypage = new TripandwayPage();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwaypage.payWithCardButton);
        tripandwaypage.payWithCardButton.click();

        // Card bilgileri girilir:
        Actions actions =new Actions(Driver.getDriver());
        actions.click(tripandwaypage.cardNumberTextbox)
                .sendKeys("4242 4242 4242 4242")
                .sendKeys(Keys.TAB)
                .sendKeys("12/34")
                .sendKeys(Keys.TAB)
                .sendKeys("567")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        // Ödemenin başarı ile yapıldığı doğrulanır:
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwaypage.basariliOdemeYapildiYazisi.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();

}
}
