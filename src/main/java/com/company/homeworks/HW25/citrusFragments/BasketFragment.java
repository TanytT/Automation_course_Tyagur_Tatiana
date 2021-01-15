package com.company.homeworks.HW25.citrusFragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusPages.basket.ProductListPage;

import static com.codeborne.selenide.Selenide.*;

public class BasketFragment {

    SelenideElement basketWidget = $("div.el-dialog");
    ElementsCollection productNamesInBasket = $$x("//div[@class='ctrs-basket-product__code']/preceding-sibling::a");
    SelenideElement basketTotalPrice = $x("//span[@class='ctrs-main-price ctrs-basket-footer__new-price']");
    SelenideElement closeBasketButton = $(".el-dialog__close.el-icon.el-icon-close");
    ElementsCollection productPricesInBasket = $$x("//div[@class='ctrs-basket-product__code']/following-sibling::div/div");
    SelenideElement basketInMenuButton = $(".ctrs-basket-mini-icon");
    ElementsCollection allProductsOnPage = $$(".short-itm-desc");

    public SelenideElement getBasketWidget() {
        return basketWidget;
    }

    public ElementsCollection getBasketProductList() {
        return productNamesInBasket;
    }

    public SelenideElement getBasketTotal() {
        return basketTotalPrice;
    }

    public SelenideElement getCloseBasketButton() {
        closeBasketButton.click();
        return null;
    }

    public ElementsCollection getProductPricesInBasket() {
        return productPricesInBasket;
    }
    public ProductListPage getOpenBasketFromHeader() {
        basketInMenuButton.click();
        return null;
    }
    public BasketFragment addProductsToBasket(int index) {
        allProductsOnPage.get(index).$(".icon-new-citrus-cart.el-tooltip.item").click();
        return this;
    }
}
