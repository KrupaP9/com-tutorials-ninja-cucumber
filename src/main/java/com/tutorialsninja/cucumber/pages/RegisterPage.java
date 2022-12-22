package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(name = "confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(name = "newsletter")
    WebElement newsletter;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueAfterPrivacyButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccount;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement accountCreatedSuccessfully;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement continueAfterAccountCreated;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueAfterAccountLogout;

    public String getRegisterAccountText() {
        return registerAccount.getText();
    }

    public void sendFirstName(String inputFirstName) {
        log.info("Enter first name" + inputFirstName + "to field " + firstName.toString());
        sendTextToElement(firstName, inputFirstName);

    }

    public void sendLastName(String inputLastName) {
        log.info("Enter last name" + inputLastName + "to field " + lastName.toString());
        sendTextToElement(lastName, inputLastName);

    }

    public void sendEmail(String text) {
        log.info("Enter email" + text + "to email field " + email.toString());
        sendTextToElement(email, text);
    }

    public void sendTelephone(String inputTelephone) {
        log.info("Enter telephone" + inputTelephone + "to field " + telephone.toString());
        sendTextToElement(telephone, inputTelephone);

    }

    public void sendPassword(String inputPassword) {
        log.info("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);

    }

    public void sendConfirmPassword(String inputConfirmPassword) {
        log.info("Enter email" + inputConfirmPassword + "to email field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, inputConfirmPassword);

    }

    public void clickOnSubscribeToNewsletter() {
        log.info("Clicking on subscribe " + newsletter.toString());
        clickOnElement(newsletter);

    }

    public void clickOnPrivacyPolicy() {
        log.info("Clicking on privacy policy " + privacyPolicy.toString());
        clickOnElement(privacyPolicy);

    }

    public void clickOnContinueAfterPrivacyButton() {
        log.info("Clicking on continue " + continueAfterPrivacyButton.toString());
        clickOnElement(continueAfterPrivacyButton);
    }
    public String getAccountCreatedSuccessfullyText() {
        log.info("getting account creation message");
        return accountCreatedSuccessfully.getText();
    }
    public void clickOnContinueAfterAccountCreated() {
        log.info("Clicking on continue " + continueAfterAccountCreated.toString());
        clickOnElement(continueAfterAccountCreated);
    }
    public void clickOnContinueAfterAccountLogout()throws InterruptedException {
        log.info("Clicking on continue " + continueAfterAccountLogout.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(continueAfterAccountLogout);
    }

}
