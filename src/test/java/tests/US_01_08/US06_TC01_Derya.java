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
import utilities.ReusableMethods;

import java.util.List;

public class US06_TC01_Derya {
    @Test
    public void Test01() throws InterruptedException {

        //RECENT POSTS YAZISININ GORUNUR OLDUGUNU DOGRULAMA

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Sayfanın Footer bölümüne inilir
        TripandwayPage tripandwayPages=new TripandwayPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);

        //Footer bölümündeki Recent Posts yazısının görünürlülüğü dogrulanır
        //Assert.assertTrue(tripandwayPage.recentPostsElementi.isDisplayed());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPages.recentPostsElementi.isDisplayed(),"Recent Posts görüntülenmedi");
        softAssert.assertAll();
    }

    @Test
    public void Test02() throws InterruptedException {

        //RECENT POSTS ALTINDAKİ ÖGELERİN GORUNDUGUNUN DOGRULANMASI

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);


        //Recent Posts altindaki bulunan ögelerin gorunurlugunu dogrulama

        SoftAssert softAssert=new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        for (WebElement each : list) {
            softAssert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
    }

    @Test
    public void Test03() throws InterruptedException {

        //RECENT POSTS ALTINDAKİ OGELERİN AKTIFLIGININ DOGRULANMASI

        //Sayfaya gidilir...
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(0).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
    }

    @Test
    public void Test04() throws InterruptedException {

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        SoftAssert softAssert=new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(1).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
    }

    @Test
    public void Test05() throws InterruptedException {

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        SoftAssert softAssert=new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(2).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
    }

    @Test
    public void Test06() throws InterruptedException {

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPage=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.recentPostsElementi);
        Thread.sleep(3000);
        SoftAssert softAssert=new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(3).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
    }

    @Test
    public void Test07() throws InterruptedException {

        //Sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Sayfanin footer bolumune inilir
        TripandwayPage tripandwayPages=new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPages.recentPostsElementi);
        Thread.sleep(3000);
        SoftAssert softAssert=new SoftAssert();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[@class='footer-item mt_30'])[3]/ul/li/a"));
        list.get(4).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));
    }
}
