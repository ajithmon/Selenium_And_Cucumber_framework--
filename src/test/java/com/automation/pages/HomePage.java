package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamBurgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement CatSelelct;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    List<WebElement>ItemsInThePage;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement>PriceOfItem;

    public boolean isHomePageDisplayed() {
        return shoppingCartLink.isDisplayed();
    }

    public void clickOnAddToCartOfFirstItem() {
        addToCartBtnList.get(0).click();
    }

    public void clickOnShoppingCartLink() {
        shoppingCartLink.click();
    }

    public String getCartIconQty() {
        return shoppingCartLink.findElement(By.xpath("./span")).getText();
    }

    public void clickOnHamburgerMenu() {
        hamBurgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }
    public void SelectCategory(){
        CatSelelct.click();
        CatSelelct.findElement(By.xpath("./option[@value='za']")).click();
    }
    public void SelectHighToLow(){
        CatSelelct.click();
        CatSelelct.findElement(By.xpath("./option[@value='hilo']")).click();
    }
    public String VerifyFirstItem(){
            return ItemsInThePage.get(0).getText();
    }
    public String VerifyFirstPrice(){
        String price = PriceOfItem.get(0).getText().replace("$","");
        return price;
    }
    public void CliclOnAllItems(){
        for(WebElement element:addToCartBtnList){
            element.click();
        }
    }
    public boolean removeButtonCheck(){
        for(WebElement ele:addToCartBtnList){
            String el=ele.getText();
            if(el=="Remove"){
                return false;
            }
        }
        return true;
    }
}