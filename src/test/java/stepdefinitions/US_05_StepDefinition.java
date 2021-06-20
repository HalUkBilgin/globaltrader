package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.US_05_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_05_StepDefinition {

    US_05_Page us05Page = new US_05_Page();

//    @Given("kullanici {string} sayfasindadir")
//    public void kullanici_sayfasindadir(String string) {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("global_url"));
//
//    }

//    @Given("kullanici  Seller Join Now butonuna tiklar")
//    public void kullanici_Seller_Join_Now_butonuna_tiklar() {
//        us05Page.sellerJoinLink.click();

//    }

//    @Given("kullanici Company Seller sekmesine tiklar")
//    public void kullanici_Company_Seller_sekmesine_tiklar() {
//        us05Page.companySellerRadioButton.click();
//
//    }

    @Given("kullanici Gecerli Company  Name girer")
    public void kullanici_Gecerli_Company_Name_girer() {
        us05Page.companyName.sendKeys(ConfigurationReader.getProperty("company_name"));

    }

    @Given("kullanici Gecerli Company  Mobile girer")
    public void kullanici_Gecerli_Company_Mobile_girer() {
        us05Page.companyMobileNumber.sendKeys(ConfigurationReader.getProperty("company_mobile"));

    }

    @Given("kullanici Gecerli  Company  Address girer")
    public void kullanici_Gecerli_Company_Address_girer() {
        us05Page.companyAddress.sendKeys(ConfigurationReader.getProperty("company_Address"));

    }

    @Given("kullanici Gecerli Name girer")
    public void kullanici_Gecerli_Name_girer() {
        us05Page.Name.sendKeys(ConfigurationReader.getProperty("name"));

    }

    @Given("kullanici Hatali Email girer")
    public void kullanici_Hatali_Email_girer() {
        us05Page.companyEmail.sendKeys(ConfigurationReader.getProperty("gecersiz_email"));

    }
    @Given("kullanici Gecerli Sub Domain girer")
    public void kullanici_Gecerli_Sub_Domain_girer() {
        us05Page.companySubDomain.sendKeys(ConfigurationReader.getProperty("company_supDomain"));

    }

    @Given("kullanici Gecerli Mobile Number girer")
    public void kullanici_Gecerli_Mobile_Number_girer() {
        us05Page.mobileNumber.sendKeys(ConfigurationReader.getProperty("mobil_number"));

    }

    @Given("kullanici Gecerli Country dropdowndan secer")
    public void kullanici_Gecerli_Country_dropdowndan_secer() {
        Select countrySelect=new Select(us05Page.country);
        countrySelect.selectByVisibleText(ConfigurationReader.getProperty("company_Country"));

    }

    @Given("kullanici Gecerli State girer")
    public void kullanici_Gecerli_State_girer() {
        us05Page.state.sendKeys(ConfigurationReader.getProperty("company_state"));

    }

    @Given("kullanici Gecerli City girer")
    public void kullanici_Gecerli_City_girer() {
        us05Page.city.sendKeys(ConfigurationReader.getProperty("company_city"));

    }

    @Given("kullanici Gecerli Address girer")
    public void kullanici_Gecerli_Address_girer() {
        us05Page.Address.sendKeys(ConfigurationReader.getProperty("company_address"));

    }

    @Given("kullanici Gecerli Postal Code girer")
    public void kullanici_Gecerli_Postal_Code_girer() {
        us05Page.postCode.sendKeys(ConfigurationReader.getProperty("company_postaCode"));

    }

    @Given("kullanici Gecerli Categories dropdowndan secer")
    public void kullanici_Gecerli_Categories_dropdowndan_secer() {
        Select selectCategories = new Select(us05Page.companyCategories);
        selectCategories.selectByVisibleText(ConfigurationReader.getProperty("company_Categories"));

    }

    @Given("kullanici Gecerli Password girer")
    public void kullanici_Gecerli_Password_girer() {
        us05Page.password.sendKeys(ConfigurationReader.getProperty("password"));

    }

//    @Given("kullanici Registration butonuna tiklar")
//    public void kullanici_Registration_butonuna_tiklar() {
//        us05Page.registrationButton.click();
//
//    }

    @Then("kullanici {string} mesajini gormelidir")
    public void kullanici_mesajini_gormelidir(String string) {

        Assert.assertTrue(us05Page.hataMesaji.isDisplayed());
    }
}

