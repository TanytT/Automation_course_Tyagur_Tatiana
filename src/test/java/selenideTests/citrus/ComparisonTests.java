package selenideTests.citrus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.company.homeworks.HW25.citrusPages.ComparisonPage;
import com.company.homeworks.HW25.citrusPages.HomePage;
import com.company.homeworks.HW25.citrusPages.ProductListPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;

public class ComparisonTests {

    HomePage homePage;
    ProductListPage productListPage;
    ComparisonPage comparisonPage;
    private String notebooks = "Ноутбуки, планшеты, МФУ";
    private String acer = "Acer";


    @BeforeClass
    public void setup(){
        Configuration.baseUrl = "https://www.citrus.ua";
        Configuration.startMaximized = true;
        open("/");
        homePage = new HomePage();
        productListPage = new ProductListPage();
        comparisonPage = new ComparisonPage();

    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void comparisonTwoPlusOneTest(){
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(notebooks)
                .clickOnLinkInMenuNotebooks();
        productListPage.waitForLoad()
                .hoverOnCompButton(1)
                .closePopUp();
        String notebookPrice1 = productListPage.readProductPriceFromListNotebooks(0);
        String notebookName1 = productListPage.getAllProductNames().get(0).getText();
        String notebookPrice2 = productListPage.readProductPriceFromListNotebooks(1);
        String notebookName2 = productListPage.getAllProductNames().get(1).getText();
        productListPage.hoverOnCompButton(1)
                .closePopUp()
                .hoverOnCompButton(1)
                .clickComparisonButton(1)
                .checkCompareCounter().shouldBe(Condition.visible).shouldHave(Condition.text("1"));
        productListPage.hoverOnCompButton(2)
                .clickComparisonButton(2)
                .clickComparisonButton(0);
        comparisonPage.waitForLoad()
                .closePopUp()
                .getListProducts().shouldHaveSize(2);

        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName2)).shouldHaveSize(1);
        comparisonPage.getListProducts().get(0).shouldHave(Condition.text(notebookPrice1));
        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName1.substring(0,40))).shouldHaveSize(1);
        comparisonPage.getListProducts().get(1).shouldHave(Condition.text(notebookPrice2));
        open("/");
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(notebooks)
                .clickOnLinkInMenuNotebooks();
        productListPage.waitForLoad()
                .hoverOnCompButton(1)
                .closePopUp();
        String notebookPrice3 = productListPage.readProductPriceFromListNotebooks(2);
        String notebookName3 = productListPage.getAllProductNames().get(2).getText();
        productListPage.closePopUp()
                .hoverOnCompButton(3)
                .clickComparisonButton(3)
                .checkCompareCounter().shouldBe(Condition.visible).shouldHave(Condition.text("3"));
        productListPage.clickComparisonButton(0);
        comparisonPage.waitForLoad()
                .closePopUp()
                .getListProducts().shouldHaveSize(3);
        comparisonPage.getAllNameOfNotebooks().filterBy(Condition.text(notebookName3.substring(0,40))).shouldHaveSize(1);
        comparisonPage.getListProducts().get(0).shouldHave(Condition.text(notebookPrice3));
    }
}
