package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{
    HomePage homePage = new HomePage();

    @Test
    public void Test(){
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page is not displayed");
        homePage.clickaddandRemovelink();
    }
}
