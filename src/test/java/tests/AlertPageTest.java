package tests;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;

import static io.qameta.allure.Allure.step;

public class AlertPageTest extends BaseTest{
    HomePage homePage = new HomePage();
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test
    public void Test(){
        step("Click Alert Link");
        homePage.clickAlertLink();
        step("Check Alert page is open");
        Assert.assertTrue(javaScriptAlertsPage.isJavaScriptAlertPageDisplayed(),"Java Script Alert Page is not displayed");
        step("Click Alert Button");
        javaScriptAlertsPage.clickAlertBtn();
        step("Alert accept and sent text");
        AqualityServices.getBrowser().handlePromptAlert(AlertActions.ACCEPT, "Mehedi");
        step("Refresh page");
        AqualityServices.getBrowser().getDriver().navigate().refresh();
        step("Click second alert link");
        Assert.assertTrue(javaScriptAlertsPage.isSecondAlertBtnEnabled(), "Second Button is not Enabled");
        step("Click second alert Button");
        javaScriptAlertsPage.clickSecondAlert();
        step("Accept Alert");
        AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
        step("Again Click second Alert Button");
        javaScriptAlertsPage.clickSecondAlert();
        step("Click Alert Dismiss");
        AqualityServices.getBrowser().handleAlert(AlertActions.DECLINE);
    }
}
