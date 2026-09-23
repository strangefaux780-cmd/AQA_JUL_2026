package org.prog.session15;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;


public class HomeWork3Test {


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
        driver.manage().window().maximize();
        driver.get("https://allo.ua/");
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys("iphone 17 pro max");
        search.sendKeys(Keys.ENTER);
        WebDriverWait waitPage = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement codeProduct = waitPage.until(
                ExpectedConditions.presenceOfElementLocated(By.className("product-sku__value")));
        System.out.println(codeProduct.getAttribute("textContent"));
        WebElement priceProduct= driver.findElement(By.className("v-pb__price-row"));
        System.out.println(priceProduct.getAttribute("textContent"));

    }

}
