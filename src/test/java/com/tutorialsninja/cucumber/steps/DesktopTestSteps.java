package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.cucumber.pages.DesktopPage;
import com.tutorialsninja.cucumber.pages.ProductPage;
import com.tutorialsninja.cucumber.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DesktopTestSteps {
    @And("^I select sort by position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String order) {
        new DesktopPage().clickOnSortByPosition();
        new DesktopPage().selectSortBy(order);
    }

    @Then("^I should see the product arranged in Descending order\\.$")
    public void iShouldSeeTheProductArrangedInDescendingOrder() {
        Assert.assertEquals("Product not sorted into Z to A order",new DesktopPage().afterSorting(), new DesktopPage().beforeSorting());
    }


    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProductHPLP3065(String product) {
        new DesktopPage().clickOnHPLP3065();
    }


    @And("^I verify the HP LP3065 text \"([^\"]*)\"$")
    public void iVerifyTheHPLP3065Text(String text)  {
        Assert.assertEquals("not on product page",text,new ProductPage().getHPLP3065text());
    }


    @And("^I select delivery date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String day, String month, String year)  {
        new ProductPage().selectDate(day,month,year);
    }

    @And("^I enter Qty \"([^\"]*)\" using select class$")
    public void iEnterQtyUsingSelectClass(String quantity){
        new ProductPage().clearAndAddQuantity(quantity);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws InterruptedException{
        new ProductPage().clickAddToCart();
    }
    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String text) {
        Assert.assertTrue("message not appearing",new ProductPage().isSuccessMessageAppearing().contains(text));
    }

    @And("^I click on link shopping cart displayed in success message$")
    public void iClickOnLinkShoppingCartDisplayedInSuccessMessage() throws InterruptedException{
        Thread.sleep(1000);
        new ProductPage().clickOnShoppingCartInSuccessMessage();

    }
    @Then("^I should verify shopping cart details$")
    public void iShouldVerifyShoppingCartDetails() {
        Assert.assertTrue("message not appearing",new ShoppingCartPage().isShoppingCartAppearing());
        Assert.assertEquals("product name not appearing","HP LP3065", new ShoppingCartPage().getProductName());
        Assert.assertTrue(new ShoppingCartPage().isDeliveryDateAppearing("2022-11-30"));
        Assert.assertEquals("Model not appearing","Product 21", new ShoppingCartPage().getModelText());
        Assert.assertEquals("total not appearing","£74.73", new ShoppingCartPage().getTotalText());
        //message expected actual
    }



}
