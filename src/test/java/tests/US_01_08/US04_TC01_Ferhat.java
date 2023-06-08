package tests.US_01_08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US04_TC01_Ferhat extends TestBaseRapor {
    @Test
    public void Test01() throws InterruptedException {
        //FEATURED PACKAGES YAZISININ AKTIFLIGINI DOGRULAMA
        extentTest=extentReports.createTest("US_04 Featuret Packages Testi ","Kullanici featured Packages Yazisini Gorebilmeli");


        //sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info(" Kullanici tripandway sayfasina gider");

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage=new TripandwayPage();
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);

        Thread.sleep(2000);

        //Footer bölümündeki Featured Packages yazısının görünürlülüğü dogrulanır
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwayPage.featuredpackagesElementi.isDisplayed());
        extentTest.pass("Kullanici featured packages yazisini gorur");
        System.out.println(tripandwayPage.featuredpackagesElementi.getText());

        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan testleri kapatir");
    }

    @Test
    public void Test02() throws InterruptedException {

        //FEATURED PACKAGES ALTINDAKİ GORUNURLUGUNU DOGRULAMA
        extentTest = extentReports.createTest("US_04 Featured Packages Ogeleri Testi","Kullanici featured packages ogelerini gorebilmeli");


        //sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina girer");

        //Sayfanın Footer bölümüne gidilir
        TripandwayPage tripandwayPage=new TripandwayPage();
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);

        Thread.sleep(2000);

        //3 days in Buenos Aires butonunun görünürlülüğü dogrulanır
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tripandwayPage.three_days_in_buenos.isDisplayed());
        extentTest.pass("Kullanici 3 days in Buenos Aires butonunu gorur ");
        System.out.println(tripandwayPage.three_days_in_buenos.getText());

        //10 days in Buenos Aires butonun görünürlülüğünü dogrulanır
        softAssert.assertTrue(tripandwayPage.ten_days_in_buenos.isDisplayed());
        extentTest.pass("Kullanici 10 days in Buenos Aires butonunu gorur ");
        System.out.println(tripandwayPage.ten_days_in_buenos.getText());

        //3 days in Bangkok butonunun görünürlülüğü dogrulanır
        softAssert.assertTrue(tripandwayPage.three_days_in_bangkok.isDisplayed());
        extentTest.pass("Kullanici 3 days in Bangkok butonunu gorur ");
        System.out.println(tripandwayPage.three_days_in_bangkok.getText());

        //Salina Island butonunun görünürlülüğü dogrulanır
        softAssert.assertTrue(tripandwayPage.seven_days_in_salina_island.isDisplayed());
        extentTest.pass("Kullanici Salina Island butonunu gorur ");
        System.out.println(tripandwayPage.seven_days_in_salina_island.getText());

        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan testleri kapatir");



    }


    @Test
    public void Test03() throws InterruptedException {
        //FEATURED PACKAGES ALTINDAKİ OGELERIN AKTIFLIGINI DOGRULAMA
        extentTest = extentReports.createTest("US_04 Featured Packages Aktiflik Testi ","Kullanici fetarued packages altindaki ogeleri aktif kullanir");

        //sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina girer");

        //Sayfanın Footer bölümüne gidilir
        TripandwayPage tripandwayPage=new TripandwayPage();
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        extentTest.info("Kullanici tripanway sayfasina gider");
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);
        Thread.sleep(2000);

        //3 days in Buenos Aires  butonunu seçilerek  sayfaya gidilir
        tripandwayPage.three_days_in_buenos.click();
        extentTest.info("Kullanici 3 day in buenes butonunu tiklar ");


        Thread.sleep(2000);

        //3 days in Buenos Aires sayfasının görünürlüğü dogrulanır
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.featuredPackagesGirilenSayfaElementi.isDisplayed());
        extentTest.pass("Kullanici 3 days in Buenos Aires sayfasına erisim saglar");

        Thread.sleep(2000);

        //10 days in Buenos Aires butonu seçilerek ilgili sayfaya gidilir
        Driver.getDriver().navigate().back();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);
        Thread.sleep(2000);
        tripandwayPage.ten_days_in_buenos.click();
        extentTest.info("Kullanici 10 day in buenos butonunu tiklar");

        Thread.sleep(2000);

        //10 days in Buenos Aires sayfasının görünürlüğü dogrulanır
        softAssert.assertTrue(tripandwayPage.featuredPackagesGirilenSayfaElementi.isDisplayed());
        extentTest.pass("Kullanici 10 days in Buenos Aires sayfasına erisim saglar");
        Thread.sleep(2000);

        //3 days in Bangkok butonu seçilerek ilgili sayfaya gidilir
        Driver.getDriver().navigate().back();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);
        Thread.sleep(2000);
        tripandwayPage.three_days_in_bangkok.click();
        extentTest.info("Kullanici 3 day in bangkok butonunu tiklar");

        Thread.sleep(2000);

        //3 days in Bangkok sayfasının görünürlülüğü dogrulanır
        softAssert.assertTrue(tripandwayPage.featuredPackagesGirilenSayfaElementi.isDisplayed());
        extentTest.pass("Kullanici 3 days in Bangkok sayfasına erisim saglar");
        Thread.sleep(2000);

        //Salina Island butonu seçilerek ilgili sayfaya gidilir
        Driver.getDriver().navigate().back();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.featuredpackagesElementi);
        Thread.sleep(2000);
        tripandwayPage.seven_days_in_salina_island.click();
        extentTest.info("Kullanici Salina Island butonunu tiklar");
        Thread.sleep(2000);

        //Salina Island sayfasınn görünürlülüğü dogrulanır
        softAssert.assertTrue(tripandwayPage.featuredPackagesGirilenSayfaElementi.isDisplayed());
        extentTest.pass("Kullanici Salina Island sayfasına erisim saglar");
        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan testleri kapatir");

    }
}