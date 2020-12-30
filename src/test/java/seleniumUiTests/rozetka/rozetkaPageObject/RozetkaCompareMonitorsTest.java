package seleniumUiTests.rozetka.rozetkaPageObject;

import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaComparePage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaHomePage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaMonitorsResultPage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.RozetkaProductPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class RozetkaCompareMonitorsTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    String monitorName1="";
    Double monitorPrice1 = 0.0;
    String monitorName2="";
    Double monitorPrice2 = 0.0;
    Double priceConst =3000.00;
    RozetkaHomePage homePage;
    RozetkaMonitorsResultPage monitorsResultPage;
    RozetkaProductPage productPage;
    RozetkaComparePage comparePage;

    @BeforeMethod
    public void startUp(){
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new RozetkaHomePage(driver);
        monitorsResultPage = new RozetkaMonitorsResultPage(driver);
        productPage = new RozetkaProductPage(driver);
        comparePage = new RozetkaComparePage(driver);
    }

    @Test
    public void positiveTestCompareMonitors(){

        mouseOver(homePage.chooseMonitorsMenu());
        homePage.waitForMonitorMenu();
        homePage.clickOnMonitorsMenu();

        monitorsResultPage.waitForMonitorsList();
        List<WebElement> listMonitors1 = monitorsResultPage.getAllMonitorsInList();
        String[] str= monitorsResultPage.searchMonitorByPrice(listMonitors1, priceConst);
        monitorName1 = str[0];
        monitorPrice1 = Double.parseDouble(str[1]);

        productPage.waitBuyButton();
        productPage.clickOnCompareButton();
        productPage.waitCompareElement();

        assertEquals(productPage.getCntCompareElements(),1);
        driver.navigate().back();

        monitorsResultPage.waitForMonitorsList();
        List<WebElement> listName2 =  monitorsResultPage.getAllMonitorsInList();
        String[] str2 = monitorsResultPage.searchMonitorByPrice(listName2, monitorPrice1);
        monitorName2 = str2[0];
        monitorPrice2 = Double.parseDouble(str2[1]);

        productPage.waitBuyButton();
        productPage.clickOnCompareButton();
        productPage.waitForCompareChoose();

        assertEquals(productPage.getCntCompareElements(),2);
        productPage.clickOnCompareButtonInHeader();
        productPage.clickOnMonitorsInCompareAlert();

        comparePage.waitOfMonitorsOnComparePage();

        assertEquals(comparePage.countOfCompareElements(),2);
        assertEquals(comparePage.nameOfCompareMonitor1(),monitorName1);
        assertEquals(comparePage.checkMonitor1Price(),monitorPrice1);
        assertEquals(comparePage.nameOfCompareMonitor2(),monitorName2);
        assertEquals(comparePage.checkMonitor2Price(),monitorPrice2);

    }
}
