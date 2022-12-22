package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.cucumber.pages.ComponentsPage;
import com.tutorialsninja.cucumber.pages.DesktopPage;
import com.tutorialsninja.cucumber.pages.HomePage;
import com.tutorialsninja.cucumber.pages.LaptopAndNoteBookPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I hover on \"([^\"]*)\"$")
    public void iHoverOn(String tab) {
        if (tab.equalsIgnoreCase("Desktops")) {
            new HomePage().hoverOnDesktopTab();
        } else if (tab.equalsIgnoreCase("Laptops & Notebooks")) {
            new HomePage().hoverOnLaptopAndNotebookTab();
        } else if (tab.equalsIgnoreCase("Components")) {
            new HomePage().hoverOnComponentsTab();
        }else {
            System.out.println("Incorrect Tab Name");
        }
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String option) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().selectMenu(option);
        System.out.println(option);
    }

    @Then("^I should navigate to Desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals("Desktops", new DesktopPage().getDesktopText());
        System.out.println(new DesktopPage().getDesktopText());
    }

    @Then("^I should navigate to Laptops & Notebooks page successfully$")
    public void iShouldNavigateToLaptopsNotebooksPageSuccessfully() {
        Assert.assertEquals("Laptops & Notebooks", new LaptopAndNoteBookPage().getLaptopAndNoteBookText());
        System.out.println(new LaptopAndNoteBookPage().getLaptopAndNoteBookText());
    }

    @Then("^I should navigate to Components page successfully$")
    public void iShouldNavigateToComponentsPageSuccessfully() {
        Assert.assertEquals("Components", new ComponentsPage().getComponentsText());
        System.out.println(new ComponentsPage().getComponentsText());
    }


}
