package loginTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static common.Config.URL;

public class LoginTests extends BaseTest {

    @Test
    public void loginCorrectTest(){
        basePage.open(URL);
        basePage.enterUsername("standard_user");
        basePage.enterPassword("secret_sauce");
        basePage.clickOnTheLoginButton();
        Assert.assertTrue(homePage.rightPage().contains("Swag Labs"), "login not success");

    }
}
