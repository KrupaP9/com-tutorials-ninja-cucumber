package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LaptopsAndNotebooksTestSteps {
    @And("^I select laptop product \"([^\"]*)\"$")
    public void iSelectProductMacBook(String product) {
        new LaptopAndNoteBookPage().clickOnMacbook();
    }

    @And("^I verify the product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String arg0) throws Throwable {
        new MacBookPage().getTextFromMacBook();
    }

    @And("^I change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String arg0) throws Throwable {
        new ShoppingCartPage().clearAndAddQuantity("2");
    }

    @And("^I click on update tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdate();
    }

    @And("^I verify the total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String text) throws Throwable {
        Assert.assertEquals("total doesnt match", text, new ShoppingCartPage().getTotalText());
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckout();
    }

    @And("^I click on guest checkout radio$")
    public void iClickOnGuestCheckoutRadio() {
        new CheckoutPage().clickOnGuestCheckoutRadioButton();
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() throws InterruptedException {
        new CheckoutPage().clickOnContinueButtonCheckout();
    }

    @And("^I fill in the mandatory fields$")
    public void iFillInTheMandatoryFields() throws InterruptedException {
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsFirstName("Priyanka");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsLastName("Patel");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsEmail("priyanka");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsTelephone("03562835284");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsAddress("10 XYZ Road");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsCity("London");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsPostcode("AB12CD");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsCountry("United States");
        Thread.sleep(200);
        new CheckoutPage().enterBillingDetailsRegionOrState("Arizona");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueAfterPrivacyButton();
    }

    @And("^I add comments about the order$")
    public void iAddCommentsAboutTheOrder() {
        new CheckoutPage().enterComment("Comment About Order");
    }

    @And("^I check the terms and conditions check box$")
    public void iCheckTheTermsAndConditionsCheckBox() {
        new CheckoutPage().clickOnAgreeToTermsAndConditions();
    }

    @And("^I click the continue button$")
    public void iClickTheContinueButton() {
        new CheckoutPage().clickOnContinueCommentButton();
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String arg0) throws Throwable {

    }

    @And("^I click on continue button at billing details section$")
    public void iClickOnContinueButtonAtBillingDetailsSection() {
        new CheckoutPage().clickOnContinueBillingButton();
    }

    @And("^I verify the macbook product name \"([^\"]*)\"$")
    public void iVerifyTheMacbookProductName(String text) throws Throwable {
        Assert.assertEquals(text,new CheckoutPage().getMacBookText());
    }

    @And("^I verify the modified shopping cart success message \"([^\"]*)\"$")
    public void iVerifyTheModifiedShoppingCartSuccessMessage(String arg0) throws Throwable {
        Assert.assertTrue(new ShoppingCartPage().successMessageAppearing().contains("Success: You have modified your shopping cart!"));
    }

    @And("^I verify the checkout text \"([^\"]*)\"$")
    public void iVerifyTheCheckoutText(String text) throws Throwable {
       Assert.assertEquals("Checkout text doesnt appear",text, new CheckoutPage().getCheckoutText());
    }

    @And("^I verify the new customer text \"([^\"]*)\"$")
    public void iVerifyTheNewCustomerText(String text) throws InterruptedException {
        Thread.sleep(1000);
       Assert.assertEquals("new customer text doesnt appear",text, new CheckoutPage().getNewCustomerText());
    }

    @And("^I verify the shopping cart text \"([^\"]*)\"$")
    public void iVerifyTheShoppingCartText(String text)  {
        Assert.assertTrue(new ShoppingCartPage().shoppingCartAppearing().contains(text));
    }

    @And("^I verify the macbook product text \"([^\"]*)\"$")
    public void iVerifyTheMacbookProductText(String test) throws Throwable {
        Assert.assertEquals("macbook text not appearing",test,new MacBookPage().getTextFromMacBook());
    }
}
