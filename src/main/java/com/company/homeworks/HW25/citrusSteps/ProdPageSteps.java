package com.company.homeworks.HW25.citrusSteps;

import com.codeborne.selenide.Condition;
import com.company.homeworks.HW25.citrusPages.ProdPage;
import io.qameta.allure.Step;

public class ProdPageSteps {

    private ProdPage productPage = new ProdPage();

    @Step("Add product to basket")
    public String addProductToTheBasket() {
        productPage.clickBuyButton();
        return productPage.readProductPrice();
    }

    @Step("Verify basket fragment")
    public void verifyBasketContent(String productName, String productPrice) {
        productPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productPage.getBasketFragment().getBasketProductList().shouldHaveSize(1);
        productPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName));
        productPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(productPrice));
    }


}
