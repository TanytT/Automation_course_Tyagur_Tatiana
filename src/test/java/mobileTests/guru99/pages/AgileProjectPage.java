package mobileTests.guru99.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileProjectPage {

    private AppiumDriver appiumDriver;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement userNameField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//marquee[@class='heading3']")
    private WebElement messageSuccess;

    public AgileProjectPage(AppiumDriver driver) {
        appiumDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver),this);
    }

    public void userEntersUsernameAndPassword(String userName,String password){
        System.out.println(userNameField);
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password+Keys.ENTER);
    }

    public String getWelcomeMessage() {
        return messageSuccess.getText();
    }

    public String verifyLoginPassword(){
        return appiumDriver.switchTo().alert().getText();
    }
}
