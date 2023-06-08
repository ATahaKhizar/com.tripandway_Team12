package tests.US_13_19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US14_TC01_Zubeyir extends TestBaseRapor {

    TripandwayPage tripandwayPage;

    @Test
    public void packagesSayfasiGorunurlukTesti() throws InterruptedException {

        extentTest = extentReports.createTest("'US14_TC01_ZUBEYIR' Kullanici Anasayfadaki 'Packages' Sekmesinin Gorunurluk Testi");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwayPage = new TripandwayPage();

        // Kullanici;
        // Trip and Way Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Trip and Way Anasayfaya gidildi.");

        // cookies' i ACCEPT butonuna basarak kabul eder.
        tripandwayPage.anasayfaCookiesElm.click();
        extentTest.info("Cookies kabul edildi");

        // Packages sekmesine gider ve Sekmenin acildigini dogrular.
        tripandwayPage.anasayfaPackagesElm.click();
        extentTest.info("'Packages' sekmesine gidildi");
        Assert.assertTrue(tripandwayPage.anasayfaPackagesElm.isDisplayed());
        extentTest.pass("'Packages' sekmesinin acildigi dogrulandi.");

        // Sayfada bulunan turlarin gorunurlugunu ve aktifligini dogrular.

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.ucDaysBuenosTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.onDaysBuenosTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.yediDaysIstanbulTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.ucDaysBangkokTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.yediDaysSalinaTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPage.besDaysCaliforniaTuruElm);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);

        extentTest.pass("'Packages' sekmesindeki tum turlarin gorunur ve aktif oldugu dogrulandi.");

        // Sayfayi kapatir.
        Driver.closeDriver();
    }
}
