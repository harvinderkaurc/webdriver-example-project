package com.example.tests;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    String baseUrl = "https://www.gov.uk/";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","./dep/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
