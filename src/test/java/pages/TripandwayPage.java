package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TripandwayPage {
    public TripandwayPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Home Page kısmında sol üstte bulunan Logo locaterı
    @FindBy(xpath = "//*[@alt='Logo']")
    public WebElement tripandwayLogo;

    @FindBy(xpath = "//h3[text()='Recent Posts']")
    public WebElement recentPostsElementi;


    @FindBy(xpath = "//input[@id='email']")
    // Admin Login Sayfası Email Address Text Kutusu
    public WebElement adminLoginSayfasiEmailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    // Admin Login Sayfası Password Text Kutusu
    public WebElement adminLoginSayfasiPasswordKutusu;


    @FindBy(xpath = "//button[text()='Login']")
    //Admin Login Sayfası Login Butonu
    public WebElement adminLoginSayfasiLoginButonu;

    @FindBy(xpath = "//*[text()='Subscriber']")
    //Admin Panel sayfasi Subscriber(Haber Listesi) Linki
    public WebElement subscriberLinki;

    @FindBy(xpath = "//*[text()='All Subscribers']")
    //Admin Panel sayfasi All Subscribers(Tüm Haber Listesi) Linki
    public WebElement allSubscribersLinki;

    @FindBy(xpath = "//img[@class='img-profile rounded-circle']")
    //Admin panel sayfasi admin isim ve profil resmi linki
    public WebElement adminProfilResmiLinki;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    // Admin paneli Change Password linki
    public WebElement adminChangePasswordLinki;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    // Admin paneli Change Password linki
    public WebElement adminChangePhotoLinki;

    @FindBy(xpath = "//h1[text()='Edit Photo']")
    // Admin Edit Photo Yazısı elmenti
    public WebElement adminEditPhotoText;


}
