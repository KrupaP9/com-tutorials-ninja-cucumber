package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginTestSteps {
    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) throws Throwable {
        new LoginPage().sendEmail(email);
    }

    @And("^I enter password \"priyapassword(\\d+)$")
    public void iEnterPasswordPriyapassword(String password) throws Throwable {
        new LoginPage().sendEmail(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @And("^I click on my account$")
    public void iClickOnMyAccount(String options) {
        new HomePage().selectMyAccountOptions(options);
    }

    @Then("^I have logged in and logged out successfully$")
    public void iHaveLoggedInAndLoggedOutSuccessfully() {
    }

    @And("^I verify the my account text \"([^\"]*)\"$")
    public void iVerifyTheMyAccountText(String text) throws Throwable {
        Assert.assertEquals("my account text not displayed",text ,new AccountPage().getMyAccountText());
    }

    @And("^I verify the account logout text \"([^\"]*)\"$")
    public void iVerifyTheAccountLogoutText(String text) throws Throwable {
        Assert.assertEquals("account logout text not displayed",text ,new LogoutPage().getTextFromLogout());
    }

    @And("^I verify the returning customer text \"([^\"]*)\"$")
    public void iVerifyTheReturningCustomerText(String text) throws Throwable {
        Assert.assertEquals("returning customer text not displayed",text ,new LoginPage().getReturningCustomerText());
    }
}
