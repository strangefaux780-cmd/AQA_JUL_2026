package org.prog.session16.rest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework4Test {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void testAllo() {
        OperationMethods OPS= new OperationMethods(driver);
        OPS.WindowOperations();
        OPS.loadPageAllo();
        OPS.writeRequest();
        OPS.OutputcodeProduct("code");
        OPS.OutputPriceProdukt("price");


    }
}

