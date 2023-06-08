package tests.US_01_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class US06_TC01_Derya extends TestBaseRapor {
    @Test
    public void Test01() throws InterruptedException {

        //RECENT POSTS YAZISININ GORUNUR OLDUGUNU DOGRULAMA
        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Testi ",
                "Kullanici recent posts yazisini gorebilmeli");

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);

        //Footer bölümündeki Recent Posts yazısının görünürlülüğü dogrulanır
        Assert.assertTrue(tripandwayPages.recentPostsElementi.isDisplayed());
        extentTest.pass("Recent Posts yazisinin gorunurlugu dogrulandi");

    }

    @Test
    public void Test02() throws InterruptedException {

        //RECENT POSTS ALTINDAKİ ÖGELERİN GORUNDUGUNUN DOGRULANMASI
        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Ogeleri Testi ",
                "Kullanici recent posts altindaki ogeleri gorebilmeli");

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);

        //Recent Posts altindaki bulunan ögelerin gorunurlugunu dogrulama
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        for (WebElement each : list) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
        extentTest.pass("Recent Posts altindaki yazilarin gorunurlugu dogrulandi.");

    }

    @Test
    public void Test03() throws InterruptedException {

        //RECENT POSTS ALTINDAKİ OGELERİN AKTIFLIGININ DOGRULANMASI
        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Posts aktiflik testi ",
                "Kullanici recent posts altindaki ilk ogenin aktif oldugunu dogrulamali.");

        //Sayfaya gidilir...
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(0).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        extentTest.pass("Recent Posts altindaki ilk ogenin aktifligi dogrulandi.");
    }

    @Test
    public void Test04() throws InterruptedException {
        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Posts aktiflik testi ",
                "Kullanici recent posts altindaki ikici ogenin aktif oldugunu dogrulamali.");
        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(1).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        extentTest.pass("Recent Posts altindaki ikinci ogenin aktifligi dogrulandi.");
    }

    @Test
    public void Test05() throws InterruptedException {

        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Posts aktiflik testi ",
                "Kullanici recent posts altindaki ucuncu ogenin aktif oldugunu dogrulamali.");

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //extentTest.info("Kullanici tripandway sayfasina gider");
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(2).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        extentTest.pass("Recent Posts altindaki ucuncu ogenin aktifligi dogrulandi.");
    }

    @Test
    public void Test06() throws InterruptedException {

        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Posts aktiflik testi ",
                "Kullanici recent posts altindaki dorduncu ogenin aktif oldugunu dogrulamali.");

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //extentTest.info("Kullanici tripandway sayfasina gider");
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPage=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(3).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        extentTest.pass("Recent Posts altindaki dorduncu ogenin aktifligi dogrulandi.");
    }

    @Test
    public void Test07() throws InterruptedException {

        extentTest =extentReports.createTest("US_06 Footer Bölümü Recent Posts aktiflik testi ",
                "Kullanici recent posts altindaki besinci ogenin aktif oldugunu dogrulamali.");

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //extentTest.info("Kullanici tripandway sayfasina gider");
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(4).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
        extentTest.pass("Recent Posts altindaki besinci ogenin aktifligi dogrulandi.");

    }
}