package com.company.homeworks.HW25.citrusPages;

import com.codeborne.selenide.ElementsCollection;
import com.company.homeworks.HW25.citrusFragments.BasketFragment;

import static com.codeborne.selenide.Selenide.$$;

public class ComparisonPage extends BasePage {

    private BasketFragment basketFragment = new BasketFragment();
    private ElementsCollection productListInCompare = $$(".relative ");
    private ElementsCollection namesOfNotes = $$(".header-block .name");

    public void closePopUp() {
        super.closePopUp();
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
