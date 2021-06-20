package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04_Page {
    public US_04_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[.=' Seller Join Now']")
    public WebElement sellerJoinNowLinki;
    @FindBy(id = "vender_type1")
    public WebElement campanySellerRadioButton;
    @FindBy(xpath = "//button[.=' Registration']")
    public WebElement registrationButton;
    @FindBy(id = "alert_email_address")
    public WebElement mesaj;
    @FindBy(id = "email")
    public WebElement sellermail;
}
