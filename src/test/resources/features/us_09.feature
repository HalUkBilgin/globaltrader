@US_09 @smokeTest
Feature: US_09 All Categories kontrolü
  @TC_17
  Scenario: TC_17 Kullanici Agent Seller radio butonu tiklanabilmeli
    Given Kullanici Global Trader sayfasina gider
    And Kullanici Seller Join Now butonuna tiklar
    Then Kullanici Agent Seller radio butonunun tiklanabildigini dogrular

  @TC_18
  Scenario: TC_18 Categori listeleri birbiri ile ayni olmaldir
    Given Kullanici Global Trader sayfasina gider
    And Kullanici Seller Join Now butonuna tiklar
    And Kullanici Agent Seller butonuna tiklar
    Then Kullanici kayit formundaki Categori Listesi ila ana sayfadaki Categori Listesinin ayni oldugunu dogrular

  @TC_19
  Scenario: TC_19 Kullanici Company Seller radio butonu tiklanabilmeli
    Given Kullanici Global Trader sayfasina gider
    And Kullanici Seller Join Now butonuna tiklar
    Then Kullanici Company Seller radio butonunun tiklanabildigini dogrular

  @TC_20
  Scenario: TC_20 Categori listeleri birbiri ile ayni olmaldir
    Given Kullanici Global Trader sayfasina gider
    And Kullanici Seller Join Now butonuna tiklar
    And Kullanici Agent Seller butonuna tiklar
    Then Kullanici kayit formundaki Categori Listesi ila ana sayfadaki Categori Listesinin ayni oldugunu dogrular