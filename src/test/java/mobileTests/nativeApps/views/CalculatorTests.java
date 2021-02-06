package mobileTests.nativeApps.views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class CalculatorTests {

    private static AppiumDriver appiumDriver;
    private static CalculatorBaseView calculatorBase;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 API 29");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        appiumDriver = new AndroidDriver(serverAddress, capabilities);
        calculatorBase = new CalculatorBaseView(appiumDriver);

        }
        @AfterClass
        public void close(){
            appiumDriver.quit();
        }
        @AfterMethod
        public static void clear(){
        WebElement c = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'clr')]"));
        c.click();
        }

    @Test
    public void sumDoubleNumCalcTest(){
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_2')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_4')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'dec_point')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_6')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'op_add')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_1')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_3')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'dec_point')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'digit_3')]")).click();
        appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'eq')]")).click();
        WebElement result = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'result')]"));

        assertEquals("37.9",result.getText(), "Actual value is: "+ result.getText()+ "did not match with expected value: 37.9");

    }

    @Test
    public void sumIntNumCalcTest(){
        calculatorBase.getDigit7().click();
        calculatorBase.getPlusButton().click();
        calculatorBase.getDigit9().click();
        calculatorBase.getEqualsButton().click();
        assertEquals("16",calculatorBase.getResultField().getText());

    }

    @Test
    public void multiplyIntNumCalcTest(){
        calculatorBase.getDigit2().click();
        calculatorBase.getDigit9().click();
        calculatorBase.getMultiplyButton().click();
        calculatorBase.getDigit1().click();
        calculatorBase.getDigit0().click();
        calculatorBase.getEqualsButton().click();
        assertEquals("290",calculatorBase.getResultField().getText());

    }

    @Test
    public void multiplyDoubleNumCalcTest(){
        calculatorBase.getDigit1().click();
        calculatorBase.getDigit5().click();
        calculatorBase.getDecButton().click();
        calculatorBase.getDigit3().click();
        calculatorBase.getMultiplyButton().click();
        calculatorBase.getDigit2().click();
        calculatorBase.getDigit5().click();
        calculatorBase.getDecButton().click();
        calculatorBase.getDigit5().click();
        calculatorBase.getEqualsButton().click();
        assertEquals("390.15",calculatorBase.getResultField().getText());

    }
}