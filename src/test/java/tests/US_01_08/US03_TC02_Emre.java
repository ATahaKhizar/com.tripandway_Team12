package tests.US_01_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.time.Duration;

public class US03_TC02_Emre extends TestBaseRapor {

    TripandwayPage tripandwayPages=new TripandwayPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test01() throws InterruptedException {

        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("kullanici sayfaya gider");
        //conterUp goruntulemesini dogrula

        Assert.assertTrue(tripandwayPages.conterUp.isDisplayed());
        extentTest.pass("kullanici conterup goruntuler ");

        //DESTINATION BOLUMU
        //destination goruntuleme
        tripandwayPages.acceptButton.click();
        extentTest.info("Kullanici accept butonunu tiklar");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//h2[text()='Destination']")));
        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.destination.isDisplayed());
        extentTest.pass("kullanici destination goruntuler ");
        //bangkok,thailand gorunurluk ve aktiflik kontrolu
        Assert.assertTrue(tripandwayPages.bangkokThailand.isDisplayed());
        extentTest.pass("kullanici bangkok goruntuler ");
        tripandwayPages.bangkokThailand.click();
        extentTest.info("Kullanici bangkok butonunu tiklar");
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.greenville.isDisplayed());
        extentTest.pass("kullanici greenville goruntuler ");
        tripandwayPages.greenville.click();
        extentTest.info("Kullanici bangkok butonunu tiklar");

        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        //buenos aires-argentina sayfasinin gorunurluk ve aktiflik kontrolu
        Assert.assertTrue(tripandwayPages.buenosAires.isDisplayed());
        extentTest.pass("kullanici buenosAires goruntuler ");
        tripandwayPages.buenosAires.click();
        extentTest.info("Kullanici buenosAires butonunu tiklar");
        Driver.getDriver().navigate().back();
        //marrakesh-sayfasinin gorunurluk ve aktiflik kontrolu
        wait.until(ExpectedConditions.visibilityOf(tripandwayPages.marrakesh));
        Assert.assertTrue(tripandwayPages.marrakesh.isDisplayed());
        extentTest.pass("kullanici marrakesh goruntuler ");
        tripandwayPages.marrakesh.click();
        extentTest.info("Kullanici marrakesh butonunu tiklar");
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Assert.assertTrue(tripandwayPages.salina.isDisplayed());
        extentTest.pass("kullanici salina goruntuler ");
        tripandwayPages.salina.click();
        extentTest.info("Kullanici salina butonunu tiklar");
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.istanbul.isDisplayed());
        tripandwayPages.istanbul.click();
        extentTest.info("Kullanici istanbul butonunu tiklar");
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Assert.assertTrue(tripandwayPages.seeAllDestination.isDisplayed());
        extentTest.pass("kullanici seeAll goruntuler ");
        Thread.sleep(1000);
        tripandwayPages.seeAllDestination.click();
        extentTest.info("Kullanici seeAll butonunu tiklar");
    }

    @Test
    public void Test02() throws InterruptedException {

        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("kullanici sayafaya gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",tripandwayPages.teamMembers);

        Thread.sleep(3000);

        Assert.assertTrue(tripandwayPages.teamMembers.isDisplayed());
        extentTest.pass("kullanici teamMem goruntuler ");
        Assert.assertTrue(tripandwayPages.jaxonGreen.isDisplayed());
        extentTest.pass("kullanici jaxonGreen goruntuler ");
        tripandwayPages.jaxonGreen.click();
        extentTest.info("Kullanici jaxonGreen butonunu tiklar");
        Driver.getDriver().navigate().back();
        Assert.assertTrue(tripandwayPages.averyJohnson.isDisplayed());
        extentTest.pass("kullanici averyJohn goruntuler ");
        tripandwayPages.averyJohnson.click();
        extentTest.info("Kullanici averyJohn butonunu tiklar");
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Assert.assertTrue(tripandwayPages.knoxMitchell.isDisplayed());
        tripandwayPages.knoxMitchell.click();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        wait.until(ExpectedConditions.visibilityOf(tripandwayPages.zaraWilliams));
        Assert.assertTrue(tripandwayPages.zaraWilliams.isDisplayed());
        extentTest.pass("kullanici zaraWilliam goruntuler ");
        tripandwayPages.zaraWilliams.click();
        extentTest.info("Kullanici zaraWilliam butonunu tiklar");

    }

    @Test
    public void Test03() throws InterruptedException {

        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("kullanici sayafaya gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//*[text()='Testimonial']")));

        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.testiMonial.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(tripandwayPages.johnsonShealey));
        Assert.assertTrue(tripandwayPages.johnsonShealey.isDisplayed());
        extentTest.pass("kullanici johnsonShealey goruntuler ");
        Thread.sleep(3000);
        Assert.assertTrue(tripandwayPages.davidSmith.isDisplayed());
        Thread.sleep(6000);
        Assert.assertTrue(tripandwayPages.stefenCarman.isDisplayed());
        extentTest.pass("kullanici stefenCarman goruntuler ");
        Thread.sleep(6000);
        Assert.assertTrue(tripandwayPages.jessicaRainy.isDisplayed());
    }

    @Test
    public void Test04() throws InterruptedException {

        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("kullanici sayafaya gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//h2[text()='Latest Blog']")));
        Thread.sleep(2000);
        Assert.assertTrue(tripandwayPages.latestBlog.isDisplayed());
        extentTest.pass("kullanici latesBlog goruntuler ");
        wait.until(ExpectedConditions.visibilityOf(tripandwayPages.istanbulAfusion));
        Assert.assertTrue(tripandwayPages.istanbulAfusion.isDisplayed());
        extentTest.pass("kullanici istanbulAfusion goruntuler ");
        wait.until(ExpectedConditions.visibilityOf(tripandwayPages.istanbulAfusion));
        tripandwayPages.istanbulAfusion.click();
        extentTest.info("kullanici istanbulAfusion gider");
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        Assert.assertTrue(tripandwayPages.discoverBogazKale.isDisplayed());
        tripandwayPages.discoverBogazKale.click();
        extentTest.info("kullanici bogazKale gider");
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Assert.assertTrue(tripandwayPages.aPerfectFamily.isDisplayed());
        extentTest.pass("kullanici aPerfectFamily goruntuler ");
        tripandwayPages.aPerfectFamily.click();
        Driver.getDriver().navigate().back();
        Thread.sleep(6000);
        //Assert.assertTrue(tripandwayPages.bangkokAcity.isDisplayed());
        //tripandwayPages.bangkokAcity.click();
    }

    @Test
    public void test05() throws IOException, InterruptedException {

        extentTest=extentReports.createTest("US_03 Home Page-Body Bolumu Test","Home Page butonlarinin aktifligi ve gorunurlugu");

        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("kullanici sayafaya gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",
                Driver.getDriver().findElement(By.xpath("//h2[text()='OUR CLIENT']")));

        Thread.sleep(1000);

        Assert.assertTrue(tripandwayPages.ourClient.isDisplayed());
        extentTest.pass("kullanici ourClient goruntuler ");
        WebElement sonucElementi=Driver.getDriver().findElement((By.xpath("(//div[@class='owl-stage-outer'])[6]")));
        String actualSonuc=sonucElementi.getText();
        ReusableMethods.getScreenshot(actualSonuc);
        extentTest.info("kullanici ekran resmini goruntuledi");


    }
}

