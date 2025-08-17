package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddPage;
import pages.HomePage;

public class AddPageTest extends BaseTest{
    HomePage homePage = new HomePage();
    AddPage addPage = new AddPage();

    @Test
    public void TestAdd(){
        homePage.clickaddandRemovelink();
        Assert.assertTrue(addPage.isAddPageDisplayed(), "Add Page is not displayed");
        addPage.clickElementBtn();
        addPage.clickDeleteElement();
    }
}
