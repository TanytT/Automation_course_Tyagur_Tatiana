package mobileTests.guru99;

import mobileTests.guru99.pages.AgileProjectPage;
import mobileTests.guru99.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AgileProjectTest extends Base{

    private HomePage homePage;
    private AgileProjectPage agileProjectPage;
    private final String userName = "1303";
    private final String password = "Guru99";
    private final String userNameInvalid = "111";
    private final String passwordInvalid = "xyz";

    @BeforeClass
    public void init() {
        homePage = new HomePage(appiumDriver);
        agileProjectPage = new AgileProjectPage(appiumDriver);

    }

    @AfterClass
    public void quit(){
        appiumDriver.quit();
    }

    @Test
    public void loginAsAuthenticatedUser(){
        homePage.navigate();
        homePage.clickOnAgileProjectButton();
        agileProjectPage.userEntersUsernameAndPassword(userName, password);
        assertEquals("Welcome To Customer's Page of Guru99 Bank", agileProjectPage.getWelcomeMessage());

    }

    @Test
    public void loginWithInvalidLoginPassword(){
        homePage.navigate();
        homePage.clickOnAgileProjectButton();
        agileProjectPage.userEntersUsernameAndPassword(userNameInvalid, passwordInvalid);
        assertEquals(agileProjectPage.verifyLoginPassword(), "User or Password is not valid");

    }
}
