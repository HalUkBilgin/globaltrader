package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_08_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_08_StepDefinitions {
    US_08_Page us08Page = new US_08_Page();

    @Given("Kullanici glbtrader anasayfasina gider")
    public void kullanici_glbtrader_anasayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("global_url"));
    }

    @Then("Kullanici glbtrader anasayfasina ulasildigini dogrular")
    public void kullanici_glbtrader_anasayfasina_ulasildigini_dogrular() {
        Assert.assertTrue(us08Page.glbTelNumber.isDisplayed());
    }

    @Given("Kullanici glbtrader anasayfasina girder")
    public void kullanici_glbtrader_anasayfasina_girder() {
        Driver.getDriver().get(ConfigurationReader.getProperty("global_url"));
    }

    @Given("Kullanici Signin butonuna tiklar")
    public void kullanici_Signin_butonuna_tiklar() {
        us08Page.sellerSignInLink.click();
    }

    @Then("Kullanici emailbox'a ulasilabilir oldugunu dogrular")
    public void kullanici_emailbox_a_ulasilabilir_oldugunu_dogrular() {
        Assert.assertTrue(us08Page.sellerSignInEmailTextBox.isEnabled());
    }

    @Given("Kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        us08Page.sellerSignInLink.click();
    }

    @Then("Kullanici password box'a ulasilabilir oldugunu dogrular")
    public void kullanici_password_box_a_ulasilabilir_oldugunu_dogrular() {
        Assert.assertTrue(us08Page.sellerSignInPasswordTextBox.isEnabled());
    }

    @Given("Kullanici login sayfasina ulasir")
    public void kullanici_login_sayfasina_ulasir() {
        //* Login sayfasina ulasir ama Then degil dogrulama yok
    }

    @Given("Kullanici mail girer")
    public void kullanici_mail_girer() {
        us08Page.sellerSignInEmailTextBox.sendKeys(ConfigurationReader.getProperty("agent_email"));
    }

    @Given("Kullanici password girer")
    public void kullanici_password_girer() {
        us08Page.sellerSignInPasswordTextBox.sendKeys(ConfigurationReader.getProperty("agent_password"));
    }

    @Given("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        us08Page.sellerSignInLoginButton.click();
    }

    @Then("Kullanici login butonun calistigini dogrular")
    public void kullanici_login_butonun_calistigini_dogrular() {
        Assert.assertTrue(us08Page.sellerSignInLoginButton.isEnabled());
    }

    @Given("Kullanici Forgot Password buttonuna tiklar")
    public void kullanici_Forgot_Password_buttonuna_tiklar() {
        us08Page.sellerSignInForgotPasswordLink.click();
    }

    @Then("Kullanici Forgot Form sayfasina ulastigini dogrular")
    public void kullanici_Forgot_Form_sayfasina_ulastigini_dogrular() {
        Assert.assertTrue(us08Page.sellerSignInForgotPageText.isDisplayed());
    }
}
