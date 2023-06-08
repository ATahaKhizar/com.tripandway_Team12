package tests.US_35_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US39_TC01_Nurettin extends TestBaseRapor {

    TripandwayPage tripandwayPage;

    SoftAssert softAssert;
    @Test
    public void test01(){

        //---ADMİN HESABI FOTOĞRAF DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//
        extentTest=extentReports.createTest("US39_TC01 Test01","--ADMİN HESABI FOTOĞRAF DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ");


        // Admin ana sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Admin ana sayfasına gidilir");

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage= new TripandwayPage();
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        extentTest.info("Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur");


        // Admin profil picture.na tıklanır
        tripandwayPage.adminProfilResmiLinki.click();
        extentTest.info("");


        // Dropdown menüden Change Photo linkine tıklanır
        tripandwayPage.adminChangePhotoLinki.click();
        extentTest.info("Admin profil picture.na tıklanır");


        // Fotoğraf değiştirme ekranının görüntülendiğinin doğrulanması
        softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.adminEditPhotoText.isDisplayed(), "fotoğraf değiştirme ekranı görüntülenmedi");
        extentTest.info("Fotoğraf değiştirme ekranının görüntülenip görüntülenmediğinin testi");

        softAssert.assertAll();
        extentTest.pass("Fotoğraf değiştirme ekranının görüntülendiği doğrulanır");

        Driver.closeDriver();
        extentTest.info("driver close yapılır");

    }
}
