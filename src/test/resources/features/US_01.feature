@smokeTest @US_01
Feature: US_01 Seller and Company seller'i secebilme
  @agent_seller @TC_01
  Scenario: TC_0001 Kullanici seller olarak Vendor Register Form'una ulasabilmeli ve Agent Seller veya Company Seller olarak secim yapabilmeli.
    Given Kullanici glbTrader ana sayfasindadir
    And Kullanici Seller join linkine tiklar
    And kullanici Vendor Register Form mesajini görmeli
    And Kullanici Select Vendor Type mesajini görmeli
    And Kullanici Agent Seller rodio butonuna veya Company Seller rodio butonuna tiklayabilmeli
