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

    private static final String REGION_BUTTON = "//div[@class=\"header_action_change-city\"]";

    private static final String CHANGE_COUNTRY = "//div[@class=\"lf-text\"]";

    private static final String POLAND_BUTTON = "//a[@class=\"option\"]//span[@class=\"flag-pl ib\"]";

    private static final String CHANGE_COUNTRY_POLAND_REGION = "//div[@class=\"header_action_change-city\"]";

    private static final String INPUT_CHANGE_CITY = "//input[@class=\"ek-form-control rs-inp\"]";

    private static final String WARSZAWA_BUTTON = "//td[@class=\"city\"]";

    private static final String WARSZAWA_TEXT = "//div[@class=\"ib h\"]/em[@id=\"hikg93bgcnx\"]";

    private static final String POL_TEXT = "//a[text()=\"Pol\"]";

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

    public HomePage clickChangeButton() {
        waitUntilElementToBeClickable(REGION_BUTTON).click();
        return this;
    }

    public HomePage clickChangeCountry() {
        waitUntilElementToBeClickable(CHANGE_COUNTRY).click();
        return this;
    }

    public HomePage clickPolandButton() {
        waitUntilElementToBeClickable(POLAND_BUTTON).click();
        return this;
    }

    public HomePage clickChangeRegionPolandRegion() {
        waitUntilElementToBeClickable(CHANGE_COUNTRY_POLAND_REGION).click();
        return this;
    }

    public HomePage inputChangeCity(String inputCity) {
        waitUntilElementToBeClickable(INPUT_CHANGE_CITY).sendKeys(inputCity);
        return this;
    }

    public HomePage clickWarButton() {
        waitUntilElementToBeClickable(WARSZAWA_BUTTON).click();
        return this;
    }

    public boolean warzawaIsDisplayed(){
        return waitUntilVisibilityOfElement(WARSZAWA_BUTTON).isDisplayed();
    }

    public boolean polIsDisplayed(){
        return waitUntilVisibilityOfElement(POL_TEXT).isDisplayed();
    }


}
