package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_09_Page;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_09_StepDefinition {

    US_09_Page test_page = new US_09_Page();
    @Given("Kullanici Global Trader sayfasina gider")
    public void kullanici_Global_Trader_sayfasina_gider() {

        Driver.getDriver().get("https://www.glbtrader.com");

    }

    @Given("Kullanici Seller Join Now butonuna tiklar")
    public void kullanici_Seller_Join_Now_butonuna_tiklar() {
        test_page.sellerJoinButton.click();

    }
    @Then("Kullanici Agent Seller radio butonunun tiklanabildigini dogrular")
    public void kullanici_Agent_Seller_radio_butonunun_tiklanabildigini_dogrular() {
        Assert.assertTrue(test_page.agentSellerRadioButton.isEnabled());
    }
    @Given("Kullanici Agent Seller butonuna tiklar")
    public void kullanici_Agent_Seller_butonuna_tiklar() {

        test_page.agentSellerRadioButton.click();
    }

    @Then("Kullanici kayit formundaki Categori Listesi ila ana sayfadaki Categori Listesinin ayni oldugunu dogrular")
    public void kullanici_kayit_formundaki_Categori_Listesi_ila_ana_sayfadaki_Categori_Listesinin_ayni_oldugunu_dogrular() {

        Select select1 = new Select(test_page.categories);
        List<WebElement> kayitFormList = select1.getOptions();
        List<String> kayitFormListString = new ArrayList<>();

        for (WebElement w : kayitFormList) {
            System.out.println(w.getText());
            kayitFormListString.add(w.getText());
        }

        test_page.globalTraderButton.click();

        Select select2 = new Select(test_page.allCategories);
        List<WebElement> anaSayfaList = select2.getOptions();
        anaSayfaList.remove(0);
        for (WebElement w : anaSayfaList) {
            System.out.println(w.getText());
            Assert.assertTrue(kayitFormListString.contains(w.getText()));

        }


    }
    @Then("Kullanici Company Seller radio butonunun tiklanabildigini dogrular")
    public void kullanici_Company_Seller_radio_butonunun_tiklanabildigini_dogrular() {


        Assert.assertTrue(test_page.companySellerButton.isEnabled());


    }
   
}
