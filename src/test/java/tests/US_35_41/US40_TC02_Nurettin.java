package tests.US_35_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US40_TC02_Nurettin extends TestBaseRapor {

    TripandwayPage tripandwayPage;
    SoftAssert softAssert;
    @Test
    public void test01(){

        // -- ADMİN  SAYFASINDA ÜST KISIMDAKİ VİSİT WEBSİTE BUTONUNA TIKLAYARAK ÇALIŞTIĞI DOĞRULANABİLMELİ
        extentTest=extentReports.createTest("US40_TC02 Test01", "-- ADMİN  SAYFASINDA ÜST KISIMDAKİ VİSİT WEBSİTE BUTONUNA TIKLAYARAK ÇALIŞTIĞI DOĞRULANABİLMELİ");

        // Admin anasayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Admin anasayfasına gidilir");

        tripandwayPage=new TripandwayPage();

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        extentTest.info("Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur");

        String ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        extentTest.info("ilk sayfa windowHandle değeri alınır");

        //Admin sayfasında visit website linkine tıklanır
        tripandwayPage.adminVisitWebsiteLinki.click();
        extentTest.info("Admin sayfasında visit website linkine tıklanır");

        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();

        String ikinciWindowWHD= "";
        for (String eachWhd: whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                ikinciWindowWHD = eachWhd;
            }
        }
        extentTest.info("ikinci sayfa windowHandle değeri alınır");

        Driver.getDriver().switchTo().window(ikinciWindowWHD);
        extentTest.info("ikinci sayfaya geçilir");


        String expectedTitle= "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert= new SoftAssert();
        softAssert.assertEquals(expectedTitle,actualTitle, "Tripandway sitesine geçilemedi");
        extentTest.info("Açılan yeni sekmede Tripandway sitesinde olunup olunmadığı test edilir");

        softAssert.assertAll();
        extentTest.pass("Visit Website linkinin çalıştığı ve Tripandway sitesinde olduğunun doğrulanması");

        Driver.quitDriver();
        extentTest.info("Quit Driver ile tüm driverlar kapatılır");


    }



}
