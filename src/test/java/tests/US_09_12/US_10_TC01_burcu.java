package tests.US_09_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_10_TC01_burcu extends TestBaseRapor {

    @Test
    public void US_10() {
        TripandwayPage tripandwayPage = new TripandwayPage();
        extentTest = extentReports.createTest("Tripandway Test", "Kullanici Tripandway sayfasini aratabilmeli");

        // 1-Go to the site by typing the URL in the search bar
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayURL"));
        extentTest.info("Kullanici Tripandway sayfasina gidebilmeli");
        // 2-Click the accept button
        // WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//*[text()='ACCEPT']"));
        tripandwayPage.AcceptButton.click();
        extentTest.info("Accept buttona click yapabilmeli");

        // 3-Drag the cursor to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();"
                , Driver.getDriver().findElement(By.xpath("//*[text()='Terms and Conditions']")));
        extentTest.info("Sayfayi asagi dogru surukleyebilmeli");

        //4-Click on the terms and conditions tab
        tripandwayPage.termsAndConditionsBolum.click();
        extentTest.info("Terms and Condition bolumune click yapabilmeli");

        //5-Visibility of the terms and conditions page is tested
        //SoftAssert softAssert = new SoftAssert();
        //softAssert.assertTrue(tripandwayPage.termsAndConditionsBolumGorunurlugu.isDisplayed());
        //extentTest.info("sayfanın gorunurlugunu dogrulayabilmli");
        //softAssert.assertAll();
        //extentTest.pass("soft assert ile yapilan tum testlerin sonucunu raporlar");

        Assert.assertTrue(tripandwayPage.termsAndConditionsBolumGorunurlugu.isDisplayed());
        extentTest.info("Sayfanin gorunurlugunu dogrulayabilmeli");


    }

}
