package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;

    public void sendEmail(String inputEmail) {
        log.info("Enter email" + inputEmail + "to  field " + email.toString());
        sendTextToElement(email, inputEmail);
    }

    public void sendPassword(String inputPassword) {
        log.info("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);

    }

    public String getReturningCustomerText() {
        log.info("Getting returning customer text " + loginButton.toString());
        return returningCustomerText.getText();
    }

    public void clickOnLogin() {
        log.info("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);

    }

}
