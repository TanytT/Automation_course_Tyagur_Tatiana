package com.company.homeworks.HW25.citrusFragments;

import com.codeborne.selenide.SelenideElement;
import com.company.homeworks.HW25.citrusPages.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class SearchFragment {

    private SelenideElement searchInput = $("#search-input");
    private SelenideElement searchButtonSubmit = $(".global-search__submit");

    public HomePage searchProduct(String productName) {
        searchInput.val(productName);
        searchButtonSubmit.click();
        return null;
    }
}
