package tests.US_35_41;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.concurrent.ConcurrentHashMap;

public class US40_TC01_Nurettin extends TestBaseRapor {

    TripandwayPage tripandwayPage;

    SoftAssert softAssert;
    @Test
    public void test01(){

        // -- ADMİN SAYFASINDAKİ MENÜNÜN ALTINDA YER ALAN DARALTMA OK İŞARETİNİ TIKLAYIP ÇALIŞTIĞI DOĞRULANABİLMELİ
        extentTest=extentReports.createTest("US40_TC01 Test01", "-- ADMİN SAYFASINDAKİ MENÜNÜN ALTINDA YER ALAN DARALTMA OK İŞARETİNİ TIKLAYIP ÇALIŞTIĞI DOĞRULANABİLMELİ");


        // Admin anasayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Admin anasayfasına gidilir");

        tripandwayPage=new TripandwayPage();

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        extentTest.info("Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur");

        //Admin sayfasındaki menünün altında yer alan daraltma ok işaretine tıklanır (paneli daraltma)
        tripandwayPage.adminSolKenarDaraltmaOku.click();
        extentTest.info("Admin sayfasındaki menünün altında yer alan daraltma ok işaretine tıklanır (paneli daraltma)");

        //Daraltma ok işaretinin çalıştığının doğrulanması
        softAssert= new SoftAssert();
        softAssert.assertTrue(!tripandwayPage.adminAdminPanelText.isDisplayed(), "Daraltma ok işareti çalışmıyor");
        extentTest.info("Daraltma ok işaretinin çalışıp çalışmadığı test edilir");

        softAssert.assertAll();
        extentTest.pass("Daraltma ok işaretinin çalıştığı doğrulanır");

    Driver.closeDriver();
        extentTest.info("Driver kapatılır");




    }



}
