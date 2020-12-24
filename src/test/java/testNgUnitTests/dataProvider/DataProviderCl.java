package testNgUnitTests.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderCl {
    @DataProvider
    public Object[][] tempCtoKdata(){
        return new Object[][]{
                {28.5, 301.66},
                {0, 273.16},
                {-43.3,229.86}
        };
    }

    @DataProvider
    public Object[][] tempKtoCdata(){
        return new Object[][]{
                {301.66, 28.5},
                {273.16, 0},
                {-43.3, -316.46000000000004}
        };
    }
}
