package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import pages.US_01_Glb_HomePage;
import utilities.Driver;

public class US_01_Stepdef {

    US_01_Glb_HomePage glb_homePage = new US_01_Glb_HomePage();



    @Given("Kullanici glbTrader ana sayfasindadir")
    public void kullanici_glbTrader_ana_sayfasindadir() {
        Driver.getDriver().get("https://www.glbtrader.com/");

    }

    @Given("Kullanici Seller join linkine tiklar")
    public void kullanici_Seller_join_linkine_tiklar() {
        glb_homePage.seller_Join_Now.click();
    }

    @Given("kullanici Vendor Register Form mesajini görmeli")
    public void kullanici_Vendor_Register_Form_mesajini_görmeli() {
        String vendo_form = glb_homePage.vendor_form.getText();
        Assert.assertFalse(vendo_form.contains("Vendo Register Form"));
        System.out.println("kullanici bu mesaji almali : " + vendo_form);

    }

    @Given("Kullanici Select Vendor Type mesajini görmeli")
    public void kullanici_Select_Vendor_Type_mesajini_görmeli() {
        String select_vendor_form = glb_homePage.select_vendor_form.getText();
        Assert.assertTrue(select_vendor_form.contains("Select Vendor Type"));
        System.out.println("kullanici bu mesaji almali : " + select_vendor_form);
    }

    @Given("Kullanici Agent Seller rodio butonuna veya Company Seller rodio butonuna tiklayabilmeli")
    public void kullanici_Agent_Seller_rodio_butonuna_veya_Company_Seller_rodio_butonuna_tiklayabilmeli() throws InterruptedException {

        glb_homePage.agent_Seller.click();
        boolean agentSecilimi = glb_homePage.agent_Seller.isSelected();

        if (!agentSecilimi){
            glb_homePage.agent_Seller.click();

        }
            Assert.assertTrue(glb_homePage.agent_Seller.isEnabled());
        Thread.sleep(4000);
        glb_homePage.company_vender_type.click();
        boolean companySecilimi = glb_homePage.company_vender_type.isSelected();



        Thread.sleep(4000);
        glb_homePage.agent_Seller.click();
        Assert.assertTrue(glb_homePage.company_vender_type.isEnabled());

    }


}
