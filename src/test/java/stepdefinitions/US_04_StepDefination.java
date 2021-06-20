package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import pages.US_04_Page;
import utilities.Driver;

public class US_04_StepDefination {
    US_04_Page us_04_page = new US_04_Page();

    @Given("https://www.glbtrader.com adresine gidilir")
    public void https_www_glbtrader_com_adresine_gidilir() {
        Driver.getDriver().get("https://www.glbtrader.com");
    }

    @Given("Seller Join Now linki tıklanır")
    public void seller_Join_Now_linki_tıklanır() {
        us_04_page.sellerJoinNowLinki.click();
    }

    @Given("Company Seller kutucuğu seçilir")
    public void company_Seller_kutucuğu_seçilir() {
        us_04_page.campanySellerRadioButton.click();
    }

    @Given("E-Mail kutucuğuna {string} datası gönderilir")
    public void e_Mail_kutucuğuna_datası_gönderilir(String string) {
        us_04_page.sellermail.sendKeys(string);
    }

    @Given("Registration tuşuna basılır")
    public void registration_tuşuna_basılır() {
        us_04_page.registrationButton.click();
    }

    @Then("{string} mesajının görüntülenip görüntülenmediğini Assert edilir")
    public void mesajının_görüntülenip_görüntülenmediğini_Assert_edilir(String string) {
//        String iceriyorMU=us_04_page.mesaj.getText();
//        System.out.println(iceriyorMU);
//        Assert.assertTrue(iceriyorMU.contains(string));

        String attributeText = us_04_page.sellermail.getAttribute("style");

        if(us_04_page.mesaj.isDisplayed()) {
            String iceriyorMU = us_04_page.mesaj.getText();
            System.out.println(iceriyorMU);
            Assert.assertTrue(iceriyorMU.contains(string));
        }else if(!attributeText.isEmpty()) {
            String errorAttribute = us_04_page.sellermail.getAttribute("style");
            Assert.assertTrue(errorAttribute.contains("red"));
        }else {
            String  rgbColor = us_04_page.sellermail.getCssValue("border-top-color");
            String hexColor = Color.fromString(rgbColor).asHex();
            Assert.assertEquals("#cccccc",hexColor);
        }







    }


}
