package dfe;


import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;

public class dfeTest extends TestBaseQA {
    private String selfURL = "business-rates-property-linking";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

//this no longer contains an blaa
    @Test
    public void QAReg() throws Exception {
        driver.get(baseUrl + selfURL);
        driver.findElement(By.linkText("Register now")).click();
        driver.findElement(By.xpath("//fieldset[@id='businessHasRegisteredGroup']/label[2]")).click();
        driver.findElement(By.id("businessHasRegistered_false")).click();
        driver.findElement(By.xpath("//fieldset[@id='existingGGAccountGroup']/label[2]")).click();
        driver.findElement(By.id("existingGGAccount_false")).click();
        driver.findElement(By.cssSelector("input.button")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.id("fullName")).clear();
        driver.findElement(By.id("fullName")).sendKeys("Joe Bloggs");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("123@123.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("qwertyui5");
        driver.findElement(By.id("passwordConfirm")).clear();
        driver.findElement(By.id("passwordConfirm")).sendKeys("qwertyui5");
        driver.findElement(By.id("submitBtn")).click();
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
