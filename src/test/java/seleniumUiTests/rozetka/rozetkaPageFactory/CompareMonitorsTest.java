package seleniumUiTests.rozetka.rozetkaPageFactory;

import com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages.CompareFactoryPage;
import com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages.HomeFactoryPage;
import com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages.MonitorsResultFactoryPage;
import com.company.homeworks.HW23.pageFactory.rozetkaCompareMonitorsPages.ProductFactoryPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;

public class CompareMonitorsTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    Double priceConst =3000.00;
    String[] monitor2;
    String[] monitor1;
    HomeFactoryPage homePage;
    MonitorsResultFactoryPage monitorsResultPage;
    ProductFactoryPage productPage;
    CompareFactoryPage comparePage;

    @BeforeMethod
    public void startUp(){
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomeFactoryPage(driver);
        monitorsResultPage = new MonitorsResultFactoryPage(driver);
        productPage = new ProductFactoryPage(driver);
        comparePage = new CompareFactoryPage(driver);
    }

    @Test
    public void positiveTestCompareMonitors() {

        mouseOver(homePage.chooseMonitorsMenu());
        homePage.waitForMonitorMenu();
        homePage.clickOnMonitorsMenu();

        monitorsResultPage.waitForMonitorsList();
        monitor1 = monitorsResultPage.findFirstMonitor(priceConst);

        productPage.waitMenuTabsBtn();
        mouseOver(productPage.chooseMenuTabsBtn());
        productPage.waitBuyButton();
        productPage.clickOnCompareButton();
        productPage.waitCompareElement();

        assertEquals(productPage.getCntCompareElements(),1);
        driver.navigate().back();

        monitorsResultPage.waitForMonitorsList();
        monitor2 = monitorsResultPage.findSecondMonitor(Double.parseDouble(monitor1[1]));

        productPage.waitMenuTabsBtn();
        mouseOver(productPage.chooseMenuTabsBtn());
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
