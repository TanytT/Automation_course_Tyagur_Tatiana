package com.company.homeworks.HW25.citrusPages.basket;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import java.text.NumberFormat;

import static com.codeborne.selenide.Selenide.*;

public class ProductListPage extends BasePage{

    BasketFragment basketFragment = new BasketFragment();
    ElementsCollection allProductsOnPage = $$(".short-itm-desc");
    ElementsCollection allComparisonButtons = $$(".icon-comparison2");
    SelenideElement compareCounter = $(".counter");

    public ProductListPage clickOnProductByName(String productName) {
        $x("//span[contains(text(),'"+productName+"')]").click();
        return this;
    }

    public ProductListPage waitForLoad(){
        super.waitForLoad();
        return this;
    }

    public ProductListPage closePopUp() {
        super.closePopUp();
        return this;
    }

    public String readProductPriceFromListByName(String productName) {
        return $x("//h5[contains(text(),'"+productName+"')]/../../..//div[@class='base-price']/span").getText();
    }

    public ProductListPage addProductToBasket(String productName) {
        $x("//h5[contains(text(),'"+productName+"')]/../../..//i[@class='icon-new-citrus-cart el-tooltip item']").click();
        return this;
    }

    public String readProductPriceFromList(int index) {
        return allProductsOnPage.get(index).$(".price-number").getText();
    }
    public String readProductNameFromList(int index) {
        return allProductsOnPage.get(index).$(".title-itm").getText();
    }

    public String countTotalPriceInBasket(String price1, String price2) {
        double total = Double.parseDouble(price1.replace(" ","")) + Double.parseDouble(price2.replace(" ",""));
        return convertPrice(total);
    }
    private static String convertPrice(double value) {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(value);
    }

    public ProductListPage clickComparisonButton(int index) {
        allComparisonButtons.get(index).click();
        return this;
    }

    public BasketFragment getBasketFragment() {
        return basketFragment;
    }

    public SelenideElement checkCompareCounter() {
        return compareCounter;
    }
}
