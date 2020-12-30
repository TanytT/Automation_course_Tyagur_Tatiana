package com.company.homeworks.HW23.pageFactory.rozetkaFiltersPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RozetkaFilterPhoneFactoryPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//label[contains(text(), \"Apple\")]")
    private WebElement apple;
    @FindBy(xpath = "//label[contains(text(), \"Huawei\")]")
    private WebElement huawei;
    @FindBy(xpath = "//a[@class='checkbox-filter__link']/input[@id='Apple']")
    private WebElement checkboxApple;
    @FindBy(xpath = "//a[@class='checkbox-filter__link']/input[@id='Huawei']")
    private WebElement checkboxHuawei;
    @FindBy(xpath = "//a[@class='checkbox-filter__link']/input[@id='Samsung']")
    private WebElement checkboxSamsung;
    @FindBy(css = "ul.catalog-selection__list>li:nth-child(3)>a")
    private WebElement appleFilterBtn;
    @FindBy(css = "ul.catalog-selection__list>li:nth-child(4)>a")
    private WebElement huaweiFilterBtn;

    @FindBys({@FindBy( css = "div.goods-tile__inner"),@FindBy(css = "a.goods-tile__heading>span")})
    private List<WebElement> phoneListManuf;
    @FindBys({@FindBy( css = "div.goods-tile__inner"),@FindBy(css = "span.goods-tile__price-value")})
    private List<WebElement> phoneListPrice;

    @FindBy(css = "div.slider-filter__inner>input:first-child")
    private WebElement priceFrom;
    @FindBy(css = "div.slider-filter__inner>input:nth-child(3)")
    private WebElement priceTo;
    @FindBy(css = "ul.catalog-selection__list>li:nth-child(3)")
    private WebElement filterBtn;
    @FindBy(css = "div.goods-tile__colors>ul")
    private List<WebElement> phoneListByColor;
    @FindBy(css = "div:nth-child(17) li:nth-child(6)>a")
    private WebElement checkboxColorRed;
    @FindBy(css = "div.goods-tile__colors>ul>li>a>span:first-child")
    private List<WebElement> listOfAllColors;

    public RozetkaFilterPhoneFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public void clickAppleCheckbox(){
        apple.click();
    }

    public boolean ifAppleChecked(){
        return Boolean.parseBoolean(checkboxApple.getAttribute("checked"));
    }
    public void clickHuaweiCheckbox(){
        huawei.click();
    }

    public boolean ifHuaweiChecked(){
        return Boolean.parseBoolean(checkboxHuawei.getAttribute("checked"));
    }

    public boolean ifSamsungChecked(){
        return Boolean.parseBoolean(checkboxSamsung.getAttribute("checked"));
    }

    public void waitAppleFilterBtn(){
        wait.until(visibilityOf(appleFilterBtn));
    }

    public void waitHuaweiFilterBtn(){
        wait.until(visibilityOf(huaweiFilterBtn));
    }

    public List<WebElement> getPhoneListBy(){
        return phoneListManuf;
    }

    public List<WebElement> getPhoneListByPrice(){
        return phoneListPrice;
    }

    public boolean isSamsungHuaweiApplePhone(List <WebElement> mobList){
        boolean flag=true;
        for (WebElement elem: mobList) {
            String str = elem.getText();
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
            int intPrice = Integer.parseInt(elemPrice.getText().replace(" ",""));
            if((intPrice<=Integer.parseInt(price2))&&(intPrice>=Integer.parseInt(price1))){
                flagPrice = true;
            }
        }
        return flagPrice;
    }

    private WebElement price(By price){
        return driver.findElement(price);
    }

    public void setFirstPrice(String priceFirst){
        priceFrom.clear();
        priceFrom.sendKeys(priceFirst+ Keys.TAB);
    }

    public void setSecondPrice(String priceSecond){
        priceTo.clear();
        priceTo.sendKeys(priceSecond+ Keys.ENTER);
    }

    public void waitPriceFilter(){
        wait.until(visibilityOf(filterBtn));
    }

    public WebElement getColor(){
        return checkboxColorRed;
    }

    public void waitColorRed(){
        wait.until(visibilityOf(checkboxColorRed));
    }

    public void clickColorRed(){
        checkboxColorRed.click();
    }

    public void waitColorRedFilter(){
        wait.until(visibilityOf(filterBtn));
    }

    public List<WebElement> getPhoneListByColor(){
        return phoneListByColor;
    }

    public boolean isColorRed(List<WebElement> colorMobList, String color){
        int cntPhones = colorMobList.size();
        int cnt = 0;
        List<WebElement> listColor = listOfAllColors;
        for (WebElement el: listColor) {
            String str = el.getAttribute("style");
            if(str.contains(color)){
                cnt++;
            }
        }
        return (cnt==cntPhones);
    }

}
