package tests.US_35_41;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US38_TC01_Nurettin extends TestBaseRapor {
TripandwayPage tripandwayPage;
SoftAssert softAssert;
@Test
    public void test01(){
    //---ADMİN HESABI ŞİFRE DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ---//

   extentTest=extentReports.createTest("US38_TC01 TEST01", " *** ADMİN HESABI ŞİFRE DEĞİŞTİRME EKRANININ GÖRÜNTÜLENEBİLDİĞİ DOĞRULANABİLMELİ *** ");

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
        extentTest.info("Admin profil picture.na tıklanır");


        // Dropdown menüden Change Password tıklanır
        tripandwayPage.adminChangePasswordLinki.click();
         extentTest.info("Dropdown menüden Change Password tıklanır");


        //Change password ekranında olduğu doğrualanır
    softAssert = new SoftAssert();
    String actualKelime=tripandwayPage.adminChangePasswordPage.getText();
    String expectedKelime="Change Password";
    softAssert.assertTrue(actualKelime.contains(expectedKelime), "Change Password görüntülenmedi");

    extentTest.info("Change password ekranında olup olmadığı test edilir ");

    softAssert.assertAll();

    extentTest.pass("Change password ekranında olduğu doğrulanır");

    Driver.closeDriver();
    extentTest.info("driver close yapılır");

    }

}