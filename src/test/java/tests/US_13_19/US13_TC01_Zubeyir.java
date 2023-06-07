package tests.US_13_19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US13_TC01_Zubeyir {

    TripandwayPage tripandwayPage;
    @Test
    public void DestinationsSayfasiTesti(){

        tripandwayPage = new TripandwayPage();
        // Bu test methodundaki destinations paketleri 8 adet olup sayisi az oldugu icin,
        // SoftAssert yerine Assert test kullanildi.


        // Kullaniici;
        //Anasayfaya gider ve cookies' deki ACCEPT butonuna click yapar,
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //ReusableMethods.wait(5);
        tripandwayPage.anasayfaCookiesElm.click();

        //Destinations sayfasına click yapar.
        tripandwayPage.destinationsElementi.click();

        //Destinations sayfasının görünür oldugu doğrulanır
        Assert.assertTrue(tripandwayPage.destinationsYazisiElm.isDisplayed());

        //Destinations sayfası'nda bulunan paketlerin görünürlüğü doğrulanır
            // 'Bangkok,Thailand' paketi
            Assert.assertTrue(tripandwayPage.bangkokThailandPakElm.isDisplayed());

            // 'Greenville,South Carolina' paketi
            Assert.assertTrue(tripandwayPage.greenvilleSCPakElm.isDisplayed());

            // 'Buenos Aires,Argentina' paketi
            Assert.assertTrue(tripandwayPage.buenosAiresArgentinaPakElm.isDisplayed());

            // 'Marrakesh,Morocco' paketi
            Assert.assertTrue(tripandwayPage.marrakeshMoraccoElm.isDisplayed());

            // 'Salina Island,Italy' paketi
            Assert.assertTrue(tripandwayPage.salinaIslandItalyElm.isDisplayed());

            // 'Istanbul,Turkey' paketi
            Assert.assertTrue(tripandwayPage.istanbulTurkeyElm.isDisplayed());

            // 'California, USA' paketi
            Assert.assertTrue(tripandwayPage.californiaUSAElm.isDisplayed());

            // 'asfas' paketi
            Assert.assertTrue(tripandwayPage.asfasElementi.isDisplayed());


        //Destinations sayfası'nda bulunan paketler seçilerek ilgili sayfalara gidilir

        //Paketler ile ilgili sayfaların görünürlüğü doğrulanır




    }
}
