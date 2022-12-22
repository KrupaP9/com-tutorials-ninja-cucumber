package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacBookPage extends Utility {
    private static final Logger log = LogManager.getLogger(MacBookPage.class.getName());

    public MacBookPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macBookText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement  shoppingCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    public String getTextFromMacBook()throws InterruptedException{
       log.info("Getting macbook text " + macBookText.toString());
        Thread.sleep(1000);
        return getTextFromElement(macBookText);
    }
    public void clickOnAddToCart() {
        log.info("Clicking on add to cart Button " + addToCart.toString());
        clickOnElement(addToCart);

    }
    public Boolean isSuccessMessageAppearing(){
        log.info("Verifying if success message contains " + "Success: You have added MacBook to your shopping cart!");

        return getTextFromElement(successMessage).contains("Success: You have added MacBook to your shopping cart!");
    }
    public void clickOnShoppingCart(){
        log.info("Clicking on shopping cart " + shoppingCart.toString());
        clickOnElement(shoppingCart);

    }
}
