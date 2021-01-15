package com.company.homeworks.HW25.citrusPages.basket;

import com.company.homeworks.HW25.citrusFragments.SearchFragment;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    SearchFragment searchFragment = new SearchFragment();

    public HomePage hoverMenuLine(String menuLineText) {
        $x("//div[contains(@class,'show')]//span[contains(text(),'"+menuLineText+"')]").hover();
        return this;
    }

    public HomePage clickOnLinkInMenu(String linkText) {
        $x("//a[contains(@href,'smartfony/brand-apple')]/span[contains(text(),'"+linkText+"')]").click();
        return this;
    }

    public HomePage waitForLoad(){
        super.waitForLoad();
        return this;
    }

    public HomePage closePopUp() {
        super.closePopUp();
        return this;
    }

    public SearchFragment getSearchFragment() {
        return searchFragment;
    }
}
