package mobileTests.guru99.pges;

import io.appium.java_client.AppiumDriver;

public class HomePage {

    AppiumDriver appiumDriver;

    public HomePage(AppiumDriver driver) {
        appiumDriver = driver;
    }

    public void navigate() {
        appiumDriver.get("http://demo.guru99.com/");

    }
}
