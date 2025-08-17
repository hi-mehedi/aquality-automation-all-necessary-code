package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPage;
import pages.HomePage;

public class ForgotPageTest extends BaseTest{
    public static  final  String email = "mehedihasan@gmail.com";
    HomePage homePage = new HomePage();
    ForgotPage forgotPage = new ForgotPage();

    @Test
    public void  Test(){
        homePage.clickForgotBtn();
        Assert.assertTrue(forgotPage.isForgotPageDisplayed(), "Forgot page is not displayed");
        forgotPage.inputTextField(email);
        forgotPage.clickForgotBtn();
    }
}
