package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li/div/child::*")
    List<WebElement> topMenuListField;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    WebElement laptopsAndNoteBooksTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement componentsTab;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccounts;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement loginAccountText;

    //    By currencySelector = By.xpath("//span[contains(text(),'Currency')]");
//    By currencyGBP = By.className("GBP");
//
//    public void chooseGBP() {
//        mouseHoverToElementAndClick(currencySelector);
//        mouseHoverToElementAndClick(currencyGBP);
//    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencySelector;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
    WebElement currencyGBP;
    public void hoverOnDesktopTab(){
        log.info("hovering on desktop tab");
        mouseHoverToElement(desktopTab);
    }
    public void hoverOnLaptopAndNotebookTab(){
        log.info("hovering on laptop and notebook tab");
        mouseHoverToElement(laptopsAndNoteBooksTab);
    }
    public void hoverOnComponentsTab(){
        log.info("hovering on components tab");
        mouseHoverToElement(componentsTab);
    }

    public void chooseGBP() {
        log.info("changing currency to GBP");
        mouseHoverToElementAndClick(currencySelector);
        mouseHoverToElementAndClick(currencyGBP);
    }
    public void selectMenu(String menu) throws InterruptedException{
        List<WebElement> topMenuList = topMenuListField;
        try {
            for (WebElement element : topMenuList) {
                Thread.sleep(500);
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuListField;
        }
    }

    public void mouseHoverAndClickOnDesktop() {
        log.info("Hovering and Clicking on desktop " + desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
    }

    public void mouseHoverAndClickOnLaptopsAndNotebooks() {
        log.info("Hovering and Clicking on laptops and notebooks " + laptopsAndNoteBooksTab.toString());
        mouseHoverToElementAndClick(laptopsAndNoteBooksTab);
    }

    public void mouseHoverAndClickOnComponents() {
        log.info("Hovering and Clicking on components " + componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountsList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountsList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountsList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccount() {
        log.info("Clicking on my account " + myAccounts.toString());
        clickOnElement(myAccounts);

    }

    public String getRegisterAccountText() {
        log.info("Getting register account text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public String getLoginAccountText() {
        log.info("Getting login account text " + loginAccountText.toString());
        return getTextFromElement(loginAccountText);
    }


}
