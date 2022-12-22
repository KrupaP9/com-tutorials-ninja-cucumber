$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktoptest.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop Test",
  "description": "As user I want to navigate the desktop",
  "id": "desktop-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3935956500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should see product arranged in alphabetical order",
  "description": "",
  "id": "desktop-test;i-should-see-product-arranged-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I hover on \"Desktops\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by position \"Name (Z - A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the product arranged in Descending order.",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 109188900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 250198300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3029199500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z - A)",
      "offset": 27
    }
  ],
  "location": "DesktopTestSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 439471100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestSteps.iShouldSeeTheProductArrangedInDescendingOrder()"
});
formatter.result({
  "duration": 500595000,
  "status": "passed"
});
formatter.after({
  "duration": 672378200,
  "status": "passed"
});
formatter.before({
  "duration": 2178608200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I should verify the product is added to shopping cart successFully",
  "description": "",
  "id": "desktop-test;i-should-verify-the-product-is-added-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    },
    {
      "line": 12,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I hover on \"Desktops\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select sort by position \"Name (A - Z)\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select product \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the HP LP3065 text \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select delivery date \"30\" \"November\" \"2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter Qty \"1\" using select class",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on \"Add to Cart\" button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the message \"Success: You have added HP LP3065 to your shopping cart!\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on link shopping cart displayed in success message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should verify shopping cart details",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 18900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 298901900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3010039100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (A - Z)",
      "offset": 27
    }
  ],
  "location": "DesktopTestSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 430874800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 18
    }
  ],
  "location": "DesktopTestSteps.iSelectProductHPLP3065(String)"
});
formatter.result({
  "duration": 994895700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 29
    }
  ],
  "location": "DesktopTestSteps.iVerifyTheHPLP3065Text(String)"
});
formatter.result({
  "duration": 41427100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 24
    },
    {
      "val": "November",
      "offset": 29
    },
    {
      "val": "2022",
      "offset": 40
    }
  ],
  "location": "DesktopTestSteps.iSelectDeliveryDate(String,String,String)"
});
formatter.result({
  "duration": 7526899300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "DesktopTestSteps.iEnterQtyUsingSelectClass(String)"
});
formatter.result({
  "duration": 112520600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add to Cart",
      "offset": 12
    }
  ],
  "location": "DesktopTestSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 1171174500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have added HP LP3065 to your shopping cart!",
      "offset": 22
    }
  ],
  "location": "DesktopTestSteps.iVerifyTheMessage(String)"
});
formatter.result({
  "duration": 30253700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestSteps.iClickOnLinkShoppingCartDisplayedInSuccessMessage()"
});
formatter.result({
  "duration": 1499790900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestSteps.iShouldVerifyShoppingCartDetails()"
});
formatter.result({
  "duration": 721448300,
  "status": "passed"
});
formatter.after({
  "duration": 700209700,
  "status": "passed"
});
formatter.uri("laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops And Notebooks Test",
  "description": "As a user I want to verify products price displayed high to low succesfully",
  "id": "laptops-and-notebooks-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2228019900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I should navigate to laptops and notebook page successfully",
  "description": "",
  "id": "laptops-and-notebooks-test;i-should-navigate-to-laptops-and-notebook-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I hover on \"Laptops \u0026 Notebooks\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click \"Show All Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 55900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops \u0026 Notebooks",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 474508100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Laptops \u0026 Notebooks",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3929256800,
  "status": "passed"
});
formatter.after({
  "duration": 705742600,
  "status": "passed"
});
formatter.before({
  "duration": 2757337200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "I should verify that order is placed successfully",
  "description": "",
  "id": "laptops-and-notebooks-test;i-should-verify-that-order-is-placed-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regression"
    },
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover on \"Laptops \u0026 Notebooks\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click \"Show all Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select sort by position \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select laptop product \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the macbook product text \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on \"Add To Cart\" button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the message \"Success: You have added MacBook to your shopping cart!\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on link shopping cart displayed in success message",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the shopping cart text \"Shopping Cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify the macbook product name \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I change quantity to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on update tab",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the modified shopping cart success message \"Success: You have modified your shopping cart!\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the total \"£737.45\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the checkout text \"Checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify the new customer text \"New Customer\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on guest checkout radio",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I fill in the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on continue button at billing details section",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I add comments about the order",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I check the terms and conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should see the message \"Warning: Payment method required!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 29200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops \u0026 Notebooks",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 152529700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show all Laptops \u0026 Notebooks",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3975044100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 27
    }
  ],
  "location": "DesktopTestSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 397363900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 25
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iSelectProductMacBook(String)"
});
formatter.result({
  "duration": 1027326200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 35
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheMacbookProductText(String)"
});
formatter.result({
  "duration": 1048756800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add To Cart",
      "offset": 12
    }
  ],
  "location": "DesktopTestSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 1148321000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have added MacBook to your shopping cart!",
      "offset": 22
    }
  ],
  "location": "DesktopTestSteps.iVerifyTheMessage(String)"
});
formatter.result({
  "duration": 35417300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestSteps.iClickOnLinkShoppingCartDisplayedInSuccessMessage()"
});
formatter.result({
  "duration": 1365463300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 33
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheShoppingCartText(String)"
});
formatter.result({
  "duration": 43438100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 35
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheMacbookProductName(String)"
});
formatter.result({
  "duration": 28010800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iChangeQuantityTo(String)"
});
formatter.result({
  "duration": 94951200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnUpdateTab()"
});
formatter.result({
  "duration": 339540800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have modified your shopping cart!",
      "offset": 53
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheModifiedShoppingCartSuccessMessage(String)"
});
formatter.result({
  "duration": 38516600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£737.45",
      "offset": 20
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheTotal(String)"
});
formatter.result({
  "duration": 518483800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 301633700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checkout",
      "offset": 28
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheCheckoutText(String)"
});
formatter.result({
  "duration": 39460600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 32
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iVerifyTheNewCustomerText(String)"
});
formatter.result({
  "duration": 1071441800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnGuestCheckoutRadio()"
});
formatter.result({
  "duration": 138671400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 379412400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iFillInTheMandatoryFields()"
});
formatter.result({
  "duration": 2836800900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnContinueButtonAtBillingDetailsSection()"
});
formatter.result({
  "duration": 68959000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iAddCommentsAboutTheOrder()"
});
formatter.result({
  "duration": 399582200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iCheckTheTermsAndConditionsCheckBox()"
});
formatter.result({
  "duration": 74523300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickTheContinueButton()"
});
formatter.result({
  "duration": 88231400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Warning: Payment method required!",
      "offset": 26
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.iShouldSeeTheMessage(String)"
});
formatter.result({
  "duration": 65100,
  "status": "passed"
});
formatter.after({
  "duration": 690251300,
  "status": "passed"
});
formatter.uri("logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As user I want to login to my account",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2953631700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should navigate to login page successfully",
  "description": "",
  "id": "login-test;i-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select \"Login\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the returning customer text \"Returning Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 29300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 62918500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 1282818800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Returning Customer",
      "offset": 38
    }
  ],
  "location": "LoginTestSteps.iVerifyTheReturningCustomerText(String)"
});
formatter.result({
  "duration": 58080500,
  "status": "passed"
});
formatter.after({
  "duration": 723116500,
  "status": "passed"
});
formatter.before({
  "duration": 3088082600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I should login and logout successfully",
  "description": "",
  "id": "login-test;i-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Regression"
    },
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"Register\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter first name \"Priya\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter last name \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter email \"patelpriya4@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter telephone \"02756876567\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter password \"priyapassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter confirm password \"priyapassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select subscribe radio button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on privacy policy check box",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the success message \"Your Account Has Been Created!\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on continue button after account created",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I \"Logout\" of my account",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on continue button after account logout",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select \"Login\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter email address \"patelpriya4@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter password \"priyapassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify the my account text \"My Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I select \"Logout\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify the account logout text \"Account Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on continue button after account logout",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I have logged in and logged out successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 29900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 83796000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 22354490300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priya",
      "offset": 20
    }
  ],
  "location": "RegisterTestSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 86667100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "RegisterTestSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 78429200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "patelpriya4@gmail.com",
      "offset": 15
    }
  ],
  "location": "RegisterTestSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 95152800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02756876567",
      "offset": 19
    }
  ],
  "location": "RegisterTestSteps.iEnterTelephone(String)"
});
formatter.result({
  "duration": 80083500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyapassword1",
      "offset": 18
    }
  ],
  "location": "RegisterTestSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 75873800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyapassword1",
      "offset": 26
    }
  ],
  "location": "RegisterTestSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 68343700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iSelectSubscribeRadioButton()"
});
formatter.result({
  "duration": 50490700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnPrivacyPolicyCheckBox()"
});
formatter.result({
  "duration": 49856200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 449616400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Account Has Been Created!",
      "offset": 30
    }
  ],
  "location": "RegisterTestSteps.iVerifyTheSuccessMessage(String)"
});
formatter.result({
  "duration": 42673300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnContinueButtonAfterAccountCreated()"
});
formatter.result({
  "duration": 260668700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 64337400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 3
    }
  ],
  "location": "RegisterTestSteps.iOfMyAccount(String)"
});
formatter.result({
  "duration": 356511600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnContinueButtonAfterAccountLogout()"
});
formatter.result({
  "duration": 1426219900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 57980800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 1292109100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "patelpriya4@gmail.com",
      "offset": 23
    }
  ],
  "location": "LoginTestSteps.iEnterEmailAddress(String)"
});
formatter.result({
  "duration": 108329000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyapassword1",
      "offset": 18
    }
  ],
  "location": "RegisterTestSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 78007800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 371596200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 30
    }
  ],
  "location": "LoginTestSteps.iVerifyTheMyAccountText(String)"
});
formatter.result({
  "duration": 41840200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 51013700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 1399578400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Logout",
      "offset": 34
    }
  ],
  "location": "LoginTestSteps.iVerifyTheAccountLogoutText(String)"
});
formatter.result({
  "duration": 46019600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnContinueButtonAfterAccountLogout()"
});
formatter.result({
  "duration": 1441072100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iHaveLoggedInAndLoggedOutSuccessfully()"
});
formatter.result({
  "duration": 22200,
  "status": "passed"
});
formatter.after({
  "duration": 700002500,
  "status": "passed"
});
formatter.uri("registertest.feature");
formatter.feature({
  "line": 1,
  "name": "Register Test",
  "description": "As user I want to Register an account",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2149908000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should navigate to register page successfully",
  "description": "",
  "id": "register-test;i-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select \"Register\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the register text \"Register Account\"",
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 62583200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 21575955000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 28
    }
  ],
  "location": "RegisterTestSteps.iVerifyTheRegisterText(String)"
});
formatter.result({
  "duration": 50850600,
  "status": "passed"
});
formatter.after({
  "duration": 663660900,
  "status": "passed"
});
formatter.before({
  "duration": 2140668800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I should register account successfully",
  "description": "",
  "id": "register-test;i-should-register-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Regression"
    },
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"Register\" in account options",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the register text \"Register Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter first name \"Priya\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter last name \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter email \"patelpriya103@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter telephone \"02756876567\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter password \"priyapassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter confirm password \"priyapassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select subscribe radio button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on privacy policy check box",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify the success message \"Your Account Has Been Created!\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on continue button after account created",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I \"Logout\" of my account",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the account logout text \"Account Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on continue button after account logout",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I should be successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 15900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 65780500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "RegisterTestSteps.iSelectInAccountOptions(String)"
});
formatter.result({
  "duration": 21822342200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 28
    }
  ],
  "location": "RegisterTestSteps.iVerifyTheRegisterText(String)"
});
formatter.result({
  "duration": 41038400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priya",
      "offset": 20
    }
  ],
  "location": "RegisterTestSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 71416900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "RegisterTestSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 86636800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "patelpriya103@gmail.com",
      "offset": 15
    }
  ],
  "location": "RegisterTestSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 99063200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02756876567",
      "offset": 19
    }
  ],
  "location": "RegisterTestSteps.iEnterTelephone(String)"
});
formatter.result({
  "duration": 74211300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyapassword1",
      "offset": 18
    }
  ],
  "location": "RegisterTestSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 73605500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyapassword1",
      "offset": 26
    }
  ],
  "location": "RegisterTestSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 77410600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iSelectSubscribeRadioButton()"
});
formatter.result({
  "duration": 51758000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnPrivacyPolicyCheckBox()"
});
formatter.result({
  "duration": 51945700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 425424300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Account Has Been Created!",
      "offset": 30
    }
  ],
  "location": "RegisterTestSteps.iVerifyTheSuccessMessage(String)"
});
formatter.result({
  "duration": 38595400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnContinueButtonAfterAccountCreated()"
});
formatter.result({
  "duration": 246523700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 59456700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 3
    }
  ],
  "location": "RegisterTestSteps.iOfMyAccount(String)"
});
formatter.result({
  "duration": 377411600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Logout",
      "offset": 34
    }
  ],
  "location": "LoginTestSteps.iVerifyTheAccountLogoutText(String)"
});
formatter.result({
  "duration": 50204000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnContinueButtonAfterAccountLogout()"
});
formatter.result({
  "duration": 1460284400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iShouldBeSuccessfullyRegistered()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.after({
  "duration": 672077600,
  "status": "passed"
});
formatter.uri("topmenutest.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "As user I want to navigate to Top Menu Tabs",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2156695100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I should navigate to Desktops page successfully",
  "description": "",
  "id": "top-menu-test;i-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I hover on \"Desktops\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Desktops page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 20000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 408325000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3393356000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuTestSteps.iShouldNavigateToDesktopsPageSuccessfully()"
});
formatter.result({
  "duration": 44757500,
  "status": "passed"
});
formatter.after({
  "duration": 711761400,
  "status": "passed"
});
formatter.before({
  "duration": 2054061400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "I should navigate to laptops and notebook page successfully",
  "description": "",
  "id": "top-menu-test;i-should-navigate-to-laptops-and-notebook-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regression"
    },
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover on \"Laptops \u0026 Notebooks\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click \"Show All Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to Laptops \u0026 Notebooks page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 18100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops \u0026 Notebooks",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 564774900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Laptops \u0026 Notebooks",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 3971941700,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuTestSteps.iShouldNavigateToLaptopsNotebooksPageSuccessfully()"
});
formatter.result({
  "duration": 67277800,
  "status": "passed"
});
formatter.after({
  "duration": 695389400,
  "status": "passed"
});
formatter.before({
  "duration": 2247328300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I should navigate to Components page successfully",
  "description": "",
  "id": "top-menu-test;i-should-navigate-to-components-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I hover on \"Components\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click \"Show All Components\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should navigate to Components page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 20700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Components",
      "offset": 12
    }
  ],
  "location": "TopMenuTestSteps.iHoverOn(String)"
});
formatter.result({
  "duration": 734039600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Components",
      "offset": 9
    }
  ],
  "location": "TopMenuTestSteps.iClick(String)"
});
formatter.result({
  "duration": 4952849700,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuTestSteps.iShouldNavigateToComponentsPageSuccessfully()"
});
formatter.result({
  "duration": 43527800,
  "status": "passed"
});
formatter.after({
  "duration": 705327100,
  "status": "passed"
});
});