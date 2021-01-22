package com.company.homeworks.HW25.citrusPages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import java.text.NumberFormat;

import static com.codeborne.selenide.Selenide.*;

public class ProductListPage extends BasePage {

    BasketFragment basketFragment = new BasketFragment();
    ElementsCollection allProductsOnPage = $$(".short-itm-desc");
    ElementsCollection allComparisonButtons = $$(".icon-comparison2");
    ElementsCollection allNamesOfProducts = $$(".product-card__name");
    ElementsCollection allPricesOfProducts = $$(".prices__price .price");
    ElementsCollection filterPriceField = $$(".el-input__inner");
    SelenideElement compareCounter = $(".counter");
    ElementsCollection productProperties = $$(".properties__items");

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

    public String readProductPriceFromList(int indexOfProd) {
        return allProductsOnPage.get(indexOfProd).$(".price-number").getText();
    }

    public String readProductNameFromList(int indexOfProd) {
        return allProductsOnPage.get(indexOfProd).$(".title-itm").getText();
    }

    public String countTotalPriceInBasket(String price1, String price2) {
        double total = Double.parseDouble(price1.replace(" ","")) + Double.parseDouble(price2.replace(" ",""));
        return convertPrice(total);
    }

    private static String convertPrice(double value) {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(value);
    }

    public ProductListPage clickComparisonButton(int indexOfProd) {
        allComparisonButtons.get(indexOfProd).click();
        return this;
    }

    public BasketFragment getBasketFragment() {
        return basketFragment;
    }

    public SelenideElement checkCompareCounter() {
        return compareCounter;
    }

    public ProductListPage fillInSearchPriceFilter(String price,int indexOfField){
        filterPriceField.get(indexOfField).pressEnter().val(price).pressEnter();
        return this;
    }

    public ElementsCollection getAllProductNames() {
        return allNamesOfProducts;
    }

    public SelenideElement getAllProductPrices(String priceFrom, String priceTo) {
        int cnt=0;
        int to = Integer.parseInt(priceTo);
        int from =Integer.parseInt(priceFrom);
        for (int i = 0; i < allPricesOfProducts.size(); i++) {
            int el = Integer.parseInt(allPricesOfProducts.get(i).getText().replace(" ",""));
            if(el>=from && el<=to){
                cnt++;
            }
        }
    return allPricesOfProducts.get(cnt-1);
    }

    public ProductListPage checkFilter(String filter) {
        $x("//a[text()='"+filter+"']").click();
        return this;
    }

    public int checkMaterial(String material){
        int cnt=0;
        for(int i=0; i<productProperties.size(); i++){
            productProperties.get(i).$x("//span[contains(text(),'"+ material +"')]");
            cnt++;
        }
        return cnt;
    }

    public String readProductPriceFromListNotebooks(int indexOfProd) {
        return allPricesOfProducts.get(indexOfProd).getText();
    }

    public ProductListPage hoverOnCompButton(int indexOfProd) {
        allComparisonButtons.get(indexOfProd).hover();
        return this;
    }
}
