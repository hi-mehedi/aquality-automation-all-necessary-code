package tests;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;

public class AlertPageTest extends BaseTest{
    HomePage homePage = new HomePage();
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test
    public void Test(){
        homePage.clickAlertLink();
        Assert.assertTrue(javaScriptAlertsPage.isJavaScriptAlertPageDisplayed(),"Java Script Alert Page is not displayed");
        javaScriptAlertsPage.clickAlertBtn();
        AqualityServices.getBrowser().handlePromptAlert(AlertActions.ACCEPT, "Mehedi");
        AqualityServices.getBrowser().getDriver().navigate().refresh();
        Assert.assertTrue(javaScriptAlertsPage.isSecondAlertBtnEnabled(), "Second Button is not Enabled");
        javaScriptAlertsPage.clickSecondAlert();
        AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
        javaScriptAlertsPage.clickSecondAlert();
        AqualityServices.getBrowser().handleAlert(AlertActions.DECLINE);
    }
}
