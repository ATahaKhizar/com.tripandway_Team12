package tests.US_01_08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Set;

public class US07_TC01_Derya extends TestBaseRapor {
    @Test
    public void Test01() throws InterruptedException {

        extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                "Kullanici sosyal medya ikonlarini gorebilmeli");

        //SOSYAL MEDYA IKONLARİNİN GORUNDUGUNU DOGRULAMA
        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);

        //Facebook butonunun görünürlüğü dogrulanır

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.faceBookElementi.isDisplayed());
        extentTest.pass("Kullanici facebook ikonunu görür.");

        Thread.sleep(3000);

        //Twitter butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.twitterElementi.isDisplayed());
        extentTest.pass("Kullanici twitter ikonunu görür.");
        Thread.sleep(3000);

        //Linkedln butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.linkedinElementi.isDisplayed());
        extentTest.pass("Kullanici linkedin ikonunu görür.");

        Thread.sleep(3000);

        //Pinterest butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.pinterestElementi.isDisplayed());
        extentTest.pass("Kullanici pinterest ikonunu görür.");

        Thread.sleep(3000);

        //Instagram butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.instagramElementi.isDisplayed());
        extentTest.pass("Kullanici instagram ikonunu görür.");
        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan tum testleri kapatir");
        Driver.closeDriver();

    }

    @Test
    public void Test02() throws InterruptedException {

        extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                "Kullanici sosyal medya ikonlarini aktif kullanir");

        //SOSYAL MEDYA IKONlARININ AKTIFLIGINI DOGRULAMA

        //Facebook butonunun aktifligini dogrulama
        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);

        //Facebook butonu seçilerek ilgili sayfaya gidilir
        tripandwayPage.faceBookElementi.click();
        extentTest.info("Facebook ikonuna tiklar");
        Thread.sleep(3000);

        //Facebook sayfasının görünürlüğü dogrulanır

        String mainHandle = Driver.getDriver().getWindowHandle();
        Set<String> allWindowHandles1 = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles1) {
            Driver.getDriver().switchTo().window(each);
            //System.out.println("Current title while switching windows :"+ Driver.getDriver().getTitle());

        }

        String expectedTitle1 = "Facebook";
        String actualTitle1 = Driver.getDriver().getTitle();

        System.out.println(expectedTitle1);
        System.out.println(actualTitle1);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualTitle1.contains(expectedTitle1), "Facebook adresine gitmedi");
        extentTest.pass("Kullanici Facebook adresine gider");
        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan tum testleri kapatir");
    }
        @Test
        public void Test03() throws InterruptedException {

            extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                    "Kullanici Twitter adresine gidebilmeli");

            //Twitter butonunun aktifliğini dogrulama
            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
            extentTest.info("Kullanici tripandway sayfasina gider");

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.twitterElementi);
            Thread.sleep(1000);

            //Twitter butonu seçilerek ilgili sayfaya gidilir
            tripandwayPage.twitterElementi.click();
            extentTest.info("Kullanici twitter ikonuna tiklar");
            Thread.sleep(3000);

            //Twitter sayfasının görünürlüğü dogrulanır
            String mainHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles2 = Driver.getDriver().getWindowHandles();

            for (String each : allWindowHandles2) {
                Driver.getDriver().switchTo().window(each);

            }

            String expectedTitle2 = "Keşfet/Twitter";
            String actualTitle2 = Driver.getDriver().getTitle();

            System.out.println(expectedTitle2);
            System.out.println(actualTitle2);
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(actualTitle2.contains(expectedTitle2), "Twitter sayfasina gitmedi");
            extentTest.pass("Kullanici twitter sayfasina gider");
            softAssert.assertAll();
            extentTest.pass("soft assert ile yapilan tum testleri kapatir");
        }

        @Test
        public void Test04() throws InterruptedException {
            extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                    "Kullanici Linkedin adresine gidebilmeli");

            //Linkedin butonunun aktifliğini dogrulama
            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
            extentTest.info("Kullanici tripandway sayfasina gider");

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.linkedinElementi);
            Thread.sleep(3000);

            //Linkedln butonu seçilerek ilgili sayfaya gidilir
            tripandwayPage.linkedinElementi.click();
            extentTest.info("Kullanici linkedin ikonuna tiklar");
            Thread.sleep(3000);

            //Linkedln sayfasının görünürlüğü dogrulanır
            String mainHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles3 = Driver.getDriver().getWindowHandles();

            for (String each : allWindowHandles3) {
                Driver.getDriver().switchTo().window(each);
            }

            String expectedUrl3 = "www.linkedin.com";
            String actualUrl3 = Driver.getDriver().getCurrentUrl();

            System.out.println(expectedUrl3);
            System.out.println(actualUrl3);
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(actualUrl3.contains(expectedUrl3));
            extentTest.pass("Kullanici Linkedin sayfasina tiklar");
            softAssert.assertAll();
            extentTest.pass("soft assert ile yapilan tum testleri kapatir");

        }

        @Test
        public void Test05() throws InterruptedException {
            extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                    "Kullanici Pinterest adresine gidebilmeli");

            //Pinterest butonunun aktifliğini dogrulama
            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
            extentTest.info("Kullanici tripandway sayfasina gider");

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.pinterestElementi);
            Thread.sleep(1000);
            tripandwayPage.pinterestElementi.click();
            extentTest.info("Kullanici pinterest ikonuna tiklar");
            Thread.sleep(3000);

            //Pinterest sayfasının görünürlüğü dogrulanır
            String mainHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles4 = Driver.getDriver().getWindowHandles();

            for (String each : allWindowHandles4) {
                Driver.getDriver().switchTo().window(each);
            }

            String expectedTitle4 = "Pinterest";
            String actualTitle4 = Driver.getDriver().getTitle();

            System.out.println(expectedTitle4);
            System.out.println(actualTitle4);
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(actualTitle4.contains(expectedTitle4), "Pinterest sayfasina gitmedi");
            softAssert.assertAll();
            extentTest.pass("soft assert ile yapilan tum testleri kapatir");
        }

        @Test
        public void Test06() throws InterruptedException {
            extentTest =extentReports.createTest("US_07 Footer Bölümü Sosyal Medya Testi ",
                    "Kullanici Instagram adresine gidebilmeli");

            //Instagram butonunun aktifliğini dogrulama
            // Sayfaya gidilir

            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
            extentTest.info("Kullanici tripandway sayfasina gider");

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.instagramElementi);
            Thread.sleep(3000);
            tripandwayPage.instagramElementi.click();
            extentTest.info("Kullanici instagram ikonuna tiklar");
            Thread.sleep(3000);

             //Instagram sayfasının görünürlüğü dogrulanır
             String mainHandle = Driver.getDriver().getWindowHandle();
             Set<String> allWindowHandles5 = Driver.getDriver().getWindowHandles();

             for (String each : allWindowHandles5) {
               Driver.getDriver().switchTo().window(each);
             }

             String expectedTitle5 = "Instagram";
             String actualTitle5 = Driver.getDriver().getTitle();

             System.out.println(expectedTitle5);
             System.out.println(actualTitle5);
             SoftAssert softAssert=new SoftAssert();
             softAssert.assertTrue(actualTitle5.contains(expectedTitle5), "Instagram sayfasina gitmedi");
             extentTest.pass("Kullanici Instagram sayfasina gider");
             softAssert.assertAll();
             extentTest.pass("soft assert ile yapilan tum testleri kapatir");
    }
    }


