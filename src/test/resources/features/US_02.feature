@smokeTest @US_02
Feature: US_02 Agent Seller Hesap
  @AgentSellerKayit @TC_02
  Scenario: TC_0002 Kullanici  gecerli  verilerle Agent Seller hesabi olusturabilmeli
    Given Kullanici Global Trader anasafasina gider
    And Kullanici Seller Join Now linkine tiklar
    And Kullanici Agent Seller Radio Butonuna Tiklar
    And Name check boxa tikla ve doldurur
    And Email check boxa tikla ve doldurur
    And Sub domain check boxa tikla ve doldurur
    And Mobile phone check boxa tikla ve doldurur
    And Country check boxa tikla ve Country secer
    And State check boxa tikla ve doldurur
    And City check boxa tikla ve doldurur
    And Adres check boxa tikla ve doldurur
    And Enter Postal Code check boxa tikla ve doldurur
    And Categories check boxa tikla ve Categori secer
    And Password check boxa tikla ve doldurur
    And Registration Butonuna tiklar
    Then Kullanici onay mesaji almali