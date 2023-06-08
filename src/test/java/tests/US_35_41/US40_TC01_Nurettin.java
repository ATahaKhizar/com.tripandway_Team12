package tests.US_35_41;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.ConcurrentHashMap;

public class US40_TC01_Nurettin {

    TripandwayPage tripandwayPage;

    SoftAssert softAssert;
    @Test
    public void test01(){

        // -- ADMİN SAYFASINDAKİ MENÜNÜN ALTINDA YER ALAN DARALTMA OK İŞARETİNİ TIKLAYIP ÇALIŞTIĞI DOĞRULANABİLMELİ

        // Admin anasayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        tripandwayPage=new TripandwayPage();

        // Admin Login ekranında doğru kullanıcı adı ve şifre ile login olunur
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        ReusableMethods.waitFor(2);

        //Admin sayfasındaki menünün altında yer alan daraltma ok işaretine tıklanır (paneli daraltma)
        tripandwayPage.adminSolKenarDaraltmaOku.click();
        ReusableMethods.waitFor(2);

        //Daraltma ok işaretinin çalıştığının doğrulanması
        softAssert.assertTrue(!tripandwayPage.adminAdminPanelText.isDisplayed(), "Daraltma ok işareti çalışmıyor");

        softAssert.assertAll();

    Driver.closeDriver();




    }



}
