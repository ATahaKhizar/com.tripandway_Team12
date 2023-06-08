package tests.US_09_12;

import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_12_TC01_burcu extends TestBaseRapor {
    @Test
    public void US_12(){
        Faker faker = new Faker();
        TripandwayPage tripandwayPage = new TripandwayPage();
        extentTest = extentReports.createTest("Tripandway Test","Kullanici Tripandway sayfasini aratabilmeli");

        // 1-Go to the site by typing the URL in the search bar
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici Tripandway sayfasina gidebilmeli");

        // 2-Click the accept button
        // WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//*[text()='ACCEPT']"));
        tripandwayPage.AcceptButton.click();
        extentTest.info("Accept buttona click yapabilmeli");

        //3-Click on the services button
        tripandwayPage.servicesBolum.click();
        extentTest.info("Services bolumune click yapabilmeli");

        //4-Test the visibility of the page
        Assert.assertTrue(tripandwayPage.servicesSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //5-Click on the adventure tour under the all services tab on this page
        tripandwayPage.internationalTour.click();
        extentTest.info("International Tour sekmesine click yapabilmeli");

        //6-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.internationalTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //7- Click on the adventure tour under the services tab
        tripandwayPage.adventureTour.click();
        extentTest.info("Adventure tour sekmesine click yapabilmeli");

        //8-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.adventureTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //9- Click on the cultural tour under the services
        tripandwayPage.cultureTourBolumu.sendKeys(Keys.ENTER);
        extentTest.info("Culture Tour sekmesine enter yapabilmeli");


        //10-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.cultureTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //11- Click on the business tour under the services tab
        tripandwayPage.bussinessTourBolumu.sendKeys(Keys.ENTER);
        extentTest.info("Bussiness Tour sekmesine enter yapabilmeli");

        //12-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.bussinessTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //13- Click on the health tour under the services tab
        tripandwayPage.healthTourBolumu.sendKeys(Keys.ENTER);
        extentTest.info("Health Tour sekmesine enter yapabilmeli");

        //14-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.healthTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");

        //15- Click on the religious tour under the services tab
        tripandwayPage.religiousBolumu.sendKeys(Keys.ENTER);
        extentTest.info("Religious Tour sekmesine enter yapabilmeli");

        //16-Verify the visibility of the page.
        Assert.assertTrue(tripandwayPage.religiousTourSayfaGorunurluk.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");






    }

}
