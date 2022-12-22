package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsPath;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement dropDownPath;
    String sortAToZ = "Name (A - Z)";
    String sortZToA = "Name (Z - A)";
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement productHPLP3065;

    public String getDesktopText() {
        log.info("Getting desktop text " + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void clickOnSortByPosition() {
        log.info("Clicking on sort by button " + dropDownPath.toString());
        clickOnElement(dropDownPath);

    }

    public void selectSortByAToZ(String text) {
        log.info("select A to Z" + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);

    }

    public void selectSortBy(String text) {
        log.info("select" + text + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);
    }

    public void clickOnHPLP3065() {
        log.info("Clicking on product HPLP3065 " + productHPLP3065.toString());
        clickOnElement(productHPLP3065);

    }


//    public ArrayList<String> getSortByAlphabeticalSelection(String dropdownSortBy) {
//        // Get all the products name and stored into array list
//        List<WebElement> products = productsPath;
//        ArrayList<String> originalProductsName = new ArrayList<>();
//        for (WebElement e : products) {
//            originalProductsName.add(e.getText());
//        }
//        System.out.println(originalProductsName);
//        // Sort By Reverse order
//        Collections.reverse(originalProductsName);
//        System.out.println(originalProductsName);
//        // Select sort by Name Z - A
//        selectByVisibleTextFromDropDown(dropDownPath, dropdownSortBy);
//        // After filter Z -A Get all the products name and stored into array list
//        products = productsPath;
//        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
//        for (WebElement e : products) {
//            afterSortByZToAProductsName.add(e.getText());
//        }
//        //System.out.println(afterSortByZToAProductsName);
//        //Assert.assertEquals(afterSortByZToAProductsName, originalProductsName, "Product not sorted into Z to A order");
//        return afterSortByZToAProductsName;
//    }

    public ArrayList<String> expectedList() {
        // Get all the products name and stored into array list
        List<WebElement> products = productsPath;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        return originalProductsName;
    }

    public ArrayList beforeSorting() {
        List<WebElement> product = productsPath ;
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement list : product) {
            originalList.add(list.getText());
        }
        return originalList;
    }
    public ArrayList afterSorting(){
        Collections.reverse(beforeSorting());
        System.out.println(beforeSorting());
        List<WebElement>products = productsPath;
        ArrayList<String>afterSortingList = new ArrayList<>();
        for (WebElement newSortList : products){
            afterSortingList.add(newSortList.getText());
        }
        return afterSortingList;
    }


}

