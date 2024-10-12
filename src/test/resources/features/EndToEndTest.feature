Feature: Verify end to end scenarios of the application
Background:
  Given user open website
  Then verify user is on login page
  When user login with username "standard_user" and password "secret_sauce"
  Then verify user is on home page

  @Smoke
  Scenario: Verify user can place order
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all checkout details
    And click on Continue button
    Then verify user is on review page
    When user click on Finish button
    Then verify user is on order confirmation page

  Scenario: Verify user can sort Z to A
    When click on Z to A category
    Then verify product sorted in Z to A

    Scenario: Verify user can sort high to low
    When click on High to Low
    Then verify product sorted in High to Low

  Scenario: Verify user can add all items
    When user add all items to cart
    Then verify cart icon displays quantity of all
    When user click on cart icon
    Then verify user is on cart page
    And verify cart icon displays quantity of all

  Scenario: Verify user can compare price of order
    When user add all items to cart
    Then verify cart icon displays quantity of all
    When user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all checkout details
    And click on Continue button
    Then verify user is on review page
    And check total price is correct

  Scenario: Verify user can check remove button is not available
    When user add all items to cart
    And  user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all checkout details
    And  click on Continue button
    Then verify user is on review page
    When user click on Finish button
    Then verify user is on order confirmation page
    When user click on back to home button
    Then verify user is on home page
    And verify remove button is not available

