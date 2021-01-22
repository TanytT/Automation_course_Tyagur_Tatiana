package com.company.homeworks.HW25.citrusPages;

import com.codeborne.selenide.ElementsCollection;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import static com.codeborne.selenide.Selenide.$$;

public class ComparisonPage extends BasePage {

    BasketFragment basketFragment = new BasketFragment();
    ElementsCollection productListInCompare = $$(".relative ");
    ElementsCollection namesOfNotes = $$(".header-block .name");

    public ComparisonPage closePopUp() {
        super.closePopUp();
        return this;
    }

    public ComparisonPage waitForLoad(){
        super.waitForLoad();
        return this;
    }

    public ElementsCollection getListProducts() {
        return productListInCompare;
    }

    public BasketFragment getBasketFragment() {
        return basketFragment;
    }

    public ElementsCollection getAllNameOfNotebooks(){
        return namesOfNotes;
    }
}
