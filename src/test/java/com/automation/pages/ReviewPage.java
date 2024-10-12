package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    WebElement TotalPrice;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    WebElement ItemTotalPrice;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    WebElement ItemTotalTax;

    public boolean isReviewPageDisplayed() {
        return finishBtn.isDisplayed();
    }
    public void clickOnFinishBtn() {
        finishBtn.click();
    }

    public double allItemAddedPrice(){
        String price=ItemTotalPrice.getText().replace("Item total: $","");
        double price1=Double.parseDouble(price);
        return price1;
    }
    public double allItemAddedTaxPrice(){
        String tax=ItemTotalTax.getText().replace("Tax: $","");
        double tax1=Double.parseDouble(tax);
        return tax1;
    }
    public double allItemAddedTotal(){
        String total=TotalPrice.getText().replace("Total: $","");
        double total1=Double.parseDouble(total);
        return total1;
    }
}
