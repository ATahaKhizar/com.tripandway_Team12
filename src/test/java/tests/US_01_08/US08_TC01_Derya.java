package tests.US_01_08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.tripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US08_TC01_Derya {
    @Test
    public void Test01() throws InterruptedException {

        //ADRES BİLGİLERİNİN GÖRÜNÜRLÜĞÜNÜ DOGRULAMA....

        //Sayfaya gidilir...
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));

        //Sayfanın Footer bölümüne inilir..
        tripandwayPage tripandwayPage = new tripandwayPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", tripandwayPage.addressElementi);
        Thread.sleep(3000);

        //Adres bilgisinin görünür oldugu dogrulanır....g
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.adressBilgisi.isDisplayed());
        System.out.println(tripandwayPage.adressBilgisi.getText());
        Thread.sleep(3000);

        //Telefon bilgisinin görünür oldugu dogrulanır...
        softAssert.assertTrue(tripandwayPage.telefonBilgisi.isDisplayed());
        System.out.println(tripandwayPage.telefonBilgisi.getText());
        Thread.sleep(2000);

        //e-mail bilgisinin görünür oldugu dogrulanır
        softAssert.assertTrue(tripandwayPage.emailBilgisi.isDisplayed());
        System.out.println(tripandwayPage.emailBilgisi.getText());
        softAssert.assertAll();
    }
}
