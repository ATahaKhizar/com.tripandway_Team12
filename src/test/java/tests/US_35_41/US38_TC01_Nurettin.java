package tests.US_35_41;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US38_TC01_Nurettin {
TripandwayPage tripandwayPage;
SoftAssert softAssert;
@Test
    public void test01(){
    //---ADMİN HESABI ŞİFRE DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//

    // Admin ana sayfasına gidilir
    Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

    // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
    tripandwayPage= new TripandwayPage();
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();


        // Admin profil picture.na tıklanır
        tripandwayPage.adminProfilResmiLinki.click();


        // Dropdown menüden Change Password tıklanır
        tripandwayPage.adminChangePasswordLinki.click();


        //Change password ekranında olduğu doğrualanır
    softAssert = new SoftAssert();
    String actualKelime=tripandwayPage.adminChangePasswordPage.getText();
    String expectedKelime="Change Password";
    softAssert.assertTrue(actualKelime.contains(expectedKelime), "Change Password görüntülenmedi");

    softAssert.assertAll();

    Driver.closeDriver();

    }

}