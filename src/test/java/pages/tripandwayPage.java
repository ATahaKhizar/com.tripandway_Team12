package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class tripandwayPage {
    public tripandwayPage(){
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


}
