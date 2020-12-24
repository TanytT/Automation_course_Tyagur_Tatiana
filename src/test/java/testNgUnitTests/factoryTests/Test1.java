package testNgUnitTests.factoryTests;

import Utils.PropertiesReaderClassLoader;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void test1(){
        String baseUrl = PropertiesReaderClassLoader.getInstance().getValueFromProperty("baseUrl");
        String defaultTimeOutValue = PropertiesReaderClassLoader.getInstance().getValueFromProperty("defaultTimeOut");
        System.out.println("baseUrl = "+ baseUrl);
        System.out.println("defaultTimeOutValue = "+ defaultTimeOutValue);
    }
}
