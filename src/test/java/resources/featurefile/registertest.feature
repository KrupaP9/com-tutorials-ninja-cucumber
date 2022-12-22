Feature: Register Test
  As user I want to Register an account

 @Regression @Sanity
  Scenario: I should navigate to register page successfully
    Given I am on homepage
    And I click on my account link
    And I select "Register" in account options
    And I verify the register text "Register Account"

  @Regression @Smoke
  Scenario: I should register account successfully
    Given I am on homepage
    And I click on my account link
    And I select "Register" in account options
    And I verify the register text "Register Account"
    And I enter first name "Priya"
    And I enter last name "Patel"
    And I enter email "patelpriya104@gmail.com"
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
    And I verify the account logout text "Account Logout"
    And I click on continue button after account logout
    Then I should be successfully registered
