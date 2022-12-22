package com.tutorialsninja.cucumber.pages;

import com.tutorialsninja.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement componentsText;
    public String getComponentsText(){
        log.info("Getting components text " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
