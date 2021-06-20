package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_Page {
    public US_08_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.=' +12122171900 ']")
    public WebElement glbTelNumber;

    @FindBy(xpath = "//*[.=' Seller Sign in']")
    public WebElement sellerSignInLink;

    @FindBy(id = "username")
    public WebElement sellerSignInEmailTextBox;

    @FindBy(id = "password")
    public WebElement sellerSignInPasswordTextBox;

    @FindBy(id = "submit")
    public WebElement sellerSignInLoginButton;

    @FindBy(xpath = "//*[@id='form']/a")
    public WebElement sellerSignInForgotPasswordLink;

    @FindBy(xpath = "//h1[.='Vendor Forgot Form']")
    public WebElement sellerSignInForgotPageText;
}
