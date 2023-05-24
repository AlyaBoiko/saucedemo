package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void open (String url){
        driver.get(url);
    }

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");

    public BasePage enterUsername(String user){
        driver.findElement(username).sendKeys(user);
        return this;
    }

    public BasePage enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }

    public void clickOnTheLoginButton(){
        driver.findElement(loginButton).click();
    }

}
