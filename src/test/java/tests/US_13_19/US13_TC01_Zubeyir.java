package tests.US_13_19;

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

public class US13_TC01_Zubeyir {

    TripandwayPage tripandwayPage;
    @Test
    public void destinationsGorunurlukTesti(){

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        tripandwayPage = new TripandwayPage();
        // Bu test methodundaki destinations paketleri 8 adet olup sayisi az oldugu icin,
        // SoftAssert yerine Assert test kullanildi.


        // Kullaniici;
        //Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Destinations sayfasına click yapar.
        tripandwayPage.destinationsElementi.click();

        // cookies' de ACCEPT butonuna basar.
        tripandwayPage.anasayfaCookiesElm.click();

        //Destinations sayfasının görünür oldugu doğrulanır
        Assert.assertTrue(tripandwayPage.destinationsYazisiElm.isDisplayed());


        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPage.californiaUSAElm);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn']/div/a"));

        for (WebElement each:list
             ) {
            Assert.assertTrue(each.isDisplayed());
            ReusableMethods.wait(1);
            System.out.println(each.getText());
        }

        Driver.closeDriver();
    }

    @Test
    public void destinationsPaketGorunurlukTesti() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        tripandwayPage = new TripandwayPage();

        // Kullaniici;
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        // cookies' de ACCEPT butonuna basar.
        tripandwayPage.anasayfaCookiesElm.click();

        // Destinations sayfasına click yapar.
        tripandwayPage.destinationsElementi.click();


        // Destinations sayfasi' nda bulunan paketlerin gorunurlugunu ve aktifligini doğrular
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn']/div/a"));

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

        Driver.closeDriver();

    }

}
