package journeyOne;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.*;


import org.junit.*;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class one {
    WebDriver driver;
    private String baseUrl = "https://www-qa.tax.service.gov.uk/";
    private String selfURL = "business-rates-property-linking";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./dep/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }




    public static void main(String args[]) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        Result result = junit.run(dfe.dfeTest.class);
        if (result.getFailureCount() > 0) {
            System.out.println("Test failed.");
            System.exit(1);
        } else {
            System.out.println("Test finished successfully.");
            System.exit(0);
        }
    }


    @Test
    public void QAReg() throws Exception {
        driver.get(baseUrl + selfURL);
        driver.findElement(By.linkText("sign in")).click();
        driver.findElement(By.id("userId")).clear();
        driver.findElement(By.id("userId")).sendKeys("391353112736");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("test12345");
        driver.findElement(By.id("signin")).click();
        driver.findElement(By.id("addAnotherProperty")).click();
        driver.findElement(By.id("search-query1")).clear();
        driver.findElement(By.id("search-query1")).sendKeys("tq12bg");
        driver.findElement(By.id("submitsearch1")).click();
        Thread.sleep(10000);
    }

//    @After
//    public void tearDown() throws Exception {
//        driver.quit();
//    }



}