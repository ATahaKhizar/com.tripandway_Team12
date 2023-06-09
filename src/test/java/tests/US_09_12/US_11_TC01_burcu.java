package tests.US_09_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_11_TC01_burcu extends TestBaseRapor {
    @Test
    public void US_11(){
        TripandwayPage tripandwayPage = new TripandwayPage();
        extentTest = extentReports.createTest("Tripandway Test","Kullanici Tripandway sayfasini aratabilmeli");

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
                , Driver.getDriver().findElement(By.xpath("//*[text()='Privacy Policy']")));
        extentTest.info("Sayfayi asagi dogru surukleyebilmeli");

        //4-click on privacy policy page
        tripandwayPage.privacPolicyBolum.click();
        extentTest.info("Privac Policy bolume click yapabilmeli");

        // 5-Verifies that the page is visible
        Assert.assertTrue(tripandwayPage.privacPolicyBolumGorunurlugu.isDisplayed());
        extentTest.pass("Sayfanin gorunurlu dogrulandi");

    }
}
