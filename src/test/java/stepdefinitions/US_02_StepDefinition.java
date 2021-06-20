package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_02_Page;
import sun.awt.ConstrainableGraphics;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_02_StepDefinition {

    US_02_Page us02Page=new US_02_Page();

    @Given("Kullanici Global Trader anasafasina gider")
    public void kullanici_Global_Trader_anasafasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("global_url"));
    }

    @Given("Kullanici Seller Join Now linkine tiklar")
    public void kullanici_Seller_Join_Now_linkine_tiklar() {
        us02Page.selelrJoinLink.click();
    }

    @Given("Kullanici Agent Seller Radio Butonuna Tiklar")
    public void kullanici_Agent_Seller_Radio_Butonuna_Tiklar() {
        us02Page.agentSellerRadioButton.click();
    }

    @Given("Name check boxa tikla ve doldurur")
    public void name_check_boxa_tikla_ve_doldurur() {
        us02Page.agentName.sendKeys(ConfigurationReader.getProperty("agent_name"));
    }

    @Given("Email check boxa tikla ve doldurur")
    public void email_check_boxa_tikla_ve_doldurur() {
        us02Page.agentEmail.sendKeys(ConfigurationReader.getProperty("agent_email"));
    }

    @Given("Sub domain check boxa tikla ve doldurur")
    public void sub_domain_check_boxa_tikla_ve_doldurur() {
        us02Page.agentSubDomain.sendKeys(ConfigurationReader.getProperty("agent_subDomain"));

    }

    @Given("Mobile phone check boxa tikla ve doldurur")
    public void mobile_phone_check_boxa_tikla_ve_doldurur() {
        us02Page.agentMobileNumber.sendKeys(ConfigurationReader.getProperty("agent_mobile"));
    }
    @Given("Country check boxa tikla ve Country secer")
    public void country_check_boxa_tikla_ve_Country_secer() {
        Select select=new Select(us02Page.country);
        select.selectByVisibleText(ConfigurationReader.getProperty("agent_country"));
    }

    @Given("State check boxa tikla ve doldurur")
    public void state_check_boxa_tikla_ve_doldurur() {
        us02Page.state.sendKeys(ConfigurationReader.getProperty("agent_state"));
    }
    @Given("City check boxa tikla ve doldurur")
    public void city_check_boxa_tikla_ve_doldurur() {
        us02Page.city.sendKeys(ConfigurationReader.getProperty("agent_city"));
    }

    @Given("Adres check boxa tikla ve doldurur")
    public void adres_check_boxa_tikla_ve_doldurur() {
        us02Page.agentAddress.sendKeys(ConfigurationReader.getProperty("agent_address"));
    }

    @Given("Enter Postal Code check boxa tikla ve doldurur")
    public void enter_Postal_Code_check_boxa_tikla_ve_doldurur() {
        us02Page.postCode.sendKeys(ConfigurationReader.getProperty("agent_postCode"));
    }

    @Given("Categories check boxa tikla ve Categori secer")
    public void categories_check_boxa_tikla_ve_Categori_secer() {
        Select categoriSelect=new Select(us02Page.agentCategories);
        categoriSelect.selectByVisibleText("Toys & Hobbies");
    }

    @Given("Password check boxa tikla ve doldurur")
    public void password_check_boxa_tikla_ve_doldurur() {
        us02Page.password.sendKeys(ConfigurationReader.getProperty("agent_password"));
    }
    @Given("Registration Butonuna tiklar")
    public void registration_Butonuna_tiklar() {
        us02Page.registrationButton.click();
    }

    @Then("Kullanici onay mesaji almali")
    public void kullanici_onay_mesaji_almali() {
        Assert.assertFalse(us02Page.companyRadioButton.isDisplayed());
    }





}
