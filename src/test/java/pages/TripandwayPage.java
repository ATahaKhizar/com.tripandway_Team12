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


    //Homepage sayfasında kullanıcı girişi için Login butonu
    @FindBy (xpath = "//*[text()='Login']")
    public WebElement loginButton;

    //Login sayfasında bulunan email textboxı
    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement loginEmailTextbox;

    //Login sayfasında bulunan password textboxı
    @FindBy(xpath = "//input[@name='traveller_password']")
    public WebElement loginPasswordTextbox;

    //Login sayfasında bulunan Login butonu
    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginPageLoginButton;

    //Login Sayfasında bulunan Forget Password butonu
    @FindBy(xpath = "//a[text()='Forget Password']")
    public WebElement loginPageForgetPasswordButton;

    //Dashboard sayfasında en solda bulunan Update Profil butonu
    @FindBy(xpath = "//*[text()='Update Profile']")
    public WebElement dashboardUpdateProfileButton;

    // Profile-change sayfasındaki "Update Profil" yazısı
    @FindBy(xpath = "//h1[text()='Update Profile']")
    public WebElement updateProfileYazisi;

    //Profile-change sayfasındaki Name* Textboxı
    @FindBy(xpath = "//input[@name='traveller_name']")
    public WebElement updateProfileNameTextbox;

    //Profile-change sayfasındaki Email Address textboxı
    @FindBy (xpath = "//input[@name='traveller_email']")
    public WebElement updateProfileEmailTextbox;

    //Profile-change sayfasındaki Phone* textboxı
    @FindBy(xpath = "//input[@name='traveller_phone']")
    public WebElement updateProfilePhoneTextbox;

    //Profile-change sayfasındaki Country* textbox'ı
    @FindBy(xpath = "//input[@name='traveller_country']")
    public WebElement updateProfileCountryTextbox;

    //Profile-change sayfasındaki Address* Textboxı
    @FindBy(xpath = "//input[@name='traveller_address']")
    public WebElement updateProfileAddressTextbox;

    //Profile-change sayfasındaki State* Textbox'ı
    @FindBy(xpath = "//input[@name='traveller_state']")
    public WebElement updateProfileStateTextbox;

    //Profile-change sayfasındaki City* Textbox'ı
    @FindBy (xpath = "//input[@name='traveller_city']")
    public WebElement updateProfileCityTextbox;

    //Profile-change sayfasındaki Zip Code* Textbox'ı
    @FindBy(xpath = "//input[@name='traveller_zip']")
    public WebElement updateProfileZipCodeTextbox;

    //Profile-change sayfasındaki Update butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updateProfileUpdateButton;

    //Kullanıcı bilgilerini güncelledikten sonra sağ üst köşede çıkan "Profile is updated successfully
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement basariliDegisiklikYazisi;

    //Dashboard sayfasında en solda bulunan Payment History butonu
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/order']")
    public WebElement paymentHistoryButton;

    //Order sayfasındaki "View All Payments" yazısı
    @FindBy(xpath = "//h1[text()='View All Payments']")
    public WebElement viewAllPaymentsYazisi;

    //Order sayfasındaki ödeme geçmişini gösteren tablo
    @FindBy(xpath = "//table[@class='table table-bordered order-table']")
    public WebElement getViewAllPaymentsTable;

    //Dashboard sayfasında en solda bulunan "Update Password" Butonu
    @FindBy (xpath = "//a[@href='https://qa.tripandway.com/traveller/password-change']")
    public WebElement updatePasswordButton;

    //Password Change sayfasındaki "Update Password" yazısı
    @FindBy (xpath = "//h1[text()='Update Password']")
    public WebElement updatePasswordYazisi;

    //Password Change sayfasındaki "New Password*" textbox'ı
    @FindBy (xpath = "//input[@type='password']")
    public WebElement newPasswordTextbox;

    //Password Change sayfasındaki "Update" butonu
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement passwordChangePageUpdateButton;

    //Şifrenin başarılı bir şekilde değiştirildiğini gösterir köşede çıkan "Password is updated successfully" Yazısı
    @FindBy(xpath = "//div[text()='Password is updated successfully']")
    public WebElement basariliPasswordDegisikligiYazisi;

    //Dashboard sayfasında en solda bulunan "Logout" butonu
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/logout']")
    public WebElement logoutButton;

    //Forget Password sayfasında bulunan Email Address textbox'ı
    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement forgetPasswordPageEmailAddressTextbox;

    //Forget Password sayfasında bulunan "Submit" butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement forgetPasswordPageSubmitButton;

    //Sağ üst köşede çıkan "Please check your email to get password reset information" Yazısı
    @FindBy(xpath = "//div[text()='Please check your email to get password reset information']")
    public WebElement emailKontrolEtYazisi;

    //Forget Password sayfasında bulunan "Back to Login Page" butonu
    @FindBy(xpath = "//a[text()='Back to Login Page']")
    public WebElement backTOLoginPageButtonu;

    //Login sayfasındaki "Let's Go TRAVEL." yazısının bulunduğu resim
    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement letsGoTravelPicture;

    // Dashboard sayfasında üstte bulunan "PACKAGES" butonu
    @FindBy(xpath = "(//*[text()='Packages'])[2]")
    public WebElement packagesButton;
=======
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
    // Admin paneli Change Photo linki
    public WebElement adminChangePhotoLinki;

    @FindBy(xpath = "//h1[text()='Edit Photo']")
    // Admin Edit Photo Yazısı elmenti
    public WebElement adminEditPhotoText;

    @FindBy (xpath = "//h1[text()='Edit Profile']")
    //Admin Edit Profil Yazısı elementi
    public WebElement adminEditProfilText;


    // US_30 Sonu



}
