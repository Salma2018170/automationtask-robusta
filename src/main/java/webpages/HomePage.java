package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

public class HomePage {
    //drivers
    WebDriverUtils utils;
    WebDriver driver;

    //locator
    private By inventoryContainerId = By.id("inventory_container");
    public HomePage(WebDriver driver,WebDriverUtils utils){
        this.driver=driver;
        this.utils=utils;
    }

    public boolean isInventoryDisplayed() {
        return utils.waitForElementToBeVisible(inventoryContainerId).isDisplayed();
    }

    public void waitForPageLoad() {
        utils.waitForPageLoad();
    }
}
