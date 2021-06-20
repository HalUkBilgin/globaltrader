@US_08 @smokeTest
Feature: US_08 Test Cases
  @TC_12
  Scenario: TC_12 Glbtrader anasayfa ulasilabilir olmali
    Given Kullanici glbtrader anasayfasina gider
    Then Kullanici glbtrader anasayfasina ulasildigini dogrular

  @TC_13
  Scenario: TC_13 emailbox ulasilabilir olmalidir
    Given Kullanici glbtrader anasayfasina girder
    And Kullanici Signin butonuna tiklar
    Then Kullanici emailbox'a ulasilabilir oldugunu dogrular

  @TC_14
  Scenario: TC_14 password box ulasilabilir olmalidir
    Given Kullanici glbtrader anasayfasina gider
    And Kullanici sign in butonuna tiklar
    Then Kullanici password box'a ulasilabilir oldugunu dogrular

  @TC_15
  Scenario: TC_15 login butonu calisiyor olmalidir
    Given Kullanici glbtrader anasayfasina gider
    And Kullanici sign in butonuna tiklar
    And Kullanici login sayfasina ulasir
    And Kullanici mail girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    Then Kullanici login butonun calistigini dogrular

  @TC_16
  Scenario: TC_16 Forgot Form sayfasina ulsilabilir olmalidir
    Given Kullanici glbtrader anasayfasina gider
    And Kullanici sign in butonuna tiklar
    And Kullanici Forgot Password buttonuna tiklar
    Then Kullanici Forgot Form sayfasina ulastigini dogrular
