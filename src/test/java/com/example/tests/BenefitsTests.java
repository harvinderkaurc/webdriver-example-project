package com.example.tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class BenefitsTests extends TestBase {
   private String benefitsURL = "browse/benefits";

    @Test
    public void benefitsTest(){
        driver.get(baseUrl + benefitsURL);
        driver.findElement(By.linkText("Births, deaths, marriages and care")).click();
        driver.findElement(By.linkText("Business and self-employed")).click();
        driver.findElement(By.linkText("Childcare and parenting")).click();
        driver.findElement(By.linkText("Citizenship and living in the UK")).click();
        driver.findElement(By.linkText("Home")).click();
    }
}
