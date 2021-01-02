package seleniumUiTests.rozetka.rozetkaOldStyle;

import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaHomePage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaMonitorsResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;
import static org.testng.Assert.*;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class RozetkaCompareMonitorsTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    String monitorName1="";
    Double monitorPrice1 = 0.0;
    String monitorName2="";
    Double monitorPrice2 = 0.0;
    Double priceConst =3000.00;

    @BeforeMethod
    public void startUp(){
        driver.get(url);
    }

    @Test
    public void positiveTestCompareMonitors(){
        driver.manage().window().maximize();
        RozetkaHomePage homePage = new RozetkaHomePage(driver);
        RozetkaMonitorsResultPage monitorsResultPage = new RozetkaMonitorsResultPage(driver);
        mouseOver(homePage.chooseMonitorsMenu());
        homePage.waitForMonitorMenu();
        homePage.clickOnMonitorsMenu();

        monitorsResultPage.waitForMonitorsList();
        By monitorListBy = By.cssSelector("div.goods-tile__inner");
        By pricesBy = By.cssSelector("div>div.goods-tile__price>p>span.goods-tile__price-value");
        By namesBy = By.cssSelector("a.goods-tile__heading");


        List<WebElement> listMonitors1 = monitorsResultPage.getAllMonitorsInList();
        for (WebElement monitor1 : listMonitors1){
             monitorPrice1 = Double.parseDouble(monitor1.findElement(pricesBy).getText().replace(" ",""));
            if(monitorPrice1<priceConst) {
                monitorName1 = monitor1.findElement(namesBy).getText();
                monitor1.findElement(namesBy).click();

                break;
            }
        }

        By buttLabelBy = By.cssSelector("span.buy-button__label");
        By btnCompBy = By.cssSelector("button.compare-button");
        wait.until(presenceOfElementLocated(buttLabelBy));
        driver.findElement(btnCompBy).click();

        By compareCountBy = By.cssSelector("button>span.header-actions__button-counter");
        wait.until(presenceOfElementLocated(compareCountBy));
        assertEquals(Integer.parseInt(driver.findElement(compareCountBy).getText()),1);

        driver.navigate().back();
        wait.until(presenceOfElementLocated(By.cssSelector("div.goods-tile__inner")));

        List<WebElement> listName2 =  monitorsResultPage.getAllMonitorsInList();
        for (WebElement monitor2 : listName2){
            monitorPrice2 = Double.parseDouble(monitor2.findElement(pricesBy).getText().replace(" ",""));
            if(monitorPrice2<monitorPrice1) {
                monitorName1 = monitor2.findElement(namesBy).getText();
                monitor2.findElement(namesBy).click();

                break;
            }
        }


        wait.until(presenceOfElementLocated(buttLabelBy));
        driver.findElement(btnCompBy).click();
        wait.until(presenceOfElementLocated(By.xpath("//button/span[@class='header-actions__button-counter'][text()='2']")));
        assertEquals(Integer.parseInt(driver.findElement(compareCountBy).getText()),2);

        driver.findElement(By.cssSelector(".header-actions__button-icon")).click();
        driver.findElement(By.cssSelector("li.comparison-modal__item>.comparison-modal__link")).click();

        By cntCompareMonitBy = By.xpath("//rz-products-section/ul/li");
        wait.until(presenceOfElementLocated(cntCompareMonitBy));
        assertEquals(driver.findElements(cntCompareMonitBy).size(),2);

        assertEquals(driver.findElement(By.xpath("//div/a[contains(text(), '"+monitorName2+"')]")).getText(),monitorName2);
        WebElement price2 = driver.findElement(By.xpath("//li[1]/rz-compare-tile/div/div[2]/div[2]/div[1]/div"));
        String []priceArr2=price2.getText().split("₴");
        Double pr2=Double.parseDouble(priceArr2[1].replace(" ",""));
        assertEquals(pr2,monitorPrice2);

        assertEquals(driver.findElement(By.xpath("//div/a[contains(text(), '"+monitorName1+"')]")).getText(),monitorName1);
        WebElement price1 = driver.findElement(By.xpath("//li[2]/rz-compare-tile/div/div[2]/div[2]/div[1]/div"));
        String []priceArr1=price1.getText().split("₴");
        Double pr1=Double.parseDouble(priceArr1[1].replace(" ",""));
        assertEquals(pr1,monitorPrice1);
    }
}
