package com.company.homeworks.HW23.pageObject.rozetkaFiltersPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RozetkaFilterPhonePage {

    WebDriver driver;
    WebDriverWait wait;

    By appleBy = By.xpath("//label[contains(text(), \"Apple\")]");
    By huaweiBy = By.xpath("//label[contains(text(), \"Huawei\")]");
    By checkboxAppleBy = By.xpath("//a[@class='checkbox-filter__link']/input[@id='Apple']");
    By checkboxHuaweiBy = By.xpath("//a[@class='checkbox-filter__link']/input[@id='Huawei']");
    By checkboxSamsungBy = By.xpath("//a[@class='checkbox-filter__link']/input[@id='Samsung']");
    By appleFilterBtnBy = By.cssSelector("ul.catalog-selection__list>li:nth-child(2)>a");
    By huaweiFilterBtnBy = By.cssSelector("ul.catalog-selection__list>li:nth-child(3)>a");

    By phoneListBy = By.cssSelector("div.goods-tile__inner");
    By priceFromBy = By.cssSelector("div.slider-filter__inner>input:first-child");
    By priceToBy = By.cssSelector("div.slider-filter__inner>input:nth-child(3)");
    By filterBtnBy = By.cssSelector("ul.catalog-selection__list>li:nth-child(3)");
    By phoneNameBy = By.cssSelector("a.goods-tile__heading>span");
    By phonePriceBy = By.cssSelector("span.goods-tile__price-value");

    By phoneListByColor = By.cssSelector("div.goods-tile__colors>ul");
    By checkboxColorRedBy = By.cssSelector("div:nth-child(17) li:nth-child(6)>a");
    By colorCircle = By.cssSelector("li>a");
    By colorWithAttributeRed = By.cssSelector("span.goods-tile__colors-content");

    public RozetkaFilterPhonePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void clickAppleCheckbox(){
        driver.findElement(appleBy).click();
    }

    public boolean ifAppleChecked(){
        return Boolean.parseBoolean(driver.findElement(checkboxAppleBy).getAttribute("checked"));
    }
    public void clickHuaweiCheckbox(){
        driver.findElement(huaweiBy).click();
    }

    public boolean ifHuaweiChecked(){
        return Boolean.parseBoolean(driver.findElement(checkboxHuaweiBy).getAttribute("checked"));
    }

    public boolean ifSamsungChecked(){
        return Boolean.parseBoolean(driver.findElement(checkboxSamsungBy).getAttribute("checked"));
    }

    public void waitAppleFilterBtn(){
        wait.until(presenceOfElementLocated(appleFilterBtnBy));
    }
    public void waitHuaweiFilterBtn(){
        wait.until(presenceOfElementLocated(huaweiFilterBtnBy));
    }
    public List<WebElement> getPhoneListBy(){
        return driver.findElements(phoneListBy);
    }

    public boolean isSamsungHuaweiApplePhone(List <WebElement> mobList){
        boolean flag=true;
        for (WebElement elem: mobList) {
            String str = elem.findElement(phoneNameBy).getText();
            flag=str.contains("Samsung")||str.contains("Huawei")||str.contains("Apple");
            if(!flag){
                break;
            }
        }
        return flag;
    }
    public boolean isPhoneWithPrice(List <WebElement> mobList,String price1, String price2){
        boolean flagPrice = false;
        for (WebElement elemPrice: mobList) {
            String strPrice = elemPrice.findElement(phonePriceBy).getText();
            int intPrice = Integer.parseInt(strPrice.replace(" ",""));
            if((intPrice<=Integer.parseInt(price2))&&(intPrice>=Integer.parseInt(price1))){
                flagPrice = true;
            }
        }
        return flagPrice;
    }

    private WebElement price(By price){
        return driver.findElement(price);
    }
    public void setFirstPrice(String price){
        WebElement firstPrice = price(priceFromBy);
        firstPrice.clear();
        firstPrice.sendKeys(price+ Keys.TAB);
    }
    public void setSecondPrice(String price){
        WebElement secondPrice = price(priceToBy);
        secondPrice.clear();
        secondPrice.sendKeys(price+ Keys.ENTER);
    }

    public void waitPriceFilter(){
        wait.until(presenceOfElementLocated(filterBtnBy));
    }
    public WebElement getColor(){
        return driver.findElement(checkboxColorRedBy);
    }
    public void waitColorRed(){
        wait.until(presenceOfElementLocated(checkboxColorRedBy));
    }
    public void clickColorRed(){
        driver.findElement(checkboxColorRedBy).click();
    }
    public void waitColorRedFilter(){
        wait.until(presenceOfElementLocated(filterBtnBy));
    }
    public List<WebElement> getPhoneListByColor(){
        return driver.findElements(phoneListByColor);
    }
    public boolean isColorRed(List<WebElement> colorMobList, String color){
        boolean flagColor=false;
        for (int i=0; i<colorMobList.size();i++) {
            List<WebElement> listColor = colorMobList.get(i).findElements(colorCircle);
            flagColor=false;
            for (WebElement elCol: listColor) {
                String strColor = elCol.findElement(colorWithAttributeRed).getAttribute("style");
                if(strColor.equals(color)){
                    flagColor =true;
                }
            }
        }
        return flagColor;
    }

}
