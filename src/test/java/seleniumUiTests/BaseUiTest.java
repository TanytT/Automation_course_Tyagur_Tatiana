package seleniumUiTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseUiTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

    protected void mouseOver(WebElement element) {
        Actions action = new Actions(driver);
        action.build();
        action.moveToElement(element);
        action.perform();
    }
}
