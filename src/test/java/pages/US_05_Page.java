package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05_Page {
    public US_05_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Seller Join Now']")
    public WebElement sellerJoinLink;


    @FindBy(id = "vender_type1")
    public WebElement companySellerRadioButton;

    @FindBy(id = "company_name")
    public WebElement companyName;

    @FindBy(id = "company_mobile")
    public WebElement companyMobileNumber;

    @FindBy(id = "company_address")
    public WebElement companyAddress;

    @FindBy(id = "vender_name")
    public WebElement Name;

    @FindBy(id = "email")
    public WebElement companyEmail;

    @FindBy(id = "sub_domain")
    public WebElement companySubDomain;

    @FindBy(id = "vender_mobile")
    public WebElement mobileNumber;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;

    @FindBy(id = "select_state")
    public WebElement state;

    @FindBy(id = "select_city")
    public WebElement city;

    @FindBy(id="vender_address")
    public WebElement Address;

    @FindBy(id = "zip_code_input")
    public WebElement postCode;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement companyCategories;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.=' Registration']")
    public WebElement registrationButton;

    @FindBy(id = "alert_email_address")
    public WebElement hataMesaji;



}


