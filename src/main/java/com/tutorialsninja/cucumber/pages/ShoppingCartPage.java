package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productNameText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDateText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement refreshButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successMessageRefresh;
    @CacheLookup
    @FindBy(css = "a.btn.btn-primary")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']/i")
    WebElement currencyDropdown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
    WebElement currencyGBP;

    public String shoppingCartAppearing() {
        log.info("Verifying if success message contains " + "Shopping Cart");
        return getTextFromElement(shoppingCartText);
    }

    public Boolean isShoppingCartAppearing() {
        log.info("Verifying if success message contains " + "Shopping Cart");
        return getTextFromElement(shoppingCartText).contains("Shopping Cart");
    }

    public String getProductName() {
        return getTextFromElement(productNameText);
    }

    public Boolean isDeliveryDateAppearing(String date) {
        log.info("Verifying if success message contains " + date);
        return getTextFromElement(deliveryDateText).contains(date);
    }

    public String getModelText() {
        log.info("getting text of model selected");
        return getTextFromElement(modelText);
    }

    public String getTotalText() {
        log.info("changing currency to GBP and returning text of total amount");
        clickOnElement(currencyDropdown);
        mouseHoverToElementAndClick(currencyGBP);
        return getTextFromElement(totalText);
    }

    public void clearAndAddQuantity(String quantity) {
        log.info("clear quantity and add quantity of " + quantity);
        quantityBox.clear();
        sendTextToElement(quantityBox, quantity);
    }

    public void clickOnUpdate() {
        log.info("clicking on update cart");
        clickOnElement(refreshButton);
    }

    public String successMessageAppearing() {
        log.info("Verifying if success message contains " + "Success: You have added HP LP3065 to your shopping cart!");
        return getTextFromElement(successMessageRefresh);
    }

    public void clickOnCheckout() {
        log.info("Clicking on checkout Button " + checkoutButton.toString());
        clickOnElement(checkoutButton);

    }
}
