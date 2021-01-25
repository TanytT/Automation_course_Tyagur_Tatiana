package com.company.homeworks.HW25.citrusSteps;


import com.codeborne.selenide.Condition;
import com.company.homeworks.HW25.citrusPages.ComparisonPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;


public class ComparisonPageSteps {
    private ComparisonPage comparisonPage = new ComparisonPage();

    @Step("Check count of products on comparison page")
    public void checkCountOfProductsOnComparisonPage() {
        comparisonPage.waitForLoad()
                .closePopUp();
        comparisonPage.getListProducts().shouldHaveSize(2);
    }

    @Step("Add products to basket")
    public void addProductsToBasket() {
        comparisonPage.getBasketFragment().addProductsToBasket(0)
                .closeBasketButton();
        comparisonPage.getBasketFragment().addProductsToBasket(2)
                .closeBasketButton();
        comparisonPage.getBasketFragment().openBasketFromHeader();
    }

    @Step("Verify products on comparison" )
    public void verifyProductsOnComparison(String productName1, String productPrice1, String productName2, String productPrice2, String totalPrice) {
        comparisonPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        comparisonPage.getBasketFragment().getBasketProductList().shouldHaveSize(2);
        comparisonPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName1));
        comparisonPage.getBasketFragment().getProductPricesInBasket().get(0).shouldHave(Condition.text(productPrice1));
        comparisonPage.getBasketFragment().getBasketProductList().get(1).shouldHave(Condition.text(productName2));
        comparisonPage.getBasketFragment().getProductPricesInBasket().get(1).shouldHave(Condition.text(productPrice2));
        comparisonPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(totalPrice));
    }

    @Step("Verify two products on comparison")
    public void verifyTwoProductsOnComparison(String notebookName2,String notebookPrice1, String notebookName1,String notebookPrice2){
        comparisonPage.waitForLoad()
                .closePopUp();
        comparisonPage.getListProducts().shouldHaveSize(2);
        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName2)).shouldHaveSize(1);
        comparisonPage.getListProducts().filter(Condition.text(notebookPrice1)).shouldHaveSize(1);
        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName1.substring(0,40))).shouldHaveSize(1);
        comparisonPage.getListProducts().filter(Condition.text(notebookPrice2)).shouldHaveSize(1);
        open("/");
    }

    @Step("Verify Comparison page")
    public void verifyComparisonPage(String notebookPrice3,String notebookName3) {
        comparisonPage.waitForLoad();
        comparisonPage.closePopUp();
        comparisonPage.getListProducts().shouldHaveSize(3);
        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName3.substring(0,40))).shouldHaveSize(1);
        comparisonPage.getListProducts().filter(Condition.text(notebookPrice3)).shouldHaveSize(1);
    }
}
