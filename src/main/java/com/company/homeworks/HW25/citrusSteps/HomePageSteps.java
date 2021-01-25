package com.company.homeworks.HW25.citrusSteps;

import com.company.homeworks.HW25.citrusPages.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps {


     HomePage homePage = new HomePage();


    @Step("Click on link in menu")
    public void clickOnLinkInMenu(int indexOfCategory,String linkOnMenu) {
        homePage.waitForLoad()
                .closePopUp();
        homePage.hoverMenuLine(indexOfCategory)
                .clickOnLinkInMenu(linkOnMenu);
    }

    @Step("Search product by name in search line")
    public void searchProductByNameInSearchLine(String productName) {
        homePage.waitForLoad()
                .closePopUp();
        homePage.getSearchFragment().searchProduct(productName);
    }

    @Step("Click on Link in menu TV")
    public void clickOnLinkInMenuTV(int i, String nameSamsung) {
                homePage.waitForLoad()
                .closePopUp();
        homePage.hoverMenuLine(i)
                .clickOnLinkInMenuTV(nameSamsung);
    }

    @Step("Click on link in menu laptops")
    public void clickOnLinkInMenuNotes(String acer) {
                homePage.waitForLoad()
                .closePopUp();
        homePage.hoverMenuLine(8)
                .clickOnLinkInMenuNotebooks(acer);
    }
}
