package tests.US_01_08;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;

public class US03_TC01_Emre extends TestBaseRapor {

        /*
        1-Bir ziyaretçi olarak Home page sayfasinin body bolumundeki
            fonksiyonlarin Gorunur ve Aktif oldugunu
            goruntuleyebildigimi dogrulayabilmeliyim
     */


    //TripandwayPage3 tripandwayPages=new TripandwayPage3();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
    @Test
    public void Test01() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        TripandwayPage tripandwayPages=new TripandwayPage();
        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");
        // Explore the world,the world is so beautiful,salina Island
        // gorunurluk ve aktiflik kontrolu
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //SoftAssert softAssert=new SoftAssert();
        Assert.assertTrue(tripandwayPages.exploreTheWorld.isDisplayed());
        Thread.sleep(2000);
        extentTest.pass("kullanici explore the world yazisini gorur");
        //Explore the world yazısı altındaki read more bolumunun gorunurlugu test edildi
        Assert.assertTrue(tripandwayPages.readMore.isDisplayed());
        Thread.sleep(2000);
        extentTest.pass("kullanici read more yazisini gorur");
        //read more bolumunun aktifligi dogrulanacak
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPages.readMore);
        //tripandwayPages.readMore.click();
        extentTest.info("kullanici read more butonunu tiklar");
        //sag yon tusunun gorunurlugunu dogrulama
        Driver.getDriver().navigate().back();
        Assert.assertTrue(tripandwayPages.sagYon.isDisplayed());
        extentTest.pass("kullanici sag yon butonunu gorur");
        jse.executeScript("arguments[0].scrollIntoView(true);"
                + "arguments[0].click()",tripandwayPages.sagYon);
        //tripandwayPages.sagYon.click();
        extentTest.info("kullanici sag yon butonunu tiklar");
        //the world yazisinin bulundugu sayfanin gorunurlugunu dogrulama
        Assert.assertTrue(tripandwayPages.theWorldIsSoBeautiful.isDisplayed());
        extentTest.pass("kullanici theworldısso yazisini gorur");
        // world ıs so beautiful sayfasindaki read more bolumunun gorunurlugunun testi
        tripandwayPages.theWorldReadMore.sendKeys(Keys.ENTER);
        extentTest.info("kullanici theworldread butonunu tiklar");
        Driver.getDriver().navigate().back();
        //sol yon tusunun gorunurlugunu dogrulama
        Assert.assertTrue(tripandwayPages.solYon.isDisplayed());
        extentTest.pass("kullanici sol yon butonunu gorur");
        tripandwayPages.solYon.click();
        //salina Island test edildi
        Assert.assertTrue(tripandwayPages.salinaIsland.isDisplayed());
        extentTest.pass("kullanici salinaIsland gorur");
        tripandwayPages.salinaReadMore.sendKeys(Keys.ENTER);
        extentTest.info("kullanici salina butonunu tiklar");
        Driver.getDriver().navigate().back();

    }
    @Test
    public void Test02() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        TripandwayPage tripandwayPages=new TripandwayPage();
        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","OUR SERVICES gorunumu ve aktifligi");
        // OUR SERVICES gorunumu ve fonksiyonlarinin gorunum ve aktifligi
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Accept butona tikla
        tripandwayPages.acceptButton.click();
        extentTest.info("kullanici accept butonunu tiklar");
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//h2[text()='Our Services']")));
        // our services basligi goruntuleme kontrolu
        Thread.sleep(2000);
        Assert.assertTrue(tripandwayPages.ourServices.isDisplayed());
        extentTest.pass("kullanici ourservices yazisini gorur");
        //js.executeScript("arguments[0].scrollIntoView();",
        // Driver.getDriver().findElement(By.xpath("//*[text()='Terms and Conditions']")));
        // ınternetional basligi goruntuleme dogrulamasi
        Assert.assertTrue(tripandwayPages.internationalTour.isDisplayed());
        extentTest.pass("kullanici international butonunu gorur");
        // international aktifligini(tiklanabilir) kontrol dogrulamasi
        tripandwayPages.internationalTour.click();
        extentTest.info("kullanici international butonunu tiklar");
        Thread.sleep(3000);
        //home page sayfasina geri geldik
        Driver.getDriver().navigate().back();
        //adventuretour sayfasinin gorunurluk kontrolu
        Assert.assertTrue(tripandwayPages.adventureTour.isDisplayed());
        extentTest.pass("kullanici adventureTour butonunu gorur");
        //aktifligini kontrol dogrulamasi
        tripandwayPages.adventureTour.click();
        extentTest.info("kullanici adventureTour butonunu tiklar");
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();
        //culturetour sayfasinin gorunurluk kontrolu
        Assert.assertTrue(tripandwayPages.cultureTour.isDisplayed());
        extentTest.pass("kullanici cultureTour butonunu gorur");
        //aktiflik kontrolu
        tripandwayPages.cultureTour.click();
        extentTest.info("kullanici cultureTour butonunu tiklar");
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        //bussiness tour sayfasinin gorunurluk kontrolu
        Assert.assertTrue(tripandwayPages.bussinessTour.isDisplayed());
        extentTest.pass("kullanici bussinessTour butonunu gorur");
        //aktiflik kontrolu
        tripandwayPages.bussinessTour.click();
        extentTest.info("kullanici bussinessTour butonunu tiklar");
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        //health tour sayfasinin gorunurluk kontrolu
        Assert.assertTrue(tripandwayPages.healthTour.isDisplayed());
        extentTest.pass("kullanici healthTour butonunu gorur");
        //aktiflik,tiklanma kontrolu
        tripandwayPages.healthTour.click();
        extentTest.info("kullanici ealthTour butonunu tiklar");
        Thread.sleep(3000);
        Driver.getDriver().navigate().back();
        //religious tour fonksiyonu gorunurluk kontrolu
        Assert.assertTrue(tripandwayPages.religiousTour.isDisplayed());
        extentTest.pass("kullanici religiousTour butonunu gorur");
        //aktiflik kontrolu
        tripandwayPages.religiousTour.click();
        extentTest.info("kullanici religiousTour butonunu tiklar");

    }
    @Test
    public void Test03() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        TripandwayPage tripandwayPages=new TripandwayPage();
        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","OUR SERVICES gorunumu ve aktifligi");
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        //Accept butona tikla
        //tripandwayPages.acceptButton.click();
        extentTest.info("kullanici cceptButton butonunu tiklar");
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//h2[text()='FEATURED PACKAGES']")));
        // FEATURED PACKAGES basligi goruntuleme
        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.featuredPackages.isDisplayed());
        extentTest.pass("kullanici featuredPackages butonunu gorur");
        //try{
        //  Assert.assertTrue(tripandwayPages.ucDaysinBuenos.isDisplayed());
        //Assert.assertTrue(tripandwayPages.onDaysinBuenos.isDisplayed());
        //Assert.assertTrue(tripandwayPages.ucDaysinBangkok.isDisplayed());
        //Assert.assertTrue(tripandwayPages.yediDaysinSalina.isDisplayed());
        //}catch (Exception e){
        //Assert.assertTrue(tripandwayPages.onDaysinBuenos.isDisplayed());
        //Assert.assertTrue(tripandwayPages.ucDaysinBangkok.isDisplayed());
        //Assert.assertTrue(tripandwayPages.yediDaysinSalina.isDisplayed());
        //}
        //wait.until(ExpectedConditions.visibilityOf(tripandwayPages.yediDaysinSalina)).isDisplayed();
        WebElement Island = Driver.getDriver().findElement(By.xpath("//*[text()='7 days in Salina Island']"));
        wait.until(ExpectedConditions.visibilityOf(Island)).isDisplayed();
        extentTest.pass("kullanici Island butonunu gorur");
        Assert.assertTrue(tripandwayPages.ucDaysinBangkok.isDisplayed());
        extentTest.pass("kullanici ucDaysinBangkok butonunu gorur");
        tripandwayPages.ucDaysinBangkok.click();
        extentTest.info("kullanici ucDaysinBangkok butonunu tiklar");
        String currentUrl="https://qa.tripandway.com/package/3-days-in-bangkok";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(currentUrl));
        //aktiflik kontrol
        //tripandwayPages.sagaKaydirma.click();
        //tripandwayPages.ucDaysinBuenos.click();
        Driver.closeDriver();
    }
}
