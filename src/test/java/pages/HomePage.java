package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String LOG_IN = "//div[@class=\"header_action_login\"]";

    private static final String REGISTRATION_BUTTON = "//div[@class=\"signin-with signin-with-reg\"]";

    private static final String NAME_FIELD = "//input[@name=\"p_[NikName]\"]";

    private static final String EMAIL_FIELD = "//input[@name=\"p_[EMail]\"]";

    private static final String PASSWORD_FIELD = "//input[@name=\"p_[PW0]\"]";

    private static final String BUTTON_REGESTR = "//button[text()=\"ЗАРЕЄСТРУВАТИСЯ\"]";

    private static final String CONFIRM = "//button[@class=\"ek-form-btn blue\"]";

    private static final String CLOSE_WINDOW = "//button[@class=\"swal2-close\"]";

    private static final String NK = "//a[text()=\"NK\"]";

    private static final String BUTTON_EXIT = "//a[@class=\"help2\"]/*/*";

    public HomePage clickLogIn() {
        waitUntilElementToBeClickable(LOG_IN).click();
        return this;
    }

    public HomePage clickRegestrationButton() {
        waitUntilElementToBeClickable(REGISTRATION_BUTTON).click();
        return this;
    }

    public HomePage inputNameInTheField(String inputName) {
        waitUntilElementToBeClickable(NAME_FIELD).sendKeys(inputName);
        return this;
    }

    public HomePage inputEmailInTheField(String inputEmail) {
        waitUntilElementToBeClickable(EMAIL_FIELD).sendKeys(inputEmail);
        return this;
    }

    public HomePage inputPasswordField(String inputPassword) {
        waitUntilElementToBeClickable(PASSWORD_FIELD).sendKeys(inputPassword);
        return this;
    }

    public HomePage clickButtonRegestr() {
        waitUntilElementToBeClickable(BUTTON_REGESTR).click();
        return this;
    }

    public HomePage clickConfirm() {
        waitUntilElementToBeClickable(CONFIRM).click();
        return this;
    }

    public boolean textIsDisplayed() {
        return waitUntilVisibilityOfElement(NK).isDisplayed();
    }

    public HomePage close() {
        waitUntilElementToBeClickable(CLOSE_WINDOW).click();
        return this;
    }

    public boolean buttonIsDisplayed() {
        return waitUntilVisibilityOfElement(BUTTON_EXIT).isDisplayed();
    }

}
