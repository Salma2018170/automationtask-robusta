package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

public class LogInPage {
    //Driver
    WebDriver driver;
    private WebDriverUtils utils;
    //Locator

    By userNameId=By.id("user-name");
    By passwordId=By.id("password");
    By loginButtonId=By.id("login-button");

    // //div[@class='error-message-container error']
    By errorMessageId=By.cssSelector(".error-message-container");

    public LogInPage(WebDriver driver,WebDriverUtils utils){
        this.driver=driver;
        this.utils=utils;
    }
    public void setEmail(String emailWord){
        driver.findElement(userNameId).sendKeys(emailWord);
    }
    public void setPassword(String passwordWord){
        driver.findElement(passwordId).sendKeys(passwordWord);
    }

    public HomePage clickOnLogin(){

        driver.findElement(loginButtonId).click();
        return new HomePage(driver,utils);
    }

    public String getErrorMessage() {

        return driver.findElement(errorMessageId).getText();
    }
    public void waitForPageLoad() {
        utils.waitForPageLoad();
    }
}
