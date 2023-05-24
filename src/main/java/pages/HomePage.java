package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By titleOfPage = By.xpath("//div[text() = 'Swag Labs']");

    public String rightPage(){
        return driver.findElement(titleOfPage).getText();
    }

}
