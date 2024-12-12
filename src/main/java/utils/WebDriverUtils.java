package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUtils {
    private WebDriver driver;
    private WebDriverWait wait;

    //time

    public WebDriverUtils(WebDriver driver, Duration time) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, time);
    }


    //Wait till Page load
    public void waitForPageLoad() {
        WebDriverWait pageLoadWait = new WebDriverWait(driver, Duration.ofMinutes(2));
        pageLoadWait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

    }
    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
