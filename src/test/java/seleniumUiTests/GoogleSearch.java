package seleniumUiTests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class GoogleSearch extends BaseUiTest{

    String url = "https://www.google.com/";
    String search = "iphone kyiv buy";
    String site = "stylus.ua";
    String msg = "STYLUS.UA not found on first 5 pages";


    @BeforeMethod
    public void startUp(){
        driver.get(url);
    }

    @Test
    public void positiveTestSearch(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search + Keys.ENTER);
        wait.until(presenceOfElementLocated(By.xpath("//div[@id='result-stats']")));

        int cnt = 1;

        while(cnt<=5) {
            if(driver.findElement(By.xpath("//a/div/cite[text()='stylus.ua']")).getText().contains(site)){
                System.out.println("STYLUS.UA found on " + cnt +" page");
                break;
            } else {
                if(cnt<5) {
                    driver.findElement(By.xpath("//a[@id='pnnext']")).sendKeys(Keys.ENTER);
                    wait.until(presenceOfElementLocated(By.xpath("//td[contains(text(),'"+(cnt+1)+"')]")));
                }else{
                    System.out.println(msg);
                }
            }
            cnt++;
        }
    }
}
