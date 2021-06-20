package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01_Glb_HomePage {

    public US_01_Glb_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy( xpath ="//a[@href='https://www.glbtrader.com/register_vendor-1.html']")
    public WebElement seller_Join_Now ;

    @FindBy(name="vender_type")
    public  WebElement agent_Seller;
    @FindBy(id="vender_name")
    public  WebElement agent_Seller_Name;

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "sub_domain")
    public WebElement sub_domain;

    @FindBy(id = "vender_mobile")
    public WebElement mobile_Number;

    @FindBy(id = "select_country")
    public WebElement select_country;

    @FindBy(id = "select_state")
    public WebElement select_state;

    @FindBy(id = "select_city")
    public WebElement select_city;

    @FindBy(id = "vender_address")
    public WebElement address;

    @FindBy(id = "zip_code_input")
    public WebElement code_input;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement registration_button;

    @FindBy (name =  "country")
    public WebElement country;
    //==========================================================
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/section/div[2]/form/div[1]/div[2]/label[2]")
    public WebElement company_vender_type;

    @FindBy (id = "company_name")
    public WebElement company_name;

    @FindBy (id = "company_mobile")
    public WebElement company_mobile;

    @FindBy (id = "company_address")
    public WebElement company_address;

    @FindBy (id = "vender_name")
    public WebElement company_vender_name;

    @FindBy (id = "email")
    public WebElement email_company;

    @FindBy (id = "sub_domain")
    public WebElement company_sub_domain;

    @FindBy (id = "vender_mobile")
    public WebElement company_vender_mobile;

    @FindBy (name= "country")
    public WebElement company_country;

    @FindBy (id = "select_state")
    public WebElement company_select_state;

    @FindBy (id = "select_city")
    public WebElement company_select_city;

    @FindBy (id = "vender_address")
    public WebElement company_vender_address;

    @FindBy (id = "zip_code_input")
    public WebElement company_postal_code_input;

    @FindBy (name = "category")
    public WebElement company_category;

    @FindBy (id = "password")
    public WebElement company_password;

    @FindBy (name = "submit")
    public WebElement company_submit;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/section/h2")
    public WebElement vendor_form;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/section/div[2]/form/div[1]/div[1]/b")
    public WebElement select_vendor_form;


}
