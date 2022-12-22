Feature: Laptops And Notebooks Test
  As a user I want to verify products price displayed high to low succesfully
  @Regression @Sanity
  Scenario: I should navigate to laptops and notebook page successfully
    Given I am on homepage
    When I hover on "Laptops & Notebooks"
    And I click "Show All Laptops & Notebooks"

  @Regression @Smoke
  Scenario: I should verify that order is placed successfully
    Given I am on homepage
    When I hover on "Laptops & Notebooks"
    And I click "Show all Laptops & Notebooks"
    And I select sort by position "Price (High > Low)"
    And I select laptop product "MacBook"
    And I verify the macbook product text "MacBook"
    And I click on "Add To Cart" button
    And I verify the message "Success: You have added MacBook to your shopping cart!"
    And I click on link shopping cart displayed in success message
    And I verify the shopping cart text "Shopping Cart"
    And I verify the macbook product name "MacBook"
    And I change quantity to "2"
    And I click on update tab
    And I verify the modified shopping cart success message "Success: You have modified your shopping cart!"
    And I verify the total "£737.45"
    And I click on checkout button
    And I verify the checkout text "Checkout"
    And I verify the new customer text "New Customer"
    And I click on guest checkout radio
    And I click on continue tab
    And I fill in the mandatory fields
    And I click on continue button at billing details section
    And I add comments about the order
    And I check the terms and conditions check box
    And I click the continue button
    Then I should see the message "Warning: Payment method required!"



