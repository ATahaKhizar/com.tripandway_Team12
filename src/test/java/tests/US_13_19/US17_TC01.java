package tests.US_13_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US17_TC01 {
    TripandwayPage tripandwayPage= new TripandwayPage();
    @Test
    public void Test01(){
        //Contact sayfasına gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayContactPageURL"));
        //Contact sayfasının görünürlüğü doğrulanır
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(tripandwayPage.BannerKontrolElementi.isDisplayed(),"Contact sayfası görüntülenmedi");
        softAssert.assertAll();
        //Contact sayfasında bulunan fonksiyonların aktifliği doğrulanır
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='contact-area bg-area pt_50 pb_80']"));
        for (WebElement each : list) {
            softAssert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());

    }
        Driver.closeDriver();
}
}
