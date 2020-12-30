package com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaHomePage {
    WebDriver driver;
    WebDriverWait wait;
    By mainMenuBy = By.cssSelector("ul.menu-categories_type_main>li:nth-child(1)>a");
    By monitorsMenuBy = By.cssSelector("li:first-child>a[href$=\"monitors/c80089/\"]");

    public RozetkaHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public WebElement chooseMonitorsMenu(){
       return driver.findElement(mainMenuBy);
    }

    public void waitForMonitorMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(monitorsMenuBy));
    }

    public void clickOnMonitorsMenu(){
        driver.findElement(monitorsMenuBy).click();
    }


}
