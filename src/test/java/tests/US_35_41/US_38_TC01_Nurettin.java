package tests.US_35_41;


import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_38_TC01_Nurettin {
TripandwayPage tripandwayPage= new TripandwayPage();
@Test
    public void test01(){
    //---ADMİN HESABI ŞİFRE DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//

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

        // Dropdown menüden Change Password tıklanır
        tripandwayPage.adminChangePasswordLinki.click();
        ReusableMethods.waitFor(3);

        Driver.closeDriver();

    }

}
