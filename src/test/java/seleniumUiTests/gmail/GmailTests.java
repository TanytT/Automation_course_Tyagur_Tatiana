package seleniumUiTests.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Assert.*;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;

import java.awt.*;


public class GmailTests extends BaseUiTest {

    String urlGmail = "http://mail.google.com";
    String email = "lesyagoat@gmail.com";
    String password = "KtczRjpf2020";
    final String topic = "Hello" + System.currentTimeMillis();
    String text = "some text";
    String filePath = "C:\\Users\\Tatiana_Tgr\\TestDoc.txt";

    @Test
    public void sendLetterTest() throws AWTException {
        driver.get(urlGmail);

        driver.findElement(By.id("identifierId")).sendKeys(email + Keys.ENTER);

        WebElement emailText = wait.until(presenceOfElementLocated(By.id("profileIdentifier")));
        assertEquals(emailText.getText(), email);

        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password + Keys.ENTER);
        WebElement newLetter = wait.until(presenceOfElementLocated(By.cssSelector("div.z0>div.L3")));
        newLetter.click();

        wait.until(presenceOfElementLocated(By.cssSelector("div.dC")));
        driver.findElement(By.cssSelector("textarea[name=to]")).sendKeys(email + Keys.ENTER);
        driver.findElement(By.name("subjectbox")).sendKeys(topic + Keys.TAB + text+ Keys.TAB);

        copyPath(filePath);
        driver.findElement(By.cssSelector("tr>td:nth-child(4)>div.bAK>div:first-child>div")).click();
        pastePath();

        wait.until(presenceOfElementLocated(By.cssSelector(".dL>div")));
        driver.findElement(By.cssSelector("div.dC>div:first-child")).click();

        By sendLetterMsgBy = By.cssSelector("div.vh>span>span");
        wait.until(presenceOfElementLocated(sendLetterMsgBy));
        assertEquals(driver.findElement(By.cssSelector("div.aHS-bnt>div.UKr6le>div")).getText(),"1");

        driver.findElement(By.cssSelector("div.aDM tbody>tr:first-child")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("div.amn>span:first-child")));
        assertEquals(driver.findElement(By.cssSelector("h2.hP")).getText(),topic);
        assertEquals(driver.findElement(By.cssSelector("div.aiL>div:first-child")).getText(),text);
        assertEquals(driver.findElement(By.cssSelector("div.aQA>span")).getText(),"TestDoc.txt");
    }

}
