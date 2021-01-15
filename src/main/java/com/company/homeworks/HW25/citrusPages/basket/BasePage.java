package com.company.homeworks.HW25.citrusPages.basket;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    SelenideElement closePopUpButton = $("i.el-icon-close");

    public BasePage waitForLoad() {
        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),15);
        wait.until(webDriver -> ((JavascriptExecutor)WebDriverRunner.getWebDriver()).executeScript("return document.readyState").toString().equals("complete"));
        return null;
    }

    public BasePage closePopUp() {

        if(closePopUpButton.isDisplayed()){
            closePopUpButton.click();
        }
        return null;
    }
}
