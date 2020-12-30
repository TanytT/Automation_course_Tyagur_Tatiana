package com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RozetkaProductPage {
    WebDriver driver;
    WebDriverWait wait;
    By buttLabelBy = By.cssSelector("span.buy-button__label");
    By btnCompBy = By.cssSelector("button.compare-button");
    By compareCountBy = By.cssSelector("button>span.header-actions__button-counter");
    By compareBtnInHeaderBy = By.cssSelector(".header-actions__button-icon");
    By monitorsBtnInCompareAlertBy = By.cssSelector("li.comparison-modal__item>.comparison-modal__link");
    By compareBtnActiveBy = By.cssSelector("button.compare-button_state_active");

    public RozetkaProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

     public void waitBuyButton(){
         wait.until(presenceOfElementLocated(buttLabelBy));
     }

    public void clickOnCompareButton(){
        driver.findElement(btnCompBy).click();
    }

    public void waitCompareElement(){
        wait.until(presenceOfElementLocated(compareCountBy));
    }

    public int getCntCompareElements(){
        return Integer.parseInt(driver.findElement(compareCountBy).getText());
    }

    public void clickOnCompareButtonInHeader(){
        driver.findElement(compareBtnInHeaderBy).click();
    }

    public void clickOnMonitorsInCompareAlert(){
        driver.findElement(monitorsBtnInCompareAlertBy).click();
    }

    public void waitForCompareChoose(){
        wait.until(presenceOfElementLocated(compareBtnActiveBy));
    }

}
