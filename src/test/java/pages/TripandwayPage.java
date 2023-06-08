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

    //Package sayfasında 5 Day California butonu
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/package/california']")
    public WebElement californiaButonu;

    // California Package'ında "Book Your Seat" butonu
    @FindBy(xpath = "//button[text()='Book Your Seat']")
    public WebElement bookYourSeatButton;

    // Ödeme sayfasında kartla ödeme butonu
    @FindBy(xpath = "//span[text()='Pay with Card']")
    public WebElement payWithCardButton;

    // Ödeme sayfasındaki Card Number Textbox'ı
    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement cardNumberTextbox;

    // Ödeme sayfasındaki MM/YY textbox'ı
    @FindBy(xpath = "//input[@id='cc-exp']")
    public WebElement sKTButton;

    // Ödeme sayfasındaki CVC textbox'ı
    @FindBy(xpath = "//input[@id='cc-csc']")
    public WebElement cvcTextbox;

    // Ödeme sayfasındaki Pay Butonu
    @FindBy (xpath = "//span[@class='iconTick']")
    public WebElement payButton;

    //Ödeme yapıldıktan sonra ödemenin başarılı bir şekilde yapıldığını gösteren yazı
    @FindBy(xpath = "//*[text()='Profile is updated successfully']")
    public WebElement basariliOdemeYapildiYazisi;

    //Login sayfasındaki cookies
    @FindBy(xpath = "//button[text()='ACCEPT']")
    public WebElement cookieButton;


    @FindBy(xpath = "//h3[text()='Recent Posts']")
    public WebElement recentPostsElementi;

 // US_35-36-37-41 Baslangici
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

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    //  Admin Sayfasi admin34 Linki Altı Logout Linki
    public WebElement logoutLinki;

    // US_35-36-37-41 Bitisi


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

   // Admin ana sayfasındaki yandaki tiklanabilir sekmelerden packages sekmesi
   @FindBy (xpath = "//span[text()='Packages']")
   public WebElement adminSayfasiPackagesTab;

   // Admin packages sayfasında sol üstteki View Packages yazisi
   @FindBy (xpath = "//h6[text()='View Packages']")
   public WebElement adminSayfasiPackagesPage;

   // Admin packages sayfasında sağ üstteki +add new butonu
   @FindBy (xpath = "//a[@href='https://qa.tripandway.com/admin/package/create']")
   public WebElement adminSayfasiPackagesAddNewButton;

   // Admin add packages sayfasında üstteki Add Pakage yazisi
   @FindBy (xpath = "//h6[text()='Add Pakage']")
   public WebElement adminSayfasiAddPackagePage;

   // Admin add packages sayfasında name kutusu
   @FindBy (xpath = "//input[@name='p_name']")
   public WebElement adminSayfasiPackageName;

   // Admin add packages sayfasında slug kutusu
   @FindBy (xpath = "//input[@name='p_slug']")
   public WebElement adminSayfasiPackageSlug;

   // Admin add packages sayfasında photo dosya seç butonu
   @FindBy (xpath = "//input[@name='p_photo']")
   public WebElement adminSayfasiPackagePhoto;

   // Admin add packages sayfasında desciription kutusu
   @FindBy (xpath = "(//div[@contenteditable='true'])[1]")
   public WebElement adminSayfasiPackageDescription;

   // Admin add packages sayfasında Short Description kutusu
   @FindBy (xpath = "//textarea[@name='p_description_short']")
   public WebElement adminSayfasiPackageShortDescription;

   // Admin add packages sayfasında location kutusu
   @FindBy (xpath = "//textarea[@name='p_location']")
   public WebElement adminSayfasiPackageLocation;

   // Admin add packages sayfasında start date kutusu
   @FindBy (xpath = "//input[@name='p_start_date']")
   public WebElement adminSayfasiPackageStartDate;

   // Admin add packages sayfasında End date kutusu
   @FindBy (xpath = "//input[@name='p_end_date']")
   public WebElement adminSayfasiPackageEndDate;

   // Admin add packages sayfasında last booking date kutusu
   @FindBy (xpath = "//input[@name='p_last_booking_date']")
   public WebElement adminSayfasiPackageLastBookingDate;

   // Admin add packages sayfasında map kutusu
   @FindBy (xpath = "//textarea[@name='p_map']")
   public WebElement adminSayfasiPackageMap;

   // Admin add packages sayfasında Itinerary kutusu
   @FindBy (xpath = "(//div[@contenteditable='true'])[2]")
   public WebElement adminSayfasiPackageItinerary;

   // Admin add packages sayfasında price kutusu
   @FindBy (xpath = "//input[@name='p_price']")
   public WebElement adminSayfasiPackagePrice;

   // Admin add packages sayfasında policy kutusu
   @FindBy (xpath = "(//div[@contenteditable='true'])[3]")
   public WebElement adminSayfasiPackagePolicy;

   // Admin add packages sayfasında terms kutusu
   @FindBy (xpath = "(//div[@contenteditable='true'])[4]")
   public WebElement adminSayfasiPackageTerms;

   // Admin add packages sayfasında is featured kutusu
   @FindBy (xpath = "//select[@name='p_is_featured']")
   public WebElement adminSayfasiPackageIsFeatured;

   // Admin add packages sayfasında destination kutusu
   @FindBy (xpath = "//span[@class='select2-selection__rendered']")
   public WebElement adminSayfasiPackageDestination;

   // Admin add packages sayfasında description box kutusu
   @FindBy (xpath = "//input[@class='select2-search__field']")
   public WebElement adminSayfasiPackageDescriptionBox;

   // Admin add packages sayfasında title kutusu
   @FindBy (xpath = "//input[@name='seo_title']")
   public WebElement adminSayfasiPackageTitle;

   // Admin add packages sayfasında meta description kutusu
   @FindBy (xpath = "//textarea[@name='seo_meta_description']")
   public WebElement adminSayfasiPackageMetaDescription;

   // Admin add packages sayfasında alttaki submit butonu
   @FindBy (xpath = "//button[@type='submit']")
   public WebElement adminSayfasiPackageSubmitButton;

   // Admin packages sayfasında add successfully yazisi
   @FindBy (xpath = "//div[text()='Package is added successfully!']")
   public WebElement adminSayfasiPackageAddSuccessfully;

   // Admin add packages sayfasında sıralama sekmesi
   @FindBy (xpath = "//th[@class='sorting_asc']")
   public WebElement adminSayfasiPackageSlButton;

   // Admin packages sayfasında olusturulan packages'in edit butonu
   @FindBy (xpath = "//i[@class='fas fa-edit']")
   public WebElement adminSayfasiPackageEditButton;

   // Admin packages sayfasında alttaki update butonu
   @FindBy (xpath = "//button[@type='submit']")
   public WebElement adminSayfasiPackageUpdateButton;

   // Admin packages sayfasında update successfully yazisi
   @FindBy (xpath = "//div[text()='Package is updated successfully!']")
   public WebElement adminSayfasiPackageUpdatedSuccessfully;

   // Admin packages sayfasında olusturulan packages'in delete butonu
   @FindBy (xpath = "//i[@class='fas fa-trash-alt']")
   public WebElement adminSayfasiPackageDeleteButton;

   // Admin packages sayfasında delete successfully yazisi
   @FindBy (xpath = "//div[text()='Package is deleted successfully!']")
   public WebElement adminSayfasiPackageDeleteSuccessfully;

   // US_32

   // Admin ana sayfasındaki yandaki tiklanabilir sekmelerden order sekmesi
   @FindBy (xpath = "//span[text()='Order']")
   public WebElement adminSayfasiOrderPageTab;

   // Admin order sayfasında üstteki view orders yazisi
   @FindBy(xpath = "//h6[text()='View Orders']")
   public WebElement adminSayfasiOrdersDisplayed;

   // US_33

   // Admin order sayfasında olusturulan order'in üstteki order information yazisi
   @FindBy (xpath = "//h6[text()='Order Information']")
   public WebElement adminSayfasiOrderDetailDisplayed;

   // Admin order sayfasında order'in detail butonu
   @FindBy (xpath = "//a[@href='https://qa.tripandway.com/admin/order/detail/8']")
   public WebElement adminSayfasiOrdersDetail;

   // US_34

   // Admin order sayfasında order'in invoice butonu
   @FindBy (xpath = "//a[@href='https://qa.tripandway.com/admin/order/invoice/8']")
   public WebElement adminSayfasiOrderInvoice;

   // Admin order sayfasında olusturulan order'in üstteki order invoice yazisi
   @FindBy (xpath = "//h6[text()='Order Invoice']")
   public WebElement adminSayfasiOrdersInvoiceDisplayed;

    // US01_TC01_Zafer - US02_TC01_Zafer
    // Kullanıcı anasayfadaki sol üstte görünen iletişim bilgisi
    @FindBy(xpath = "//*[@class='fas fa-phone']")
    public WebElement kullaniciAnaSayfadakiNumara;

    // Kullanıcı anasayfadaki sol üstte görünen email
    @FindBy(xpath = "(//*[text()='info@tripandway.com'])[1]")
    public WebElement kullaniciAnasayfadakiEmail;

    // Kullanıcı anasayfadaki sağ üstteki Registration
    @FindBy(xpath = "//*[@class='fas fa-user-plus']")
    public WebElement kullaniciAnasayfadakiRegistration;

    // Kullanıcı anasahyafaki sağ üstteki Login butonu
    @FindBy(xpath = "//*[@class='fas fa-lock']")
    public WebElement kullaniciAnasayfadakiLogin;

    // Kullanıcı anasayfadaki Logo
    @FindBy(xpath = "//*[@src='https://qa.tripandway.com/public/uploads/logo.png']")
    public WebElement kullaniciAnasayfadakiLogo;

    // Kullanıcı anasayfadaki Home bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com'])[3]")
    public WebElement kullaniciAnasayfadakiHome;

    // Kullanıcı anasayfadaki Services bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/services'])[2]")
    public WebElement kullaniciAnasayfadakiServices;

    // Kullanıcı anasayfadaki Destinations bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/destination'])[2]")
    public WebElement kullaniciAnasayfadakiDestinations;

    // Kullanıcı anasayfadaki Packages bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/package'])[2]")
    public WebElement kullaniciAnasayfadakiPackages;

    // Kullanıcı anasayfadaki About Us bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/about'])[2]")
    public WebElement kullaniciAnasayfadakiAboutUs;

    // Kullanıcı anasayfadaki FAQ bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/faq'])[2]")
    public WebElement kullaniciAnasayfadakiFaq;


    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/destination'])[2]")
    // Kullanici Anasayfasindaki destinations elementi
    public WebElement destinationsElementi;

     @FindBy(xpath = "//h1[text()='Destinations']")
    // Destinations sayfasindaki 'Destinations' yazisi elementi
    public WebElement destinationsYazisiElm;

     @FindBy(xpath = "//a[text()='Bangkok, Thailand']")
    // Destinations sayfasindaki, 'Bangkok,Thailand' paketi elementi
    public WebElement bangkokThailandPakElm;

     @FindBy(xpath = "//a[text()='Greenville, South Carolina']")
    // Destinations sayfasindaki, 'Greenville,South Carolina' paketi elementi
    public WebElement greenvilleSCPakElm;

     @FindBy(xpath = "//a[text()='Buenos Aires, Argentina']")
    // Destinations sayfasindaki, 'Buenos Aires, Argentina' paketi elementi
    public WebElement buenosAiresArgentinaPakElm;

     @FindBy(xpath = "//a[text()='Marrakesh, Morocco']")
    // Destinations sayfasindaki, 'Buenos Aires, Argentina' paketi elementi
     public WebElement marrakeshMoraccoElm;

     @FindBy(xpath = "//a[text()='Salina Island, Italy']")
     // Destinations sayfasindaki, 'Salina Island, Italy' paketi elementi
    public WebElement salinaIslandItalyElm;

    @FindBy(xpath = "//a[text()='Istanbul, Turkey']")
    // Destinations sayfasindaki, 'Istanbul,Turkey' paketi elementi
    public WebElement istanbulTurkeyElm;

    @FindBy(xpath = "//a[text()='California, USA']")
    // Destinations sayfasindaki, 'California, USA' paketi elementi
    public WebElement californiaUSAElm;


    @FindBy(xpath = "//button[@class='wpcc-btn']")
    public WebElement anasayfaCookiesElm;

    // Kullanıcı anasayfadaki Blog bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/blog'])[2]")
    public WebElement kullaniciAnasayfadakiBlog;


    // Kullanıcı anasayfadaki Contact bölümü
    @FindBy(xpath = "(//*[@href='https://qa.tripandway.com/contact'])[2]")
    public WebElement kullaniciAnasayfadakiContact;



    @FindBy(xpath = "//a[text()='GOZTEPEIzmir']")
    // Destinations sayfasindaki, 'GOZTEPEIzmir' paketi elementi
    public WebElement goztepeIzmirElm;


    @FindBy(xpath = "//a[text()='Sair ne anlatiyor']")
    // Destinations sayfasindaki, 'Sair ne anlatiyor' paketi elementi
    public WebElement sairNeAnlatiyorElm;

    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package'])[2]")
    // Kullanici anasayfadaki 'Packages' sekmesi elementi
    public WebElement anasayfaPackagesElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/3-days-in-buenos-aires'])[1]")
    // Packages sayfasindaki, '3 days Buenos' turu elementi
    public WebElement ucDaysBuenosTuruElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/10-days-in-buenos-aires'])[1]")
    // Packages sayfasindaki, '10 days Buenos' turu elementi
    public WebElement onDaysBuenosTuruElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/7-days-in-istanbul'])[1]")
    // Packages sayfasindaki, '7 days Istanbul' turu elementi
    public WebElement yediDaysIstanbulTuruElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/3-days-in-bangkok'])[1]")
    // Packages sayfasindaki, '3 days Bangkok' turu elementi
    public WebElement ucDaysBangkokTuruElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/7-days-in-salina-island'])[1]")
    // Packages sayfasindaki, '7 days Salina' turu elementi
    public WebElement yediDaysSalinaTuruElm;


    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/package/california'])[1]")
    // Packages sayfasindaki, '5 days California' turu elementi
    public WebElement besDaysCaliforniaTuruElm;


    @FindBy(xpath = "//div[@class='col-md-12 wow fadeIn']")
    // About Us sayfasindaki, 'Our Mission / Our Vision' yazilari elementi
    public WebElement aboutUsSayfasindakiYazilarElm;



}
