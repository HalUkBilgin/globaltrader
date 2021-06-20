package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_09_Page {
    public US_09_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@href='https://www.glbtrader.com/register_vendor-1.html']")
    public WebElement sellerJoinButton;

    @FindBy(id = "vender_type")
    public WebElement agentSellerButton;

    @FindBy(id = "vender_type")
    public WebElement agentSellerRadioButton;

    @FindBy(name = "category")
    public WebElement categories;

    @FindBy(xpath = "//img[@class='img-responsive text-center_xs']")
    public WebElement globalTraderButton;

    @FindBy(id = "header_search_category")
    public WebElement allCategories;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement companySellerButton;




}
