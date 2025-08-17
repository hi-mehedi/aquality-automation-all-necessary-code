package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.IFramePage;

public class IFramePageTest extends BaseTest{
    public static final String text = "Your content goes here.";
    HomePage homePage = new HomePage();
    IFramePage iFramePage = new IFramePage();

    @Test
    public void Test(){
        homePage.clickIframeLink();
        Assert.assertTrue(iFramePage.isIframePageDisplayed(), "Page is not displayed");
        iFramePage.clickFrameLink();
        iFramePage.switchIframes();
        iFramePage.getText();
        Assert.assertEquals(iFramePage.getText(),text , "Text is not Same");
    }
}
