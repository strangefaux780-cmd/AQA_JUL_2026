package org.prog.session14.web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeWorkWebTest {
    private WebDriver driver;
    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000000);
    }
    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
    @Test
    public void testAllo(){
        driver.manage().window().maximize();
        driver.get("https://allo.ua/");
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys("iphone 17 pro max");
        search.sendKeys(Keys.ENTER);
    }
    @Test
    public void Suprise(){
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1");



    }

}
