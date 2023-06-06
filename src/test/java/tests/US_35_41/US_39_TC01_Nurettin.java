package tests.US_35_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_39_TC01_Nurettin {


    @Test
    public void test01(){

        //---ADMİN HESABI ŞİFRE DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//

        TripandwayPage tripandwayPage =new TripandwayPage();
        // Admin ana sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        ReusableMethods.waitFor(2);

        // Admin profil picture.na tıklanır
        tripandwayPage.adminProfilResmiLinki.click();
        ReusableMethods.waitFor(3);

        // Dropdown menüden Change Photo linkine tıklanır
        tripandwayPage.adminChangePhotoLinki.click();
        ReusableMethods.waitFor(2);

        // Fotoğraf değiştirme ekranın görüntüelendiğinin doğrulanması
        Assert.assertTrue(tripandwayPage.adminEditPhotoText.isDisplayed());
        // ...
        // ....

        Driver.closeDriver();

    }
}
