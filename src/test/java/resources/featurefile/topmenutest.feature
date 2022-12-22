Feature: Top Menu Test
  As user I want to navigate to Top Menu Tabs
 @Regression @Sanity
  Scenario: I should navigate to Desktops page successfully
    Given I am on homepage
    When I hover on "Desktops"
    And I click "Show All Desktops"
    Then I should navigate to Desktops page successfully
 @Regression @Smoke
  Scenario: I should navigate to laptops and notebook page successfully
    Given I am on homepage
    When I hover on "Laptops & Notebooks"
    And I click "Show All Laptops & Notebooks"
    Then I should navigate to Laptops & Notebooks page successfully
 @Regression
  Scenario: I should navigate to Components page successfully
    Given I am on homepage
    When I hover on "Components"
    And I click "Show All Components"
    Then I should navigate to Components page successfully