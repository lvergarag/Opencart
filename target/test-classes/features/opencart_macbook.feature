Feature: OpenCart MacBook validation POM

  Scenario: Open MacBook product and validate product code
    Given User navigates to OpenCart homepage
    When User clicks on MacBook product
    Then Product code text should be "Product Code: Product 16"
