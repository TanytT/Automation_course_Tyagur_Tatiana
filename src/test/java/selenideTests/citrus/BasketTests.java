package selenideTests.citrus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.company.homeworks.HW25.citrusPages.ComparisonPage;
import com.company.homeworks.HW25.citrusPages.HomePage;
import com.company.homeworks.HW25.citrusPages.ProdPage;
import com.company.homeworks.HW25.citrusPages.ProductListPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class BasketTests {

    HomePage homePage;
    ProdPage productPage;
    ProductListPage productListPage;
    ComparisonPage comparisonPage;

    String productName = "Apple iPhone 12 128GB";
    String productN = "Apple iPhone";
    String nameApple = "Apple";
    String smartf = "Смартфоны";

    @BeforeClass
    public void setup(){
        Configuration.baseUrl = "https://www.citrus.ua";
        Configuration.startMaximized = true;
        open("/");
        homePage = new HomePage();
        productListPage = new ProductListPage();
        productPage = new ProdPage();
        comparisonPage = new ComparisonPage();


    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void addToBasketUsingProductPageTest(){
        homePage.waitForLoad()
                .closePopUp()
                .hoverMenuLine(smartf)
                .clickOnLinkInMenu(nameApple);
        productListPage.waitForLoad()
                    .closePopUp()
                    .clickOnProductByName(productName);
        String productPrice = productPage.readProductPrice();
        productPage.clickBuyButton();

        productPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productPage.getBasketFragment().getBasketProductList().shouldHaveSize(1);
        productPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName));
        productPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(productPrice));
    }

    @Test
    public void addToBasketUsingSearchTest(){
        homePage.waitForLoad()
                .closePopUp()
                .getSearchFragment().searchProduct(productName);
        productListPage.waitForLoad()
                .closePopUp();
        String productPrice = productListPage.readProductPriceFromListByName(productName);
        productListPage.addProductToBasket(productName);

        productListPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productListPage.getBasketFragment().getBasketProductList().shouldHaveSize(1);
        productListPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName));
        productListPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(productPrice));
    }

    @Test
    public void addTwoProductsToBasketTest(){
        homePage.waitForLoad()
                .closePopUp()
                .getSearchFragment().searchProduct(productN);
        productListPage.waitForLoad()
                .closePopUp();
        String productPrice1 = productListPage.readProductPriceFromList(0);
        String productName1 = productListPage.readProductNameFromList(0);
        String productPrice2 = productListPage.readProductPriceFromList(1);
        String productName2 = productListPage.readProductNameFromList(1);
        String totalPrice = productListPage.countTotalPriceInBasket(productPrice1,productPrice2);

        productListPage.getBasketFragment().addProductsToBasket(0).getCloseBasketButton();
        productListPage.getBasketFragment().addProductsToBasket(1).getCloseBasketButton();
        productListPage.getBasketFragment().getOpenBasketFromHeader();

        productListPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        productListPage.getBasketFragment().getBasketProductList().shouldHaveSize(2);
        productListPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName1));
        productListPage.getBasketFragment().getProductPricesInBasket().get(0).shouldHave(Condition.text(productPrice1));
        productListPage.getBasketFragment().getBasketProductList().get(1).shouldHave(Condition.text(productName2));
        productListPage.getBasketFragment().getProductPricesInBasket().get(1).shouldHave(Condition.text(productPrice2));
        productListPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(totalPrice));

    }

    @Test
    public void addTwoProductsToBasketFromComparisonTest(){
        homePage.waitForLoad()
                .closePopUp()
                .getSearchFragment().searchProduct(productN);
        productListPage.waitForLoad()
                .closePopUp();
        String productPrice1 = productListPage.readProductPriceFromList(0);
        String productName1 = productListPage.readProductNameFromList(0);
        String productPrice2 = productListPage.readProductPriceFromList(1);
        String productName2 = productListPage.readProductNameFromList(1);
        String totalPrice = productListPage.countTotalPriceInBasket(productPrice1,productPrice2);

        productListPage.clickComparisonButton(1)
                .checkCompareCounter().shouldHave(Condition.text("1"));
        productListPage.clickComparisonButton(2)
                .clickComparisonButton(0);
        comparisonPage.waitForLoad()
                .closePopUp()
                .getListProducts().shouldHaveSize(2);
        comparisonPage.getBasketFragment().addProductsToBasket(0)
                .getCloseBasketButton();
        comparisonPage.getBasketFragment().addProductsToBasket(2)
                .getCloseBasketButton();
        comparisonPage.getBasketFragment().getOpenBasketFromHeader();

        comparisonPage.getBasketFragment().getBasketWidget().shouldBe(Condition.visible);
        comparisonPage.getBasketFragment().getBasketProductList().shouldHaveSize(2);
        comparisonPage.getBasketFragment().getBasketProductList().get(0).shouldHave(Condition.text(productName1));
        comparisonPage.getBasketFragment().getProductPricesInBasket().get(0).shouldHave(Condition.text(productPrice1));
        comparisonPage.getBasketFragment().getBasketProductList().get(1).shouldHave(Condition.text(productName2));
        comparisonPage.getBasketFragment().getProductPricesInBasket().get(1).shouldHave(Condition.text(productPrice2));
        comparisonPage.getBasketFragment().getBasketTotal().shouldHave(Condition.text(totalPrice));

    }
}
