package selenideTests.citrus;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.company.homeworks.HW25.citrusSteps.HomePageSteps;
import com.company.homeworks.HW25.citrusSteps.ProductListPageSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;

public class FilterTests {

    HomePageSteps homePageSteps;
    ProductListPageSteps productListPageSteps;
    private String fromPrice = "5000";
    private String toPrice = "20000";
    private String nameSamsung = "Samsung";
    private String memory1 = "64 Гб";
    private String memory2 = "128 Гб";
    private String material = "Металл";
    private String nameMotorola = "Motorola";
    private String nameSmartf = "Смартфоны";
    private String nameTV = "Телевизоры, фото, видео";

    @BeforeClass
    public void setup(){
        Configuration.baseUrl = "https://www.citrus.ua";
        Configuration.startMaximized = true;
        open("/");
        homePageSteps = new HomePageSteps();
        productListPageSteps = new ProductListPageSteps();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void usePriceFilterTest(){
        homePageSteps.clickOnLinkInMenuTV(3,nameSamsung);
        productListPageSteps.pageProductListLoad();
        productListPageSteps.fillInPriceFilters(fromPrice,0,toPrice,1);
        productListPageSteps.verifyPriceAndNameOfProducts(nameSamsung,fromPrice,toPrice);

    }
    @Test
    public void useMemoryFilterTest() {
        homePageSteps.clickOnLinkInMenu(2,nameSamsung);
        productListPageSteps.pageProductListLoad();
        productListPageSteps.checkFilter(4,4);
        productListPageSteps.checkFilter(4,5);
        productListPageSteps.verifyMemoryAndNameOfProducts(nameSamsung);
    }

    @Test
    public void useBodyMaterialFilterTest() {
        homePageSteps.clickOnLinkInMenu(2,nameMotorola);
        productListPageSteps.pageProductListLoad();
        productListPageSteps.checkFilter(14,3);
        productListPageSteps.verifyMaterialAndNameOfProducts(nameMotorola);

    }
}
