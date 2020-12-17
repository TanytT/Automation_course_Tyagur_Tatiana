package seleniumUiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class LoginLogoutTests extends BaseUiTest {
    String url = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    String password = "Guru99";
    String login = "1303";
    String inval_login="1234";
    String invalid_passw = "asdffe";
    String posit_msg = "You Have Succesfully Logged Out!!";
    String negative_msg ="User or Password is not valid";

    @BeforeMethod
    public void startUp(){
        driver.get(url);
    }

    @Test
    public void positiveLoginLogoutTest(){
        driver.findElement(By.name("uid")).sendKeys(login);
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        WebElement logoutButton = wait.until(presenceOfElementLocated(By.xpath("//a[@href='Logout.php' ]")));
        logoutButton.click();
        alertFunc(posit_msg);
        checkPageLoginIsOpen();
    }
    @Test
    public void negativeTestWrongPassword(){
        driver.findElement(By.name("uid")).sendKeys(login);
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(invalid_passw);
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();
    }

    @Test
    public void negativeTestWrongLogin(){
        driver.findElement(By.name("uid")).sendKeys(inval_login);
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();
    }

    @Test
    public void negativeTestBlankLogin(){
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();
    }

    @Test
    public void negativeTestBlankPassword(){
        driver.findElement(By.name("uid")).sendKeys(login);
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();
    }

    @Test
    public void negativeTestBlankPasswordLogin(){
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();
    }
    @Test
    public void negativeTestWrongPasswordLogin(){
        driver.findElement(By.name("uid")).sendKeys(inval_login);
        driver.findElement(By.xpath("//input [@name ='password' ]")).sendKeys(invalid_passw);
        driver.findElement(By.name("btnLogin")).click();

        alertFunc(negative_msg);
        checkPageLoginIsOpen();

    }

    public void alertFunc(String msg){
        assertEquals(driver.switchTo().alert().getText(),msg);
        driver.switchTo().alert().accept();
    }
    public void checkPageLoginIsOpen(){
        assertEquals(driver.getCurrentUrl(), url);
        wait.until(presenceOfElementLocated(By.name("btnLogin")));
    }


}
