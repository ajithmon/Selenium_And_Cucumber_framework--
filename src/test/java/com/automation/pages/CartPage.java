package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    WebElement checkOutBtn;

    @FindBy(xpath = "//div[@class='cart_list']/div[@class='cart_item']")
    List<WebElement> cartitems;

    public boolean isCartPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
        return checkOutBtn.isDisplayed();
    }
    public int cartAddedItemQty(){
        return cartitems.size();
    }

    public void clickOnCheckoutBtn() {
        checkOutBtn.click();
    }
}
