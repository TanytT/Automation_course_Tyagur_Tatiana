package mobileTests.guru99;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import mobileTests.guru99.pges.HomePage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SmokeNavigationTests {

    AppiumDriver appiumDriver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 API 29");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AppiumDriver(serverAddress, capabilities);

    }
    @Test
    public void loginAsAuthenticatedUser(){
        HomePage homePage = new HomePage(appiumDriver);
        homePage.navigate();
    }
}
