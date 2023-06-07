package tests.US_30_34;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US31_TC01_Furkan extends TestBaseRapor {

    @Test
    public void TC_01() {
        TripandwayPage tripandwayPage = new TripandwayPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());
        extentTest =extentReports.createTest("US_31 Tripandway Admin Login Test",
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

        // 5.Click packages
        tripandwayPage.adminSayfasiPackagesTab.click();
        extentTest.info("Admin click packages page tab");

        // 6.Verify that view packages page
        Assert.assertTrue(tripandwayPage.adminSayfasiPackagesPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to packages page");

        // 7.Click add new button
        tripandwayPage.adminSayfasiPackagesAddNewButton.click();
        extentTest.info("Admin click packages add new button");

        // 8.Verify that add pakage page
        Assert.assertTrue(tripandwayPage.adminSayfasiAddPackagePage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to add package page");

        // 9.Fill the box about new pakage and click submit button
        tripandwayPage.adminSayfasiPackageName.sendKeys(ConfigReader.getProperty("packageNameText"));
        tripandwayPage.adminSayfasiPackageSlug.sendKeys(ConfigReader.getProperty("packageSlugText"));

        String farkliKisim = System.getProperty("user.dir");
        String ayniKisim = "/src/test/java/tests/pexels-johannes-plenio-1435075.jpg";
        String dosyaYolu =farkliKisim + ayniKisim;

        tripandwayPage.adminSayfasiPackagePhoto.sendKeys(dosyaYolu);

        tripandwayPage.adminSayfasiPackageDescription.sendKeys(ConfigReader.getProperty("packageDescriptionText"));
        tripandwayPage.adminSayfasiPackageShortDescription.sendKeys(ConfigReader.getProperty("packageShortDescriptionText"));
        tripandwayPage.adminSayfasiPackageLocation.sendKeys(ConfigReader.getProperty("packageLocationText"));
        tripandwayPage.adminSayfasiPackageStartDate.sendKeys("2023/06/15");
        tripandwayPage.adminSayfasiPackageEndDate.sendKeys("2023/06/22");
        tripandwayPage.adminSayfasiPackageLastBookingDate.sendKeys("2023/06/22");
        tripandwayPage.adminSayfasiPackageMap.sendKeys(ConfigReader.getProperty("packageMapText"));
        tripandwayPage.adminSayfasiPackageItinerary.sendKeys(ConfigReader.getProperty("packageItineraryText"));
        tripandwayPage.adminSayfasiPackagePrice.sendKeys(ConfigReader.getProperty("packagePriceText"));
        tripandwayPage.adminSayfasiPackagePolicy.sendKeys(ConfigReader.getProperty("packagePolicyText"));
        tripandwayPage.adminSayfasiPackageTerms.sendKeys(ConfigReader.getProperty("packageTermsText"));
        tripandwayPage.adminSayfasiPackageIsFeatured.sendKeys(ConfigReader.getProperty("packageIsFeaturedText"));
        tripandwayPage.adminSayfasiPackageDestination.click();
        tripandwayPage.adminSayfasiPackageDescriptionBox.sendKeys("Team 12 Turk"+ Keys.ENTER);
        tripandwayPage.adminSayfasiPackageTitle.sendKeys(ConfigReader.getProperty("packageTitleText"));
        tripandwayPage.adminSayfasiPackageMetaDescription.sendKeys(ConfigReader.getProperty("packageMetaDescriptionText"));

        tripandwayPage.adminSayfasiPackageSubmitButton.click();
        extentTest.info("Admin fill the box and click submit button");

        // 10.Verify that "Package is added successfully!" is displayed
        Assert.assertTrue(tripandwayPage.adminSayfasiPackageAddSuccessfully.isDisplayed());
        extentTest.pass("Admin confirmed that add package succesfully");

        // 11.Click edit button of the new package
        tripandwayPage.adminSayfasiPackageSlButton.click();
        tripandwayPage.adminSayfasiPackageEditButton.click();
        extentTest.info("Admin click new package edit button");


        // 12.Change pakage name and click update button
        tripandwayPage.adminSayfasiPackageName.clear();
        tripandwayPage.adminSayfasiPackageName.sendKeys(ConfigReader.getProperty("packageNewNameText"));

        ReusableMethods.hover(tripandwayPage.adminSayfasiPackageUpdateButton);
        tripandwayPage.adminSayfasiPackageUpdateButton.click();
        extentTest.info("Admin click new package update button");

        // 13.Verify that "Package is updated successfully!" is displayed
        Assert.assertTrue(tripandwayPage.adminSayfasiPackageUpdatedSuccessfully.isDisplayed());
        extentTest.pass("Admin confirmed that package is updated successfully!");

        // 14.Click delete button of the new pakage
        tripandwayPage.adminSayfasiPackageSlButton.click();
        tripandwayPage.adminSayfasiPackageDeleteButton.click();
        extentTest.info("Admin click new package delete button");

        String expectedAlertYazisi = "Are you sure?";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();
        extentTest.pass("Admin confirmed that are you sure? in alert box");

        Assert.assertTrue(actualAlertYazisi.contains(expectedAlertYazisi));

        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Admin click alert accept button");

        // 15.Verify that "Package is deleted successfully!" is displayed
        Assert.assertTrue(tripandwayPage.adminSayfasiPackageDeleteSuccessfully.isDisplayed());
        extentTest.pass("Admin confirmed that package is deleted successfully!");

        // 16.Close browser
        Driver.closeDriver();

    }
}
