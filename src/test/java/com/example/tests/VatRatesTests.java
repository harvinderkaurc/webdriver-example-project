package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VatRatesTests extends TestBase {
    private String vatURL = "vat-rates";

    @Test
    public void vatRatesTest() throws Exception {
        driver.get(baseUrl + vatURL);
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("Disabled people")).click();
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("Births, deaths, marriages and care")).click();
        driver.findElement(By.linkText("Home")).click();
    }
}