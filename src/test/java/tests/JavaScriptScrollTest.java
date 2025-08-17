package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptScrollPage;

public class JavaScriptScrollTest extends BaseTest{
    HomePage homePage = new HomePage();
    JavaScriptScrollPage javaScriptScrollPage = new JavaScriptScrollPage();

    @Test
    public void Test() throws InterruptedException {
        homePage.clickScrollLink();
        javaScriptScrollPage.getResult(0);
        javaScriptScrollPage.getResultByIndex(7);
    }
}
