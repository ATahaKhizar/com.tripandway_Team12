package tests.US_01_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class US05_TC01_Ferhat extends TestBaseRapor {

    @Test
    public void Test01() throws InterruptedException {
        // LATEST PACKAGES YAZISININ GORUNURLUGUNU DOGRULAMA
        extentTest=extentReports.createTest("US_05 Latest Packages Testi ","Kullanici latest Packages Yazisini Gorebilmeli");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info(" Kullanici tripandway sayfasina gider");


        // Sayfanın Footer bölümüne gidilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.featuredpackagesElementi);

        Thread.sleep(3000);

        // Footer bölümündeki Latest Packages yazısının görünürlülüğü dogrulanır
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwayPage.latestPackagesElementi.isDisplayed());
        System.out.println(tripandwayPage.latestPackagesElementi.isDisplayed());
        extentTest.pass("Kullanici latest packages yazisini gorur");

        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan testleri kapatir");

    }

    @Test
    public void Test02() throws InterruptedException {

        // LATEST PACKAGES ALTINDAKİ OGELERIN GORUNURLUGUNU DOGRULAMA
        extentTest = extentReports.createTest("US_05 Latest Packages Ogeleri Testi","Kullanici Latest packages ogelerini gorebilmeli");

        // sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripandway sayfasina girer");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        // LATEST PACKAGES altindaki ogelerin gorunurlugunu dogrulama

        SoftAssert softAssert = new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        for (WebElement each : list) {
            softAssert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
        extentTest.pass("Kullanici latest packages altindaki butun ogeleri gorur");
        softAssert.assertAll();
        extentTest.pass("Kullanici softassert ile tum sayfayi kapatir ");
    }


    @Test
    public void Test03() throws InterruptedException {
        // LATEST PACKAGES ALTINDAKİ OGELERIN AKTİFLİGİNİN DOGRULANMASİ
        extentTest = extentReports.createTest("US_05 Latest Packages Aktiflik Testi ","Kullanici latest packages altindaki ogeleri aktif kullanir");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripanway sayfasina gider");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        list.get(0).click();
        extentTest.info("Kullanici 1. ogeyi tiklar");
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        extentTest.pass("Latest Packages altindaki 1.ogenin aktifligi dogrulandi");
    }


    @Test
    public void Test04() throws InterruptedException {
        // LATEST PACKAGES ALTINDAKİ OGELERIN AKTİFLİGİNİN DOGRULANMASİ
        extentTest = extentReports.createTest("US_05 Latest Packages Aktiflik Testi ","Kullanici latest packages altindaki ogeleri aktif kullanir");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripanway sayfasina gider");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        list.get(1).click();
        extentTest.info("Kullanici 2. ogeyi tiklar");
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        extentTest.pass("Latest Packages altindaki 2.ogenin aktifligi dogrulandi");
    }


    @Test
    public void Test05() throws InterruptedException {
        // LATEST PACKAGES ALTINDAKİ OGELERIN AKTİFLİGİNİN DOGRULANMASİ
        extentTest = extentReports.createTest("US_05 Latest Packages Aktiflik Testi ","Kullanici latest packages altindaki ogeleri aktif kullanir");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripanway sayfasina gider");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        list.get(2).click();
        extentTest.info("Kullanici 3. ogeyi tiklar");
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        extentTest.pass("Latest Packages altindaki 3.ogenin aktifligi dogrulandi");
    }


    @Test
    public void Test06() throws InterruptedException {
        // LATEST PACKAGES ALTINDAKİ OGELERIN AKTİFLİGİNİN DOGRULANMASİ
        extentTest = extentReports.createTest("US_05 Latest Packages Aktiflik Testi ","Kullanici latest packages altindaki ogeleri aktif kullanir");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripanway sayfasina gider");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        list.get(3).click();
        extentTest.info("Kullanici 4. ogeyi tiklar");
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        extentTest.pass("Latest Packages altindaki 4.ogenin aktifligi dogrulandi");
    }


    @Test
    public void Test07() throws InterruptedException {
        // LATEST PACKAGES ALTINDAKİ OGELERIN AKTİFLİGİNİN DOGRULANMASİ
        extentTest = extentReports.createTest("US_05 Latest Packages Aktiflik Testi ","Kullanici latest packages altindaki ogeleri aktif kullanir");

        // Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));
        extentTest.info("Kullanici tripanway sayfasina gider");

        // Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.latestPackagesElementi);
        Thread.sleep(3000);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[2]/ul/li/a"));
        list.get(4).click();
        extentTest.info("Kullanici 5. ogeyi tiklar");
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("package"));
        extentTest.pass("Latest Packages altindaki 5.ogenin aktifligi dogrulandi");
    }

}