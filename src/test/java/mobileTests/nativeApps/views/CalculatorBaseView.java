package mobileTests.nativeApps.views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorBaseView {
    AppiumDriver appiumDriver;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_7')]")
    private MobileElement digit7;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_9')]")
    private MobileElement digit9;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_5')]")
    private MobileElement digit5;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_3')]")
    private MobileElement digit3;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_1')]")
    private MobileElement digit1;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_2')]")
    private MobileElement digit2;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_0')]")
    private MobileElement digit0;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'dec_point')]")
    private MobileElement decButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'op_add')]")
    private MobileElement plusButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'op_mul')]")
    private MobileElement multiplyButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'eq')]")
    private MobileElement equalsButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'result')]")
    private MobileElement resultField;

    public CalculatorBaseView(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver),this);
    }

    public MobileElement getDigit7() {
        return digit7;
    }

    public MobileElement getDigit9() {
        return digit9;
    }

    public MobileElement getDigit5() {
        return digit5;
    }

    public MobileElement getDigit3() {
        return digit3;
    }

    public MobileElement getDigit1() {
        return digit1;
    }

    public MobileElement getDigit2() {
        return digit2;
    }

    public MobileElement getDigit0() {
        return digit0;
    }

    public MobileElement getDecButton() {
        return decButton;
    }

    public MobileElement getPlusButton() {
        return plusButton;
    }

    public MobileElement getMultiplyButton() {
        return multiplyButton;
    }

    public MobileElement getEqualsButton() {
        return equalsButton;
    }

    public MobileElement getResultField() {
        return resultField;
    }
}
