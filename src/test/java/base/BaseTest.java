package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.BasePage;
import pages.HomePage;

import static common.Config.BROWSER_HOLD;
import static common.Config.COOKIES_AND_STORAGE;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);

    @AfterTest
    public void ClearAllCookiesAndLocalStorage(){
        if(COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    public void close(){
        if(BROWSER_HOLD)
        {
            driver.quit();
        }
    }


}
