package tests.US_13_19;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US13_TC01_Zubeyir extends TestBaseRapor {


    TripandwayPage tripandwayPage;
    @Test
    public void destinationsGorunurlukTesti(){

        extentTest = extentReports.createTest("'US13_TC01_ZUBEYIR' Kullanici Anasayfadaki 'Destinations' Sekmesinin Gorunurluk Testi");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwayPage = new TripandwayPage();

        // Kullanici;
        // Trip and Way Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Trip and Way Anasayfaya gidildi.");

        // Destinations sekmesine click yapar.
        tripandwayPage.destinationsElementi.click();
        extentTest.info("'Destinations' sekmesine gidildi");

        // cookies' i ACCEPT butonuna basarak kabul eder.
        tripandwayPage.anasayfaCookiesElm.click();
        extentTest.info("Cookies kabul edildi");

        // Destinations sekmesinin gorunur oldugunu dogrular.
        Assert.assertTrue(tripandwayPage.destinationsYazisiElm.isDisplayed());
        extentTest.pass("'Destinations' sekmesinin gorunur oldugu dogrulandi.");

        // Sayfayi kapatir.
        Driver.closeDriver();
    }

    @Test
    public void destinationsPaketGorunurlukTesti() throws InterruptedException{

        extentTest = extentReports.createTest("'US13_TC01_ZUBEYIR' 'Destinations' Sekmesindeki Paketlerin Gorunurluk ve Aktiflik Testi");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwayPage = new TripandwayPage();

        // Kullanici;
        // Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Trip and Way anasayfaya gidildi.");

        // cookies' i ACCEPT butonuna basarak kabul eder.
        tripandwayPage.anasayfaCookiesElm.click();
        extentTest.info("Cookies kabul edildi");

        // Destinations sekmesine click yapar.
        tripandwayPage.destinationsElementi.click();
        extentTest.info("'Destinations' sekmesine gidildi");

        // Destinations sekmesi' nde bulunan paketlerin gorunurlugunu ve aktifligini doğrular.

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.bangkokThailandPakElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.greenvilleSCPakElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.buenosAiresArgentinaPakElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.marrakeshMoraccoElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.salinaIslandItalyElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.istanbulTurkeyElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("destination"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        extentTest.pass("'Destinations' sekmesindeki tum paketlerin gorunur ve aktif oldugu dogrulandi.");

        // Sayfayi kapatir.
        Driver.closeDriver();

    }
}
