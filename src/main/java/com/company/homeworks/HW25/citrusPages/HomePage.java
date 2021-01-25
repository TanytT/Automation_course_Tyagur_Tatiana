package com.company.homeworks.HW25.citrusPages;

import com.company.homeworks.HW25.citrusFragments.SearchFragment;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    private SearchFragment searchFragment = new SearchFragment();

    public HomePage hoverMenuLine(int indexOfcategory) {
        $("div.menu--desktop__drop-list.show li:nth-child("+indexOfcategory+") span.title").hover();
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

    public void closePopUp() {
        super.closePopUp();
    }

    public SearchFragment getSearchFragment() {
        return searchFragment;
    }

    public HomePage clickOnLinkInMenuNotebooks(String name) {
        $("div.menu--desktop__drop-list.show a[title*='"+name+"']>span").click();
        return this;
    }
}
