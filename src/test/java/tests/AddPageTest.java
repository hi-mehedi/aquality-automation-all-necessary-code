package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddPage;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class AddPageTest extends BaseTest{
    HomePage homePage = new HomePage();
    AddPage addPage = new AddPage();

    @Test
    @Step("Test Add Page")
    public void TestAdd(){
        step("Click add and remove Link");
        homePage.clickaddandRemovelink();
        step("Check add and remove page displayed");
        Assert.assertTrue(addPage.isAddPageDisplayed(), "Add Page is not displayed");
        step("Click element Button");
        addPage.clickElementBtn();
        step("Click Delete Button");
        addPage.clickDeleteElement();
    }
}
