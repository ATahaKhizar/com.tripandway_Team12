package tests.US_01_08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US08_TC01_Derya extends TestBaseRapor {
    @Test
    public void Test01()  throws InterruptedException {

        //ADRES BİLGİLERİNİN GÖRÜNÜRLÜĞÜNÜ DOGRULAMA....
        extentTest =extentReports.createTest("US_08 Footer Bölümü Iletisim Bilgisi Testi",
                "Kullanici iletisim bilgilerini gorebilmeli");

        //Sayfaya gidilir...
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");

        //Sayfanın Footer bölümüne inilir..
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.addressElementi);
        Thread.sleep(3000);

        //Adres bilgisinin görünür oldugu dogrulanır......
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.adressBilgisi.isDisplayed());
        extentTest.pass("Adres bilgisinin gorunur oldugu dogrulandi. ");
        System.out.println(tripandwayPage.adressBilgisi.getText());
        Thread.sleep(3000);

        //Telefon bilgisinin görünür oldugu dogrulanır...
        softAssert.assertTrue(tripandwayPage.telefonBilgisi.isDisplayed());
        extentTest.pass("telefon bilgisinin gorunur oldugu dogrulandi");
        System.out.println(tripandwayPage.telefonBilgisi.getText());
        Thread.sleep(2000);

        //e-mail bilgisinin görünür oldugu dogrulanır
        softAssert.assertTrue(tripandwayPage.emailBilgisi.isDisplayed());
        extentTest.pass("email bilgisinin gorunur oldugu dogrulandi");
        System.out.println(tripandwayPage.emailBilgisi.getText());
        softAssert.assertAll();
        extentTest.pass("soft assert ile yapilan tum testleri kapatir");
        //Driver.closeDriver();
    }
}
