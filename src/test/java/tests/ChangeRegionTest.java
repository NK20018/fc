package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ChangeRegionTest extends AbstractBaseTest {

    private static final String CITY = "warszawa";

    @Test
    public void ChangeTest() {
        HomePage homePage = new HomePage(driver);

        homePage.clickChangeButton()
                .clickChangeCountry()
                .clickPolandButton()
                .clickChangeRegionPolandRegion()
                .inputChangeCity(CITY)
                .clickWarButton();

        Assert.assertTrue(homePage.warzawaIsDisplayed());
        Assert.assertTrue(homePage.polIsDisplayed());
    }
}

