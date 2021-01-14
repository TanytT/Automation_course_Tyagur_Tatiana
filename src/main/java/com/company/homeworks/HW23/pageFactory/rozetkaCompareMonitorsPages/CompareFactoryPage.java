package com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CompareFactoryPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(xpath = "//rz-products-section/ul/li")
    private List<WebElement> cntCompareMonit;
    @FindBy(xpath = "//rz-products-section/ul/li[1]")
    private WebElement compareMonit;

    @FindBy(css = "li:last-child div.product__heading>a")
    private WebElement monitor1;
    @FindBy(css = "li:last-child div.product__prices>div")
    private WebElement price1;
    @FindBy(css = "li:first-child div.product__heading>a")
    private WebElement monitor2;
    @FindBy(css = "li:first-child div.product__prices>div")
    private WebElement price2;

    public CompareFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public void waitOfMonitorsOnComparePage(){
        wait.until(visibilityOf(compareMonit));
    }

    public int countOfCompareElements(){
        return cntCompareMonit.size();
    }

    public String nameOfCompareMonitor1(){
       return monitor1.getText();
    }

    public String nameOfCompareMonitor2(){
        return monitor2.getText();
    }

    private WebElement getPriceMonitor(WebElement price){
        return price;
    }

    public Double checkMonitor1Price(){
        WebElement priceRez1 = getPriceMonitor(price1);
        String []priceArr1=priceRez1.getText().split("₴");
        return Double.parseDouble(priceArr1[1].replace(" ",""));
    }
    public Double checkMonitor2Price(){
        WebElement priceRez2 = getPriceMonitor(price2);
        String []priceArr2= priceRez2.getText().split("₴");
        return Double.parseDouble(priceArr2[1].replace(" ",""));
    }

}
