package com.company.homeworks.HW25.citrusFragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusPages.ProductListPage;

import static com.codeborne.selenide.Selenide.*;

public class BasketFragment {

    private SelenideElement basketWidget = $("div.el-dialog");
    private ElementsCollection productNamesInBasket = $$x("//div[@class='ctrs-basket-product__code']/preceding-sibling::a");
    private SelenideElement basketTotalPrice = $x("//span[@class='ctrs-main-price ctrs-basket-footer__new-price']");
    private SelenideElement closeBasketButton = $(".el-dialog__close.el-icon.el-icon-close");
    private ElementsCollection productPricesInBasket = $$x("//div[@class='ctrs-basket-product__code']/following-sibling::div/div");
    private SelenideElement basketInMenuButton = $(".ctrs-basket-mini-icon");
    private ElementsCollection allProductsOnPage = $$(".short-itm-desc");

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
