package seleniumUiTests.rozetka.rozetkaPageObject;

import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.ComparePage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.HomePage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.MonitorsResultPage;
import com.company.homeworks.HW23.pageObject.rozetkaCompareMonitorsPages.ProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;


import static org.testng.Assert.assertEquals;

public class CompareMonitorsTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    String[] monitor1;
    String[] monitor2;
    Double priceConst =3000.00;
    HomePage homePage;
    MonitorsResultPage monitorsResultPage;
    ProductPage productPage;
    ComparePage comparePage;

    @BeforeMethod
    public void startUp(){
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        monitorsResultPage = new MonitorsResultPage(driver);
        productPage = new ProductPage(driver);
        comparePage = new ComparePage(driver);
    }

    @Test
    public void positiveTestCompareMonitors(){

        mouseOver(homePage.chooseMonitorsMenu());
        homePage.waitForMonitorMenu();
        homePage.clickOnMonitorsMenu();

        monitorsResultPage.waitForMonitorsList();
        monitor1 = monitorsResultPage.findFirstMonitor(priceConst);

        productPage.waitBuyButton();
        productPage.clickOnCompareButton();
        productPage.waitCompareElement();

        assertEquals(productPage.getCntCompareElements(),1);
        driver.navigate().back();

        monitorsResultPage.waitForMonitorsList();
        monitor2 = monitorsResultPage.findSecondMonitor(Double.parseDouble(monitor1[1]));

        productPage.waitBuyButton();
        productPage.clickOnCompareButton();
        productPage.waitForCompareChoose();

        assertEquals(productPage.getCntCompareElements(),2);
        productPage.clickOnCompareButtonInHeader();
        productPage.clickOnMonitorsInCompareAlert();

        comparePage.waitOfMonitorsOnComparePage();

        assertEquals(comparePage.countOfCompareElements(),2);
        assertEquals(comparePage.nameOfCompareMonitor1(),monitor1[0]);
        assertEquals(comparePage.checkMonitor1Price(),Double.parseDouble(monitor1[1]));
        assertEquals(comparePage.nameOfCompareMonitor2(),monitor2[0]);
        assertEquals(comparePage.checkMonitor2Price(),Double.parseDouble(monitor2[1]));

    }
}
