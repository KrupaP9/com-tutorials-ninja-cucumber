package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-checkout']//input[@value='guest']")
    WebElement guestCheckoutRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonBillingDetails;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement country;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement regionOrState;
    @CacheLookup
    @FindBy(name = "comment")
    WebElement commentBox;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsAndConditionsRadioBox;
    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement continueButtonCommentDetails;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement paymentMethodWarning;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']//a[text()='MacBook']")
    WebElement macBookText;

    public String getMacBookText() {
        log.info("Getting macbook text " + macBookText.toString());
        return macBookText.getText();
    }

    public String getCheckoutText() {
        log.info("Getting checkout text " + checkoutText.toString());

        return getTextFromElement(checkoutText);
    }

    public String getNewCustomerText() {
        log.info("Getting new customer text " + newCustomerText.toString());

        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton() {
        log.info("Clicking on radio button " + guestCheckoutRadioButton.toString());
        mouseHoverToElementAndClick(guestCheckoutRadioButton);

    }

    public void clickOnContinueButtonCheckout() throws InterruptedException{
        log.info("Clicking on continue button " + continueButton.toString());
        Thread.sleep(200);
        mouseHoverToElementAndClick(continueButton);

    }

    public void clickOnContinueBillingButton() {
        log.info("Clicking on radio button " + guestCheckoutRadioButton.toString());
        clickOnElement(continueButtonBillingDetails);

    }

    public void clickOnContinueCommentButton() {
        log.info("Clicking on radio button " + guestCheckoutRadioButton.toString());
        clickOnElement(continueButtonCommentDetails);

    }

    //    public void enterBillingDetails()throws InterruptedException {
//        sendTextToElement(firstName,"test1");
//        sendTextToElement(lastName,"test2");
//        sendTextToElement(email,"test1test2@gmail.com");
//        sendTextToElement(telephone,"59436462564");
//        sendTextToElement(address,"100 XYZ Road");
//        sendTextToElement(city,"XYZ");
//        sendTextToElement(postCode,"AB41CD");
//        selectByVisibleTextFromDropDown(country,"United States");
//        Thread.sleep(1000);
//        selectByVisibleTextFromDropDown(regionOrState, "Arizona");
//    }
    public void enterBillingDetailsFirstName(String inputFirstName) {
        log.info("Enter name" + inputFirstName + "to first name field " + firstName.toString());
        sendTextToElement(firstName, inputFirstName);

    }

    public void enterBillingDetailsLastName(String inputLastName) {
        log.info("Enter name" + inputLastName + "to last name field " + lastName.toString());
        sendTextToElement(lastName, inputLastName);

    }

    public void enterBillingDetailsEmail(String inputEmail) {
        log.info("Enter email" + inputEmail + "to email field " + email.toString());
        sendTextToElement(email, inputEmail + getRandomString(3) + "@gmail.com");

    }

    public void enterBillingDetailsTelephone(String inputTelephone) {
        log.info("Enter telephone" + inputTelephone + "to field " + telephone.toString());
        sendTextToElement(telephone, inputTelephone);

    }

    public void enterBillingDetailsAddress(String inputAddress) {
        log.info("Enter address" + inputAddress + "to field " + address.toString());
        sendTextToElement(address, inputAddress);

    }

    public void enterBillingDetailsCity(String inputCity) {
        log.info("Enter city" + inputCity + "to field " + city.toString());
        sendTextToElement(city, inputCity);

    }

    public void enterBillingDetailsPostcode(String inputPostcode) {
        log.info("Enter psotcode" + inputPostcode + "to field " + postCode.toString());
        sendTextToElement(postCode, inputPostcode);

    }

    public void enterBillingDetailsCountry(String inputCountry) {
        log.info("Enter country" + inputCountry + "to field " + country.toString());
        selectByVisibleTextFromDropDown(country, inputCountry);

    }

    public void enterBillingDetailsRegionOrState(String inputRegion) {
        log.info("Enter region" + inputRegion + "to field " + regionOrState.toString());
        selectByVisibleTextFromDropDown(regionOrState, inputRegion);

    }

    public void enterComment(String comment) {
        log.info("Enter comment" + comment + "to field " + commentBox.toString());
        sendTextToElement(commentBox, comment);

    }

    public void clickOnAgreeToTermsAndConditions() {
        log.info("Clicking on terms and conditions box " + termsAndConditionsRadioBox.toString());
        clickOnElement(termsAndConditionsRadioBox);

    }

    public Boolean isPaymentWarningAppearing() {
        log.info("Getting status of payment warning " + paymentMethodWarning.toString());
        return getTextFromElement(paymentMethodWarning).contains("Warning: Payment method required!");
    }
}
