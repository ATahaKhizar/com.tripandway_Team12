package tests.US_30_34;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.tripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US30_TC01 {

    @Test
    public void TC_01(){
        tripandwayPage tripandwayPage = new tripandwayPage();

        // 1.Launch Browser
        // 2.Navigate to "tripandwayAdminURL"
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayAdminURL"));

        // 3.Log in with correct email and password and click login button
        tripandwayPage.adminEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail"));
        tripandwayPage.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        tripandwayPage.adminLoginButton.click();

        // 4.Verify that admin dashboard page
        Assert.assertTrue(tripandwayPage.adminDasboardPage.isDisplayed());

        // 5.Click Destinations
        tripandwayPage.destinationsTab.click();

        // 6.Verify that destinations view page
        Assert.assertTrue(tripandwayPage.destinationPage.isDisplayed());

        // 7.Click add new button
        tripandwayPage.destinationsAddNewButton.click();

        // 8.Verify that add destionation page
        Assert.assertTrue(tripandwayPage.addDestinationsPage.isDisplayed());

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

        // 10.Verify that "Destination is added successfully!" is displayed
        Assert.assertTrue(tripandwayPage.detinationAddedSuccesfully.isDisplayed());

        // 11.Click new destinitions edit button
        tripandwayPage.slButton.click();
        ReusableMethods.wait(1);
        tripandwayPage.destinationEditButton.click();

        // 12.Change destination name and click update button
        tripandwayPage.destinationName.clear();
        tripandwayPage.destinationName.sendKeys(ConfigReader.getProperty("destinationsNewNameText"));
        tripandwayPage.destinationUpdateButton.click();

        // 13.Verify that "Destination is updated successfully!" is displayed
        Assert.assertTrue(tripandwayPage.detinationUpdatedSuccesfully.isDisplayed());

        // 14.Close browser
        Driver.closeDriver();
    }

}
