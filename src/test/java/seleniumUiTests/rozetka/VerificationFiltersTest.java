package seleniumUiTests.rozetka;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;

import java.util.List;


import static org.testng.Assert.*;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VerificationFiltersTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    String search = "samsung";
    String price1 = "5000";
    String price2 = "15000";

    @BeforeMethod
    public void startUp(){

        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name=search]")).sendKeys(search+ Keys.ENTER);

        By mobPhoneBy = By.cssSelector("li:nth-child(1)>a[href*=\"/mobile-phones\"]>span.categories-filter__link-title");
        wait.until(presenceOfElementLocated(mobPhoneBy));
        driver.findElement(mobPhoneBy).click();
    }

    @Test
    public void manufacturesFilterTest(){

        WebElement checkApple = driver.findElement(By.xpath("//a[@class='checkbox-filter__link']/label[contains(text(), \"Apple\")]"));
        checkApple.click();
        wait.until(presenceOfElementLocated(By.xpath("//a[@class='catalog-selection__link'][contains(text(), 'Apple')]")));
        WebElement checkApple1 = driver.findElement(By.xpath("//a[@class='checkbox-filter__link']/input[@id='Apple']"));
        assertEquals(checkApple1.getAttribute("checked"),"true");

        WebElement checkHuawei = driver.findElement(By.xpath("//a[@class='checkbox-filter__link']/label[contains(text(), \"Huawei\")]"));
        checkHuawei.click();
        wait.until(presenceOfElementLocated(By.xpath("//a[@class='catalog-selection__link'][contains(text(), 'Huawei')]")));
        WebElement checkHuawei1 = driver.findElement(By.xpath("//a[@class='checkbox-filter__link']/input[@id='Huawei']"));
        assertEquals(checkHuawei1.getAttribute("checked"),"true");

        WebElement checkSamsung = driver.findElement(By.xpath("//a[@class='checkbox-filter__link']/input[@id='Samsung']"));
        assertEquals(checkSamsung.getAttribute("checked"),"true");

        try{
            while (driver.findElement(By.xpath("//a[@class='show-more show-more--horizontal']")).isDisplayed()) {
                driver.findElement(By.xpath("//a[@class='show-more show-more--horizontal']")).click();
            }
        }catch (org.openqa.selenium.NoSuchElementException e){}
        wait.until(presenceOfElementLocated(By.cssSelector("div.pagination")));
        List<WebElement> mobList = driver.findElements(By.cssSelector("div.goods-tile__inner"));
        boolean flag=true;
        for (WebElement elem: mobList) {
            String str = elem.findElement(By.cssSelector("span.goods-tile__title")).getText();
            flag=str.contains("Samsung")||str.contains("Huawei")||str.contains("Apple");
            if(!flag){
                break;
            }
        }
        assertTrue(flag);
    }

    @Test
    public void priceFilterTest() {

        WebElement firstPrice = driver.findElement(By.cssSelector("div.slider-filter__inner>input:first-child"));
        WebElement secondPrice = driver.findElement(By.cssSelector("div.slider-filter__inner>input:nth-child(3)"));
        firstPrice.clear();
        firstPrice.sendKeys(price1+Keys.TAB);

        secondPrice.clear();
        secondPrice.sendKeys(price2+Keys.ENTER);
        wait.until(presenceOfElementLocated(By.cssSelector("a.catalog-selection__link")));

        List <WebElement> priceMobList = driver.findElements(By.cssSelector("div.goods-tile__inner"));
        boolean flagPrice = false;
        for (WebElement elemPrice: priceMobList) {
            String strPrice = elemPrice.findElement(By.cssSelector("span.goods-tile__price-value")).getText();
            int intPrice = Integer.parseInt(strPrice.replace(" ",""));
            if((intPrice<=Integer.parseInt(price2))&&(intPrice>=Integer.parseInt(price1))){
                flagPrice = true;
            }
        }
        assertTrue(flagPrice);
    }

    @Test
    public void colorFilterTest() {
        String red = "background-color: rgb(255, 0, 0);";
        By colorBy = By.cssSelector("rz-filter-stack>div:nth-child(17) ul>li:nth-child(6)>a");
        Locatable hoverItem = (Locatable) driver.findElement(colorBy);
        int y = hoverItem.getCoordinates().onPage().getY();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+");");
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(colorBy));
        element1.click();
        wait.until(presenceOfElementLocated(By.cssSelector("ul>li:nth-child(2)>a.catalog-selection__link")));

        List<WebElement> colorMobList = driver.findElements(By.cssSelector("ul.goods-tile__colors-list"));
        boolean flagColor = false;
        for (int i=0; i<colorMobList.size();i++) {
            List<WebElement> listColor = colorMobList.get(i).findElements(By.cssSelector("li>a"));
            for (WebElement elCol: listColor) {
                String strColor = elCol.findElement(By.cssSelector("span.goods-tile__colors-content")).getAttribute("style");

                if(strColor.equals(red)){
                    assertEquals(strColor,red);
                    flagColor =true;
                }
            }
        }
        assertTrue(flagColor);
    }

}
