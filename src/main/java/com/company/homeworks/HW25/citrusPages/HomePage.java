package com.company.homeworks.HW25.citrusPages;

import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusFragments.SearchFragment;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    SearchFragment searchFragment = new SearchFragment();
    SelenideElement linkInMenuNotebooks = $(".item li:nth-child(5)>a[href^='/noutbuki']");

    public HomePage hoverMenuLine(String menuLineText) {
        $x("//div[contains(@class,'show')]//span[contains(text(),'"+menuLineText+"')]").hover();
        return this;
    }

    public HomePage clickOnLinkInMenu(String linkText) {
        $x("//a[contains(@href,'smartfony/brand-"+linkText.toLowerCase()+"')]/span[text()='"+linkText+"']").click();
        return this;
    }
    public HomePage clickOnLinkInMenuTV(String linkText) {
        $x("//a[@href='/televizory/brand-"+linkText.toLowerCase()+"/']/span[contains(text(),'"+linkText+"')]").click();
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

    public HomePage clickOnLinkInMenuNotebooks() {
        linkInMenuNotebooks.click();
        return this;
    }
}
