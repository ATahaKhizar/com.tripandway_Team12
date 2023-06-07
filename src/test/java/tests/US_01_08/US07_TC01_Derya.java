package tests.US_01_08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class US07_TC01_Derya {
    @Test
    public void Test01() throws InterruptedException {

        //SOSYAL MEDYA IKONLARİNİN GORUNDUGUNU DOGRULAMA
        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);

        //Facebook butonunun görünürlüğü dogrulanır

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.faceBookElementi.isDisplayed());

        Thread.sleep(3000);

        //Twitter butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.twitterElementi.isDisplayed());

        Thread.sleep(3000);

        //Linkedln butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.linkedinElementi.isDisplayed());

        Thread.sleep(3000);

        //Pinterest butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.pinterestElementi.isDisplayed());

        Thread.sleep(3000);

        //Instagram butonunun görünürlüğü dogrulanır

        softAssert.assertTrue(tripandwayPage.instagramElementi.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();

    }

    @Test
    public void Test02() throws InterruptedException {

        //SOSYAL MEDYA IKONlARININ AKTIFLIGINI DOGRULAMA

        //Facebook butonunun aktifligini dogrulama
        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPage = new TripandwayPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);

        //Facebook butonu seçilerek ilgili sayfaya gidilir
        tripandwayPage.faceBookElementi.click();
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
        softAssert.assertAll();

        Driver.closeDriver();
    }
        @Test
        public void Test03() throws InterruptedException {

            //Twitter butonunun aktifliğini dogrulama

            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();

            //Twitter butonu seçilerek ilgili sayfaya gidilir

            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.twitterElementi);
            Thread.sleep(1000);
            tripandwayPage.twitterElementi.click();
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
            softAssert.assertAll();
            Driver.closeDriver();
        }

        @Test
        public void Test04() throws InterruptedException {
            //Linkedin butonunun aktifliğini dogrulama

            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

            //Sayfanın Footer bölümüne inilir

            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.linkedinElementi);
            Thread.sleep(3000);

            //Linkedln butonu seçilerek ilgili sayfaya gidilir
            tripandwayPage.linkedinElementi.click();
            Thread.sleep(3000);

            //Linkedln sayfasının görünürlüğü dogrulanır
            String mainHandle = Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandles3 = Driver.getDriver().getWindowHandles();

            for (String each : allWindowHandles3) {
                Driver.getDriver().switchTo().window(each);
            }

            String expectedTitle3 = "LinkedIn";
            String actualTitle3 = Driver.getDriver().getTitle();

            System.out.println(expectedTitle3);
            System.out.println(actualTitle3);
            Assert.assertTrue(actualTitle3.contains(expectedTitle3));
            Driver.closeDriver();
        }

        @Test
        public void Test05() throws InterruptedException {

            //Pinterest butonunun aktifliğini dogrulama

            //Sayfaya gidilir
            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.pinterestElementi);
            Thread.sleep(1000);
            tripandwayPage.pinterestElementi.click();
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
            Driver.closeDriver();
        }

        @Test
        public void Test06() throws InterruptedException {

        //Instagram butonunun aktifliğini dogrulama

       //Sayfaya gidilir

            Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

            //Sayfanın Footer bölümüne inilir
            TripandwayPage tripandwayPage = new TripandwayPage();


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.instagramElementi);
        Thread.sleep(3000);
        tripandwayPage.instagramElementi.click();
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

        softAssert.assertAll();
        Driver.closeDriver();


    }
    }


