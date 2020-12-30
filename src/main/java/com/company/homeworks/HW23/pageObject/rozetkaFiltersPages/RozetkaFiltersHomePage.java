package com.company.homeworks.HW23.pageObject.rozetkaFiltersPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RozetkaFiltersHomePage {
    WebDriver driver;
    WebDriverWait wait;
    By inputSearchBy = By.cssSelector("input[name=search]");
    By mobPhoneBy = By.cssSelector("a[href*=\"/mobile-phones\"]>span:first-child");

    public RozetkaFiltersHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public void inputSearchWord(String search){
        driver.findElement(inputSearchBy).sendKeys(search+ Keys.ENTER);
    }
    public void waitMonitorsMenu(){
        wait.until(presenceOfElementLocated(mobPhoneBy));
    }

    public void clickOnMonitorsLink(){
        driver.findElement(mobPhoneBy).click();
    }
}
