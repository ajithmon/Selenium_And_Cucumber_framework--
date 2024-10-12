package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage=new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());

    }

    @When("user click on add to cart button of the first item")
    public void user_click_on_add_to_cart_button_of_the_first_item() {
        homePage.clickOnAddToCartOfFirstItem();

    }

    @Then("verify cart icon displays quantity one")
    public void verify_cart_icon_displays_quantity_one() {
        Assert.assertEquals(homePage.getCartIconQty(),"1");
    }

    @When("user click on cart icon")
    public void user_click_on_cart_icon() {
        homePage.clickOnShoppingCartLink();

    }

    @When("click on Z to A category")
    public void clickOnZToACategory() {
        homePage.SelectCategory();
    }

    @Then("verify product sorted in Z to A")
    public void verifyProductSortedInZToA() {
        Assert.assertEquals(homePage.VerifyFirstItem(),"Test.allTheThings() T-Shirt (Red)");
    }

    @When("click on High to Low")
    public void clickOnHighToLow() {
        homePage.SelectHighToLow();
    }

    @Then("verify product sorted in High to Low")
    public void verifyProductSortedInHighToLow() {
        Assert.assertEquals(homePage.VerifyFirstPrice(),"49.99");
    }

    @When("user add all items to cart")
    public void userAddAllItemsToCart() {
        homePage.CliclOnAllItems();
    }

    @Then("verify cart icon displays quantity of all")
    public void verifyCartIconDisplaysQuantityOfAll() {
        Assert.assertEquals(homePage.getCartIconQty(),"6");
    }

    @And("verify remove button is not available")
    public void verifyRemoveButtonIsNotAvailable() {
        Assert.assertTrue(homePage.removeButtonCheck());
    }
}
