package factoryTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FirstFactoryTest {

    @Factory(dataProvider = "dp")
    public Object[] getTestCl(String s){
        Object[] tests = new Object[2];
        tests[0] = new Test2(s);
        tests[1] = new Test3(s);
        return tests;
    }

    @DataProvider
    public Object[] dp(){
        return new Object[]{"abc","ABC"} ;
    }
}
