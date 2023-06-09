package tests.US_01_08;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US02_TC01_Zafer extends TestBaseRapor {
    @Test
    public void Test01() throws InterruptedException {

        extentTest =extentReports.createTest("US_02 Header Bölümü Testi ",
                "Kullanici ikonlari gorebilmeli ve tıklayabilmeli");

        // 1-Home Page sayfasının Header bölümündeki İletişim ve  E-mail bilgileri
        // görüntülenebilmeli, Registration ve Login butonları görüntülenebilmeli ve tıklanabilmeli
        // 1-Contact and E-mail information in the Header section of the Home Page page
        // can be viewed, the Registration and Login buttons can be viewed and clicked.

        // 1-Web sayfasına gidilir
        // 1-Go to the web page
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici tripandway sayfasina gider");
        // 2-Web sayfasının Header bölümüne gidilir
        // 2-Go to the Header section of the web page
        TripandwayPage tripandwayPage = new TripandwayPage();

        ReusableMethods.wait(2);

        // 3-İletişim bilgisinin görünür oldugu dogrulanır
        // 3-Verifies that contact information is visible
        Assert.assertTrue(tripandwayPage.kullaniciAnaSayfadakiNumara.isDisplayed());
        extentTest.pass("İletişim bilgisinin gorunur oldugu dogrulandi. ");
        // 4-e-mail bilgisinin görünür oldugu dogrulanır
        // 4-Verifies that the e-mail information is visible
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiEmail.isDisplayed());
        extentTest.pass("e-mail bilgisinin gorunur oldugu dogrulandi");
        // 5-Registration butonunun görünür olduğu doğrulanır
        // 5-Confirmation that the registration button is visible
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiRegistration.isDisplayed());
        extentTest.pass("Registration butonunun görünür olduğu doğrulandı");
        // 6-Registration butonunun tıklanabilir olduğu doğrulanır
        // 6-Confirmation that the registration button is active
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiRegistration.isEnabled());
        tripandwayPage.kullaniciAnasayfadakiRegistration.click();
        extentTest.info("Registration butonunun tıklanabilir olduğu doğrulandı");
        // 7-Login butonunun görünür olduğu doğrulanır
        // 7-Verify that the login button is visible
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiLogin.isDisplayed());
        extentTest.pass("Login butonunun görünür olduğu doğrulandı");
        // 8-Login butonunun tıklanabilir olduğu doğrulanır
        // 8-Verifies that the login button is clickable
        tripandwayPage.kullaniciAnasayfadakiLogin.click();
        extentTest.info("Login butonunun tıklanabilir olduğu doğrulandı");
        // 9-Anasayfa Logo Elementinin görünürlüğü doğrulanır
        // 9-The visibility of the Home Logo Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiLogo.isDisplayed());
        extentTest.pass("Anasayfa Logo Elementinin görünür olduğu doğrulandı");
        // 10-Anasayfa Logo Elementinin tıklanabilir olduğu doğrulanır
        // 10-Verify that the Homepage Logo Element is clickable
        tripandwayPage.tripandwayLogo.click();
        extentTest.info("Anasayfa Logo Elementinin tıklanabilir olduğu doğrulandı");
        // 11-Anasayfa Home Elementinin görünürlüğü doğrulanır
        // 11-The visibility of the Home Home Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiHome.isDisplayed());
        extentTest.pass("Anasayfa Home Elementinin görünür olduğu doğrulandı");
        // 12-Anasayfa Home Elementinin tıklanabilir olduğu doğrulanır
        // 12-Verify that the Home Element is clickable
        tripandwayPage.kullaniciAnasayfadakiHome.click();
        extentTest.info("Anasayfa Home Elementinin tıklanabilir olduğu doğrulandı");
        // 13-Anasayfa Services Elementinin görünürlüğü doğrulanır
        // 13-The visibility of the Home Services Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiServices.isDisplayed());
        extentTest.pass("Anasayfa Services Elementinin görünür olduğu doğrulandı");
        // 14-Anasayfa Services Elementinin tıklanabilir olduğu doğrulanır
        // 14-Verify that the Home Services Element is clickable
        tripandwayPage.kullaniciAnasayfadakiServices.click();
        extentTest.info("Anasayfa Services Elementinin tıklanabilir olduğu doğrulandı");
        // 15-Anasayfa Destinations Elementinin görünürlüğü doğrulanır
        // 15-The visibility of the Home Destinations Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiDestinations.isDisplayed());
        extentTest.pass("Anasayfa Destinations Elementinin görünür olduğu doğrulandı");
        // 16-Anasayfa Destinations Elementinin tıklanabilir olduğu doğrulanır
        // 16-Verify that the Home Destinations Element is clickable
        tripandwayPage.kullaniciAnasayfadakiDestinations.click();
        extentTest.info("Anasayfa Destinations Elementinin tıklanabilir olduğu doğrulandı");
        // 17-Anasayfa Packages Elementinin görünürlüğü doğrulanır
        // 17-The visibility of the Homepage Packages Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiPackages.isDisplayed());
        extentTest.pass("Anasayfa Packages Elementinin görünür olduğu doğrulandı");
        // 18-Anasayfa Packages Elementinin tıklanabilir olduğu doğrulanır
        // 18-Verify that the Homepage Packages Element is clickable
        tripandwayPage.kullaniciAnasayfadakiPackages.sendKeys(Keys.ENTER);
        extentTest.info("Anasayfa Packages Elementinin tıklanabilir olduğu doğrulandı");
        // 19-Anasayfa About Us Elementinin görünürlüğü doğrulanır
        // 19-Home About Us Element's visibility is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiAboutUs.isDisplayed());
        extentTest.pass("Anasayfa About Us Elementinin görünür olduğu doğrulandı");
        // 20-Anasayfa About Us Elementinin tıklanabilir olduğu doğrulanır
        // 20-Verify that the Home About Us Element is clickable
        tripandwayPage.kullaniciAnasayfadakiAboutUs.sendKeys(Keys.ENTER);
        extentTest.info("Anasayfa About Us Elementinin tıklanabilir olduğu doğrulandı");
        // 21-Anasayfa FAQ Elementinin görünürlüğü doğrulanır
        // 21-Home FAQ Element visibility verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiFaq.isDisplayed());
        extentTest.pass("Anasayfa FAQ Elementinin görünür olduğu doğrulandı");
        // 22-Anasayfa FAQ Elementinin tıklanabilir olduğu doğrulanır
        // 22-Home FAQ Verifies that the element is clickable
        tripandwayPage.kullaniciAnasayfadakiFaq.sendKeys(Keys.ENTER);
        extentTest.info("Anasayfa FAQ Elementinin tıklanabilir olduğu doğrulandı");
        // 23-Anasayfa Blog Elementinin görünürlüğü doğrulanır
        // 23-The visibility of the Homepage Blog Element is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiBlog.isDisplayed());
        extentTest.pass("Anasayfa Blog Elementinin görünür olduğu doğrulandı");
        // 24-Anasayfa Blog Elementinin tıklanabilir olduğu doğrulanır
        // 24-Verify that the Homepage Blog Element is clickable
        tripandwayPage.kullaniciAnasayfadakiBlog.sendKeys(Keys.ENTER);
        extentTest.info("Anasayfa Blog Elementinin tıklanabilir olduğu doğrulandı");
        // 25-Anasayfa Contact Elementinin görünürlüğü doğrulanır
        // 25-Home Contact Element visibility is verified
        Assert.assertTrue(tripandwayPage.kullaniciAnasayfadakiContact.isDisplayed());
        extentTest.pass("Anasayfa Contact Elementinin görünür olduğu doğrulandı");
        // 26-Anasayfa Contact Elementinin tıklanabilir olduğu doğrulanır
        // 26-Verify that the Home Contact Element is clickable
        tripandwayPage.kullaniciAnasayfadakiContact.sendKeys(Keys.ENTER);
        extentTest.info("Anasayfa Contact Elementinin tıklanabilir olduğu doğrulandı");
        Driver.closeDriver();
        extentTest.pass("kapatıldı");
    }
}
