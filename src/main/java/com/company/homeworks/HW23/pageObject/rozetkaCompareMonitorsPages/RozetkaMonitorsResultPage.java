package com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RozetkaMonitorsResultPage {
    WebDriver driver;
    WebDriverWait wait;
    By monitorListBy = By.cssSelector("div.goods-tile__inner");
    By pricesBy = By.cssSelector("span.goods-tile__price-value");
    By namesBy = By.cssSelector("a.goods-tile__heading");

    public RozetkaMonitorsResultPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void waitForMonitorsList(){
        wait.until(presenceOfElementLocated(monitorListBy));
    }

    public List<WebElement> getAllMonitorsInList(){
        return driver.findElements(monitorListBy);
    }

    public String[] searchMonitorByPrice(List<WebElement> listMonitors, Double priceConst){
        String[] resMonitor = new String[2];
        for (WebElement monitor : listMonitors){
            Double monitorPrice1 = Double.parseDouble(monitor.findElement(pricesBy).getText().replace(" ",""));
            if(monitorPrice1<priceConst) {
                resMonitor[0] = monitor.findElement(namesBy).getText();
                resMonitor[1] = monitorPrice1+"";
                monitor.findElement(namesBy).click();
                break;
            }
        }
        return resMonitor;
    }


}
