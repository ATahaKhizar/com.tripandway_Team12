package tests.US_09_12;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_09_TC01_burcu extends TestBaseRapor {

    @Test
    public void US_09() {
        extentTest = extentReports.createTest("Tripandway test", "Kullanici Tripandway sayfasini aratabilmeli");
        Faker faker = new Faker();
        TripandwayPage tripandwayPage = new TripandwayPage();

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
                , Driver.getDriver().findElement(By.xpath("//input[@name='subs_email']")));
        extentTest.info("Sayfayi asagi dogru surukleyebilmeli");

        // 4-Send mail address to newsletters with faker object
        tripandwayPage.newletter.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email adresini girebilmeli");
        tripandwayPage.submitButton.click();
        extentTest.info("Submit buttona click yapabilmeli");

        // 5-Enter the send e-mail address tab the NEWSLETTER section by mail
        tripandwayPage.checkYourMail.click();
        extentTest.info("Checkyour mail buttonuna click yapabilmeli");

        // 6-Check the visibility of your mail page verified
        Assert.assertTrue(tripandwayPage.checkYourMail.isDisplayed());
        extentTest.info("Giris yapilabildigi dogrulanabilmeli");





    }
}