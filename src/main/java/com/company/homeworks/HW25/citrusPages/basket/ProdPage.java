package com.company.homeworks.HW25.citrusPages.basket;

import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProdPage extends BasePage{

    BasketFragment basketFragment = new BasketFragment();

    SelenideElement productPrice = $$x("//div[@class = 'price']/span/span").first();
    SelenideElement buyButton = $$("div.normal button.btn.orange.full").first();

    public String readProductPrice() {

        return productPrice.getText();
    }

    public ProdPage clickBuyButton() {
        buyButton.click();
        return this;
    }
    public BasketFragment getBasketFragment() {
        return basketFragment;
    }

}
