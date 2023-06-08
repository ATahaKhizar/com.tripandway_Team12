package tests.US_13_19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US15_TC01_Zubeyir extends TestBaseRapor {

    TripandwayPage tripandwayPage;

    @Test
    public void aboutUsSayfasiGorunurlukTesti(){

        extentTest = extentReports.createTest("'US15_TC01_ZUBEYIR' Kullanici Anasayfadaki 'About Us' Sekmesinin Gorunurluk Testi");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwayPage = new TripandwayPage();

        // Kullanici;
        // Trip and Way Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Trip and Way Anasayfaya gidildi.");

        // cookies' i ACCEPT butonuna basarak kabul eder.
        tripandwayPage.anasayfaCookiesElm.click();
        extentTest.info("Cookies kabul edildi");

        // About Us sekmesine gider.
        tripandwayPage.kullaniciAnasayfadakiAboutUs.click();
        extentTest.info("'About Us' sekmesine gidildi");

        // Sekmenin gorunurlugunu ve Sekme basliklarinin gorunurlugunu dogrular.
        Assert.assertTrue(tripandwayPage.aboutUsSayfasindakiYazilarElm.isDisplayed());
        extentTest.pass("'About Us' sekmesinin gorunurlugu ve sekme basliklarinin gorunurlugu dogrulandi.");

        // Sayfayi kapatir.
        Driver.closeDriver();
    }
}
