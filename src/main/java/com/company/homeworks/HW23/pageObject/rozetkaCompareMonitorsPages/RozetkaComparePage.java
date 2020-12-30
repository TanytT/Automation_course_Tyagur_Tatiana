package com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RozetkaComparePage {
    WebDriver driver;
    WebDriverWait wait;
    By cntCompareMonitBy = By.xpath("//rz-products-section/ul/li");
    By monitor1By = By.cssSelector("li:last-child div.product__heading>a");
    By price1By = By.cssSelector("li:last-child div.product__prices>div");
    By monitor2By = By.cssSelector("li:first-child div.product__heading>a");
    By price2By = By.cssSelector("li:first-child div.product__prices>div");

    public RozetkaComparePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void waitOfMonitorsOnComparePage(){
        wait.until(presenceOfElementLocated(cntCompareMonitBy));
    }

    public int countOfCompareElements(){
        return driver.findElements(cntCompareMonitBy).size();
    }

    public String nameOfCompareMonitor1(){
       return driver.findElement(monitor1By).getText();
    }

    public String nameOfCompareMonitor2(){
        return driver.findElement(monitor2By).getText();
    }

    private WebElement getPriceMonitor(By priceBy){
        return driver.findElement(priceBy);
    }

    public Double checkMonitor1Price(){
        WebElement price = getPriceMonitor(price1By);
        String []priceArr1=price.getText().split("₴");
        return Double.parseDouble(priceArr1[1].replace(" ",""));
    }
    public Double checkMonitor2Price(){
        WebElement price2 = getPriceMonitor(price2By);
        String []priceArr2=price2.getText().split("₴");
        return Double.parseDouble(priceArr2[1].replace(" ",""));
    }

}
