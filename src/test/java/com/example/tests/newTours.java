package com.example.tests;



import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newTours extends TestBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:/Users/jocooper/Downloads/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLong() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("hi");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector("p > font > a")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("hi");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("confirmPassword")).clear();
        driver.findElement(By.name("confirmPassword")).sendKeys("test");
        driver.findElement(By.name("register")).click();
        driver.findElement(By.linkText("sign-in")).click();
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("hi");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Flights")).click();
        driver.findElement(By.name("findFlights")).click();
        // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
        driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).clear();
        driver.findElement(By.name("passFirst0")).sendKeys("omg");
        driver.findElement(By.name("passLast0")).clear();
        driver.findElement(By.name("passLast0")).sendKeys("lol");
        driver.findElement(By.name("creditnumber")).clear();
        driver.findElement(By.name("creditnumber")).sendKeys("07595429454");
        driver.findElement(By.name("buyFlights")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}