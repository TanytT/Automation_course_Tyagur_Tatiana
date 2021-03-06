package seleniumUiTests.rozetka.rozetkaPageObject;

import com.company.homeworks.HW23.pageObject.rozetkaFiltersPages.FilterPhonePage;
import com.company.homeworks.HW23.pageObject.rozetkaFiltersPages.FiltersHomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumUiTests.BaseUiTest;


import static org.testng.Assert.assertTrue;

public class VerificationFiltersTest extends BaseUiTest {
    protected static String url = "https://rozetka.com.ua/";
    String search = "samsung";
    String price1 = "5000";
    String price2 = "15000";
    String red = "background-color: rgb(255, 0, 0);";
    FilterPhonePage phonePage;

    @BeforeMethod
    public void startUp(){
        driver.get(url);
        driver.manage().window().maximize();
        FiltersHomePage homePage = new FiltersHomePage(driver);
        phonePage = new FilterPhonePage(driver);
        homePage.inputSearchWord(search);
        homePage.waitMonitorsMenu();
        homePage.clickOnMonitorsLink();
    }

    @Test
    public void manufacturesFilterTest(){
        phonePage.clickAppleCheckbox();
        phonePage.waitAppleFilterBtn();
        phonePage.clickHuaweiCheckbox();
        phonePage.waitHuaweiFilterBtn();
        assertTrue(phonePage.ifAppleChecked(),"The checkbox Apple is not checked.");
        assertTrue(phonePage.ifHuaweiChecked(),"The checkbox Huawei is not checked.");
        assertTrue(phonePage.ifSamsungChecked(),"The checkbox Samsung is not checked.");
        assertTrue(phonePage.isSamsungHuaweiApplePhone(phonePage.getPhoneListBy()),"Not all phones are samsung, huawei or apple.");
    }

    @Test
    public void priceFilterTest() {
        phonePage.setFirstPrice(price1);
        phonePage.setSecondPrice(price2);
        phonePage.waitPriceFilter();
        assertTrue(phonePage.isPhoneWithPrice(phonePage.getPhoneListBy(),price1, price2),"The price of phone out of range 5000-15000.");
    }

    @Test
    public void colorFilterTest() {
        mouseOver(phonePage.getColor());
        phonePage.waitColorRed();
        phonePage.clickColorRed();
        phonePage.waitColorRedFilter();
        assertTrue(phonePage.isColorRed(phonePage.getPhoneListByColor(),red), "Color is not red");
    }

}
