package com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RozetkaHomeFactoryPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css="ul.menu-categories_type_main>li:nth-child(1)>a")
    private WebElement mainMenu;

    @FindBy(css = "li:first-child>a[href$=\"monitors/c80089/\"]")
    private WebElement monitorsMenu;

    public RozetkaHomeFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public WebElement chooseMonitorsMenu(){
       return mainMenu;
    }

    public void waitForMonitorMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(monitorsMenu));
    }

    public void clickOnMonitorsMenu(){
        monitorsMenu.click();
    }

}
