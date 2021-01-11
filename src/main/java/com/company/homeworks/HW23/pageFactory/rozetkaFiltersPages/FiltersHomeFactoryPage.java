package com.company.homeworks.HW23.pageFactory.rozetkaFiltersPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class FiltersHomeFactoryPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input[name=search]")
    private WebElement inputSearch;
    @FindBy (css = "a[href*=\"/mobile-phones\"]>span:first-child")
    private WebElement mobPhone;

    public FiltersHomeFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public void inputSearchWord(String search){
        inputSearch.sendKeys(search+ Keys.ENTER);
    }

    public void waitMonitorsMenu(){
        wait.until(visibilityOf(mobPhone));
    }

    public void clickOnMonitorsLink(){
        mobPhone.click();
    }
}
