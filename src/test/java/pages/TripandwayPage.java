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

    // US_30 Sonu

    // US_9 Newsletter sekmesi
    @FindBy(xpath = "//input[@name='subs_email']")
    public WebElement newletter;

    // Submit buttonu
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;

    //Checkyour mail button
    @FindBy(xpath = "//body[@style='overflow-x: hidden;']")
    public WebElement checkYourMail;

    // Accept button
    @FindBy(xpath = "//*[text()='ACCEPT']")
    public WebElement AcceptButton;


    //US_10 Terms and Conditions bolumu
    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement termsAndConditionsBolum;
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement termsAndConditionsBolumGorunurlugu;

    //US_11 Privace Policy bolumu
    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement  privacPolicyBolum;

    //Privace Policy bolumu görünürlügü
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement  privacPolicyBolumGorunurlugu;

    //US_12 Services bolumu
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/services'])[2]")
    public WebElement servicesBolum;

    //Sayfanın gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement servicesSayfaGorunurluk;

    //International Tour Sayfası
    @FindBy(xpath = "//*[@href='https://qa.tripandway.com/service/international-tour']")
    public WebElement internationalTour;

    //International tour sayfasinin gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement internationalTourSayfaGorunurluk;

    //Adventure Tour sayfasi
    @FindBy(xpath = "//*[text()='Adventure Tour']")
    public WebElement adventureTour;

    //Adventure Tour sayfasi gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement adventureTourSayfaGorunurluk;

    //Cultural Tour sayfasi
    @FindBy(xpath = "//*[@href='https://qa.tripandway.com/service/culture-tour']")
    public WebElement cultureTourBolumu;

    //Cultural Tour sayfasinin gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement cultureTourSayfaGorunurluk;

    //Bussiness Tour sayfasi
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/service/bussiness-tour']")
    public WebElement bussinessTourBolumu;

    //Bussiness Tour sayfasinin gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement bussinessTourSayfaGorunurluk;

    //Health Tour sayfasi
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/service/health-tour']")
    public WebElement healthTourBolumu;

    //Health Tour sayfasinin gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement healthTourSayfaGorunurluk;

    //Religious Tour sayfasi
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/service/religious-tour']")
    public WebElement religiousBolumu;

    //Religious Tour sayfasinin gorunurlugu
    @FindBy(xpath = "//*[@style='overflow-x: hidden;']")
    public WebElement religiousTourSayfaGorunurluk;







}
