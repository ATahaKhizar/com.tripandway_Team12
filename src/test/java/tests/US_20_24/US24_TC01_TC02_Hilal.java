package tests.US_20_24;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US24_TC01_TC02_Hilal extends TestBaseRapor {
    @Test (priority = 1)
    public void TestCase01(){

        //TestCase01_ Bir kullanıcı olarak login olduktan sonra
        //herhangi package seçip sepete ekleyebilmeliyim

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        extentTest =extentReports.createTest("US_24 Tripandway Login odeme testi",
                                            "Kullanici Profil Bilgilerini guncelleyebilmeli");

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));
        extentTest.info("Kullanici login oldu");

        //Package butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.packagesButton.click();
        extentTest.info("Package Butonuna tiklandi");

        //California Tatiline tıklanır:
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwaypage.cookieButton.click();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.californiaButonu);
        ReusableMethods.waitForVisibility(tripandwaypage.californiaButonu,5);
        tripandwaypage.californiaButonu.click();
        extentTest.info("California Tatiline tiklandi");

        // Book Your Seat Butonuna tıklanır:
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.bookYourSeatButton);
        ReusableMethods.waitForClickablility(tripandwaypage.bookYourSeatButton,5);
        tripandwaypage.bookYourSeatButton.click();
        extentTest.info("Book Your Seat Butonuna tiklandi");
    }

    @Test (priority = 2)
    public void TestCase02(){

        //TestCase01_ Bir kullanıcı olarak login olduktan sonra
        //herhangi package seçip sepete ekleyebilmeliyim

        // https://qa.tripandway.com adresine gidilir:
        // Kullanıcı girişi yapmak için login butonuna tıklanır:
        // Login sayfasında email ve password dataları girilir.

        extentTest =extentReports.createTest("US_24 Tripandway Login odeme testi",
                                            "Kullanici Profil Bilgilerini guncelleyebilmeli");

        ReusableMethods.loginMethod(ConfigReader.getProperty("loginEmailGirisHilal"),ConfigReader.getProperty("loginGirisSifreHilal"));
        extentTest.info("Kullanici login oldu");

        //Package butonuna tıklanır:
        TripandwayPage tripandwaypage = new TripandwayPage();
        tripandwaypage.packagesButton.click();
        extentTest.info("Package Butonuna tıklandi");

        //California Tatiline tıklanır:
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwaypage.cookieButton.click();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.californiaButonu);
        ReusableMethods.waitForVisibility(tripandwaypage.californiaButonu,5);
        tripandwaypage.californiaButonu.click();
        extentTest.info("California Tatiline tiklandi");

        // Book Your Seat Butonuna tıklanır:
        jse.executeScript("arguments[0].scrollIntoView();", tripandwaypage.bookYourSeatButton);
        ReusableMethods.waitForClickablility(tripandwaypage.bookYourSeatButton,5);
        tripandwaypage.bookYourSeatButton.click();
        extentTest.info("Book Your Seat Butonuna tiklandi");

        //TestCase02_ Ödeme yapabildiğimi doğrulayabilmeliyim...
        // Pay With Card Butonuna tıklanır:

        ReusableMethods.clickWithJS(tripandwaypage.payWithCardButton);
        ReusableMethods.waitForClickablility(tripandwaypage.payWithCardButton,5);
        extentTest.info("Pay With Card Butonuna tiklandi");

        // Card bilgileri girilir:
        WebElement iFrameElement = Driver.getDriver().findElement(By.xpath("//iframe[@class='stripe_checkout_app']"));
        Driver.getDriver().switchTo().frame(iFrameElement);
        ReusableMethods.wait(5);
        Actions actions =new Actions(Driver.getDriver());
        actions.click(tripandwaypage.cardNumberTextbox)
                .sendKeys(ConfigReader.getProperty("crediCardNumber"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("crediCardSkt"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("crediCardCvc"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Card bilgileri girildi");

        // Ödemenin başarı ile yapıldığı doğrulanır:
        ReusableMethods.wait(5);
        String expectedUrl = "https://qa.tripandway.com/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedUrl);
        extentTest.pass("odemenin basari ile yapildigi dogrulandi");
}
}
