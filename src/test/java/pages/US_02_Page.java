package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_02_Page {
    public US_02_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Seller Join Now']")
    public WebElement selelrJoinLink;


    @FindBy(id = "vender_type")
    public WebElement agentSellerRadioButton;


    @FindBy(id = "vender_name")
    public WebElement agentName;

    @FindBy(id = "email")
    public WebElement agentEmail;

    @FindBy(id = "sub_domain")
    public WebElement agentSubDomain;

    @FindBy(id = "vender_mobile")
    public WebElement agentMobileNumber;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;

    @FindBy(id = "select_state")
    public WebElement state;

    @FindBy(id = "select_city")
    public WebElement city;

    @FindBy(id = "vender_address")
    public WebElement agentAddress;

    @FindBy(id = "zip_code_input")
    public WebElement postCode;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement agentCategories;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.=' Registration']")
    public WebElement registrationButton;

    @FindBy(id = "vender_type1")
    public WebElement companyRadioButton;

}
