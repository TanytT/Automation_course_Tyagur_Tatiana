package seleniumUiTests.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;

import static java.util.Optional.empty;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.testng.Assert.*;


public class GuruTests extends BaseUiTest {

    String urlDropAndDrag = "http://demo.guru99.com/test/drag_drop.html";
    String urlCookies = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    String urlWorkWithIFrames = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    String password = "Guru99";
    String login = "1303";

    @Test
    public void dropAndDragTest() {
        driver.get(urlDropAndDrag);

        WebElement From1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement To1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
        WebElement From2 = driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement To2 = driver.findElement(By.xpath("//*[@id='loan']/li"));
        WebElement From3 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement To3 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
        WebElement From4 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement To4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));

        Actions act = new Actions(driver);
        act.dragAndDrop(From1, To1).build().perform();
        act.dragAndDrop(From2, To2).build().perform();
        act.dragAndDrop(From3, To3).build().perform();
        act.dragAndDrop(From4, To4).build().perform();

        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed(),"Perfect not Displayed !!!");
    }

    @Test
    public void handleCookiesTest(){
        driver.get(urlCookies);
        driver.findElement(By.name("uid")).sendKeys(login);
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
        By logoutButtonBy = By.xpath("//a[@href='Logout.php' ]");
        wait.until(presenceOfElementLocated(logoutButtonBy));

        Set<Cookie> cookies = driver.manage().getCookies();
        assertThat(cookies, is(not(empty())));
        System.out.println("All cookies:");
        for (Cookie cookie:cookies) {
            System.out.println(cookie);
        }

        driver.manage().deleteAllCookies();
        Set<Cookie> cookiesAfterDeleting = driver.manage().getCookies();
        assertEquals(cookiesAfterDeleting.size(), 0);
        driver.navigate().refresh();
        assertTrue(driver.findElement(logoutButtonBy).isDisplayed(),"The button Logout is not displayed!");
    }

    @Test
    public void workWithiFramesTest(){
        driver.get(urlWorkWithIFrames);

        By iFrameBy = By.cssSelector("div[id*=Player-Div-SekindoSPlayer]");
        wait.until(presenceOfElementLocated(iFrameBy));
        assertEquals(driver.findElements(iFrameBy).size(),1);
        
        WebElement play = driver.findElement(By.id("playBtn"));
        play.click();

        WebElement element = driver.findElement(By.cssSelector("div[id=placeHolder]>img"));
        WebElement centerElem= driver.findElement(By.id("centerElements"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.invisibilityOf(play));
        String str = centerElem.getAttribute("style");
        assertTrue(str.contains("display: none;"),"The attribute is display: block");

        WebElement elemIframe = driver.findElement(iFrameBy);
        mouseOver(elemIframe);

        String str1 = centerElem.getAttribute("style");
        assertTrue(str1.contains("display: block;"),"The attribute is display: none.");
    }
}
