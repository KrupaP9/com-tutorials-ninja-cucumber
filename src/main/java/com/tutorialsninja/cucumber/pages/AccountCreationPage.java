package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountCreationPage.class.getName());

    public AccountCreationPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement  accountCreationText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueAfterAccountCreation;


    public String getAccountCreationMessage() {
        log.info("Getting account creation text " + accountCreationText.toString());
        return getTextFromElement(accountCreationText);
    }

    public void clickOnContinueAfterAccountCreation() {
        log.info("Clicking on continue after account button " + continueAfterAccountCreation.toString());
        clickOnElement(continueAfterAccountCreation);
    }



}
