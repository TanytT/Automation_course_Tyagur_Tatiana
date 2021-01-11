package com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductFactoryPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css ="app-buy-button>button>span.buy-button__label")
    private WebElement btnLabel;
    @FindBy(css = "div.tabs")
    private WebElement menuTabs;
    @FindBy(css = "button.compare-button")
    private WebElement btnComp;
    @FindBy(css = "button.compare-button_state_active")
    private WebElement compareBtnActive;
    @FindBy(css = "button>span.header-actions__button-counter")
    private WebElement compareCount;
    @FindBy(css = ".header-actions__button-icon")
    private WebElement compareBtnInHeader;
    @FindBy(css = "li.comparison-modal__item>.comparison-modal__link")
    private WebElement monitorsBtnInCompareAlert;

    public ProductFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

     public void waitBuyButton(){
         wait.until(ExpectedConditions.elementToBeClickable(btnComp));
     }

    public void clickOnCompareButton(){
        btnComp.click();
    }

    public void waitCompareElement(){
        wait.until(ExpectedConditions.elementToBeClickable(compareCount));
    }

    public int getCntCompareElements(){
        return Integer.parseInt(compareCount.getText());
    }

    public void clickOnCompareButtonInHeader(){
        compareBtnInHeader.click();
    }

    public void clickOnMonitorsInCompareAlert(){
        monitorsBtnInCompareAlert.click();
    }

    public WebElement chooseMenuTabsBtn() {
        return menuTabs;
    }
    public void waitMenuTabsBtn() {
        wait.until(visibilityOf(menuTabs));
    }

    public void waitForCompareChoose(){
        wait.until(visibilityOf(compareBtnActive));
    }
}
