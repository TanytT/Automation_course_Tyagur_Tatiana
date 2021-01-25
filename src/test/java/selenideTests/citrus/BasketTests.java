package selenideTests.citrus;

import com.codeborne.selenide.Configuration;
import com.company.homeworks.HW25.citrusSteps.ComparisonPageSteps;
import com.company.homeworks.HW25.citrusSteps.HomePageSteps;
import com.company.homeworks.HW25.citrusSteps.ProdPageSteps;
import com.company.homeworks.HW25.citrusSteps.ProductListPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;
public class BasketTests {

    HomePageSteps homePageSteps;
    ProdPageSteps productPageSteps;
    ProductListPageSteps productListPageSteps;
    ComparisonPageSteps comparisonPageSteps;

    String productName = "Apple iPhone 12 128GB";
    String productN = "Apple iPhone";
    String nameApple = "Apple";
    String smartf = "Смартфоны";


    @BeforeClass
    public void setup(){
        Configuration.baseUrl = "https://www.citrus.ua";
        Configuration.startMaximized = true;
        open("/");
        homePageSteps = new HomePageSteps();
        productListPageSteps = new ProductListPageSteps();
        productPageSteps = new ProdPageSteps();
        comparisonPageSteps = new ComparisonPageSteps();

    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void addToBasketUsingProductPageTest(){

        homePageSteps.clickOnLinkInMenu(2, nameApple);
        productListPageSteps.clickOnProduct(productName);
        String productPrice = productPageSteps.addProductToTheBasket();
        productPageSteps.verifyBasketContent(productName,productPrice);

    }

    @Test
    public void addToBasketUsingSearchTest(){

        homePageSteps.searchProductByNameInSearchLine(productName);
        productListPageSteps.pageProductListLoad();
        String productPrice = productListPageSteps.addProductToBasket(productName);
        productListPageSteps.verifyBasketContent(productName,productPrice);

    }

    @Test
    public void addTwoProductsToBasketTest(){

        homePageSteps.searchProductByNameInSearchLine(productN);
        productListPageSteps.pageProductListLoad();
        String productPrice1 = productListPageSteps.readProductPrice(0);
        String productPrice2 = productListPageSteps.readProductPrice(1);
        String productName1 = productListPageSteps.readProductName(0);
        String productName2 = productListPageSteps.readProductName(1);
        String totalPrice = productListPageSteps.countTotalPrice(productPrice1,productPrice2);
        productListPageSteps.addProductsToBasket();
        productListPageSteps.verifyTwoProductsInBasket(productName1,productPrice1,productName2,productPrice2,totalPrice);

    }

    @Test
    public void addTwoProductsToBasketFromComparisonTest(){

        homePageSteps.searchProductByNameInSearchLine(productN);
        productListPageSteps.pageProductListLoad();
        String productPrice1 = productListPageSteps.readProductPrice(0);
        String productPrice2 = productListPageSteps.readProductPrice(1);
        String productName1 = productListPageSteps.readProductName(0);
        String productName2 = productListPageSteps.readProductName(1);
        String totalPrice = productListPageSteps.countTotalPrice(productPrice1,productPrice2);
        productListPageSteps.clickOnComparison();
        comparisonPageSteps.checkCountOfProductsOnComparisonPage();
        comparisonPageSteps.addProductsToBasket();
        comparisonPageSteps.verifyProductsOnComparison(productName1, productPrice1,productName2,productPrice2,totalPrice);

    }
}
