package tests.US_30_34;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US30_TC01 extends TestBaseRapor {

    @Test
    public void TC_01(){
        TripandwayPage tripandwayPage = new TripandwayPage();
        extentTest =extentReports.createTest("US_30 Tripandway Admin Login Test",
                                            "Admin log in admin dasboard page");

        // 1.Launch Browser
        // 2.Navigate to "tripandwayAdminURL"
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

        // 5.Click Destinations
        tripandwayPage.adminSayfasiDestinationsTab.click();
        extentTest.info("Admin click order page tab");

        // 6.Verify that destinations view page
        Assert.assertTrue(tripandwayPage.adminSayfasiDestinationPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to orders page");

        // 7.Click add new button
        tripandwayPage.adminSayfasiDestinationsAddNewButton.click();
        extentTest.info("Admin click destinations add new button");

        // 8.Verify that add destionation page
        Assert.assertTrue(tripandwayPage.adminSayfasiAddDestinationsPage.isDisplayed());
        extentTest.pass("Admin confirmed that navigated to add destination page");

        // 9.Fill the box about new destinations and click submit button
        tripandwayPage.adminSayfasiDestinationName.sendKeys(ConfigReader.getProperty("destinationsNameText"));
        tripandwayPage.adminSayfasiDestinationSlug.sendKeys(ConfigReader.getProperty("destinationsSlugText"));
        tripandwayPage.adminSayfasiDestinationHeading.sendKeys(ConfigReader.getProperty("destinationHeadingText"));
        tripandwayPage.adminSayfasiDestinationShotrtDescription.sendKeys(ConfigReader.getProperty("destinationShortDescriptionText"));
        tripandwayPage.adminSayfasiDestinationPackageHeading.sendKeys(ConfigReader.getProperty("destinationPackageHeadingText"));
        tripandwayPage.adminSayfasiDestinationDetailHeading.sendKeys(ConfigReader.getProperty("destinationDetailHeadingText"));
        tripandwayPage.adminSayfasiDestinationDetailSubheading.sendKeys(ConfigReader.getProperty("destinationDetailSubheadingText"));

        String farkliKisim = System.getProperty("user.dir");
        String ayniKisim = "/src/test/java/tests/US_30_34/pexels-johannes-plenio-1435075.jpg";
        String dosyaYolu =farkliKisim + ayniKisim;

        tripandwayPage.adminSayfasiDestinationPhoto.sendKeys(dosyaYolu);

        tripandwayPage.adminSayfasiDestinationIntroduction.sendKeys(ConfigReader.getProperty("destinationIntroductionText"));
        tripandwayPage.adminSayfasiDetinnationExperience.sendKeys(ConfigReader.getProperty("detinnationExperienceText"));
        tripandwayPage.adminSayfasiDestinationWeather.sendKeys(ConfigReader.getProperty("destinationWeatherText"));
        tripandwayPage.adminSayfasiDestinationHotel.sendKeys(ConfigReader.getProperty("destinationHotelText"));
        tripandwayPage.adminSayfasiDestinationTransportation.sendKeys(ConfigReader.getProperty("destinationTransportationText"));
        tripandwayPage.adminSayfasiDestinationCulture.sendKeys(ConfigReader.getProperty("destinationCultureText"));
        tripandwayPage.adminSayfasiDestinationTitle.sendKeys(ConfigReader.getProperty("destinationTitleText"));
        tripandwayPage.adminSayfasiDestinationMetaDescription.sendKeys(ConfigReader.getProperty("destinationMetaDescriptionText"));
        tripandwayPage.adminSayfasiDestinationSubmitButton.click();
        extentTest.info("Admin fill the box and click submit button");

        // 10.Verify that "Destination is added successfully!" is displayed
        Assert.assertTrue(tripandwayPage.adminSayfasiDetinationAddedSuccesfully.isDisplayed());
        extentTest.pass("Admin confirmed that add destination succesfully");

        // 11.Click new destinitions edit button
        tripandwayPage.adminSayfasiSlButton.click();
        ReusableMethods.wait(1);
        tripandwayPage.adminSayfasiDestinationEditButton.click();
        extentTest.info("Admin click new destination edit button");

        // 12.Change destination name and click update button
        tripandwayPage.adminSayfasiDestinationName.clear();
        tripandwayPage.adminSayfasiDestinationName.sendKeys(ConfigReader.getProperty("destinationsNewNameText"));
        tripandwayPage.adminSayfasiDestinationUpdateButton.click();
        extentTest.info("Admin click new destination update button");

        // 13.Verify that "Destination is updated successfully!" is displayed
        Assert.assertTrue(tripandwayPage.adminSayfasiDetinationUpdatedSuccesfully.isDisplayed());
        extentTest.pass("Admin confirmed that Destination is updated successfully!");

        // 14.Close browser

        // Driver.closeDriver();
    }

}
