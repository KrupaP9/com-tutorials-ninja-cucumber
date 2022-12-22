Feature: Login Test
  As user I want to login to my account

  @Regression @Sanity
  Scenario: I should navigate to login page successfully
    Given I am on homepage
    And I click on my account link
    And I select "Login" in account options
    And I verify the returning customer text "Returning Customer"

  @Regression @Smoke
  Scenario: I should login and logout successfully
    Given I am on homepage
    And I click on my account link
    And I select "Register" in account options
    And I enter first name "Priya"
    And I enter last name "Patel"
    And I enter email "patelpriya5@gmail.com"
    And I enter telephone "02756876567"
    And I enter password "priyapassword1"
    And I enter confirm password "priyapassword1"
    And I select subscribe radio button
    And I click on privacy policy check box
    And I click on continue button
    And I verify the success message "Your Account Has Been Created!"
    And I click on continue button after account created
    And I click on my account link
    And I "Logout" of my account
    And I click on continue button after account logout
    And I click on my account link
    And I select "Login" in account options
    And I enter email address "patelpriya5@gmail.com"
    And I enter password "priyapassword1"
    And I click on login button
    And I verify the my account text "My Account"
    And I click on my account link
    And I select "Logout" in account options
    And I verify the account logout text "Account Logout"
    And I click on continue button after account logout
    Then I have logged in and logged out successfully
