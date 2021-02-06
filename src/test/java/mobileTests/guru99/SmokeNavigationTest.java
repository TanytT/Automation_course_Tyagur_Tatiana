package mobileTests.guru99;

import mobileTests.guru99.pages.HomePage;
import mobileTests.guru99.pages.NewToursPage;
import mobileTests.guru99.pages.TableDemoPage;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class SmokeNavigationTest extends Base{

    private HomePage homePage;
    private NewToursPage newToursPage;
    private TableDemoPage tableDemoPage;

    @BeforeClass
    public void init() {
        homePage = new HomePage(appiumDriver);
        newToursPage = new NewToursPage(appiumDriver);
        tableDemoPage = new TableDemoPage(appiumDriver);
    }

    @Test
    public void navigateToHomePage(){
        homePage.navigate();
        assertEquals("Guru99 Bank Home Page", homePage.getTitle());
        assertTrue(homePage.isLoginFormPresent(), "Login page is not load");

    }

    @Test
    public void navigateToNewToursPage(){
        homePage.navigate();
        homePage.clickOnNewToursButton();
        assertEquals("Welcome: Mercury Tours", newToursPage.getTitle());
        assertTrue(newToursPage.isMainFragmentPresent(), "Main menu is not present ");

    }

    @Test
    public void navigateToTablePage(){
        homePage.navigate();
        homePage.clickOnTableDemoMenu();
        assertEquals("Table Demo",tableDemoPage.getTitle());
        Assert.assertTrue(tableDemoPage.isTablePresent());
    }
}
