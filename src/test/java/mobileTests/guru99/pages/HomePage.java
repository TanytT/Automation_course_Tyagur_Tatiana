package mobileTests.guru99.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private AppiumDriver appiumDriver;

    @FindBy(xpath = "//a[text()='New Tours']")
    private WebElement newToursButton;
    @FindBy(xpath = "//form[@name='frmLogin']")
    private WebElement loginForm;
    @FindBy(xpath = "//a[text()='Table Demo']")
    private WebElement tableDemoLink;
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement seleniumDropdownButton;
    @FindBy(xpath = "//a[text()='Agile Project']")
    private WebElement agileProjectButton;

    public HomePage(AppiumDriver driver) {
        appiumDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver),this);
    }

    public void navigate() {
        appiumDriver.get("http://demo.guru99.com/");
    }

    public String getTitle() {
        return appiumDriver.getTitle();
    }

    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }

    public void clickOnNewToursButton() {
        newToursButton.click();
    }

    public void clickOnTableDemoMenu() {
        seleniumDropdownButton.click();
        tableDemoLink.click();
    }

    public void clickOnAgileProjectButton() {
        agileProjectButton.click();
    }
}
