package com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MonitorsResultFactoryPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="svg.show-more__icon")
    private WebElement showMoreBtn;
    @FindBys({@FindBy(css = "div.goods-tile__inner"),@FindBy(css = "span.goods-tile__price-value")})
    private List<WebElement> monitorListPrices;
    @FindBy(css = "div.goods-tile__inner>a.goods-tile__heading")
    private List<WebElement> monitorListNames;

    public MonitorsResultFactoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public void waitForMonitorsList(){
        wait.until(visibilityOf(showMoreBtn));
    }

    public String[] findFirstMonitor(Double priceConst){
        List<WebElement> listMonitors1 = monitorListPrices;
        return searchMonitorByPrice(listMonitors1, priceConst);
    }

    public String[] findSecondMonitor(Double price){
        List<WebElement> listMonitor2 =  monitorListPrices;
        return searchMonitorByPrice(listMonitor2, price);
    }

    public List<WebElement> getMonitorsInListNames(){
        return monitorListNames;
    }

    private String[] searchMonitorByPrice(List<WebElement> listPrices, Double priceConst){
        String[] resMonitor = new String[2];
        for (int i=0; i<listPrices.size(); i++){
            String curPrice =listPrices.get(i).getText();
            Double monitorPrice1 = Double.parseDouble(curPrice.replace(" ",""));
            if(monitorPrice1<priceConst) {
                resMonitor[0] = getMonitorsInListNames().get(i).getText();
                resMonitor[1] = monitorPrice1+"";
                getMonitorsInListNames().get(i).click();
                break;
            }
        }
        return resMonitor;
    }
}
