package com.company.homeworks.HW25.citrusPages;

import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProdPage extends BasePage {

    private BasketFragment basketFragment = new BasketFragment();

    private SelenideElement productPrice = $$(".buy-section__new-price").first();
    private SelenideElement buyButton = $$(".buy-section__buy-btn").first();

    public String readProductPrice() {
        return productPrice.getText().substring(0,6).trim();
    }

    public ProdPage clickBuyButton() {
        buyButton.click();
        return this;
    }
    public BasketFragment getBasketFragment() {
        return basketFragment;
    }

}
