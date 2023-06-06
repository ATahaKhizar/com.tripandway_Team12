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


    @FindBy(xpath = "//a[text()='Send Email to Subscribers']")
    // Send Email to Subscribers (Tüm Haber Listesi) Linki
    public WebElement sendEmailSubscribersLinki;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    // All Subscribers Butonu (Mavi-Mail Gönderme Sayfası)
    public WebElement allSubscribersButonu;

    @FindBy(xpath = "//input[@name='subject']")
    //  Send Mail Sayfasi Subject Text Kutusu
    public WebElement subjectTextKutusu;

    @FindBy(xpath = "//div[@role='textbox']")
    //  Send Mail Sayfasi Message Text Kutusu
    public WebElement messageTextKutusu;

    @FindBy(xpath = "//button[text()='Send Email']")
    //  Send Mail Sayfasi Send Email Butonu
    public WebElement sendEmailButonu;

    @FindBy(xpath = "//div[text()='Email is sent successfully to all subscribers!']")
    // Tüm Üyelere Mail başarılı gönderildi yazı elementi (Email is sent successfully to all subscribers!)
    public WebElement emailBasariliGonderildiYaziElementi;

    // US_30

    // Admin ana sayfasındaki dashboard yazisi
    @FindBy (xpath = "//h1[text()='Dashboard']")
    public WebElement adminSayfasiDasboardPage;

    // Admin ana sayfasındaki yandaki tiklanabilir sekmelerden destinations sekmesi
    @FindBy (xpath = "//span[text()='Destinations']")
    public WebElement adminSayfasiDestinationsTab;

    // Admin Destinations sayfasindaki üstteki View Destinations yazisi
    @FindBy (xpath = "//h6[text()='View Destinations']")
    public WebElement adminSayfasiDestinationPage;

    // Admin Destinations sayfasindaki sağ üstteki +Add New Butonu
    @FindBy (xpath = "//a[@href='https://qa.tripandway.com/admin/destination/create']")
    public WebElement adminSayfasiDestinationsAddNewButton;

    // Admin Add Destination sayfasindaki Üstteki add destinations yazisi
    @FindBy (xpath = "//h6[text()='Add Destination']")
    public WebElement adminSayfasiAddDestinationsPage;

    // Admin Add Destination sayfasindaki Name Kutusu
    @FindBy (xpath = "//input[@name='d_name']")
    public WebElement adminSayfasiDestinationName;

    // Admin Add Destination sayfasindaki Slug Kutusu
    @FindBy (xpath = "//input[@name='d_slug']")
    public WebElement adminSayfasiDestinationSlug;

    // Admin Add Destination sayfasindaki Heading Kutusu
    @FindBy (xpath = "//input[@name='d_heading']")
    public WebElement adminSayfasiDestinationHeading;

    // Admin Add Destination sayfasindaki Short Description Kutusu
    @FindBy (xpath = "//textarea[@name='d_short_description']")
    public WebElement adminSayfasiDestinationShotrtDescription;

    // Admin Add Destination sayfasindaki Package Heading Kutusu
    @FindBy (xpath = "//input[@name='d_package_heading']")
    public WebElement adminSayfasiDestinationPackageHeading;

    // Admin Add Destination sayfasindaki Package Subheading Kutusu
    @FindBy (xpath = "//input[@name='d_package_subheading']")
    public WebElement adminSayfasiDestinationDetailHeading;

    // Admin Add Destination sayfasindaki Detail Heading Kutusu
    @FindBy (xpath = "//input[@name='d_detail_subheading']")
    public WebElement adminSayfasiDestinationDetailSubheading;

    // Admin Add Destination sayfasindaki Photo Dosya Sec Butonu
    @FindBy (xpath = "//input[@name='d_photo']")
    public WebElement adminSayfasiDestinationPhoto;

    // Admin Add Destination sayfasindaki Introduction Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[1]")
    public WebElement adminSayfasiDestinationIntroduction;

    // Admin Add Destination sayfasindaki Experience Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[2]")
    public WebElement adminSayfasiDetinnationExperience;

    // Admin Add Destination sayfasindaki Weather Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[3]")
    public WebElement adminSayfasiDestinationWeather;

    // Admin Add Destination sayfasindaki Hotel Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[4]")
    public WebElement adminSayfasiDestinationHotel;

    // Admin Add Destination sayfasindaki Transportation Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[5]")
    public WebElement adminSayfasiDestinationTransportation;

    // Admin Add Destination sayfasindaki Culture Kutusu
    @FindBy (xpath = "(//div[@contenteditable='true'])[6]")
    public WebElement adminSayfasiDestinationCulture;

    // Admin Add Destination sayfasindaki Title Kutusu
    @FindBy (xpath = "//input[@name='seo_title']")
    public WebElement adminSayfasiDestinationTitle;

    // Admin Add Destination sayfasindaki Meta Description Kutusu
    @FindBy (xpath = "//textarea[@name='seo_meta_description']")
    public WebElement adminSayfasiDestinationMetaDescription;

    // Admin Add Destination sayfasindaki alttaki Submit Butonu
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement adminSayfasiDestinationSubmitButton;

    // Admin Destination sayfasindaki added successfully yazisi
    @FindBy (xpath = "//div[text()='Destination is added successfully!']")
    public WebElement adminSayfasiDetinationAddedSuccesfully;

    // Admin Destination sayfasindaki olusturulan destination edit butonu
    @FindBy (xpath = "//i[@class='fas fa-edit']")
    public WebElement adminSayfasiDestinationEditButton;

    // Admin  Destination sayfasindaki Update Kutusu
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement adminSayfasiDestinationUpdateButton;

    // Admin Destination sayfasindaki update successfully yazisi
    @FindBy (xpath = "//div[text()='Destination is updated successfully!']")
    public WebElement adminSayfasiDetinationUpdatedSuccesfully;

    // Admin Destination sayfasindaki sıralama sekmesi
    @FindBy (xpath = "//th[@class='sorting_asc']")
    public WebElement adminSayfasiSlButton;

    @FindBy(xpath = "//*[text()='34, Edd Lane, NYC, 22335']")
    public WebElement adressBilgisi;

    @FindBy(xpath = "(//p[text()='202-456-3789'])[2]")
    public WebElement telefonBilgisi;

    @FindBy(xpath = "(//p[text()='info@tripandway.com'])[2]")
    public WebElement emailBilgisi;
    @FindBy(xpath = "//*[text()='Address']")
    public WebElement addressElementi;

    @FindBy(xpath = "(//ul[@class='footer-social']/li)[1]")
    public WebElement faceBookElementi;

    @FindBy(xpath = "(//ul[@class='footer-social']/li)[2]")
    public WebElement twitterElementi;

    @FindBy(xpath = "(//ul[@class='footer-social']/li)[3]")
    public WebElement linkedinElementi;

    @FindBy(xpath = "(//ul[@class='footer-social']/li)[4]")
    public WebElement pinterestElementi;

    @FindBy(xpath = "(//ul[@class='footer-social']/li)[5]")
    public WebElement instagramElementi;


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


    // US_30 Sonu


}
