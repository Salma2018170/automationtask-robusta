package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverUtils;
import webpages.HomePage;
import webpages.LogInPage;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    WebDriverUtils utils;
    String URL="https://www.saucedemo.com/";
    //Pages
    protected LogInPage loginPage;
    protected HomePage homePage;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(URL);
        utils = new WebDriverUtils(driver, Duration.ofMinutes(2));
        loginPage = new LogInPage(driver,utils);
        homePage=new HomePage(driver,utils);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
