package mobileTests.guru99.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewToursPage {

    private AppiumDriver appiumDriver;

    @FindBy(xpath = "//div[@class='container']")
    private WebElement mainMenu;

    public NewToursPage(AppiumDriver driver) {
        appiumDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver),this);
    }

    public String getTitle() {
        return appiumDriver.getTitle();
    }

    public boolean isMainFragmentPresent() {
        return mainMenu.isDisplayed();
    }
}
