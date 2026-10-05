package org.prog.session17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class optionsPage {
    private WebDriver driver;

    public optionsPage(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeSuite
    public void beforesuite() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    public void loadPage() {
        driver.get("https://allo.ua/");
    }

    public void maximWindow() {
        driver.manage().window().maximize();
    }

    public void findPhone(String Phones) {
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys(Phones);
        search.sendKeys(Keys.ENTER);
    }

    public String phoneNames(String naMe) {
        WebDriverWait namePhone = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement phoneName = namePhone.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(naMe)));
        System.out.println(phoneName.getAttribute("textContent"));
        return phoneName.getAttribute("textContent");
    }

    public String phoneCod(String coDe) {
        WebElement coDE = driver.findElement(By.xpath(coDe));
        System.out.println(coDE.getAttribute("textContent"));
        return coDE.getAttribute("textContent");
    }

    public String phonePrice(String priCe) {
        WebElement pricePH = driver.findElement(By.xpath(priCe));
        System.out.println(pricePH.getAttribute("textContent"));
        return pricePH.getAttribute("textContent");
    }

}
