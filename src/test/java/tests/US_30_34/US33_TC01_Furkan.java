package tests.US_30_34;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Set;

public class US33_TC01_Furkan extends TestBaseRapor {

    @Test
    public void TC_01(){
        TripandwayPage tripandwayPage = new TripandwayPage();
        extentTest =extentReports.createTest("US_33 Tripandway Admin Login Test",
                "Admin log in admin dasboard page");

        // 1.Launch Browser
        // 2.Navigate to "admin url"
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Admin navigate to admin log in page");

        // 3.Log in with correct email and password and click login button
        tripandwayPage.adminLoginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminEmail"));
        tripandwayPage.adminLoginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty("tripandwayAdminPassword"));
        tripandwayPage.adminLoginSayfasiLoginButonu.click();
        extentTest.info("Admin sing up email and password and click log in button");

        // 4.Verify that admin dashboard page
        Assert.assertTrue(tripandwayPage.adminSayfasiDasboardPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to admin dasboard page");

        // 5.Click order
        tripandwayPage.adminSayfasiOrderPageTab.click();
        extentTest.info("Admin click order page tab");

        // 6.Verify that view orders page
        Assert.assertTrue(tripandwayPage.adminSayfasiOrdersDisplayed.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to orders page");

        // 7.Click one of the order details
        String ilkSayfaWHD= Driver.getDriver().getWindowHandle();
        tripandwayPage.adminSayfasiOrdersDetail.click();
        extentTest.info("Admin click order detail button");

        // 8.Verify that order ınformation
        Set<String> whDegerleriSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowWHD= "";

        for (String eachWhd: whDegerleriSet
        ) {

            if (!eachWhd.equals(ilkSayfaWHD)){
                ikinciSayfaWindowWHD = eachWhd;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWindowWHD);
        extentTest.info("Admin switch to windows");

        Assert.assertTrue(tripandwayPage.adminSayfasiOrderDetailDisplayed.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to orders detail page");

        // 9.Close browser
        Driver.quitDriver();

    }
}
