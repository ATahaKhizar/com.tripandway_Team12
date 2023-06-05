package tests.US_30_34;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.tripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US30_TC01 extends TestBaseRapor {

    @Test
    public void TC_01(){
        tripandwayPage tripandwayPage = new tripandwayPage();
        extentTest =extentReports.createTest("US_30 Tripandway Admin Login Test",
                                            "Admin log in admin dasboard page");

        // 1.Launch Browser
        // 2.Navigate to "tripandwayAdminURL"
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));
        extentTest.info("Admin navigate to admin log in page");

        // 3.Log in with correct email and password and click login button
        tripandwayPage.adminEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail"));
        tripandwayPage.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        tripandwayPage.adminLoginButton.click();
        extentTest.info("Admin sing up email and password and click log in button");

        // 4.Verify that admin dashboard page
        Assert.assertTrue(tripandwayPage.adminDasboardPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to admin dasboard page");

        // 5.Click Destinations
        tripandwayPage.destinationsTab.click();
        extentTest.info("Admin click order page tab");

        // 6.Verify that destinations view page
        Assert.assertTrue(tripandwayPage.destinationPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to orders page");

        // 7.Click add new button
        tripandwayPage.destinationsAddNewButton.click();
        extentTest.info("Admin click destinations add new button");

        // 8.Verify that add destionation page
        Assert.assertTrue(tripandwayPage.addDestinationsPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to add destination page");

        // 9.Fill the box about new destinations and click submit button
        tripandwayPage.destinationName.sendKeys(ConfigReader.getProperty("destinationsNameText"));
        tripandwayPage.destinationSlug.sendKeys(ConfigReader.getProperty("destinationsSlugText"));
        tripandwayPage.destinationHeading.sendKeys(ConfigReader.getProperty("destinationHeadingText"));
        tripandwayPage.destinationShotrtDescription.sendKeys(ConfigReader.getProperty("destinationShortDescriptionText"));
        tripandwayPage.destinationPackageHeading.sendKeys(ConfigReader.getProperty("destinationPackageHeadingText"));
        tripandwayPage.destinationDetailHeading.sendKeys(ConfigReader.getProperty("destinationDetailHeadingText"));
        tripandwayPage.destinationDetailSubheading.sendKeys(ConfigReader.getProperty("destinationDetailSubheadingText"));

        String farkliKisim = System.getProperty("user.dir");
        String ayniKisim = "/src/test/java/tests/US_30_34/pexels-johannes-plenio-1435075.jpg";
        String dosyaYolu =farkliKisim + ayniKisim;

        tripandwayPage.destinationPhoto.sendKeys(dosyaYolu);

        tripandwayPage.destinationIntroduction.sendKeys(ConfigReader.getProperty("destinationIntroductionText"));
        tripandwayPage.detinnationExperience.sendKeys(ConfigReader.getProperty("detinnationExperienceText"));
        tripandwayPage.destinationWeather.sendKeys(ConfigReader.getProperty("destinationWeatherText"));
        tripandwayPage.destinationHotel.sendKeys(ConfigReader.getProperty("destinationHotelText"));
        tripandwayPage.destinationTransportation.sendKeys(ConfigReader.getProperty("destinationTransportationText"));
        tripandwayPage.destinationCulture.sendKeys(ConfigReader.getProperty("destinationCultureText"));
        tripandwayPage.destinationTitle.sendKeys(ConfigReader.getProperty("destinationTitleText"));
        tripandwayPage.destinationMetaDescription.sendKeys(ConfigReader.getProperty("destinationMetaDescriptionText"));
        tripandwayPage.destinationSubmitButton.click();
        extentTest.info("Admin fill the box and click submit button");

        // 10.Verify that "Destination is added successfully!" is displayed
        Assert.assertTrue(tripandwayPage.detinationAddedSuccesfully.isDisplayed());
        extentTest.pass("Admin confirmed that add destination succesfully");

        // 11.Click new destinitions edit button
        tripandwayPage.slButton.click();
        ReusableMethods.wait(1);
        tripandwayPage.destinationEditButton.click();
        extentTest.info("Admin click new destination edit button");

        // 12.Change destination name and click update button
        tripandwayPage.destinationName.clear();
        tripandwayPage.destinationName.sendKeys(ConfigReader.getProperty("destinationsNewNameText"));
        tripandwayPage.destinationUpdateButton.click();
        extentTest.info("Admin click new destination update button");

        // 13.Verify that "Destination is updated successfully!" is displayed
        Assert.assertTrue(tripandwayPage.detinationUpdatedSuccesfully.isDisplayed());
        extentTest.pass("Admin confirmed that Destination is updated successfully!");

        // 14.Close browser

        // Driver.closeDriver();
    }

}
