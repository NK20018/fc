package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegistrationTest extends AbstractBaseTest {

    private static final String NAME = "NK";
    private static final String EMAIL = "TES2T12332221@gmail.com";

    private static final String PASSWORD = "123321";

    @Test
    public void Registration() {
        HomePage homePage = new HomePage(driver);

        homePage.clickLogIn()
                .clickRegestrationButton()
                .inputNameInTheField(NAME)
                .inputEmailInTheField(EMAIL)
                .inputPasswordField(PASSWORD)
                .clickButtonRegestr()
                .clickConfirm();

        Assert.assertTrue(homePage.textIsDisplayed());
        Assert.assertTrue(homePage.buttonIsDisplayed());
    }
}
