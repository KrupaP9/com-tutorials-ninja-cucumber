Feature: Desktop Test
  As user I want to navigate the desktop

  @Regression @Sanity
  Scenario: I should see product arranged in alphabetical order
    Given I am on homepage
    When I hover on "Desktops"
    And I click "Show All Desktops"
    And I select sort by position "Name (Z - A)"
    Then I should see the product arranged in Descending order.

  @Regression @Smoke
  Scenario: I should verify the product is added to shopping cart successFully
    Given I am on homepage
    When I hover on "Desktops"
    And I click "Show All Desktops"
    And I select sort by position "Name (A - Z)"
    And I select product "HP LP3065"
    And I verify the HP LP3065 text "HP LP3065"
    And I select delivery date "30" "November" "2022"
    And I enter Qty "1" using select class
    And I click on "Add to Cart" button
    And I verify the message "Success: You have added HP LP3065 to your shopping cart!"
    And I click on link shopping cart displayed in success message
    Then I should verify shopping cart details

