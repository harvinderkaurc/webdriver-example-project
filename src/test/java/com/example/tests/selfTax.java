package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selfTax extends TestBase {
    private String selfURL = "/check-if-you-need-a-tax-return";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Test
    public void testVOA () throws Exception {
        driver.get(baseUrl + selfURL);
        driver.findElement(By.linkText("Start now")).click();
        driver.findElement(By.xpath("//main[@id='content']/div/div/form/div/ul/li[2]/label")).click();
        driver.findElement(By.id("response_self-employed-sole-trader-even-if-just-for-part-of-the-year")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li[3]/label")).click();
        driver.findElement(By.id("response_no")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li[2]/label")).click();
        driver.findElement(By.id("response_no")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li/label")).click();
        driver.findElement(By.id("response_no-neither-of-us-claimed-child-benefit")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li/label")).click();
        driver.findElement(By.id("response_no")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li/label")).click();
        driver.findElement(By.id("response_yes")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul/li[6]/label")).click();
        driver.findElement(By.id("response_none-of-these")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/form/div/ul[2]/li[2]/label")).click();
        driver.findElement(By.id("response_no")).click();
        driver.findElement(By.cssSelector("button.medium.button")).click();
        Thread.sleep(10000);
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
