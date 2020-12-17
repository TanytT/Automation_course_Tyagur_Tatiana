package seleniumUiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseUiTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tatiana_Tgr\\.m2\\repository\\webDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
