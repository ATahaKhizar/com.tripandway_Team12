package tests.US_35_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US40_TC02_Nurettin {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;
    @Test
    public void test01(){

        // -- ADMİN  SAYFASINDA ÜST KISIMDAKİ VİSİT WEBSİTE BUTONUNA TIKLAYARAK ÇALIŞTIĞI DOĞRULANABİLMELİ

        // Admin anasayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        String ilkSayfaWHD=Driver.getDriver().getWindowHandle();

        tripandwayPage=new TripandwayPage();

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        ReusableMethods.waitFor(2);

        //Admin sayfasında visit website linkine tıklanır
        tripandwayPage.adminVisitWebsiteLinki.click();
        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciWindowWHD= "";

        for (String eachWhd: whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                ikinciWindowWHD = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWindowWHD);

        String expectedTitle= "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert.assertEquals(expectedTitle,actualTitle, "Tripandway sitesine geçilemedi");

        softAssert.assertAll();
        Driver.quitDriver();


    }



}
