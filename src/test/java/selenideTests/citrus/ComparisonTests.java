package selenideTests.citrus;

import com.codeborne.selenide.Configuration;
import com.company.homeworks.HW25.citrusSteps.ComparisonPageSteps;
import com.company.homeworks.HW25.citrusSteps.HomePageSteps;
import com.company.homeworks.HW25.citrusSteps.ProductListPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;

public class ComparisonTests {

    HomePageSteps homePageSteps;
    ProductListPageSteps productListPageSteps;
    ComparisonPageSteps comparisonPageSteps;
    private String acer = "Acer";


    @BeforeClass
    public void setup(){
        Configuration.baseUrl = "https://www.citrus.ua";
        Configuration.startMaximized = true;
        open("/");
        homePageSteps = new HomePageSteps();
        productListPageSteps = new ProductListPageSteps();
        comparisonPageSteps = new ComparisonPageSteps();

    }

    @BeforeMethod
    public void cleanBasket(){
        clearBrowserLocalStorage();
        open("/");
    }

    @Test
    public void comparisonTwoPlusOneTest(){
        homePageSteps.clickOnLinkInMenuNotes(acer);
        productListPageSteps.loadPageAndHover();
        String notebookPrice1 = productListPageSteps.readPriceOfProductNote(0);
        String notebookName1 = productListPageSteps.readNameOfProductNote(0);
        String notebookPrice2 = productListPageSteps.readPriceOfProductNote(1);
        String notebookName2 = productListPageSteps.readNameOfProductNote(1);
        productListPageSteps.addTwoLaptopsToComparison();
        comparisonPageSteps.verifyTwoProductsOnComparison(notebookName2,notebookPrice1,notebookName1,notebookPrice2);
        homePageSteps.clickOnLinkInMenuNotes(acer);
        productListPageSteps.loadPageAndHover();
        String notebookPrice3 = productListPageSteps.readPriceOfProductNote(2);;
        String notebookName3 = productListPageSteps.readNameOfProductNote(2);
        productListPageSteps.addProductThreeToComparison();
        comparisonPageSteps.verifyComparisonPage(notebookPrice3,notebookName3);

    }
}
