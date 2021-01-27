package com.company.homeworks.HW25.citrusSteps;

import com.codeborne.selenide.Condition;
import com.company.homeworks.HW25.citrusPages.ProductListPage;
import io.qameta.allure.Step;

public class ProductListPageSteps {

    private ProductListPage productListPage = new ProductListPage();

    @Step("Click on product by name")
    public void clickOnProduct(String productName) {
        productListPage.waitForLoad();
        productListPage.closePopUp();
        productListPage.clickOnProductByName(productName);
    }
    @Step("Load product list page")
    public void pageProductListLoad() {
        productListPage.waitForLoad();
        productListPage.closePopUp();
    }


    @Step("Add product to basket and remember price")
    public String addProductToBasket(String productName) {
        productListPage.addProductToBasket(productName);
        return productListPage.readProductPriceFromListByName(productName);
    }

    @Step("Verify basket content")
    public void verifyBasketContent(String productName, String productPrice) {
        productListPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productListPage.getBasketFragment().getBasketProductList().shouldHaveSize(1);
        productListPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName));
        productListPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(productPrice));
    }

    @Step("Read product price")
    public String readProductPrice(int indexOfProd) {
        return productListPage.readProductPriceFromList(indexOfProd);
    }

    @Step("Read product name")
    public String readProductName(int indexOfProd) {
        return productListPage.readProductNameFromList(indexOfProd);
    }

    @Step("Count total price")
    public String countTotalPrice(String productPrice1, String productPrice2) {
        return productListPage.countTotalPriceInBasket(productPrice1,productPrice2);
    }

    @Step("Add products to basket")
    public void addProductsToBasket() {
        productListPage.getBasketFragment().addProductsToBasket(0).closeBasketButton();
        productListPage.getBasketFragment().addProductsToBasket(1).closeBasketButton();
        productListPage.getBasketFragment().openBasketFromHeader();
    }

    @Step("Verify two products in basket")
    public void verifyTwoProductsInBasket(String productName1,String productPrice1, String productName2, String productPrice2, String totalPrice) {
        productListPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productListPage.getBasketFragment().getBasketProductList().shouldHaveSize(2);
        productListPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName1));
        productListPage.getBasketFragment().getProductPricesInBasket().get(0).shouldHave(Condition.text(productPrice1));
        System.out.println(productName2);
        System.out.println(productListPage.getBasketFragment().getBasketProductList().get(1));
        productListPage.getBasketFragment().getBasketProductList().get(1).shouldHave(Condition.text(productName2));
        productListPage.getBasketFragment().getProductPricesInBasket().get(1).shouldHave(Condition.text(productPrice2));
        productListPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(totalPrice));
    }

    @Step("Add to Comparison")
    public void clickOnComparison() {
        productListPage.clickComparisonButton(1)
                .checkCompareCounter().shouldHave(Condition.text("1"));
        productListPage.clickComparisonButton(2)
                .clickComparisonButton(0);
    }

    @Step("Check on filter checkbox")
    public void checkFilter(int ind1, int ind2) {
        productListPage.checkFilter(ind1, ind2).waitForLoad();
    }

    @Step("Verify memory and name of product")
    public void verifyMemoryAndNameOfProducts(String nameSamsung) {
        productListPage.getAllProductNames().filterBy(Condition.text(nameSamsung)).shouldHaveSize(47);
        productListPage.getAllProductNames()
                .filterBy(Condition.or("64GbOR128Gb",Condition.text("64Gb"),Condition.text("128Gb"))).shouldHaveSize(47);
    }

    @Step("Verify material and name of products")
    public void verifyMaterialAndNameOfProducts(String nameMotorola) {
        productListPage.getAllProductNames().shouldHaveSize(productListPage.checkMaterial());
        productListPage.getAllProductNames().filterBy(Condition.text(nameMotorola)).shouldHaveSize(3);
    }

    @Step("Fill in price filter")
    public void fillInPriceFilters(String fromPrice, int indexOdProd1, String toPrice, int indexOdProd2) {
        productListPage.fillInSearchPriceFilter(fromPrice,indexOdProd1).waitForLoad();
        productListPage.fillInSearchPriceFilter(toPrice,indexOdProd2).waitForLoad();

    }

    @Step("Verify price and name of products")
    public void verifyPriceAndNameOfProducts(String nameSamsung, String fromPrice, String toPrice) {
        productListPage.closePopUp();
        productListPage.getAllProductNames().filterBy(Condition.text(nameSamsung)).shouldHaveSize(10);
        productListPage.getAllProductPrices(fromPrice,toPrice).shouldHave(Condition.text("16 999"));
    }

    @Step("Read price of laptops")
    public String readPriceOfProductNote(int IndexOfProd) {
        return productListPage.readProductPriceFromListNotebooks(IndexOfProd);
    }

    @Step("Read name of laptops")
    public String readNameOfProductNote(int indexOfProd) {
        return productListPage.getAllProductNames().get(indexOfProd).getText();
    }

    @Step("Add two laptops to comparison")
    public void addTwoLaptopsToComparison() {
        productListPage.hoverOnCompButton(1)
                .closePopUp();

        productListPage.hoverOnCompButton(1)
                .clickComparisonButton(1)
                .checkCompareCounter().shouldBe(Condition.visible).shouldHave(Condition.text("1"));
        productListPage.hoverOnCompButton(2)
                .clickComparisonButton(2)
                .clickComparisonButton(0);
    }

    @Step("Load page an close popup")
    public void loadPageAndHover() {
                productListPage.waitForLoad();
        productListPage.hoverOnCompButton(1)
                .closePopUp();
    }

    @Step("Add product three to comparison")
    public void addProductThreeToComparison() {
        productListPage.closePopUp();
        productListPage.hoverOnCompButton(3)
                .clickComparisonButton(3)
                .checkCompareCounter().shouldBe(Condition.visible).shouldHave(Condition.text("3"));
        productListPage.clickComparisonButton(0);
    }
}
