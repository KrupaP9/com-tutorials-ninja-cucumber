package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement  productHPLP3065OnProductPage;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement  calendarButtonLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement>  daysOfTheMonth;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[@class='datepicker-days']//th[@class='next']")
    WebElement  nextButton;
    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement  quantityBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement  addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
    WebElement  successMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement  shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement  shoppingCartInSuccessMessage;
    public String getHPLP3065text(){
        Reporter.log("Getting HPLP3065 text " + productHPLP3065OnProductPage.toString());

        return getTextFromElement(productHPLP3065OnProductPage);
    }

    public void selectDate(String inputDay,String inputMonth, String inputYear){
        clickOnElement(calendarButtonLink);
        while (true){
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String splitMonth = arr[0];
            String splitYear = arr[1];
            if (splitMonth.equalsIgnoreCase(inputMonth)&&splitYear.equalsIgnoreCase(inputYear)){
                break;
            }else{
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = daysOfTheMonth;
        for (WebElement dateStore : allDates){
            if (dateStore.getText().equalsIgnoreCase(inputDay)){
                dateStore.click();
                break;
            }
        }
    }
    public void clearAndAddQuantity(String quantity) {
        Reporter.log("clearing current quantity and adding the specified amount");
        quantityBox.clear();
        sendTextToElement(quantityBox, quantity);
    }
    public void clickAddToCart() throws InterruptedException {
        Reporter.log("Clicking on add to cart Button " + addToCartButton.toString());
        mouseHoverToElementAndClick(addToCartButton);
        Thread.sleep(1000);
    }

    public String isSuccessMessageAppearing(){
        Reporter.log("Verifying if success message contains " + "Success: You have added HP LP3065 to your shopping cart!");
        return getTextFromElement(successMessage);
    }
    public void clickOnShoppingCartInSuccessMessage(){
        Reporter.log("Clicking on shopping cart " + shoppingCartInSuccessMessage.toString());
        mouseHoverToElementAndClick(shoppingCartInSuccessMessage);
    }
}
