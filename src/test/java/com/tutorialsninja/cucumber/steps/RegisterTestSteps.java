package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.cucumber.pages.HomePage;
import com.tutorialsninja.cucumber.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RegisterTestSteps {
    @And("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccount();
    }
    @And("^I select \"([^\"]*)\" in account options$")
    public void iSelectInAccountOptions(String option) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().selectMyAccountOptions(option);
    }
    @And("^I verify the register text \"([^\"]*)\"$")
    public void iVerifyTheRegisterText(String message)  {
        Assert.assertEquals("register text not displayed",message,new RegisterPage().getRegisterAccountText());
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().sendFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().sendLastName(lastName);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
       new RegisterPage().sendEmail(email);
    }

    @And("^I enter telephone \"([^\"]*)\"$")
    public void iEnterTelephone(String telephone){
        new RegisterPage().sendTelephone(telephone);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
      new RegisterPage().sendPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().sendConfirmPassword(confirmPassword);
    }

    @And("^I select subscribe radio button$")
    public void iSelectSubscribeRadioButton() {
        new RegisterPage().clickOnSubscribeToNewsletter();
    }

    @And("^I click on privacy policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPrivacyPolicy();
    }

    @And("^I verify the success message \"([^\"]*)\"$")
    public void iVerifyTheSuccessMessage(String successMessage)  {
        Assert.assertEquals("success message not appearing", successMessage, new RegisterPage().getAccountCreatedSuccessfullyText());
    }

    @And("^I \"([^\"]*)\" of my account$")
    public void iOfMyAccount(String option) throws InterruptedException {
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("^I should be successfully registered$")
    public void iShouldBeSuccessfullyRegistered() {

    }


    @And("^I verify the registration text \"([^\"]*)\"$")
    public void iVerifyTheRegistrationText(String text) {
Assert.assertEquals("registration text not displayed", text, new RegisterPage().getRegisterAccountText());
    }

    @And("^I click on continue button after account created$")
    public void iClickOnContinueButtonAfterAccountCreated() {
        new RegisterPage().clickOnContinueAfterAccountCreated();
    }

    @And("^I click on continue button after account logout$")
    public void iClickOnContinueButtonAfterAccountLogout() throws InterruptedException{
        new RegisterPage().clickOnContinueAfterAccountLogout();
    }
}
