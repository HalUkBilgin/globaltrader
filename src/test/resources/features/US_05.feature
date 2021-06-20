@smokeTest @US_05
Feature:US_05 Company Seller Gecersiz email
  @CompanySellerGecersizEmail @TC_09
  Scenario: TC_09 kullanici  Company Seller olarak email texteboxinda gecersiz  email ile kayit olmamalidir.
    Given kullanici "http://glbtrader.com/" sayfasindadir
    And kullanici  Seller Join Now butonuna tiklar
    And kullanici Company Seller sekmesine tiklar
    And kullanici Gecerli Company  Name girer
    And kullanici Gecerli Company  Mobile girer
    And kullanici Gecerli  Company  Address girer
    And kullanici Gecerli Name girer
    And kullanici Hatali Email girer
    And kullanici Gecerli Sub Domain girer
    And kullanici Gecerli Mobile Number girer
    And kullanici Gecerli Country dropdowndan secer
    And kullanici Gecerli State girer
    And kullanici Gecerli City girer
    And kullanici Gecerli Address girer
    And kullanici Gecerli Postal Code girer
    And kullanici Gecerli Categories dropdowndan secer
    And kullanici Gecerli Password girer
    And kullanici Registration butonuna tiklar
    Then kullanici "Please Enter Valid Email Address." mesajini gormelidir
