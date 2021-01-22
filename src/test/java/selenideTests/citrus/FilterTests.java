package selenideTests.citrus;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.company.homeworks.HW25.citrusPages.HomePage;
import com.company.homeworks.HW25.citrusPages.ProductListPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;

public class FilterTests {

    HomePage homePage;
    ProductListPage productListPage;
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
        homePage = new HomePage();
        productListPage = new ProductListPage();

    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void usePriceFilterTest(){
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(nameTV)
                .clickOnLinkInMenuTV(nameSamsung);
        productListPage.waitForLoad()
                .closePopUp();
        productListPage.fillInSearchPriceFilter(fromPrice,0).waitForLoad();
        productListPage.fillInSearchPriceFilter(toPrice,1).waitForLoad().closePopUp();
        productListPage.getAllProductNames().filterBy(Condition.text(nameSamsung)).shouldHaveSize(10);
        productListPage.getAllProductPrices(fromPrice,toPrice).shouldHave(Condition.text("16 999"));

    }
    @Test
    public void useMemoryFilterTest() {
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(nameSmartf)
                .clickOnLinkInMenu(nameSamsung);
        productListPage.waitForLoad()
                .closePopUp();
        productListPage.checkFilter(memory1).waitForLoad();
        productListPage.checkFilter(memory2).waitForLoad();
        productListPage.getAllProductNames().filterBy(Condition.text(nameSamsung)).shouldHaveSize(47);
        productListPage.getAllProductNames()
                .filterBy(Condition.or("64GbOR128Gb",Condition.text("64Gb"),Condition.text("128Gb"))).shouldHaveSize(47);
    }

    @Test
    public void useBodyMaterialFilterTest() {
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(nameSmartf)
                .clickOnLinkInMenu(nameMotorola);
        productListPage.waitForLoad()
                .closePopUp();
        productListPage.checkFilter(material).waitForLoad();
        int cnt=productListPage.checkMaterial(material);
        productListPage.getAllProductNames().shouldHaveSize(cnt);
        productListPage.getAllProductNames().filterBy(Condition.text(nameMotorola)).shouldHaveSize(3);
    }
}
