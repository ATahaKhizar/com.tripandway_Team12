package tests.US_35_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US39_TC01_Nurettin {

    TripandwayPage tripandwayPage;

    SoftAssert softAssert;
    @Test
    public void test01(){

        //---ADMİN HESABI FOTOĞRAF DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//


        // Admin ana sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage= new TripandwayPage();
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();


        // Admin profil picture.na tıklanır
        tripandwayPage.adminProfilResmiLinki.click();


        // Dropdown menüden Change Photo linkine tıklanır
        tripandwayPage.adminChangePhotoLinki.click();


        // Fotoğraf değiştirme ekranın görüntüelendiğinin doğrulanması
        softAssert.assertTrue(tripandwayPage.adminEditPhotoText.isDisplayed(), "fotoğraf değiştirme ekranı görüntülenmedi");

        softAssert.assertAll();

        Driver.closeDriver();

    }
}
