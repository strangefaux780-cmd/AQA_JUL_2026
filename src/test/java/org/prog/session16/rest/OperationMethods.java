package org.prog.session16.rest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OperationMethods{

private WebDriver driver;

    public OperationMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void loadPageAllo(){
        driver.get("https://allo.ua/");
    }
    public void writeRequest(){
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys("iphone 17 pro max");
        search.sendKeys(Keys.ENTER);
    }
    public void OutputcodeProduct(String textContent){
        WebDriverWait waitPage = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement codeProduct = waitPage.until(
                ExpectedConditions.presenceOfElementLocated(By.className("product-sku__value")));
        System.out.println(codeProduct.getAttribute("textContent"));
    }

    public void OutputPriceProdukt (String textContent){
        WebElement priceProduct = driver.findElement(By.className("v-pb__price-row"));
        System.out.println(priceProduct.getAttribute("textContent"));
    }
    public void WindowOperations(){
        driver.manage().window().maximize();
    }
}
